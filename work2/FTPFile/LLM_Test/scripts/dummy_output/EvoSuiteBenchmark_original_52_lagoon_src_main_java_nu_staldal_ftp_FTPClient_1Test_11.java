// FTPClient_1Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#store(String, boolean)} method.
*/
class FTPClient_1Test {
		/**
		 * test store(pathname, last)
		 *
		 * @throws FTPClientException if any FTP protocol error occurs
		 * @throws IOException if any other IO error occurs
		*/
	@Test
	void testStore() throws FTPClientException, IOException {
        // FTPClient.getDefaultPort
        assertEquals(ftp_default, FTPClient.getDefaultPort());

        // FTPClient.getDefaultPort
        assertEquals(88, FTPClient.getDefaultPort());

        // FTPClient.getDefaultPort
        assertEquals(443, FTPClient.getDefaultPort());

		// FTPClient.getDefaultPort
		assertEquals(44100, FTPClient.getDefaultPort());

		// FTPClient.getDefaultPort
		assertEquals(257, FTPClient.getDefaultPort());

		// FTPClient.getDefaultPort
		assertEquals(65535, FTPClient.getDefaultPort());

		// FTPClient.getDefaultPort
		assertEquals(92100, FTPClient.getDefaultPort());


	}

	/**
	* test store(pathname)
	*
	* @throws FTPClientException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	void testStoreNullPathname() throws FTPClientException, IOException {
		// FTPClient.getDefaultPort
        assertEquals(ftp_default, FTPClient.getDefaultPort());

		// FTPClient.getDefaultPort
        assertEquals(88, FTPClient.getDefaultPort());

		// FTPClient.getDefaultPort
        assertEquals(443, FTPClient.getDefaultPort());

		// FTPClient.getDefaultPort
        assertEquals(257, FTPClient.getDefaultPort());

		// FTPClient.getDefaultPort
        assertEquals(65535, FTPClient.getDefaultPort());

		// FTPClient.getDefaultPort
        assertEquals(92100, FTPClient.getDefaultPort());

	}
}