// ClientHttpRequestTest.java
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(Map)} method.
*/
class ClientHttpRequestTest {

	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are null.
	*/
	@Test
	public void testPost_NullParameters() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream response = request.post(null);
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are empty.
	*/
	@Test
	public void testPost_EmptyParameters() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream response = request.post(new HashMap());
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are not empty.
	*/
	@Test
	public void testPost_NonEmptyParameters() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map parameters = new HashMap();
		parameters.put("param1", "value1");
		parameters.put("param2", "value2");
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are not empty and contain a file.
	*/
	@Test
	public void testPost_NonEmptyParametersWithFile() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map parameters = new HashMap();
		parameters.put("param1", "value1");
		parameters.put("param2", "value2");
		parameters.put("file", new File("test.txt"));
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are not empty and contain a file and a cookie.
	*/
	@Test
	public void testPost_NonEmptyParametersWithFileAndCookie() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map parameters = new HashMap();
		parameters.put("param1", "value1");
		parameters.put("param2", "value2");
		parameters.put("file", new File("test.txt"));
		request.setCookie("cookie1", "value1");
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are not empty and contain a file and two cookies.
	*/
	@Test
	public void testPost_NonEmptyParametersWithFileAndTwoCookies() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map parameters = new HashMap();
		parameters.put("param1", "value1");
		parameters.put("param2", "value2");
		parameters.put("file", new File("test.txt"));
		request.setCookie("cookie1", "value1");
		request.setCookie("cookie2", "value2");
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are not empty and contain a file and two cookies and a header.
	*/
	@Test
	public void testPost_NonEmptyParametersWithFileAndTwoCookiesAndHeader() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map parameters = new HashMap();
		parameters.put("param1", "value1");
		parameters.put("param2", "value2");
		parameters.put("file", new File("test.txt"));
		request.setCookie("cookie1", "value1");
		request.setCookie("cookie2", "value2");
		request.setHeader("header1", "value1");
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are not empty and contain a file and two cookies and two headers.
	*/
	@Test
	public void testPost_NonEmptyParametersWithFileAndTwoCookiesAndTwoHeaders() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map parameters = new HashMap();
		parameters.put("param1", "value1");
		parameters.put("param2", "value2");
		parameters.put("file", new File("test.txt"));
		request.setCookie("cookie1", "value1");
		request.setCookie("cookie2", "value2");
		request.setHeader("header1", "value1");
		request.setHeader("header2", "value2");
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are not empty and contain a file and two cookies and two headers and a proxy.
	*/
	@Test
	public void testPost_NonEmptyParametersWithFileAndTwoCookiesAndTwoHeadersAndProxy() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map parameters = new HashMap();
		parameters.put("param1", "value1");
		parameters.put("param2", "value2");
		parameters.put("file", new File("test.txt"));
		request.setCookie("cookie1", "value1");
		request.setCookie("cookie2", "value2");
		request.setHeader("header1", "value1");
		request.setHeader("header2", "value2");
		request.setProxy("localhost", 8080);
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are not empty and contain a file and two cookies and two headers and a proxy and a timeout.
	*/
	@Test
	public void testPost_NonEmptyParametersWithFileAndTwoCookiesAndTwoHeadersAndProxyAndTimeout() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map parameters = new HashMap();
		parameters.put("param1", "value1");
		parameters.put("param2", "value2");
		parameters.put("file", new File("test.txt"));
		request.setCookie("cookie1", "value1");
		request.setCookie("cookie2", "value2");
		request.setHeader("header1", "value1");
		request.setHeader("header2", "value2");
		request.setProxy("localhost", 8080);
		request.setConnectionTimeout(10000);
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are not empty and contain a file and two cookies and two headers and a proxy and a timeout and a read timeout.
	*/
	@Test
	public void testPost_NonEmptyParametersWithFileAndTwoCookiesAndTwoHeadersAndProxyAndTimeoutAndReadTimeout() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map parameters = new HashMap();
		parameters.put("param1", "value1");
		parameters.put("param2", "value2");
		parameters.put("file", new File("test.txt"));
		request.setCookie("cookie1", "value1");
		request.setCookie("cookie2", "value2");
		request.setHeader("header1", "value1");
		request.setHeader("header2", "value2");
		request.setProxy("localhost", 8080);
		request.setConnectionTimeout(10000);
		request.setReadTimeout(10000);
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
}