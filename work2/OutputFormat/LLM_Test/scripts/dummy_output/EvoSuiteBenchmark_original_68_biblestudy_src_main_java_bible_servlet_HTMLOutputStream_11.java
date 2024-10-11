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
		 * Test method for {@link HTMLOutputStream#HTMLOutputStream(HttpServletRequest)}.
		*/
		@Test
		public void testreset() throws IOException {
			for (int i = 0; i < 200; i++) {
				assertEquals("", read(""));
			}
		}

		/**
		* Test method for {@link HTMLOutputStream#getPW()}.
		*/
		@Test
		public void testgetPW() throws IOException {
			this.response = new HttpServletResponse(new ServletOutputStream(System.in));
			this.response.setHeader("content-length", "200");
			String p = this.response.getOutputStream().toString();
			assertNotNull(p);
			assertEquals("", p);
		}

	}