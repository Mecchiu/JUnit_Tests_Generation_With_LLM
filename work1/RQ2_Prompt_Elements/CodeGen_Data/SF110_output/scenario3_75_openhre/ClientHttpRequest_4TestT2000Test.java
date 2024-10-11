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

	/**
	 * test_post.
	 */
	@Test
    void test_post(){
		String[] cookie = new String[1];
		cookie[0] = "kdfdafdafkfdfkdafwdf";
		String[] parameters = new String[2];
		parameters[0] = "#";
		parameters[1] = "a";
		try {
//			ClientHttpRequest.post(null, null);
			assertEquals(10, ClientHttpRequest.post(cookie, null).size());
		} catch (IOException e) {
			assertTrue(false);
		}
		assertEquals(3, ClientHttpRequest.post(cookie, parameters).size());
	}
	

}

// Client HTTP request
class ClientHttpRequest_4Test_1 {
		
	/**
	 * test_post.
	 *
	 * @param cookie is the cookies
	 * @param size is the parameter size
	 * @return input stream with the server response
	 * @throws IOException is a problem with server response
	 * @see ClientHttpRequest.post(java.util.HashMap, Integer)
	 */
	public InputStream post(Map<String, String> cookie, Integer size) throws IOException {
		Map<String, String> cookie_2 = new HashMap<>();
		cookie_2.put("kdfdafdafkfdf", "kdfdafdafkfdf");
		cookie_2.put("kdfdafdaf", "kdfdafdaf-kdf");
		//ClientHttpRequest.post(cookie_2, size);
		return null;
	}
	
	/**
	 * test_post.
	 *.
	 */
	void test_post(){
		Map<String, String> param = new HashMap<>();
		param.put("kdfdafdafkfdf-kdf", "kdfdafdaf");
		param.put("kdfdafdafkfdf", "kdfdafdaf");
		//ClientHttpRequest.post(null, param);

		String[] cookies = new String[0];
		cookies = new String[10];
		for(int i = 0 ; i < cookies.length; i ++){
			cookies[i] = "kdfdafdaf";
		}
		this.post(cookies, param);
	}

}


// Client HTTP request
class ClientHttpRequest_4Test_2 {

    /**
     * test_post.
     *
     * @param cookie is the cookies
     * @param size is the parameter size
     * @return input stream with the server response
     * @throws IOException is a problem with server response
     */
    public InputStream post(String[] cookies, Integer size) throws IOException {
        URLConnection requestConnection = new URL("http://localhost:8080/").openConnection();
        requestConnection.setDoInput(true);
        Random random = new Random();
        random.nextBytes(cookie);
        requestConnection.setDoOutput(true);
        OutputStream outputStream = requestConnection.getOutputStream();
        outputStream.write(cookies);
        outputStream.close();
        int responseCode = requestConnection.getResponseCode();

        byte[] data = requestConnection.getHeaderField("Content-Type");
        DataSource dataSource = new DataSource(new FileInputStream(""));        
        //FileInputStream inputStream = new FileInputStream("");
        //FileInputStream inputStream = new FileInputStream("");

        try (DataInputStream inputStream = new DataInputStream(dataSource); FileInputStream outputStreamReader = new FileInputStream(""+(new Random()).nextInt() + "")) {
            //byte[] data = outputStreamReader.read();
        
            int contentSize = outputStreamReader.available();
            byte[] content = new byte[contentSize];
            inputStream.read(inputStream.available());
            outputStreamReader.read(outputStream.read(content));
            
            if (contentSize > 0) {
                //if (content.length > 1) {
                clientHttpRequest.setParameters(true, requestConnection.getHeaderFields());
                if (requestConnection.getHeaderField("Content-Length") == null) {
                    responseCode = 400;
                } else {
                    long contentLength = Long.parseLong(requestConnection.getHeaderField("Content-Length"));
                    Long length = new Long(content.length);
                    try (DataInputStream contentLengthStream = new DataInputStream(new FileInputStream(""+(new Random()).nextInt() + ""))) {

                        while (contentLengthStream.available()!= -1) {
                            content = contentLengthStream.read(content);
                            responseCode = content.length;
                        }
                    }
                }
            }
        } catch (IOException e) {
            responseCode = 502;
        }

        // try (FileInputStream inputStream = new FileInputStream(""); InputStream inputStream = new FileInputStream(inputStream); FileInputStream outputStreamReader = new FileInputStream(""+(new Random()).nextInt() + "")) { Byte out[] = outputStreamReader.read(inputStream); if (data!= out) responseCode = 504; }
        return null;
    }

    

  Map<String, String> clientHttpRequest;
}

