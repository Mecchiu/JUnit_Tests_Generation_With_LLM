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

	@Test
	public void testAppend() throws FTPException, IOException {
		FTPClient ftp = new FTPClient();
		ftp.connect("localhost");
		ftp.login("anonymous", "anonymous@example.com");
		ftp.setType(FTPClient.TYPE_ASCII);
		ftp.setMode(FTPClient.MODE_STREAM);
		ftp.setDir("/");
		ftp.append("test.txt");
		ftp.disconnect();
	}
}