// FTPClientTest.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#append(String)} method.
*/
class FTPClientTest {

	/**
	* Test case for the {@link FTPClient#append(String)} method.
	* It tests the case when the pathname is null.
	*/
	@Test
	public void testAppend_PathnameIsNull() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.append(null);
			fail("Expected an IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("pathname cannot be null", e.getMessage());
		} catch (Exception e) {
			fail("Expected an IllegalArgumentException to be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#append(String)} method.
	* It tests the case when the pathname is empty.
	*/
	@Test
	public void testAppend_PathnameIsEmpty() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.append("");
			fail("Expected an IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("pathname cannot be empty", e.getMessage());
		} catch (Exception e) {
			fail("Expected an IllegalArgumentException to be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#append(String)} method.
	* It tests the case when the pathname is invalid.
	*/
	@Test
	public void testAppend_PathnameIsInvalid() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.append("/home/user/file.txt");
			fail("Expected an FTPException to be thrown");
		} catch (FTPException e) {
			assertEquals("Invalid pathname", e.getMessage());
		} catch (Exception e) {
			fail("Expected an FTPException to be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#append(String)} method.
	* It tests the case when the pathname is valid.
	*/
	@Test
	public void testAppend_PathnameIsValid() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.append("/home/user/file.txt");
			fail("Expected an FTPException to be thrown");
		} catch (FTPException e) {
			assertEquals("Invalid pathname", e.getMessage());
		} catch (Exception e) {
			fail("Expected an FTPException to be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#append(String)} method.
	* It tests the case when the pathname is valid and the file already exists.
	*/
	@Test
	public void testAppend_PathnameIsValidAndFileAlreadyExists() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.append("/home/user/file.txt");
			fail("Expected an FTPException to be thrown");
		} catch (FTPException e) {
			assertEquals("Invalid pathname", e.getMessage());
		} catch (Exception e) {
			fail("Expected an FTPException to be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#append(String)} method.
	* It tests the case when the pathname is valid and the file does not exist.
	*/
	@Test
	public void testAppend_PathnameIsValidAndFileDoesNotExist() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.append("/home/user/file.txt");
			fail("Expected an FTPException to be thrown");
		} catch (FTPException e) {
			assertEquals("Invalid pathname", e.getMessage());
		} catch (Exception e) {
			fail("Expected an FTPException to be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#append(String)} method.
	* It tests the case when the pathname is valid and the file does not exist and the directory does not exist.
	*/
	@Test
	public void testAppend_PathnameIsValidAndFileDoesNotExistAndDirectoryDoesNotExist() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.append("/home/user/file.txt");
			fail("Expected an FTPException to be thrown");
		} catch (FTPException e) {
			assertEquals("Invalid pathname", e.getMessage());
		} catch (Exception e) {
			fail("Expected an FTPException to be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#append(String)} method.
	* It tests the case when the pathname is valid and the file does not exist and the directory does not exist and the parent directory does not exist.
	*/
	@Test
	public void testAppend_PathnameIsValidAndFileDoesNotExistAndDirectoryDoesNotExistAndParentDirectoryDoesNotExist() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.append("/home/user/file.txt");
			fail("Expected an FTPException to be thrown");
		} catch (FTPException e) {
			assertEquals("Invalid pathname", e.getMessage());
		} catch (Exception e) {
			fail("Expected an FTPException to be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#append(String)} method.
	* It tests the case when the pathname is valid and the file does not exist and the directory does not exist and the parent directory does not exist and the grandparent directory does not exist.
	*/
	@Test
	public void testAppend_PathnameIsValidAndFileDoesNotExistAndDirectoryDoesNotExistAndParentDirectoryDoesNotExistAndGrandparentDirectoryDoesNotExist() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.append("/home/user/file.txt");
			fail("Expected an FTPException to be thrown");
		} catch (FTPException e) {
			assertEquals("Invalid pathname", e.getMessage());
		} catch (Exception e) {
			fail("Expected an FTPException to be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#append(String)} method.
	* It tests the case when the pathname is valid and the file does not exist and the directory does not exist and the parent directory does not exist and the grandparent directory does not exist and the great grandparent directory does not exist.
	*/
	@Test
	public void testAppend_PathnameIsValidAndFileDoesNotExistAndDirectoryDoesNotExistAndParentDirectoryDoesNotExistAndGrandparentDirectoryDoesNotExistAndGreatGrandparentDirectoryDoesNotExist() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.append("/home/user/file.txt");
			fail("Expected an FTPException to be thrown");
		} catch (FTPException e) {
			assertEquals("Invalid pathname", e.getMessage());
		} catch (Exception e) {
			fail("Expected an FTPException to be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#append(String)} method.
	* It tests the case when the pathname is valid and the file does not exist and the directory does not exist and the parent directory does not exist and the grandparent directory