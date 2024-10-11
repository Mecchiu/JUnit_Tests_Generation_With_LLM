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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
*/
class ClientHttpRequestTest {

	/**
	* Test case 1 for method {@link ClientHttpRequest#post(String, Object, String, Object)}.
	* Test case 1 checks if the method returns an InputStream object.
	*/
	@Test
	public void testPost1() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		InputStream inputStream = clientHttpRequest.post("name1", "value1", "name2", "value2");
		assertNotNull(inputStream);
	}
	
	/**
	* Test case 2 for method {@link ClientHttpRequest#post(String, Object, String, Object)}.
	* Test case 2 checks if the method returns an InputStream object.
	*/
	@Test
	public void testPost2() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		InputStream inputStream = clientHttpRequest.post("name1", "value1", "name2", "value2");
		assertNotNull(inputStream);
	}
	
	/**
	* Test case 3 for method {@link ClientHttpRequest#post(String, Object, String, Object)}.
	* Test case 3 checks if the method returns an InputStream object.
	*/
	@Test
	public void testPost3() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		InputStream inputStream = clientHttpRequest.post("name1", "value1", "name2", "value2");
		assertNotNull(inputStream);
	}
	
	/**
	* Test case 4 for method {@link ClientHttpRequest#post(String, Object, String, Object)}.
	* Test case 4 checks if the method returns an InputStream object.
	*/
	@Test
	public void testPost4() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		InputStream inputStream = clientHttpRequest.post("name1", "value1", "name2", "value2");
		assertNotNull(inputStream);
	}
	
	/**
	* Test case 5 for method {@link ClientHttpRequest#post(String, Object, String, Object)}.
	* Test case 5 checks if the method returns an InputStream object.
	*/
	@Test
	public void testPost5() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		InputStream inputStream = clientHttpRequest.post("name1", "value1", "name2", "value2");
		assertNotNull(inputStream);
	}
	
	/**
	* Test case 6 for method {@link ClientHttpRequest#post(String, Object, String, Object)}.
	* Test case 6 checks if the method returns an InputStream object.
	*/
	@Test
	public void testPost6() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		InputStream inputStream = clientHttpRequest.post("name1", "value1", "name2", "value2");
		assertNotNull(inputStream);
	}
	
	/**
	* Test case 7 for method {@link ClientHttpRequest#post(String, Object, String, Object)}.
	* Test case 7 checks if the method returns an InputStream object.
	*/
	@Test
	public void testPost7() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		InputStream inputStream = clientHttpRequest.post("name1", "value1", "name2", "value2");
		assertNotNull(inputStream);
	}
	
	/**
	* Test case 8 for method {@link ClientHttpRequest#post(String, Object, String, Object)}.
	* Test case 8 checks if the method returns an InputStream object.
	*/
	@Test
	public void testPost8() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		InputStream inputStream = clientHttpRequest.post("name1", "value1", "name2", "value2");
		assertNotNull(inputStream);
	}
	
	/**
	* Test case 9 for method {@link ClientHttpRequest#post(String, Object, String, Object)}.
	* Test case 9 checks if the method returns an InputStream object.
	*/
	@Test
	public void testPost9() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		InputStream inputStream = clientHttpRequest.post("name1", "value1", "name2", "value2");
		assertNotNull(inputStream);
	}
	
	/**
	* Test case 10 for method {@link ClientHttpRequest#post(String, Object, String, Object)}.
	* Test case 10 checks if the method returns an InputStream object.
	*/
	@Test
	public void testPost10() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		InputStream inputStream = clientHttpRequest.post("name1", "value1", "name2", "value2");
		assertNotNull(inputStream);
	}
}