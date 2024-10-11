// JVCRequestContext_3Test.java
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
* It contains ten unit test cases for the {@link JVCRequestContext#getAttribute(String)} method.
*/
class JVCRequestContext_3Test {

		@Test
		void testGetAttribute_1() throws Exception {
				// test case 1
				HttpServletRequest request = new MockHttpServletRequest();
				HttpServletResponse response = new MockHttpServletResponse();
				HttpServlet servlet = new MockHttpServlet();
				Map<String, String> flash = new HashMap<String, String>();
				JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, "", "");
				assertNull(context.getAttribute("foo"));
		}
		
		@Test
		void testGetAttribute_2() throws Exception {
				// test case 2
				HttpServletRequest request = new MockHttpServletRequest();
				HttpServletResponse response = new MockHttpServletResponse();
				HttpServlet servlet = new MockHttpServlet();
				Map<String, String> flash = new HashMap<String, String>();
				JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, "", "");
				request.setAttribute("foo", "bar");
				assertEquals("bar", context.getAttribute("foo"));
		}
		
		@Test
		void testGetAttribute_3() throws Exception {
				// test case 3
				HttpServletRequest request = new MockHttpServletRequest();
				HttpServletResponse response = new MockHttpServletResponse();
				HttpServlet servlet = new MockHttpServlet();
				Map<String, String> flash = new HashMap<String, String>();
				JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, "", "");
				request.setAttribute("foo", "bar");
				assertEquals("bar", context.getAttribute("foo"));
				assertNull(context.getAttribute("baz"));
		}
		
		@Test
		void testGetAttribute_4() throws Exception {
				// test case 4
				HttpServletRequest request = new MockHttpServletRequest();
				HttpServletResponse response = new MockHttpServletResponse();
				HttpServlet servlet = new MockHttpServlet();
				Map<String, String> flash = new HashMap<String, String>();
				JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, "", "");
				request.setAttribute("foo", "bar");
				assertEquals("bar", context.getAttribute("foo"));
				assertNull(context.getAttribute("baz"));
				request.setAttribute("baz", "qux");
				assertEquals("qux", context.getAttribute("baz"));
		}
		
		@Test
		void testGetAttribute_5() throws Exception {
				// test case 5
				HttpServletRequest request = new MockHttpServletRequest();
				HttpServletResponse response = new MockHttpServletResponse();
				HttpServlet servlet = new MockHttpServlet();
				Map<String, String> flash = new HashMap<String, String>();
				JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, "", "");
				request.setAttribute("foo", "bar");
				assertEquals("bar", context.getAttribute("foo"));
				assertNull(context.getAttribute("baz"));
				request.setAttribute("baz", "qux");
				assertEquals("qux", context.getAttribute("baz"));
				request.setAttribute("foo", "quux");
				assertEquals("quux", context.getAttribute("foo"));
		}
		
		@Test
		void testGetAttribute_6() throws Exception {
				// test case 6
				HttpServletRequest request = new MockHttpServletRequest();
				HttpServletResponse response = new MockHttpServletResponse();
				HttpServlet servlet = new MockHttpServlet();
				Map<String, String> flash = new HashMap<String, String>();
				JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, "", "");
				request.setAttribute("foo", "bar");
				assertEquals("bar", context.getAttribute("foo"));
				assertNull(context.getAttribute("baz"));
				request.setAttribute("baz", "qux");
				assertEquals("qux", context.getAttribute("baz"));
				request.setAttribute("foo", "quux");
				assertEquals("quux", context.getAttribute("foo"));
				request.setAttribute("baz", "quuux");
				assertEquals("quuux", context.getAttribute("baz"));
		}
		
		@Test
		void testGetAttribute_7() throws Exception {
				// test case 7
				HttpServletRequest request = new MockHttpServletRequest();
				HttpServletResponse response = new MockHttpServletResponse();
				HttpServlet servlet = new MockHttpServlet();
				Map<String, String> flash = new HashMap<String, String>();
				JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, "", "");
				request.setAttribute("foo", "bar");
				assertEquals("bar", context.getAttribute("foo"));
				assertNull(context.getAttribute("baz"));
				request.setAttribute("baz", "qux");
				assertEquals("qux", context.getAttribute("baz"));
				request.setAttribute("foo", "quux");
				assertEquals("quux", context.getAttribute("foo"));
				request.setAttribute("baz", "quuux");
				assertEquals("quuux", context.getAttribute("baz"));
				request.setAttribute("foo", "quuuux");
				assertEquals("quuuux", context.getAttribute("foo"));
		}
		
		@Test
		void testGetAttribute_8() throws Exception {
				// test case 8
				HttpServletRequest request = new MockHttpServletRequest();
				HttpServletResponse response = new MockHttpServletResponse();
				HttpServlet servlet = new MockHttpServlet();
				Map<String, String> flash = new HashMap<String, String>();
				JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, "", "");
				request.setAttribute("foo", "bar");
				assertEquals("bar", context.getAttribute("foo"));
				assertNull(context.getAttribute("baz"));
				request.setAttribute("baz", "qux");
				assertEquals("qux", context.getAttribute("baz"));
				request.setAttribute("foo", "quux");
				assertEquals("quux", context.getAttribute("foo"));
				request.setAttribute("baz", "quuux");
				assertEquals("quuux", context.getAttribute("baz"));
				request.setAttribute("foo", "quuuux");
				assertEquals("quuuux", context.getAttribute("foo"));
				request.setAttribute