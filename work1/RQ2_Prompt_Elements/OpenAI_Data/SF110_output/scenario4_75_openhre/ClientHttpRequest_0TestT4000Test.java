// ClientHttpRequest_0Test.java
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post()} method.
*/
class ClientHttpRequest_0Test {

	/**
	* Test case for the {@link ClientHttpRequest#post()} method.
	* It tests the case when the {@link ClientHttpRequest#post()} method is called and the {@link ClientHttpRequest#setParameter(String, Object)} method is called with a {@link String} parameter.
	* @throws IOException
	*/
	@Test
	void testPost_0() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/");
		clientHttpRequest.setParameter("name", "value");
		InputStream inputStream = clientHttpRequest.post();
		assertNotNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post()} method.
	* It tests the case when the {@link ClientHttpRequest#post()} method is called and the {@link ClientHttpRequest#setParameter(String, Object)} method is called with a {@link File} parameter.
	* @throws IOException
	*/
	@Test
	void testPost_1() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/");
		clientHttpRequest.setParameter("name", new File("file"));
		InputStream inputStream = clientHttpRequest.post();
		assertNotNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post()} method.
	* It tests the case when the {@link ClientHttpRequest#post()} method is called and the {@link ClientHttpRequest#setParameter(String, Object)} method is called with a {@link File} parameter and the {@link ClientHttpRequest#setCookie(String, String)} method is called.
	* @throws IOException
	*/
	@Test
	void testPost_2() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/");
		clientHttpRequest.setParameter("name", new File("file"));
		clientHttpRequest.setCookie("name", "value");
		InputStream inputStream = clientHttpRequest.post();
		assertNotNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post()} method.
	* It tests the case when the {@link ClientHttpRequest#post()} method is called and the {@link ClientHttpRequest#setParameter(String, Object)} method is called with a {@link File} parameter and the {@link ClientHttpRequest#setCookies(Map)} method is called.
	* @throws IOException
	*/
	@Test
	void testPost_3() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/");
		clientHttpRequest.setParameter("name", new File("file"));
		Map<String, String> cookies = new HashMap<String, String>();
		cookies.put("name", "value");
		clientHttpRequest.setCookies(cookies);
		InputStream inputStream = clientHttpRequest.post();
		assertNotNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post()} method.
	* It tests the case when the {@link ClientHttpRequest#post()} method is called and the {@link ClientHttpRequest#setParameter(String, Object)} method is called with a {@link File} parameter and the {@link ClientHttpRequest#setCookies(String[])} method is called.
	* @throws IOException
	*/
	@Test
	void testPost_4() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/");
		clientHttpRequest.setParameter("name", new File("file"));
		String[] cookies = new String[2];
		cookies[0] = "name";
		cookies[1] = "value";
		clientHttpRequest.setCookies(cookies);
		InputStream inputStream = clientHttpRequest.post();
		assertNotNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post()} method.
	* It tests the case when the {@link ClientHttpRequest#post()} method is called and the {@link ClientHttpRequest#setParameters(Map)} method is called.
	* @throws IOException
	*/
	@Test
	void testPost_5() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/");
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("name", "value");
		clientHttpRequest.setParameters(parameters);
		InputStream inputStream = clientHttpRequest.post();
		assertNotNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post()} method.
	* It tests the case when the {@link ClientHttpRequest#post()} method is called and the {@link ClientHttpRequest#setParameters(Object[])} method is called.
	* @throws IOException
	*/
	@Test
	void testPost_6() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/");
		Object[] parameters = new Object[2];
		parameters[0] = "name";
		parameters[1] = "value";
		clientHttpRequest.setParameters(parameters);
		InputStream inputStream = clientHttpRequest.post();
		assertNotNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post()} method.
	* It tests the case when the {@link ClientHttpRequest#post()} method is called and the {@link ClientHttpRequest#setParameters(Map)} method is called and the {@link ClientHttpRequest#setCookies(Map)} method is called.
	* @throws IOException
	*/
	@Test
	void testPost_7() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/");
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("name", "value");
		clientHttpRequest.setParameters(parameters);
		Map<String, String> cookies = new HashMap<String, String>();
		cookies.put("name", "value");
		clientHttpRequest.setCookies(cookies);
		InputStream inputStream = clientHttpRequest.post();
		assertNotNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post()} method.
	* It tests the case when the {@link ClientHttpRequest#post()} method is called and the {@link ClientHttpRequest#setParameters(Object[])} method is called and the {@link ClientHttpRequest#setCookies(String[])} method is called.
	* @throws IOException
	*/
	@Test
	void testPost_8() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/");
		Object[] parameters = new Object[2];
		parameters[0] = "name";
		parameters[1] = "value";
		clientHttpRequest.setParameters(parameters);
		String[] cookies = new String[2];
		cookies[0] = "name";
		cookies[1] = "value";
		clientHttpRequest.setCookies(cookies);
		InputStream inputStream = clientHttpRequest.post();
		assertNotNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post()} method.
	* It tests the case when the {@link ClientHttpRequest#post()} method is called and the {@link ClientHttpRequest#setParameters(Map)} method is called and the {@link ClientHttpRequest#setCookies(Map)} method is called and the {@link ClientHttpRequest#setCookie(String, String)} method is called.
	* @throws IOException
	*/
	@Test
	void testPost_9() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/");
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("name", "value");
		clientHttpRequest.setParameters(parameters);
		Map<String, String> cookies = new HashMap<String, String>();
		cookies.put("name", "value");
		clientHttpRequest.setCookies(cookies);
		clientHttpRequest.setCookie("name", "value");
		InputStream inputStream = clientHttpRequest.post();
		assertNotNull(inputStream);
	}
	
}

