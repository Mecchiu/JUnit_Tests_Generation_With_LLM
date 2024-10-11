// JVCRequestContext_0Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getParam(String)} method.
*/
class JVCRequestContext_0Test {
		private final String param = "test";
		private final String value = "This is a test value";
                private final String paramMapKey = this.getParam(param);
		
		/**
		 * The parameter name used in the request
		 * @return the parameter name used in the request
		 */
		public static String getParam(String name) {
		  return ("requestParamMap[".concat((new Integer(this.getParam(name))).toString()).concat(","));
			}

		/**
		* Test method with a redirect
		* 
		* @throws Exception if there is a problem performing the test
		*/
		@Test
		public void testRedirect() throws Exception {
			HttpServletRequest request = new MockHttpServletRequest("/", (String)null);
			HttpServletResponse response = new MockHttpServletResponse();
			request.setAttribute(JVCRequestContext.ATTRIBUTE_PARAM, this.getParam(param));
			ServletFileUpload upload = new ServletFileUpload();
			boolean uploaded = upload.parseRequest(request);
			assertTrue(uploaded == true);
			upload.setParams(request);
			String paramVal = (String)upload.getParameter(param);
			assertNotNull(paramVal);
			assertEquals(paramVal, value);
			response.setContentType("text/plain");
			response.setHeader("Content-Disposition",
					"attachment;filename=\"" + param + "\"");
			FileOutputStream os = new FileOutputStream("data.txt");
			os.write(new byte[8192]);
			os.write(new byte[8192]);
			os.write(new byte[8192]);
			File file = new File("./data.txt");
			String content = Streams.readAllBytes(new FileInputStream(file));
			assertEquals(value, content);
			String url = new URI("data.txt").toString();
			assertEquals(url, request.getRequestURI());
			try {
				FileUtils.deleteOnExitFiles(new File[]{file} );
			} catch (IOException e ) {
				fail(e.getMessage());
			}
		}

		/**
		 * Test method with a HttpServletRequest
		 * @throws Exception if there is a problem performing the test
		 */
		@Test
		public void testHttpServletRequest() throws Exception {
			HttpServletRequest request = new MockHttpServletRequest("/", (String)null);
			HttpServletResponse response = new MockHttpServletResponse();
			request.setAttribute(JVCRequestContext.ATTRIBUTE_PARAM, this.getParam(param));
			ServletFileUpload upload = new ServletFileUpload();
			boolean uploaded = upload.parseRequest(request);
			assertTrue(uploaded == true);
			upload.setParams(request);
			String paramVal = (String)upload.getParameter(param);
			assertNotNull(paramVal);
			assertEquals(paramVal, value);
			response.setContentType("text/plain");
			response.setHeader("Content-Disposition",
					"attachment;filename=\"" + param + "\"");
			FileOutputStream os = new FileOutputStream("data.txt");
			os.write(new byte[8192]);
			os.write(new byte[8192]);
			os.write(new byte[8192]);
			File file = new File("./data.txt");
			String content = Streams.readAllBytes(new FileInputStream(file));
			assertEquals(value, content);
			String url = new URI("data.txt").toString();
			assertEquals(url, request.getRequestURI());
			try {
				FileUtils.deleteOnExitFiles(new File[]{file} );
			} catch (IOException e ) {
				fail(e.getMessage());
			}
		}

		/**
		 * Test method with an HttpServletResponse
		 * @throws Exception if there is a problem performing the test
		 */
		@Test
		public void testHttpServletResponse() throws Exception {
			HttpServletRequest request = new MockHttpServletRequest("/", (String)null);
			HttpServletResponse response = new MockHttpServletResponse();
			request.setAttribute(JVCRequestContext.ATTRIBUTE_PARAM, this.getParam(param));
			ServletFileUpload upload = new ServletFileUpload();
			boolean uploaded = upload.parseRequest(request);
			assertTrue(uploaded == true);
			upload.setParams(request);
			String paramVal = (String)upload.getParameter(param);
			assertNotNull(paramVal);
			assertEquals(paramVal, value);
			response.setContentType("text/plain");
			response.setHeader("Content-Disposition",
					"attachment;filename=\"" + param + "\"");
			FileOutputStream os = new FileOutputStream("data.txt");
			os.write(new byte[8192]);
			os.write(new byte[8192]);
			os.write(new byte[8192]);
			File file = new File("./data.txt");
			String content = Streams.readAllBytes(new FileInputStream(file));
			assertEquals(value, content);
			String url = new URI("data.txt").toString();
			assertEquals(url, request.getRequestURI());
			try {
				FileUtils.deleteOnExitFiles(new File[]{file} );
			} catch (IOException e ) {
				fail(e.getMessage());
			}
		}
		
}

// HttpServletRequest_0Test.java