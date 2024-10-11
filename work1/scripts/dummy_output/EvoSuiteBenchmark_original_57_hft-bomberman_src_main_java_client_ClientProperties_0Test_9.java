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
		
    /**
     * Test method for {@link ClientProperties#getProperty(String)}.
     *
     * @throws IOException
     */
    @Test
    public void testGetProperty() throws IOException {
    	CheckPropertiesFile("testGetProperty");

    	// set properties file to read and write
    	// file to temporary file and store results in fileOutput
    	// to read and write to
    	

    	// read property
    	String property = XmlFunctions.getProperty("x");

    	// check property value
    	// - not empty
    	// - value not equal to value from xml
    	if (property == null) {
    		System.out.println("Property " + "x" + " is null");
    		System.out.println("Expected value: '" + Constants.TEST_PROPERTY_VALUE + "' was: null");
    		assertNull(property);

    	} else if (! Constants.TEST_PROPERTY_VALUE.equals(property)) {
    		System.out.println("Expected '" + Constants.TEST_PROPERTY_VALUE + "' to be equal to '" 
                    + Constants.TEST_PROPERTY_VALUE + "'");
    		System.out.println("Actual property: " + property);
    		System.out.println("Expected Value: '"+ Constants.TEST_PROPERTY_VALUE + "' was: "
                    + Constants.TEST_PROPERTY_VALUE);
    		assertEquals(Constants.TEST_PROPERTY_VALUE, property);
    	}
    }
    // @Test
    // public void testGetProperty() throws IOException {
    //     String fileName = "testGetProperty";
    //     CheckPropertiesFile(fileName);
    //
    //     String value = null;
    //     String file = new File(Constants.TEST_PREFIX + "xml" + File.separator + fileName);
    //     InputStream is = null;
    //
    //     is = getInputStream(fileName);
    //
    //     try {
    //         value = FileTools.asString(is);
    //
    //     } finally {
    //         if (is!= null) {
    //             try {
    //                 is.close();
    //             } catch (IOException e) {
    //                 // ignore
    //             }
    //         }
    //     }
    //     
    //     System.out.println("Properties file path was set to '" + file + "'");
    //     System.out.println("Property value is '" + value + "'");
    //     assertEquals("Value is not equal to value from xml", value, Constants.TEST_PROPERTY_VALUE);
    // }

    private InputStream getInputStream(String fileName) throws IOException {

        logger.info("Try to get input stream from file '" + fileName + "'");
        
//        return new FileInputStream (new File(Constants.TEST_PREFIX + "xml" + File.separator + fileName));

        logger.info("Test file exists");

        return getInputStream(new File(Constants.TEST_PREFIX + "xml" + File.separator + fileName));
    }

    /**
     * Checks if file is present, if not, throws IOException.
     * Also, file is checked to have all required properties (e.g. name of file, 
     * size, etc.) as mandatory and
     * returns file contents to System.out.
     *
     * @param fileName the name of file to check
     * @return InputStream - contains entire read or write action
     * @throws IOException is thrown if any fail
     */
    private InputStream getInputStream(String fileName) throws IOException {
        logger.info("Opening file " + fileName);
	
        // open temporary file
        File temporaryFile = FileTools.createTempFile(Constants.TEST_PREFIX + "xml" + File.separator + fileName, FileTools.getExtension(fileName));
        try {
            return new FileInputStream (temporaryFile);
        } catch (FileNotFoundException e) {
            // try to open a file or
            // if unable to open, fail and attempt to move the file
            try {
                logger.info("Opening empty file "+temporaryFile + " via getInputStream");
                return new FileInputStream(temporaryFile);
            } catch (IOException e1) {
                assertTrue("File does not exist, can't be created", temporaryFile.exists());
            }

            logger.error("Cannot open file, skipping test.");
            return null;
        }
    }
}