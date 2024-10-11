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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
*/
class ClientHttpRequest_6Test {
static {
				System.loadLibrary("client_test");
		}
		Random random = new Random();

		/**
		 * Test of method {@link ClientHttpRequest#post(String, Object, String, Object)}.
		 *
		 * @todo fix this test that tests are executed using the same client version (as in the previous test).
		 * @throws IOException
		 */
		@Test
		public void testPost()
		throws IOException {
			doClientHttpRequest_6Test("post", "", "\r\n", "\r\n");
		}

		/**
		 * Test of method {@link ClientHttpRequest#post(String, Object, String, Object)}.
		 * 
		 * @todo fix this test that tests are executed using the same client version (as in the previous test).
		 * @throws IOException
		 */
		@Test
		public void testPostFile()
		throws IOException {
			doClientHttpRequest_6Test("post", "filename", "\r\n", "\nfilename\r\n");
		}

		/**
		 * Test of method {@link ClientHttpRequest#getConnection().connect()}.
		 *
		 * @throws IOException
		 */
		@Test
		public void testGetConnection()
		throws IOException {
			Map<String, Object> map = new HashMap<>(5);
			map.put("key", 100);
			map.put("value", 300);
			ClientHttpRequest request = new ClientHttpRequest("GET", "", "HTTP/1.1", true, 200, map);
			assertNotNull(request.getConnection());
			RequestInfo info = request.getConnection().info();
			assertTrue(request.getConnection() instanceof Connection);
			assertEquals(info.connectionType, "http");
		}
		
		/**
		 * Test of method {@link ClientHttpRequest#getConnection().connect(long, long, long)}.
		 *
		 * @throws IOException
		 */
		@Test
		public void testGetConnectionLongLongLongLong()
				throws IOException {
			// test case expects the method to return connection to its own place
			Map<String, Object> map = new HashMap<>(3 * 4);
			map.put("key1", 100);
			map.put("key2", 300);
			map.put("value1", 200);
			map.put("value2", 300);
			ClientHttpRequest request = new ClientHttpRequest("GET", "", "HTTP/1.1", true, 200, map);
			
			// now test that the connection is restored to its previous place
			assertSame(request.getConnection(), request.getConnectionLong());
			
			RequestInfo info = request.getConnection().info();
			assertEquals(info.connectionType, "http");
			
		}
		
		// the test for the case where the server accepts a "keep-alive"
		// connection option and the client sends a GET with a
		// Connection: keep-alive, then it tries to send a POST with body
		// (with "chunked", then it is treated as a HEAD request and
		// doesn't get HTTP 200 200 status code)
		@Test
		public void testKeepAliveReqs()
		throws IOException {
			Map<String, Object> map = new HashMap<>(5);
			map.put("key", 100);
			map.put("value", 300);
			ClientHttpRequest request = new ClientHttpRequest("POST", "", "HTTP/1.1", true, 200, map) {
				@Override
				protected Map<String, Object> getParameter() {
					parameter = "chunked";
					return getParameter();
				}
			};
			
			// test request
			// first, a "keep-alive" will be accepted on sending to the server
			assertTrue(request instanceof ClientHttpRequest);
			RequestInfo info = request.getConnection().info();
			assertNotNull(info);
			assertEquals(info.connectionType, "http");
			
			// second, a "keep-alive" will be used on the server, and will
			// not be accepted by the client
			assertTrue(request == ClientHttpRequest.this);
			request = ClientHttpRequest.this;
						
			// third, the request will not be sent as part of header
			assertFalse(request.getConnection().connected);
			
			assertEquals(request.getParameterAsString("content-length", ""), "");

			request = new ClientHttpRequest("POST", "", "HTTP/1.1", true, 200, map) {
				@Override
				protected Map<String, Object> getParameter() {
					parameter = "chunked";
					return getParameter();
				}
			};
			
			// first, a "keep-alive" will be accepted on sending to the server
			assertTrue(request instanceof ClientHttpRequest);
			info = request.getConnection().info();
			assertNotNull(info);
			assertEquals(info.connectionType, "http");
			
			// second, a "keep-alive" will be used on the server, and will
			// not be accepted by the client
			assertTrue(request == ClientHttpRequest.this);
			request = ClientHttpRequest.this;
						
			// third, the request will be sent as part of header
			assertTrue(request.getConnection().connected);
			
			// test sending POST from the server
			assertTrue(request.getConnection().info().getResponse());
			assertEquals(request.getConnection().info().getResponse().statusCode(), 200);
			
		}
}
