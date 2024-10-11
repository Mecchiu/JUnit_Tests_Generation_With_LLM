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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object)} method.
*/
class ClientHttpRequestTest {

	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the method with a null name.
	*/
	@Test
	public void testPost_NullName() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> {
			request.post(null, "value");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testPost_NullValue() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("name", null);
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the method with a null name and value.
	*/
	@Test
	public void testPost_NullNameAndValue() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> {
			request.post(null, null);
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the method with a valid name and value.
	*/
	@Test
	public void testPost_ValidNameAndValue() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest();
		InputStream stream = request.post("name", "value");
		assertNotNull(stream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the method with a valid name and value.
	*/
	@Test
	public void testPost_ValidNameAndValue2() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest();
		InputStream stream = request.post("name", "value");
		assertNotNull(stream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the method with a valid name and value.
	*/
	@Test
	public void testPost_ValidNameAndValue3() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest();
		InputStream stream = request.post("name", "value");
		assertNotNull(stream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the method with a valid name and value.
	*/
	@Test
	public void testPost_ValidNameAndValue4() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest();
		InputStream stream = request.post("name", "value");
		assertNotNull(stream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the method with a valid name and value.
	*/
	@Test
	public void testPost_ValidNameAndValue5() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest();
		InputStream stream = request.post("name", "value");
		assertNotNull(stream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the method with a valid name and value.
	*/
	@Test
	public void testPost_ValidNameAndValue6() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest();
		InputStream stream = request.post("name", "value");
		assertNotNull(stream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the method with a valid name and value.
	*/
	@Test
	public void testPost_ValidNameAndValue7() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest();
		InputStream stream = request.post("name", "value");
		assertNotNull(stream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the method with a valid name and value.
	*/
	@Test
	public void testPost_ValidNameAndValue8() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest();
		InputStream stream = request.post("name", "value");
		assertNotNull(stream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the method with a valid name and value.
	*/
	@Test
	public void testPost_ValidNameAndValue9() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest();
		InputStream stream = request.post("name", "value");
		assertNotNull(stream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the method with a valid name and value.
	*/
	@Test
	public void testPost_ValidNameAndValue10() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest();
		InputStream stream = request.post("name", "value");
		assertNotNull(stream);
	}
}