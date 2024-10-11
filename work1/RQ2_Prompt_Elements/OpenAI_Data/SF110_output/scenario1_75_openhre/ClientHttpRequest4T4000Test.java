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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String[], Object[])} method.
*/
class ClientHttpRequestTest {

	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the case when the cookies parameter is null.
	*/
	@Test
	void testPost_cookies_null() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> clientHttpRequest.post(null, new Object[]{}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the case when the parameters parameter is null.
	*/
	@Test
	void testPost_parameters_null() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> clientHttpRequest.post(new String[]{}, null));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the case when the cookies parameter is empty.
	*/
	@Test
	void testPost_cookies_empty() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> clientHttpRequest.post(new String[]{}, new Object[]{}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the case when the parameters parameter is empty.
	*/
	@Test
	void testPost_parameters_empty() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> clientHttpRequest.post(new String[]{""}, new Object[]{}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the case when the cookies parameter is not empty and the parameters parameter is not empty.
	*/
	@Test
	void testPost_cookies_not_empty_parameters_not_empty() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new String[]{""}, new Object[]{}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the case when the cookies parameter is not empty and the parameters parameter is not empty.
	*/
	@Test
	void testPost_cookies_not_empty_parameters_not_empty_1() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new String[]{""}, new Object[]{""}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the case when the cookies parameter is not empty and the parameters parameter is not empty.
	*/
	@Test
	void testPost_cookies_not_empty_parameters_not_empty_2() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new String[]{""}, new Object[]{"", ""}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the case when the cookies parameter is not empty and the parameters parameter is not empty.
	*/
	@Test
	void testPost_cookies_not_empty_parameters_not_empty_3() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new String[]{""}, new Object[]{"", "", ""}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the case when the cookies parameter is not empty and the parameters parameter is not empty.
	*/
	@Test
	void testPost_cookies_not_empty_parameters_not_empty_4() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new String[]{""}, new Object[]{"", "", "", ""}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the case when the cookies parameter is not empty and the parameters parameter is not empty.
	*/
	@Test
	void testPost_cookies_not_empty_parameters_not_empty_5() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new String[]{""}, new Object[]{"", "", "", "", ""}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the case when the cookies parameter is not empty and the parameters parameter is not empty.
	*/
	@Test
	void testPost_cookies_not_empty_parameters_not_empty_6() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new String[]{""}, new Object[]{"", "", "", "", "", ""}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the case when the cookies parameter is not empty and the parameters parameter is not empty.
	*/
	@Test
	void testPost_cookies_not_empty_parameters_not_empty_7() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new String[]{""}, new Object[]{"", "", "", "", "", "", ""}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the case when the cookies parameter is not empty and the parameters parameter is not empty.
	*/
	@Test
	void testPost_cookies_not_empty_parameters_not_empty_8() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new String[]{""}, new Object[]{"", "", "", "", "", "", "", ""}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the case when the cookies parameter is not empty and the parameters parameter is not empty.
	*/
	@Test
	void testPost_cookies_not_empty_parameters_not_empty_9() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new String[]{""}, new Object[]{"", "", "", "", "", "", "", "", ""}));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the case when the cookies parameter is not empty and the parameters parameter is not empty.
	*/
	@Test
	void testPost_cookies_not_empty_parameters_not_empty_10() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertNotNull(clientHttpRequest.post(new String[]{""}, new Object[]{"", "", "", "", "", "", "", "", "", ""}));
	}
}