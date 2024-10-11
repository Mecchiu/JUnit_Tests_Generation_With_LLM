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
		private static final Logger logger = Logger.getLogger("ClientProperties_0Test");
    /**
     * Method to be tested.
     */
    @Test
    public void testGetProperty() {
        assertEquals("Properties from file",
                     "Properties from file",
                     ClientProperties.getProperty("Properties from File"));
    }
    /**
     * Method to be tested.
     */
    @Test
    public void testSetProperty() {
        assertTrue("Invalid property", ClientProperties.fileError == false);
        ClientProperties.setProperty("Property", "Properties from File");
    }
    /**
     * Method to be tested.
     */
    @Test
    public void testSetPropertyAndFile() {
        assertTrue("Properties from file is unchanged",
                   ClientProperties.fileError == false);
        ClientProperties.setProperty("Property", "Properties from File");
    }
    /**
     * Method to be tested.
     */
    @Test
    public void testSetPropertyFile() {
        ClientProperties.setProperty("Property", "Properties from XML-file");
    }
    /**
     * Method to be tested.
     */
    @Test
    public void testFileOutputStream() throws IOException {
        FileOutputStream fin;
        fin = new FileOutputStream(Constants.TESTFILENAME);
        FileOutputStream fout = new FileOutputStream(Constants.TESTFILENAME);
        assertEquals("File from XML file is not identical to File from
            property file", Constants.TESTFILENAME, ClientProperties.getProperty("Filename from XML"));
        fout.write(new byte[1000]);
        fout.flush();
        fin.close();
        fout.close();
        String propertyFile = ClientProperties.getProperty("Filename from XML");
        assertEquals("File from XML file is not identical to Filename from Property file",
                     ClientProperties.getProperty("Filename from XML"),
                     propertyFile);
    }
}
