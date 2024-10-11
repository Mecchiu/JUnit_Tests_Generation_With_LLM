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
	 * This method is executed on test-case creation
	 *
	 * @throws IOException -
	 *             if file could not be read
	*/
	@Test
    public void test() throws IOException {

		logger.info("Testing fileCopy in client-properties.java");

        if (Constants.Test_Success) {
            fileCopy(new File("src/test/resources/src/client/ClientProperties_1Test/clientProperties-test.properties").toFile(), new File("src/test/resources/src/test/resources/src/ClientProperties_1Test/clientProperties_1Test_test.properties"));
        } else {
            logger.warn("ERROR - Test was skipped because failed test case creation");
        }
	}
}