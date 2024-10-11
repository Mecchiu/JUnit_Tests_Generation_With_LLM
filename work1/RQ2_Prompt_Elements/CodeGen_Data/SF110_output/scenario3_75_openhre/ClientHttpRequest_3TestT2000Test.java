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
// This class is not tested yet.
}


// ClientHttpRequest_4Test.java

class ClientHttpRequest_4Test {

    @Test
    void ClientHttpRequest_4Test1() {
        String url = "/";
        String pathPart = "/";
        String pathPart2 = "/";

        // Check if GET works
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new String[] {}, new String[] {});
        clientHttpRequest
               .get(
                        "http://localhost:8080/testdata?test=http%3A%2F%2Fwww.google.com%3A819%2Ffiledata",
                        new HashMap<String,String>() {{
                            put("pathPart", pathPart);
                            put("pathPart2", pathPart2);
                        }});
        assertEquals(true, clientHttpRequest.isReady());
        assertEquals("http://www.google.com/", clientHttpRequest.getResponseHeader("Host"));

        // Check if POST works
        clientHttpRequest = new ClientHttpRequest(new String[] {}, new String[] {"user",
                "password", "test"});
        clientHttpRequest.post(new HashMap<String, String>() {{
            put("name", "name14");
            put("password", "password14");
            put("test", "value13");
        }});
        assertEquals(true, clientHttpRequest.isReady());
        assertEquals("http://www.google.com/", clientHttpRequest.getResponseHeader("Host"));
        assertTrue(String.format("%s!= %s", clientHttpRequest.getResponseHeader("X-Host"), clientHttpRequest.getResponseHeader("X-HostName")),
                clientHttpRequest.isSuccessful() && clientHttpRequest.getResponseHeader("X-Host").equals("www.google.com"));
        clientHttpRequest.get("user", "password", "test");
    }

    @Test
    void ClientHttpRequest_4Test2() {
        String url = "/";
        String pathPart = "/";
        String pathPart2 = "/";

        // Check if GET works
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new String[] {}, new String[] {"user",
                "password", "test"});
        clientHttpRequest
               .get(
                        "http://localhost:8080/testdata?test=http%3A%2F%2Fwww.google.com%3A819%2Ffiledata",
                        new HashMap<String,String>() {{
                            put("pathPart", pathPart);
                            put("pathPart2", pathPart2);
                        }});
        assertEquals(true, clientHttpRequest.isReady());
        assertEquals("http://www.google.com/", clientHttpRequest.getResponseHeader("Host"));

        // Check if POST works
        clientHttpRequest = new ClientHttpRequest(new String[] {}, new String[] {"user",
                "password", "test"});
        clientHttpRequest.post(new HashMap<String, String>() {{
            put("name", "name14");
            put("password", "password14");
            put("test", "value13");
        }});
        assertEquals(true, clientHttpRequest.isReady());
        assertEquals("http://www.google.com/", clientHttpRequest.getResponseHeader("Host"));
        assertTrue(String.format("%s!= %s", clientHttpRequest.getResponseHeader("X-Host"), clientHttpRequest.getResponseHeader("X-HostName")),
                clientHttpRequest.isSuccessful() && clientHttpRequest.getResponseHeader("X-Host").equals("www.google.com"));
        clientHttpRequest.get("user", "password", "test");
    }

    @Test
    void ClientHttpRequest_4Test3() {
        String url = "/";
        String pathPart = "/";
        String pathPart2 = "/";
        String header = "A";
        String contentType = "text/plain";
        String body = "Body of test";
        String date = "yyyy-MM-dd HH:mm:ss.SSS";

        String cookies = "fo";
        String parameters = new HashMap<String, String>() {{
            put("header", header);
            put("date", date);
            put("content", contentType);
            put("parameters", parameters);
        }};

        // Check if GET works
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new String[] {}, new String[] {"user",
                "password", "test"});
        clientHttpRequest
               .get(
                        "http://localhost:8080/testdata?test=http%3A%2F%2Fwww.google.com%3A819%2Ffiledata",
                        new HashMap<String, String>() {{
                            put("pathPart", pathPart);
                            put("pathPart2", pathPart2);
                            put("header", header);
                            put("content", contentType);
                            put("date", date);
                            put("parameters", parameters);
                        }});
        assertEquals(true, clientHttpRequest.isReady());
        assertEquals("http://www.google.com/", clientHttpRequest.getResponseHeader("Host"));
        assertEquals(clientHttpRequest.getResponseBody(), body);

        // Check if POST works
        clientHttpRequest = new ClientHttpRequest(new String[] {}, new String[] {"user",
                "password", "test"});
        clientHttpRequest
               .post(new HashMap<String, String>() {{
                    put("name", "name14");
                    put("password", "password14");
                    put("date", date);
                    put("content", contentType);
                    put("parameters", parameters);
                    put("headers", header);
                    put("cookies", cookies);
                }});
        assertEquals(true, clientHttpRequest.isReady());
        assertEquals("http://www.google.com/", clientHttpRequest.getResponseHeader("Host"));
        assertTrue(String.format("%s!= %s", clientHttpRequest.getResponseHeader("X-Host"), clientHttpRequest.getResponseHeader("X-HostName")),
                clientHttpRequest.isSuccessful() && clientHttpRequest.getResponseHeader("X-Host").equals("www.google.com"));
        clientHttpRequest.post(new HashMap<String, String>() {{
            put("name", "