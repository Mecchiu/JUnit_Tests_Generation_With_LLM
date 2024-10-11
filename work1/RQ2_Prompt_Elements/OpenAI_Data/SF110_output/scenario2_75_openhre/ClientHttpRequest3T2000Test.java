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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(Map, Map)} method.
*/
class ClientHttpRequestTest {

	/**
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>cookies: null</li>
	* <li>parameters: null</li>
	* </ul>
	*
	* @throws IOException
	*/
	@Test
	void testPost_1() throws IOException {
		ClientHttpRequest fixture = new ClientHttpRequest();
		Map cookies = null;
		Map parameters = null;
		InputStream result = fixture.post(cookies, parameters);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>cookies: empty map</li>
	* <li>parameters: empty map</li>
	* </ul>
	*
	* @throws IOException
	*/
	@Test
	void testPost_2() throws IOException {
		ClientHttpRequest fixture = new ClientHttpRequest();
		Map cookies = new HashMap();
		Map parameters = new HashMap();
		InputStream result = fixture.post(cookies, parameters);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>cookies: map with one element</li>
	* <li>parameters: map with one element</li>
	* </ul>
	*
	* @throws IOException
	*/
	@Test
	void testPost_3() throws IOException {
		ClientHttpRequest fixture = new ClientHttpRequest();
		Map cookies = new HashMap();
		cookies.put("", "");
		Map parameters = new HashMap();
		parameters.put("", "");
		InputStream result = fixture.post(cookies, parameters);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>cookies: map with two elements</li>
	* <li>parameters: map with two elements</li>
	* </ul>
	*
	* @throws IOException
	*/
	@Test
	void testPost_4() throws IOException {
		ClientHttpRequest fixture = new ClientHttpRequest();
		Map cookies = new HashMap();
		cookies.put("", "");
		cookies.put("", "");
		Map parameters = new HashMap();
		parameters.put("", "");
		parameters.put("", "");
		InputStream result = fixture.post(cookies, parameters);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>cookies: map with three elements</li>
	* <li>parameters: map with three elements</li>
	* </ul>
	*
	* @throws IOException
	*/
	@Test
	void testPost_5() throws IOException {
		ClientHttpRequest fixture = new ClientHttpRequest();
		Map cookies = new HashMap();
		cookies.put("", "");
		cookies.put("", "");
		cookies.put("", "");
		Map parameters = new HashMap();
		parameters.put("", "");
		parameters.put("", "");
		parameters.put("", "");
		InputStream result = fixture.post(cookies, parameters);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>cookies: map with one element</li>
	* <li>parameters: map with two elements</li>
	* </ul>
	*
	* @throws IOException
	*/
	@Test
	void testPost_6() throws IOException {
		ClientHttpRequest fixture = new ClientHttpRequest();
		Map cookies = new HashMap();
		cookies.put("", "");
		Map parameters = new HashMap();
		parameters.put("", "");
		parameters.put("", "");
		InputStream result = fixture.post(cookies, parameters);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>cookies: map with two elements</li>
	* <li>parameters: map with one element</li>
	* </ul>
	*
	* @throws IOException
	*/
	@Test
	void testPost_7() throws IOException {
		ClientHttpRequest fixture = new ClientHttpRequest();
		Map cookies = new HashMap();
		cookies.put("", "");
		cookies.put("", "");
		Map parameters = new HashMap();
		parameters.put("", "");
		InputStream result = fixture.post(cookies, parameters);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>cookies: map with three elements</li>
	* <li>parameters: map with one element</li>
	* </ul>
	*
	* @throws IOException
	*/
	@Test
	void testPost_8() throws IOException {
		ClientHttpRequest fixture = new ClientHttpRequest();
		Map cookies = new HashMap();
		cookies.put("", "");
		cookies.put("", "");
		cookies.put("", "");
		Map parameters = new HashMap();
		parameters.put("", "");
		InputStream result = fixture.post(cookies, parameters);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>cookies: map with one element</li>
	* <li>parameters: map with three elements</li>
	* </ul>
	*
	* @throws IOException
	*/
	@Test
	void testPost_9() throws IOException {
		ClientHttpRequest fixture = new ClientHttpRequest();
		Map cookies = new HashMap();
		cookies.put("", "");
		Map parameters = new HashMap();
		parameters.put("", "");
		parameters.put("", "");
		parameters.put("", "");
		InputStream result = fixture.post(cookies, parameters);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>cookies: map with two elements</li>
	* <li>parameters: map with three elements</li>
	* </ul>
	*
	* @throws IOException
	*/
	@Test
	void testPost_10() throws IOException {
		ClientHttpRequest fixture = new ClientHttpRequest();
		Map cookies = new HashMap();
		cookies.put("", "");
		cookies.put("", "");
		Map parameters =