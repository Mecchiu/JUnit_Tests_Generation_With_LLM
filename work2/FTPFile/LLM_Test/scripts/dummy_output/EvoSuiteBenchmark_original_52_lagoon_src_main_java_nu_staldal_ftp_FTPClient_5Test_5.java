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
		/**
		 * The expected output for {@link FTPClient#storeUnique(String, boolean)}.
		 */
		private static final String EXPECTED_OUTPUT = "";

		/**
		 * Create a new file with an unique name.
		 * Will create directories as nessesary.
		 *
		 * @param path path to the file, must end with '/' or be empty
		 * @param last close the FTPClient after transferring this file
		 * @return an OutputStream to write to, close() it when finished
		 * @throws FTPException if any FTP protocol error occurs
		 * @throws IOException if any other IO error occurs
		 */
		private OutputStream storeUnique(String path, boolean last) throws FTPException, IOException {
			assertNotNull(path);
			assertNotNull(last);
			OutputStream clientOutput = storeUnique(path, last, false);
			assertEquals("Stored data must be equal", EXPECTED_OUTPUT, new String(FileUtil.readFile(path).getBytes()));
			return clientOutput;
		}
		
		/**
		 * Test of storeUnique(String, boolean).
		 */
		@Test
		void testStoreUnique1() throws Exception {
			String s = "my-file-to-store";
			OutputStream clientOutput = storeUnique(s, false);
			assertNotNull(s);
			assertEquals("Expected file name \"my-file-to-store\" was given", "my-file-to-store", new String(FileUtil.readFile(s).getBytes()));
			File destDir = new File(s);
			assertFalse(destDir.exists());
			clientOutput.close();
			File destDir2 = new File(s);
			assertTrue(destDir2.exists());
			assertEquals(EXPECTED_OUTPUT, "", new String(FileUtil.readFile(s).getBytes()));
		}


		/**
		 * Test of storeUnique(String, boolean).
		 */
		@Test
		void testStoreUnique2() throws Exception {
			String s = "my-file-to-store";
			OutputStream clientOutput = storeUnique(s, true);
			assertNotNull(s);
			assertEquals("Expected file name \"my-file-to-store\" was given", "my-file-to-store", new String(FileUtil.readFile(s).getBytes()));
			File destDir = new File(s);
			assertFalse(destDir.exists());
			clientOutput.close();
			File destDir2 = new File(s);
			assertTrue(destDir2.exists());
			assertEquals(EXPECTED_OUTPUT, "", new String(FileUtil.readFile(s).getBytes()));
		}
	
}