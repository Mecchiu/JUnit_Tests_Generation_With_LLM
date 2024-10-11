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
		 * Tests if value is retrieved correctly
		 */
	@Test
    public void testProperty() {
        System.out.println("TEST - 1: test of getProperty() method.");

        ClientProperties.ClientProperties c = null;
        c = ClientProperties.getClientProperties();
        // c has to exists, test for exception and flag fileError
        assertTrue(isTrue(ClientProperties.fileError));
		logger.info("result - 1 = " + c.getProperty("fileError"));
		assertEquals(c.getProperty("fileError"), "[N/A]");
		System.out.println("TEST - 2: test of getProperty() method.");
    }

        /**
         * Tests if value is retrieved correctly.
         */
    @Test
	public void testProperty(){
        System.out.println("TEST - 1: test of getProperty() method.");

        ClientProperties.ClientProperties c = ClientProperties.getClientProperties();
        // c has to exists, test for exception and flag fileError
        assertTrue(isTrue(ClientProperties.fileError));
        logger.info("result - 2 = " + c.getProperty("fileError"));
        assertEquals(c.getProperty("fileError"), "[N/A]");
        System.out.println("TEST - 3: test of getProperty() method.");
	}

}