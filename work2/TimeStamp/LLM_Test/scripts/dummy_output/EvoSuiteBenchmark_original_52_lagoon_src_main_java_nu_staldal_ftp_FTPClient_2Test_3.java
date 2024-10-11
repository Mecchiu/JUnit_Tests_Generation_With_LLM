// FTPClient_2Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#append(String)} method.
*/
class FTPClient_2Test {
		String dirs[] = new String[]{ "/" };
	  String files[] = new String[] { "/test1" };
	  /**
	 * @throws IOException if something's wrong inside
	 */
	@Test
	void testAll() throws IOException {
		FTPClient client = new FTPClient();
		client.setPassive(false);
		String[] paths = new String[dirs.length];
		for(int i = 0; i < dirs.length; i++)
			paths[i] = dirs[i];
		OutputStream os = client.append(paths);
		for(String path: files)
			os = assertTrue(client.append(paths), path + " not appended to");
	}
}