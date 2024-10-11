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
		/**
		 * This constructor sets up the test case for the {@link ClientHttpRequest#post(String, Object)} method.
		 */
		public ClientHttpRequest_5Test() {
		}

		/**
		 * Test method for {@link com.browsersoft.servlet.util.ClientHttpRequest#post(String, Object)} without params.
		 */
		@Test
		public void testPostWithoutParams() {
				System.out.println("post");
				ClientHttpRequest request = new ClientHttpRequest();
				request.post("name", null);
				long start = System.currentTimeMillis();
				request.post(null, "value");
				long end = System.currentTimeMillis();
				long time = (end - start);
				System.out.println(time + " ms");
				assertEquals("Should get post return", 200, request.getResponseCode());
		}

		/**
		 * Test method for {@link com.browsersoft.servlet.util.ClientHttpRequest#post(String, Object)} to be valid with param.
		 */
		@Test
		public void testPostWithParam() {
				System.out.println("post");
				ClientHttpRequest request = new ClientHttpRequest();
				request.post("name", "value");
				long start = System.currentTimeMillis();
				request.post(null, "value", "image");
				long end = System.currentTimeMillis();
				long time = (end - start);
				System.out.println(time + " ms");
				assertEquals("Should get post return", 200, request.getResponseCode());
				assertEquals("value image", request.find("name", "value", 1).getValue());
		}

		/**
		 * Test method for {@link com.browsersoft.servlet.util.ClientHttpRequest#post(File)} without param.
		 */
		@Test
		public void testPostWithoutParam() {
				System.out.println("post");
				ClientHttpRequest request = new ClientHttpRequest();
				final FileInputStream fileInputStream = new FileInputStream("src/test/resources/test.txt");
				request.post(null, fileInputStream);
				long start = System.currentTimeMillis();
				request.post(null, new File(""));
				long end = System.currentTimeMillis();
				long time = (end - start);
				System.out.println(time + " ms");
				assertEquals("Should get post return", 200, request.getResponseCode());
				request.post(null, new File("src/test/resources/test.txt"));
				System.out.println(request.getInputStream());
				assertNotNull("should get input stream object in post", request.getInputStream());
				Map postDataMap = (Map)request.find("inputMap");
				assertEquals("Post input map should have no parameters", new HashMap<String, String>(), postDataMap);
				assertEquals("Post input map should have no value", 1234, postDataMap.get("name"));
				assertEquals("Post input map should have no value", 12345, postDataMap.get("value"));
				assertEquals("Post input map should have no values", 12234, postDataMap.get("image"));
				assertEquals("Post input map should have no values", 2345, getLast(postDataMap));
		}


		/**
		 * Test method for {@link com.browsersoft.servlet.util.ClientHttpRequest#post(File)} to be valid with param.
		 */
		@Test
		public void testPostWithParam() {
				System.out.println("post");
				ClientHttpRequest request = new ClientHttpRequest();
				final FileInputStream fileInputStream = new FileInputStream("src/test/resources/test.txt");
				request.post(null, fileInputStream);
				long start = System.currentTimeMillis();
				request.post(null, new File(""));
				long end = System.currentTimeMillis();
				long time = (end - start);
				System.out.println(time + " ms");
				request.post(null, new File("src/test/resources/test.txt"));
				assertEquals("Should get post return", 200, request.getResponseCode());
				request.post(null, new File("src/test/resources/test.txt"));
				assertNull("should get output stream object to post", request.getOutputStream());
				request.post(null, new File("src/test/resources/test.txt"));
				assertEquals(true, request.getInputStream().available());
				File lastFile = new File("src/test/resources/test.txt");
				postDataMap = (Map)request.find("inputMap");
				Iterator iterator = postDataMap.entrySet().iterator();
				FileInputStream fileInput = new FileInputStream(lastFile);
				Map postData = (Map)iterator.next();
				String lastValue = (String)postData.get("name");
				String lastName = (String)iterator.next();
				assertEquals("Should get last return", lastName, lastValue);
				inputStream = new FileInputStream(fileInputStream);
				lastInputStream = inputStream;
				request.post(null, inputStream);
				assertEquals("Should get last return", lastName, request.find("name", "value", 1).getValue());
				assertEquals("Should get last return", lastValue, request.findNodeByName("name", "value", 1).getValue());
		}
		
		/**
		 * This method sets up the tests for several test cases.
		 */
		static void setupCases() {
				for(int i = 0; i < 2; i++) {
						new ClientHttpRequest_5Test();
				}
				try {
						new ClientHttpRequest_5Test();
				}
				catch(Exception e) {
						System.out.println("Cannot create test case");
						throw new RuntimeException("Cannot create test case", e);
				}
		}
		
		 /**
		 *
		 * @return the last value found or throw an exception
		 */
		public static String getLast(Map<String, String> map) {
			String lv = "";
			Iterator<String> it = map.keySet().iterator();
			boolean found = false;
}
}