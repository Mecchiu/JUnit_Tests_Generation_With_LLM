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

    @Test
    public void test() {
        // Make a test link to test the request context
        HttpURLConnection connection = (HttpURLConnection)javax.servlet.GenericServlet.class.getResource("default-file.xml").openConnection();
        connection.addRequestProperty("Content-Disposition","form-data;"+"filename=test.txt;filename*=test.xml;name=XML");
		String ctxt = connection.getResponseContentType();
        System.out.println(connection.getResponseHeader("Connection"));  

        // Asserts that the content type is set and matches the content type
        assertEquals(txt.contentType(),"text/xml");
        assertEquals(ctxt,"form-data; name=XML");
        assertTrue(connection.getResponseHeader("Connection")!=null);

        // Add extra information to the test link
        connection.setRequestProperty("Content-Type", "text/plain");
        connection.setRequestProperty("Accept-Charset", "ISO-8859-1");
        StringBuffer testLink = new StringBuffer();
        testLink.append("http://google.com ");
        testLink.append(connection.getRequestProperty("User-Agent"));
        testLink.append("/");
        testLink.append("HTTP/1.0");
        testLink.append(" ");
        testLink.append("Content-Disposition: form-data; name=\"image\"; filename=\"images/image.png\"");
        testLink.append("\n\n");
//        testLink.append("Content-Disposition: attachment; name=\"image\"; filename=\"images/image.png\"" +
//                "Content-Type: image/png\n\n");
        testLink.append("Content-Disposition: form-data; name=\"name\"; filename=\"test.txt\"\n") ; 
        testLink.append("Content-Type: application/octet-stream\n\n");
        testLink.append("Content-Disposition: form-data; name=\"image\"; filename=\"images/image.png\"");
        testLink.append("\n\n");
        testLink.append("Content-Type: application/octet-stream\n\n");
        connection.setRequestProperty("Content-Length", Integer.toString(testLink.length()));
        //System.out.println(testLink.toString());
//        connection.setResponseContentType("text/plain;charset=UTF-8");
    }

    static void doTest(HttpServletRequest request, String path, String flash) throws IOException {
        String url  = request.getRequestURI();
    Path    fl   = Paths.getFile(path);
    if (fl.seeksUp("/")) {
        int idx = url.lastIndexOf("/");
        flash   = url.substring(idx+1);
    }
        //System.out.println("flash: "+flash);
        // Make a test link to test the request context
        StringBuilder sb = new StringBuilder();
        HttpServletRequest proxyRequest = new HttpServletRequestWrapper(request) {
            @Override
            public String getHeaderField(int posn) {
                if (posn==0)
                    return super.getHeaderField(posn);
                return super.getHeaderField(posn);
            }
        };
        HttpURLConnection conn = (HttpURLConnection)proxyRequest.openConnection();
        conn.setRequestProperty("Content-Length", Integer.toString(
                conn.getContentLength()));
        conn.setRequestProperty("Accept", "file");
        conn.setRequestMethod("GET");
        conn.setRequestProperty("User-Agent", "JSCouchDB");
        conn.setRequestProperty("Accept-Charset", "ISO-8859-1");
        conn.setRequestProperty("Connection", "keep-alive");
        // Note: this has also been added when writing out the javadoc comments
        conn.setRequestProperty("Destination", "/");
        conn.setRequestProperty("X-Requested-With", "XMLHttpRequest");
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setDoOutput(true);
   
        // Output the HTML version of the request with no Flash added
        Writer writer = new StringWriter();
        ServletOutputStream wd = new ServletOutputStream(writer);
        outputRequest(writer, conn, flash);
        wd.close(); 
        outputRequest(writer, conn, "No Flash");
        conn.disconnect();
        
        File ff = new File("/Users/mdclinux/JVCResults");
        if (!ff.delete()) {
            System.err.println("Error: Could not delete "+ff.getAbsolutePath());
        }
        
        request.getContextPath();
        String file = "index.html";
        String relPath = request.getContextPath()+request.getServletPath();
        path = relPath+path;
        String content = writer.toString();
        // Convert the path to a relative path by removing everything after
        // the root of the request.
        int ct = content.indexOf(path);
        content = content.substring(0,ct);
        writer.close();
        streamToFile(writer.toString(), ff);
        writer = null;
    
        // Check whether the request has a form file inside the response
        // (using the ServletFileUpload class for this case).
        boolean foundFormFile = false;
        ServletFileUpload upload = new ServletFileUpload();
        try {
            FileUpload uploadFile = upload.parseRequest(request);
            foundFormFile = (uploadFile.getFileMap().size()>0);
        } catch (IllegalArgumentException e) {
            foundFormFile = false;
        }
        
        // Check whether the file has