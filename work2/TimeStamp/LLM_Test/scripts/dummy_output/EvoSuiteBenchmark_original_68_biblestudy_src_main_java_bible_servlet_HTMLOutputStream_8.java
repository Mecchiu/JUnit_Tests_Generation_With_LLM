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
		
		private final int size = 2000;

		/**
		* @since 1.7
		* @throws Exception
		* @jvms 2.18.1 HTMLOutputStream.html (http://javascript.cuz.com/blog/html-output-stream.html)
		* @author James Stauffer
		* @see  HTMLOutputStream#reset()
		*/
		@Test
		public void testConstructor() throws Exception{//"HTMLOutputStreamTest.reset()"
		response = new HttpServletResponse(null);
		bos = new ByteArrayOutputStream(2048);
		pw = new PrintWriter(bos);

		}

		/**
		* @since 1.7
		* @throws Exception
		* @jvms 2.18.1 HTMLOutputStream.html (http://javascript.cuz.com/blog/html-output-stream.html)
		* @author James Stauffer
		* @see  HTMLOutputStream
		*/
		@Test
		public void testHttpPOSTResponse() throws Exception{// "HTMLOutputStreamTest.testHttpPOSTResponse()"
		response = new HttpServletResponse(pw);


		print("HTMLOutputStreamTest.testHttpPOSTResponse() - Test for the method HttpServletResponse.setCharacterEncoding.\n");
		
			assertEquals("Test character encoding: HTTP/1.1\n\n", getBytes(pw, size));
			pw.flush();

			// setCharacterEncoding(null);
			assertEquals("Test character encoding: null\n\n", getBytes(-1, pw, 0));
			pw.flush();
			pw.close();
			pw = null;
	}
	
	

	/**
	* @since 1.7
	* @throws Exception
	* @jvms 2.18.1 HTMLOutputStream.html (http://javascript.cuz.com/blog/html-output-stream.html)
	* @author James Stauffer
	* @see  HTMLOutputStream
	*/
	@Test
	public void testHttpPOSTCharacterEncoding() throws Exception{// "HTMLOutputStreamTest.testHttpPOSTCharacterEncoding()"
		response = new HttpServletResponse(pw);
		print("HTMLOutputStreamTest.testHttpPOSTCharacterEncoding() - Test for the method HttpServletResponse.setCharacterEncoding.\n");

			String charset = "ISO-8859-1";
			String encoding = null;
			HttpURLConnection urlCon = (HttpURLConnection) response.getUrl();
			urlCon.setRequestProperty("Accept-Encoding", charset);
			urlCon.setRequestProperty("Accept-Language", "");
			urlCon.setRequestProperty("Range", "bytes="+size);
			urlCon.setRequestProperty("Accept", "*");
			response.setRequestMethod("POST");
			
		
		assertEquals("Test character encoding: " + charset + "\n\n", getBytes(pw, size));
			pw.flush();

			// setCharacterEncoding(charset);
			assertEquals("Test character encoding: " + charset + "\n\n", getBytes(-1, pw, 0));
			pw.flush();
			pw.close();
			pw = null;

	}

	/**
	* @since 1.7
	* @throws Exception
	* @jvms 2.18.1 HTMLOutputStream.print (http://javascript.cuz.com/blog/html-output-stream.html)
	* @author James Stauffer
	* @see  HTMLOutputStream
	*/
	@Test
	public void testHtmlOutput() throws Exception{// "HTMLOutputStreamTest.testHtmlOutput()"
		response = new HttpServletResponse(pw);
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		bos = new ByteArrayOutputStream();
		pw = new PrintWriter(bos);
		print("HTMLOutputStreamTest.testHtmlOutput() - Test for the method HTMLOutputStream.html");
		
		assertEquals("Test string content: ","");
		print(bos.toString());
		pw.flush();

		// pw.flush();
		response.setContentType("XHTML 1.0 transitional");
		bios = new ByteArrayOutputStream();
		response.setContentType("text/html");
		response.setCharacterEncoding(charset="ISO-8859-1");
		response.addHeader("Content-Length", str(size) + "; charset=" + charset);
		response.setStatus(204);
			pw.write(bios.toByteArray());
			bios.flush();
			bios.close();
			bios = null;
			String res = baos.toString();
			bios = null;
			pw.flush();
			pw.close();
			pw = null;
			assertEquals("Test string content: ","");
			assertEquals("Test string: "+res,"");
			pw = null;

	}

	private String getBytes (PrintWriter pw, int bufsize) {
		String str;
		try {
			byte[] bytes = new byte[bufsize];
			InputStream is = pw.getErrorStream();
			int n;
			while ((n = is.read(bytes))!= -1) {
				pw.write(bytes, 0, n);
			}
			str = pw.toString();
			is.close();
		} catch (IOException e) {
			throw new RuntimeException("PrintStream/Writer.write() threw IOException.\nException: "+e.getMessage()+"\nException: "+e.getClass().toString(), e);
		}
		return str;
	}


	private String getBytes (PrintWriter pw, int bufsize, int max) {
		String str;
		try {
			byte buf[] = new byte[bufsize];
			int n;
			do {
				n = pw.write(buf, 0, Math.min(max, bufsize));
			} while (n > 0);
			str = pw.toString();
			pw.flush();
			pw.close();
		} catch (IOException e) {
			throw new RuntimeException("PrintStream/Writer.write() threw IOException.\nException: "+e.getMessage()+"\nException: "+e.getClass().toString(), e); 
		}
		return str;
	}

	/**
	* @since 1.7
	* @throws Exception
	* @jvms 2.18.1 HTMLOutputStream.toString
	* @author James Stauffer
	* @see  HTMLOutputStream
	*/
	@Test
	public void testToString() throws Exception{// "HTMLOutputStreamTest.toString()"
		StringBuffer str = new StringBuffer(1024);
}
}