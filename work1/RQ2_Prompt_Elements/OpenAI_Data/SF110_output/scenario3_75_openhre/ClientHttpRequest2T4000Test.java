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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(Object[])} method.
*/
class ClientHttpRequestTest {

	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are null.
	*/
	@Test
	public void testPost_NullParameters() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream response = request.post(null);
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are empty.
	*/
	@Test
	public void testPost_EmptyParameters() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream response = request.post(new Object[0]);
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are valid.
	*/
	@Test
	public void testPost_ValidParameters() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream response = request.post(new Object[]{"name", "value"});
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are valid.
	*/
	@Test
	public void testPost_ValidParameters2() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream response = request.post(new Object[]{"name", "value", "name2", "value2"});
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are valid.
	*/
	@Test
	public void testPost_ValidParameters3() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream response = request.post(new Object[]{"name", "value", "name2", "value2", "name3", "value3"});
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are valid.
	*/
	@Test
	public void testPost_ValidParameters4() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream response = request.post(new Object[]{"name", "value", "name2", "value2", "name3", "value3", "name4", "value4"});
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are valid.
	*/
	@Test
	public void testPost_ValidParameters5() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream response = request.post(new Object[]{"name", "value", "name2", "value2", "name3", "value3", "name4", "value4", "name5", "value5"});
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are valid.
	*/
	@Test
	public void testPost_ValidParameters6() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream response = request.post(new Object[]{"name", "value", "name2", "value2", "name3", "value3", "name4", "value4", "name5", "value5", "name6", "value6"});
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are valid.
	*/
	@Test
	public void testPost_ValidParameters7() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream response = request.post(new Object[]{"name", "value", "name2", "value2", "name3", "value3", "name4", "value4", "name5", "value5", "name6", "value6", "name7", "value7"});
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are valid.
	*/
	@Test
	public void testPost_ValidParameters8() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream response = request.post(new Object[]{"name", "value", "name2", "value2", "name3", "value3", "name4", "value4", "name5", "value5", "name6", "value6", "name7", "value7", "name8", "value8"});
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are valid.
	*/
	@Test
	public void testPost_ValidParameters9() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream response = request.post(new Object[]{"name", "value", "name2", "value2", "name3", "value3", "name4", "value4", "name5", "value5", "name6", "value6", "name7", "value7", "name8", "value8", "name9", "value9"});
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are valid.
	*/
	@Test
	public void testPost_ValidParameters10() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream response = request.post(new Object[]{"name", "value", "name2", "value2", "name3", "value3", "name4", "value4", "name5", "value5", "name6", "value6", "name7", "value7", "name8", "value8", "name9", "value9", "name10", "value10"});
		assertNotNull(response);
	}
}