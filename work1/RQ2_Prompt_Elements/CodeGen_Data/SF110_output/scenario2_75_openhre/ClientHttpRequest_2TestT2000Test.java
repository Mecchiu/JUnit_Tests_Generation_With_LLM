// ClientHttpRequest_2Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(Object[])} method.
*/
class ClientHttpRequest_2Test {

	private static final String TEST_URL = null;
	
	/**
	* This function parses and tests the parameters of the request.
	*/
	@Test
    public void testParseParameters() {
		
		/**
		 * the parameters of the request
		 */
		Map<String, Object> params = new HashMap<>();
		String urlParams = new Random().nextInt(3) + "?foo=bar&baz=qux";
		String[] paramsArray = urlParams.split("&");
		for(String param: paramsArray) {
			if (param.contains("foo=")) {
				String[] parArr = param.split("=");
				params.put(parArr[1], parArr[2]);
			}
		}
		
		/**
		 * the request type, which can be POST or PUT
		 */
		String type = null;

		/**
		 * if it the request type is POST, it adds the cookies that were sent in the request
		 */
		if(type == null) {
			type = ClientHttpRequest.POST;
			params.put(ClientHttpRequest.HTTP_COOKIE_PARAM, new Random().nextInt(30));
		}
		
		/**
		 * if it the request type is PUT, it adds the "X-BASIC-AUTH" to the request
		 */
		type = ClientHttpRequest.PUT;
		/**
		 * if it the request type is GET, it adds "X-BASIC-AUTH" to the request
		 */
		if(type == null) {
			type = ClientHttpRequest.GET;
			params.put(ClientHttpRequest.HTTP_AUTH, "Basic");
		}

		/**
		 * if it type is POST, it adds Cookie
		 */
		params.put(ClientHttpRequest.HTTP_COOKIE_PARAM, "X-AUTH-TOKEN");
		
		/**
		 * if it type is PUT, it adds Cookie for "test"
		 */
		params.put("test", "test");
		
		/**
		 * if type is GET, it adds the "test" to the request
		 */
		params.put(ClientHttpRequest.HTTP_RETURN, "test; charset=US-ASCII");
		
		/**
		 * if it type is PUT, it adds "test" to the request
		 */
		post2();
		
		// test POST
		urlParams = new Random().nextInt(3) + "?foo=bar&baz=qux";
		method = ClientHttpRequest.POST;
		
		/**
		 * if it type is POST, it adds the cookies that were sent in the request
		 */
		type = method;
        params.put(ClientHttpRequest.HTTP_COOKIE_PARAM, "X-AUTH-TOKEN");
		
		method = ClientHttpRequest.POST;
		
		String authString = null;
		type = method;
		
		/**
		 * if it type is PUT, it adds the "X-BASIC-AUTH" to the request
		 */
		type = method;
		authString = "Basic";
		params.put(ClientHttpRequest.HTTP_AUTH, authString);
		
		post2();
		
		parameters = params;
       
    }
	
	/**
	 * this function post the request with the passed parameters into the server
	 */
	private static InputStream post2() {
		try {
			FileInputStream fis = new FileInputStream(new File("httpUploadTest/clientHttpRequest_2Test.txt"));
			URLConnection connection = new URL(TEST_URL).openConnection();
			URLConnection.setRequestProperty("Authorization", "Basic "+params.get(ClientHttpRequest.HTTP_AUTH));
			connection.setDoInput(true);
            InputStream is = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream("httpUploadTest/clientHttpRequest_2Request.txt");
            OutputStream out = new BufferedOutputStream(fos);
			byte[] buffer = new byte[1024];
			int len;
			while ((len = is.read(buffer))!= -1) out.write(buffer, 0, len);
            is.close();
			out.close();
			connection.disconnect();
		}
		catch (IOException ioe) {
            assertTrue("Error occured while testing request", false);
		}
		return null;
	}
	
	/**
	 * Method to make a connection to the server
	 * @return connection to the server
	 */
	public static URLConnection newConnection() {
		URLConnection connection = null;
		try {
			connection = new URL("http://localhost:8080/request").openConnection();
		}
		catch (IOException ioe) {
            assertTrue("Error occured while creating a connection to the server", false);
        }
		return connection;
	}
	
	/**
	 * Method to make an input stream for POST and PUT operations
	 * @return InputStream for POST and PUT operations
	 */
	public static InputStream newInputStream() {
		String urlParams = null;
		String[] paramsArray = null;
		String method = null;
		try {
			urlParams = new Random().nextInt(2) + "";
			HashMap<String, Object> map = new HashMap<>();
			int i = 0;
			HashMap<String, Object> rv = new HashMap<>(4);
			
			rv.put(ClientHttpRequest.HTTP_URI, "http://localhost:8080/request");// method=POST
			rv.put(ClientHttpRequest.HTTP_METHOD, ""+method); // httpmethod=POST
			
			while(i<4) {
				paramsArray = new Random().nextInt(4)+"&"+ClientHttpRequest.HTTP_URI; // get the params
				paramsArray[0] = urlParams +paramsArray[0];
				rv.put(paramsArray[2], paramsArray[1]);
				i++;
			}
			
			urlParams = "";
			paramsArray[0]= urlParams; 
			
			method = httpMethod;
			rv.put("HTTP_METHOD", method); //httpmethod=POST
			rv.put("HTTP_URI", urlParams);// httpuri
			rv.put(ClientHttpRequest.HTTP_AUTH