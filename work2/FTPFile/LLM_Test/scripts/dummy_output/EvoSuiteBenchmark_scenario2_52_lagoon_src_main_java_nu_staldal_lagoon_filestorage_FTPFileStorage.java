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
	* @throws IOException
	*/
	@Test
	void testCreateFile1() throws IOException {
		FTPFileStorage fileStorage = new FTPFileStorage();
		fileStorage.setUrl("ftp://localhost/");
		fileStorage.setPassword("password");
		OutputHandler outputHandler = fileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case 2 for {@link FTPFileStorage#createFile(String)}
	* @throws IOException
	*/
	@Test
	void testCreateFile2() throws IOException {
		FTPFileStorage fileStorage = new FTPFileStorage();
		fileStorage.setUrl("ftp://localhost/");
		fileStorage.setPassword("password");
		OutputHandler outputHandler = fileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case 3 for {@link FTPFileStorage#createFile(String)}
	* @throws IOException
	*/
	@Test
	void testCreateFile3() throws IOException {
		FTPFileStorage fileStorage = new FTPFileStorage();
		fileStorage.setUrl("ftp://localhost/");
		fileStorage.setPassword("password");
		OutputHandler outputHandler = fileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case 4 for {@link FTPFileStorage#createFile(String)}
	* @throws IOException
	*/
	@Test
	void testCreateFile4() throws IOException {
		FTPFileStorage fileStorage = new FTPFileStorage();
		fileStorage.setUrl("ftp://localhost/");
		fileStorage.setPassword("password");
		OutputHandler outputHandler = fileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case 5 for {@link FTPFileStorage#createFile(String)}
	* @throws IOException
	*/
	@Test
	void testCreateFile5() throws IOException {
		FTPFileStorage fileStorage = new FTPFileStorage();
		fileStorage.setUrl("ftp://localhost/");
		fileStorage.setPassword("password");
		OutputHandler outputHandler = fileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case 6 for {@link FTPFileStorage#createFile(String)}
	* @throws IOException
	*/
	@Test
	void testCreateFile6() throws IOException {
		FTPFileStorage fileStorage = new FTPFileStorage();
		fileStorage.setUrl("ftp://localhost/");
		fileStorage.setPassword("password");
		OutputHandler outputHandler = fileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case 7 for {@link FTPFileStorage#createFile(String)}
	* @throws IOException
	*/
	@Test
	void testCreateFile7() throws IOException {
		FTPFileStorage fileStorage = new FTPFileStorage();
		fileStorage.setUrl("ftp://localhost/");
		fileStorage.setPassword("password");
		OutputHandler outputHandler = fileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case 8 for {@link FTPFileStorage#createFile(String)}
	* @throws IOException
	*/
	@Test
	void testCreateFile8() throws IOException {
		FTPFileStorage fileStorage = new FTPFileStorage();
		fileStorage.setUrl("ftp://localhost/");
		fileStorage.setPassword("password");
		OutputHandler outputHandler = fileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case 9 for {@link FTPFileStorage#createFile(String)}
	* @throws IOException
	*/
	@Test
	void testCreateFile9() throws IOException {
		FTPFileStorage fileStorage = new FTPFileStorage();
		fileStorage.setUrl("ftp://localhost/");
		fileStorage.setPassword("password");
		OutputHandler outputHandler = fileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case 10 for {@link FTPFileStorage#createFile(String)}
	* @throws IOException
	*/
	@Test
	void testCreateFile10() throws IOException {
		FTPFileStorage fileStorage = new FTPFileStorage();
		fileStorage.setUrl("ftp://localhost/");
		fileStorage.setPassword("password");
		OutputHandler outputHandler = fileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
}