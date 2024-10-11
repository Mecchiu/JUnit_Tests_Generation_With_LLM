// FTPClient_4Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#storeUnique(String)} method.
*/
class FTPClient_4Test {
		/**
		 * Test new ftp client. Use '/' here for directory separator.
		 *
		 * @throws IOException an I/O error occurs
		 */
	@Test
	void testNew() throws IOException {
		// Create a new FTPClient
		FTPClient ftpClient = new FTPClient();

		// Try to store a file in the same directory
		ftpClient.storeUnique("test/test");

		// Trying to store a file in a directory in another one
		// should error
		ftpClient.storeUnique(".");

		// Success
		assertEquals("/", ftpClient.getLocalFile("/").getParent());
	}
}