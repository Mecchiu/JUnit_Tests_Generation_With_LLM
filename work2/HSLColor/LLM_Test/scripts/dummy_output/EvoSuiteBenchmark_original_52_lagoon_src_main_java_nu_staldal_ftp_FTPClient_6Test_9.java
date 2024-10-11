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
		* Test method deleteFile
		*
		* @param filepath path to the file
		* @return true if successful, false otherwise
		* @throws IOException if any other IO error occurs
		* @throws FTPException if any FTP protocol error occurs
		*/
		@Test
		boolean deleteFile(String filepath) throws IOException, FTPException;
}