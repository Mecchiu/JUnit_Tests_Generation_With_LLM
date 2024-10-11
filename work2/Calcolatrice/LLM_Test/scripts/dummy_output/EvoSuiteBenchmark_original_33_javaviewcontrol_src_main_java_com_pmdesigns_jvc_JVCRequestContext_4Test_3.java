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
		
	// Session Variable Names
	static final String USERPWD = "userpwd";
	static final String PASS = "pass";
	static final String ATTR_NAME = "jvc_pwd_attr";
	static final String ATTR_NAME1 = "jvc_pwd2_attr";
	static final String ATTR_NAME2 = "jvc_pwd3_attr";
	
	// Request Variable Names

	static final String REQUENT_TYPE = "request_type";
	static final String REQTYPE = "request_type";
	static final String REQID = "request_id";
	static final String SESSIONATTR_NAME = "session_attribute";
	
	// Request Data Structures  // This section isn't part of the specs

    static final String CONTENT_TYPE = "content_type";
    static final String CONTENT = "content";
    static final String HTTP_DATA = "http_data";
    static final String HTTP_CONTENT = "http_content";
    static final String FILE_UPLOAD = "file_upload";
    static final String TEXT_DATA = "text_data";
    static final String TEXT = "text";
    
    // Request Object Fields    // This section isn't part of the specs
    static final String PATH_START = "path_start";
    static final String PATH_END = "path_end";
    // Request Object Properties // This section isn't part of the specs

    /**
     * This test case does <b>NOT</b> use the JAXB library to generate the
     * XML data.  We do not want to use this test case directly.  There are many
     * ways of generating XML data, but this is a "real" way.
     *
     * @throws Exception 
     */
    @Test
    public void testGetSessionAttr() throws Exception {
    	
        JVCRequestContext context = new JVCRequestContext();
        
	    // Test the value returned for the session attribute.
	    Object result = context.getSessionAttr(USERPWD);   // get from the scope
        assertEquals("Result should be null.", null, result);
        result = context.getSessionAttr(USERPWD);       // get from the scope
        assertEquals("Result should be null.", null, result);
        testUnsupportedRequest("GET", null, context, null); // get all attributes

        
        context.getSessionAttr(USERPWD);
        
        Object result1 = context.getSessionAttr(USERPWD);       // get from the scope
        result = context.getSessionAttr(USERPWD);       // get from the scope
        assertEquals("Result1 should be null.", null, result1);
        testUnsupportedRequest("GET", null, context, null); // get all attributes

        
        context.getSessionAttr(USERPWD);
        
        // Test the result for nulls
        Object result2 = context.getSessionAttr(USERPWD);
        assertNotNull("Result2 should be not null.", result2);
        assertNull(result2);
        testUnsupportedRequest("GET", USERPWD, context, null); // get all attributes

     }

    
	/**
     * This test case creates an object with a 'null' value for the session attribute.
     *
     * @throws Exception
     */
    @Test
    public void testSetSessionAttr() throws Exception {
    	
        JVCRequestContext context = new JVCRequestContext();

	    // Test the value returned for the session attribute.
	    Object result = context.setSessionAttr(null);   // null
        assertNull(result);
        result = context.setSessionAttr(USERPWD);  // not null
        assertNotNull(result);
        result = context.setSessionAttr(USERPWD); // not null

        Object result2 = context.setSessionAttr(null);       // not null
        assertNotNull(result2);
    }

    
    // testUnsupportedRequest is used to test if the request is handled correctly.
    private void testUnsupportedRequest(final String method, final String value, final JVCRequestContext context, final String message) 
	    throws Exception {
	    
    	final RequestURLConnection conn = new RequestURLConnection(new URL(value!=null?UPLOAD_PATH:uploadUPLOAD_PATH), HttpURLConnection.HTTP_CONNECTION_RECEIVE);
    	conn.setUseCaches(false);
    	
    	try {
    		conn.connect();
    	} catch (final java.net.ConnectException e) {
    		if (message!= null) {
	                throw e;
	        }
	    }
    	// if all the tests pass, success, otherwise it may go down.
    	assertTrue("Failed to reach the server.", (message==null|| message.isEmpty()));

    }
	
    
    // This test case does <b>NOT</b> use the JAXB library to generate the
    // XML data.  We do not want to use this test case directly.  There are many
    // ways of generating XML data, but this is a "real" way.
	public void testGenerateTextData(final ServletInputStream inputStream, final String encoding) throws FileNotFoundException, UnsupportedEncodingException, IOException, BadRequestTypeException {
		
		StringWriter writer = new StringWriter(2048);
		ServletInputStream in = getClass().getClassLoader().getResourceAsStream("content_data/text_data.txt");
		
}
}