// ClientHttpRequest_1Test.java
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(Map)} method.
*/
class ClientHttpRequest_1Test {
		
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the {@link ClientHttpRequest#post(Map)} method is called and the {@link ClientHttpRequest#setParameter(String, Object)} method is called with a {@link String} parameter.
	* @throws IOException
	*/
	@Test
	void testPost_0() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/");
		clientHttpRequest.setParameter("name", "value");
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("name", "value");
		InputStream inputStream = clientHttpRequest.post(parameters);
		assertNotNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the {@link ClientHttpRequest#post(Map)} method is called and the {@link ClientHttpRequest#setParameter(String, Object)} method is called with a {@link File} parameter.
	* @throws IOException
	*/
	@Test
	void testPost_1() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/");
		clientHttpRequest.setParameter("name", new File("file"));
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("name", "value");
		InputStream inputStream = clientHttpRequest.post(parameters);
		assertNotNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the {@link ClientHttpRequest#post(Map)} method is called and the {@link ClientHttpRequest#setParameter(String, Object)} method is called with a {@link File} parameter and the {@link ClientHttpRequest#setCookie(String, String)} method is called.
	* @throws IOException
	*/
	@Test
	void testPost_2() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/");
		clientHttpRequest.setParameter("name", new File("file"));
		clientHttpRequest.setCookie("name", "value");
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("name", "value");
		InputStream inputStream = clientHttpRequest.post(parameters);
		assertNotNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the {@link ClientHttpRequest#post(Map)} method is called and the {@link ClientHttpRequest#setParameter(String, Object)} method is called with a {@link File} parameter and the {@link ClientHttpRequest#setCookies(Map)} method is called.
	* @throws IOException
	*/
	@Test
	void testPost_3() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/");
		clientHttpRequest.setParameter("name", new File("file"));
		Map<String, String> cookies = new HashMap<String, String>();
		cookies.put("name", "value");
		clientHttpRequest.setCookies(cookies);
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("name", "value");
		InputStream inputStream = clientHttpRequest.post(parameters);
		assertNotNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the {@link ClientHttpRequest#post(Map)} method is called and the {@link ClientHttpRequest#setParameter(String, Object)} method is called with a {@link File} parameter and the {@link ClientHttpRequest#setCookies(String[])} method is called.
	* @throws IOException
	*/
	@Test
	void testPost_4() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/");
		clientHttpRequest.setParameter("name", new File("file"));
		String[] cookies = new String[2];
		cookies[0] = "name";
		cookies[1] = "value";
		clientHttpRequest.setCookies(cookies);
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("name", "value");
		InputStream inputStream = clientHttpRequest.post(parameters);
		assertNotNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the {@link ClientHttpRequest#post(Map)} method is called and the {@link ClientHttpRequest#setParameters(Map)} method is called.
	* @throws IOException
	*/
	@Test
	void testPost_5() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/");
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("name", "value");
		clientHttpRequest.setParameters(parameters);
		Map<String, Object> parameters2 = new HashMap<String, Object>();
		parameters2.put("name", "value");
		InputStream inputStream = clientHttpRequest.post(parameters2);
		assertNotNull(inputStream);
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(Map)} method.
	* It tests the case when the {@link ClientHttpRequest#post(Map)} method is called and the {@link ClientHttpRequest#setParameters(Object[])} method is called.
	* @throws IOException
	*/
	@Test
	void testPost_6() throws IOException {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/");
		Object[] parameters = new Object[2];
		parameters[0] = "name";
		parameters[1] = "value";
		clientHttpRequest.setParameters(parameters);
		