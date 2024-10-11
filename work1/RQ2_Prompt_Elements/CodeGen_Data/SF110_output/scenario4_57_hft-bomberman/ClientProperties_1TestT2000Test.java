// ClientProperties_1Test.java
package client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import common.Constants;
import common.XmlFunctions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientProperties}.
* It contains one unit test case for the {@link ClientProperties#fileCopy(InputStream, File)} method.
*/
class ClientProperties_1Test {

	public String fileOutputFileName;
	
	/**
	 * @throws IllegalArgumentException -
	 * method that is throwing IllegalArgumentException if
	 * fileOutputFileName is null
	 * @throws IOException -
	 * method that throws IOException if some other error
	 * @throws ClassNotFoundException -
	 * fileOutputFileName is different than path for the file
	 */

	@Test
	public void testFileCopy_1() throws IllegalArgumentException, IOException, ClassNotFoundException {
		
		fileOutputFileName = new File("C:\\Users\\test", "testProperties.xml").getAbsolutePath();
		
		assertTrue("fileOutputFileName is different than path for the file", fileOutputFileName.startsWith("C:\\"));
		
		Logger logger = Logger.getLogger("ClientProperties_1Test_2.xml");
		
		// reads properties from the file into a String
		ClientProperties clientProperties = new ClientProperties(fileOutputFileName);
		
		assertNull("fileOutputFileName is same as path for the file", clientProperties.fileOutputFileName);
		assertEquals("properties not read", "hello", clientProperties.getProperty("hello"));
		
		StringBuilder response = new StringBuilder();
		
		String file = "response.xml";
		
		FileOutputStream out = null;
		
		try {
		
			File file1 = new File(file);
			file1.createNewFile();
		
			out = new FileOutputStream(file1);
		
			out.write(("<fileResponse>hello</fileResponse>").getBytes());
			
		} catch (IOException ioe) {
			
			fileOutputFileName = clientProperties.fileOutputFileName;
	    	checkFilePath(fileOutputFileName);
			throw ioe;
		}
		
		assertTrue("not failed to read "+file, true);
		
		try {
		
			// read response from the file to string
			try {
				response = new StringBuilder();
				out = new FileOutputStream(fileOutputFileName);
				out.write(response.toString().getBytes());
			} catch (IOException ioe) {
			
				fileOutputFileName = clientProperties.fileOutputFileName;
				checkFilePath(fileOutputFileName);
				throw ioe;
			}
		
			assertEquals("response not read", response.toString());
			
		} finally {
			
			if (out!= null) out.close();
			
		}
		
	}
	
	/**
	 * checks file path
	 * if it was different for instance, file is copied
	 * to fileOutputFileName
	 * if that was done, and that is different for instance, then file is overwritten
	 * because that was done to avoid to have the wrong files in the file output
	 * directory
	 *
	 * @param filePath -
	 *            filePath is different for the property
	 */
	private void checkFilePath(String filePath) {
		
		File file = new File("C:\\Users\\test", "testProperties.xml").getAbsoluteFile();
		
		FileOutputStream out = null;
		
		try {
		file = new File(filePath);
		file.createNewFile();
		
		out = new FileOutputStream(filePath);
		} catch (Exception e) {
			
			fileOutputFileName = clientProperties.fileOutputFileName;
			checkFilePath(filePath);
			throw new IllegalArgumentException("Could not get path for fileOutputFileName.", e);
		}
		
		assertEquals("no file path", filePath, clientProperties.fileOutputFileName);
		
		try {
		new File(filePath).delete();
		} catch (Exception e) {
			
			fileOutputFileName = clientProperties.fileOutputFileName;
			checkFilePath(filePath);
			throw new IllegalArgumentException("Could not delete file on property.", e);
		}
		
		if (file.delete()) {
			
			fileOutputFileName = clientProperties.fileOutputFileName;
			checkFilePath(filePath);
			
		}
		
	}
	
	/**
	 * @throws IllegalArgumentException -
	 * method that is throwing IllegalArgumentException if
	 * fileOutputFileName is null
	 * @throws IOException -
	 * method that throws IOException if some other error
	 */
	@Test
	public void testFileCopy_2() throws IllegalArgumentException, IOException {
		
		fileOutputFileName = new File("C:\\Users\\test", "tmpProperties.xml").getAbsolutePath();
		
		ClientProperties clientProperties = new ClientProperties(fileOutputFileName);
		
		assertNull("fileOutputFileName is same as path for the file", clientProperties.fileOutputFileName);

		assertNull("property is null after property was read from xml-file", clientProperties.getProperty("hello"));
		
		//read properties from the file into a String
		String response = new String();
		
		InputStream input = null;
		
		try {
		
			input = new FileInputStream(new File("C:\\Users\\test", "tmpProperties.xml"));
		
			response = XmlFunctions.getDocumentXML(input);
			
		} catch (IOException ioe) {

			fileOutputFileName = clientProperties.fileOutputFileName;
			checkFilePath(fileOutputFileName);
