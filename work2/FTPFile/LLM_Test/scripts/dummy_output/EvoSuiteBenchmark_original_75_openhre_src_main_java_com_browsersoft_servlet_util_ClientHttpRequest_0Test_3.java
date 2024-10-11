// ClientHttpRequest_0Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post()} method.
*/
class ClientHttpRequest_0Test {
		
    @Test
    void test1() throws IOException {
        String s = this.post("/get/requestid.html");
        System.err.println(s);
        System.err.println(s.startsWith("OK"));
        s = this.post("/get/requestid.html", "contentType", "application/oeb+xml");
        System.err.println(s);
        System.err.println(s.startsWith("OK"));
        s = this.post("/get/requestid.html?format=contentType",
                "contentType", "application/oeb+xml");
        System.err.println(s);
        System.err.println(s.startsWith("OK"));
    }

    /**
     * posts the requests to the server, with all the cookies and parameters that were added
     *
     * @param s
     * @return  input stream with the server response
     * @throws java.io.IOException
     */
    public InputStream post(String s) throws IOException {
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Basic " +
                               Base64.encodeBase64(new Random().nextBytes()));

        URLConnection conn = createConnection(new File(s).toURI().toURL().toString(), headers);
        return conn.getInputStream();
    }

    /**
     * creates {@link URLConnection} for retrieving the body
     *
     * @param url
     * @param headers
     * @return {@link URLConnection} for retrieving the body
     */
    private static URLConnection createConnection(String url, Map<String, String> headers) {
        try {
            URLConnection conn = new URL(url).openConnection();
            conn.setConnectTimeout(4000);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
            InputStream in = conn.getInputStream();
            StringBuilder out = new StringBuilder();
            Iterator<String> iterator = headers.keySet().iterator();
            while (iterator.hasNext()) {
                String name = iterator.next();
                String value = headers.get(name);
                out.append(name + "=" + value).append("&");
            }
            out.deleteCharAt(out.length() - 1);
            conn.setRequestProperty("Content-length", out.toString());
            return conn;
        } catch(Exception e) {
            return null;
        }
    }
}