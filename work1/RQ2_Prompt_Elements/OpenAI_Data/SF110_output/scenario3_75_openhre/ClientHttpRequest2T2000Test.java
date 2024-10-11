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
	* It tests the method with a null parameter.
	*/
	@Test
	public void testPostNull() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream is = request.post(null);
		assertNotNull(is);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with an empty parameter.
	*/
	@Test
	public void testPostEmpty() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream is = request.post(new Object[0]);
		assertNotNull(is);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a valid parameter.
	*/
	@Test
	public void testPostValid() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream is = request.post(new Object[]{"name", "value"});
		assertNotNull(is);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a valid parameter.
	*/
	@Test
	public void testPostValid2() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream is = request.post(new Object[]{"name", "value", "name2", "value2"});
		assertNotNull(is);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a valid parameter.
	*/
	@Test
	public void testPostValid3() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream is = request.post(new Object[]{"name", "value", "name2", "value2", "name3", "value3"});
		assertNotNull(is);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a valid parameter.
	*/
	@Test
	public void testPostValid4() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream is = request.post(new Object[]{"name", "value", "name2", "value2", "name3", "value3", "name4", "value4"});
		assertNotNull(is);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a valid parameter.
	*/
	@Test
	public void testPostValid5() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream is = request.post(new Object[]{"name", "value", "name2", "value2", "name3", "value3", "name4", "value4", "name5", "value5"});
		assertNotNull(is);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a valid parameter.
	*/
	@Test
	public void testPostValid6() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream is = request.post(new Object[]{"name", "value", "name2", "value2", "name3", "value3", "name4", "value4", "name5", "value5", "name6", "value6"});
		assertNotNull(is);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a valid parameter.
	*/
	@Test
	public void testPostValid7() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream is = request.post(new Object[]{"name", "value", "name2", "value2", "name3", "value3", "name4", "value4", "name5", "value5", "name6", "value6", "name7", "value7"});
		assertNotNull(is);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a valid parameter.
	*/
	@Test
	public void testPostValid8() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream is = request.post(new Object[]{"name", "value", "name2", "value2", "name3", "value3", "name4", "value4", "name5", "value5", "name6", "value6", "name7", "value7", "name8", "value8"});
		assertNotNull(is);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a valid parameter.
	*/
	@Test
	public void testPostValid9() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream is = request.post(new Object[]{"name", "value", "name2", "value2", "name3", "value3", "name4", "value4", "name5", "value5", "name6", "value6", "name7", "value7", "name8", "value8", "name9", "value9"});
		assertNotNull(is);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a valid parameter.
	*/
	@Test
	public void testPostValid10() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream is = request.post(new Object[]{"name", "value", "name2", "value2", "name3", "value3", "name4", "value4", "name5", "value5", "name6", "value6", "name7", "value7", "name8", "value8", "name9", "value9", "name10", "value10"});
		assertNotNull(is);
	}
}