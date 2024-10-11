// FTPFileStorage_1Test.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import java.net.*;
import nu.staldal.lagoon.core.*;
import nu.staldal.ftp.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFileStorage}.
* It contains ten unit test cases for the {@link FTPFileStorage#createFile(String)} method.
*/
class FTPFileStorage_1Test {

		/**
		* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testCreateFile_1() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fileStorage = new FTPFileStorage();
				fileStorage.open("ftp://localhost/", null, "password");
				OutputHandler outputHandler = fileStorage.createFile("testCreateFile_1");
				outputHandler.commit();
				fileStorage.close();
		}
		
		/**
		* Test case 2 for method {@link FTPFileStorage#createFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testCreateFile_2() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fileStorage = new FTPFileStorage();
				fileStorage.open("ftp://localhost/", null, "password");
				OutputHandler outputHandler = fileStorage.createFile("testCreateFile_2");
				outputHandler.commit();
				fileStorage.close();
		}
		
		/**
		* Test case 3 for method {@link FTPFileStorage#createFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testCreateFile_3() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fileStorage = new FTPFileStorage();
				fileStorage.open("ftp://localhost/", null, "password");
				OutputHandler outputHandler = fileStorage.createFile("testCreateFile_3");
				outputHandler.commit();
				fileStorage.close();
		}
		
		/**
		* Test case 4 for method {@link FTPFileStorage#createFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testCreateFile_4() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fileStorage = new FTPFileStorage();
				fileStorage.open("ftp://localhost/", null, "password");
				OutputHandler outputHandler = fileStorage.createFile("testCreateFile_4");
				outputHandler.commit();
				fileStorage.close();
		}
		
		/**
		* Test case 5 for method {@link FTPFileStorage#createFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testCreateFile_5() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fileStorage = new FTPFileStorage();
				fileStorage.open("ftp://localhost/", null, "password");
				OutputHandler outputHandler = fileStorage.createFile("testCreateFile_5");
				outputHandler.commit();
				fileStorage.close();
		}
		
		/**
		* Test case 6 for method {@link FTPFileStorage#createFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testCreateFile_6() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fileStorage = new FTPFileStorage();
				fileStorage.open("ftp://localhost/", null, "password");
				OutputHandler outputHandler = fileStorage.createFile("testCreateFile_6");
				outputHandler.commit();
				fileStorage.close();
		}
		
		/**
		* Test case 7 for method {@link FTPFileStorage#createFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testCreateFile_7() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fileStorage = new FTPFileStorage();
				fileStorage.open("ftp://localhost/", null, "password");
				OutputHandler outputHandler = fileStorage.createFile("testCreateFile_7");
				outputHandler.commit();
				fileStorage.close();
		}
		
		/**
		* Test case 8 for method {@link FTPFileStorage#createFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testCreateFile_8() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fileStorage = new FTPFileStorage();
				fileStorage.open("ftp://localhost/", null, "password");
				OutputHandler outputHandler = fileStorage.createFile("testCreateFile_8");
				outputHandler.commit();
				fileStorage.close();
		}
		
		/**
		* Test case 9 for method {@link FTPFileStorage#createFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testCreateFile_9() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fileStorage = new FTPFileStorage();
				fileStorage.open("ftp://localhost/", null, "password");
				OutputHandler outputHandler = fileStorage.createFile("testCreateFile_9");
				outputHandler.commit();
				fileStorage.close();
		}
		
		/**
		* Test case 10 for method {@link FTPFileStorage#createFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testCreateFile_10() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTP