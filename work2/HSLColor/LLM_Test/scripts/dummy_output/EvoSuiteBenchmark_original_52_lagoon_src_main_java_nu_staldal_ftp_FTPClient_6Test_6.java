// FTPClient_6Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#deleteFile(String)} method.
*/
class FTPClient_6Test {
		/**
		  * @test_method_single_threaded_deleteFile
		  * @throws IOException if a thread would leave the VM
		  * @throws FTPException if a thread would leave the VM
		  */
		@Test
		void test_single_threaded_deleteFile() throws IOException, FTPException {
		byte[] buffer = new byte[10000];

		for (int i = 0; i < buffer.length; i++) {
			buffer[i] = 'a';
		}

		FTPClient fClient;
		fClient = new FTPClient();

		try {
			int result = fClient.deleteFile(new DataInputStream(new ByteArrayInputStream(buffer)));

			if (result!= 0) {
				fail("deleteFile failed: " + result);
			}
		} catch (IOException e) {
			fail(e.getMessage());
		}

		try {
			fClient.deleteFile(null);

			fail("deleteFile must throw exception for null argument");
		} catch (NullPointerException e) {
			// ok
		}

		try {
			fClient.deleteFile("/binlog/motor1");

			fail("deleteFile must throw exception for invalid argument");
		} catch (FileNotFoundException e) {
			// ok
		}

		for (int i = 0; i < buffer.length; i++) {
			char c = (char) buffer[i];
			assertTrue("check for 0x" + Integer.toHexString(i), Character.toUpperCase(c) == (char) 'A' || Character.toUpperCase(c) == (char) 'B');
		}
	}

}