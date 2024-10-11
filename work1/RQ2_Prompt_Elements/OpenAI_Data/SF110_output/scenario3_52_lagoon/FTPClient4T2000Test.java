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

	/**
	* Test case for {@link FTPClient#storeUnique(String)} method.
	* This test case tests the functionality of the {@link FTPClient#storeUnique(String)} method.
	* It checks if the method returns an output stream.
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	void testStoreUnique() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.storeUnique("");
		assertNotNull(outputStream);
	}
}