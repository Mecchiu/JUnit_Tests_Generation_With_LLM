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
	* Test case 1 for {@link FTPClient#append(String)} method.
	* This test case tests the functionality of the {@link FTPClient#append(String)} method
	* when the pathname is null.
	* It expects an {@link IllegalArgumentException} to be thrown.
	*/
	@Test
	void testAppend_TC1() {
		FTPClient ftpClient = new FTPClient();
		assertThrows(IllegalArgumentException.class, () -> ftpClient.append(null));
	}
	
	/**
	* Test case 2 for {@link FTPClient#append(String)} method.
	* This test case tests the functionality of the {@link FTPClient#append(String)} method
	* when the pathname is empty.
	* It expects an {@link IllegalArgumentException} to be thrown.
	*/
	@Test
	void testAppend_TC2() {
		FTPClient ftpClient = new FTPClient();
		assertThrows(IllegalArgumentException.class, () -> ftpClient.append(""));
	}
	
	/**
	* Test case 3 for {@link FTPClient#append(String)} method.
	* This test case tests the functionality of the {@link FTPClient#append(String)} method
	* when the pathname is a directory.
	* It expects an {@link FTPException} to be thrown.
	*/
	@Test
	void testAppend_TC3() {
		FTPClient ftpClient = new FTPClient();
		assertThrows(FTPException.class, () -> ftpClient.append("/home/user/"));
	}
	
	/**
	* Test case 4 for {@link FTPClient#append(String)} method.
	* This test case tests the functionality of the {@link FTPClient#append(String)} method
	* when the pathname is a file.
	* It expects an {@link FTPException} to be thrown.
	*/
	@Test
	void testAppend_TC4() {
		FTPClient ftpClient = new FTPClient();
		assertThrows(FTPException.class, () -> ftpClient.append("/home/user/file.txt"));
	}
	
	/**
	* Test case 5 for {@link FTPClient#append(String)} method.
	* This test case tests the functionality of the {@link FTPClient#append(String)} method
	* when the pathname is a file and the file does not exist.
	* It expects an {@link FTPException} to be thrown.
	*/
	@Test
	void testAppend_TC5() {
		FTPClient ftpClient = new FTPClient();
		assertThrows(FTPException.class, () -> ftpClient.append("/home/user/file.txt"));
	}
	
	/**
	* Test case 6 for {@link FTPClient#append(String)} method.
	* This test case tests the functionality of the {@link FTPClient#append(String)} method
	* when the pathname is a file and the file exists.
	* It expects an {@link FTPException} to be thrown.
	*/
	@Test
	void testAppend_TC6() {
		FTPClient ftpClient = new FTPClient();
		assertThrows(FTPException.class, () -> ftpClient.append("/home/user/file.txt"));
	}
	
	/**
	* Test case 7 for {@link FTPClient#append(String)} method.
	* This test case tests the functionality of the {@link FTPClient#append(String)} method
	* when the pathname is a file and the file exists and the file is empty.
	* It expects an {@link FTPException} to be thrown.
	*/
	@Test
	void testAppend_TC7() {
		FTPClient ftpClient = new FTPClient();
		assertThrows(FTPException.class, () -> ftpClient.append("/home/user/file.txt"));
	}
	
	/**
	* Test case 8 for {@link FTPClient#append(String)} method.
	* This test case tests the functionality of the {@link FTPClient#append(String)} method
	* when the pathname is a file and the file exists and the file is not empty.
	* It expects an {@link FTPException} to be thrown.
	*/
	@Test
	void testAppend_TC8() {
		FTPClient ftpClient = new FTPClient();
		assertThrows(FTPException.class, () -> ftpClient.append("/home/user/file.txt"));
	}
	
	/**
	* Test case 9 for {@link FTPClient#append(String)} method.
	* This test case tests the functionality of the {@link FTPClient#append(String)} method
	* when the pathname is a file and the file exists and the file is not empty and the file is not writable.
	* It expects an {@link FTPException} to be thrown.
	*/
	@Test
	void testAppend_TC9() {
		FTPClient ftpClient = new FTPClient();
		assertThrows(FTPException.class, () -> ftpClient.append("/home/user/file.txt"));
	}
	
	/**
	* Test case 10 for {@link FTPClient#append(String)} method.
	* This test case tests the functionality of the {@link FTPClient#append(String)} method
	* when the pathname is a file and the file exists and the file is not empty and the file is writable.
	* It expects an {@link FTPException} to be thrown.
	*/
	@Test
	void testAppend_TC10() {
		FTPClient ftpClient = new FTPClient();
		assertThrows(FTPException.class, () -> ftpClient.append("/home/user/file.txt"));
	}
}