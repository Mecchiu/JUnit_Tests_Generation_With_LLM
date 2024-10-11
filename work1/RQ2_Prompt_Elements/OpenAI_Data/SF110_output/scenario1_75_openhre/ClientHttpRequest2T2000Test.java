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
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post(new Object[]{});
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains a null element.
	*/
	@Test
	public void testPostWithNullElement() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post(new Object[]{null});
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains an empty element.
	*/
	@Test
	public void testPostWithEmptyElement() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post(new Object[]{""});
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains a non-empty element.
	*/
	@Test
	public void testPostWithNonEmptyElement() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new Object[]{"http://www.google.com"}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains a non-empty element.
	*/
	@Test
	public void testPostWithNonEmptyElement2() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new Object[]{"http://www.google.com", "http://www.google.com"}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains a non-empty element.
	*/
	@Test
	public void testPostWithNonEmptyElement3() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new Object[]{"http://www.google.com", "http://www.google.com", "http://www.google.com"}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains a non-empty element.
	*/
	@Test
	public void testPostWithNonEmptyElement4() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new Object[]{"http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com"}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains a non-empty element.
	*/
	@Test
	public void testPostWithNonEmptyElement5() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new Object[]{"http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com"}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains a non-empty element.
	*/
	@Test
	public void testPostWithNonEmptyElement6() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new Object[]{"http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com"}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains a non-empty element.
	*/
	@Test
	public void testPostWithNonEmptyElement7() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new Object[]{"http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com"}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains a non-empty element.
	*/
	@Test
	public void testPostWithNonEmptyElement8() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new Object[]{"http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com"}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains a non-empty element.
	*/
	@Test
	public void testPostWithNonEmptyElement9() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new Object[]{"http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com"}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Object[])} method.
	* It tests the method with a parameter that contains a non-empty element.
	*/
	@Test
	public void testPostWithNonEmptyElement10() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new Object[]{"http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com", "http://www.google.com"}));
	}
}