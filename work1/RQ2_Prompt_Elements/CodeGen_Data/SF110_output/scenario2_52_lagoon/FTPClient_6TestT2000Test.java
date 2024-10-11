// FTPClient_6Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#deleteFile(String)} method.
*/
class FTPClient_6Test {
/**
		* Creates a new instance of this test case class.
		*
		* @param args the command line arguments
		*/
		public static void main(String[] args) {
			junit.textui.TestRunner.run(FTPClient_6Test.class);
		}
		
		// Test of deleteFile(String pathname)
		/**
		* Test of deleteFile(String pathname).
		* Test: deleteFile(String pathname) will return true.
		* Test: deleteFile(String pathname) should not delete pathname if it exists. 
		* Test: pathname must be specified and has to be a valid path.
		* Test: pathname must not be null.
		* Test: pathname is not absolute nor a valid pathname.
		* @throws java.io.IOException if an I/O error occurs
		* @throws java.net.MalformedURLException if a FTP error occurs
		* @throws java.io.FilenameInvalidException if a pathname was specified in the wrong format
		* @throws java.net.ConnectException if TCP connections were not established successfully
		* @throws java.net.SocketTimeoutException if a socket timeout occurred
		* @throws java.net.UnknownHostException if a host name was specified but can't be resolved
		* @throws java.io.FileNotFoundException if a valid pathname or file name was specified but can't be found
		*/
		@Test
		void testDeleteFile() throws java.io.IOException, java.net.MalformedURLException,
				MalformedURLException,  java.net.ConnectException,
				SocketTimeoutException, UnknownHostException,
				FileNotFoundException {
			int file;
			
			// Test of deleteFile(String pathname)
			String path = "";
			// path must be specified
			try {
				if (path.charAt(0)!= '/') path += '/';
   				// create a path
				int lastPos = 0;
				while (lastPos < path.length()) {
					int comp = file = path.lastIndexOf(path[lastPos]);
					if (comp!= -1) break;
					if (lastPos == 0) path = path.substring(0, lastPos);
					else lastPos = path.lastIndexOf('/', lastPos - 1);
					// if comp == 0, an initial char can't be followed by '/'
				}
				file++;
				if (comp!= -1) {
					try { deleteFile(path); } catch (FTPSessionException ee) {
						if (!ee.isError()) throw ee;
					}
				} else {
					path += pathname_;
					if (!deleteFile(path)) {
 						assertTrue(path + ": unable to delete or deleteDirectory: " + pathname_,
                                      false);
						// pathname must not be null.
					}
				}
				assertTrue("Delete of invalid path: " + path, deleteFile(path));
				assertTrue("Delete of invalid path: " + path, deleteDir(path));
				assertTrue("Delete of invalid path: " + path, deleteFile(path));
			} catch (FTPException e) {
				assertFalse(path + ": " + e.getMsg_(), true);
			}
		}
}
