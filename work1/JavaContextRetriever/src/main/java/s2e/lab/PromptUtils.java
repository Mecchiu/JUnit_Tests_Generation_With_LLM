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
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.String.format;
import static s2e.lab.generators.JavaOpenAIPromptGenerator.BASE_DIR;

/**
 * Utilities for the test prompt creation.
 *
 * @author 
 */
public class PromptUtils {
    /**
     * The template for the unit test prompt (template is in the resources' folder).
     */
    public static String UNIT_TEST_TEMPLATE;

    /**
     * Used for generating Unit Tests for the HumanEval dataset (RQ1).
     */
    public static String HUMAN_EVAL_TEST_TEMPLATE;

    static {
        try {
            URL templateUrl = JavaOpenAIPromptGenerator.class.getClassLoader().getResource("JUnitTestTemplate.java");
            UNIT_TEST_TEMPLATE = Files.readString(Paths.get(templateUrl.getPath()));
            URL humanEvalUrl = JavaOpenAIPromptGenerator.class.getClassLoader().getResource("HumanEvalTestTemplate.java");
            HUMAN_EVAL_TEST_TEMPLATE = Files.readString(Paths.get(humanEvalUrl.getPath()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Saves the prompts to a JSON file.
     *
     * @param outputList the list of prompts (containing ID, original code, and test prompt)
     * @param outputFile where to save the prompts (path)
     * @throws IOException in case of an IO error
     */
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


    /**
     * ID is equals to the relative path to the file under analysis appended with a suffix (if not empty).
     * Ex: suffix = 001 and javaFile = /path/to/HumanEvalJava/src/main/scenario1/id_1.java
     * ID = /HumanEvalJava/src/main/scenario1/id_1_001Test.java
     *
     * @param javaFile java file under analysis
     * @param suffix   suffix to be appended to the ID
     * @return a unique identifier for the prompt being generated
     */
    private static String computeID(File javaFile, String suffix) {
        String filename = javaFile.getName();
        // if a suffix is provided, then append
        if (suffix != null && !suffix.isEmpty())
            filename = format("%s_%sTest.java", FilenameUtils.removeExtension(filename), suffix);

        // get relative path
        String parentPath = javaFile.getParentFile().getAbsolutePath().replace(new File(BASE_DIR).getAbsolutePath(), "");

        // concatenate with the computed filename
        return FilenameUtils.concat(parentPath, filename);
    }

    /**
     * This method is used to fill in the template with the actual values.
     *
     * @param javaFile        the java file under analysis
     * @param cu              compilation unit
     * @param numberTests     the number of tests to generate
     * @param className       the name of the class under test
     * @param methodSignature the signature of the method under test
     * @param suffix          to distinguish between different test classes
     * @return a dictionary containing the ID, the original code, and the test prompt.
     */
    public static HashMap<String, String> computeUnitTestPrompt(File javaFile, String numberTests, CompilationUnit cu, String className, String methodSignature, String suffix) {
        // get package declaration or set to empty string if in the default package
        String packageDeclaration = "";
        if (cu.getPackageDeclaration().isPresent())
            packageDeclaration = cu.getPackageDeclaration().get().toString().strip();


        // fill in the template
        Map<String, Object> params = new HashMap<>();
        params.put("className", className);
        params.put("packageDeclaration", packageDeclaration);
        params.put("importedPackages", getImportedPackages(cu));
        params.put("numberTests", numberTests);
        params.put("methodSignature", methodSignature);
        params.put("suffix", suffix.isEmpty() ? suffix : "_" + suffix);

        // creates dict object to be serialized
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

    /**
     * Given a compilation unit, it returns the import statements (ie: `package ... ;`, separated by newline).
     *
     * @param cu compilation unit
     * @return the import statements
     */
    public static String getImportedPackages(CompilationUnit cu) {
        return cu.getImports().stream()
                .map(i -> i.toString().strip())
                .collect(Collectors.joining("\n"));
    }

    /**
     * Get the primary class of the compilation unit.
     * Algorithm:
     * - the class that matches the filename (ex: StringBuilder in a file named StringBuilder.java)
     * - the first declared class in the file
     *
     * @param cu Compilation unit
     * @return the primary class of the compilation unit
     */
    public static ClassOrInterfaceDeclaration getPrimaryClass(CompilationUnit cu) {
        Optional<TypeDeclaration<?>> primaryType = cu.getPrimaryType();
        if (primaryType.isPresent()) {
            TypeDeclaration<?> typeDeclaration = primaryType.get();
            // checks whether it is a class/interface being declared (and not something else, like an enumeration)
            if (typeDeclaration instanceof ClassOrInterfaceDeclaration)
                return ((ClassOrInterfaceDeclaration) typeDeclaration);
            // enums, annotations, records are disregarded
            if (typeDeclaration instanceof AnnotationDeclaration || typeDeclaration instanceof EnumDeclaration || typeDeclaration instanceof RecordDeclaration)
                return null;
        }
        // finds the first declared class/interface, returns null if none is found
        return cu.getTypes().stream()
                .filter(BodyDeclaration::isClassOrInterfaceDeclaration)
                .map(BodyDeclaration::asClassOrInterfaceDeclaration)
                .findFirst().orElse(null);
    }

    /**
     * Returns the signatures of the testable methods (public, non-void, non-abstract).
     *
     * @param classDeclaration where to look for the methods.
     * @param publicOnly       if true, only testable methods from *public* classes are returned
     * @return testable methods ( a list of {@link MethodDeclaration}
     */
    public static List<MethodDeclaration> getTestableMethods(ClassOrInterfaceDeclaration classDeclaration, boolean publicOnly) {
        // class is not testable, so don't even bother retrieving its declared methods
        if (!isTestable(classDeclaration) || (publicOnly && !classDeclaration.isPublic()))
            return Collections.emptyList();
        // finds all methods that are testable in the class under test
        return classDeclaration.getMethods().stream()
                .filter(PromptUtils::isTestable)
                .collect(Collectors.toList());
    }

    /**
     * Method to check if a method is testable:
     * - public
     * - non-abstract
     * - non-void
     * - non-getter/setter
     * - non-toString
     * - non-hashCode
     * - non-equals
     *
     * @param m a method declaration
     * @return true if testable, false otherwise.
     */
    private static boolean isTestable(MethodDeclaration m) {
        // has to be public
        if (!m.isPublic())
            return false;
        // has to be concrete (non-abstract)
        if (m.isAbstract())
            return false;
        // has to return a value (non-void)
        if (m.getType().asString().equalsIgnoreCase("void"))
            return false;

        // cannot be a getter method
        // heuristic #1: starts with "get", takes no parameters, and is non-static; OR
        if (!m.isStatic() && m.getNameAsString().startsWith("get") && m.getParameters().size() == 0)
            return false;
        // heuristic #2: starts with "is", takes no parameters; is non-static, and returns a boolean
        if (!m.isStatic() && m.getNameAsString().startsWith("is") && m.getParameters().size() == 0 && m.getType().asString().equalsIgnoreCase("boolean"))
            return false;

        // cannot be a setter method
        if (!m.isStatic() && m.getNameAsString().startsWith("set"))
            return false;

        // methods from java.lang.Object are not testable
        switch (m.getSignature().toString()) {
            case "toString()": // non-toString
            case "hashCode()": // non-hashCode
            case "equals(Object)": // non-equals
            case "clone()": //
            case "finalize()": //
            case "notify()": //
            case "wait()": //
            case "wait(long)": //
            case "wait(long,int)": //
                return false;
        }
        // if we reach here, the method is testable
        return true;
    }

    public static boolean hasGoodJavadoc(MethodDeclaration m) {
        // method does not have a javadoc
        if (!m.getJavadoc().isPresent())
            return false;
        Javadoc javadoc = m.getJavadoc().get();


        // true if javadoc's description is non-empty
        boolean hasDescription = javadoc.getDescription() != null && !javadoc.getDescription().toText().trim().isEmpty();
        // true if javadoc has a non-empty @return tag
        boolean hasReturn = false;
        // current index of the parameter being documented; number of documented parameters
        int numDocumentedParams = 0;


        for (JavadocBlockTag tag : javadoc.getBlockTags()) {
            if (tag.getTagName().equals("param")) {
                String paramName = tag.getName().isPresent() ? tag.getName().get() : "";
                String paramDescription = tag.getContent().toText().trim();
                for (Parameter parameter : m.getParameters()) {
                    // do case-insensitive parameter name matching, and check description is non-empty
                    if (parameter.getNameAsString().equalsIgnoreCase(paramName) && !paramDescription.isEmpty()) {
                        numDocumentedParams++;
                        break;
                    }
                }
            } else if (tag.getTagName().equals("return") || tag.getTagName().equals("returns")) {
                // returns is a typo for return
                hasReturn = !tag.getContent().toText().trim().isEmpty();
            }
        }
        // true if all parameters are documented with an @param annotation
        boolean hasAllParamsDocumented = numDocumentedParams == m.getParameters().size();


        return (hasDescription || hasReturn) && hasAllParamsDocumented;
    }

    /**
     * Method to check if a class is testable:
     * - non-abstract
     * - non-interface
     *
     * @param c a class/interface declaration
     * @return true if testable, false otherwise.
     */
    private static boolean isTestable(ClassOrInterfaceDeclaration c) {
        return !c.isInterface() && !c.isAbstract() && !c.getNameAsString().endsWith("Test");
    }
}
