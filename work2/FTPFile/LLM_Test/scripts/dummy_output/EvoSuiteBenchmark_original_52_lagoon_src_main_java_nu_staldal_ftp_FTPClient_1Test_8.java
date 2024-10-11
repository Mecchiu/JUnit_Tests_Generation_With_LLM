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
		void testStore() throws Exception;

		void testSave() throws Exception;

		/**
		* Create a new file using the FTPClient object.
		* @throws Exception if any FTP protocol error occurs
		*/
		void testNew() throws Exception;

		/**
		* Save the file using the FTPClient object.
		* @throws Exception if any FTP protocol error occurring
		* or if the save fails, since the save will fail.
		*/
		void testSave();

		/**
		* Load the file using the FTPClient object.
		* @throws Exception if any FTP protocol error occurred
		*/
		void testLoad();

		/**
		* Read the file (if it exists) using the FTPClient object.
		* @throws Exception if any FTP protocol error occurred
		* or if the read fails, since file does not exist.
		*/
		void testRead();

		/**
		 * Check the return value of the method.
		 */
		final void testResult();



}