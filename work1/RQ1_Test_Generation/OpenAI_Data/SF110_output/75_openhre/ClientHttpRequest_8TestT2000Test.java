// ClientHttpRequest_8Test.java
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_8Test {

	/**
	* Test case 1 for method post(String, Object, String, Object, String, Object, String, Object).
	* The test case tests the following:
	* <ul>
	* <li>the first parameter is null</li>
	* <li>the second parameter is null</li>
	* <li>the third parameter is null</li>
	* <li>the fourth parameter is null</li>
	* <li>the fifth parameter is null</li>
	* <li>the sixth parameter is null</li>
	* <li>the seventh parameter is null</li>
	* <li>the eighth parameter is null</li>
	* </ul>
	* @throws IOException
	*/
	@Test
	void testPost_1() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
		InputStream inputStream = clientHttpRequest.post(null, null, null, null, null, null, null, null);
		assertNotNull(inputStream);
	}
	
	/**
	* Test case 2 for method post(String, Object, String, Object, String, Object, String, Object).
	* The test case tests the following:
	* <ul>
	* <li>the first parameter is empty</li>
	* <li>the second parameter is empty</li>
	* <li>the third parameter is empty</li>
	* <li>the fourth parameter is empty</li>
	* <li>the fifth parameter is empty</li>
	* <li>the sixth parameter is empty</li>
	* <li>the seventh parameter is empty</li>
	* <li>the eighth parameter is empty</li>
	* </ul>
	* @throws IOException
	*/
	@Test
	void testPost_2() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
		InputStream inputStream = clientHttpRequest.post("", "", "", "", "", "", "", "");
		assertNotNull(inputStream);
	}
	
	/**
	* Test case 3 for method post(String, Object, String, Object, String, Object, String, Object).
	* The test case tests the following:
	* <ul>
	* <li>the first parameter is empty</li>
	* <li>the second parameter is empty</li>
	* <li>the third parameter is empty</li>
	* <li>the fourth parameter is empty</li>
	* <li>the fifth parameter is empty</li>
	* <li>the sixth parameter is empty</li>
	* <li>the seventh parameter is empty</li>
	* <li>the eighth parameter is empty</li>
	* </ul>
	* @throws IOException
	*/
	@Test
	void testPost_3() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
		InputStream inputStream = clientHttpRequest.post("", "", "", "", "", "", "", "");
		assertNotNull(inputStream);
	}
	
	/**
	* Test case 4 for method post(String, Object, String, Object, String, Object, String, Object).
	* The test case tests the following:
	* <ul>
	* <li>the first parameter is empty</li>
	* <li>the second parameter is empty</li>
	* <li>the third parameter is empty</li>
	* <li>the fourth parameter is empty</li>
	* <li>the fifth parameter is empty</li>
	* <li>the sixth parameter is empty</li>
	* <li>the seventh parameter is empty</li>
	* <li>the eighth parameter is empty</li>
	* </ul>
	* @throws IOException
	*/
	@Test
	void testPost_4() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
		InputStream inputStream = clientHttpRequest.post("", "", "", "", "", "", "", "");
		assertNotNull(inputStream);
	}
	
	/**
	* Test case 5 for method post(String, Object, String, Object, String, Object, String, Object).
	* The test case tests the following:
	* <ul>
	* <li>the first parameter is empty</li>
	* <li>the second parameter is empty</li>
	* <li>the third parameter is empty</li>
	* <li>the fourth parameter is empty</li>
	* <li>the fifth parameter is empty</li>
	* <li>the sixth parameter is empty</li>
	* <li>the seventh parameter is empty</li>
	* <li>the eighth parameter is empty</li>
	* </ul>
	* @throws IOException
	*/
	@Test
	void testPost_5() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
		InputStream inputStream = clientHttpRequest.post("", "", "", "", "", "", "", "");
		assertNotNull(inputStream);
	}
	
	/**
	* Test case 6 for method post(String, Object, String, Object, String, Object, String, Object).
	* The test case tests the following:
	* <ul>
	* <li>the first parameter is empty</li>
	* <li>the second parameter is empty</li>
	* <li>the third parameter is empty</li>
	* <li>the fourth parameter is empty</li>
	* <li>the fifth parameter is empty</li>
	* <li>the sixth parameter is empty</li>
	* <li>the seventh parameter is empty</li>
	* <li>the eighth parameter is empty</li>
	* </ul>
	* @throws IOException
	*/
	@Test
	void testPost_6() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
		InputStream inputStream = clientHttpRequest.post("", "", "", "", "", "", "", "");
		assertNotNull(inputStream);
	}
	
	/**
	* Test case 7 for method post(String, Object, String, Object, String, Object, String, Object).
	* The test case tests the following:
	* <ul>
	* <li>the first parameter is empty</li>
	* <li>the second parameter is empty</li>
	* <li>the third parameter is empty</li>
	* <li>the fourth parameter is empty</li>
	* <li>the fifth parameter is empty</li>
	* <li>the sixth parameter is empty</li>
	* <li>the seventh parameter is empty</li>
	* <li>the eighth parameter is empty</li>
	* </ul>
	* @throws IOException
	*/
	@Test
	void testPost_7() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
		InputStream inputStream = clientHttpRequest.post("", "", "", "", "", "", "", "");
		assertNotNull(inputStream);
	}
	
	/**
	* Test case 8 for method post(String, Object, String, Object, String, Object, String, Object).
	* The test case tests the following:
	* <ul>
	* <li>the first parameter is empty</li>
	* <li>the second parameter is empty</li>
	* <li>the third parameter is empty</li>
	* <li>the fourth parameter is empty</li>
	* <li>the fifth parameter is empty</li>
	* <li>the sixth parameter is empty</li>
	* <li>the seventh parameter is empty</li>
	* <li>the eighth parameter is empty</li>
	* </ul>
	* @throws IOException
