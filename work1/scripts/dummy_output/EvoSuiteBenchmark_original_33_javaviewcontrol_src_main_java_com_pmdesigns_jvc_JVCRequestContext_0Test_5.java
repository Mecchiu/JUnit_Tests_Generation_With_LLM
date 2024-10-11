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
		/**
		 * Unit test for getParam.
		 *
		 * @see com.pmdesigns.jvc.JVCRequestContext.JVCRequestContext.getParam
		 */
		@Test
		public void getParam_normal_value() {
			final JVCRequestContext context = new JVCRequestContext();
			context.setContext(new Servlet() {
				@Override
				protected HttpServletRequest resolveRE(String url, String method,
												      Map<String, List<String>> headers, FileUpload fileupload) {
					String value = null;
					if (fileupload!= null) {
						File tempFile = fileupload.getFile("file1");
						if (tempFile!= null) {
							try(InputStream in = new FileInputStream(tempFile)) {
								value = Streams.readAll(in);
							} catch (IOException ex) {
								ex.printStackTrace();
							}
						}
					}
					return new HttpServletRequest(method, null, headers, null, value);
				}
			});
			context.getParam("name");
			assertEquals("name", context.getParam("name"));
		}

		/**
		 * Unit test for getParam.
		 * @see com.pmdesigns.jvc.JVCRequestContext.JVCRequestContext#getParam
		 */
		@Test
		public void getParam_binary_key() {
			final JVCRequestContext context = new JVCRequestContext();
			context.setContext(new Servlet() {
				@Override
				protected HttpServletRequest resolveRE(String url, String method,
												      Map<String, List<String>> headers, FileUpload fileupload) {
					byte[] data = null;
					if (fileupload!= null) {
						File tempFile = fileupload.getFile("file1");
						try(InputStream in = new FileInputStream(tempFile)) {
							data = Streams.readAll(in);
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
					byte[] key = null;
					if (data!= null) {
						key = data.clone();
					}
					return new HttpServletRequest(method, null, headers, null, key);
				}
			});
			context.getParam("key");
			assertTrue("jvc upload binary key is null", context.getParam("key") instanceof byte[]);
		}

		/**
		 * Unit test for getParam.
		 * @see com.pmdesigns.jvc.JVCRequestContext.JVCRequestContext#getParam
		 */
		@Test
		public void getParam_no_value() {
			final JVCRequestContext context = new JVCRequestContext();
			context.setContext(new Servlet() {
				@Override
				protected HttpServletRequest resolveRE(String url, String method,
													   Map<String, List<String>> headers, FileUpload fileupload) {
					context.addParam("key", null);
					return new HttpServletRequest(method, null, headers, null, null);
				}
			});
			assertNull("getParam should not return 'value' key", context.getParam("key"));
			context.getParam("key");
			assertNull("getParam should not return 'value' key", context.getParam("key"));
		}

		/**
		 * Unit test for getParam.  There is no test for no value.
		 */
		@Test
		public void getParam_string_value() {
			final JVCRequestContext context = new JVCRequestContext();
			context.setContext(new Servlet() {
				@Override
				protected HttpServletRequest resolveRE(String url, String method,
													   Map<String, List<String>> headers, FileUpload fileupload) {
					String value = null;
					if (fileupload!= null) {
						File tempFile = fileupload.getFile("file1");
						if (tempFile!= null) {
							try(InputStream in = new FileInputStream(tempFile)) {
								value = Streams.readAll(in);
							} catch (IOException ex) {
								ex.printStackTrace();
							}
						}
					}
					return new HttpServletRequest(method, null, headers, null, value);
				}
			});
			context.getParam("name");
			assertEquals("name", context.getParam("name"));
			context.addParam("name", null);
			assertNotNull("getParam for null parameter name", context.getParam("name"));

			context.addParam("key", "value");
			assertEquals("value", context.getParam("key"));

			context.addParam("key", "value, key, ");
			assertEquals("value", context.getParam("key"));
		}

}