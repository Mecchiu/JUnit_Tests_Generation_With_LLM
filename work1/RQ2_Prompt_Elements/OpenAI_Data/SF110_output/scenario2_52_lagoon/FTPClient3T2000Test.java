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
	void testAppend1() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		ftpClient.connect("localhost", 21);
		ftpClient.login("anonymous", "anonymous");
		ftpClient.setType(FTPClient.TYPE_IMAGE);
		ftpClient.setMode(FTPClient.MODE_STREAM);
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("localhost");
		ftpClient.setDataPort(21);
		ftpClient.setDataAddress("