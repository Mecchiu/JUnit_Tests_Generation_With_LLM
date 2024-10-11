// FTPClientTest.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#append(String, boolean)} method.
*/
class FTPClientTest {

	/**
	* Test case 1 for {@link FTPClient#append(String, boolean)}
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testAppend1() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.append("/home/user/file.txt", true);
		outputStream.close();
	}
	
	/**
	* Test case 2 for {@link FTPClient#append(String, boolean)}
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testAppend2() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.append("/home/user/file.txt", false);
		outputStream.close();
	}
	
	/**
	* Test case 3 for {@link FTPClient#append(String, boolean)}
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testAppend3() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.append("/home/user/file.txt", true);
		outputStream.close();
	}
	
	/**
	* Test case 4 for {@link FTPClient#append(String, boolean)}
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testAppend4() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.append("/home/user/file.txt", false);
		outputStream.close();
	}
	
	/**
	* Test case 5 for {@link FTPClient#append(String, boolean)}
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testAppend5() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.append("/home/user/file.txt", true);
		outputStream.close();
	}
	
	/**
	* Test case 6 for {@link FTPClient#append(String, boolean)}
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testAppend6() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.append("/home/user/file.txt", false);
		outputStream.close();
	}
	
	/**
	* Test case 7 for {@link FTPClient#append(String, boolean)}
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testAppend7() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.append("/home/user/file.txt", true);
		outputStream.close();
	}
	
	/**
	* Test case 8 for {@link FTPClient#append(String, boolean)}
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testAppend8() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.append("/home/user/file.txt", false);
		outputStream.close();
	}
	
	/**
	* Test case 9 for {@link FTPClient#append(String, boolean)}
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testAppend9() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.append("/home/user/file.txt", true);
		outputStream.close();
	}
	
	/**
	* Test case 10 for {@link FTPClient#append(String, boolean)}
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testAppend10() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.append("/home/user/file.txt", false);
		outputStream.close();
	}
}