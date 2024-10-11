// ClientHttpRequest_5Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object)} method.
*/
class ClientHttpRequest_5Test {
		private final Random random = new Random();
		
	}

/**
* This test case serves a test of ClientHttpRequest.
*
* TODO test this class as well as others...
*
* @author Vlad Patryshev
* @version 1.0
*/
@Test
public class ClientHttpRequest_5Test {
	
	/**
	 * Set cookie of first url in the GET request.
	 * @throws IOException
	 */
	@Test
	public void testSetFirstUrlCookie() throws IOException {
	    Iterator iterator = new ClientHttpRequest.ClientHttpRequest_5Test().set(null).getPost(null).iterator();
	    assertTrue(iterator.hasNext());
	    assertEquals(iterator.next(), new ClientHttpRequest_5Test().set(null).getPost(null).next());
	    assertTrue(iterator.hasNext());
	    assertNull(iterator.next());
	}
	
	/**
	 * Set cookies of all url in the request.
	 * @throws IOException
	 */
	@Test
    public void testSetAllCookies() throws IOException {
		ClientHttpRequest.ClientHttpRequest_5Test test = new ClientHttpRequest.ClientHttpRequest_5Test();
		test.set("name", null);
		test.set("name", "value");
		test.set("name", "value");
	    Iterator iterator = new ClientHttpRequest.ClientHttpRequest_5Test().set("name", null).iterator();
	    while(iterator.hasNext()) {
	    	assertEquals(((ClientHttpRequest) iterator.next()).get("name"), null);
	    }
	}
	
	/**
	 * Get cookies of all url in the request.
	 * @throws IOException
	 */
	@Test
    public void testGetAllCookies() throws IOException {
		ClientHttpRequest.ClientHttpRequest_5Test test = new ClientHttpRequest.ClientHttpRequest_5Test();
		test.set("name", null);
		test.set("name", "value");
		test.set("name", "value");
	    Iterator iterator = new ClientHttpRequest.ClientHttpRequest_5Test().get("name", null).iterator();
	    while(iterator.hasNext()) {
	    	assertEquals(((ClientHttpRequest) iterator.next()).get("name"), "value");
	    }
	}

	/**
	 * Get cookies of url.
	 * @throws IOException
	 */
	@Test
    public void testGetCookiesUrl() throws IOException {
		ClientHttpRequest.ClientHttpRequest_5Test test = new ClientHttpRequest.ClientHttpRequest_5Test();
		test.set("name", null);
		test.set("name", "value");
		test.set("name", "value");
	    Iterator iterator = new ClientHttpRequest.ClientHttpRequest_5Test().set("name", null).iterator();
	    while(iterator.hasNext()) {
	    	assertEquals(((ClientHttpRequest) iterator.next()).get("name"), null);
	    }
	}
	
	/**
	 * Get cookies of file.
	 * @throws IOException
	 */
	@Test
    public void testGetCookiesFile() throws IOException {
		String content = "{\"name\":\"value\",\"name\":\"value\"}"+System.getProperty("line.separator");
		FileFileInputStream test = null;
		ClientHttpRequest.ClientHttpRequest_5Test test1 = new ClientHttpRequest.ClientHttpRequest_5Test();
		test1.set("name", content);
		test1.set("name", content);
		test1.set("name", content);
	    test1.set("name", null);
	    Iterator iterator = new ClientHttpRequest.ClientHttpRequest_5Test().set("name", null).iterator();
	    while(iterator.hasNext()) {
	    	test1 = (ClientHttpRequest.ClientHttpRequest_5Test) iterator.next();
	    	assertEquals(((ClientHttpRequest) test1.get(null)), null);
	    }
	}
	
	/**
	 * Set cookies of one url in request by a list.
	 * @throws IOException
	 */
	@Test
    public void testSetUrlCookieList() throws IOException {
	    ClientHttpRequest.ClientHttpRequest_5Test test = new ClientHttpRequest.ClientHttpRequest_5Test();
	    test.set("name", "value");
	    test.set("name", "value2");
	    test.set("name", "value3");
	    test.set("name", "value");
	 
	    Iterator iterator = new ClientHttpRequest.ClientHttpRequest_5Test().set("name", "value").iterator();
	    while(iterator.hasNext()) {
	    	assertEquals(((ClientHttpRequest) iterator.next()).get("name"), "value");
	    }
	 
	}
	
	 /**
	 * Set cookies of one url in single request.
	 * @throws IOException
	 */
	@Test
    public void testSetUrlCookieUrl() throws IOException {
	    ClientHttpRequest.ClientHttpRequest_5Test test = new ClientHttpRequest.ClientHttpRequest_5Test();
	    test.set("name", "value");
	    test.set("name", "value2");
	    test.set("name", "value3");
	 
	    Iterator iterator = new ClientHttpRequest.ClientHttpRequest_5Test().set("name", "value").iterator();
	    while(iterator.hasNext()) {
	    	assertEquals(((ClientHttpRequest) iterator.next()).get("name"), "value");
	    }
	 
	}
	
	 /**
	 * Delete cookies from request of url.
	 * @throws IOException
	 */
	@Test
    public void testDeleteAllCookiesUrl() throws IOException {
	    ClientHttpRequest.ClientHttpRequest_5Test test = new ClientHttpRequest.ClientHttpRequest_5Test();
	    test.set("name", "value");
	    test.set("name", "value2");
	    test.set("name", "value3");
	 
	    Iterator iterator = new ClientHttpRequest.ClientHttpRequest_5Test().set("name", "value").iterator();
}
}