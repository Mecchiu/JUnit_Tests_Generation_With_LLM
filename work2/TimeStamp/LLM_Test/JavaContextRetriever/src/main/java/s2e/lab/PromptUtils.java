package s2e.lab;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.*;
import com.github.javaparser.javadoc.Javadoc;
import com.github.javaparser.javadoc.JavadocBlockTag;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.text.StringSubstitutor;
import s2e.lab.generators.JavaOpenAIPromptGenerator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.String.format;
import static s2e.lab.generators.JavaOpenAIPromptGenerator.BASE_DIR;

public class PromptUtils {
    public static String UNIT_TEST_TEMPLATE;
    public static String HUMAN_EVAL_TEST_TEMPLATE;

    static {
        try {
            URL templateUrl = JavaOpenAIPromptGenerator.class.getClassLoader().getResource("JUnitTestTemplate.java");
            UNIT_TEST_TEMPLATE = Files.readString(Paths.get(templateUrl.toURI()));
            URL humanEvalUrl = JavaOpenAIPromptGenerator.class.getClassLoader().getResource("HumanEvalTestTemplate.java");
            HUMAN_EVAL_TEST_TEMPLATE = Files.readString(Paths.get(humanEvalUrl.toURI()));
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public static void save(List<HashMap<String, String>> outputList, String outputFile) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter file = new FileWriter(outputFile)) {
            gson.toJson(outputList, file);
        }
        System.out.println("Successfully saved JSON to " + outputFile);

        String csvFilePath = outputFile.replace(".json", ".csv");
        FileWriter csvWriter = new FileWriter(csvFilePath);
        String[] headers = {"id", "method_signature", "classname", "package", "suffix"};
        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                .setHeader(headers)
                .build();

        try (final CSVPrinter printer = new CSVPrinter(csvWriter, csvFormat)) {
            for (HashMap<String, String> prompt : outputList) {
                printer.printRecord(prompt.get("id"), prompt.get("method_signature"), prompt.get("classname"), prompt.get("package"), prompt.get("suffix"));
            }
        }
        System.out.println("Successfully saved CSV to " + csvFilePath);
    }

    private static String computeID(File javaFile, String suffix) {
        String filename = javaFile.getName();
        if (suffix != null && !suffix.isEmpty())
            filename = format("%s_%sTest.java", FilenameUtils.removeExtension(filename), suffix);

        String parentPath = javaFile.getParentFile().getAbsolutePath().replace(new File(BASE_DIR).getAbsolutePath(), "");

        return FilenameUtils.concat(parentPath, filename);
    }

    public static HashMap<String, String> computeUnitTestPrompt(File javaFile, String numberTests, CompilationUnit cu, String className, String methodSignature, String suffix) {
        String packageDeclaration = "";
        if (cu.getPackageDeclaration().isPresent())
            packageDeclaration = cu.getPackageDeclaration().get().toString().strip();

        Map<String, Object> params = new HashMap<>();
        params.put("className", className);
        params.put("packageDeclaration", packageDeclaration);
        params.put("importedPackages", getImportedPackages(cu));
        params.put("numberTests", numberTests);
        params.put("methodSignature", methodSignature);
        params.put("suffix", suffix.isEmpty() ? suffix : "_" + suffix);

        HashMap<String, String> promptMetadata = new HashMap<>();
        promptMetadata.put("id", computeID(javaFile, suffix));
        promptMetadata.put("original_code", format("// %s.java\n%s", className, cu));
        promptMetadata.put("test_prompt", StringSubstitutor.replace(UNIT_TEST_TEMPLATE, params));
        promptMetadata.put("method_signature", methodSignature);
        promptMetadata.put("classname", className);
        promptMetadata.put("package", cu.getPackageDeclaration().isPresent() ? cu.getPackageDeclaration().get().getNameAsString(): "");
        promptMetadata.put("suffix", suffix);
        promptMetadata.put("numberTests", numberTests);

        return promptMetadata;
    }

    public static String getImportedPackages(CompilationUnit cu) {
        return cu.getImports().stream()
                .map(i -> i.toString().strip())
                .collect(Collectors.joining("\n"));
    }

    public static ClassOrInterfaceDeclaration getPrimaryClass(CompilationUnit cu) {
        Optional<TypeDeclaration<?>> primaryType = cu.getPrimaryType();
        if (primaryType.isPresent()) {
            TypeDeclaration<?> typeDeclaration = primaryType.get();
            if (typeDeclaration instanceof ClassOrInterfaceDeclaration)
                return ((ClassOrInterfaceDeclaration) typeDeclaration);
            if (typeDeclaration instanceof AnnotationDeclaration || typeDeclaration instanceof EnumDeclaration || typeDeclaration instanceof RecordDeclaration)
                return null;
        }
        return cu.getTypes().stream()
                .filter(BodyDeclaration::isClassOrInterfaceDeclaration)
                .map(BodyDeclaration::asClassOrInterfaceDeclaration)
                .findFirst().orElse(null);
    }

    public static List<MethodDeclaration> getAllPublicMethods(ClassOrInterfaceDeclaration classDeclaration) {
        return classDeclaration.getMethods().stream()
                .filter(method -> method.isPublic())
                .collect(Collectors.toList());
    }

    public static boolean hasGoodJavadoc(MethodDeclaration m) {
        if (!m.getJavadoc().isPresent())
            return false;
        Javadoc javadoc = m.getJavadoc().get();

        boolean hasDescription = javadoc.getDescription() != null && !javadoc.getDescription().toText().trim().isEmpty();
        boolean hasReturn = false;
        int numDocumentedParams = 0;

        for (JavadocBlockTag tag : javadoc.getBlockTags()) {
            if (tag.getTagName().equals("param")) {
                String paramName = tag.getName().isPresent() ? tag.getName().get() : "";
                String paramDescription = tag.getContent().toText().trim();
                for (Parameter parameter : m.getParameters()) {
                    if (parameter.getNameAsString().equalsIgnoreCase(paramName) && !paramDescription.isEmpty()) {
                        numDocumentedParams++;
                        break;
                    }
                }
            } else if (tag.getTagName().equals("return") || tag.getTagName().equals("returns")) {
                hasReturn = !tag.getContent().toText().trim().isEmpty();
            }
        }
        boolean hasAllParamsDocumented = numDocumentedParams == m.getParameters().size();

        return (hasDescription || hasReturn) && hasAllParamsDocumented;
    }

    public static boolean isTestable(ClassOrInterfaceDeclaration c) {
        return !c.getNameAsString().endsWith("Test");
    }
}