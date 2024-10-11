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
		 * Test cases for {@link ClientHttpRequest#post(String[], Object[])}
		 */
	    @Test
		void testPostWithAllMandatoryItemsIsSuccessful() throws IOException, URLConnectionException { 
			/**
				* test with parameters, cookies, urls.
				*/
			// get parameters
			HashMap<String, String> parameters = new HashMap<String, String>();
			parameters.put("query","val");
			parameters.put("key1", "val1");
			parameters.put("key2", "val2");
			parameters.put("key3", "val3");
			// get cookies
			String cookies[] = {"value1", "value2"};
			// get urls
			String urls[] = {"http://example.com/path", "http://www.example.com/path"};
			try {
				ClientHttpRequest.post(cookies, parameters);
				File file = new File("/home/peter/Desktop/somefile.txt");
				System.out.println("TEST "+ file.toString());
				return;

			}catch(Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
			fail("error not found");
		}
	    @Test
		void testPostWithOneMandatoryItemIsSuccessful() throws IOException, URLConnectionException { 
			HashMap<String, String> parameters = new HashMap<String, String>();
			parameters.put("query", "val");
			parameters.put("key1", "val1");
			parameters.put("key2", "val2");
			// getting all the urls
			Iterator<String> i_urls = new HashMap<String, String>().keySet().iterator();
			String urls[] = {"http://example.com/path", "http://www.example.com/path"};
			Random r = new Random();
}
}