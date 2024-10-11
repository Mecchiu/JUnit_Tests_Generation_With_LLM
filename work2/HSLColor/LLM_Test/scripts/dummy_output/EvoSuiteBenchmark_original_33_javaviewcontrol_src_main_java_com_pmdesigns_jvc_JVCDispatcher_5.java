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
		
	private HttpURLConnection connection;
	
	public JVCDispatcherTest() {

		try {
			Class.forName("org.eclipse.jetty.jsp.web.JQueryJSPResource");
		} catch(IllegalAccessException | InstantiationException | ClassNotFoundException | ClassCastException | NoClassDefFoundError e) {
			// Do nothing
		}
		
	}
	
	@Test
	public void test1() throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException,
			ClassCastException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException, Exception {
		connection = new HttpURLConnection("http://www.pmdesigns.org/jvc.html", new HashSet<Cookie>()); 
		assertEquals("http://www.pmdesigns.org/jvc.html", JVCGenerator.generate(connection));
		
		int status = connection.getResponseCode();
		assertEquals(200, status);

		Object responseFieldsAsObject = JVCGenerator.getResponseFields(connection);
		
		assertTrue(responseFieldsAsObject instanceof HashSet);
		
		assertTrue(responseFieldsAsObject.toString().contains("<jvcserverconfig>"));
		
		assertTrue(! ((Set<?>)responseFieldsAsObject).contains(new HashSet(JVCGenerator.generate(connection))) );
   	}
   
	@Test
	public void test2() throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException,
			ClassCastException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException, Exception {
		connection = new HttpURLConnection("http://www.pmdesigns.org/jvc.html", new HashSet<Cookie>()); 
		assertEquals("http://www.pmdesigns.org/jvc.html", JVCGenerator.generate(connection));
		
		int status = connection.getResponseCode();
		assertEquals(200, status);

		Object responseFieldsAsObject = JVCGenerator.getResponseFields(connection);
		
		assertTrue(responseFieldsAsObject instanceof Set);
		
		assertTrue(! ((Set<?>)responseFieldsAsObject).contains(new HashSet(JVCGenerator.generate(connection))));
	}
	
	@Test
	public void test3() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException,
			IllegalArgumentException, SecurityException, InvocationTargetException, Exception {
		Class<?> clazz = Class.forName("org.eclipse.jetty.jsp.JSPResource");
		
		Object responseFieldsAsObject = JVCGenerator.getResponseFields(JVCGenerator.makeHttpConnection(clazz, "jvc.html"));
		
		assertTrue(! ((Set<?>)responseFieldsAsObject).contains(new HashSet(JVCGenerator.generate(JVCGenerator.makeHttpConnection(clazz, "jvc.html"))) ));
   }
 
	/* Test JVCDispatcher.doGet */
	@Test
	public void test4() throws ServletException, IOException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, Exception, ServletException {
		connection = new HttpURLConnection("http://www.pmdesigns.org/jvc.html", new HashSet<Cookie>()); 
		assertEquals("http://www.pmdesigns.org/jvc.html", JVCGenerator.generate(connection));
		
		int status = connection.getResponseCode();
		assertEquals(200, status);
   }
	
/* End of JVMCCTest.java */
}