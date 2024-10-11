// FTPClientTest.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#deleteFile(String)} method.
*/
class FTPClientTest {

		/**
		* Test case 1 for {@link FTPClient#deleteFile(String)}
		*
		* @throws FTPException if any FTP protocol error occurs
		* @throws IOException if any other IO error occurs
		*/
		@Test
		void testDeleteFile1() throws FTPException, IOException {
				FTPClient ftp = new FTPClient();
				ftp.connect("localhost");
				ftp.login("anonymous", "anonymous");
				assertTrue(ftp.deleteFile("/pub/test.txt"));
				ftp.disconnect();
		}
		
		/**
		* Test case 2 for {@link FTPClient#deleteFile(String)}
		*
		* @throws FTPException if any FTP protocol error occurs
		* @throws IOException if any other IO error occurs
		*/
		@Test
		void testDeleteFile2() throws FTPException, IOException {
				FTPClient ftp = new FTPClient();
				ftp.connect("localhost");
				ftp.login("anonymous", "anonymous");
				assertFalse(ftp.deleteFile("/pub/test.txt"));
				ftp.disconnect();
		}
		
		/**
		* Test case 3 for {@link FTPClient#deleteFile(String)}
		*
		* @throws FTPException if any FTP protocol error occurs
		* @throws IOException if any other IO error occurs
		*/
		@Test
		void testDeleteFile3() throws FTPException, IOException {
				FTPClient ftp = new FTPClient();
				ftp.connect("localhost");
				ftp.login("anonymous", "anonymous");
				assertTrue(ftp.deleteFile("/pub/test.txt"));
				ftp.disconnect();
		}
		
		/**
		* Test case 4 for {@link FTPClient#deleteFile(String)}
		*
		* @throws FTPException if any FTP protocol error occurs
		* @throws IOException if any other IO error occurs
		*/
		@Test
		void testDeleteFile4() throws FTPException, IOException {
				FTPClient ftp = new FTPClient();
				ftp.connect("localhost");
				ftp.login("anonymous", "anonymous");
				assertFalse(ftp.deleteFile("/pub/test.txt"));
				ftp.disconnect();
		}
		
		/**
		* Test case 5 for {@link FTPClient#deleteFile(String)}
		*
		* @throws FTPException if any FTP protocol error occurs
		* @throws IOException if any other IO error occurs
		*/
		@Test
		void testDeleteFile5() throws FTPException, IOException {
				FTPClient ftp = new FTPClient();
				ftp.connect("localhost");
				ftp.login("anonymous", "anonymous");
				assertTrue(ftp.deleteFile("/pub/test.txt"));
				ftp.disconnect();
		}
		
		/**
		* Test case 6 for {@link FTPClient#deleteFile(String)}
		*
		* @throws FTPException if any FTP protocol error occurs
		* @throws IOException if any other IO error occurs
		*/
		@Test
		void testDeleteFile6() throws FTPException, IOException {
				FTPClient ftp = new FTPClient();
				ftp.connect("localhost");
				ftp.login("anonymous", "anonymous");
				assertFalse(ftp.deleteFile("/pub/test.txt"));
				ftp.disconnect();
		}
		
		/**
		* Test case 7 for {@link FTPClient#deleteFile(String)}
		*
		* @throws FTPException if any FTP protocol error occurs
		* @throws IOException if any other IO error occurs
		*/
		@Test
		void testDeleteFile7() throws FTPException, IOException {
				FTPClient ftp = new FTPClient();
				ftp.connect("localhost");
				ftp.login("anonymous", "anonymous");
				assertTrue(ftp.deleteFile("/pub/test.txt"));
				ftp.disconnect();
		}
		
		/**
		* Test case 8 for {@link FTPClient#deleteFile(String)}
		*
		* @throws FTPException if any FTP protocol error occurs
		* @throws IOException if any other IO error occurs
		*/
		@Test
		void testDeleteFile8() throws FTPException, IOException {
				FTPClient ftp = new FTPClient();
				ftp.connect("localhost");
				ftp.login("anonymous", "anonymous");
				assertFalse(ftp.deleteFile("/pub/test.txt"));
				ftp.disconnect();
		}
		
		/**
		* Test case 9 for {@link FTPClient#deleteFile(String)}
		*
		* @throws FTPException if any FTP protocol error occurs
		* @throws IOException if any other IO error occurs
		*/
		@Test
		void testDeleteFile9() throws FTPException, IOException {
				FTPClient ftp = new FTPClient();
				ftp.connect("localhost");
				ftp.login("anonymous", "anonymous");
				assertTrue(ftp.deleteFile("/pub/test.txt"));
				ftp.disconnect();
		}
		
		/**
		* Test case 10 for {@link FTPClient#deleteFile(String)}
		*
		* @throws FTPException if any FTP protocol error occurs
		* @throws IOException if any other IO error occurs
		*/
		@Test
		void testDeleteFile10() throws FTPException, IOException {
				FTPClient ftp = new FTPClient();
				ftp.connect("localhost");
				ftp.login("anonymous", "anonymous");
				assertFalse(ftp.deleteFile("/pub/test.txt"));
				ftp.disconnect();
		}
}