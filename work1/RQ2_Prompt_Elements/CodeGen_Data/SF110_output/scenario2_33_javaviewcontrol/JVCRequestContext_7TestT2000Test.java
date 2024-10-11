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

    /**
     * This is a mock class with a number of methods that are used for testing.
     * Only the "followPath" methods are tested.
     * @author mike dooley
     */
    public static class URLInfo {
        /**
        * @param url
        * @return
        */
        public String getURL(String url) {
            // TODO Auto-generated method stub
            return url;
        }

        /**
        * @param url
        * @param path
        * @return
        */
        public String getURL(String url, String path) {
            // TODO Auto-generated method stub
            return url;
        }

        protected Collection<File> getFileListing(String url) {
            // TODO Auto-generated method stub
            return null;
        }
    }

    public static class HttpURLConnectionWrapper extends HttpURLConnection {

        /**
        * @param connection
        */
        public HttpURLConnectionWrapper(HttpURLConnection connection) {
            super(connection);
        }

        /**
        * @param connection
        * @param postFormUrlEncodedData
        */
        public HttpURLConnectionWrapper(HttpURLConnection connection, String postFormUrlEncodedData) {
            super(connection, postFormUrlEncodedData);
        }
    }
    
    private HttpURLConnection connection;
    
    private JVCRequestContextImpl context;
    
    private Collection<File> getFileListing(String url) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Create a JVCRequestContext instance.  Note that this class is not intended
     * to be run directly by an external JVM - use
     * {@link java.net.URLConnection#getURL()} to create an HttpURLConnection.
     */
    public JVCRequestContext_7Test() {
        super();
        context = new JVCRequestContextImpl(new HttpURLConnectionWrapper(connection));
    }

    static public class HttpServletResponseWrapper extends HttpServletResponseWrapper {

        public HttpServletResponseWrapper(HttpServletResponse response) {
            super(response);
        }

        public ServletOutputStream createOutputStream(boolean keepContent) {
            // TODO Auto-generated method stub
            return null;
        }

        public void write(int bRemaining) throws IOException {
            // TODO Auto-generated method stub
            
        }

        public void setHeader(String headerId, String headerValue) {
            // TODO Auto-generated method stub
            
        }

        public void setContentLength(int len) {
            // TODO Auto-generated method stub
            
        }

        public void flushBuffer() {
            // TODO Auto-generated method stub
            
        }

        public void resetBuffer() {
            // TODO Auto-generated method stub
            
        }

        public void setContentType(String contentType) {
            // TODO Auto-generated method stub
            
        }

    }
    
    
    /**
     * Test that a request for a resource using a JVB resource set can be passed as
     * a {@link FileUpload}.
     */
    public void testJVBFileUploadResourceRequest() throws Exception {
        
        MockRequest request = new MockRequest();
        request.setServletPath("/test");
        request.setMethod("GET");
        request.setParameter("file", "Test.JVB");        
        request.setPostFormData("file", "Test.JVB");
        request.setPostFormString("file", "Test.JVB");
        
        request.setPostFormString("file", "Test.JVB");
        request.setPostFormUrlEncoded("file", "Test.JVB");

        File file = new File("./src/test/resources/jvm/test/classes/com/pmdesigns/jvc/test.jvb");
        
        FileUpload upload = new ServletFileUpload(
            new ServletFileUpload.DiskUploadField(file)
        );
        
        HttpServletRequest servletRequest = new MockServletRequest(request,
                                                                  "POST", "POST", "POST", upload);

        JVCRequestContext t = new JVCRequestContextImpl(new HttpServletResponseWrapper(new HttpServletResponse(
                                                                                                                servletRequest,
                                                                                                                null)));

        String resp = t.makeLink(
                               "./src/test/resources/jvm/test/classes/com/pmdesigns/jvc/test.jvb",
                               "./test/resources/jvm/test/classes/com/pmdesigns/jvc/test.jvb");
        assertEquals("jvb test.jvb\n", resp);

        String postFormFilename = "test.jvb";
        MockFileUpload fileUpload = new MockFileUpload(request,
                                                      response,
                                                      file,
                                                      postFormFilename);
        String postFormUrlEncodedFilename = "Test.JVB";
        String postFormUrlEncodedPostFormFilename = "Test.JVB";        
        MockFileUpload fileUploadEncoded = new MockFileUpload(request,
                                                              response,
                                                              file,
                                                              postFormFilename,
                                                              postFormUrlEncodedFilename,
                                                              postFormUrlEncodedPostFormFilename);

        t = new JVCRequestContextImpl(new HttpServletResponseWrapper(new HttpServletResponse(
                                                                fileUpload,
                                                                postFormUrlEncoded)));                      
        resp = t.makeLink(
                               "./src/test/resources/jvm/test/classes/com/pmdesigns/jvc/test.jvb",
                               "./test/resources/jvm/test/classes/com/pmdesigns/jvc/test.jvb",
                               "index.jvb");          
        assertEquals("jvf index.jvf\njvf index2.