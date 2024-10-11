// ClientHttpRequest_1Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(Map)} method.
*/
class ClientHttpRequest_1Test {
		
    private final int timeout = 10000;  // 10000 milliseconds for server response

    @Test
    public void testGetResponse_URLWithClientCookieAndURLWithoutURL() throws IOException
    {
        ClientHttpRequest httpRequest = new ClientHttpRequest(new URL("http://james.example.com"), timeout, "china2");
        
        String response = httpRequest == null? "http://james.example.com:8089/china2" : "http://james.example.com";
        
        assertNotNull(httpRequest);
        assertEquals("http://james.example.com", httpRequest.getRequestURI());
        assertEquals(new URL("http://james.example.com", 80, "china2"), new URL(httpRequest.getRequestURI(), httpRequest.getMethod()));
        assertNotNull(response);
        response = httpRequest;
        assertEquals("http://james.example.com", httpRequest.getRequestURI());
        assertEquals(new URL("http://james.example.com", 80, "china2"), new URL(httpRequest.getRequestURI(), httpRequest.getMethod()));
        
        try(OutputStream out = httpRequest.post(null)) {
        	assertNotNull(out);
        	out.write(new byte[1]);
        }
        
        assertNotNull(response);
        response = httpRequest;
        assertEquals("http://james.example.com", httpRequest.getRequestURI());
        assertEquals(new URL("http://james.example.com", 80, "china2"), new URL(httpRequest.getRequestURI(), httpRequest.getMethod()));
        
        httpRequest = new ClientHttpRequest(new URL("http://localhost:8888/update-china"), timeout, "china2");
        assertNotNull(httpRequest);
        
        response = httpRequest;
        assertEquals("http://localhost:8888/update-china", httpRequest.getRequestURI());
        assertEquals(new URL("http://localhost:8888/update-china", 80, "china2"), new URL(httpRequest.getRequestURI(), httpRequest.getMethod()));
    }
    
    @Test
    public void testGetResponse_URLWithoutClientCookieAndURL() throws IOException
    {
        ClientHttpRequest httpRequest = new ClientHttpRequest(new URL("http://james.example.com"), timeout, "china2");
        
        String response = httpRequest == null? "http://james.example.com:8089/china2" : "http://james.example.com";
        
        assertNotNull(httpRequest);
        assertEquals("http://james.example.com", httpRequest.getRequestURI());
        assertEquals(new URL("http://james.example.com", 80, "china2"), new URL(httpRequest.getRequestURI(), httpRequest.getMethod()));
        assertNotNull(response);
        response = httpRequest;
        assertEquals("http://james.example.com", httpRequest.getRequestURI());
        assertEquals(new URL("http://james.example.com", 80, "china2"), new URL(httpRequest.getRequestURI(), httpRequest.getMethod()));
        
        try(OutputStream out = httpRequest.post(null)) {
        	assertNotNull(out);
        	out.write(new byte[1]);
        	assertEquals(new byte[1], out.read());
        }
        
        assertNotNull(response);
        response = httpRequest;
        assertEquals("http://james.example.com", httpRequest.getRequestURI());
        assertEquals(new URL("http://james.example.com", 80, "china2"), new URL(httpRequest.getRequestURI(), httpRequest.getMethod()));
        
        httpRequest = new ClientHttpRequest(new URL("http://localhost:8888/update-china"), timeout, "china2");
        assertNotNull(httpRequest);

        response = httpRequest;
        assertEquals("http://localhost:8888/update-china", httpRequest.getRequestURI());
        assertEquals(new URL("http://localhost:8888/update-china", 80, "china2"), new URL(httpRequest.getRequestURI(), httpRequest.getMethod()));
        
        try(OutputStream out = httpRequest.post(null)) {
        	assertNotNull(out);
        	out.write(new byte[1]);
        	assertEquals(new byte[1], out.read());
        }
        
        assertNotNull(response);
        response = httpRequest;
        assertEquals("http://localhost:8888/update-china", httpRequest.getRequestURI());
        assertEquals(new URL("http://localhost:8888/update-china", 80, "china2"), new URL(httpRequest.getRequestURI(), httpRequest.getMethod()));
        
        httpRequest = new ClientHttpRequest(null, timeout, "china2");
        assertNotNull(httpRequest);

        response = httpRequest;
        assertEquals("http://localhost:8888/update-china", httpRequest.getRequestURI());
        assertEquals(new URL(null, 80, "china2"), new URL(httpRequest.getRequestURI(), httpRequest.getMethod()));
        
        httpRequest = new ClientHttpRequest(null, null, "china2");
        assertNotNull(httpRequest);

        response = httpRequest;
        assertNotEquals(new URL(null, 80, "china2"));
        

        try(OutputStream out = httpRequest.post(null)) {
        	assertNotNull(out);
        	out.write(new byte[1]);
        	assertEquals(new byte[1], out.read());
        	System.out.println(out);
        }
        
        System.out.println("------------------------------------");
        
        httpRequest = new ClientHttpRequest(new URL("http://localhost:8888/"), timeout, "china2");
        //should not return with status code 0 (400 error)
        assertNotNull(httpRequest);

        response = httpRequest;
        assertNotEquals("http://localhost:8888/", response);

        httpRequest = new ClientHttpRequest(new URL("http://localhost:8888/"), "a");
        assertNotNull(httpRequest);

        response = httpRequest;
        assertNotEquals("http://localhost:8888/", response);
        
}
}