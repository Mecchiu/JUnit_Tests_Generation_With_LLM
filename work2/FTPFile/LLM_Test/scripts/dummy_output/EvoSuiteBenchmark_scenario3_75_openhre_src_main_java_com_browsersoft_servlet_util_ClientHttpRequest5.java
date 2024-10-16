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
	* It tests the case when the parameter name is null.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_NullName() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post(null, "value");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter value is null.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_NullValue() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("name", null);
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter name is empty.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_EmptyName() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("", "value");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter value is empty.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_EmptyValue() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("name", "");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter name is a whitespace.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_WhitespaceName() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post(" ", "value");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter value is a whitespace.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_WhitespaceValue() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("name", " ");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter name is a tab.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_TabName() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("\t", "value");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter value is a tab.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_TabValue() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("name", "\t");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter name is a new line.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_NewLineName() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("\n", "value");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter value is a new line.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_NewLineValue() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("name", "\n");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter name is a carriage return.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_CarriageReturnName() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("\r", "value");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter value is a carriage return.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_CarriageReturnValue() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("name", "\r");
		});
	}
}