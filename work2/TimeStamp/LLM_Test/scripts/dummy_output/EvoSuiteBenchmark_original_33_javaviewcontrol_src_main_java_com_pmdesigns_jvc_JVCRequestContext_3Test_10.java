// JVCRequestContext_3Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getAttribute(String)} method.
*/
class JVCRequestContext_3Test {
		/**
     * Unit test case for getAttribute.
     */
    @Test
    void testGetAttributeFromHttpRequest() {
        String contentType = getRequest().getContentType();

        String result = request.getHeader("Content-Encoding");
        assertEquals("No Content-Encoding header", null, result);

        request.setHeader(HttpHeaders.CONTENT_ENCODING, "gzip");
        request.setContentType("application/x-zip-compressed");

        byte[] body = request.getInputStream().readAll();

        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        Streams.copy(body, stream);

        request.setContent(stream);
        request.setHeader("Accept", "text/html; charset=utf-8");
        request.setContentType("text/html");

        request.setHeader("Content-length", "" + body.length);
        request.setContentLength(0);

        request.setHeader("Vary", "Accept-Encoding");
        request.setHeader("Vary", "Accept-Encoding"); // make it match content type

        request.getContext().setAttribute("FLASH", new HashMap());

        ByteArrayInputStream bav = httpRequestContext.getInputStream();
        bav.skip(8);
        int ct;
        try {
            try {
                do {
                    assertEquals("Content-Length", "4", request.getHeader("Content-Length"));
                    ct = bav.read();
                } while (ct!= -1);

                assertEquals("Content-Transfer-Encoding", "gzip", request.getHeader("Content-Transfer-Encoding"));
                assertEquals("Accept", "text/html; charset=utf-8", request.getHeader("Accept"));

                // assert that a large enough body was returned
                byte[] data = bav.read(4);
                if (data!= null) {
                    assertEquals("Content-Length", "4", request.getHeader("Content-Length"));
                    assertEquals("Content-Transfer-Encoding", "base64", request.getHeader("Content-Transfer-Encoding"));
                    assertEquals("Accept-Encoding", "base64", request.getHeader("Accept-Encoding"));

                    byte[] buf = Arrays.copyOfRange(data, 4, data.length);
                    assertArrayEquals("Content", new byte[] { 1, 2, 3, 4 }, buf); // FIXME

                    // FIXME: it should be possible to get a single byte using the body.
                    //        That should do the trick I think

                }
                do {
                    assertEquals("Content-Length", "0", request.getHeader("Content-Length"));
                    ct = bav.read();
                } while (ct!= -1);

                do {
                    assertEquals("Content-Length", "4", request.getHeader("Content-Length"));
                    ct = bav.read();
                } while (ct!= -1);

            } catch (Exception badBody) {
                // the body could not be read.
            }
        } catch (Exception badBody) {
            throw new RuntimeException("Error parsing request : " + badBody.toString());
        }
        assertFalse("No body was returned", bav.read()!= -1);
    }

    /**
     * Unit test for getInputStream().
     */
    @Test
    void testGetInputStreamWithMultipart() {

        // start a real mock request
        MockRequest request = new MockRequest("http://www.mycompany.com/");
        request.setContentType("text/html");
        request.setContentLength(13);
        request.setFilename("/file.txt");
        request.setContent("<?xml version=\"1.0\"?><html><body><a href=\"/\" /></a></body></html>");
        request.setContentEncoding("gzip");
        request.setContent(new RandomAccessFile("file.txt", "r"));

        // a large body
        request.setContentType("text/html");
        request.setContentLength(5 * 1024);
        request.setFilename("/file.txt");

        // set the start position
        request.setStartPosition(12);

        // build the request for input
        ServletFileUpload upload = new ServletFileUpload(new MockFileItemFactory());
}
}