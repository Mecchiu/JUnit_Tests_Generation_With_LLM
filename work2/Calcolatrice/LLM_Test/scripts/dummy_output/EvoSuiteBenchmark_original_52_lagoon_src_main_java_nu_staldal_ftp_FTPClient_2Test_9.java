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
		/**
		 * Test case for {@link FTPClient#append(String)} method.
		 */
		@Test
		void testAppend() throws Exception {
			// path
			URL url = new URL("ftp://foo@example.com/");
			assertTrue(url.getPath().endsWith("/foo"));
			// input parameters
			assertEquals("example.com", url.getUserInfo());
			assertEquals("localhost".getBytes(), url.getUserInfo());
			assertEquals("foo".getBytes(), url.getPassword().getBytes());
			assertEquals("example.com", url.getHost());
			// output
			OutputStream out = new FileOutputStream("tmp.txt");
			String line = "some line\n";
			byte[] ba = line.getBytes();
			out.write(line.getBytes());
			out.close();
			assertNotNull(out);
			byte[] baRead = new byte[ba.length];
			InputStream in = new FileInputStream("tmp.txt");
			byte[] buf = new byte[1024];
			for (int read = 0; (read = in.read(buf)) >= 0;)
				baRead[read] = buf[0];
			in.close();
			in = new ByteArrayInputStream(baRead);
			byte[] baActual = new byte[ba.length];
			for (int read = 0; read < baActual.length; read++) {
				baActual[read] = read;
			}
			assertArrayEquals(baActual, ba);
			assertTrue(new String(baRead)
				.endsWith("some line\n"));
			out = new FileOutputStream("test.txt");
			doWrite(out);
			doRead(in);
		}

		/**
		 * write() can return a buffer sized size (1024). It is
		 * supposed to be called once in a while. At least 1 is
		 * taken at a time.
		 *
		 * @param out the stream to write to
		 *
		 * @throws IOException if any other error occurs
		 */
		private void doWrite(OutputStream out) throws IOException {
			Thread.sleep(500);
			byte[] buf = new byte[1024];
			Thread.sleep(500);
			out.write(buf);
		}

		/**
		 * read() can return a buffer sized size (1024). It is
		 * supposed to be called once in a while. At least 1 is
		 * taken at a time.
		 *
		 * @param in the stream to read from
		 *
		 * @throws IOException if any other error occurs
		 */
		private void doRead(InputStream in) throws IOException {
			assertTrue(in.read() >= 0);
		}
}