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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(Map, Map)} method.
*/
class ClientHttpRequest_3Test {

	/**
	* Test case for {@link ClientHttpRequest#post(Map, Map)} method.
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>cookies: null</li>
	* <li>parameters: null</li>
	* </ul>
	* The test case expects the following exception:
	* <ul>
	* <li>{@link IllegalArgumentException}</li>
	* </ul>
	*/
	@Test
	public void testPost_1() throws Exception {
		Map cookies = null;
		Map parameters = null;
		try {
			ClientHttpRequest.post(cookies, parameters);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
		}
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(Map, Map)} method.
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>cookies: empty map</li>
	* <li>parameters: null</li>
	* </ul>
	* The test case expects the following exception:
	* <ul>
	* <li>{@link IllegalArgumentException}</li>
	* </ul>
	*/
	@Test
	public void testPost_2() throws Exception {
		Map cookies = new HashMap();
		Map parameters = null;
		try {
			ClientHttpRequest.post(cookies, parameters);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
		}
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(Map, Map)} method.
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>cookies: null</li>
	* <li>parameters: empty map</li>
	* </ul>
	* The test case expects the following exception:
	* <ul>
	* <li>{@link IllegalArgumentException}</li>
	* </ul>
	*/
	@Test
	public void testPost_3() throws Exception {
		Map cookies = null;
		Map parameters = new HashMap();
		try {
			ClientHttpRequest.post(cookies, parameters);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
		}
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(Map, Map)} method.
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>cookies: empty map</li>
	* <li>parameters: empty map</li>
	* </ul>
	* The test case expects the following exception:
	* <ul>
	* <li>{@link IllegalArgumentException}</li>
	* </ul>
	*/
	@Test
	public void testPost_4() throws Exception {
		Map cookies = new HashMap();
		Map parameters = new HashMap();
		try {
			ClientHttpRequest.post(cookies, parameters);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
		}
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(Map, Map)} method.
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>cookies: map with one element</li>
	* <li>parameters: null</li>
	* </ul>
	* The test case expects the following exception:
	* <ul>
	* <li>{@link IllegalArgumentException}</li>
	* </ul>
	*/
	@Test
	public void testPost_5() throws Exception {
		Map cookies = new HashMap();
		cookies.put("key1", "value1");
		Map parameters = null;
		try {
			ClientHttpRequest.post(cookies, parameters);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
		}
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(Map, Map)} method.
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>cookies: null</li>
	* <li>parameters: map with one element</li>
	* </ul>
	* The test case expects the following exception:
	* <ul>
	* <li>{@link IllegalArgumentException}</li>
	* </ul>
	*/
	@Test
	public void testPost_6() throws Exception {
		Map cookies = null;
		Map parameters = new HashMap();
		parameters.put("key1", "value1");
		try {
			ClientHttpRequest.post(cookies, parameters);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
		}
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(Map, Map)} method.
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>cookies: map with one element</li>
	* <li>parameters: map with one element</li>
	* </ul>
	* The test case expects the following exception:
	* <ul>
	* <li>{@link IllegalArgumentException}</li>
	* </ul>
	*/
	@Test
	public void testPost_7() throws Exception {
		Map cookies = new HashMap();
		cookies.put("key1", "value1");
		Map parameters = new HashMap();
		parameters.put("key1", "value1");
		try {
			ClientHttpRequest.post(cookies, parameters);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
		}
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(Map, Map)} method.
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>cookies: map with one element</li>
	* <li>parameters: map with one element</li>
	* </ul>
	* The test case expects the following exception:
	* <ul>
	* <li>{@link IllegalArgumentException}</li>
	* </ul>
	*/
	@Test
	public void testPost_8() throws Exception {
		Map cookies = new HashMap();
		cookies.put("key1", "value1");
		Map parameters = new HashMap();
		parameters.put("key1", "value1");
		try {
			ClientHttpRequest.post(cookies, parameters);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
		}
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(Map, Map)} method.
	* Test case for the {@link ClientHttp