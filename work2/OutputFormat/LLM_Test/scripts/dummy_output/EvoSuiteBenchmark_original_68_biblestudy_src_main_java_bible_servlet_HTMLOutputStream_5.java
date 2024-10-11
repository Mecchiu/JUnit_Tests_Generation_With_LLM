// HTMLOutputStreamTest.java
package bible.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLOutputStream}.
* It contains one unit test case for the {@link HTMLOutputStream#reset()} method.
*/
class HTMLOutputStreamTest {
		private byte[] bytes;
		private static int N = 1024;

		public void setUpHTTP(HttpServlet servlet) {
			this.response = new HttpServletResponse();
			servlet.setRequestDispatcher("/html/reset.jsp").forward(servlet, response);
		}
		public void setUpPW() {
			String passwd = "test";
			byte[] passwd_data = passwd.getBytes();
			this.pw = new PrintWriter(new OutputStreamWriter(new ByteArrayOutputStream(passwd_data.length), "UTF-8"));
			StringBuffer buf = new StringBuffer(N);
			this.bytes = buf.toString().getBytes();
			for (int i = 0; i < passwd_data.length; i++)
			    sb(this.pw, this.bytes[i], N);
		}
		private void sb(Writer i_, byte[] buf, int n) throws IOException {
			for (int i = 0; i < n; i++)
				i_.write(buf[i]);
		}
		public void testReset() throws IOException {
		}
	}