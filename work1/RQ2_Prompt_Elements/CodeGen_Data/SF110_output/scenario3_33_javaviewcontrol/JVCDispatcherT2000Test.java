// JVCDispatcherTest.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import com.pmdesigns.jvc.tools.Base64Coder;
import com.pmdesigns.jvc.tools.JVCGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCDispatcher}.
* It contains one unit test case for the {@link JVCDispatcher#getRC()} method.
*/
class JVCDispatcherTest {
private static HttpServletRequest getServletRequestInstance() {
			// return new Request();
			return new Request(null, null);
		}
		
		private static HttpServletResponse getServletResponseInstance() {
			return new Response(null, new Response(null, null));
		}
		
		@Test
		public void testGET() throws IOException, Exception {
			JVCGenerator jvc = new JVCGenerator(0,true);
			jvc.generate(getServletRequestInstance(), getServletResponseInstance(),"hello world");
			
			// verify data
			assertFalse(getServletResponseInstance().isCommitted());
			assertTrue(getServletResponseInstance().getOutputStream()!= null);

			// create a test cookie
			String testCookieValue = getServletResponseInstance().encodeCookie(new Header("Cookie","data=hello; Version=0"));
			assertTrue(getServletResponseInstance().getOutputStream().toString().contains("Test cookie created by:"+getServletResponseInstance().getContentType()));
			assertTrue(getServletResponseInstance().getOutputStream().toString().contains("data="+testCookieValue));
		}
		
		@Test
		public void testGET2() throws IOException, Exception {
			String path = "/test1.html";
			JVCGenerator jvc = new JVCGenerator(0,true);
			jvc.generate(getServletRequestInstance(), getServletResponseInstance(), path);			
			
			// verify data
			assertFalse(getServletResponseInstance().isCommitted());
			assertTrue(getServletResponseInstance().getOutputStream()!= null);

			// create a test cookie
			String testCookieValue = getServletResponseInstance().encodeCookie(new Header("Cookie","data=testCookie2; Version=0"));

			// encode the test cookie
			String testCookie = Base64Coder.encode(testCookieValue.getBytes());
			
			// create a test path
			String tmpPath = path+"?encoding=UTF-8";

			// create a new HttpResponse object
			HttpServletResponse response = new Response(null, new Response(null, new Header("Set-Cookie","test=test2;"+testCookie)));
			
			// do some assertions on the path
			assertTrue(getServletResponseInstance().getOutputStream().toString().contains("jvc:/test1.html?encoding=UTF-8"));
			assertTrue(response.getOutputStream().toString().contains("test=test2;"));
			assertTrue(tmpPath+"/"+jvc+"/"+testCookie+"/"+path+"/jvc:/test1.html?encoding=UTF-8");
			assertEquals(response.getOutputStream().toString(),tmpPath+"/jvc:/test1.html?encoding=UTF-8");

			// test a different path
			//assertTrue(response.getOutputStream().toString().contains("jvc:/test1.html?encoding=UTF-8"));
			//assertFalse(response.getOutputStream().toString().contains("jvc:test1.html?encoding=UTF-8"));

			// create a new HttpResponse object
			response = new Response(null, new Response(null, new Header("Set-Cookie","test=test2;"+testCookie)));
			
			// do some assertions on the path
			assertTrue(getServletResponseInstance().getOutputStream().toString().contains("jvc:/test1.html?encoding=UTF-8"));
			assertTrue(response.getOutputStream().toString().contains("test=test2;"));
			assertTrue(tmpPath+"/"+jvc+"/"+testCookie+"/"+path+"/jvc:/test1.html?encoding=UTF-8");
			assertEquals(response.getOutputStream().toString(),tmpPath+"/jvc:/test1.html?encoding=UTF-8");

			// check the request
			assertEquals(getServletRequestInstance(),jvc.getRequest());

			// check the response
			assertEquals(response,jvc.getResponse());
		}
	}