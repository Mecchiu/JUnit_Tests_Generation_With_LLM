// ClientHttpRequest_5Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object)} method.
*/
class ClientHttpRequest_5Test {
		private static Map<String, String> cookies;
		private static Map<String, Integer> size;
		private static int RANDOM_NUMBER = 25;

//		    case 1: POST request
//		        method = POST
//		        params = {"foo", "bar"}
//		        contentEncoding = "B64"
//		        bodyLength = "25"
//		        host = "localhost"
//		        path = "/_ah/path/to/File"
//		        cookies = cookies1
//		        size = size1 
//		    case 2: GET request
//		        method = GET
//		        params = {"size", "foo"}
//		        contentEncoding = "B64"
//		        bodyLength = "25"
//		        host = "localhost"
//		        path = "/_ah/path/to/File"
//		        cookies = cookies2 
//		        size = size2 
//		    case 3: POST with parameters request
//		        method = POST 
//		        params = {"foo", "bar"}
//		        contentEncoding = "1.5"
//		        bodyLength = "25"
//		        host = "localhost"
//		        path = "/_ah/path/to/File"
//		        cookies = cookies3 
//		        size = size3 
//		    case 4: DELETE request
//		        method = DELETE
//		        params = {"foo", "bar"}
//		        contentEncoding = "B64"
//		        bodyLength = "25"
//		        host = "localhost"
//		        path = "/_ah/path/to/File"
//		        cookies = cookies4 
//		        size = size4 
//		    case 5: PUT request
//		        method = PUT
//		        params = {"foo", "bar"}
//		        contentEncoding = "3.5"
//		        bodyLength = "25"
//		        host = "localhost"
//		        path = "/_ah/path/to/File"
//		        cookies = cookies5 
//		        size = size5 

		/** Creates a new instance of ClientHttpRequest_5Test. */
		public ClientHttpRequest_5Test() {
		}


//		private static URLConnection connect(URL url, int connecttime, int socketTimeout)
////		    throws IOException {
//		    Random rnd = new Random();
//		    int a = rnd.nextInt(0, 10)-5;
    //		    int b = rnd.nextInt(0, 10)-5;
    //
//		    URLConnection conn = url.openConnection();
//		    // the host is the host of the connection
//		    conn.setRequestProperty("Host", "abc.com");
//
//		    String content = "<?xml version=\"1.0\"?>"
//		             + "<root><data><b><a>"+a+"</a><a><b><c></b></a></b></b></data></root>";
//		    String contentEncoding = "base64";
//		    String chunk = contentEncoding;
//		    while (true) {
//
//		    	if (chunk.equals("")) {
//		    		chunk = content;
//		    	} else {
//		    		chunk += "&";
//		    	}
//		    	conn.setDoInput(true);
//		    	outputData(conn, chunk);
//		    	conn.setDoOutput(true);
//				outputData(conn, content);
//				conn.setConnectTimeout(connecttime);
//				conn.setReadTimeout(socketTimeout);
//
//		    	int statusCode = conn.getResponseCode();
//		    	if (statusCode!= 200) {
//		    	    outputData(conn, "Server returned status code " + statusCode + ".\n");
//		    	    break;
//		    	}
//		    }
//		    return conn;
		}



	/**
	 * @see ClientHttpRequest#post(String, Object)
	 */
	@Test
    public void testPost() {
        ClientHttpRequest request = new ClientHttpRequest();

        try {
            request.post(name, value);
            fail("There should be an out of range parameter, " + a);
        } catch (IOException e) {
            assertEquals(e.getMessage(), "Number out of range: size > 30.");
        }


    }
}