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
	 * A servlet path to use in tests.
	 */
	public static final String SERVLET_PATH_1 = "/servletPath1";
	
	/**
	 * Test case for {@link JVCRequestContext#absPath(String)}
	 */
    @Test
    public void testAbsPath() {
        String reqUri = "/servletPath1/servletUrlWithLeadingSlash1/servletUrlWithLeadingSlash1/testMethod";
        String resUri = "test";
        String testResult = JVCRequestContext.absPath(reqUri);
        assertEquals(servletUri(), resUri);
        
        reqUri = "/testmethod/servletUrlWithLeadingSlash1";
        resUri = "servletUrlWithLeadingSlash1/test"; 
        testResult = JVCRequestContext.absPath(reqUri);
        assertEquals(resUri,testResult);
        
        reqUri = "/testmethod/servletUrlWithLeadingSlash01";
        resUri = "servletUrlWithLeadingSlash01/servletUrlWithLeadingSlash01/test"; 
        testResult = JVCRequestContext.absPath(reqUri);
        assertEquals(resUri,testResult);
    }
}