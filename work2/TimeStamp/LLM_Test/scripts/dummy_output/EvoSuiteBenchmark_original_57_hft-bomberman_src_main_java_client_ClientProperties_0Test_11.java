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
		 * Unit constructor, reads and saves file from a file of the user
		 * directory and write to a file for the specified property-name
		 *
		*/
	 public ClientProperties_0Test() throws IOException {
	 }

 /**
 * Test method for the {@link ClientProperties#getProperty(String)} method.
* @throws IOException
 */
	 @Test
	 public void testGetProperties() throws IOException{
             logger.info("Test if the property is returning value from XML file");

           String property = "test";
           Object value = getProperty(property);
           String value1 = "test";

           assertTrue("Value did not return a value", value instanceof String);
           assertEquals("Value did not return a value", value1, value);
	 }

 /**
 * Test method for the {@link ClientProperties#getProperty(String)} method.
* @throws IOException
 */
	 @Test
	 public void testGetProperties_fileError() throws IOException{
             logger.info("Test if error occurs if File cannot be read");

           String property = "test";
           Object value = getProperty(property);
           try {
                   fileCopy(null, new File("user/my-test-1"));
           }
           catch (IOException ex) {
                   fileError = true;
           }
           assertFalse("Property was incorrectly read", fileError);
           assertTrue("Value did not return a value", value instanceof String);
           assertEquals("Value did not return a value", value1, value);

	 }

 /**
 * Test method for the {@link ClientProperties#getProperty(String)} method.
* @throws IOException
 */
	 @Test
	 public void testGetProperties_propertyError() throws IOException {
	     FileOutputStream fileOutputStream = null;
	     String property = "test";
          try {
	       assertNotNull("File must be initialized", property);
	       fileOutputStream = new FileOutputStream("user/my-test-1");
	       InputStream inputStream = ClientProperties.fileCopy(null,fileOutputStream);
	       fileOutputStream.close();

	       setProperty(property, null);
	     }
	     catch (IOException ex) {
	          assertTrue("Property did not exist", false);
	     }
          catch (IOException ex) {
	     }
	 }

    /**
     * Writes XML properties file containing properties (if it exists and is
     * properly specified for a client to be logged using XMLFileSystem.putProperty()
     * method) to the folder specified by userDirectory
     * @param userDirectory - folder where properties are saved
     * @param xmlFileName -
     *            xml file
     * @throws IOException
     */
    private void WriteProperties(File userDirectory, String xmlFileName)
            throws IOException {
        String propertyStr;
      
        // Create folder
        FileUtils.mkdirs(new File(userDirectory, Constants.PERSONS_DIR));

        // Write XML file
        InputStream inputStream = ClientProperties.fileCopy(null, new FileOutputStream(xmlFileName));
        XmlFunctions xf = new XmlFunctions(inputStream);
        try {
            // Read Properties from XMLFile
            XmlFunctions xf2 = new XmlFunctions(inputStream);
            propertyStr = xf.getXMLProperties();
        }
        finally {
            inputStream.close();
        }
        PropertyPropertiesWriter writer = new PropertyPropertiesWriter(propertyStr);
        Writer writer2 = xmlFunctions.getXmlWriter();
       
        WriterPropertyElement writerPropertyElement = writer2.write(writer,"<PropertiesFile>");
        writer2.startChild(writerPropertyElement,"persons");
        String xmlPersons = xf.getXMLPersons();
        writer2.startChild("Persons");
        String xmlPersons2 = writer.writeProperties();
        writer2.endChild();
        writer2.endChild();


        // Log the properties in XMLFile
        String xmlFileStr = XmlFunctions.setProperty(propertyStr,
                xmlPersons,userDirectory);

        FileUtils.writeFile(new File(userDirectory,xmlFileName),xmlFileStr);
     }

        /**
         * @return boolean - returns true if everything's fine, and false otherwise
         */
        private boolean FileExists(File folder, String fileName) {
            boolean value = false;
            File file = new File(folder, fileName);
            if (file.exists() == true) {
                value = true;
            }
            return value;
        }

        /**
         * Test method for {@link Constants#FILE_EXT} with a value of class
         * {@link File} and {@link Constants#FILE_EXT} of
         * {@link Constants#XML}.
         * throws {@link IllegalArgumentException} otherwise.
         * @throws IOException
         */
        @Test
        public void testFileExt_File() throws IOException {
            File directory = new File("user/properties");
            boolean fileFolder = true;

            if (fileFolder == true) {
                // Create folder
                FileUtils.mkdirs(directory);
            }

}
}