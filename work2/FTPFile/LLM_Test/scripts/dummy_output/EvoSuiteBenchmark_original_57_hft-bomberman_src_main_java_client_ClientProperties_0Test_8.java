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
	 * getProperty method is testing only for {@link ClientProperties} that
	 * does nothing if the file is not found
	 *
	 * @verifies return empty string if fileError is set
     * @see ClientProperties#getProperty(String)
	 */
	@Test
	public void getProperty_0_doesNothingIfFileFileIsNotFound() {
		int result = Constants.FILE_NOT_FOUND;
		assertEquals("return value", result, getProperty("notFoundClient.file.file"));
		assertTrue("return file is empty", getProperty("notFoundClient.file.file") == "");
		assertTrue("return file is empty", getProperty("notFoundClient.file.file") == "");
	}
}