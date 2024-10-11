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

	@Test
	void testDeleteFile() throws FTPException, IOException {
		FTPClient ftp = new FTPClient();
		ftp.connect("localhost");
		ftp.login("anonymous", "anonymous");
		assertTrue(ftp.deleteFile("/pub/test.txt"));
		assertFalse(ftp.deleteFile("/pub/test.txt"));
		ftp.disconnect();
	}
}