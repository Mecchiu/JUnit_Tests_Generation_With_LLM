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
		/*
		 * Method name: createRequest
		 * This method creates a request object to POST with the specified input parameters,
		 * with the specified method. The specified method will be used to send the request
		 * The format of the POST request body should be name=value&name2=value2
		 * The expected response of the request is either a "200" status code or a "error" content type
		 *
		 * The expected response is a string
		 * It is possible to return an input stream or a byte array from the server
		 * to upload the file
		 *
		 * @param name1 the first parameter as name
		 * @param value1 the first parameter as value
		 * @param name2 the second parameter as name
		 * @param value2 the second parameter as value
		 * @param file input stream or byte array
		 * @param method the method this request should be used to send the POST
		 * @return a new request which has the same parameters as the previous request
		 * @throws IOException If an I/O error occurs while getting the server response
		 * @throws IllegalArgumentException If a null or blank value or byte array is passed as the first parameter
		 */
		@Test
		public void createRequest(String name1, Object value1, String name2, Object value2, InputStream file) throws IOException {
		assertNotNull(file);
		assertTrue(file instanceof File);
		assertTrue(name1 == null);
		assertTrue(value1 == null);
		assertFalse(name1.equals(" "));
		assertFalse(value1.equals(" "));
		String urlString = "testclient.com";
		String data = "testparameter";
		int code = ClientHTTPResponse.HTTP_OK;
		int responseCode = ClientHTTPResponse.HTTP_OK;
		String responseType = null;
		String contentType = null;
		String contentEncoding = null;
		String encoding = ClientHTTPResponse.BINARY_CHARSET;
		String fileName = "test.dat";
		
		try {
			String url = ClientHTTPResponse.createRequest(urlString, data, ClientHTTPResponse.HTTP_OK, (String) responseCode, code, responseType, responseCode, responseType, contentType, contentEncoding, encoding, fileName);
		}
		catch(IllegalArgumentException e) {
			fail(e.getMessage());
		}
		assertEquals(name1, new HashMap<String,Object>(){{put(name1, value1);
		add(name2, value2);}});
		assertTrue(ClientHTTPResponse.getNameFromContentType(contentType).equals(name1));
		assertTrue(ClientHTTPResponse.getNameFromContentEncoding(contentEncoding).equals(name1));
		assertNotNull(url);
		assertNotNull(urlString);
		assertNotNull(data);
		assertNotNull(file);
		}
		
		/*
		 * Method name: preSendRequest
		 * This method pre-forms several parameters to the POST request object.
		 * It is possible to pass some parameters to the POST request through a method call, the 
		 * result of this method call will be saved to the server.
		 *
		 * @param name1 first parameter used as name
		 * @param value1 first parameter used as value
		 * @param name2 second parameter used as name
		 * @param value2 second parameter used as value
		 * @param key1 parameter which is used for the name of the uploaded file
		 * @param file input stream or byte array to be uploaded
		 * @param method the method this request should be used to send request
		 * @return a new request which does not pre-form the parameters for the first time
		 * @throws IOException If an I/O error occurs while getting the server response
		 * @throws IllegalArgumentException If a url parameter is not properly encoded
		 */
		@Test
		public void preSendRequest(String name1, Object value1, String name2, Object value2, String key1, InputStream file) throws IOException {
		String url = ClientHTTPResponse.createRequest(urlString, data, ClientHTTPResponse.HTTP_OK, (String) ClientHTTPResponse.HTTP_UNDEFINED, ClientHTTPResponse.HTTP_OK, (String) ClientHTTPResponse.HTTP_UNDEFINED, ClientHTTPResponse.HTTP_OK, ClientHTTPResponse.HTTP_UNDEFINED, ClientHTTPResponse.HTTP_UNDEFINED, key1, "", null, null, null);
		assertEquals(url, url.substring(1));
		if (key1!=null) {
			assertTrue(url.contains(urlString + "?"+key1));
		}
		assertEquals(null, file instanceof FileInputStream);
		}
			
	}