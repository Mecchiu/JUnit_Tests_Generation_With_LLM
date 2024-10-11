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
	public void testPost_1() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Object[] parameters = null;
		InputStream inputStream = clientHttpRequest.post(parameters);
		assertNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are empty.
	*/
	@Test
	public void testPost_2() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Object[] parameters = new Object[0];
		InputStream inputStream = clientHttpRequest.post(parameters);
		assertNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are not empty.
	*/
	@Test
	public void testPost_3() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Object[] parameters = new Object[1];
		parameters[0] = "parameter";
		InputStream inputStream = clientHttpRequest.post(parameters);
		assertNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are not empty.
	*/
	@Test
	public void testPost_4() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Object[] parameters = new Object[2];
		parameters[0] = "parameter";
		parameters[1] = "parameter";
		InputStream inputStream = clientHttpRequest.post(parameters);
		assertNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are not empty.
	*/
	@Test
	public void testPost_5() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Object[] parameters = new Object[3];
		parameters[0] = "parameter";
		parameters[1] = "parameter";
		parameters[2] = "parameter";
		InputStream inputStream = clientHttpRequest.post(parameters);
		assertNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are not empty.
	*/
	@Test
	public void testPost_6() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Object[] parameters = new Object[4];
		parameters[0] = "parameter";
		parameters[1] = "parameter";
		parameters[2] = "parameter";
		parameters[3] = "parameter";
		InputStream inputStream = clientHttpRequest.post(parameters);
		assertNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are not empty.
	*/
	@Test
	public void testPost_7() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Object[] parameters = new Object[5];
		parameters[0] = "parameter";
		parameters[1] = "parameter";
		parameters[2] = "parameter";
		parameters[3] = "parameter";
		parameters[4] = "parameter";
		InputStream inputStream = clientHttpRequest.post(parameters);
		assertNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are not empty.
	*/
	@Test
	public void testPost_8() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Object[] parameters = new Object[6];
		parameters[0] = "parameter";
		parameters[1] = "parameter";
		parameters[2] = "parameter";
		parameters[3] = "parameter";
		parameters[4] = "parameter";
		parameters[5] = "parameter";
		InputStream inputStream = clientHttpRequest.post(parameters);
		assertNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are not empty.
	*/
	@Test
	public void testPost_9() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Object[] parameters = new Object[7];
		parameters[0] = "parameter";
		parameters[1] = "parameter";
		parameters[2] = "parameter";
		parameters[3] = "parameter";
		parameters[4] = "parameter";
		parameters[5] = "parameter";
		parameters[6] = "parameter";
		InputStream inputStream = clientHttpRequest.post(parameters);
		assertNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the case when the parameters are not empty.
	*/
	@Test
	public void testPost_10() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Object[] parameters = new Object[8];
		parameters[0] = "parameter";
		parameters[1] = "parameter";
		parameters[2] = "parameter";
		parameters[3] = "parameter";
		parameters[4] = "parameter";
		parameters[5] = "parameter";
		parameters[6] = "parameter";
		parameters[7] = "parameter";
		InputStream inputStream = clientHttpRequest.post(parameters);
		assertNull(inputStream);
	}
}