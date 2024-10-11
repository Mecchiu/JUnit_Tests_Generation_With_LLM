// ClientHttpRequest_3Test.java
package com.browsersoft.servlet.util;

import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.InputStream;
import java.util.Random;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientHttpRequest}.
* It contains one unit test case for the {@link ClientHttpRequest#post(Map, Map)} method.
*/
class ClientHttpRequest_3Test {

    /**
     * Test setter methods of {@link ClientHttpRequest}.
     */
    @Test
    public void setters() throws IOException{
        String testUri = "http://localhost:8188/" + new Random().nextInt(1000) + "/com.google.sample.Application1/"; // 10mb
        String request = "GET "+ new Random().nextInt(10000) + " HTTP/1.0\r\n"+
                "Host: 10.1.2.3\r\n"+
                "Connection: close\r\n"+
                "X-First-Line: test";
        ClientHttpRequest request1 = new ClientHttpRequest(request);
        ClientHttpRequest request2 = new ClientHttpRequest();
        assertTrue(request1.equals(request2));
        assertNotEquals(request1.hashCode(), request2.hashCode());
    }

    @Test
    public void getters() throws IOException{
        String testUri = "http://localhost:8188/1f43d/java/test/test.jpg"; // 0mb
        String request = "GET "+ new Random().nextInt(10000) + " HTTP/1.1\r\n"+
                "Host: 10.1.2.3\r\n"+
                "Connection: close\r\n"+
                "X-First-Line: test\r\n"+
                "User-Agent: " + ClientHttpRequest.UA_STRING + "\r\n"+
                "Accept-Encoding: gzip, deflate, nocompress, deflate\r\n"+
                "Accept-Language: en-US, es-ES\r\n"+
                "Accept-Charset: ISO-8859-1, UTF-8\r\n"+
                "Accept: " + ClientHttpRequest.ACCEPT_STRING + "\r\n"+
                "Accept-Ranges: bytes\r\n"+
                "Accept-Encoding: gzip\r\n"+
                "Accept-Language: en-US\r\n"+
                "Host: 10.1.2.3";
        ClientHttpRequest request1 = new ClientHttpRequest(request);
        assertEquals(ClientHttpRequest.STATUS_OK, request1.getStatusCode());
        assertEquals(ClientHttpRequest.STATUS_OK, request1.getStatusCode());
        
        String testImage = "/home/test/test.jpg";
        String tempFile = "/testTemp/testTemp.jpg";
        String testFile = testImage.substring(0, (testImage.lastIndexOf(tempFile)+1)); // 3.44m
        RequestFileHeader requestFileHeader = new RequestFileHeader(testFile, "test");
        assertEquals(ClientHttpRequest.STATUS_OK, request1.setFileHeader(requestFileHeader));
        
        assertFalse(request1.getBytes(ClientHttpRequest.BODY_FILE_HEADER));
        File file = new File(testFile);
        assertFalse(file.exists());
        assertTrue(file.canRead());
        assertEquals(FileHeader(testFile), request1.getFileHeader());
    }
}
