// JVCRequestContext_8Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
*/
class JVCRequestContext_8Test {
		
    /**
     * Creates a request context that has no parameters added to it.
     */
    public JVCRequestContext_8Test(TestCase t) {
        super(t);
    }

    /**
     * Runs the test by invoking <code>javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)</code>.
     * @param request the request to be filtered
     * @param response the response to be filtered
     * @param filterChain the filter chain to use when handling the request
     */
    public void run(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        JVCRequestContext context = new JVCRequestContext(new FilterConfig("Filter Test"), request, response, filterChain);
        filterChain.doFilter(request, response);
    }

    /**
     * This method creates an HttpServletRequest and HttpServletResponse objects
     * and returns the URL path used as this request.
     */
    private String makeRequest(String path) {
        HttpServletRequest servletRequest = new HttpServletRequestImpl();
        servletRequest.setQueryString(path);
        servletRequest.setMethod("GET");
        setHeaders(servletRequest);
        return servletRequest.getRequestURL().toString();
    }

    /**
     * This method runs the TestCase and verifies the result of the test based on the
     * expected output of the method.
     */
    @Test
    public void verifyResultReceived() {
        /* Run the test */
        String request = makeRequest("something");
        String response = "request succeeded";
        String result = run(request, response, null);
        
        /* Verify result */
        assertNotNull(result);
        assertTrue("Result is " + result, result.startsWith("request succeeded"));
    }

    /**
     * This method runs the TestCase and verifies the result of the test based on the
     * expected output of the method.
     */
    @Test
    public void verifyResultEncoded() throws UnsupportedEncodingException {
        String request = makeRequest("something");
        byte[] encodedString = "request succeeded".getBytes("UTF-8");
        assertEquals("request succeeded encoding failed",
                encodedString.length, request.length() + 1);
        String response = new String(
                Streams.read(new ByteArrayInputStream(encodedString)),"UTF-8");
        String result = run(request, response, null);
        
        /* Verify result */
        assertNotNull("Response is a byte stream", response.getBytes("UTF-8"));
        assertEquals("EncodedResponse was wrong",
                   "request succeeded encoding failed",
                   new String(response));
        assertEquals("EncodedResponse is not correct",
                "request succeeded encoding failed",
                new String(Streams.<byte[]>read(new ByteArrayInputStream(
                    encodedString)),"UTF-8"));
    }

    /**
     * This method runs the TestCase and verifies the result of the test based on the
     * expected output of the method.
     * <p>
     * It validates, using our own validators, that the path is present in the flash,
     * that the response is OK, and that the url path can be rewritten correctly.
     */
    @Test
    public void verifyAbsPathRewrite() throws UnsupportedEncodingException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        String request = makeRequest("something");
        
        /* Run the test */
        String response = run(request, is, null);
        
        /* Verify result */
        assertNotNull("Response is a byte stream", response.getBytes("UTF-8"));
        assertFalse("Response is not an absolute link", new File(response).canRead());
        assertNotNull("Response contains an absolute path",
            new File(response).canonicalPath()
        );
    }

    /**
     * This method runs the TestCase and verifies the result of the test based on the
     * expected output of the method.
     * <p>
     * We use "setFlvUrl" as the path set the URL that we would want to make a flash
     * entry for relative / relative links.
     */
    @Test
    public void verifyFlvUrl() throws UnsupportedEncodingException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        String request = makeRequest("something");
        
        /* Run the test */
        String response = run(request, is, new String(".flv"));
        
        /* Verify result */
        assertNotNull("Response is a byte stream", response.getBytes("UTF-8"));
        assertFalse("Response is absolute link", new File(response).canRead());
        assertNotNull("Response contains an absolute path",
            new File("whatever.flv").canonicalPath()
        );
    }

    /**
     * This method runs the TestCase and verifies the result of the test based on the
     * expected output of the method.
     */
    @Test
    public void verifyFlvUrlWithCustomURLs() throws UnsupportedEncodingException {
        File flvFile = new File(".flv");
        flvFile.setReadable(true, false);

        String request = makeRequest("something");

        try {
            flvFile.createNewFile();
        }
        catch (IOException ex) {
            assertEquals("Exception creating flv file", ex.getCause());
            return;
        }
        
        /*
        {
        "content-type":"application/x-shockwave-flash",
        "file":"/whatever.flv",
        "name":"flv"
        }
        */
        String response = run(request, flvFile);
        
        /* Verify result */
        assertNotNull("Response is a byte stream", response.getBytes("UTF-8"));
        assertFalse("Response is absolute link", new File(response).canRead());
}
}