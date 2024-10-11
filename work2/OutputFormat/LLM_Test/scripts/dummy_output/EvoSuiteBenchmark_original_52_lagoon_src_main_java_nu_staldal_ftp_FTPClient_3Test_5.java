// FTPClient_3Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#append(String, boolean)} method.
*/
class FTPClient_3Test {
		/**
		 * Test that the FTPClient object properly handles directory names.
		 */
		@Test
		void testFtpPathname() throws FTPException, java.io.IOException {
			FTPClient testClient = FTPClient_3Test.class.getResourceAsStream("/ftpClient.dat");
			assertNotNull(testClient);
		}
		/**
		 * Test that the FTPClient object properly handles paths to remote hosts.
		 */
		@Test
		void testFtpPath() throws FTPException, java.io.IOException {
			FTPClient testClient = FTPClient.append("/ftpClient.dat", true);
			assertInstanceOf(FTPClient.class, testClient);
		}
}