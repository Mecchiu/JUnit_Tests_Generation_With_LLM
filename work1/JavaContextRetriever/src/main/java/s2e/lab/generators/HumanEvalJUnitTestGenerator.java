package s2e.lab.generators;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.text.StringSubstitutor;
import s2e.lab.PromptUtils;
import s2e.lab.searcher.JavaSearcher;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.lang.String.format;
import static s2e.lab.PromptUtils.HUMAN_EVAL_TEST_TEMPLATE;
import static s2e.lab.generators.JavaOpenAIPromptGenerator.*;

/**
 * This class creates JUnit tests for the HumanEval dataset (RQ1).
 *
 * @author 
 */
public class HumanEvalJUnitTestGenerator {
    public static String RQ1_TEST_FOLDER_NAME = HUMAN_EVAL_TEST_FOLDER + "%sTest.java";

    public static void main(String[] args) throws IOException {
        // the original package is the one that has the full implementation "AS IS"
        File projectDirectory = new File(format(HUMAN_EVAL_SCENARIO, "original"));

        // header for the stats CSV file
        StringBuilder stats = new StringBuilder("Scenario\tFile\t#Unique Input-Output pairs\t#Declared Methods in CUT\n");

        // retrieves all classes under test
        for (File originalCode : JavaSearcher.findJavaFiles(projectDirectory)) {
            System.out.println("GENERATING FOR " + originalCode.getName());
            CompilationUnit cu = StaticJavaParser.parse(originalCode);
            HashMap<String, String> params = new HashMap<>();
            params.put("className", PromptUtils.getPrimaryClass(cu).getNameAsString());
            params.put("importedPackages", PromptUtils.getImportedPackages(cu));

            // generates the JUnit test only for the original scenario (coverage will be the same anyway, also scenario3 has no implementation)
            for (int i = 0; i <= 0; i++) {
                String packageName = (i == 0 ? "original" : ("scenario" + i));
                List<String> testMethodsList = getTestMethods(originalCode, packageName, params.get("className"));

                // creates the JUnit test from the template
                params.put("testMethods", String.join("", testMethodsList));
                params.put("packageName", packageName);
                String unitTest = StringSubstitutor.replace(HUMAN_EVAL_TEST_TEMPLATE, params);


                // save the JUnit test in a Java file in the tests folder
                String jUnitFilename = FilenameUtils.getBaseName(originalCode.getCanonicalPath());
                File outputFile = new File(format(RQ1_TEST_FOLDER_NAME, packageName, jUnitFilename));
                System.out.println("\t" + outputFile.getCanonicalPath());
                try (FileWriter file = new FileWriter(outputFile)) {
                    file.write(unitTest);
                }
                // collect statistics about the generated JUnit test
                stats.append(packageName)
                        .append("\t")
                        .append(originalCode.getName())
                        .append("\t")
                        .append(testMethodsList.size())
                        .append("\t")
                        .append(PromptUtils.getPrimaryClass(cu).getMethods().size())
                        .append("\n");
            }
        }

        // save basic stats about each class under test on the HumanEvalJava folder
        try (FileWriter file = new FileWriter(HUMAN_EVAL_JAVA + "statistics.txt")) {
            file.write(stats.toString());
        }

    }

    /**
     * Returns a list of strings. Each string contains one test method like this:
     * <code>
     * &#64;Test
     * public void testN() throws Exception{
     * assertEquals(...,...);
     * }
     * </code>
     *
     * @param javaFile    HumanEvalJava file under analysis
     * @param packageName the package name of the class under test
     * @param className   the name of the primary class
     * @return a list of test methods
     * @throws IOException in case of I/O problems
     */
    private static List<String> getTestMethods(File javaFile, String packageName, String className) throws IOException {
        List<String> result = new ArrayList<>();
        List<String> lines = Files.readAllLines(javaFile.toPath());
        int start = 0;
        // finds the first line that starts with "* > " (test case)
        // also ignores something like "* > 1.0" (this for test 81)
        for (; start < lines.size(); start++)
            if (lines.get(start).trim().startsWith("* > ") && !Character.isDigit(lines.get(start).trim().toCharArray()[4]))
                break;
        // finds the test cases
        int testId = 1;
        for (int i = start; i < lines.size() - 1; i += 2) {
            if (!lines.get(i).trim().startsWith("*") || !lines.get(i + 1).trim().startsWith("*")) break;
            String invocation = lines.get(i).replace("* > ", "").trim();
            String expected = lines.get(i + 1).replace("* ", "").trim();
            StringBuilder testBody = new StringBuilder();
            testBody.append("@Test\n");
            testBody.append(String.format("\tpublic void test%d() throws Exception {\n", testId++));
            testBody.append(
                    format("\t\tassertEquals(%s, %s.%s.%s);\n",
                            escape(expected, javaFile),
                            packageName,
                            className,
                            escape(invocation, javaFile))
            );
            testBody.append("\t}\n\n\t");
            result.add(testBody.toString());
        }
        return result;


    }

    /**
     * Given an input/output, it escapes python syntax to java syntax.
     *
     * @param s        string to be escaped
     * @param javaFile Java file under test
     * @return escaped string
     */
    private static String escape(String s, File javaFile) {
        // FIXME: this is a quick fix to avoid parsing arrays within a string -- ex: "()"
        // we should use a more generalizable approach
        if (javaFile.getName().equals("id_132.java")) return s; // this is a special case, QUICK FIX

        String out = s;
        if (s.contains("["))
            out = out.replace("[", "Arrays.asList(").replace("]", ")");
        if (s.contains("{"))
            out = out.replace("{", "Map.of(").replace("}", ")").replace(": ", ", ");
        return out;
    }
}
