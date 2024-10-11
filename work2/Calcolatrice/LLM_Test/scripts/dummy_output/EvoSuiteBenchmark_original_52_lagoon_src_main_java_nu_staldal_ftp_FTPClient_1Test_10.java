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
	 * Create a new file, or overwrite an existing file.
	 * Will create directories as nessesary.
	 *<em>Not</em> thread-safe, i.e. you cannot start a new file while another one is in progress.
	 * @throws FTPException if any FTP protocol error occurs
	 * @throws IOException if any other IO error occurs
	 */
	@Test
	void store() throws IOException, FTPException {
		try(OutputStream out = new FileOutputStream("/tmp/server.xxx")) {
			assertTrue("failed to load expected file1", new FTPClient().store("/tmp/server.xxx", true));
			assertTrue("failed to load expected file2", new FTPClient().store("/tmp/server.xxx/file4", true));
			assertTrue("failed to load expected file3", new FTPClient().store("file4", false));
		}
	}
}