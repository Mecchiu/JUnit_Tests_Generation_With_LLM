// JVCRequestContext_4Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getSessionAttr(String)} method.
*/
class JVCRequestContext_4Test {
		
	private static final String SESSION_NAME = "sdfsdfsdf";
	
    @Test
    public void testServletRequest() throws IOException {
        // Open a connection with the servlet
        URL url = new URL("http://localhost/jvc/test/servletRequest/");
        
        // Create the HttpServletRequest with our HTTP request path info
        ServletRequest request = new JVCRequestContext().createRequest(null, null, url, null, null, null, null);

        // Get the requested URL
        String requestUrl = request.findStringAttribute("Request-URL");

        // Check the request url
        assertEquals("/jvc/test/servletRequest/", requestUrl);
        
        // Get the session attribute 'http://localhost/jvc/test/servletRequest/sdfsdfsdf'
        String sdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfs = (String) request.getAttribute("http://localhost/jvc/test/servletRequest/sdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsf=" + sdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsf);

        // Check the session attribute of the above request
        assertEquals("sdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsf=" + sdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsf, request.getSession().getAttribute("http://localhost/jvc/test/servletRequest/sdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsf"));
        
        // Remove the session attribute
        request.destroyParameter("http://localhost/jvc/test/servletRequest/sdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsf");
        
        // Test the request path parameter
        requestUrl = request.getParameter("Request-URL");
        
        // Checks the request path parameter is null
        assertNull(requestUrl + " should return null.", request.getParameter("Request-URL"));

        // Checks the request path parameter is blank
        assertEquals(new Link("/jvc/test/servletRequest/"), requestUrl);

        // Get the Request-Path value that we created
        request = new JVCRequestContext().createRequest(null, null, url, requestUrl, null, null, null);
        
        // Checks the request path parameter is blank
        assertNull(request.getParameter("Request-Path"));

        // Gets the session attribute 'Request-Path'
        sdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsf = (Link) request.getAttribute("Request-Path");
        
        // Checks the request path parameter is what we received
        assertEquals(new Link("/jvc/test/servletRequest/sdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsf"), sdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsf);

        // Get the Request-Path
        request = new JVCRequestContext().createRequest(null, null, url, null, null, requestUrl, null);
        
        // Checks the request path parameter is what we received
        assertEquals(new Link("/jvc/test/servletRequest/sdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsf"), sdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsf);
        
    }    

    /**
     * Create the {@link HttpRequest} object for the request path of the request
     * with the specified name.  The method will call the {@link #getSessionAttr(String)}
     * method to get the URL value for the given name.
     *
     * @param name the name of the attribute to retrieve
     * @param forceUseCachedSession true to create a session or just return a cached URL
     */
    private HttpRequest createHttpRequest(String name, boolean forceUseCachedSession) throws IOException {

                //
                // This will make it easier to see if anything gets changed
                //
        URL url = new URL("http://localhost/jvc/test/servletRequest/");
        
        // Create the HttpServletRequest with our HTTP request path info
        HttpServletRequest request = new JVCRequestContext().createRequest(null, null, url, null, null, null, name);

        // Get the requested URL
        String requestUrl = request.findStringAttribute("Request-URL");

        if (forceUseCachedSession) {
            // Request-URL is always the same or the result of
            //  a call to HttpRequest.getServletRequest()
            requestUrl = request.readEntity(String.class);
        }

        // Find the session attribute of the url
}
}