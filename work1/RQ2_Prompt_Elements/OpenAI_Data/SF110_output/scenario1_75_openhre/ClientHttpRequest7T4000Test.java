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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequestTest {

	/**
	* Test case 1 for method {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)}.
	* Test case 1 checks the correctness of the method when the first parameter is null.
	* Expected result: {@link NullPointerException}.
	*/
	@Test
	void testPost1() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post(null, "value1", "name2", "value2", "name3", "value3");
		});
	}
	
	/**
	* Test case 2 for method {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)}.
	* Test case 2 checks the correctness of the method when the second parameter is null.
	* Expected result: {@link NullPointerException}.
	*/
	@Test
	void testPost2() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post("name1", null, "name2", "value2", "name3", "value3");
		});
	}
	
	/**
	* Test case 3 for method {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)}.
	* Test case 3 checks the correctness of the method when the third parameter is null.
	* Expected result: {@link NullPointerException}.
	*/
	@Test
	void testPost3() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post("name1", "value1", null, "value2", "name3", "value3");
		});
	}
	
	/**
	* Test case 4 for method {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)}.
	* Test case 4 checks the correctness of the method when the fourth parameter is null.
	* Expected result: {@link NullPointerException}.
	*/
	@Test
	void testPost4() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post("name1", "value1", "name2", null, "name3", "value3");
		});
	}
	
	/**
	* Test case 5 for method {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)}.
	* Test case 5 checks the correctness of the method when the fifth parameter is null.
	* Expected result: {@link NullPointerException}.
	*/
	@Test
	void testPost5() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post("name1", "value1", "name2", "value2", null, "value3");
		});
	}
	
	/**
	* Test case 6 for method {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)}.
	* Test case 6 checks the correctness of the method when the sixth parameter is null.
	* Expected result: {@link NullPointerException}.
	*/
	@Test
	void testPost6() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(NullPointerException.class, () -> {
			clientHttpRequest.post("name1", "value1", "name2", "value2", "name3", null);
		});
	}
	
	/**
	* Test case 7 for method {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)}.
	* Test case 7 checks the correctness of the method when the first parameter is empty.
	* Expected result: {@link IllegalArgumentException}.
	*/
	@Test
	void testPost7() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("", "value1", "name2", "value2", "name3", "value3");
		});
	}
	
	/**
	* Test case 8 for method {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)}.
	* Test case 8 checks the correctness of the method when the second parameter is empty.
	* Expected result: {@link IllegalArgumentException}.
	*/
	@Test
	void testPost8() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("name1", "", "name2", "value2", "name3", "value3");
		});
	}
	
	/**
	* Test case 9 for method {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)}.
	* Test case 9 checks the correctness of the method when the third parameter is empty.
	* Expected result: {@link IllegalArgumentException}.
	*/
	@Test
	void testPost9() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("name1", "value1", "", "value2", "name3", "value3");
		});
	}
	
	/**
	* Test case 10 for method {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)}.
	* Test case 10 checks the correctness of the method when the fourth parameter is empty.
	* Expected result: {@link IllegalArgumentException}.
	*/
	@Test
	void testPost10() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("name1", "value1", "name2", "", "name3", "value3");
		});
	}
	
	/**
	* Test case 11 for method {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)}.
	* Test case 11 checks the correctness of the method when the fifth parameter is empty.
	* Expected result: {@link IllegalArgumentException}.
	*/
	@Test
	void testPost11() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("name1", "value1", "name2", "value2", "", "value3");
		});
	}
	
	/**
	* Test case 12 for method {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)}.
	* Test case 12 checks the correctness of the method when the sixth parameter is empty.
	* Expected result: {@link IllegalArgumentException}.
	*/
	@Test
	void testPost12() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		assertThrows(IllegalArgumentException.class, () -> {
			clientHttpRequest.post("name1", "value1", "name2", "value2", "name3", "");
		});
	}
}