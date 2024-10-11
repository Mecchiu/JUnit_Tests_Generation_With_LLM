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
public ClientProperties_0Test() {
		}

        @Test
        public final void testGetProperty_null_value() {
            assertEquals("", (String) ClientProperties.getProperty(null).getValue());
        }

        @Test
        public final void testGetProperty_file_name() {
            String file = new File("").getCanonicalPath();
            assertEquals("CNAME", ClientProperties.getProperty(File.class, file).getValue());
        }

        @Test
        public final void testGetProperty_file_name_file() throws Exception {
           try {
                final File file = new File("");
                final XmlFunctions XML = new XmlFunctions();
                final Constants CNAME = XML.createCustomConstants();

                assertEquals("Value CNAME", XML.createCustomConstants().getValue(File.class, file.getCanonicalPath()));

            } catch (Exception e) {
                fail(e.getMessage());
            }
        }

        @Test
        public final void testGetProperty_file_name_file_failed() {
            File fileToSet = new File("").getCanonicalFile();
            try {
                ClientProperties.getProperty(File.class, "CNAME", fileToSet);
            } catch (Exception e) {
                fail(e.getMessage());
            }
        }

        @Test
        public final void testWritePropertyFile() {
            ClientProperties clientProperties = new ClientProperties();
            assertTrue("Properties were saved to folder", clientProperties.getPropertiesFilename().exists());

            File userFile = new File("userProperties");
            ClientProperties.CheckPropertiesFile(userFile);

            clientProperties.setProperty("FARLS", "");
            clientProperties.setProperty("USER", "");
            clientProperties.writePropertyFile();

            String userProperties = new String((File) UserManager.getUserProperties().clone());

            assertEquals("User name is different from original values", "", userProperties.substring(0, userProperties.indexOf("USER")));
            assertEquals("Properties file was not saved to user directory", userFile, clientProperties.getPropertiesFilename());
        }
}