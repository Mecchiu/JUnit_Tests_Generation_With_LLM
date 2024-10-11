package s2e.lab.generators;

import com.github.javaparser.ParseProblemException;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import org.apache.commons.io.FileUtils;
import s2e.lab.PromptUtils;
import s2e.lab.searcher.JavaSearcher;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

import static java.lang.String.format;
import static s2e.lab.PromptUtils.computeUnitTestPrompt;
import static s2e.lab.PromptUtils.save;

public class JavaOpenAIPromptGenerator {
    public static String NUMBER_OF_TESTS = "ten";
    public static String BASE_DIR = "../../";
    public static String HSLCOLOR_JAVA = BASE_DIR + "HSLColorSourceCode/";
    public static String HSLCOLOR_SCENARIO = HSLCOLOR_JAVA + "original/";
    public static String HSLCOLOR_PROMPT_OUTPUT_FILE = BASE_DIR + "LLM_Test/HSLColorPrompt/original_prompt.json";

    public static void main(String[] args) throws IOException {
        File hslColorPrompt = new File(HSLCOLOR_PROMPT_OUTPUT_FILE).getParentFile();
        hslColorPrompt.mkdirs();
        FileUtils.cleanDirectory(hslColorPrompt);
        generateHSLColorPrompt();
    }
    
    private static void generateHSLColorPrompt() throws IOException {
        File scenarioDir = new File(HSLCOLOR_SCENARIO);
        assert scenarioDir.exists();
        
        List<File> javaFiles = JavaSearcher.findJavaFiles(scenarioDir);
        List<HashMap<String, String>> outputList = new ArrayList<>();
        for (File javaFile : javaFiles) {
            outputList.addAll(generateTestPrompt(javaFile, null, false));
        }
        
        if (!outputList.isEmpty()) {
            save(outputList, HSLCOLOR_PROMPT_OUTPUT_FILE);
        }
    }

    private static List<HashMap<String, String>> generateTestPrompt(File javaFile, Predicate<MethodDeclaration> predicate, boolean publicOnly) {
        List<HashMap<String, String>> outputList = new ArrayList<>();
        try {
            CompilationUnit cu = StaticJavaParser.parse(javaFile);

            ClassOrInterfaceDeclaration classDeclaration = PromptUtils.getPrimaryClass(cu);
            if (classDeclaration == null)
                return outputList;

            List<MethodDeclaration> allMethods = PromptUtils.getAllPublicMethods(classDeclaration);
            for (int i = 0; i < allMethods.size(); i++) {
                MethodDeclaration methodDeclaration = allMethods.get(i);
                String methodSignature = methodDeclaration.getSignature().toString();
                String suffix = allMethods.size() == 1 ? "" : String.valueOf(i);

                HashMap<String, String> outputMap = computeUnitTestPrompt(javaFile, NUMBER_OF_TESTS, cu, classDeclaration.getNameAsString(), methodSignature, suffix);
                outputList.add(outputMap);
            }
        } catch (ParseProblemException e) {
            // Gestione errori di parsing rimossa
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return outputList;
    }
}