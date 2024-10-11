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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_8Test {
		@Test
		public void test() throws IOException {
			// test for some of the standard method:
			ClientHttpRequest req = new ClientHttpRequest(new URL("http://localhost:8001/test.html"),"POST",null,null,null,null,null);
			assertTrue(req.parameters.isEmpty());

			// test for GET parameter methods
			req = new ClientHttpRequest(new URL("http://localhost:8001/test.html?name=value"),HttpMethod.GET,"name=value");
			assertEquals(2,req.parameters.size());
			assertEquals("value",req.parameters.get("name"));
			assertTrue(req.parameters.containsKey("name"));
			assertEquals("value",req.parameters.get("name"));

			// test for POST with no body
			req = new ClientHttpRequest(new URL("http://localhost:8001/test.html"),HttpMethod.POST,"name=value");
			assertEquals("POST",req.method);
			assertEquals("value",req.postParameter("name"));
			assertEquals("value",req.postParameter("name"));

			// test for POST with header methods
			req = new ClientHttpRequest(new URL("http://localhost:8001/test.html?name=value"),HttpMethod.POST,"name=value");
			assertEquals("POST",req.method);
			assertEquals("value",req.postParameter("name",new HashMap<String,String>(){{put("name",new Random().nextLine());}}));
			assertEquals("value",req.postParameter("name",new HashMap<String,String>(){{put("name",new Random().nextLine());}}));

			// test for HEAD method and POST body with POST body
			req = new ClientHttpRequest(new URL("http://localhost:8001/test.html"),HttpMethod.HEAD,"name=value");
			assertEquals("HEAD",req.method);
			HashMap<String,Object> headers = new HashMap<>();
			assertEquals(new Random().nextInt(),headers.get("Cookie1"));
			assertEquals(9,headers.size());
			assertEquals(new Random().nextInt(),headers.get("Cookie2"));
			assertEquals(9,headers.size());
			assertEquals(new Random().nextInt(),headers.get("Cookie3"));
			assertEquals(9,headers.size());
			assertEquals(9,headers.size());
			Map<String,String> cookies = new HashMap<>();
			cookies.put("Cookie1", new Random().nextInt());
			cookies.put("Cookie2", new Random().nextInt());
			cookies.put("Cookie3", new Random().nextInt());
			req = new ClientHttpRequest(new URL("http://localhost:8001/test.html"),HttpMethod.POST,headers,cookies);
			assertTrue(req.contentType.contains("application/x-www-form-urlencoded"));
			assertEquals("POST",req.method);
		}
}