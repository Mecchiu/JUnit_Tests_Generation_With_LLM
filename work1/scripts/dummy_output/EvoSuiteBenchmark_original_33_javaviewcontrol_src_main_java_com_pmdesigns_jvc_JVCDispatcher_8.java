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
		
	private static final String TEST_VALUE = "test value";
	private static final String HTTP = "http";
	private static final String HTTPS = "https";
	private static final String CONNECTION = "GET";
	private static final String REMOTE_IP = "127.0.0.1";
	
	private static final JVCGenerator generator = new JVCGenerator();
	private static final JVCRequestContext rc;
	
	static {
		rc = new JVCRequestContext();
		rc.setGenerator(generator);
		rc.setType("JVCGenerator");
	}
	
	/**
	 * Constructor for {@link JVCDispatcherTest#JVCDispatcherTest()}.
	 */
	public JVCDispatcherTest() {
	}
	
	/**
	 * @throws ServletException
	 * @throws IOException
	 * @throws Exception
	 */
	@Test
	void test() throws ServletException, IOException, Exception {
		
		// Setup test servlet
		JVCDispatcher test = new JVCDispatcher();
		test.init();
		
		// Test setup parameters
		test.setPort(8080);
		test.setMethod("GET");
		test.setUrlEncoded(false);
		
		// Test execution
		String result = test.doRequest(null);
		
		// Verify result
		assertNotNull(result);
		assertTrue(result.indexOf(TEST_VALUE) > 0);
		
		// Test close
		test.stop();
	}

	/**
	 * @throws ServletException
	 * @throws IOException
	 * @throws Exception
	 */
	private boolean doRequest(String urlEncodedParam) 
		throws ServletException, IOException, NoSuchMethodException, 
		InvocationTargetException, IllegalArgumentException
	{
		
		String request = urlEncodedParam? urlEncodedParam : getMethod() + "(" + getUrlEncoded() + ")";
		String response = request + "&";
	
		request = "GET " + urlEncodedParam + " HTTP/1.1\r\n";
		request += "Host: www.pmdesigns.com\r\n";
		request += "User-Agent: MVC (Java Web Framework Client/" + System.getProperty(System.net.java.runtime.version) + ") \r\n";
		request += "Content-Length: 0\r\n";
	    request += HttpServletRequest.getParameter("Cookie") + "\r\n";
		request += "Content-Type: application/x-www-form-urlencoded\r\n";
	    
		HttpURLConnection conn = (HttpURLConnection) new URL(request).openConnection();
		
		JVCRequestContext context = (JVCRequestContext) rc.getContext();
		int code = conn.getResponseCode();
		
		// Should not throw Any exception
		testServlets(request, context, code>0);
	    return true;
	}
	
	/**
	 * @throws ServletException
	 * @throws IOException
	 * @throws Exception
	 */
	private void testServlets(String request, JVCRequestContext context, boolean success) 
		throws ServletException, IOException, NoSuchMethodException, 
		InvocationTargetException, IllegalArgumentException
	{
		Context ctx = new Context(context);
		ctx.setServletName("JVCDispatcherTest");
		ctx.setServletContext(rc.getServletContext());
		ctx.setCurrentContext(rc);
  
		Method start = this.getClass().getDeclaredMethod("start", Context.class);
		Constructor<Context> ctor = start.getDeclaringClass().getConstructors()[0];
		Context context2 = ctor.newInstance(ctx);
		ctx.setCurrentContext(context2);
	
		// Verify response
		if (success) {
			System.out.println("Test succesful");
		}
		try {
			start.invoke(context, context2);
		} catch (IllegalArgumentException iae) {
			if (success) {
				System.out.println("Unable Test: " + iae.getMessage());
				fail(iae);
			}
			return;
	    } catch (Exception e) {
			System.out.println("Unable Test: " + e.getMessage());
			e.printStackTrace();
		}
		fail("Test failed");
	}
	
	// Type-specific helper methods
	private void assertTrue(boolean b) {
		assertTrue(b, "Expected to be true");
	}
	
	private void assertTrue(boolean cond, String message) {
		if (! cond) {
			fail(message);
		}
	}
	

	private String getUrlEncoded() {
		return "http://" + REMOTE_IP + ":" + rc.getPort()   + "&" + 
			"encoding=UTF-8&"+"uri=" + 
			"/JVCDispatcherTest?method=" + getMethod() + 
			"&" + 
			"action=" + getAction() + 
			"&" + 
			"value=" + HTTP + 
			"&" + 
			"value=" + HTTPS +
			"&" + 
			"urlEncodedParam=" + 
			HTTP + 
			"&" + 
			"urlEncodedParam=" + 
			HTTP + 
			"&" + 
			"urlEncodedParam=" + 
			HTTP + 
			"&" + 
			"urlEncodedParam=" + 
			HTTP + 
			"&" + 
			"urlEncodedParam=" + 
			HTTP + 
			"&" + 
			"urlEncodedParam=" + 
			HTTP + 
			"&" + 
			"urlEncodedParam=" + 
			HTTP + 
			"&" + 
			"urlEncodedParam=";
	}
	
	private String getMethod() {
}
}