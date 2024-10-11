// JVCRequestContext_5Test.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCRequestContext}.
* It contains one unit test case for the {@link JVCRequestContext#getCookie(String)} method.
*/
class JVCRequestContext_5Test {

    /**
     * Creates a new set of cookies.
     */
    public JVCRequestContext_5Test() {
        cookies="[\\#{http://javadoros.nl/test/vendor"},\\#{http://zpetramo.com/foo/vendor}]";
    }

    /**
     * Unit test case for {@link JVCRequestContext#setCookie(String)}.
     */
    @Test
    public void testSetCookie() {
    	HttpServletRequest request = new MockServletRequest();
    	request.flushBuffer();

        // Set a cookie
        request.setCookies(Collections.singletonList("http://zpetramo.com"+cookies));
        request.setCookies();

	    // Expect a redirect response
        assertNotNull("The redirect was never made", server.returnContent());
        assertEquals("The redirect does not have the right name after", "http://zpetramo.com"+cookie, server.getContentAsString());
	}

    /**
     * Unit test case for {@link JVCRequestContext#getCookie(String)}.
     */
    @Test
    public void testGetCookie() {
        Object expectedValue = new String("[]");
        HttpServletRequest request = new MockServletRequest();
        request.flushBuffer();

        // Get and check a single cookie
        assertEquals("Did not have the right value", expectedValue,
                request.getCookie("http://javadoros.nl"));

        // Get again without a value
        request.setCookies(Collections.singletonList("http://javad.plankton/"));
        assertEquals("Did not have the right value", expectedValue,
                request.getCookie("http://javadoros.nl"));

    }

    /**
     * Unit test case for {@link JVCRequestContext#setCookie(String)}.
     */
    @Test
    public void testSetCookieWithValue() {
    	HttpServletRequest request = new MockServletRequest();
    	request.flushBuffer();

        // Set a cookie with an existing value
        request.setCookies(Collections.singletonList("http://javadoros.nl"+cookies));
        request.setCookies();

	    // Expect a redirect response
        String value = request.getCookies();
        assertEquals("An unexpected value was returned ", "http://javadoros.nl"+cookies, value);
    }

    /**
     * Simple unit test. Asserts that a non-URL is rejected, which can cause trouble.
     */
	@Test
    public void simpleAssertRejected() throws IOException, ServletException {
	    File tmp = File.createTempFile("test", "txt");
	    tmp.deleteOnExit();

		ServletContext servletContext = new JVCServletContext();
		servletContext.log("testing test file");
		HttpServletRequest request = new MockServletRequest();
		request.deleteCookie("test");
		request.setCookies(Collections.singletonList("http://javadoros.nl"+cookies));
		request.setCookies();

		try {
            
		    //assertEquals will not return anything until a redirect is made
			server.returnContent(tmp.getCanonicalPath());
			servletContext.log("OK");

		    //The path must be relative
			HttpURLConnection urlConn = (HttpURLConnection) servletContext.findFile("src/test/resources/testfile.txt").openConnection();

			urlConn.connect();
			assertEquals("Should have redirected", 302, urlConn.getResponseCode());
			StringBuilder out = new StringBuilder();
			HttpURLConnection.getInputStream(urlConn);
			Streams.copy(urlConn.getInputStream(), out);
			assertEquals("Should have redirected", "http://test.org/test", out.toString());
			urlConn.disconnect();

		}
		catch (IOException e) {
			fail("Error occured in test");
		}		

	}

}