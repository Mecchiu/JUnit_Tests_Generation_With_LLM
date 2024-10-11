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
		
    /**
     * Method to test the addInputFileOutputStream.
     *
     * @throws InterruptedException The test was not finished due to a
     * interrupt being signalled
     * @throws IOException The test caused an error
     */
    @Test
    void testAddInputFileOutputStreams() throws InterruptedException, IOException {
        // create data that should be used for all testing
        String inputStr = "Hello, world, and a new world. "
                + "Let's give it some more data just to find it out...";
                
        File in = new File("testInputFile.txt");

        boolean isFileExist = in.exists();
        
        // write data to the file
        File out = new File(new File("outputDir"), "testOutputFile.txt");
        OutputDestination to = new OutputDestination();
        try {
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(in));
            to.write(inputStream, inputStr);
        } catch (IOException io) {
            if (isFileExist) {
                throw io;
            }
        }

        // check if the file is written correctly
        assertTrue(out.exists());
        
        // check what was written with the specified output destination
        String expectedContent = "Hello, world, and a new world. " 
                + "Let's give it some more data just to find it out...";
        List<String> lines = readLines(new FileInputStream(out));
        assertEquals(expectedContent, lines.get(0));
        
        // verify that there are no more lines in the file
        lines = readLines(new FileInputStream(new File("testInputFile.txt")), true);
        assertEquals(new Integer(0), lines.size());
    }

	/**
    * Test the return of the OutputDestination.
    *
    * @throws InterruptedException Thrown when an error happens in the thread
    * during the test run
    */
    @Test
    void testGetOutputDestination() throws InterruptedException {
        // add a file destination to the test 
        OutputDestination to = new OutputDestination();

        // test if the returned object is equal to a specific value
        List<String> lines = readLines(to);
        assertEquals(new Integer(1), lines.get(0).split()[0]);
                
        // test if the returned object is writeable
        to.write(new BufferedInputStream(new FileInputStream(new File("outputDir"))), "-m" );

        // read the file again to check is it created correctly
        lines = readLines(new FileInputStream(new File("outputDir")));
        assertEquals("-m", lines.get(0).split()[0]);
        assertTrue("The file should have been written and read successfully!", lines.get(0).split()[1].equals("-m"));
    }
	
	private List<String> readLines(BufferedInputStream in) throws IOException {
		List<String> fileContent = new ArrayList<>();
		
		List<String> lines = new ArrayList<>(256);
		for (int i = 0; i < 256; i++) {
			String line = in.readLine();
			lines.add(line.trim());
		}
		return lines;
	}
	/**
    * @return the test
    */
}