// FTPClient_0Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#store(String)} method.
*/
class FTPClient_0Test {
		private String user;
		private String pass;
		private String host;

		public FTPClient_0Test(String user, String pass) {
			this.user = user;
			this.pass = pass;
		}
		public void test() throws FTPException, IOException {
			// create a new connection
			test(this.host);

			// store FTP data (one)
			OutputStream out = store(this.host);
			StringBuffer buf = new StringBuffer();
			putc('-', buf);
			puts(port);
			putc('\r', buf);
			puts(user);
			putc('\r', buf);
			puts(pass);
			out.write(buf.toString().getBytes());
			// putc('\n', out);

			assertEquals('-', in.read());
			assertEquals(port, in.read());
			assertEquals(user, in.read());
			assertEquals(pass, in.readLine());
			assertEquals(0, in.skipBytes(4));
			// read data from the connection
			in = store(this.host).read();
			assertNotNull(in);
			assertEquals(1, in.available());
			assertEquals(0, in.skipBytes(4));
		}

		private void test(String host) throws FTPException, UnsupportedEncodingException {
			// set FTP parameters
			putc(' ', out);

			putc('P', out);
			puts(port);
			putc('S', out);
			putc(' ', out);
			putc('H', out);
			puts(host);
			putc('-', out);

			out.flush();

			// check the FTP status code
			assertEquals(200, in.read());
			String expected = "220 Host ok";
			assertEquals(expected, in.readLine());

			// read all data from connection
			in = store(host).read();
			assertNotNull(in);

			// read the data from the connection
			in = store(host).read();
			assertNotNull(in);

			assertEquals('2', in.read());
			assertEquals(expected, in.readLine());
		}

		private OutputStream store(String host) throws UnsupportedEncodingException {
			// store FTP data (two)
			if (host.endsWith("/")) {
				host = host.substring(0, host.length() - 1);
				host = host + "23";
			}
			byte buf[] = new byte[256];
			for (int i = 0; i < buf.length; ++i) {
				buf[i] = 'A';
				buf[i + 1] = 'T';
			}
			out = new ByteArrayOutputStream(50000);
			out.write(buf, 0, 4096);
			return out;
		}

	}