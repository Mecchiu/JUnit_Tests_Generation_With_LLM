// ClientHttpRequest_6Test.java
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
class ClientHttpRequest_6Test {

	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* It tests the case when the first parameter is null.
	*/
	@Test
	void testPost_1() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://www.google.com"));
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post(null, "value1", "name2", "value2");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* It tests the case when the second parameter is null.
	*/
	@Test
	void testPost_2() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://www.google.com"));
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post("name1", null, "name2", "value2");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* It tests the case when the third parameter is null.
	*/
	@Test
	void testPost_3() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://www.google.com"));
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post("name1", "value1", null, "value2");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* It tests the case when the fourth parameter is null.
	*/
	@Test
	void testPost_4() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://www.google.com"));
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post("name1", "value1", "name2", null);
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* It tests the case when the first parameter is empty.
	*/
	@Test
	void testPost_5() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://www.google.com"));
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("", "value1", "name2", "value2");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* It tests the case when the second parameter is empty.
	*/
	@Test
	void testPost_6() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://www.google.com"));
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("name1", "", "name2", "value2");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* It tests the case when the third parameter is empty.
	*/
	@Test
	void testPost_7() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://www.google.com"));
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("name1", "value1", "", "value2");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* It tests the case when the fourth parameter is empty.
	*/
	@Test
	void testPost_8() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://www.google.com"));
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("name1", "value1", "name2", "");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* It tests the case when the first parameter is whitespace.
	*/
	@Test
	void testPost_9() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://www.google.com"));
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post(" ", "value1", "name2", "value2");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* It tests the case when the second parameter is whitespace.
	*/
	@Test
	void testPost_10() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://www.google.com"));
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("name1", " ", "name2", "value2");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* It tests the case when the third parameter is whitespace.
	*/
	@Test
	void testPost_11() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://www.google.com"));
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("name1", "value1", " ", "value2");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* It tests the case when the fourth parameter is whitespace.
	*/
	@Test
	void testPost_12() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://www.google.com"));
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("name1", "value1", "name2", " ");
		});
	}
}

// ClientHttpRequest_7Test.java
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
class ClientHttpRequest_7Test {
		
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
	* It tests the case when the first parameter is null.
	*/
	@Test
	void testPost_1() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://www.google.com"));
		assertThrows(NullPointerException.class, () -> {
			client