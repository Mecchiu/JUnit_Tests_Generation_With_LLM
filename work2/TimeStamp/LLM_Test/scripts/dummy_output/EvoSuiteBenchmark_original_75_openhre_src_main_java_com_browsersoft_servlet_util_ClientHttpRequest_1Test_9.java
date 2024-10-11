// ClientHttpRequest_1Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(Map)} method.
*/
class ClientHttpRequest_1Test {
		
	/**
	 * @throws IOException
	 * @see ClientHttpRequest.post
	 */
	@Test
	void Test() throws IOException {
			
		Map m = new HashMap();
		m.put("foo", "bar");
		m.put("boo", "goo");
		String text = "" ;
		String text2 = "" ;
		String text3 = "";
		
		// check whether the input parameters are passed
		assertEquals(m.size(), arguments.size());
		
		// testing the one-argument constructor
		String input =  m.get("foo").toString();
		assertEquals(input, "bar");

		// testing the two-argument constructor
		text2 = m.get("boo").toString();
		assertEquals(text2, "goo");

		// testing the three-argument constructor
		String input2 =  m.get("boo").toString();
		assertEquals(input2, "bar");

		// testing the four-argument constructor
		text3 = m.get("pow").toString();
		assertEquals(text3, "pow");

	}
	
	// ClientHttpRequest_2Test.java
	/**
	 * @throws IOException
	 * @see ClientHttpRequest.post
	 * @see ClientHttpRequest.getHeader
	 */
	@Test
	void HTTPRequest_1Test() throws IOException {
		
		Map m = new HashMap();
		m.put("foo", "bar");
		m.put("boo", "goo");
		String text = "";
		String text2 = "";
		String text3 = "";
		String request = "" ;
		String response = "" ;
		
		// check whether the input parameters are passed
		assertEquals(m.size(), arguments.size());
		
		// testing the two-argument constructor
		text2 = m.get("boo").toString();
		assertEquals(text2, "goo");

		// testing one-argument constructor
		text3 = m.get("boo").toString();
		assertEquals(text3, "bar");
		
		// testing the three-argument constructor
		request = m.get("boo").toString();
		response = m.get("boo").toString();
		
		// checking the response header
		assertEquals(response, "POST / HTTP/1.1");
		
		// checking the request header
		assertEquals(request, "HTTP/1.1 200 OK");

	}	

	public Map getArguments() {
		return arguments;
	}
	
	public Map getParameters() {
		return parameters;
	}
	
	public String getRequestLine() {
		return "POST / HTTP/1.1";
	}
	
	public String getRequestURI() {
		return "http://www.test.com/test.php";
	}
	
	public String getProtocol() {
		return "HTTP/1.0";
	}
	
	public String getURI() {
		return "http://www.test.com/test.php";
	}
	public static void main(String args[]) throws Exception {
		// test
		Map param = new HashMap();
		param.put("foo", "bar");
		param.put("boo", "goo");
		ClientHttpRequest request = new ClientHttpRequest_1Test();
		String reply = request.post(param);
		File ff = new File("/home/pi/Downloads/test.php");
		String uri = "";
		int i = 1;
		int count = 0;
}
}