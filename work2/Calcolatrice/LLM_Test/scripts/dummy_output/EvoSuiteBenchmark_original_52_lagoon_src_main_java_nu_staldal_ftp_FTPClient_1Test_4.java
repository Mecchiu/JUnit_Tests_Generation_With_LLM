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
		FTPLocal local;
		String hostname;
		
		/**
		 * Constructor FTPClient_1Test
		 * @param hostname the hostname of the FTP server
		 */
		public FTPClient_1Test(String hostname) {
			this.hostname = hostname;
			String path = "/tmp/" + hostname;
			local = new FTPLocal(new BufferedWriter(new FileWriter(new File(path) )));
		}

		/**
		 * Test store() of a file.
		 *
		 * @throws IOException if any other IO error occurs
		 * @throws FTPException on any FTP protocol error
		 * @see #store(String, boolean)
		 */
		@Test // all methods should throw exception if any of those methods throws it.
		public void testStoreAll() throws IOException, FTPException {
			local.store("testFile.txt", true);
		}
		
		/**
		 * Test store() of a folder.
		 *
		 * @throws IOException if any other IO error occurs
		 * @throws FTPException on any FTP protocol error
		 * @see #store(String, boolean)
		 */
		@Test // all methods should throw exception if any of those methods throws it.
		public void testStoreParent() throws IOException, FTPException {
			local.store("file1", true);
		}
		
		/**
		 * Test storefile() of a file.
		 *
		 * @throws IOException if any other IO error occurs
		 * @throws FTPException on any FTP protocol error
		 * @see #store("testFile.txt", true)
		 */
		@Test // all methods should throw exception if any of those methods throws it.
		public void testStoreFile() throws IOException, FTPException {
			local.storeFile("file1.txt", true);
		}
		
		/**
		 * Test the put() of a folder.
		 *
		 * @throws IOException if any other IO error occurs
		 * @throws FTPException on any FTP protocol error
		 * @see #storeParent()
		 */
		@Test // all methods should throw exception if any of those methods throws it.
		public void testPutParent() throws IOException, FTPException {
			local.storeFile("file1.txt.gz", true);
		}
		
		/**
		 * Test the put() of a file.
		 *
		 * @throws IOException if any other IO error occurs
		 * @throws FTPException on any FTP protocol error
		 * @see #storeParent()
		 */
		@Test // all methods should throw exception if any of those methods throws it.
		public void testPutFile() throws IOException, FTPException {
			local.storeFile("file1.txt", true);
		}
		
		/**
		 * Test the get() of a folder.
		 *
		 * @throws IOException if any other IO error occurs
		 * @throws FTPException on any FTP protocol error
		 * @see #store("testFile.txt", true)
		 */
		@Test // all methods should throw exception if any of those methods throws it.
		public void testGetParent() throws IOException, FTPException {
			File file = new File("/tmp/file1.txt");
			local.storeFile("/tmp/file1.txt.gz", true);
			local.store("/tmp/file1.txt", true);
			
			//
			// we should get the root dir.
			//
			assertEquals("/tmp", local.getFtpRootDir());
			String root = null;
			String rooturl = null;
			
			//
			// we should get the url.
			//
			assertEquals(new URL("ftp://" + hostname + "/tmp"), local.getFtpUrl().toURL());
			root = local.getFtpRootDir();
			rooturl = local.getFtpUrl().toString();
			
			assertEquals(new URL("ftp://" + hostname + "/tmp/file1.txt.gz"), rooturl);
			
			assertEquals("/tmp/file1.txt", local.getFile(file, "/tmp/file1.txt.gz"));
			assertEquals("/tmp/file1.txt.gz", local.getFile(file, "/tmp/file1.txt"));
			assertEquals("/tmp/file1.txt.gz", local.getFile(file, "/tmp/file1.txt"));
			
			//
			//
			assertEquals(null, local.getFile(null, "/tmp/file1.txt"));
			assertEquals(null, local.getFile(null, "/tmp/file1.txt"));
			assertEquals(null, local.getFile(null, "/tmp/file1.txt"));
		}
		
}