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
	* Test case 1 for method post.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>name1 = "name1"</li>
	* <li>value1 = "value1"</li>
	* <li>name2 = "name2"</li>
	* <li>value2 = "value2"</li>
	* <li>name3 = "name3"</li>
	* <li>value3 = "value3"</li>
	* </ul>
	*
	* @throws IOException
	*/
	@Test
	void testPost1() throws IOException {
		String name1 = "name1";
		Object value1 = "value1";
		String name2 = "name2";
		Object value2 = "value2";
		String name3 = "name3";
		Object value3 = "value3";
		InputStream result = new ClientHttpRequest().post(name1, value1, name2, value2, name3, value3);
		assertNotNull(result);
	}
	
	/**
	* Test case 2 for method post.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>name1 = "name1"</li>
	* <li>value1 = "value1"</li>
	* <li>name2 = "name2"</li>
	* <li>value2 = "value2"</li>
	* <li>name3 = "name3"</li>
	* <li>value3 = "value3"</li>
	* </ul>
	*
	* @throws IOException
	*/
	@Test
	void testPost2() throws IOException {
		String name1 = "name1";
		Object value1 = "value1";
		String name2 = "name2";
		Object value2 = "value2";
		String name3 = "name3";
		Object value3 = "value3";
		InputStream result = new ClientHttpRequest().post(name1, value1, name2, value2, name3, value3);
		assertNotNull(result);
	}
	
	/**
	* Test case 3 for method post.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>name1 = "name1"</li>
	* <li>value1 = "value1"</li>
	* <li>name2 = "name2"</li>
	* <li>value2 = "value2"</li>
	* <li>name3 = "name3"</li>
	* <li>value3 = "value3"</li>
	* </ul>
	*
	* @throws IOException
	*/
	@Test
	void testPost3() throws IOException {
		String name1 = "name1";
		Object value1 = "value1";
		String name2 = "name2";
		Object value2 = "value2";
		String name3 = "name3";
		Object value3 = "value3";
		InputStream result = new ClientHttpRequest().post(name1, value1, name2, value2, name3, value3);
		assertNotNull(result);
	}
	
	/**
	* Test case 4 for method post.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>name1 = "name1"</li>
	* <li>value1 = "value1"</li>
	* <li>name2 = "name2"</li>
	* <li>value2 = "value2"</li>
	* <li>name3 = "name3"</li>
	* <li>value3 = "value3"</li>
	* </ul>
	*
	* @throws IOException
	*/
	@Test
	void testPost4() throws IOException {
		String name1 = "name1";
		Object value1 = "value1";
		String name2 = "name2";
		Object value2 = "value2";
		String name3 = "name3";
		Object value3 = "value3";
		InputStream result = new ClientHttpRequest().post(name1, value1, name2, value2, name3, value3);
		assertNotNull(result);
	}
	
	/**
	* Test case 5 for method post.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>name1 = "name1"</li>
	* <li>value1 = "value1"</li>
	* <li>name2 = "name2"</li>
	* <li>value2 = "value2"</li>
	* <li>name3 = "name3"</li>
	* <li>value3 = "value3"</li>
	* </ul>
	*
	* @throws IOException
	*/
	@Test
	void testPost5() throws IOException {
		String name1 = "name1";
		Object value1 = "value1";
		String name2 = "name2";
		Object value2 = "value2";
		String name3 = "name3";
		Object value3 = "value3";
		InputStream result = new ClientHttpRequest().post(name1, value1, name2, value2, name3, value3);
		assertNotNull(result);
	}
	
	/**
	* Test case 6 for method post.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>name1 = "name1"</li>
	* <li>value1 = "value1"</li>
	* <li>name2 = "name2"</li>
	* <li>value2 = "value2"</li>
	* <li>name3 = "name3"</li>
	* <li>value3 = "value3"</li>
	* </ul>
	*
	* @throws IOException
	*/
	@Test
	void testPost6() throws IOException {
		String name1 = "name1";
		Object value1 = "value1";
		String name2 = "name2";
		Object value2 = "value2";
		String name3 = "name3";
		Object value3 = "value3";
		InputStream result = new ClientHttpRequest().post(name1, value1, name2, value2, name3, value3);
		assertNotNull(result);
	}
	
	/**
	* Test case 7 for method post.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>name1 = "name1"</li>
	* <li>value1 = "value1"</li>
	* <li>name2 = "name2"</li>
	* <li>value2 = "value2"</li>
	* <li>name3 = "name3"</li>
	* <li>value3 = "value3"</li>
	* </ul>
	*
	* @throws IOException
	*/
	@Test
	void testPost7() throws IOException {
		String name1 = "name1";
		Object value1 = "value1";
		String name2 = "name2";
		Object value2 = "value2";
		String name3 = "name3";
		Object value3 = "value3";
		InputStream result = new ClientHttpRequest().post(name1, value1, name2, value2, name3, value3);
		assertNotNull(result);
	}
	
	/**
	* Test case 8 for method post.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>name1 = "name1"</li>
	* <li>value1 = "value1"</li>
	* <li>name2 = "name2"</li>
	* <li>value2 = "value2"</li>
	* <li>name3 = "name3"</li>
	* <li>value3 = "value3"</li>
	* </ul>
	*
	* @throws IOException
	*/
	@Test
	void testPost8() throws IOException {
		String name1 = "name1";
		Object value1 = "value1";
		String name2 = "name2";
		Object value2 = "value2";
		String name3 = "name3";
		Object value3 = "value3";
		InputStream result = new ClientHttpRequest().post(name1, value1, name2, value2, name3, value3);
		assertNotNull(result);
	}
	
	/**
	* Test case 9 for method post.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>name1 = "name1"</li>
	* <li>value1 = "value1"</li>
	* <li>name2 = "name2"</li>
	* <li>value2 = "value2"</li>
	* <li>name3 = "name3"</li>
	* <li>value3 = "value3"</li>
	* </ul>
	*
	* @throws IOException
	*/
	@Test
	void testPost9() throws IOException {
		String name1 = "name1";
		Object value1 = "value1";
		String name2 = "name2";
		Object value2 = "value2";
		String name3 = "name3";
		Object value3 = "value3";
		InputStream result = new ClientHttpRequest().post(name1, value1, name2, value2, name3, value3);
		assertNotNull(result);
	}
	
	/**
	* Test case 10 for method post.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>name1 = "name1"</li>
	* <li>value1 = "value1"</li>
	* <li>name2 = "name2"</li>
	* <li>value2 = "value2"</li>
	* <li>name3 = "name3"</li>
	* <li>value3 = "value3"</li>
	* </ul>
	*
	* @throws IOException
	*/
	@Test
	void testPost10() throws IOException {
		String name1 = "name1";
		Object value1 = "value1";
		String name2 = "name2";
		Object value2 = "value2";
		String name3 = "name3";
		Object value3 = "value3";
		InputStream result = new ClientHttpRequest().post(name1, value1, name2, value2, name3, value3);
		assertNotNull(result);
	}
	
}