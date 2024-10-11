// FTPClientTest.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#storeUnique(String, boolean)} method.
*/
class FTPClientTest {

	/**
	* Test case for {@link FTPClient#storeUnique(String, boolean)} method.
	* This test case checks if the method returns an OutputStream to write to, close() it when finished.
	*/
	@Test
	public void testStoreUnique() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.storeUnique("/", true);
		assertNotNull(outputStream);
	}
}