// JVCRequestContext_9Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getFlash(String)} method.
*/
class JVCRequestContext_9Test {
		
    /**
     * Tests if getFlash converts a http request to a Map.
     * The request should have the scope of a redirect.
     * @throws Exception On failure
     */
    @Test
    public void testGetFlashConvertsToMap() throws Exception {
        RequestContextRequestType requestContext = new RequestContextRequestType();
        assertNotNull(JVCRequestContext.getFlash(requestContext));
        assertTrue("getFlash failed", 
            JVCRequestContext.JVCRequestContext.getFlash(requestContext).get(
                "flashValue").equals("thisTestMe"));
    }
		
		/**
		 * Tests the getFlash method for an invalid request context name.
		 * @throws Exception on unexpected error
		 */
    @Test
    public void testConstructorInvalidRequest() throws Exception {
            String contextNameInvalid = "invalid";
            JVCRequestContext.JVCRequestContext(contextNameInvalid);
            catchThis(null, new Exception( 
                "Invalid context name: " + contextNameInvalid));
    }
		
		
		/**
		 * Tests the getFlash method for an invalid scope.
		 * @throws Exception on unexpected error
		 */
    @Test
    public void testConstructorInvalidRequestRequestScopeViolation() throws Exception {
        RequestContextRequestType requestContext = new RequestContextRequestType("testScope");
        catchThis(null, new Exception(
            "Illegal scope value: " + requestContext.getScopeName()));
    }
		
		/**
		 * Tests the getFlash method for one valid scope and a request context that
		 * has no request scope.
		 * @throws Exception on unexpected error
		 */
    @Test
    public void testConstructorValidRequest() throws Exception {
        RequestContextRequestType requestContext = new RequestContextRequestType("requestScope");
        assertNotNull(requestContext);
        assertNotNull(JVCRequestContext.getFlash(requestContext));
    }
		
		/**
		 * Tests the getFlash method.
		 * @parm requestContextName the request context to be converted
		 * @throws Exception on unexpected error
		 */
    @Test
    public void testConstructorValidRequestWithContextName() throws Exception {
        RequestContextRequestType requestContext = new RequestContextRequestType(
            String.valueOf(System.currentTimeMillis()));
        assertNotNull(requestContext);
        assertNotNull(JVCRequestContext.getFlash(requestContext));
    }
}