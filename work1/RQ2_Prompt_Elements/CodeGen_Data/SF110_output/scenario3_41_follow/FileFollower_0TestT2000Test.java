// FileFollower_0Test.java
package ghm.follow;

import ghm.follow.io.OutputDestination;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileFollower}.
* It contains one unit test case for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
*/
class FileFollower_0Test {

	static List<String> textFileContent;
	static List<File> textFileContents;
	static boolean testCondition = true;
	
    /**
     * Tests the following method with a file path.
     */
    @Test
    public void testAdd_FileFollower() {
        if (testCondition) {
                    // The following line adds a file to the list.
            final FileFollower inputDestination = new FileFollower();
            testCondition = false;
            assertNotNull(inputDestination);
            inputDestination.addFile(new File("test.txt"));
            FileFollower outputDestination = new FileFollower();
            testCondition = false;
            assertNotNull(outputDestination);
            outputDestination.addOutputDestination(inputDestination);
        }
		// This tests a path to a file without a trailing path separator
		File testFile = new File("file");
		List<File> textFileContents1 = new ArrayList<File>();
        List<File> textFileContents2 = new ArrayList<File>();

        textFileContents.add(testFile);
        textFileContents1.add(new File(testFile.getParentFile(), "textfile.go"));
        textFileContents.add(new File(testFile.getParentFile(), "moretextfile.go"));
        textFileContents2.add(testFile);
        textFileContents.add(new File(testFile.getParentFile(), "Textfile.go"));
        textFileContents2.add(new File(testFile.getParentFile(), "textfile.go"));
        textFileContents.add(new File(testFile.getParentFile(), "moretextfile.go"));
        textFileContents2.add(new File(testFile.getParentFile(), "moresultfile.go"));

        textFileContents1.add(testFile);                
        textFileContents2.add(testFile);                
        List<File> textFileContents3 = new ArrayList<File>();
        textFileContents3.add(testFile);
        textFileContents3.add(testFile);
        listWithPathsOfContentsTest_0_1("/", true, testFile, textFileContents1, textFileContents2, "file");
        listWithPathsOfContentsTest_0_1("/", true, testFile, textFileContents1, textFileContents2, "moresultfile");
        listWithPathsOfContentsTest_0_2("/", true, testFile, textFileContents1, textFileContents2, "Textfile.go");
        listWithPathsOfContentsTest_0_2("/", true, testFile, textFileContents1, textFileContents2, "moretextfile.go");
	}
	
    /**
     * Tests a path to a file with a trailing path separator. 
     * @param testPath path to a file with a trailing path separator
     * @param inputText1 flag indicating whether input text is a file
     * @param fileContents3 file to be tested
     * @param pathContents3 paths to be tested
     * @param testCondition the condition for testing the condition
     * 
     * @since 1.0
     */
    void listWithPathsOfContentsTest_0_1(String testPath, boolean inputText1, File file, List<File> fileContents3, List<File> pathContents3, String testCondition) {
        if (testCondition) {
                    // The following line adds a file to the list.
            List<File> textFileContents;
	 
            if (inputText1) {
                // Adding a file to the list should not add a file to the following paths.
                fileContents3.add(new File(testPath));
            } else {
                // Adding a path to a file should add a path to the following paths.

                // Adding a path to a file should not add a path to the following paths.
                pathContents3.add(new File(testPath));

                // If the following conditions are met, the following paths should not be equal.
                fileContents3.add(new File(testPath));
                fileContents3.add(new File(testPath));

		// If the following conditions are met, this should add a path to the followings paths.
		pathContents3.add(new File(testPath));
                }
        }
        textFileContent = new ArrayList<File>();
        // Adding a file to the list should not add a file to the following path.
        fileContents3.add(new File(testPath));
        textFileContent = new ArrayList<File>();

        // Adding a path to a file should add a path to the following path.

        // Add both files to the list.
        textFileContents3.add(new File(testPath));
        textFileContents.add(fileContents3);

        // Adding a condition to the following file should add a path to the following conditions.
        inputText1 = true;
        pathContents3.add(new File(testPath));
        List<File> conditionTextFileContents;
        // It should not use the path to the first file.
        // There is no way that you can differentiate this from the other.
        pathContents3.add(new File(testPath));
	conditionTextFileContents = new ArrayList<File>();
        // The following conditions shall pass for all the other conditions.
        conditionTextFileContents.add(new File(testPath));
        // If the following conditions are met, the following conditions should not be equal.
        pathContents3.add(new File(testPath));
        pathContents3.add(new File(testPath));
        pathContents3.add(new File(testPath));
        // If both conditions are met, the following condition should add a path to the following conditions.
        conditionTextFileContents = new ArrayList<File>();
        conditionTextFileContents.add(new File(testPath));
        pathContents3.add(conditionTextFileContents);
        pathContents3.add(new File(testPath));
        pathContents3.add(new File(testPath));

        // Add both conditions to the list.
        inputText1 = false;
        conditionTextFileContents = new ArrayList<File>();
        // If both conditions are met, the following conditions shall fail.
        conditionTextFileContents.add(new File(testPath));
        conditionTextFileContents.add(new File(testPath));
        conditionTextFileContents.add(new File(testPath));
        // The following conditions should succeed.
        pathContents3.add(conditionTextFileContents);

        if (!testCondition) {
            // All of the following conditions should fail.
            pathContents3.add(