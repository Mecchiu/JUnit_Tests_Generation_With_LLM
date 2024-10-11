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

	// Constants
	private static String TEST_DIR = "TEST_DIR";
	private static String TEST_FILENAME = "TEST_FILENAME";

    private File TEST_FILENAME_IN_DIR;
	private static String testDir;

    // File to read and store xml-data
    public static File FileOut = new File(Constants.TEST_DIR + File.separatorChar + "ClientProperties_0Test.xml");

	// private static Logger LOGGER;

    @Test
    public void Test_readParamsSetToString_FileOut_should_setToExistToString() throws IOException {
		ClientProperties clientProperties = new ClientProperties();
		assertEquals(fileInAndExistToNullAndExistString(), clientProperties.getProperty(TEST_DIR));
    }

    @Test
    public void Test_checkPropertiesStoredSuccessfully_should_clearLog4jException_onPropertyFileSaveFailure() {
        
        File temp = new File(Constants.logFileTemp);
        assertEquals(temp.exists(), false);

        TEST_FILENAME_IN_DIR = temp.getParentFile();
        FileOut.createNewFile();

        ClientProperties clientProperties = new ClientProperties();
        try {
            assertEquals(fileInAndNotExistToNullAndNotExistString(), clientProperties.getProperty(TEST_DIR));

            String fileName = fileOutAndFileInTempLocationForPropertiesSave(
                    fileInAndNotExistToNullAndNotExistString(), temp.getParentFile());

            assertEquals(fileName, Constants.getPropertyValueWithExclamationComma(fileName));
        } catch (IOException e) {
            assertEquals(e, true);

            // Check Exception is thrown with correct exception message
            String message = XmlFunctions.decode(e, Constants.Logger);
            String expectedErrorMsg = Constants.LOGGER.getMessage(Constants.SERVICE_ERROR_STRING);
            assertEquals(expectedErrorMsg, message);
            
            // Check correct exception occurs with wrong exception message
            assertTrue(String.format("exception is expected: %s", expectedErrorMsg), e.getCause() instanceof FileNotFoundException);
        }
    }

    /**
     * tests {@link ClientProperties#isPropertyFileAlreadyExistsUsingSystemProperty(String}  
     * with empty string as value return true
     */
    @Test
    public void Test_isPropertyFileAlreadyExistsUsingSystemPropertyValue_withNullValueReturnsTrue() {
        File temp = new File(Constants.logFileTemp);
        assertEquals(temp.exists(), false);

        // setting an empty value in the file
        FileOut.delete();
        TEST_FILENAME_IN_DIR = temp.getParentFile();
        String value= "";
        FileOut.createNewFile();
        XmlFunctions.writePropertiesFile(value);
        ClientProperties clientProperties = new ClientProperties();
        assertEquals(fileInAndNotExistToNullAndExistString(), clientProperties.getProperty(TEST_DIR));
        assertEquals(fileInAndNotExistToNullAndExistString(), clientProperties.getProperty(TEST_FILENAME));


        // getting value by its own property in xml file using method name as param
        try {
            String expectedValue = null;
            value = System.getProperty(TEST_FILENAME);
            String actualValue = XmlFunctions.readPropertiesFile(TEST_FILENAME);
            assertEquals(expectedValue, actualValue);
        } catch (IOException e) {
            fail();
        }

        // getting value by another param in xml file
        try {
            value = System.getProperty(TEST_FILENAME_IN_DIR);
            String actualValue = XmlFunctions.readPropertiesFile(TEST_FILENAME_IN_DIR, Constants.LOGGER);
            assertEquals(expectedValue, actualValue);
        } catch (IOException e) {
            fail();
        }
    }

    public static File Infile;
    
    // private static void writeFileToTmp(String aString) {
    // INFILE.createNewFile();
    // FileOutputStream outputStream = new FileOutputStream(INFILE);
    // String sString = "";
    //
    // try {
    // sString = Constants.TEST_STRING;
    // } catch (IOException e) {
    // fail();
    // }
    //
    // try {
    // outputStream.write(sString.getBytes());
    // } catch (IOException e) {
    // fail();
    // }
    //
    // }

}
