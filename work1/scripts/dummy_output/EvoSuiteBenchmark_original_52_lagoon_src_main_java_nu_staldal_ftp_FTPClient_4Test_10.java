// FTPClient_4Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#storeUnique(String)} method.
*/
class FTPClient_4Test {
		
	/**
	 * Simple test, create a new file with an unique name.
	 */
	@Test
	void simpleOne() {
		OutputStream os = storeUnique("file");
		assertTrue("os is null", os!= null);
		os.close();
	}

	/**
	* Test of storeUnique for the file transfer method.
	* This will create a new file with an unique name, if this file is existing, will not be
	* modified. It will test storeUnique against a URL for the destination
	* path:
	*    http://test:test@localhost:2332/testFile
	*/
	@Test
	void storeUniqueHttp() {
		String path = "/test";
		try (FTPClient client = new FTPClient()) {
			try(FTPClient conn = client) {
				File file = conn.storeUnique(path);
				assertTrue("file is null", file!=null);
			}
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}

	/**
	* Test of storeUnique for the remote network.
	* This will create a new file with an unique name, if this file is existing, will not be
	* modified. It will test storeUnique against a URL for the destination
	* path:
	*    ftp://localhost:2332/testFile
	*/
	@Test
	void storeUniqueFtp() {
		String path = "ftp://localhost:2332/test";
		try (FTPClient client = new FTPClient()) {
			try(FTPClient conn = client) {
				File file = conn.storeUnique(path);
				assertTrue("file is null", file!=null);
			}
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}

	/**
	* Test of storeUnique for the URL path.
	* This will create a new file with an unique name, if this file is existing, will not be
	* modified. It will test storeUnique against a URL for the destination
	* path:
	*    http://file.org:2332/file.bin
	*/
	@Test
	void storeUniqueUrl() {
		String path = "http://file.org:2332/file.bin";
		try (FTPClient client = new FTPClient()) {
			try(FTPClient conn = client) {
				File file = conn.storeUnique(path);
				assertTrue("file is null", file!=null);
			}
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}

}