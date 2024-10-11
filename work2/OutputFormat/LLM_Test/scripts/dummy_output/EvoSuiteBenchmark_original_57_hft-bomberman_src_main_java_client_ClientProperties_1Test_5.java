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
	 * Unit test case for {@link ClientProperties#fileCopy(InputStream, File)} method
	 */
	@Test
	void  testFileCopy_File( ) {
		
		// Open source file and check for error
		File fileSource = new File(Constants.TESTDATA1);
		
		// Create destination file
		File fileDest = new File(constants.TESTDATA1);
		
		// Create an output stream
		FileOutputStream fileOutputStream = new FileOutputStream(fileDest);
		
		logger.info(
				"Opening " + fileDest.getAbsolutePath() + "...");
		
		// Write source and destination to the output stream
		try {
			
			fileSource.createNewFile();
			
			// Start to write and check if file was not read
                        fileOutputStream.write("<test><![CDATA[This is a test"+ "content for writing. This text should not written!"+ "</test>" +"#<p>"+".<i class=\"fa fa-refresh\"></i> <i class=\"fa fa-thumbs-o-up\"></i> # </p>" + "This is the last content.","UTF-8" );
			
			// Copy entire file to a new destination		
			fileOutputStream.close();
			fileInputStream.reset();
			
			// Write the whole file to new destination
			fileOutputStream.write(fileSource.getContents());
			
		} catch (IOException ioException) {
			
			// The file was not write, so flag is set
			fileError = true;
			ioException.printStackTrace();
			assertTrue(
			"Output stream was not opened properly in test case" +
			"with error.",
			ioException.isErrorReported()
			);
		}
		
		// Close both streams
		fileOutputStream.close();
		fileInputStream.reset();
		
		// Check if the message was sent
		boolean isInOut = XmlFunctions.checkElements(destFile.getAbsolutePath());
		
		// Check file was transferred
		assertTrue(
		"The file was not transferred from the test case" +
		"with error.",
		isInOut 
		);
		
	}
	
	
	/**
	 * Initialises properties class to use in unit test
	 *
	 */
	public static void initClass() {
			  
		// Create a properties class (based on XMLFile class)
		// XMLFile.setProperties(new ClientProperties());
		ClientProperties clientProperties = 
				new ClientProperties();
		
		// set a property for XMLFile
		XmlFunctions xmlfunctions = new XmlFunctions();
		xmlfunctions.setProperty(Constants.USER_DIRECTORY_NAME, "data");

		// set a property for clientProperties
		try  // will throw exception if not
		{
			logger.info("This should be failed when using setProperty");
			clientProperties.setProperty(Constants.CLIENT_PROPERTIES_FILE, "XMLFileProperty");
		}  // end if
		catch (Exception e) {
			logger.info("Successfully failed when using setProperty");
		}
		assertEquals("XMLFileProperty should be found in the classname of XMLFile", clientProperties.getProperty(Constants.CLIENT_PROPERTIES_FILE), "XMLFileProperty");
		assertEquals("XMLFileProperty property found in the properties file", "XMLFile", clientProperties.getProperty(Constants.CLIENT_PROPERTIES_FILE, "XMLFile property"));
		
	}
		
	/**
	 * Checks if the file was not read, if true, it is set in the flag as fileError
	 * and flag it was successfully read.
	 *
	 * @return boolean - true if the message was sent, otherwise false.
	 */
	public boolean isFileError() {
		
		// Checks if local properties file is created
		CheckPropertiesFile(Constants.FILEPROP);

		// The file was copied correctly to destination location, so flag was correctly
		// set
		return fileError;
		
	}

}