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
	 * It tests a specific implementation of {@link FTPClient#deleteFile(String)}.
	 */
	@Test
	void deleteFile_7() {
		// GIVEN
		// pathname = "/tmp/one-file"
		// WHEN
		boolean result = client.deleteFile(pathname);
		// THEN
		assertEquals(result, true);
	}
	
	/**
	 * It tests a specific implementation of {@link FTPClient#deleteFile(String)}.
	 */
	@Test
	void deleteFile_8() throws IOException {
		// GIVEN
		// pathname = "/tmp/one-file"
		// WHEN
		boolean result = client.deleteFile(pathname);
		// THEN
		assertEquals(result, true);
		
		// GIVEN
		// pathname = "/a/b/c"
		// WHEN
		result = client.deleteFile(pathname);
		// THEN
		assertEquals(result, false);
	}
	
	/**
	 * It tests a specific implementation of {@link FTPClient#deleteFile(String)}.
	 */
	@Test
	void deleteFile_9() throws IOException {
		// GIVEN
		// pathname = "/tmp/one-file"
		// WHEN
		boolean result = client.deleteFile("/tmp/one-file");
		// THEN
		assertEquals(result, true);

		// GIVEN
		// pathname = "/test_file"
		// WHEN
		result = client.deleteFile(pathname);
		// THEN
		assertEquals(result, false);
	}
}