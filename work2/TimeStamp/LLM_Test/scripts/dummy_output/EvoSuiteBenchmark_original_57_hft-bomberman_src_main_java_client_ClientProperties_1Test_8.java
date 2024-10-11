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
		/** Constructor. */
    ClientProperties_1Test(){}
    /**
     * checks if a file could be written to location as destFile.
     * 
     * @throws IOException -
     */
    @Test
    public void fileWriteToB_in_location() throws IOException {
    CheckPropertiesFile(Constants.TEST_XML_NAME);
    } 

    /**
     * tests if file could be copied to location as destFile.
     * 
     * @throws IOException -
     */
    @Test
    public void fileWriteToB_in_B() throws IOException {
    CheckPropertiesFile(Constants.TEST_XML_NAME);
    }

    /**
     * checks if file could be read from location as sourceFile.
     * 
     * @throws IOException -
     */
    @Test
    public void fileReadFromB_in_location() throws IOException {
    CheckPropertiesFile(Constants.TEST_TXT_NAME);
    }

    /**
     * tests if file could be read from location as sourceFile.
     * 
     * @throws IOException -
     */
    @Test
    public void fileReadFromB_in_location() throws IOException {
    CheckPropertiesFile(Constants.TEST_TXT_NAME);
    }

    /**
     * checks property value at specific location in xml-file.
     *
     * @param elementName - Name of property-element
     * @param location    - location of the property
     * @param value       - value which should be checked
     */
        @Test
    public void propertyValue_in_Location(String elementName, String location, String value) throws IOException  {

        CheckPropertiesFile(location);
             File output = new File(destFile.getAbsolutePath() + File.separator + elementName);

        FileOutputStream result = new FileOutputStream(output, true);
        result.write(XmlFunctions.writeValue(value));
        result.close();
        boolean ret = fileCopy(Utils.getAssetStream(Destination.class,location), destinationFile);
        assertTrue("fileCopy failed", ret);
        logger.info("Successfully copied file: " + destinationFile);  

    }
        /**
         * checks property value at specific location in xml-file.
         *
         * @param elementName - Name of property-element
         * @param location    - location of the property
         * @param value       - value which should be unchecked
         */
        @Test
    public void propertyValue_in_B(String elementName, String location, String value) throws IOException  {
        CheckPropertiesFile(location);
           File output = new File(destFile.getAbsolutePath()  
              + File.separator  + elementName  
              + File.separator  + Constants.TEST_B_FILE_NAME);

        FileOutputStream result = new FileOutputStream(output, true);
        result.write(XmlFunctions.writeValue(value));
        result.close();
        boolean ret = fileCopy(Utils.getAssetStream(Destination.class,location), destinationFile);
        assertTrue("fileCopy failed", ret);
        logger.info("Successfully copied file: " + destinationFile);  

    }

	/**
	 * Test for the read method
	 */
	@Test
	public void read_read_propertyFile() {
		propertyValue(Constants.TEST_TXT_NAME, Constants.TEST_TXT_L10N, Constants.TEST_TXT_UNICODE);
		propertyValue(Constants.TEST_TXT_NAME, Constants.TEST_TXT_L30N, Constants.TEST_TXT_L30N);
		propertyValue(Constants.TEST_TXT_NAME, Constants.TEST_TXT_L40N, Constants.TEST_TXT_L40N);
        propertyValue(Constants.TEST_TXT_NAME, Constants.TEST_TXT_L60N, Constants.TEST_TXT_L60N);
	}

        /**
         * test for the write method
         * test for write to dest location in properties file
         * 
         * @param elementName  -
         *                      Name of property-element
         * @param location     -
         *                      location of the property
         * @param value         -
         *                      value which should be checked
         */
        @Test
        public void write_writeToB(String elementName, String location, String value) {

            File destinationFile = new File(destFile.getAbsolutePath()  + File.separator  +elementName  
              + File.separator  + Constants.TEST_B_FILE_NAME);

            CheckPropertiesFile(destinationFile, location,value,Constants.TEST_B_FILE_L10N);
            File output = new File(destFile.getAbsolutePath()  + File.separator  +
              elementName  + File.separator  + Constants.TEST_B_FILE_NAME);
            FileOutputStream result = new FileOutputStream(output, true);
            result.write(value);
            result.close();
      logger.info(destinationFile.getPath() + " successfully written to " + destinationFile);      
        }

}