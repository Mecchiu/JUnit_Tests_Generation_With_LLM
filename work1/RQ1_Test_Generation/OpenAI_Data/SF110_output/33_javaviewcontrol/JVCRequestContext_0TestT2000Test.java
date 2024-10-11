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
* It contains ten unit test cases for the {@link JVCRequestContext#getParam(String)} method.
*/
class JVCRequestContext_0Test {

	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* <p>
	* This test case is for the case where the parameter is not present.
	*/
	@Test
	void testGetParam_0() {
		// create a mock request
		HttpServletRequest request = new MockHttpServletRequest();
		// create a mock response
		HttpServletResponse response = new MockHttpServletResponse();
		// create a mock servlet
		HttpServlet servlet = new MockHttpServlet();
		// create a mock flash
		Map<String, String> flash = new HashMap<String, String>();
		// create a request context
		JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, "", "");
		// test the getParam method
		assertNull(context.getParam("foo"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* <p>
	* This test case is for the case where the parameter is present.
	*/
	@Test
	void testGetParam_1() {
		// create a mock request
		MockHttpServletRequest request = new MockHttpServletRequest();
		// add a parameter
		request.addParameter("foo", "bar");
		// create a mock response
		HttpServletResponse response = new MockHttpServletResponse();
		// create a mock servlet
		HttpServlet servlet = new MockHttpServlet();
		// create a mock flash
		Map<String, String> flash = new HashMap<String, String>();
		// create a request context
		JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, "", "");
		// test the getParam method
		assertEquals("bar", context.getParam("foo"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* <p>
	* This test case is for the case where the parameter is present and has multiple values.
	*/
	@Test
	void testGetParam_2() {
		// create a mock request
		MockHttpServletRequest request = new MockHttpServletRequest();
		// add a parameter
		request.addParameter("foo", "bar");
		request.addParameter("foo", "baz");
		// create a mock response
		HttpServletResponse response = new MockHttpServletResponse();
		// create a mock servlet
		HttpServlet servlet = new MockHttpServlet();
		// create a mock flash
		Map<String, String> flash = new HashMap<String, String>();
		// create a request context
		JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, "", "");
		// test the getParam method
		assertEquals("bar", context.getParam("foo"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* <p>
	* This test case is for the case where the parameter is present and has multiple values.
	*/
	@Test
	void testGetParam_3() {
		// create a mock request
		MockHttpServletRequest request = new MockHttpServletRequest();
		// add a parameter
		request.addParameter("foo", "bar");
		request.addParameter("foo", "baz");
		// create a mock response
		HttpServletResponse response = new MockHttpServletResponse();
		// create a mock servlet
		HttpServlet servlet = new MockHttpServlet();
		// create a mock flash
		Map<String, String> flash = new HashMap<String, String>();
		// create a request context
		JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, "", "");
		// test the getParam method
		assertEquals("bar", context.getParam("foo"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* <p>
	* This test case is for the case where the parameter is present and has multiple values.
	*/
	@Test
	void testGetParam_4() {
		// create a mock request
		MockHttpServletRequest request = new MockHttpServletRequest();
		// add a parameter
		request.addParameter("foo", "bar");
		request.addParameter("foo", "baz");
		// create a mock response
		HttpServletResponse response = new MockHttpServletResponse();
		// create a mock servlet
		HttpServlet servlet = new MockHttpServlet();
		// create a mock flash
		Map<String, String> flash = new HashMap<String, String>();
		// create a request context
		JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, "", "");
		// test the getParam method
		assertEquals("bar", context.getParam("foo"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* <p>
	* This test case is for the case where the parameter is present and has multiple values.
	*/
	@Test
	void testGetParam_5() {
		// create a mock request
		MockHttpServletRequest request = new MockHttpServletRequest();
		// add a parameter
		request.addParameter("foo", "bar");
		request.addParameter("foo", "baz");
		// create a mock response
		HttpServletResponse response = new MockHttpServletResponse();
		// create a mock servlet
		HttpServlet servlet = new MockHttpServlet();
		// create a mock flash
		Map<String, String> flash = new HashMap<String, String>();
		// create a request context
		JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, "", "");
		// test the getParam method
		assertEquals("bar", context.getParam("foo"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* <p>
	* This test case is for the case where the parameter is present and has multiple values.
	*/
	@Test
	void testGetParam_6() {
		// create a mock request
		MockHttpServletRequest request = new MockHttpServletRequest();
		// add a parameter
		request.addParameter("foo", "bar");
		request.addParameter("foo", "baz");
		// create a mock response
		HttpServletResponse response = new MockHttpServletResponse();
		// create a mock servlet
		HttpServlet servlet = new MockHttpServlet();
		// create a mock flash
		Map<String, String> flash = new HashMap<String, String>();
		// create a request context
		JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, "", "");
		// test the getParam method
		assertEquals("bar", context.getParam("foo"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* <p>
	* This test case is for the case where the parameter is present and has multiple values.
	*/
	@Test
	void testGetParam_7() {
		// create a mock request
		MockHttpServletRequest request = new MockHttpServletRequest();
		// add a parameter
		request.addParameter("foo", "bar");
		request.addParameter("foo", "baz");
		// create a mock response
		HttpServletResponse response = new MockHttpServletResponse();
		// create a mock servlet
	