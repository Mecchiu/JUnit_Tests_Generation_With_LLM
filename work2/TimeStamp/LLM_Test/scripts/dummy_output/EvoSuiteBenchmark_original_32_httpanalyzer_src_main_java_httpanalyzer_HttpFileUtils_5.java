// HttpFileUtilsTest.java
package httpanalyzer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Calendar;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import org.apache.http.HttpEntity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpFileUtils}.
* It contains one unit test case for the {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
*/
class HttpFileUtilsTest {
		
	private static final Logger logger = Logger.getLogger(HttpFileUtilsTest.class.getName());
	private static final String TMP_PATH = "TEST-DIR";
	private static final String RES_PATH = "TEST-RES";
	private static final String REQUEST_PARAM = "http.request.parameters.key";
	private static final String RESPONSE_PARAM = "http.response.parameters.key";
	private static final String FILE_1 = "http.file1";
	private static final String FILE_2 = "http.file2";

	public HttpFileUtilsTest() {
	}

	@Test
	void saveEntity_ShouldCopyAllDataToFile() throws IOException {
		String fileName = TMP_PATH + File.pathSeparatorChar + TMP_PATH + File.separator 
				+ "response_" + Calendar.getInstance().getTimeInMillis();
		OutputStream os = new FileOutputStream(fileName); //create output stream
		byte[] bytes = new byte[128]; //create dummy buffer to store the content
		os.write(bytes); //write the bytes to the stream
		os.close(); //close the stream
		logger.info("saved to file: " + fileName);
		FileInputStream fis = new FileInputStream(fileName);
		HttpEntity entity =  new HttpEntityByByteStream(fileName, fis); //create the entity
		assertEquals("incorrect size of HttpEntity", new Integer(1).toString(), 
				Utils.getSize(entity)); //test that the result is correct
		long count = 0; //used to count number of bytes
		while (fis.read()!= -1) { //read up to EOF at a time
			count++;
		}
		logger.info("Saved File: " + fileName);
		assertEquals("saved File " + fileName + " is not equal to the original file", 
				new Integer(1).toString(), count); //check the count
		String result = null;
		synchronized(HttpAnalyzerView.getReceiver()) {
			result = HttpAnalyzerView.getReceiver().getResponse(entity); //receive and log data
		}
		assertNull("Unexpected result: " + result, result); //if there is no error log it
	}
	
	@Test
	void fillToFileField() throws IOException {
		String fileName = TMP_PATH + File.pathSeparatorChar + TMP_PATH + File.separator
				+ "request_" + Calendar.getInstance().getTimeInMillis();
		OutputStream os = new FileOutputStream(fileName); //create output stream
		byte[] bytes = new byte[128]; //create dummy buffer to store the content
		os.write(bytes); //write the bytes to the stream
		os.close(); //close the stream
		logger.info("saved to file: " + fileName);

		FileInputStream fis = new FileInputStream(fileName); //create the input stream
		HttpEntity entity = new HttpEntityByByteStream(fis); //create the entity
		fillToFileField(entity, new StringBuffer(FILE_1)); //add file1 to the request
		fillToFileField(entity, new StringBuffer(FILE_2)); //add file2 to the request
		fillToFileField(entity, new StringBuffer(RESPONSE_PARAM)); //add the parameters

		String result = null;
		synchronized(HttpAnalyzerView.getReceiver()) {
			result = HttpAnalyzerView.getReceiver().getResponse(entity);
		}
		assertNotNull("Could not get the full response:", result); //if there is no error log it
		result = result.trim(); //clean the result
		assertEquals("correct content not detected", 
				new Integer(RES_PATH.length()) + " bytes is not equal to the bytes stored in the" +
						"request file: " + new Integer(FILE_1.length()), 
				new Integer(RES_PATH.length()), result.charAt(0));
		assertEquals("correct content not detected", 
				new Integer(RES_PATH.length()), result.length()); //and the rest shouldnt be in the result
	}

	@Test
	void loadFromFileField() throws IOException {
}
}