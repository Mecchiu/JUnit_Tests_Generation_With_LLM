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
		 * read properties from file and save them to xml-file
		 *
		 * @throws IOException
		 */
	@Test
	public void getProperty_0(){
		String name="";
		String value="";
		InputStream stream=null;
		File fileName = new File(Constants.DEFAULT_PROPERTIES_FILE);
        try {
        	stream = new FileInputStream(fileName);
			XmlFunctions xmlFunctions = new XmlFunctions(stream);
            // check that file exists
            CheckPropertiesFile(fileName);

            // get file-element for client-properties.xml
            name = xmlFunctions.getElement(Constants.CLIENT_PROPERTIES);

            try{
            	value = xmlFunctions.getElement(name);

            } catch (Exception e) {
            	assertFalse("" + e, fileError);
            	return;
            }

            // error is thrown if file cant be written
            assertFalse("" + e, fileError);

        } catch (IOException e) {
			assertFalse("" + e, fileError);
			return;
		} finally {
			try {
				if(stream!= null)
					stream.close();
			} catch (IOException ioe) {
				assertTrue(ioe.getMessage().startsWith(""));
				logger.error("Problem while close I/O stream of properties file", ioe);
			}
		}
	}
}