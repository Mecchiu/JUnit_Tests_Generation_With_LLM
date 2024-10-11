// ClientHttpRequest_7Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_7Test {
		
    static final int SIZE = 10;
    
    @Test
    public void test_1() throws IOException {
                                   
        checkClientHttpRequest("/users/*/friends",
                        0,      // expected params
                        100,     // expected response length
                        0,      // expected response content
                        0,      // expect client cookie
                       true);
        
    }
    
    @Test
    public void test_2() throws IOException {
                                   
        checkClientHttpRequest("/test_1",
                        0,      // expected params
                        100,     // expected response length
                        null,     // expect client cookie
                       true);
        
    }
    
    public void checkClientHttpRequest(String url, int expectedLength, int expectedContentLength,
                                       int expectedCookieLength, boolean expectClientCookie) throws IOException {
        
        StringBuilder sb = new StringBuilder();
        
        StringBuilder response = new StringBuilder();
        sb.append(expectedLength);
        sb.append("\r\n");
        for (int i=0; i<expectedLength; i++) sb.append(" ");
        sb.append("\r\n");
        for (int i=0; i<4096; i++) { 
        	sb.append(" ");
        }
        sb.append("\r\n");
        
        final Map<String, String> parameters = new HashMap<String, String>();     
        parameters.put("first", first);
        parameters.put("second", second);
        Map<String, String> headers = new HashMap<String, String>();                         
        headers.put("cookie",  "thisisawaitasyncwakaswawasawawasawasawawasawasawasawasawawasawasawasawasawasawawasawasawawasawawasawasawawasawawasawawasawasawawasawawasawasawacew",
                "something");
        
}
}