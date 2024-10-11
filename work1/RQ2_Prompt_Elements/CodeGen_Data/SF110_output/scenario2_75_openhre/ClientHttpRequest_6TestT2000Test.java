// ClientHttpRequest_6Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
*/
class ClientHttpRequest_6Test {
/**
		* Post the POST request to the server, with the specified parameters
		* @param name1 first parameter name
		* @param value1 first parameter value
		* @param name2 second parameter name
		* @param value2 second parameter value
		* @return input stream with the server response
		* @throws IOException
		*/
	public InputStream post(String name1, Object value1, String name2, Object value2) throws IOException {
                URL url = new URL("http://server/servlet/test/post");
        URLConnection conn = url.openConnection();
        if(conn instanceof FileInputStream){
                conn.setChunkedStreamingMode(1024);
                FileInputStream stream = ((FileInputStream) conn);
                byte[] buffer = new byte[16384];
                int read = stream.read(buffer);
                while(read!= -1) {
                        write(buffer, read);
                        buffer = new byte[16384];
                        read = stream.read(buffer);
                }
        }

        HttpHost p = new HttpHost(url.getHost(), url.getPort(), url.getProtocol());
        String queryString = "name="+name1 + "&value="+value1 + "&name2="+name2+"&value2="+value2;
        String postString = "POST method="+queryString;
        StringEntity strEntity = new StringEntity(postString, "application/x-www-form-urlencoded", "UTF-8");
        conn.setRequestProperty("Content-Length",Integer.toString(postString.length()));
         return conn.getInputStream();
	}

    /**
     * @throws IOException if an I/O exception occurs
     */
    @Test
    public void test() throws IOException {
	ClientHttpRequest_6Test.this.post((String)"test", (Object)"test", "name", "value");
    }

    /*
    Test method sendForm http method POST with parameters
    @Test
    public void test() throws IOException {
	ClientHttpRequest_6Test.this.post("test", (Object)"test", "name", "value");
    }
    */
}

/**
*
* Class of {@link ClientHttpRequest}.
* For the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
*/
class ClientHttpRequest_7Test {
	/**
	 * POST the POST request to the server, with the specified parameters
	 * @param name1 first parameter name
	 * @param value1 first parameter value
	 * @param name2 second parameter name
	 * @param value2 second parameter value
	 * @param name3 third parameter name
	 * @param value3 third parameter value
	 * @return input stream with the server response
	 * @throws IOException
	*/
	public InputStream post(String name1, Object value1, String name2, Object value2,
	String name3, Object value3) throws IOException {

   	  return post(name1, value1, name2, value2, name3, value3);	
        }
}
