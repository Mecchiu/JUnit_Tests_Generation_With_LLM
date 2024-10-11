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
		 * Test storeUnique(String path).
		 * The expected result is {@link #EX_OK},
		 * which means the file was created.
		 *
		 * @throws MalformedURLException if any URL could not be built
		 * @throws IOException if any IO related problem occurs
		 */
		@Test
		void success() throws MalformedURLException, IOException {
			// Get an FTP client configured on this server and with passive mode.
			FTPClient client = new FTPClient();
			// Create a new file
			String path = "/home/me/test.txt";
			OutputStream out = client.storeUnique(path);
			// The file was created
			assertEquals(path, client.report());
			out.close();
		}

		/**
		* Test storeUnique(String path, String directory).
		* The expected result is {@link #EX_OK},
		* which means the directory's parent directory was created.
		* <em>Not</em> thread-safe.
		*
		* @throws MalformedURLException if any URL could not be built
		* @throws IOException if any IO related problem occurs
		*/
		@Test
		void successToParentDir() throws MalformedURLException, IOException {
			// Get an FTP client configured on this server and with passive mode.
			FTPClient client = new FTPClient();
			// Create a new file
			String path = "/home/me/test.txt";
			String directory = path;
			if (!path.endsWith("/"))
				directory += "/";
			OutputStream out = client.storeUnique(directory);
			// The directory's parent directory was created
			assertEquals(directory, client.report());
			// No more data to send
			assertEquals(EX_OK, client.report());
			out.close();
		}

}
