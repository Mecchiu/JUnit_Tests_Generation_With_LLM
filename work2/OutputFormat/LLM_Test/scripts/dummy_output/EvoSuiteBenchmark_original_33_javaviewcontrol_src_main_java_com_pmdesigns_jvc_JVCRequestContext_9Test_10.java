// JVCRequestContext_9Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getFlash(String)} method.
*/
class JVCRequestContext_9Test {
		private String key = "value";
		
	/**
	 * Sets up and runs the unit test.
	 * It then tests a request for the FlashMap value
	 * with a redirect response.
	 * @throws Exception If an error occurs during the test.
	 */
	@Test
	public void test() throws Exception {
		HttpServletResponse response = MockJVCRequest.MockHttpServletResponse();
		
		JVCRequestContext.setFlash(response, null);
		String result = JVCRequestContext.getFlash(key);
		
		checkResult(response, result);
	}
	
	/**
	 * Checks that the flash map contains a value for the specified
	 * key.
	 * @param response 
	 * @param value 
	 * @throws Exception 
	 */
	private void checkResult(HttpServletResponse response, String value) throws Exception {
		String result = JVCRequestContext.getFlash(key);
		
		assertEquals("value", value, result);
		
		if ("".equals(value)) {
			assertTrue(isRedirect(response));
		} else {
			assertEquals("value", value, JVCRequestContext.getFlash(key, "").toString());
		}
	}
	
	/**
	 * Tries to redirection.
	 * @return boolean whether any error occurred
	 * @param response Http servlet response
	 */
	private boolean isRedirect(HttpServletResponse response) {
		HttpURLConnection httpConn = response.getOutputConnection();
		
		try {
			httpConn.getOutputStream().write("Redirecting".getBytes());
			httpConn.getOutputStream().write("to".getBytes());
			httpConn.getOutputStream().write("test.html".getBytes());
		} catch (IOException e) { // ignore
		}
		
		return response.getStatus() == HttpServletResponse.SC_MOVED_TEMP || 
				response.getStatus() == HttpServletResponse.SC_TEMP_REDIRECT;
	}
}