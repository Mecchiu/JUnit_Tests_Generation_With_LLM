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
	public void testPostWithNullParameter() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post(null);
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with an empty parameter.
	*/
	@Test
	public void testPostWithEmptyParameter() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post(new Object[0]);
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains a null element.
	*/
	@Test
	public void testPostWithNullElementParameter() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post(new Object[] {null});
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains an empty element.
	*/
	@Test
	public void testPostWithEmptyElementParameter() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post(new Object[] {""});
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains a null element.
	*/
	@Test
	public void testPostWithNullElementParameter2() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post(new Object[] {"", null});
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains an empty element.
	*/
	@Test
	public void testPostWithEmptyElementParameter2() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post(new Object[] {"", ""});
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains a null element.
	*/
	@Test
	public void testPostWithNullElementParameter3() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post(new Object[] {"", "", null});
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains an empty element.
	*/
	@Test
	public void testPostWithEmptyElementParameter3() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post(new Object[] {"", "", ""});
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains a null element.
	*/
	@Test
	public void testPostWithNullElementParameter4() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post(new Object[] {"", "", "", null});
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains an empty element.
	*/
	@Test
	public void testPostWithEmptyElementParameter4() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post(new Object[] {"", "", "", ""});
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains a null element.
	*/
	@Test
	public void testPostWithNullElementParameter5() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post(new Object[] {"", "", "", "", null});
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains an empty element.
	*/
	@Test
	public void testPostWithEmptyElementParameter5() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post(new Object[] {"", "", "", "", ""});
		});
	}
	
}