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
		
	private static final Logger logger = Logger.getLogger(ClientProperties.class);
				
	/**
	 * Reads properties from a source file and saves it in a new file
	 * @throws IOException -
	 *             if error occurs while reading source file
	 */
	@Test
	public void testReadPropertiesFile() throws IOException{
		
		// creates a local file from a temp folder
		File tmpFile = new File(Constants.USER_DIR, "ClientProperties.xls");
		
		// creates an InputStream to read from a resource
		InputStream sourceFile = ClassLoader.getSystemResourceAsStream(Constants.RESOURCE_NAME);
	
		// if resource exists, saves properties file to it
		if( Constants.OUTPUT_PROPERTIES_XML_FILE.equals(Constants.OUTPUT_PROPERTIES_XML_FILE) ){
					
		CheckPropertiesFile(tmpFile);
		} else {
			// if resource is not present but properties file is present, copies old properties file to a new location
			FileOutputStream destFile = new FileOutputStream(tmpFile);
				
			fileCopy(sourceFile, destFile);
			
			// checks if any write access in destFile is bypassed
			boolean isBypass = false;
			try {
				isBypass = File.pathSeparatorChar == destFile.getSeparator() &&
					(fileError || destFile.getChannel().availableToRead() <= destFile.getChannel().size());
			} catch(IOException e) { 
				// any error in output properties file is skipped by checking for bypassed flag 
				// in case of bypassing file writing we cannot proceed with the test
				isBypass = fileError;
			}
				
			assertTrue("OutputProperties file is not bypassed, and it is not overwritten", isBypass);
		}
		
		// checks whether the new local file has been written to xml-file
		XmlFunctions xmlFunctions = new XmlFunctions();
		String result = xmlFunctions.getProperty(Constants.OUTPUT_PROPERTIES_XML_FILE);
        assertNotNull("OutputProperties file is null", result);
	}
}