// ConvertTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringIndexOutOfBoundsException;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Convert}.
* It contains one unit test case for the {@link Convert#init()} method.
*/
class ConvertTest {
		
	/**
	* Test if the file can be properly captured
	*/
	public boolean checkCapture();
	
	/**
	* Test if a file with input and output streams exists.
	*/
	public boolean checkConform();

	/**
	* Test if a file can be successfully captured.
	*/
	public boolean checkSuccessfulCapture(String filePath);
}

/**
* Main test class of Convert, with all input arguments supported.
*/
public class ConvertTest {
	public ConvertTest() {
	}
	
	/**
	* Performs the test with various options.
	*/
	public void run(){
		String input = "test/test.mp3" ;
		String output = "test/Output.mp4" ;
		String testDir = "/home/test/TEST" ;
		String transcodeDir = "transcode" ;
		
		//Test that a non-existent file throws an exception
        try {
            assertEquals( checkConform(), false);
        }
        catch ( IOException e ) {
            e.printStackTrace();
            assertEquals( checkConform( output, true), false);
        }
		
		//Test that a transcoded file exists
		assertTrue( checkSuccessfulCapture(output));
		
		//Test that a transcoded file isn't readable
		assertFalse( new File(output).canRead()); 
		
		//Test that the transcoded file can be read  
		try {
			Thread.sleep(4000);
		}
		catch ( InterruptedException e ) {
			e.printStackTrace();
		}
		assertTrue( checkSuccessfulCapture(output));
		//Test that the original file can be read 
		try {
			File tF = new File(testDir +"/test-file.mp4");
			assertEquals(checkSuccessfulCapture(tF.getName()), true);
		}
		catch ( FileNotFoundException e) {
			fail("can not find the original file");
		}
		//Test the directory can be read 
		File cF = new File(transcodeDir);
		assertTrue(cF.canRead());
		try {
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(cF), StandardCharsets.UTF_8));) {
			        BufferedWriter writer = new BufferedWriter(new FileWriter(new File(output)));
			        for (String line; (line = reader.readLine()).length()>0;)
			            writer.write(line)
			               .write( '\n');
			        writer.close();
			        reader.close();
				}
			}
		catch (Exception e) {
		        fail("could not create the reader and writer");
			}
		
		//Create video with original capture and transcode.
		File inFile1 = new File("out/" + input);
}
}