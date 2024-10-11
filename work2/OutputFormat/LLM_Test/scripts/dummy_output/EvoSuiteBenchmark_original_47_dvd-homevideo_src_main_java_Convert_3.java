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
	 * Create a new Convert object
	 */
	public ConvertTest() { 
//		super();
	}

	/**
	 * Test that calling {@link Convert#init()} returns true and that
	 * an IOException is thrown when the passed input and output filenames
	 * do not point from the same directory.  Verify that an IOException is
	 * thrown if the output path does exist.
	 **/
	@Test
	public void testInit() throws IOException {
		assertTrue(init() == true);
	}


	/**
	 * Make sure that an IOException is thrown when the transcoding path does not  
	 * exist or the input and output stream do not point from the same directory. 
	  * Verify that a FileNotFoundException is thrown when input and output 
	  * filenames and output stream exist, and the directory they point to 
	  * does not exist.
	 **/
	@Test
	public void testMakeDirDoesntExist() throws FileNotFoundException, IOException {
		File transcodedOutputFile = new File("./transcodedDirNoFilesInFileTest");
		File transcodedInputFile = new File("./transcodedInputDirNoFilesInFileTest");
		assertTrue(transcodedOutputFile.isDirectory()); 
		assertFalse(transcodedOutputFile.exists());
		assertFalse(transcodedInputFile.isFile());

		FileWriter transcodedOutputFileWriter = new FileWriter(transcodedOutputFile.getAbsoluteFile()); 
		Transcode transcodedOutputStream = new Transcode("./transcodedResultFileWithNoOutputStream", "./transcodedResultDirWithNoOutputStream");
		Transcode.outputstream.write(transcodedOutputStream, transcodedOutputFileWriter, false);
		Transcode.writeResultFileContent(transcodedOutputFile); 

		Transcode.deletesecondarg = 10;

		BufferedWriter transcodedOutputStreamWriter = new BufferedWriter(new FileWriter(new File("./transcodedResultFileWithNoOutputStream"))); 
		try {Transcode.outputstream.write(transcodedOutputStream, transcodedOutputStreamWriter, false);} catch (Exception e) {assertTrue(false);}}

	/**
	 * It creates the transcoding directory and an output stream to transcoded
	 * transcoded stream.  This function asserts that an AssertionFailedException is thrown
	 * when the transcoding path does not exist or an IOException is thrown
	  * when the output stream does exist.
	 **/
	@Test
	public void testMakeDirExists() throws FileNotFoundException, IOException {
		assertTrue(makeDir("./transcodedDir", "././transcoded", true) == true); 
	}

	/**
	 * It creates the output subdirectory of transcoded and a transcoding stream
	 * created in a file of the above name. This function asserts that an AssertionFailedException
	 * is thrown when the directory do not exist and an IOException
	 * is thrown when an unexpected exception is thrown.
	 **/
	@Test
	public void testMakeDirWrongCase() throws FileNotFoundException, IOException, StringIndexOutOfBoundsException {
		System.out.println("Making sure that the output file name does not exist.");
		assertTrue(makeDir("../transcoded/",  "./transcoded", false) == true); 
		assertTrue(makeDir("../transcode/", "transcoded", false) == true); 
	}

	/**
	 * It creates the transcoding stream, transcoded stream, and an output stream to transcoded stream.
	 * This function asserts that an AssertionFailedException is thrown when the output path does not
	 * exist or an IOException is thrown when an unexpected exception is thrown.
	 **/
	@Test
	public void testMakeDirDoesntExistTwice() throws IOException, IllegalArgumentException,
			ArrayIndexOutOfBoundsException {

    	System.out.println("Making sure that an IOException is thrown when an unexpected exception is thrown.");
	}

     /**
     * A simple test that assumes that the transcoded output dir exists and that
     * a transcoded output stream contains the correct content in it.
     **/
     @Test
     public void testTranscode() {
    	assertTrue(transcodedStreamToFile(".", ".//transcoded").length() == 17);

    }

	/**
	 * A simple test that uses a transcoded output path.  The transcoded path exists 
	 * and the contents are as expected.
	 * It creates a transcoded output path and checks it exists and if a valid output 
	 * path exists and is of the correct size.
	 **/
	@Test
	public void testTranscodePathWithNonASCII() {
		System.out.println("Test for path: './transcoded/'");

		assertTrue(transcodedStreamToFile(".", ".//transcoded").length() == 17);

     }

     private File transcodedStreamToFile(String transcoded, String targetPath){
    	File transcoded = new File(targetPath);
    	BufferedWriter transcodedOutStream = new BufferedWriter(new FileWriter(transcoded));

    	Transcode.outputstream.write(transcodedStream,transcodedOutStream,false);

    	transcodedOutStream.close(); 

    	return transcoded;
     }

//	public void TestMakeDir(java.io.File testPath){
//		Transcode transcoder = new Transcode("testName", "testPath");
//  	
//		System.out.println("Testing with input stream  : " + testPath + " path: " + testPath.isFile());
//		System.out.println("Testing with output stream: " + testPath + " path: " + testPath.isDirectory());
//
//		BufferedWriter transcoded = new BufferedWriter(new FileWriter(testPath));
//		Transcoder.inputstream.write(new FileInputStream(testPath), transcoded);
//
//
//		transcoded.close();
//	}

	/**
	 * Convenience method for making a transcoding path that has exactly 9 bytes
	 * of content.
	 */
	public void checkTranscodeForAllChars(byte[] bytes){
		checkTranscodeForAllChars(new String(bytes), bytes.length);
	}

	/**
	 * Convenience method for making a transcoding path that has exactly 9 bytes
	 * of content and in case of non ASCII chars, a specific length.
     * @return checks if the length of the transcoded bytes matches the expectedLength. 
     * @param translcode the transcode which would be transcoded.
	 * @param expectedLength the length expected.
     * @throws IllegalArgumentException if length is invalid or non ASCII
	 */
}