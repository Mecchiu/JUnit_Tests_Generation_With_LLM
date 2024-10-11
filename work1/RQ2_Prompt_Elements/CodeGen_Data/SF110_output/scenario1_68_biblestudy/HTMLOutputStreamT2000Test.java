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
	 * Test method for {@link URLStreamHandler.service} method.
	 */
	@Test
	public void testService() {
		String req = "GET/test";
    	URL url = new URL(req);
    	String r = baos.toString();

    	HTTPPollThread poll = new HTTPPollThread(url, baos);
    	String expected = "test/index.html";

    	while (poll.shouldRun()) {
	    	try {
				if (r.equals(expected)) {
					return;
				}
			}
			catch (Exception e) {
				assertFalse("Exception thrown while polling", true);
			}

    	}
    	fail("Exception not thrown while polling");
	}       
   
}