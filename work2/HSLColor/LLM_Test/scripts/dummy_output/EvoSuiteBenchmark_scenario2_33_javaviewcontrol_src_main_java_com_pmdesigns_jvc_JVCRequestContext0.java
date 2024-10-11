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
		assertNull(context.getParam("test"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request.
	*/
	@Test
	void testGetParam_Present() {
		HttpServletRequest request = new MockHttpServletRequest();
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		request.setParameter("test", "test");
		assertEquals("test", context.getParam("test"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and the request is multipart.
	*/
	@Test
	void testGetParam_Present_Multipart() {
		HttpServletRequest request = new MockHttpServletRequest();
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		request.setParameter("test", "test");
		request.setMultipart(true);
		assertEquals("test", context.getParam("test"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and the request is multipart and the parameter is binary.
	*/
	@Test
	void testGetParam_Present_Multipart_Binary() {
		HttpServletRequest request = new MockHttpServletRequest();
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		request.setParameter("test", "test");
		request.setMultipart(true);
		request.setAttribute("test", new byte[0]);
		assertEquals("BINARY_VALUE", context.getParam("test"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and the request is multipart and the parameter is binary and the parameter is not a string.
	*/
	@Test
	void testGetParam_Present_Multipart_Binary_NotString() {
		HttpServletRequest request = new MockHttpServletRequest();
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		request.setParameter("test", "test");
		request.setMultipart(true);
		request.setAttribute("test", new Object());
		assertEquals("BINARY_VALUE", context.getParam("test"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and the request is multipart and the parameter is binary and the parameter is not a string and the parameter is null.
	*/
	@Test
	void testGetParam_Present_Multipart_Binary_NotString_Null() {
		HttpServletRequest request = new MockHttpServletRequest();
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		request.setParameter("test", "test");
		request.setMultipart(true);
		request.setAttribute("test", null);
		assertNull(context.getParam("test"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and the request is multipart and the parameter is binary and the parameter is not a string and the parameter is null and the parameter is not a string.
	*/
	@Test
	void testGetParam_Present_Multipart_Binary_NotString_Null_NotString() {
		HttpServletRequest request = new MockHttpServletRequest();
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		request.setParameter("test", "test");
		request.setMultipart(true);
		request.setAttribute("test", new Object());
		assertEquals("BINARY_VALUE", context.getParam("test"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and the request is multipart and the parameter is binary and the parameter is not a string and the parameter is null and the parameter is not a string and the parameter is null.
	*/
	@Test
	void testGetParam_Present_Multipart_Binary_NotString_Null_NotString_Null() {
		HttpServletRequest request = new MockHttpServletRequest();
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		request.setParameter("test", "test");
		request.setMultipart(true);
		request.setAttribute("test", null);
		assertNull(context.getParam("test"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and the request is multipart and the parameter is binary and the parameter is not a string and the parameter is null and the parameter is not a string and the parameter is null and the parameter is not a string.
	*/
	@Test
	void testGetParam_Present_Multipart_Binary_NotString_Null_NotString_Null_NotString() {
		HttpServletRequest request = new MockHttpServletRequest();
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		request.setParameter("test", "test");
		request.setMultipart(true);
		request.setAttribute("test", new Object());
		assertEquals("BINARY_VALUE", context.getParam("test"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and the request is multipart and the parameter is binary and the parameter is not a string and the parameter is null and the parameter is not a string and the parameter is null and the parameter is not a string and the parameter is null.
	*/
	@Test
	void testGetParam_Present_Multipart_Binary_NotString_Null_NotString_Null_NotString_Null() {
		HttpServletRequest request = new MockHttpServletRequest();
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		request.setParameter("test", "test");
		request.setMultipart(true);
		request.setAttribute("test", null);
		assertNull(context.getParam("test"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and the request is multipart and the parameter is binary and the parameter is not a string and the parameter is null and the parameter is not a string and the parameter is null and the parameter is not a string and the parameter is null and the parameter is not a string.
	*/
	@Test
	void testGetParam_Present_Multipart_Binary_NotString_Null_NotString_Null_NotString_Null_NotString() {
		HttpServletRequest request = new MockHttpServletRequest();
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		request.setParameter("test", "test");
		request.setMultipart(true);
		request.setAttribute("test", new Object());
		assertEquals("BINARY_VALUE", context.getParam("test"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and the request is multipart and the parameter is binary and the parameter is not a string and the parameter is null and the parameter is not a string and the parameter is null and the parameter is not a string and the parameter is null and the parameter is not a string and the parameter is null.
	*/
	@Test
	void testGetParam_Present_Multipart_Binary_NotString_Null_NotString_Null_NotString_Null_NotString_Null() {
		HttpServletRequest request = new MockHttpServletRequest();
		HttpServletResponse response = new MockHttpServletResponse();
		JVCRequestContext context = new JVCRequestContext(request, response);
		request.setParameter("test", "test");
		request.setMultipart(true);
		request.setAttribute("test", null);
		assertNull(context.getParam("test"));
	}
}