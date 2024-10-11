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
* It contains ten unit test cases for the {@link JVCRequestContext#getParam(String)} method.
*/
class JVCRequestContextTest {

	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is not present in the request.
	*/
	@Test
	void testGetParam_NotPresent() {
		HttpServletRequest request = new MockHttpServletRequest();
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		assertNull(context.getParam("param"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request.
	*/
	@Test
	void testGetParam_Present() {
		HttpServletRequest request = new MockHttpServletRequest();
		request.setParameter("param", "value");
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		assertEquals("value", context.getParam("param"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request as a binary value.
	*/
	@Test
	void testGetParam_Binary() {
		HttpServletRequest request = new MockHttpServletRequest();
		request.setAttribute("param", "value");
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		assertEquals("BINARY_VALUE", context.getParam("param"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request as a binary value.
	*/
	@Test
	void testGetParam_Binary_NotPresent() {
		HttpServletRequest request = new MockHttpServletRequest();
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		assertNull(context.getParam("param"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request as a binary value.
	*/
	@Test
	void testGetParam_Binary_Present() {
		HttpServletRequest request = new MockHttpServletRequest();
		request.setAttribute("param", "value");
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		assertEquals("BINARY_VALUE", context.getParam("param"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request as a binary value.
	*/
	@Test
	void testGetParam_Binary_Present_NotString() {
		HttpServletRequest request = new MockHttpServletRequest();
		request.setAttribute("param", new Object());
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		assertEquals("BINARY_VALUE", context.getParam("param"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request as a binary value.
	*/
	@Test
	void testGetParam_Binary_Present_String() {
		HttpServletRequest request = new MockHttpServletRequest();
		request.setAttribute("param", "value");
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		assertEquals("BINARY_VALUE", context.getParam("param"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request as a binary value.
	*/
	@Test
	void testGetParam_Binary_Present_String_NotBinary() {
		HttpServletRequest request = new MockHttpServletRequest();
		request.setAttribute("param", "value");
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		assertEquals("BINARY_VALUE", context.getParam("param"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request as a binary value.
	*/
	@Test
	void testGetParam_Binary_Present_String_Binary() {
		HttpServletRequest request = new MockHttpServletRequest();
		request.setAttribute("param", "value");
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		assertEquals("BINARY_VALUE", context.getParam("param"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request as a binary value.
	*/
	@Test
	void testGetParam_Binary_Present_String_Binary_NotPresent() {
		HttpServletRequest request = new MockHttpServletRequest();
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		assertNull(context.getParam("param"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request as a binary value.
	*/
	@Test
	void testGetParam_Binary_Present_String_Binary_Present() {
		HttpServletRequest request = new MockHttpServletRequest();
		request.setAttribute("param", "value");
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		assertEquals("BINARY_VALUE", context.getParam("param"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request as a binary value.
	*/
	@Test
	void testGetParam_Binary_Present_String_Binary_Present_NotString() {
		HttpServletRequest request = new MockHttpServletRequest();
		request.setAttribute("param", new Object());
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		assertEquals("BINARY_VALUE", context.getParam("param"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request as a binary value.
	*/
	@Test
	void testGetParam_Binary_Present_String_Binary_Present_String() {
		HttpServletRequest request = new MockHttpServletRequest();
		request.setAttribute("param", "value");
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		assertEquals("BINARY_VALUE", context.getParam("param"));
	}
	
	/**
	* Test case for the {@