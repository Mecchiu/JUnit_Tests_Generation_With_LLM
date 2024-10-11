// FTPClient_5Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#storeUnique(String, boolean)} method.
*/
class FTPClient_5Test {
		private File dir = new File("target");

		/**
		 * Tests the {@link FTPClient#storeUnique(String, boolean)} method.
		 * @throws Exception never throws this exception (the default)
		 */
		@Test
		void testStoreUnique() throws Exception {
			assertTrue(dir.mkdir());

			try (FileOutputStream out = new FileOutputStream(dir.getAbsolutePath() + File.separator + "pwd")) {
				assertTrue(out.flush());
			}

			try (OutputStream out = new FileOutputStream(dir.getAbsolutePath() + File.separator + "pwd")) {
				assertTrue(out.flush());
			}

			// check folder, not folder.
			assertTrue(dir.listFiles() == null);
			assertTrue(dir.listFiles().length == 0);
		}

		/**
		 * Tests the {@link FTPClient#storeUnique(String, boolean)} method with a File output stream.
		 * @throws Exception never throws this exception (the default)
		 */
		@Test
		void testStoreUniqueTestFileOutput() throws Exception {
			try (OutputStream out = new FileOutputStream(dir.getAbsolutePath() + File.separator + "pwd")) {
				assertTrue(out.flush());
			}

			FTPClient.storeUnique("/test_file", true);
		}
}