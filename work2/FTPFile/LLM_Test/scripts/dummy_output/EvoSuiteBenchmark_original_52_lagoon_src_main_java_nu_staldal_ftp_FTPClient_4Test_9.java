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
		// TODO test constructor with no path, null path
		/**
		* Constructor that expects path to be valid and can be prepended by '/'. Empty path is no path.
		*/
		public FTPClient_4Test() {
			// empty
		}

		/**
	 * Class testing the {@link FTPClient#storeUnique(String)} method.
	 */
	@Test
	void storeUnique_4test() throws IOException {
		String path = "/";
		OutputStream out = null;

		try {
			out = new OutputStream() {
				@Override
				public void write(int b) throws IOException {
				}
			};

			// Test
			out = storeUnique(path);
			assertNotNull(out);

			// Verify
			byte[] data2 = new byte[256];

			try {
				for (int i = 0; i < data.length; i++) {
					data2[i] = (byte) (i & 0xFF);
				}

				assertArrayEquals(data, out.toByteArray());
			} catch (Exception e) {
				fail("Unexpected exception during testing.");
			}

			if (out!= null) {
				out.close();
			}

		} finally {
			assertNotNull(out);

			try {
				out.close();

			} catch (IOException e) {
				fail("Unexpected exception when closing an output stream");
			}
		}
	}
}

// End of FTPClient_4Test.java