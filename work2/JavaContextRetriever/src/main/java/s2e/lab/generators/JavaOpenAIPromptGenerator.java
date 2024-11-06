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
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.function.Predicate;

import static s2e.lab.PromptUtils.computeUnitTestPrompt;
import static s2e.lab.PromptUtils.save;

public class JavaOpenAIPromptGenerator {

	public static void main(String[] args) {
	    Properties properties = new Properties();
	    try (FileInputStream input = new FileInputStream("config.properties")) {
	        properties.load(input);
	    } catch (IOException e) {
	        System.err.println("Errore nel caricamento del file config.properties: " + e.getMessage());
	        return;
	    }

	    String baseDir = properties.getProperty("baseDir");
	    String sourceCodeDir = properties.getProperty("sourceCodeDir");
	    String outputDirPath = properties.getProperty("outputDir");
	    String numberOfTests = properties.getProperty("numberOfTests");
	    String[] scenarios = properties.getProperty("scenarios").split(",");

	    if (baseDir == null || sourceCodeDir == null || outputDirPath == null || numberOfTests == null || scenarios.length == 0) {
	        System.err.println("Errore: una o più proprietà nel file di configurazione non sono state trovate.");
	        return;
	    }

	    for (String scenario : scenarios) {
	        String scenarioDirPath = baseDir + sourceCodeDir + scenario.trim() + "/";
	        File scenarioDir = new File(scenarioDirPath);
	        String outputFilePath = baseDir + outputDirPath + scenario.trim() + "_prompt.json";

	        try {
	            File outputFile = new File(outputFilePath);
	            File outputDir = outputFile.getParentFile(); // Ottiene la directory di output

	            if (!outputDir.exists()) {
	                outputDir.mkdirs(); // Crea le directory di output, se non esistono
	            }
	            
	            generatePrompt(scenarioDir, outputFilePath, numberOfTests);
	            System.out.println("Prompt generato per lo scenario: " + scenario);
	        } catch (IOException e) {
	            System.err.println("Errore durante la generazione del prompt per lo scenario " + scenario + ": " + e.getMessage());
	        }
	    }
	}



	public static void generatePrompt(File scenarioDir, String outputFile, String numberOfTests) throws IOException {
	    assert scenarioDir.exists();

	    List<File> javaFiles = JavaSearcher.findJavaFiles(scenarioDir);
	    List<HashMap<String, String>> outputList = new ArrayList<>();
	    for (File javaFile : javaFiles) {
	        outputList.addAll(generateTestPrompt(javaFile, null, false, numberOfTests));
	    }

	    if (!outputList.isEmpty()) {
	        save(outputList, outputFile);
	    }
	}



    private static List<HashMap<String, String>> generateTestPrompt(File javaFile, Predicate<MethodDeclaration> predicate, boolean publicOnly, String numberOfTests) {
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

                HashMap<String, String> outputMap = computeUnitTestPrompt(javaFile, numberOfTests, cu, classDeclaration.getNameAsString(), methodSignature, suffix);
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
