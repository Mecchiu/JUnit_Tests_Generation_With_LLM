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
		 * Runs all unit tests
		 */
		@Test
        void testExecuteSingleFileDelete() throws Exception {
			if (! isUnix()) {
				// Windows
                exceptionMessage = "Can't execute FTP command on Windows";
				return;
			}
            if (isMac()) {
                exceptionMessage = "Can't execute FTP command on Mac OSX/X.Y";
				return;
            }

			String fileName = "/foo_1.txt";
			/* File name cannot contain '/' */
			String pathname = System.getProperty("file.separator") + "/" + fileName;
			/* Delete file does not return error code */
			assertTrue("No error occured", deleteFile(pathname));
			assertTrue("Empty response code", deleteFile(pathname + "_1"));
			assertTrue("Empty response code", deleteFile(pathname + "_1_1"));
			assertEquals("Empty response code", deleteFile(pathname + "_1_1_1"));
			/* Delete empty pathname as folder does not exist / is not empty */
			assertTrue("Empty response code", deleteFile("/"));
			assertTrue("Empty response code", deleteFile(null));
			/* Delete folder cannot exist as empty pathname */
			assertFalse("Empty response code", deleteFile("/foo_2"));
        }
		
	/**
	* Checks if all the methods return correct strings.
	*
	* @return true if all methods of {@link FTPClient} return correct strings
	*/
	public boolean isUnix() {
		return (FTPClient.isMac() == false);
	}
	
	/**
	* Checks if all the methods return correct messages.
	*/
	public boolean exceptionTest() {
		return exceptionMessage.length() == 0;
	}

	/**
	 * Checks if is Mac OS X.
	 *
	 * @return true if is Mac, false otherwise
	 */
	public boolean isMac() {
		return FTPClient.isMac;
	}

	/**
	 * Checks if is Unix.
	 *
	 * @return true if is Unix, false otherwise
	 */
	public boolean isUnix() {
		return FTPClient.isUnix;
	}

	public static void main(String args[]) throws Throwable {
        FTPClient_6Test test = new FTPClient_6Test();
        test.testExecuteOneFileDelete();
        test.testExecuteTwoFilesDelete();
        test.testExceptionTest();
        System.exit(0);
    }
}