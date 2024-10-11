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
	* Test case for the {@link FTPFileStorage#createFile(String)} method.
	* It tests the case when the file is created successfully.
	*/
	@Test
	public void testCreateFile_1() throws IOException {
		FTPFileStorage fileStorage = new FTPFileStorage();
		OutputHandler outputHandler = fileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case for the {@link FTPFileStorage#createFile(String)} method.
	* It tests the case when the file is not created successfully.
	*/
	@Test
	public void testCreateFile_2() throws IOException {
		FTPFileStorage fileStorage = new FTPFileStorage();
		OutputHandler outputHandler = fileStorage.createFile("test.txt");
		assertNull(outputHandler);
	}
	
	/**
	* Test case for the {@link FTPFileStorage#createFile(String)} method.
	* It tests the case when the file is created successfully.
	*/
	@Test
	public void testCreateFile_3() throws IOException {
		FTPFileStorage fileStorage = new FTPFileStorage();
		OutputHandler outputHandler = fileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case for the {@link FTPFileStorage#createFile(String)} method.
	* It tests the case when the file is not created successfully.
	*/
	@Test
	public void testCreateFile_4() throws IOException {
		FTPFileStorage fileStorage = new FTPFileStorage();
		OutputHandler outputHandler = fileStorage.createFile("test.txt");
		assertNull(outputHandler);
	}
	
	/**
	* Test case for the {@link FTPFileStorage#createFile(String)} method.
	* It tests the case when the file is created successfully.
	*/
	@Test
	public void testCreateFile_5() throws IOException {
		FTPFileStorage fileStorage = new FTPFileStorage();
		OutputHandler outputHandler = fileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case for the {@link FTPFileStorage#createFile(String)} method.
	* It tests the case when the file is not created successfully.
	*/
	@Test
	public void testCreateFile_6() throws IOException {
		FTPFileStorage fileStorage = new FTPFileStorage();
		OutputHandler outputHandler = fileStorage.createFile("test.txt");
		assertNull(outputHandler);
	}
	
	/**
	* Test case for the {@link FTPFileStorage#createFile(String)} method.
	* It tests the case when the file is created successfully.
	*/
	@Test
	public void testCreateFile_7() throws IOException {
		FTPFileStorage fileStorage = new FTPFileStorage();
		OutputHandler outputHandler = fileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case for the {@link FTPFileStorage#createFile(String)} method.
	* It tests the case when the file is not created successfully.
	*/
	@Test
	public void testCreateFile_8() throws IOException {
		FTPFileStorage fileStorage = new FTPFileStorage();
		OutputHandler outputHandler = fileStorage.createFile("test.txt");
		assertNull(outputHandler);
	}
	
	/**
	* Test case for the {@link FTPFileStorage#createFile(String)} method.
	* It tests the case when the file is created successfully.
	*/
	@Test
	public void testCreateFile_9() throws IOException {
		FTPFileStorage fileStorage = new FTPFileStorage();
		OutputHandler outputHandler = fileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case for the {@link FTPFileStorage#createFile(String)} method.
	* It tests the case when the file is not created successfully.
	*/
	@Test
	public void testCreateFile_10() throws IOException {
		FTPFileStorage fileStorage = new FTPFileStorage();
		OutputHandler outputHandler = fileStorage.createFile("test.txt");
		assertNull(outputHandler);
	}
}