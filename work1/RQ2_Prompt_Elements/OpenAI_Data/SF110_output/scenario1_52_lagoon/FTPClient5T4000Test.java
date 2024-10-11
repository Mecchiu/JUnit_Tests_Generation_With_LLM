// FTPClientTest.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#storeUnique(String, boolean)} method.
*/
class FTPClientTest {

	@Test
	public void testStoreUnique() throws FTPException, IOException {
		FTPClient ftp = new FTPClient();
		ftp.connect("localhost", 21);
		ftp.login("anonymous", "anonymous");
		ftp.storeUnique("/", true);
		ftp.disconnect();
	}
}