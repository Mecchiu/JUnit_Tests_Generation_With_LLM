// FTPClient_3Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#append(String, boolean)} method.
*/
class FTPClient_3Test {
private FTPClient client;
	{
		client = createClient();
	}


	/**
	 * Test append(String, boolean).
	 *
	 * @throws IOException if any other IO error occurs
	 * @throws FTPException if other FTP protocol errors occurs
	 */
    @Test
    void testAppend() throws IOException, FTPException {
		try {
			String pathname = "foo/bar";
			OutputStream o = client.append(pathname, false);
		}            
		catch (IOException e) {
			// we try this next as it is more specific
			InputStream is = client.getInputStream();
			try {
				byte[] bytes = new byte[4];
				int n = 4096;
				while (n-- > 0) {
					n = is.read(bytes);
					StringBuilder sb = new StringBuilder();
					for (int i = 0; i < bytes.length; i++) {
						if (bytes[i] == '\n' || bytes[i] == '\r') {
							continue;
						}
					sb.append(new String(""));
					}
					byte msg[] = sb.toString().getBytes();
					o = client.append(msg, false);
				}
				return;
			}
			finally {
				o.close();
			}
		}
		fail("No exceptions.");
	}
}
