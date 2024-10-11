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
	* It tests the method with the following parameters:
	* <ul>
	* <li>cookies: null</li>
	* <li>parameters: null</li>
	* </ul>
	* The expected result is an {@link IOException}.
	*/
	@Test
	void testPost_1() throws IOException {
		ClientHttpRequest fixture = new ClientHttpRequest();
		String[] cookies = null;
		Object[] parameters = null;
		
		assertThrows(IOException.class, () -> fixture.post(cookies, parameters));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>cookies: empty array</li>
	* <li>parameters: empty array</li>
	* </ul>
	* The expected result is an {@link IOException}.
	*/
	@Test
	void testPost_2() throws IOException {
		ClientHttpRequest fixture = new ClientHttpRequest();
		String[] cookies = new String[] {};
		Object[] parameters = new Object[] {};
		
		assertThrows(IOException.class, () -> fixture.post(cookies, parameters));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>cookies: null</li>
	* <li>parameters: empty array</li>
	* </ul>
	* The expected result is an {@link IOException}.
	*/
	@Test
	void testPost_3() throws IOException {
		ClientHttpRequest fixture = new ClientHttpRequest();
		String[] cookies = null;
		Object[] parameters = new Object[] {};
		
		assertThrows(IOException.class, () -> fixture.post(cookies, parameters));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>cookies: empty array</li>
	* <li>parameters: null</li>
	* </ul>
	* The expected result is an {@link IOException}.
	*/
	@Test
	void testPost_4() throws IOException {
		ClientHttpRequest fixture = new ClientHttpRequest();
		String[] cookies = new String[] {};
		Object[] parameters = null;
		
		assertThrows(IOException.class, () -> fixture.post(cookies, parameters));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>cookies: null</li>
	* <li>parameters: null</li>
	* </ul>
	* The expected result is an {@link IOException}.
	*/
	@Test
	void testPost_5() throws IOException {
		ClientHttpRequest fixture = new ClientHttpRequest();
		String[] cookies = null;
		Object[] parameters = null;
		
		assertThrows(IOException.class, () -> fixture.post(cookies, parameters));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>cookies: empty array</li>
	* <li>parameters: empty array</li>
	* </ul>
	* The expected result is an {@link IOException}.
	*/
	@Test
	void testPost_6() throws IOException {
		ClientHttpRequest fixture = new ClientHttpRequest();
		String[] cookies = new String[] {};
		Object[] parameters = new Object[] {};
		
		assertThrows(IOException.class, () -> fixture.post(cookies, parameters));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>cookies: null</li>
	* <li>parameters: empty array</li>
	* </ul>
	* The expected result is an {@link IOException}.
	*/
	@Test
	void testPost_7() throws IOException {
		ClientHttpRequest fixture = new ClientHttpRequest();
		String[] cookies = null;
		Object[] parameters = new Object[] {};
		
		assertThrows(IOException.class, () -> fixture.post(cookies, parameters));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>cookies: empty array</li>
	* <li>parameters: null</li>
	* </ul>
	* The expected result is an {@link IOException}.
	*/
	@Test
	void testPost_8() throws IOException {
		ClientHttpRequest fixture = new ClientHttpRequest();
		String[] cookies = new String[] {};
		Object[] parameters = null;
		
		assertThrows(IOException.class, () -> fixture.post(cookies, parameters));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>cookies: null</li>
	* <li>parameters: null</li>
	* </ul>
	* The expected result is an {@link IOException}.
	*/
	@Test
	void testPost_9() throws IOException {
		ClientHttpRequest fixture = new ClientHttpRequest();
		String[] cookies = null;
		Object[] parameters = null;
		
		assertThrows(IOException.class, () -> fixture.post(cookies, parameters));
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>cookies: empty array</li>
	* <li>parameters: empty array</li>
	* </ul>
	* The expected result is an {@link IOException}.
	*/
	@Test
	void testPost_10() throws IOException {
		ClientHttpRequest fixture = new ClientHttpRequest();
		String[] cookies = new String[] {};
		Object[] parameters = new Object[] {};
		
		assertThrows(IOException.class, () -> fixture.post(cookies, parameters));
	}
}