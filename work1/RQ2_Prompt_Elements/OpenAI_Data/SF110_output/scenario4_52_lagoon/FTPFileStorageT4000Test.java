// FTPFileStorageTest.java
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
class FTPFileStorageTest {

	/**
	* Test case 1 for {@link FTPFileStorage#createFile(String)}
	*
	* @throws MalformedURLException
	* @throws UnknownHostException
	* @throws FTPException
	* @throws IOException
	* @throws AuthenticationException
	*/
	@Test
	void testCreateFile1() throws MalformedURLException, UnknownHostException, FTPException, IOException, AuthenticationException {
		FTPFileStorage ftpFileStorage = new FTPFileStorage();
		ftpFileStorage.open("ftp://localhost/", null, "password");
		OutputHandler outputHandler = ftpFileStorage.createFile("test.txt");
		outputHandler.commit();
		ftpFileStorage.close();
	}
	
	/**
	* Test case 2 for {@link FTPFileStorage#createFile(String)}
	*
	* @throws MalformedURLException
	* @throws UnknownHostException
	* @throws FTPException
	* @throws IOException
	* @throws AuthenticationException
	*/
	@Test
	void testCreateFile2() throws MalformedURLException, UnknownHostException, FTPException, IOException, AuthenticationException {
		FTPFileStorage ftpFileStorage = new FTPFileStorage();
		ftpFileStorage.open("ftp://localhost/", null, "password");
		OutputHandler outputHandler = ftpFileStorage.createFile("test.txt");
		outputHandler.commit();
		ftpFileStorage.close();
	}
	
	/**
	* Test case 3 for {@link FTPFileStorage#createFile(String)}
	*
	* @throws MalformedURLException
	* @throws UnknownHostException
	* @throws FTPException
	* @throws IOException
	* @throws AuthenticationException
	*/
	@Test
	void testCreateFile3() throws MalformedURLException, UnknownHostException, FTPException, IOException, AuthenticationException {
		FTPFileStorage ftpFileStorage = new FTPFileStorage();
		ftpFileStorage.open("ftp://localhost/", null, "password");
		OutputHandler outputHandler = ftpFileStorage.createFile("test.txt");
		outputHandler.commit();
		ftpFileStorage.close();
	}
	
	/**
	* Test case 4 for {@link FTPFileStorage#createFile(String)}
	*
	* @throws MalformedURLException
	* @throws UnknownHostException
	* @throws FTPException
	* @throws IOException
	* @throws AuthenticationException
	*/
	@Test
	void testCreateFile4() throws MalformedURLException, UnknownHostException, FTPException, IOException, AuthenticationException {
		FTPFileStorage ftpFileStorage = new FTPFileStorage();
		ftpFileStorage.open("ftp://localhost/", null, "password");
		OutputHandler outputHandler = ftpFileStorage.createFile("test.txt");
		outputHandler.commit();
		ftpFileStorage.close();
	}
	
	/**
	* Test case 5 for {@link FTPFileStorage#createFile(String)}
	*
	* @throws MalformedURLException
	* @throws UnknownHostException
	* @throws FTPException
	* @throws IOException
	* @throws AuthenticationException
	*/
	@Test
	void testCreateFile5() throws MalformedURLException, UnknownHostException, FTPException, IOException, AuthenticationException {
		FTPFileStorage ftpFileStorage = new FTPFileStorage();
		ftpFileStorage.open("ftp://localhost/", null, "password");
		OutputHandler outputHandler = ftpFileStorage.createFile("test.txt");
		outputHandler.commit();
		ftpFileStorage.close();
	}
	
	/**
	* Test case 6 for {@link FTPFileStorage#createFile(String)}
	*
	* @throws MalformedURLException
	* @throws UnknownHostException
	* @throws FTPException
	* @throws IOException
	* @throws AuthenticationException
	*/
	@Test
	void testCreateFile6() throws MalformedURLException, UnknownHostException, FTPException, IOException, AuthenticationException {
		FTPFileStorage ftpFileStorage = new FTPFileStorage();
		ftpFileStorage.open("ftp://localhost/", null, "password");
		OutputHandler outputHandler = ftpFileStorage.createFile("test.txt");
		outputHandler.commit();
		ftpFileStorage.close();
	}
	
	/**
	* Test case 7 for {@link FTPFileStorage#createFile(String)}
	*
	* @throws MalformedURLException
	* @throws UnknownHostException
	* @throws FTPException
	* @throws IOException
	* @throws AuthenticationException
	*/
	@Test
	void testCreateFile7() throws MalformedURLException, UnknownHostException, FTPException, IOException, AuthenticationException {
		FTPFileStorage ftpFileStorage = new FTPFileStorage();
		ftpFileStorage.open("ftp://localhost/", null, "password");
		OutputHandler outputHandler = ftpFileStorage.createFile("test.txt");
		outputHandler.commit();
		ftpFileStorage.close();
	}
	
	/**
	* Test case 8 for {@link FTPFileStorage#createFile(String)}
	*
	* @throws MalformedURLException
	* @throws UnknownHostException
	* @throws FTPException
	* @throws IOException
	* @throws AuthenticationException
	*/
	@Test
	void testCreateFile8() throws MalformedURLException, UnknownHostException, FTPException, IOException, AuthenticationException {
		FTPFileStorage ftpFileStorage = new FTPFileStorage();
		ftpFileStorage.open("ftp://localhost/", null, "password");
		OutputHandler outputHandler = ftpFileStorage.createFile("test.txt");
		outputHandler.commit();
		ftpFileStorage.close();
	}
	
	/**
	* Test case 9 for {@link FTPFileStorage#createFile(String)}
	*
	* @throws MalformedURLException
	* @throws UnknownHostException
	* @throws FTPException
	* @throws IOException
	* @throws AuthenticationException
	*/
	@Test
	void testCreateFile9() throws MalformedURLException, UnknownHostException, FTPException, IOException, AuthenticationException {
		FTPFileStorage ftpFileStorage = new FTPFileStorage();
		ftpFileStorage.open("ftp://localhost/", null, "password");
		OutputHandler outputHandler = ftpFileStorage.createFile("test.txt");
		outputHandler.commit();
		ftpFileStorage.close();
	}
	
	/**
	* Test case 10 for {@link FTPFileStorage#createFile(String)}
	*
	* @throws MalformedURLException
	* @throws UnknownHostException
	* @throws FTPException
	* @throws IOException
	* @throws AuthenticationException
	*/
	@Test
	void testCreateFile10() throws MalformedURLException, UnknownHostException, FTPException, IOException, AuthenticationException {
		FTPFileStorage ftpFileStorage = new FTPFileStorage();
		ftpFileStorage.open("ftp://localhost/", null, "password");
		OutputHandler outputHandler = ftpFileStorage.createFile("test.txt");
		outputHandler.commit();
		ftpFileStorage.close();
	}
}