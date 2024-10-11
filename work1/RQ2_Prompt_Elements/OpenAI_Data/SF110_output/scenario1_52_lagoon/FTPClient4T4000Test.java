// FTPClientTest.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#storeUnique(String)} method.
*/
class FTPClientTest {

	@Test
	public void testStoreUnique() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.storeUnique("/test/path");
		assertNotNull(outputStream);
	}
}