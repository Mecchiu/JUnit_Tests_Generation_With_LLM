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

	@Test
	public void testStore() throws FTPException, IOException {
		FTPClient client = new FTPClient();
		client.connect("localhost", 21);
		client.login("anonymous", "anonymous");
		client.setBinaryMode(true);
		OutputStream out = client.store("/tmp/test.txt");
		out.write("Hello World!".getBytes());
		out.close();
		client.disconnect();
	}
}