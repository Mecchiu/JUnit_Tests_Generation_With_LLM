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
	* Test case for {@link FTPClient#deleteFile(String)} method.
	* It tests the case when the file is deleted successfully.
	*/
	@Test
	public void testDeleteFileSuccess() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		boolean result = ftpClient.deleteFile("/home/user/file.txt");
		assertTrue(result);
	}
	
	/**
	* Test case for {@link FTPClient#deleteFile(String)} method.
	* It tests the case when the file is not deleted successfully.
	*/
	@Test
	public void testDeleteFileFailure() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		boolean result = ftpClient.deleteFile("/home/user/file.txt");
		assertFalse(result);
	}
	
	/**
	* Test case for {@link FTPClient#deleteFile(String)} method.
	* It tests the case when the file is deleted successfully.
	*/
	@Test
	public void testDeleteFileSuccess1() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		boolean result = ftpClient.deleteFile("/home/user/file.txt");
		assertTrue(result);
	}
	
	/**
	* Test case for {@link FTPClient#deleteFile(String)} method.
	* It tests the case when the file is not deleted successfully.
	*/
	@Test
	public void testDeleteFileFailure1() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		boolean result = ftpClient.deleteFile("/home/user/file.txt");
		assertFalse(result);
	}
	
	/**
	* Test case for {@link FTPClient#deleteFile(String)} method.
	* It tests the case when the file is deleted successfully.
	*/
	@Test
	public void testDeleteFileSuccess2() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		boolean result = ftpClient.deleteFile("/home/user/file.txt");
		assertTrue(result);
	}
	
	/**
	* Test case for {@link FTPClient#deleteFile(String)} method.
	* It tests the case when the file is not deleted successfully.
	*/
	@Test
	public void testDeleteFileFailure2() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		boolean result = ftpClient.deleteFile("/home/user/file.txt");
		assertFalse(result);
	}
	
	/**
	* Test case for {@link FTPClient#deleteFile(String)} method.
	* It tests the case when the file is deleted successfully.
	*/
	@Test
	public void testDeleteFileSuccess3() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		boolean result = ftpClient.deleteFile("/home/user/file.txt");
		assertTrue(result);
	}
	
	/**
	* Test case for {@link FTPClient#deleteFile(String)} method.
	* It tests the case when the file is not deleted successfully.
	*/
	@Test
	public void testDeleteFileFailure3() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		boolean result = ftpClient.deleteFile("/home/user/file.txt");
		assertFalse(result);
	}
	
	/**
	* Test case for {@link FTPClient#deleteFile(String)} method.
	* It tests the case when the file is deleted successfully.
	*/
	@Test
	public void testDeleteFileSuccess4() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		boolean result = ftpClient.deleteFile("/home/user/file.txt");
		assertTrue(result);
	}
	
	/**
	* Test case for {@link FTPClient#deleteFile(String)} method.
	* It tests the case when the file is not deleted successfully.
	*/
	@Test
	public void testDeleteFileFailure4() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		boolean result = ftpClient.deleteFile("/home/user/file.txt");
		assertFalse(result);
	}
	
	/**
	* Test case for {@link FTPClient#deleteFile(String)} method.
	* It tests the case when the file is deleted successfully.
	*/
	@Test
	public void testDeleteFileSuccess5() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		boolean result = ftpClient.deleteFile("/home/user/file.txt");
		assertTrue(result);
	}
	
	/**
	* Test case for {@link FTPClient#deleteFile(String)} method.
	* It tests the case when the file is not deleted successfully.
	*/
	@Test
	public void testDeleteFileFailure5() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		boolean result = ftpClient.deleteFile("/home/user/file.txt");
		assertFalse(result);
	}
}