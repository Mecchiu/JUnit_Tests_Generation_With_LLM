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
         * Create a new JVCRequestContext instance with a default session
         *
         * @return a new JVCRequestContext instance
         */
        public static final JVCRequestContext getInstance() {
                return new JVCRequestContext();
        }

        @Test
        public void testGetCookie() throws IOException {
                final String cookieName1 = "something";
                final String cookieValue1 = "value1";
                final String cookieName2 = null;
                final String cookieValue2 = null;

                // JVC request context has a session
                Map<String,String> map = new HashMap<>();
                map.put(cookieName1, cookieValue1);
                map.put(cookieName2, cookieValue2);

				JVCRequestContext context = new JVCRequestContext();

                // Request context instance has an empty session
                HttpServletRequest request = new MockHttpServletRequest(map);
                context.setRequest(request);

                // Get cookie
                Cookie cookie = context.getCookie(cookieName1);
                assertNotNull("Expected cookie for " + cookieName1 + " but it was null.", cookie);
                assertEquals("Expected cookie value for " + cookieName1 + " but got " + cookie.getValue(),
			        cookieValue1, cookie.getValue());

                // Remove it for next test
                context.removeCookie(cookieName1);
                assertFalse("Request context already had the cookie value removed", context.hasCookie(cookieName1));

                // Get cookie
                cookie = context.getCookie(cookieName2);
                assertNotNull("Expected cookie for " + cookieName2 + " but it was null.", cookie);
                assertEquals("Expected cookie value for " + cookieName2 + " but got " + cookie.getValue(),
			        cookieValue2, cookie.getValue());

                // Remove it
                context.removeCookie(cookieName2);
                assertFalse("Request context already had the cookie value removed", context.hasCookie(cookieName2));
        }
    }

/**
 * Main class of the {@link JVCRequestContext}.
 *
 * @author Charles Fleury
 * @version 2.3 - 4/29/2016.
 */
public class JVCRequestContext_5
        extends HttpServlet {

    /**
     * Constructor for the JVCRequestContext_5 class.  
     */
    public JVCRequestContext_5 () {
        super();
    }

    /**
     * Standard javax.servlet.HttpServletRequest, which we will need
     * in order to complete the test.
     *
     * @author mike dooley
     * @version 1.0 - 6/18/2016
     */
    public class MockHttpServletRequest extends HttpServletRequest {
        /**
         * Constructor that takes the request as input.
         * Subsequent invocations of {@link #getCookie} will return the same
         * result as previous calls.
         * @param request
         */
        public MockHttpServletRequest(Map request) { super(request); }

        /**
         * Retrieves the value of <tt>JVCRequestContext.COOKIE_NAME</tt>.
         * If this method was not invoked by the user via the
         * request parameter <tt>HttpServletRequest.REQUEST_METHOD</tt>,
         * it should return the value of <tt>COOKIE_NAME</tt>
         *
         * @return the value of <tt>JVCRequestContext.COOKIE_NAME</tt>
         */
        public String getCookie(String name) {
            if (name.equals(MockHttpServletRequest.COOKIE_NAME)) {
                return this.getServletContext().getInitParameter(MockHttpServletRequest.COOKIE_NAME);
            }

            return super.getCookie(name);
        }

        /**
         * Retrieves all the session cookies.
         *  @return the map of session cookies
         */
        Map getCookieNames(){
            Map map = new HashMap();

            SessionHolder.append(map,JVCRequestContext.COOKIE_NAME,this.getCookie(JVCRequestContext.COOKIE_NAME));

            // Remove the map and return a null value.
            return map;
        }
    }

    /**
     * Test if a cookie of this request contains the value of the expected value.
     *
     * @param name to test
     * @param value to check
     *
     * @see <a href="http://java.sun.com/developer/technicalArticles/DataFile/Cookies_a_cookie.htm">Cookies a Cookie</a>
     */
    public boolean hasCookie(String name){
    	//return getCookieNames().containsKey(name);
    	return this.getCookieNames().containsKey(name);
    }

    /**
     * Convenience method for parsing a file and creating a
     * {@link ServletFileUpload} instance.
     *
     * @author mike dooley
     * @version 1.0 - 9/18/2016
     */
    public static final class TestParse
	        extends HttpServletRequest {
    

    	/**
    	 * Constructor for the JVCRequestContext_5 class.  If you want to
    	 * override this method, the parameter <tt>configFile</tt> must
    	 * also be set.
    	 *
    	 * @param request
    	 * @param configFile
    	 */
        public TestParse(MockHttpServletRequest request, String configFile) {
                super(request);

                try {
                        if (ServletFileUpload.isMultipartContent(configFile)) {
                                setRequest(new ServletFileUpload(new ServletRequestBase
                                                (configFile, UploadServlet.MIME_TYPE, null, null)));
                        } else {
                                setRequest(new ServletRequestBase(configFile));
                        }

                } catch (Exception e) {
                        e.printStackTrace();
                }

		}

			final static int MAX_MIME_TYPE_SIZE = 64;
    	    final static int MAX_SIZE = 20 * 1024 * 1024;
    	    Class<?> testClass = null;

}
}