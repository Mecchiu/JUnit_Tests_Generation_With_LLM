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
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IOException.class, () -> clientHttpRequest.post(null));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are empty.
	*/
	@Test
	public void testPost_EmptyParameters() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IOException.class, () -> clientHttpRequest.post(new HashMap()));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are valid.
	*/
	@Test
	public void testPost_ValidParameters() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Map parameters = new HashMap();
		parameters.put("name", "value");
		assertNotNull(clientHttpRequest.post(parameters));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are valid.
	*/
	@Test
	public void testPost_ValidParameters2() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Map parameters = new HashMap();
		parameters.put("name", "value");
		parameters.put("name2", "value2");
		assertNotNull(clientHttpRequest.post(parameters));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are valid.
	*/
	@Test
	public void testPost_ValidParameters3() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Map parameters = new HashMap();
		parameters.put("name", "value");
		parameters.put("name2", "value2");
		parameters.put("name3", "value3");
		assertNotNull(clientHttpRequest.post(parameters));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are valid.
	*/
	@Test
	public void testPost_ValidParameters4() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Map parameters = new HashMap();
		parameters.put("name", "value");
		parameters.put("name2", "value2");
		parameters.put("name3", "value3");
		parameters.put("name4", "value4");
		assertNotNull(clientHttpRequest.post(parameters));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are valid.
	*/
	@Test
	public void testPost_ValidParameters5() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Map parameters = new HashMap();
		parameters.put("name", "value");
		parameters.put("name2", "value2");
		parameters.put("name3", "value3");
		parameters.put("name4", "value4");
		parameters.put("name5", "value5");
		assertNotNull(clientHttpRequest.post(parameters));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are valid.
	*/
	@Test
	public void testPost_ValidParameters6() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Map parameters = new HashMap();
		parameters.put("name", "value");
		parameters.put("name2", "value2");
		parameters.put("name3", "value3");
		parameters.put("name4", "value4");
		parameters.put("name5", "value5");
		parameters.put("name6", "value6");
		assertNotNull(clientHttpRequest.post(parameters));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are valid.
	*/
	@Test
	public void testPost_ValidParameters7() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Map parameters = new HashMap();
		parameters.put("name", "value");
		parameters.put("name2", "value2");
		parameters.put("name3", "value3");
		parameters.put("name4", "value4");
		parameters.put("name5", "value5");
		parameters.put("name6", "value6");
		parameters.put("name7", "value7");
		assertNotNull(clientHttpRequest.post(parameters));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are valid.
	*/
	@Test
	public void testPost_ValidParameters8() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Map parameters = new HashMap();
		parameters.put("name", "value");
		parameters.put("name2", "value2");
		parameters.put("name3", "value3");
		parameters.put("name4", "value4");
		parameters.put("name5", "value5");
		parameters.put("name6", "value6");
		parameters.put("name7", "value7");
		parameters.put("name8", "value8");
		assertNotNull(clientHttpRequest.post(parameters));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are valid.
	*/
	@Test
	public void testPost_ValidParameters9() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Map parameters = new HashMap();
		parameters.put("name", "value");
		parameters.put("name2", "value2");
		parameters.put("name3", "value3");
		parameters.put("name4", "value4");
		parameters.put("name5", "value5");
		parameters.put("name6", "value6");
		parameters.put("name7", "value7");
		parameters.put("name8", "value8");
		parameters.put("name9", "value9");
		assertNotNull(clientHttpRequest.post(parameters));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are valid.
	*/
	@Test
	public void testPost_ValidParameters10() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Map parameters = new HashMap();
		parameters.put("name", "value");
		parameters.put("name2", "value2");
		parameters.put("name3", "value3");
		parameters.put("name4", "value4");
		parameters.put("name5", "value5");
		parameters.put("name6", "value6");
		parameters.put("name7", "value7");
		parameters.put("name8", "value8");
		parameters.put("name9", "value9");
		parameters.put("name10", "value10");
		assertNotNull(clientHttpRequest.post(parameters));
	}
}