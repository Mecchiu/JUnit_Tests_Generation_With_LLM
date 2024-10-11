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
		
	/**
	 * The test for the method {@link HttpFileUtils#saveEntity(HttpEntity, String)}.
	 */
	@Test
	public void testSaveEntity() {
		// Create file with null content 
		String fileNameString = null;
		long fileSize = 0;
		byte[] data = null;
		try (FileInputStream fileInputStream = new FileInputStream(fileNameString);
			File savedFile = saveEntity(data, fileNameString)
		) {
			// Check file size of the saved file
			assertEquals(fileSize, savedFile.length());
		}
		catch (IOException e) {
			System.out.println(e);
			fail("IOException during the FileInputStream of saveEntity.");
		}
		//Create File of null content
		String noFile = null;
		try {
			noFile = saveEntity(DataUtils.nullByteArray, noFile);
			System.out.println("test SaveEntity - Save without null content");
		}
		catch (IOException e) {
			System.out.println(e);
			fail("IOException during when there is null content");
		}
		//Check if no content is saved 
		try {
			assertEquals(noFile, saveEntity(null, noFile) );
		}
		catch (IOException ioe) {
			//Do nothing
		}
		
	}
}