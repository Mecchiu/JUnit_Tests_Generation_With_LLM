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
		
	/**
	 * Test method in {@link HTMLOutputStream#HTMLOutputStream(HttpServletRequest)} (JUnit verifier).
	/**
	 * @throws Exception
	 * Set up a test case with one request for a {@code HttpServletRequest} instance.
	 */
	@Test
    public void testCtor() throws Exception {
	}

	/**
	 * Test method in {@link HTMLOutputStream#HTMLOutputStream(HttpServletResponse)}
	 * (JUnit verifier).
	 * @throws Exception
	 */
	@Test
    public void testReset() throws Exception {

		response = (HttpServletResponse) HTTPResponseFactory.get("text/html", "utf-8");
		PrintWriter pw = response.getWriter();
		
		HTMLOutputStream baos = new HTMLOutputStream(response);	
		baos.print("<html><body><font color=blue>bold text");
		pw.write("&nbsp;&nbsp;<font color=blue>&nbsp;");
		pw.write("bold text</font>");
		pw.write("&nbsp;&nbsp;<font color=white>bold text </font> ");
		pw.write("&font color:white;<font color=white>bold text  </font></font></body></html>");
		pw.flush();
		response.flushBuffer();
		
		response.reset();
		HttpServletRequest request = new HttpServletRequest("GET", new URI("/"));

		byte[] buf = new byte[]{'a', 'b', 'c', 'd'};
		ByteArrayOutputStream baos2 = new ByteArrayOutputStream(buf.length);
		HttpOutputStream ostream = new HttpOutputStream(response, baos2);
		ostream.print(buf);
		ostream.print('-');
		ostream.print(buf);
		ostream.flush();
		
		if (response.isCommitted()) {
			throw new IllegalArgumentException("The HTMLOutputStream is already committed");
		}
		
		byte[] buf2 = new byte[buf.length + 1];
		System.arraycopy(buf, 0, buf2, 0, buf.length);
		buf2[buf.length] = -1;
		baos = new ByteArrayOutputStream();
		baos.write(buf2);
		baos.flush();
		
		response.getInputStream().close();
		response.flushBuffer();
		response.getOutputStream().close();
		response.flushBuffer();
		
		StringBuffer buf1 = new StringBuffer();
		OutputStream s = response.getOutputStream();
		if (s.write(buf1)!= buf1.length()) {
			throw new RuntimeException("OutputStream wrote the wrong sized.");
		}
		response.reset();

        HttpServletRequest request2 = new HttpServletRequest("GET", new URI("/"));

		String b1 = baos.toString();
		b1 = b1.replaceAll(" +", " ");
		String b2 = b1.replaceAll(" +", " ");

		b1.replace("\n", "\\n");
		b2.replace("\n", "\\n");
		
        response.setBufferSize((int) b1.length() + (int) b2.length() + 60);
		pw.close();
		response.flushBuffer();
        response.getOutputStream().close();
        response.flushBuffer();
    }

}