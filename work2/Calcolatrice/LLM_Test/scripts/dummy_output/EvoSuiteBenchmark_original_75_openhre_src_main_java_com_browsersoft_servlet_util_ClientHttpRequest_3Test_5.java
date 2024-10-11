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
		
    @Test
    void test() throws IOException {
    	
        String method = "GET";
        String urlStr = "http://www.browsersoft.com/servlet_context/util/client_http_request_1/GET";
        String pathname = urlStr + "?path=";
        String queryStr = "?path=";

        String content = "My HTTP Body";
            
        URLConnection connection1 = new URL(urlStr).openConnection();
        connection1.setRequestMethod(method);
        connection1.getConnect();


        String path = "path";

        connection1.getInputStream();
        connection1.getHeaderFields();
        URLConnection connection;
        URLConnection connection2;
        URLConnection connection3;
        URLConnection connection4;

        connection = new URL(urlStr).openConnection();
        connection.setRequestMethod(method);
        connection.getConnect();

        connection2 = new URL(urlStr).openConnection();
        connection2.setRequestMethod(method);
        connection2.getConnect();

        connection3 = new URL(urlStr).openConnection();
        connection3.setRequestMethod(method);
        connection3.getConnect();

        connection4 = new URL(urlStr).openConnection();
        connection4.setRequestMethod(method);
        connection4.getConnect();

        // Get the input stream of the resource
        connection.addRequestProperty("User", "user");
        connection.addRequestProperty("Pass", "passwort");
        connection.setRequestProperty("Content-Length", "" + content.length());
        connection.addRequestProperty("Content-Type", "text/plain");
        connection.addRequestProperty("Content-Disposition",
                "attachment;filename=" + path + ";filename*=txt_" +
                        new Random().nextInt() + ".txt");
        connection4.addRequestProperty("User", "user2");
        connection4.addRequestProperty("Pass", "passwort2");

        // Read the data in the input stream of the resource
        try (OutputStream out = connection.getOutputStream();
             InputStream in = connection.getInputStream()) {
            String inStr;

            int byteRead;
            while ((byteRead = in.read())!= -1) {
                out.write(byteRead);
            }

        }

        assertEquals("response", content, connection.getResponseCode());
        assertEquals("response", "Ok", connection.getResponseMessage());
        assertTrue("hasCookies", connection.getHeaderFields().get("set-cookie")
               != null);

        // Get the connection with Cookies
        connection = ((URLConnection) connection.getConnection());
        Iterator it = connection.getHeaderFields().keySet().iterator();
        while (it.hasNext()) {
            String name = (String) it.next();
            if (name.contains("Cookie")) {
                assertTrue("has cookies",
                        connection.getHeaderFields().containsKey("set-cookie"));
            }
        }

        // Get the connection with a new connection
        connection = ((URLConnection) connection.getConnection());

        assertEquals("response", content, connection.getResponseCode());
        assertEquals("response", "Ok", connection.getResponseMessage());
        assertTrue("has cookies", connection.getHeaderFields().get("set-cookie")
               != null) ;
        
        // Get the cached connection with a new connection
        connection4 = ((URLConnection) connection.getConnection()).get();
        assertEquals("response", content, connection4.getResponseCode());
        assertEquals("response", "Ok", connection4.getResponseMessage());
        assertTrue("has cookies", connection4.getHeaderFields().get("set-cookie")
               != null);
        
        //
        // Make a request with no parameters
        //
        urlStr = "http://www.browsersoft.com/servlet_context/util/client_http_request_2/GET";
        assertNull("request", connection.getInputStream());
        assertEquals("no params", method, connection.getRequestMethod());
    }




}