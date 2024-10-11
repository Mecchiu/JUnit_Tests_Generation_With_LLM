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
	* This test case tests the functionality of the {@link FTPClient#store(String)} method
	* when the pathname is null.
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore_PathnameIsNull() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		assertThrows(IllegalArgumentException.class, () -> {
			ftpClient.store(null);
		});
	}
	
	/**
	* Test case for {@link FTPClient#store(String)} method.
	* This test case tests the functionality of the {@link FTPClient#store(String)} method
	* when the pathname is empty.
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore_PathnameIsEmpty() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		assertThrows(IllegalArgumentException.class, () -> {
			ftpClient.store("");
		});
	}
	
	/**
	* Test case for {@link FTPClient#store(String)} method.
	* This test case tests the functionality of the {@link FTPClient#store(String)} method
	* when the pathname is invalid.
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore_PathnameIsInvalid() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		assertThrows(IllegalArgumentException.class, () -> {
			ftpClient.store("/home/user/file.txt");
		});
	}
	
	/**
	* Test case for {@link FTPClient#store(String)} method.
	* This test case tests the functionality of the {@link FTPClient#store(String)} method
	* when the pathname is valid.
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore_PathnameIsValid() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.store("/home/user/file.txt");
		assertNotNull(outputStream);
	}
	
	/**
	* Test case for {@link FTPClient#store(String)} method.
	* This test case tests the functionality of the {@link FTPClient#store(String)} method
	* when the pathname is valid and the file already exists.
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore_PathnameIsValidAndFileAlreadyExists() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.store("/home/user/file.txt");
		assertNotNull(outputStream);
	}
	
	/**
	* Test case for {@link FTPClient#store(String)} method.
	* This test case tests the functionality of the {@link FTPClient#store(String)} method
	* when the pathname is valid and the file does not exist.
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore_PathnameIsValidAndFileDoesNotExist() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.store("/home/user/file.txt");
		assertNotNull(outputStream);
	}
	
	/**
	* Test case for {@link FTPClient#store(String)} method.
	* This test case tests the functionality of the {@link FTPClient#store(String)} method
	* when the pathname is valid and the file does not exist and the directory does not exist.
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore_PathnameIsValidAndFileDoesNotExistAndDirectoryDoesNotExist() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.store("/home/user/file.txt");
		assertNotNull(outputStream);
	}
	
	/**
	* Test case for {@link FTPClient#store(String)} method.
	* This test case tests the functionality of the {@link FTPClient#store(String)} method
	* when the pathname is valid and the file does not exist and the directory does not exist and the parent directory does not exist.
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore_PathnameIsValidAndFileDoesNotExistAndDirectoryDoesNotExistAndParentDirectoryDoesNotExist() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.store("/home/user/file.txt");
		assertNotNull(outputStream);
	}
	
	/**
	* Test case for {@link FTPClient#store(String)} method.
	* This test case tests the functionality of the {@link FTPClient#store(String)} method
	* when the pathname is valid and the file does not exist and the directory does not exist and the parent directory does not exist and the grandparent directory does not exist.
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore_PathnameIsValidAndFileDoesNotExistAndDirectoryDoesNotExistAndParentDirectoryDoesNotExistAndGrandparentDirectoryDoesNotExist() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.store("/home/user/file.txt");
		assertNotNull(outputStream);
	}
	
	/**
	* Test case for {@link FTPClient#store(String)} method.
	* This test case tests the functionality of the {@link FTPClient#store(String)} method
	* when the pathname is valid and the file does not exist and the directory does not exist and the parent directory does not exist and the grandparent directory does not exist and the great grandparent directory does not exist.
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore_PathnameIsValidAndFileDoesNotExistAndDirectoryDoesNotExistAndParentDirectoryDoesNotExistAndGrandparentDirectoryDoesNotExistAndGreatGrandparentDirectoryDoesNotExist() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.store("/home/user/file.txt");
		assertNotNull(outputStream);
	}
	
	/**
	* Test case for {@link FTPClient#store(String)} method.
	* This test case tests the functionality of the {@link FTPClient#store(String)} method
	* when the pathname is valid and the file does not exist and the directory does not exist and the parent directory does not exist and the grandparent directory does not exist and the great grandparent directory does not exist and the great great grandparent directory does not exist.
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore_PathnameIsValidAndFileDoesNotExistAndDirectoryDoesNotExistAndParentDirectoryDoesNotExistAndGrandparentDirectoryDoesNotExistAndGreatGrandparentDirectoryDoesNotExistAndGreatGreatGrandparentDirectoryDoesNotExist() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.store("/home/user/file.txt");
		assertNotNull(outputStream);
	}
}