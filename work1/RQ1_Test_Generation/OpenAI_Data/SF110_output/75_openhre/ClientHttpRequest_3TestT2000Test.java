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
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* It tests the case when the <code>cookies</code> parameter is <code>null</code>.
	* @throws IOException
	*/
	@Test
	void test_post_1() throws IOException {
		Map parameters = new HashMap();
		parameters.put("name1", "value1");
		parameters.put("name2", "value2");
		parameters.put("name3", "value3");
		parameters.put("name4", "value4");
		
		ClientHttpRequest request = new ClientHttpRequest(new URL("http://localhost:8080/"));
		InputStream is = request.post(null, parameters);
		
		assertNotNull(is);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* It tests the case when the <code>cookies</code> parameter is empty.
	* @throws IOException
	*/
	@Test
	void test_post_2() throws IOException {
		Map parameters = new HashMap();
		parameters.put("name1", "value1");
		parameters.put("name2", "value2");
		parameters.put("name3", "value3");
		parameters.put("name4", "value4");
		
		ClientHttpRequest request = new ClientHttpRequest(new URL("http://localhost:8080/"));
		InputStream is = request.post(new HashMap(), parameters);
		
		assertNotNull(is);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* It tests the case when the <code>cookies</code> parameter is not empty.
	* @throws IOException
	*/
	@Test
	void test_post_3() throws IOException {
		Map parameters = new HashMap();
		parameters.put("name1", "value1");
		parameters.put("name2", "value2");
		parameters.put("name3", "value3");
		parameters.put("name4", "value4");
		
		Map cookies = new HashMap();
		cookies.put("cookie1", "value1");
		cookies.put("cookie2", "value2");
		cookies.put("cookie3", "value3");
		cookies.put("cookie4", "value4");
		
		ClientHttpRequest request = new ClientHttpRequest(new URL("http://localhost:8080/"));
		InputStream is = request.post(cookies, parameters);
		
		assertNotNull(is);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* It tests the case when the <code>parameters</code> parameter is <code>null</code>.
	* @throws IOException
	*/
	@Test
	void test_post_4() throws IOException {
		Map cookies = new HashMap();
		cookies.put("cookie1", "value1");
		cookies.put("cookie2", "value2");
		cookies.put("cookie3", "value3");
		cookies.put("cookie4", "value4");
		
		ClientHttpRequest request = new ClientHttpRequest(new URL("http://localhost:8080/"));
		InputStream is = request.post(cookies, null);
		
		assertNotNull(is);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* It tests the case when the <code>parameters</code> parameter is empty.
	* @throws IOException
	*/
	@Test
	void test_post_5() throws IOException {
		Map cookies = new HashMap();
		cookies.put("cookie1", "value1");
		cookies.put("cookie2", "value2");
		cookies.put("cookie3", "value3");
		cookies.put("cookie4", "value4");
		
		ClientHttpRequest request = new ClientHttpRequest(new URL("http://localhost:8080/"));
		InputStream is = request.post(cookies, new HashMap());
		
		assertNotNull(is);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* It tests the case when the <code>parameters</code> parameter is not empty.
	* @throws IOException
	*/
	@Test
	void test_post_6() throws IOException {
		Map cookies = new HashMap();
		cookies.put("cookie1", "value1");
		cookies.put("cookie2", "value2");
		cookies.put("cookie3", "value3");
		cookies.put("cookie4", "value4");
		
		Map parameters = new HashMap();
		parameters.put("name1", "value1");
		parameters.put("name2", "value2");
		parameters.put("name3", "value3");
		parameters.put("name4", "value4");
		
		ClientHttpRequest request = new ClientHttpRequest(new URL("http://localhost:8080/"));
		InputStream is = request.post(cookies, parameters);
		
		assertNotNull(is);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* It tests the case when the <code>cookies</code> parameter is <code>null</code> and the <code>parameters</code> parameter is <code>null</code>.
	* @throws IOException
	*/
	@Test
	void test_post_7() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest(new URL("http://localhost:8080/"));
		InputStream is = request.post(null, null);
		
		assertNotNull(is);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* It tests the case when the <code>cookies</code> parameter is empty and the <code>parameters</code> parameter is empty.
	* @throws IOException
	*/
	@Test
	void test_post_8() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest(new URL("http://localhost:8080/"));
		InputStream is = request.post(new HashMap(), new HashMap());
		
		assertNotNull(is);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
	* It tests the case when the <code>cookies</code> parameter is not empty and the <code>parameters</code> parameter is not empty.
	* @throws IOException
	*/
	@Test
	void test_post_9() throws IOException {
		Map cookies = new HashMap();
		cookies.put("cookie1", "value1");
		cookies.put("cookie2", "value2");
		cookies.put("cookie3", "value3");
		cookies.put("cookie4", "value4");
		
		Map parameters = new HashMap();
		parameters.put("name1", "value1");
		parameters.put("name2", "value2");
		parameters.put("name3", "value3");
		parameters.put("name4", "value4");
		
		ClientHttpRequest request = new ClientHttpRequest(new URL("http://localhost:8080/"));
		InputStream is = request.post(cookies, parameters);
		
		assertNotNull(is);
	}
	
	/**
	* Test case for the {@link Client