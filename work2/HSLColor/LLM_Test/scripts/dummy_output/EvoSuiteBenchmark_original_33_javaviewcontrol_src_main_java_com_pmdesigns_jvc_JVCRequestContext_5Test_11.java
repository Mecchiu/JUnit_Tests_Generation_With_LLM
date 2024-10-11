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
		
        public static final String RESOURCE_PATH = "/jvc/";
        public static final String BATCH_FILE_NAME = "test.txt";
        public static final String JSON_DATA = "{\"key\":\"value\"}";
        public static final int JSON_DATA_SIZE = 2;
        public static final String KEY = "key";
        public static final String VALUE = "value";
    public static final String INVALID_BATCH_DATA = "invalidBatchData";
        
    /**
     * Test constructor.
     * @throws Exception an error occurred.
     */
    @Test
    public void testConstructor() throws Exception {
        JVCRequestContext context = new JVCRequestContext(RESOURCE_PATH);
        assertNotNull(context);
    }

    /**
     * Test getter of servlet file uploads.
     * @throws Exception
     */
    @Test
    public void testGetServletFileUpload_GetServletFileUpload() throws Exception {
        // first create batch file
        String jsonData = "{"+KEY+",\"value\":\""+VALUE+"\"}";
        String uploadFilePath = RESOURCE_PATH + BATCH_FILE_NAME;
        File uploadFile = new File(uploadFilePath);
        OutputStream output = new FileOutputStream(uploadFilePath);
        ServletFileUpload upload = new ServletFileUpload();
        upload.setFileSizeMax(4000000);
        ServletInputStream input =
            new ServletFileInputStream(new FileInputStream(uploadFilePath));
        upload.addInputStream(input);
        upload.setHeader("content-type", "application/json;charset=UTF-8");
        
        // create server side request
        BufferedInputStream bis = new BufferedInputStream(input);
        HttpServletRequest request = new HttpServletRequest();   
        request.setContentLength(jsonData.length());
        request.setCharacterEncoding("UTF-8");
        request.setContextPath(RESOURCE_PATH);
        
        // invoke the getter method for servlet file upload
        servletFileUploadGetMethod(request, upload, bis);
        
        
        // now test get a file from the server side.  There is no need to use the
        // ContentLength header, because that is handled by the Content-Length 
        // header (and therefore an additional request to the server is used).
        // Also, the servlet file upload should now have a File object.
        bis.close();
        
        HttpURLConnection connection = (HttpURLConnection) request.openConnection();
        try {
            assertNotNull(connection.getRequestMethod());
            assertEquals(connection.getRequestMethod(), "POST");
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestProperty("content-type", "application/json;charset=UTF-8");
            
            // now send the data in the response
            Writer writer = new StringWriter();
            connection.setRequestProperty("Connection", "close");
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(jsonData);
            bw.flush();
            connection.disconnect();
            assertEquals(writer.toString(), "{"+JSON_DATA+"}");
        } finally {            
            connection.disconnect();
        }
    }

    private void servletFileUploadGetMethod(HttpServletRequest request, ServletFileUpload upload, BufferedInputStream bis) throws IOException {
        // add the key to the request.  We use a hard encoded key because we can 
        // (under the current limitations) not have multiple simultaneous uploads 
        // to the same file
        request.setAttribute(KEY, "<"+KEY+">");
        // now check the request for validation
        if (request.getAttribute(KEY)!= null) {
            request.removeAttribute(KEY);
        }
        // check the request Content-Type
        String contentType = request.getContentType();
        request.removeAttribute("Content-Type");
        if (contentType == null
                || (contentType.contains(MediaType.APPLICATION_JSON)!= Boolean.TRUE)) {
            request.setAttribute("Content-Type", MediaTypeParse.APPLICATION_JSON);
        }
        // validate the data and save it for later.  This is needed to do a
        // post because the upload is sent by the server in two different
        // cases
        byte[] bytes = new byte[2];
        bufferedInputStreamRead(bis, bytes, 2);
        byte[] buf = {(byte)0x00, (byte)0x34};
        assertEquals(contentType, MediaTypeParse.UTF_8_MEDIA_TYPE);
        assertArrayEquals(buf, bytes);

        request.setAttribute(KEY, upload.getName());  
        request.setAttribute("Content-Length", String.valueOf(upload.getSize()));

        connectionClose(bis);
    }
    
    private void bufferedInputStreamRead(BufferedInputStream bis, byte[] buf, int len) throws IOException {
        int bytesRemaining = len;
        int read = bis.read(buf, 0, len);                  
        while (read > 0) {
            // we want to keep at least one byte of the file 
            bytesRemaining--; 
            int numRead = bis.read(buf, 0, buf.length);
            assertEquals("bufferedInputStreamRead failed to read as it requested more data",
                    read, numRead);
        }
        
        assertEquals("bufferedInputStreamRead failed to receive a full buffer",
                bytesRemaining, 0);
        //assertTrue("bufferedInputStreamRead failed to read any data",
        //        bytesRemaining <= upload.getSize());
        
        assertEquals("BufferedInputStream read failed to handle the complete file",
                len, bytesRemaining);
    }
    private void connectionClose(BufferedInputStream bis) throws IOException { 
        if (bis!= null) bis.close();
    }

    private void connectionClose(HttpURLConnection connection) throws IOException {
        if (connection!= null) {
            connection.disconnect();
        }
    }
}