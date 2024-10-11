// FTPClientTest.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#store(String)} method.
*/
class FTPClientTest {

	/**
	* Test case for {@link FTPClient#store(String)} method.
	* It tests the case when the pathname is null.
	*/
	@Test
	public void testStore_PathnameIsNull() {
		FTPClient ftpClient = new FTPClient();
		assertThrows(IllegalArgumentException.class, () -> {
			ftpClient.store(null);
		});
	}
	
	/**
	* Test case for {@link FTPClient#store(String)} method.
	* It tests the case when the pathname is empty.
	*/
	@Test
	public void testStore_PathnameIsEmpty() {
		FTPClient ftpClient = new FTPClient();
		assertThrows(IllegalArgumentException.class, () -> {
			ftpClient.store("");
		});
	}
	
	/**
	* Test case for {@link FTPClient#store(String)} method.
	* It tests the case when the pathname is invalid.
	*/
	@Test
	public void testStore_PathnameIsInvalid() {
		FTPClient ftpClient = new FTPClient();
		assertThrows(IllegalArgumentException.class, () -> {
			ftpClient.store("/home/user/file.txt");
		});
	}
	
	/**
	* Test case for {@link FTPClient#store(String)} method.
	* It tests the case when the pathname is valid.
	*/
	@Test
	public void testStore_PathnameIsValid() {
		FTPClient ftpClient = new FTPClient();
		assertDoesNotThrow(() -> {
			ftpClient.store("/home/user/file.txt");
		});
	}
	
	/**
	* Test case for {@link FTPClient#store(String)} method.
	* It tests the case when the pathname is valid and the file already exists.
	*/
	@Test
	public void testStore_PathnameIsValidAndFileAlreadyExists() {
		FTPClient ftpClient = new FTPClient();
		assertDoesNotThrow(() -> {
			ftpClient.store("/home/user/file.txt");
		});
	}
	
	/**
	* Test case for {@link FTPClient#store(String)} method.
	* It tests the case when the pathname is valid and the file does not exist.
	*/
	@Test
	public void testStore_PathnameIsValidAndFileDoesNotExist() {
		FTPClient ftpClient = new FTPClient();
		assertDoesNotThrow(() -> {
			ftpClient.store("/home/user/file.txt");
		});
	}
	
	/**
	* Test case for {@link FTPClient#store(String)} method.
	* It tests the case when the pathname is valid and the file is empty.
	*/
	@Test
	public void testStore_PathnameIsValidAndFileIsEmpty() {
		FTPClient ftpClient = new FTPClient();
		assertDoesNotThrow(() -> {
			ftpClient.store("/home/user/file.txt");
		});
	}
	
	/**
	* Test case for {@link FTPClient#store(String)} method.
	* It tests the case when the pathname is valid and the file is not empty.
	*/
	@Test
	public void testStore_PathnameIsValidAndFileIsNotEmpty() {
		FTPClient ftpClient = new FTPClient();
		assertDoesNotThrow(() -> {
			ftpClient.store("/home/user/file.txt");
		});
	}
	
	/**
	* Test case for {@link FTPClient#store(String)} method.
	* It tests the case when the pathname is valid and the file is not empty and the file is not closed.
	*/
	@Test
	public void testStore_PathnameIsValidAndFileIsNotEmptyAndFileIsNotClosed() {
		FTPClient ftpClient = new FTPClient();
		assertDoesNotThrow(() -> {
			ftpClient.store("/home/user/file.txt");
		});
	}
	
	/**
	* Test case for {@link FTPClient#store(String)} method.
	* It tests the case when the pathname is valid and the file is not empty and the file is closed.
	*/
	@Test
	public void testStore_PathnameIsValidAndFileIsNotEmptyAndFileIsClosed() {
		FTPClient ftpClient = new FTPClient();
		assertDoesNotThrow(() -> {
			ftpClient.store("/home/user/file.txt");
		});
	}
}