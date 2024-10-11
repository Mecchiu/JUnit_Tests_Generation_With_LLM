// JVCRequestContext_1Test.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCRequestContext}.
* It contains one unit test case for the {@link JVCRequestContext#getParamMap(String)} method.
*/
class JVCRequestContext_1Test {
		
	/**
	* Create a JVCRequestContextTest, which will
	*  create a JVCFileUpload, serve requests, and 
	*  verify the parameters of the request.
	*/
	static final class JDCustomizedRequestContextTest extends TestCase {
		
		/**
		* {@link JVCRequestContext} constructor for the following cases: 
		*/
		public JDCustomizedRequestContextTest() {
		}
		
		/**
		 * Create an instance of a JVCRequestContext, with the following
		*  structure:
		*  - JVCRequestContext(org.apache.commons.fileupload.servlet.ServletRequestContext)
		*  - String key 
		*  - String value
		*  - Map < key;value>
		*/
		public JDCustomizedRequestContextTest(String name) {
			super(name);
		}
		
		public TestData getTestData() {
			return new TestData("TestJVCRequestContext"+ getName());
		}
		
		/**
		 * Test if the parameters of the request conform to the one
		*  the {@link JVCRequestContext} accepts by the method.
		* @see TestData
		*/
		public void testParamMap() throws Exception {
			String key = RandomStringUtils.randomAlphanumeric(5);
			String val = RandomStringUtils.randomAlphanumeric(5);
			Map<String, String> map = new HashMap<String, String>();
			map.put(key, val);
			JVCRequestContext rct = new JVCRequestContext(map);
			assertNotNull(rct.getParamMap(key));
			assertEquals(rct.getParamMap(key).get(key), val);
		}
		
		/**
		* Test if the parameter of the request is sent to the servlet. 
		* 
		* @throws Exception 
		*/
		public void testParam() throws Exception {
			String key = RandomStringUtils.randomAlphanumeric(5);
			String value = RandomStringUtils.randomAlphanumeric(5);
			RequestContext rc = new RequestContext("http://abc.com",
						      "jvc.test.junit",
						      "context-path",
						      key,
						      value);				
			Map<String, String> map = rc.getParams();
			assertEquals(map.get(key), value);
		}
		
		/**
		* Test if the parameter of the request can be empty
		* when the servlet is configured with empty request body.
		*/
		public void testEmptyParam() throws Exception {
			RequestContext rc = new RequestContext("http://abc.com");
			HashMap<String, String> map = rc.getHttpRequest().getParseRequest().getAllParamsMap();
			assertNotNull(map);
			assertEquals(map.get(key), value);
		}

		/**
		* Test if the request is sent and processed without any problems.
		*/
		public void testNoParseRequestException() throws Exception {
			Throwable t = null;
			try {
				new JVCRequestContext(null);
			} catch(Throwable t1) {
				t = t1;
			}
			assertNotNull(t);
			assertTrue(t instanceof HttpParseException);
		}
		
		/**
		* test the redirect of the request, if the user is redirected to
		* a different domain
		*/
		public void testRedirect() throws Throwable {

			RequestContext rc = new RequestContext("newdomain", null);

			String key = RandomStringUtils.randomAlphanumeric(5);
			String value = RandomStringUtils.randomAlphanumeric(5);
			// add some spaces to ensure it won't show up in the link.
			rc.setParamMap(key, value + " " + value);
			Map<String, String> map = rc.getParamMap(key);
			assertEquals(map.get(key), value);
			// and the link
			map = rc.getParamMap(key+" "+ value);
			assertEquals(map.get(key), value);
		}

		public static void testUrlPath() throws Throwable {
	
			Map<String, String> map = new HashMap<String, String>();
			map.put("path", "/foo/barr.png");
			HttpUploadConnection upload = HttpUtils.getConnection(map);
			assertTrue(upload instanceof ServletFileUpload);

			ServletFileUpload spuf = (ServletFileUpload) upload;
			InputStream is = spuf.getInputStream();
			assertNotNull(is);
			BufferedInputStream isb = new BufferedInputStream(is);
			assertNotNull(isb);
			HttpURLConnection conn = (HttpURLConnection) isb.getUnderlyingConnection();
			assertEquals(conn.getURL().toString(), map.get("path"));
		}

	}

	/**
	* Test class for {@link RequestContext}, which can be used to execute
	* the request to a remote server.
	*/
	class TestData extends RequestData {
		
		public TestData(String uri) {
			super(uri);
		}
	}

	/**
	* {@link RequestContext} class with common methods that are necessary 
	*/
	class RequestContext extends RequestContext {

}
}