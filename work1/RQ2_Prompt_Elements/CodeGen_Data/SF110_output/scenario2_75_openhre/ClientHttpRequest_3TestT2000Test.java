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

	/**
	* Test sending HTTP POST request with all the parameters.
	*
	* @throws Exception Exception
	*/
	@Test
	void test0() throws Exception{
		URLConnection connection1 = new URL("http://localhost:8080/").openConnection();
		connection1.setAllowUserIntercepts(false);

		// HTTP request with all parameters
		URLConnection connection2 = new URL("http://localhost:8080/").openConnection();

		assertEquals("http.cookies", connection1.getRequestProperty("cookie1"));
		assertEquals("http.parameters", connection1.getRequestProperty("param"));

		assertEquals("http.cookies", connection2.getRequestProperty("cookie1"));
		assertEquals("http.parameters", connection2.getRequestProperty("param"));
	}
	
	/**
	* Test sending HTTP POST request with parameters.
	*
	* @throws Exception Exception
	*/
	@Test
	void test1() throws Exception{
		URL url = new URL("http://localhost:8080/");

		// HTTP request with a parameter
		URLConnection conn1 = url.openConnection();
		conn1.setDoInput(true);
		conn1.setDoOutput(true);
		conn1.setUseCaches(true);

		url = (URL) conn1.getURL();
		assertEquals("http.cookies", conn1.getURL().getRequestProperty("cookie1"));
		assertEquals("http.cookies", url.getRequestProperty("cookie1"));

		String param = new String();
		url = (URL) conn1.getURL();
		assertTrue("http.parameters", url.getRequestProperty("param").equals(param));
	}

	/**
	* Test sending HTTP POST request with some parameters and parameters added in it.
	*
	* @throws Exception Exception
	*/
	@Test
	void test2() throws Exception{
		URL url = new URL("http://localhost:8080/");
		// POST request with a parameter
		URLConnection connection1 = url.openConnection();
		connection1.setDoOutput(true);
		// POST request with parameters
		connection1.setRequestMethod("GET");
		connection1.setRequestProperty("param", "value1");

		String params = url.getRequestProperty("param");
		assertEquals("http.params", params);

		url = url.openConnection();
		// GET request with another parameter
		connection1.setRequestMethod("GET");
		connection1.setRequestProperty("param", "value2");

		params = url.getRequestProperty("param");
		assertEquals("http.params", params);
	}

	/**
	* Test sending HTTP POST request with some parameters.
	*
	* @throws Exception Exception
	*/
	@Test
	void test3() throws IOException {
		try (InputStream in = new FileInputStream(new File("F:\\test.file"));
				OutputStream out = new FileOutputStream(new File("F:\\test2.file"))) {

			ClientHttpRequest.post(new HashMap(), null);
			String params = new String(new byte[] { (byte) 0x80, (byte) 0x81 });
			assertEquals("http.params", params);

			out.write(new byte[] { (byte) 0x80, (byte) 0x81 });
			// test sending GET request wihch without parameters
			in.read();

			out.write(new byte[] { (byte) 0x84, (byte) 0x81 });
			// test sending POST request wihch without parameters
			in.read();

			// test if both requests are in the same state : server not working, request must stop, so the input stream might be corrupted
			in = new FileInputStream(new File("F:\\test.file"));
			out = new FileOutputStream(new File("F:\\test2.file"));

			ClientHttpRequest.post(new HashMap(), in);

			assertTrue("test1", in.read()!= -1);
			assertTrue("test2", in.read()!= -1);
			in.close();
			out.close();
		}
	}

	/**
	* Test sending HTTP POST request with all the parameters.
	*
	* @throws Exception Exception
	*/
	@Test
	void test4() throws Exception{
		String url = new URL("http://localhost:8080/").toString();
		ClientHttpRequest.post(null, url);
		String urlparam = new URL(url).getQuery();
		assertEquals("http.query", urlparam);
	}
	
}
