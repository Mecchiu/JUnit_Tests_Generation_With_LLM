// JVCRequestContext_7Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#makeLink(String, String)} method.
*/
class JVCRequestContext_7Test {
		
    final String JVCRequestContext_7Test_url = "http://localhost:8000/jvc_request_context/";
    
    /**
     * Unit test of {@link JVCRequestContext#makeLink(String, String)} method.
     */
    @Test
    public void testDoRequest_makeLink() throws Exception {
        String expected = "<link href=\"index.jsp\" target=\"_blank\" rel=\"stylesheet\" type=\"text/css\" />";
        setUpMocks_getRequestContext(expected);
        JVCRequestContext context = new JVCRequestContext(JVCRequestContext_7Test_url+"getRequestContext");
        context.doRequest();
        String result = getRequestContext();
        assertEquals(expected, result);
    }
    
    /**
     * Unit test of {@link JVCRequestContext#makeLink(String, String)} method.
     */
    @Test
    public void testDoRequest_linkToAbsolute() throws Exception {
        String expected = "<link href=\"" + JVCRequestContext_7Test_url + "getRequestContext\" rel=\"stylesheet\" type=\"text/css\" />";
        setUpMocks_getRequestContext(expected);
        JVCRequestContext context = new JVCRequestContext(JVCRequestContext_7Test_url+"getRequestContext");
        context.doRequest();
        String result = getRequestContext();
        assertEquals(expected, result);
    }

    /**
     * Unit test of {@link JVCRequestContext#makeLink(String, String)} method.
     */
    @Test
    public void testDoRequest_linkToRelative() throws Exception {
        String expected = "<link href=\"" + JVCRequestContext_7Test_url + "getRequestContext\" rel=\"stylesheet\" type=\"text/css\" />";
        setUpMocks_getRequestContext(expected);
        JVCRequestContext context = new JVCRequestContext(JVCRequestContext_7Test_url+"getRequestContext");
        context.doRequest();
        String result = getRequestContext();
        assertEquals(expected, result);
    }

    /**
     * Unit test of {@link JVCRequestContext#openRequest(Enumeration fileEnumeration)} method.
     */
    @Test
    public void testOpenRequest() throws Exception {
        setUpMocks_openRequest(Arrays.asList("test1", "test2"), Arrays.asList("test3"));
        JVCRequestContext context = new JVCRequestContext(JVCRequestContext_7Test_url + "openRequest");
        context.openRequest();
        assertEquals("test1", context.getAttribute("file"));
        assertEquals("test2", context.getAttribute("url"));
        assertTrue(context.isRequestContextInitialized());
    }

    /**
     * Test of getRequestContext method, of class JVCRequestContext.
     */
    @Test
    public void testGetRequestContext() throws Exception {
        setUpMocks_getRequestContext("");
        assertNull(getRequestContext());
    }

    /**
     * Test of clearRequestContext method, of class JVCRequestContext.
     */
    @Test
    public void testClearRequestContext() throws Exception {
        setUpMocks_clearRequestContext("");
        assertNull(getRequestContext());
    }

    /**
     * Test of processRequestMethod and processRequest method, of class JVCRequestContext.
     * @throws Exception
     */
    @Test
    public void testProcessRequest_shouldParseRequestMethodAndRequest() throws Exception {
        setUpMocks_parseRequest();
        String method = "POST";
        JVCRequestContext context = new JVCRequestContext(JVCRequestContext_7Test_url + "getRequestContext");
        context.processRequest(method, "/", HttpServletResponse.SC_OK );
        String result = getRequestContext();
        assertEquals( "POST", result );
    }


    /**
     * Test of processRequest method, of class JVCRequestContext.
     * @throws Exception
     */
    @Test
    public void testProcessRequest_shouldParseRequestFieldsAndRequest() throws Exception {
        String method = "POST";
        String fields = "field=value";
        JVCRequestContext context = new JVCRequestContext(JVCRequestContext_7Test_url + "getRequestContext");
        context.processRequest(field, value, method);
        String result = getRequestContext();
        assertEquals( fields, result);
    }


    /** Utility method used to set up the mocks for a request context.
     * @param fields a string of the form field=value
     */
    void setUpMocks_parseRequest(String fields) {
        ServletFileUpload upload = new ServletFileUpload();
        ServletInputStream inputStream = new ServletInputStream();
        inputStream.readLine();
        inputStream.read();
        ServletRequestAttributeKey key;
        key = new ServletRequestAttributeKey("files");
        inputStream = upload.parseRequest(key, inputStream);
        Map<String,String> temp = new HashMap<String, String>();
        temp.put("name","file");
        inputStream = upload.stream(inputStream, temp);
        temp = new HashMap<String,String>();
        mapFileFieldToValue(fields, temp);
    }

    /** Utility method used to set up the mocks for the request context.
     * @param fields a single string of the form field=value
     */
    void setUpMocks_streamRequest(String fields) {
        ServletFileUpload upload = new ServletFileUpload();
        ServletInputStream inputStream = new ServletInputStream();
        inputStream.readLine();
        inputStream.read();
        ServletRequestAttributeKey key;
        key = new ServletRequestAttributeKey("files");
        inputStream = upload.parseRequest(key, inputStream);
        Map<String,String> temp = new HashMap<String, String>();
        temp.put("name",fields);
        inputStream = upload.stream(inputStream, temp);
        temp = new HashMap<String,String>();
}
}