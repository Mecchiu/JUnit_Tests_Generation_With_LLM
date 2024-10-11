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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequestTest {

	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
	* It tests the case when the first parameter name is null.
	*/
	@Test
	public void testPost_1() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post(null, "value1", "name2", "value2", "name3", "value3");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
	* It tests the case when the first parameter value is null.
	*/
	@Test
	public void testPost_2() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("name1", null, "name2", "value2", "name3", "value3");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
	* It tests the case when the second parameter name is null.
	*/
	@Test
	public void testPost_3() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("name1", "value1", null, "value2", "name3", "value3");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
	* It tests the case when the second parameter value is null.
	*/
	@Test
	public void testPost_4() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("name1", "value1", "name2", null, "name3", "value3");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
	* It tests the case when the third parameter name is null.
	*/
	@Test
	public void testPost_5() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("name1", "value1", "name2", "value2", null, "value3");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
	* It tests the case when the third parameter value is null.
	*/
	@Test
	public void testPost_6() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("name1", "value1", "name2", "value2", "name3", null);
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
	* It tests the case when the first parameter name is empty.
	*/
	@Test
	public void testPost_7() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("", "value1", "name2", "value2", "name3", "value3");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
	* It tests the case when the second parameter name is empty.
	*/
	@Test
	public void testPost_8() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("name1", "value1", "", "value2", "name3", "value3");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
	* It tests the case when the third parameter name is empty.
	*/
	@Test
	public void testPost_9() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("name1", "value1", "name2", "value2", "", "value3");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
	* It tests the case when the first parameter name is a whitespace.
	*/
	@Test
	public void testPost_10() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post(" ", "value1", "name2", "value2", "name3", "value3");
		});
	}
}