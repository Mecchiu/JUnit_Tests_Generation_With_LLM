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
		
	/**
	 * Gets filePath from PropertiesFile.xml to be tested
	 *
	 * @return - Path to file
	 */
	private static String getFilePath() throws IOException {
		// the test will try to get the filePath
		// from the properties file
		InputStream fis = ClientProperties_1Test.class.getClassLoader().getResourceAsStream(Constants.PropertyFile);
		FileOutputStream fos = new FileOutputStream(Constants.PropertyFile, true);
		byte[] tmp = new byte[Constants.FileSizeBytes];
		int nbRead = 0;
		
		// open stream which will be written to
		// the file which was used to read properties
		// from XML
		fis = ClientProperties_1Test.class.getClassLoader().getResourceAsStream(Constants.PropertiesFile);
 		
		// read into a byte buffer to write to the file
		// from which data will be read
		while ((nbRead = fis.read(tmp)) >= 0) {
			fos.write(tmp, 0, nbRead);
		}// while read
		
		// close streams
		fos.close();
		fis.close();
		return Constants.FilePath;
	}


	/**
	 * Tests if the method
	 * fileCopy(InputStream, File) does not throw an exception.
	 * This tests if the method
	 * fileCopy(Stream, File) does not throw an exception.
	 * @throws IOException
	 */
	@jbextension(description="No file copy from source and destination given", version="jbe")
	@Test
	void testPropertyCopyFile()throws IOException {
		assertFalse("file copy not failed.", ClientProperties_1Test.fileCopy(null, null) == null);
		
}
}