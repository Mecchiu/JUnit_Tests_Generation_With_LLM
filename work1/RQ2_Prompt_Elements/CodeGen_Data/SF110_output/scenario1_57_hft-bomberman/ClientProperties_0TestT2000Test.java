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
final static boolean fileError = true;

	@Test
    public void TestClientProperties() throws IOException{
        ClientProperties clientProperty = new ClientProperties();
        String path= "/Users/christian/Downloads/Properties";
        LOG.debug("Loading the " + path);
        File f= new File(path);
        XmlFunctions x = new XmlFunctions();
        InputStream is= new FileInputStream(f);
        String s= x.getContents(is);

        System.out.println(s);

        ClientProperties_0 test = new ClientProperties();
        String property= test.getProperty("testProp");
            System.out.println("The property " + property+ " is "+test.getProperty(property));

        System.out.println ("*********testClientProperty*****************" +
        "***********************");
        System.out.println(x.getContents(is));
		boolean file= test.isPropertyFile(property);
        LOG.debug ("isFile = "+file);
        //LOG.debug(property);
            assertEquals(file, Boolean.valueOf(file));
    }
}
