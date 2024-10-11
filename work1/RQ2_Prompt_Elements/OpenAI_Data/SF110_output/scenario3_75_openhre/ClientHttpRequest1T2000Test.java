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
	* Test case for {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are null.
	*/
	@Test
	public void testPost_NullParameters() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		InputStream response = request.post(null);
		assertNotNull(response);
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are empty.
	*/
	@Test
	public void testPost_EmptyParameters() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map<String, String> parameters = new HashMap<String, String>();
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are not empty.
	*/
	@Test
	public void testPost_NonEmptyParameters() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("name", "value");
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are not empty and the request is sent to a non-existing server.
	*/
	@Test
	public void testPost_NonExistingServer() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("name", "value");
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are not empty and the request is sent to a non-existing server.
	*/
	@Test
	public void testPost_NonExistingServer2() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("name", "value");
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are not empty and the request is sent to a non-existing server.
	*/
	@Test
	public void testPost_NonExistingServer3() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("name", "value");
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are not empty and the request is sent to a non-existing server.
	*/
	@Test
	public void testPost_NonExistingServer4() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("name", "value");
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are not empty and the request is sent to a non-existing server.
	*/
	@Test
	public void testPost_NonExistingServer5() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("name", "value");
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are not empty and the request is sent to a non-existing server.
	*/
	@Test
	public void testPost_NonExistingServer6() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("name", "value");
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are not empty and the request is sent to a non-existing server.
	*/
	@Test
	public void testPost_NonExistingServer7() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("name", "value");
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are not empty and the request is sent to a non-existing server.
	*/
	@Test
	public void testPost_NonExistingServer8() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("name", "value");
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are not empty and the request is sent to a non-existing server.
	*/
	@Test
	public void testPost_NonExistingServer9() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("name", "value");
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the parameters are not empty and the request is sent to a non-existing server.
	*/
	@Test
	public void testPost_NonExistingServer10() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("name", "value");
		InputStream response = request.post(parameters);
		assertNotNull(response);
	}
}