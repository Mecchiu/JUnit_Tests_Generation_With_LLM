// JVCRequestContextTest.java
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
* It contains ten unit test cases for the {@link JVCRequestContext#getSessionAttr(String)} method.
*/
class JVCRequestContextTest {
		
	/**
	* Test case for {@link JVCRequestContext#getSessionAttr(String)} method.
	* This test case tests the method with a null session.
	*/
	@Test
	void testGetSessionAttrWithNullSession() {
		HttpServletRequest request = new HttpServletRequest() {
			public HttpSession getSession() {
				return null;
			}
		};
		JVCRequestContext context = new JVCRequestContext();
		context.request = request;
		assertNull(context.getSessionAttr("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getSessionAttr(String)} method.
	* This test case tests the method with a valid session.
	*/
	@Test
	void testGetSessionAttrWithValidSession() {
		HttpServletRequest request = new HttpServletRequest() {
			public HttpSession getSession() {
				return new HttpSession() {
					public Object getAttribute(String name) {
						return "test";
					}
				};
			}
		};
		JVCRequestContext context = new JVCRequestContext();
		context.request = request;
		assertEquals("test", context.getSessionAttr("test"));
	}
}