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
		 * The name of the test data.
		 */
		private static final String name = "FTPRandomTest";

	/**
	 * Starts a file from the default name.  This method will throw an exception
	 * if the initial test has not been run before.
	 *
	 * The new file will always exist, but may be later renamed or deleted.
	 *
	 * @throws RuntimeException if the test does not pass
	 * @throws IOException if any other IO error occurs
	 */
	@Test
	public void storeUnique() throws IOException, RuntimeException {
		File f = new File(System.getProperty("user.dir"), "ftp.clientTFile");
		FTPClient.store(name, f, false);
	}
}