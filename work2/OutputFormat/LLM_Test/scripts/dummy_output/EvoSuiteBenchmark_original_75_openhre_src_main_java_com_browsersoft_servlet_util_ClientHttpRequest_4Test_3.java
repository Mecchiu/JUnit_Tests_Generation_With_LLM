// ClientHttpRequest_4Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
*/
class ClientHttpRequest_4Test {
		
    private static final Random RANDOM = new Random(RANDOM_SID);

    @Test
    void testClientHttpRequestPOST_1()throws java.net.MalformedURLException, IOException {
        URL url = new URL("http://www.google.com");
        URLConnection connection = url.openConnection();
        connection.setInstanceFollowRedirects(false);
        ClientHttpRequest.post(new String[] {"redirect", "http://www.google.com"}, new Object[] {});
        //assertTrue(connection.getHeaderFields().containsKey("_redirect_url"));
        assertNull(connection.getHeaderField("_redirect_url"));
        assertNull(connection.getHeaderField("_redirect_uri"));
        assertEquals("http", connection.getRequestProperty("_redirect"));
        assertEquals("http://www.google.com", connection.getRequestProperty("_redirect_to"));
        assertEquals("http://www.google.com", connection.getRequestProperty("_redirect_uri"));
        assertEquals("grant_uri=[fJvKVj4mq2y4e3]", connection.getRequestProperty("X-Grant-Uri"));
        assertEquals("grant_uri=[fJvKVj4mq2y4e3]", string2QueryString(connection.getRequestProperty("X-Grant-Uri")));
        assertEquals("client_redirect_uri", connection.getRequestProperty("grant_uri"));
        assertEquals("client_redirect_uri", string2QueryString(connection.getRequestProperty("grant_uri")));
    }

    @Test
    void testClientHttpRequestPOST_2()throws java.net.MalformedURLException, IOException {
        URL url = new URL("http://www.bobcat.com");
        URLConnection connection = url.openConnection();
        connection.setInstanceFollowRedirects(false);
        ClientHttpRequest.post(new String[] {"grant", "https://www.bobcat.com"},  new Object[] {});
        //assertTrue(connection.getHeaderFields().containsKey("_redirect_uri"));
        assertNull(connection.getHeaderField("_redirect_uri"));
        assertNull(connection.getHeaderField("_redirect_url"));
        assertNull(connection.getHeaderField("_redirect"));
        assertEquals("https://www.bobcat.com", connection.getRequestProperty("_redirect_to"));
        assertEquals("client_redirect_uri", connection.getRequestProperty("grant_uri"));
        assertEquals("client_redirect_uri", string2QueryString(connection.getRequestProperty("grant_uri")));
        assertEquals("client_redirect_uri", connection.getRequestHeader("grant_uri"));
        assertEquals("client_redirect_uri", string2QueryString(connection.getRequestHeader("grant_uri")));
    }

    @Test
    void testClientHttpRequestPOST_3()throws java.net.MalformedURLException, IOException {
        URL url = new URL("http://www.bobcat.com");
        URLConnection connection = url.openConnection();
        connection.setInstanceFollowRedirects(false);
        ClientHttpRequest.post(new String[] {"grant", "https://www.bobcat.com"}, new Object[] {generateParameterMap()});
        //assertTrue(connection.getHeaderFields().containsKey("_redirect_url"));
        assertNull(connection.getHeaderField("_redirect_url"));
        assertNull(connection.getHeaderField("_redirect_uri"));
        assertEquals("https://www.bobcat.com", connection.getRequestProperty("_redirect_to"));
        assertEquals("client_redirect_uri", connection.getRequestProperty("grant_uri"));
        assertEquals("client_redirect_uri", string2QueryString(connection.getRequestProperty("grant_uri")));
        assertEquals("client_redirect_uri", connection.getRequestHeader("grant_uri"));
        assertEquals("client_redirect_uri", string2QueryString(connection.getRequestHeader("grant_uri")));
    }

    @Test
    void testClientHttpRequestPOST_4()throws java.net.MalformedURLException, IOException {
        URL url = new URL("http://www.bobcat.com");
        URLConnection connection = url.openConnection();
        connection.setInstanceFollowRedirects(false);
        ClientHttpRequest.post(new String[] {"grant", "http://www.bobcat.com"}, new Object[] {generateParameterMap()});
        //assertTrue(connection.getHeaderFields().containsKey("_redirect_url"));
        assertNull(connection.getHeaderField("_redirect_url"));
        assertEquals("https://www.bobcat.com", connection.getRequestProperty("_redirect_to"));
        assertEquals("client_redirect_uri", connection.getRequestProperty("grant_uri"));
        assertEquals("client_redirect_uri", string2QueryString(connection.getRequestProperty("grant_uri")));
        assertEquals("client_redirect_uri", connection.getRequestHeader("grant_uri"));
        assertEquals("client_redirect_uri", string2QueryString(connection.getRequestHeader("grant_uri")));
    }

    static Map<String, String> generateParameterMap() {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("action", "POP");
        paramMap.put("grant", "refresh_token");
        paramMap.put("client_id", "fJvKVj4mq2y4e3");
        paramMap.put("client_secret", "p0r3p0rf");
        return paramMap;
    }

    protected Map<String, String> string2QueryString(String queryString) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("redirect", "http://www.google.com");
        //paramMap.put("grant_uri", "client_redirect_uri");
}
}