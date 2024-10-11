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
	* Test case 1 for {@link FTPClient#store(String)}
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore1() throws FTPException, IOException {
		FTPClient client = new FTPClient();
		OutputStream out = client.store("/home/user/file.txt");
		out.write("Hello World!".getBytes());
		out.close();
	}
	
	/**
	* Test case 2 for {@link FTPClient#store(String)}
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore2() throws FTPException, IOException {
		FTPClient client = new FTPClient();
		OutputStream out = client.store("/home/user/file.txt");
		out.write("Hello World!".getBytes());
		out.close();
	}
	
	/**
	* Test case 3 for {@link FTPClient#store(String)}
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore3() throws FTPException, IOException {
		FTPClient client = new FTPClient();
		OutputStream out = client.store("/home/user/file.txt");
		out.write("Hello World!".getBytes());
		out.close();
	}
	
	/**
	* Test case 4 for {@link FTPClient#store(String)}
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore4() throws FTPException, IOException {
		FTPClient client = new FTPClient();
		OutputStream out = client.store("/home/user/file.txt");
		out.write("Hello World!".getBytes());
		out.close();
	}
	
	/**
	* Test case 5 for {@link FTPClient#store(String)}
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore5() throws FTPException, IOException {
		FTPClient client = new FTPClient();
		OutputStream out = client.store("/home/user/file.txt");
		out.write("Hello World!".getBytes());
		out.close();
	}
	
	/**
	* Test case 6 for {@link FTPClient#store(String)}
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore6() throws FTPException, IOException {
		FTPClient client = new FTPClient();
		OutputStream out = client.store("/home/user/file.txt");
		out.write("Hello World!".getBytes());
		out.close();
	}
	
	/**
	* Test case 7 for {@link FTPClient#store(String)}
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore7() throws FTPException, IOException {
		FTPClient client = new FTPClient();
		OutputStream out = client.store("/home/user/file.txt");
		out.write("Hello World!".getBytes());
		out.close();
	}
	
	/**
	* Test case 8 for {@link FTPClient#store(String)}
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore8() throws FTPException, IOException {
		FTPClient client = new FTPClient();
		OutputStream out = client.store("/home/user/file.txt");
		out.write("Hello World!".getBytes());
		out.close();
	}
	
	/**
	* Test case 9 for {@link FTPClient#store(String)}
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore9() throws FTPException, IOException {
		FTPClient client = new FTPClient();
		OutputStream out = client.store("/home/user/file.txt");
		out.write("Hello World!".getBytes());
		out.close();
	}
	
	/**
	* Test case 10 for {@link FTPClient#store(String)}
	*
	* @throws FTPException if any FTP protocol error occurs
	* @throws IOException if any other IO error occurs
	*/
	@Test
	public void testStore10() throws FTPException, IOException {
		FTPClient client = new FTPClient();
		OutputStream out = client.store("/home/user/file.txt");
		out.write("Hello World!".getBytes());
		out.close();
	}
}