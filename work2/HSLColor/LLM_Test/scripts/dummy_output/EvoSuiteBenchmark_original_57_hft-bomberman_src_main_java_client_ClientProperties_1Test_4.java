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
		/**
* Tests if the file is copied to given destination.
*
* @throws IOException
*             - If any IOException
*/
    @Test
    public void fileCopyTest() throws IOException {

        File src = new File("src/test/resources/common/client/ClientProperties.properties");
        File destFile = new File("dest/test.properties");


        ClientProperties.fileCopy(src.toURI().toURL().toURL().openStream(), destFile);

        File xmlFile = new File("src/test/resources/common/client/ServerProperties.xml");
        //String xmlFile = "src/test/resources/unittest/ServerProperties-2.xml";
        if (xmlFile.exists()) {
        xmlFile.delete();
        } else {
        xmlFile.deleteOnExit();
        }

        String srcPath = src.getAbsolutePath();
        InputStream is = clientProperties.class.getResourceAsStream("client/ServerProperties.xml");

        if (is == null) {
            xmlFile = new File("src/test/resources/unittest/ServerProperties-2.xml");
            if (xmlFile.exists()) {
            xmlFile.delete();
            } else {
            xmlFile.deleteOnExit();
            }
        }

        if (xmlFile.exists()) {
        XmlFunctions xmlFunctions = new XmlFunctions();
        String srcXml = xmlFunctions.getXml();
        assertNotNull("srcXml should not be null.", srcXml);

        //StringBuilder builder = new StringBuilder();
        XmlFunctions.XmlNode srcRoot = xmlFunctions.toRootXmlNode();
        int count = srcRoot.getNumberOfChildren();

        for (int idx = 0; idx < count; ++idx) {
                String srcChild = srcRoot.getChildAt(idx).getChildType();
                logger.info(srcChild);
                if (srcChild.equalsIgnoreCase("server_properties")) {
                        File src_dest = new File(destFile.getAbsolutePath());
                }
            }
        }
        if (xmlFile.exists()) {
            FileOutputStream fos = new FileOutputStream(xmlFile);
        } else {
            xmlFile.delete();
        }
        }
}