// JVCRequestContext_6Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#absPath(String)} method.
*/
class JVCRequestContext_6Test {
		
	/**
	 * Convenience method to prepend the context path onto a servlet path
	 *
	 * @param path
     *            an http path relative to the context
     * @return the context path plus the indicated path
	 */
    private String absPath(String path) {
    	return "/" + path;
    }

    /**
	 * Tests for method {@link JVCRequestContext#absPath(String)}.
	*/
    @Test
    public void testAbsPath() {
		//set up the context
        final JVCRequestContext context = new
                 JVCRequestContext(0);
        final String testAbsPath = absPath("");
        assertEquals(testAbsPath, context.absPath(testAbsPath));

        final HttpServletRequest request = new HttpServletRequest("POST", "/");
        assertEquals("POST", request.getMethod());
        assertNull(request.getAttribute("javax.servlet.http.request.dispatcher.pathinfo"));

        final HttpServletResponse response = new HttpServletResponse();
        assertNotNull(response);

        //test for request.setAttribute();
        //we test in the setUp() method, because testAttribute() needs to set a value
        //before the test is executed.
        final ServletRequestAttributes attributes = new
         ServletRequestAttributes(request);
        request.setAttribute(ServletSecurityElement.SECURITY_ENABLED, "yes");
        assertEquals("request.setAttribute();", attributes.getPostMethodName());
        assertNull(attributes.getAttribute("javax.servlet.http.request.dispatcher.pathinfo"));
        final HttpURLConnection connection =
                setupRequest(request, response);

        //test setting the HTTP Referrer
        final String referrer = "<referrer>";
        assertEquals(referrer, connection.getHeaderField("Referer"));

        //test setAttribute method.
        final HttpSession session = request.getSession(false);
        final String key1 = "key1";
        final String key2 = "key2";
        final HttpSession.Attribute attribute1 =
                session.createSession(false).getAttribute(key1);
        final HttpSession.Attribute attribute2 =
                session.createSession(false).getAttribute(key2);
        assertEquals("session.createSession();", attribute1.toString());
        final Object[] atts = {attribute1, attribute2};
        request.setAttribute(key1.toLowerCase(), atts);
        assertEquals("request.setAttribute(session.createSession(),session.createSession(true);",
                 attribute1.toString());
        assertNull(attribute2);

        //test getting a session
        //note that we are just testing the method, so the attribute is
        // not set yet.
        final HttpSession session1 = request.getSession(true);
        final HttpSession session2 = request.getSession(true);
        assertNull(session1);
        assertNotNull(session2);

        //test getting a session
        final HttpSession session3 = request.getSession(true);
        assertEquals(valueOf(5), session3.getAttribute(key1));
        assertEquals(valueOf(2), session2.getAttribute(key1));
        assertNull(session1.getAttribute(key2));
        assertNotNull(session1.getAttribute(key1));
        assertNull(request.getAttribute(key1.toLowerCase()));

        //test setAttribute() (same as above)
        attribute1 = session.createSession(false);
        attribute2 = session2.createSession(false);
        assertEquals(valueOf(5), attribute1.get());
        assertEquals(valueOf(2), attribute2.get());
        request.setAttribute(key1.toLowerCase(), attribute1);
        assertEquals(5, (int)attribute1.get());
        request.setAttribute(key1.toLowerCase(), attribute2);
        assertEquals(valueOf(2), (int)attribute2.get());
        request.removeAttribute(key1.toLowerCase());
        assertEquals(5, (int)attribute1.get());
        assertEquals(valueOf(2), (int)attribute2.get());

        //test getSession() (same as above)
        final HttpSession session4 = request.getSession(true);
        final HttpSession session5 = request.getSession();
        assertEquals(request.getSession().getAttribute(key1), valueOf(5));
        assertNotSame(request.getSession().getAttribute(key1), session4.getAttribute(key1));
        assertEquals(valueOf(2), session4.getAttribute(key1).get());
        assertSame(session4, request.getSession());
        assertEquals(session5, request.getSession());

        assertEquals(request.getHeaders("Cookie").size(), 1);
        assertEquals(request.getHeaders("Cookie").getFirst("Foo").get("Name"),
             new String((byte)20, "US-ASCII"));

        request.getAuthType();
        assertNull(request.getAuthType());

        assertTrue(request.getAttribute("javax.servlet.http.request.conntent.length")
               .toString().endsWith("string"));
        assertEquals(valueOf(7), request.getAttribute("javax.servlet.http.request.conntent.length")
               .get());

    }

    private HttpURLConnection setupRequest(
        final HttpServletRequest request, final HttpServletResponse response)
            throws HttpServletRequestInitializationException {
        final ServletConfig config = request.getServletConfig();
        final URL baseURL = request.getRequestURL();
        final String basePath = "/" + (baseURL == null? "".getBytes() :
            new URL(baseURL, "".getBytes(), 0, baseURL.getFile()).toString().length());
        final ServletFileUpload upload = new ServletFileUpload();
        final FileUpload fileUpload = new ServletFileUpload();

}
}