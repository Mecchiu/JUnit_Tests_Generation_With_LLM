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
		private static final Logger log = Logger.getLogger(ClientProperties_0Test.class);

        /**
     * Test of getProperty method, of ClientProperties class.
     */
     @Test
     public void testGetProperty() {
        log.error("Method 'getProperty' is not yet implemented in "+ClientProperties.class.getName());

        //
        String fileName = "File2";

        ClientProperties classProperties = new ClientProperties(fileName);

                // check if local properties file is present
        assertFalse("Local properties file should be absent if fileName is not used",
                classProperties.fileError);

        Class<?> aclClass = ClientProperties.class;

        Class[] c = new Class[] { String.class };

        //
        String bString = "blo";

        String cString;

        String bStringArray[] = new String[] { "String1", "String2" };

        String cStringEmpty = "String3";

        String object = "value";

        String nullString = null;

        Class aClass = aclClass;

        //
        try {
            Class.forName(aClass.getName() + "2");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        //
        try {
            Class.forName(aClass.getName());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        //
        try {
            Class.forName(aClass.getName(), true, aClass);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        //
        try {
            Class.forName(aClass.getName(), true, aClass);
        }
        catch (Exception e) {
            e.printStackTrace();
            classProperties.fileError = true;
        }

        File file = new File(Constants.PropertiesFileDirectory, fileName);

        assertTrue("Local properties file should be available", classProperties.fileError);

        assertTrue("Local properties file exists!", classProperties.fileError == false);

        Class.forName(aClass.getName());

        String value;

        try {
            value = classProperties.getProperty("name");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals("The property 'name' is not updated", value, bString);

        assertTrue("Local properties file should exist!", classProperties.fileError == false);

        assertTrue("Local properties file exists!", classProperties.fileError == true);
    }

    /**
     * check if local properties file is present, if not tries to copy empty
     * file to location. If this fails, flag fileError is set to true and read
     * or write access is bypassed
     */
    void CheckPropertiesFile(String fileName);

    /**
     * copies a file from a to b
     * used InputStream as provided from ResourceService as
     * source and File as destination
     *
     * @param sourceFile -
     *            InputStream - File which should be copied
     * @param destFile -
     *            destination where file should be copied to
     * @return boolean - true if successfully copied, otherwise false
     */
    boolean fileCopy(InputStream sourceFile, File destFile);

    /**
     * Writes properties content to outputStream using system property
     *
     * @param outputStream
     *            outputStream to write to
     * @param fileName
     *            the file name
     * @param content
     *            the content which should be written
     */
    void WritePropertiesToOutputStream(File outputStream, String fileName,
            String content);

    /**
     * Reads the contents of properties file and checks to see if it
     * matches the expected file content
     *
     * @param expectedFileName
     *            the expected file name
     * @return String expected Content for the specified fileName
     */
    String ReadPropertiesFile(String expectedFileName);

    /**
     * checks if the file named in the class level file.properties file exist
     * in the system.properties file
     *
     * @return boolean - true if the file exists in the system, otherwise false
     */
    boolean hasFile(String fileName);
}