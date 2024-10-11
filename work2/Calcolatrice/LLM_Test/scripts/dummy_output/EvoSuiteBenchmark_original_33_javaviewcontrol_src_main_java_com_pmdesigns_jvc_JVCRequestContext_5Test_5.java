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
     * Test method for {@link com.pmdesigns.jvc.JVCRequestContext#JVCRequestContext(com.pmdesigns.jvc.JVCRequestContext.JVCRequestContextType)}.
     */
    @Test
    public final void testJVCRequestContext_JVCRequestContextType() {
        //Test constructor with default value for type of request.
        JVCRequestContext jvcRequestContext = new JVCRequestContext(JVCRequestContextType.DEFAULT);
		
		assertEquals(jvcRequestContext.getType(), JVCRequestContextType.DEFAULT);
        assertEquals(jvcRequestContext.getFileName(), "");
        assertEquals(jvcRequestContext.getRequest(), null);
        assertEquals(jvcRequestContext.getMethod(), null);
        assertEquals(jvcRequestContext.getPath(), "");
        assertEquals(jvcRequestContext.getQueryString(), "");
        assertEquals(jvcRequestContext.getRemoteAddr(), "");
        assertEquals(jvcRequestContext.getCookies(), null);
        assertEquals(jvcRequestContext.getRemoteUser(), "");
        assertEquals(jvcRequestContext.getSessionId(), "");
        assertEquals(jvcRequestContext.getAuthInfo(), "");
        assertEquals(jvcRequestContext.getReferrerId(), "");
        assertEquals(jvcRequestContext.getReferrer(), "");
        assertEquals(jvcRequestContext.getReferrerHost(), "");
        assertEquals(jvcRequestContext.getReferrerPort(), 0);
        assertNotNull(jvcRequestContext.getFlash());
        //Null pointer checks
		assertNull(jvcRequestContext.getCookie(null));
    }

    
    
    
    /**
     * Gets the current HTTP request.
     *
     * @return the current HTTP request
     */
    public HttpServletRequest getRequest() {
        return request;
    }

    /**
     * Sets the current HTTP request.
     *
     * @param newRequest the new HTTP request
     */
    public void setRequest(HttpServletRequest newRequest) {
        request = newRequest;
    }

    /**
     * Gets the current HTTP Response object.
     *
     * @return the current HTTP Response object
     */
    public HttpServletResponse getResponse() {
        return response;
    }

    /**
     * Sets the current HTTP Response object.
     *
     * @param newResponse the new HTTP Response object
     */
    public void setResponse(HttpServletResponse newResponse) {
        response = newResponse;
    }

    /**
     * Gets the current HTTP Request object.
     *
     * @return the current HTTP Request object
     */
    public HttpURLConnection getHttpRequest() {
        return request;
    }

    /**
     * Sets the current HTTP Request object.
     *
     * @param newHttpRequest the new HTTP Request object
     */
    public void setHttpRequest(HttpURLConnection newHttpRequest) {
        request = newHttpRequest;
    }

    /**
     * Gets the current HTTP Response object.
     *
     * @return the current HTTP Response object
     */
    public HttpURLConnection getHttpResponse() {
        return response;
    }

    /**
     * Sets the current HTTP Response object.
     *
     * @param newHttpResponse the new HTTP Response object
     */
    public void setHttpResponse(HttpURLConnection newHttpResponse) {
        response = newHttpResponse;
    }

}