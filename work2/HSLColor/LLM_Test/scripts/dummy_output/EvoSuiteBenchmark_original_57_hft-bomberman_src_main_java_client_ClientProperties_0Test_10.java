// ClientProperties_0Test.java
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
* It contains one unit test case for the {@link ClientProperties#getProperty(String)} method.
*/
class ClientProperties_0Test {
		private static final Logger logger = Logger.getLogger(ClientProperties.class.getName());

		@Test
		public void TestGetParmeterFromElement() {
			ClientProperties clientProperties = new ClientProperties("ClientProperties_0Test");
			ClientProperties.CheckPropertiesFile(File.separator + ".xml");
			assertEquals("", clientProperties.getProperty(Constants.PropertyParmeter_0_0));
			try {
				ClientProperties.getProperty(Constants.PropertyParmeter_0_0);
				fail("Element error should not be thrown as property getter");
			} catch(IOException e) {
				logger.info("Expected exception - Element error");
			}
		}

		@Test
		public void TestGetFileFromElement() {
			ClientProperties clientProperties = new ClientProperties("ClientProperties_0Test");
			ClientProperties.CheckPropertiesFile(File.separator + ".xml");
			File clientPropNameExists_0;
			try {
				File clientPropExists = new File("ClientProperties_0Test");
				clientPropNameExists_0 = new File(File.separator + "ClientProperties_0Test");
			} catch (IOException e) {
				logger.info("Expected exception - File exists error");
				fileError = true;
				return;
			}
			String clientPropFileNameExist_0 = null; // no name is set for empty file
			try {
				clientPropFileNameExist_0 = clientPropNameExists.exists()? clientPropNameExists.getName() : null;
			} catch (IOException e) {
				logger.info("Expected exception - File is not exist error");
				return;
			}

			if(clientPropFileNameExist_0 == null || clientPropFileNameExist_0.equals("")) {
				assert(false);     // expected exception
				fileError = true;
				return;
			}
			try {
				File clientPropExists_0 = new File(File.separator + clientPropFileNameExist_0);
				assertEquals(clientPropFileNameExist_0, clientPropExists_0.getAbsolutePath());
			} catch(IOException e) {
				logger.info("Actual exception message should refer to exist value");
				assertEquals(e.getMessage(),
						"File at '" + clientPropFileNameExist_0 + "' already exists. It should belong to directory: ClientProperties");
				fileError = true;
			}
			assertEquals("the file for property " + Constants.PropertyParmeter_0_0 + " is correct.",
					clientPropFileNameExist_0, clientPropNameExists.getAbsolutePath());
		}

		@Test
		public void TestCheckFileFromElement() {
			File sourceFile = null;
			try {
				sourceFile = new File(File.separator + "ClientProperties_0Test.xml");
			} catch (IOException e) {
				fileError = true;
				return;
			}

			// does not exist
			assertEquals("is expected to find exist value for  : " +
					Constants.PropertyParmeter_0_0 + ", but is not found",
					sourceFile.exists(), false);
		}

		/**
     * returns a copy of the instance for the tests
     */
	public static ClientProperties getCopy() {
		ClientProperties clientProperties = new ClientProperties("ClientProperties_0Test");
		return clientProperties.getCopy();
	}

	/**
     * gets path for the xml-file
     */
	public static InputStream getInputStream() {
		InputStream sourceFile = null;
		try {
			sourceFile = new File("ClientProperties_0Test.xml");
		} catch (IOException e) {
			logger.info("Actual exception message should reference non-exist value");
			return null;
		}
		assertTrue(sourceFile!= null);
		return sourceFile;
	}

	/**
     * writes properties to file from the inputStream and returns true if the file
     * is successfully written on the success.
     *
     * @param sourceFile -
     *            InputStream which should be copied
     * @return boolean - true if copied, otherwise false
     */
	public static boolean fileWrite(final InputStream sourceFile) {
		final boolean success = false;
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("ClientProperties_0Test");
		} catch (Exception ex) {
			logger.info("File write error: " + ex.getMessage());
			fileError = true;
			throw new RuntimeException("Error occured while write to the property file.");
		}
		try {
			XmlFunctions.saveWithXPathString(sourceFile, fos);
		} catch (IOException ioe) {
			logger.info("Property was not saved: " + ioe.getMessage());
			fileError = true;
			return success;
		}
		return success;
	}
}