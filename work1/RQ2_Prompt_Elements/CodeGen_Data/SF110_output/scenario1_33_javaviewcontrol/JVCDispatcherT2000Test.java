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
public static JVCRequestContext ctxHolder = new JVCRequestContext();
				
	//
	// Constructor
	//

	/**
	* Create a JVCDispatcher using the default JVCTest class.
	*/
	public JVCDispatcherTest() {
		JVCRequestContext.jvctestClass = getClass();
	}
							
	/**
	* Create a JVCDispatcher using the specified JVCTest class.
	* @param testClass The JVTClass to use.
	*/
      public JVCDispatcherTest(Class testClass) {
		JVCRequestContext.jvctestClass = testClass;
	}
							

	//
	// Getters and setters
	//

	public static Object getTBDynClass() {
		return ctxHolder.get().jvctestClass.getCanonicalName();
	}

	public static Class getTBDynClassForTest() {
		return getTBDynClass();
	}
	
	public static Constructor getTADotClass() throws ClassNotFoundException {
		ClassLoader cl = JVCRequestContext.class.getClassLoader();
		Class t = cl.loadClass("org.junit.Test");
		Constructor tcc = t.getConstructor(new Class[] {});
		return tcc;
	}

	public static boolean hasTBDynClass() {
		return ctxHolder.get().jvctestClass!= null;
	}

	public static Class getTargetClass() {
		if (hasTBDynClass())
			return getTBDynClassForTest();
		return ctxHolder.get().jvctestClass;
	}

	
	/**
	*
	* Gets the class name of the target class.
		TBD
	* 
	* @throws ClassNotFoundException
	*/

	public Class getTargetClassForTest() throws ServletException {
		Class[] classes = getTBDynClass().getInterfaces();
		assertTrue(classes.length == 1);
		Class targetClass = classes[0];
		//assertTrue("No target class!", targetClass.equals(Object.class));
		return targetClass;
	}
		
	public void init() throws Exception {}

	public static Object callTBDynClassMethod() throws InvocationTargetException,
	    IllegalAccessException, ClassNotFoundException, 
	    NoSuchMethodException, SecurityException {
		return getTBDynClassForTest().getMethod("testMethod");
	}

	/**
	*
	* Calls the provided target method on the requested target class.
		TBD
	*
	* @throws ServletException
	*/

	public Object callTADotClassMethod() throws ServletException {
		return getTargetClassForTest().newInstance();
	}
	
	public void setDispatcherResponseHeader() throws Exception {	
		setAttribute("response.dateHeader", getDate(System.currentTimeMillis()));
		setAttribute("response.lastRunBy", "demo");
		setAttribute("response.message", "Test Response");
	}
	

	//
	// Utility methods
	//
	/**
	*
	*/
	
	public static long getDate(long l) {
		return new GregorianCalendar(1970, 0, 1, 0, 0, l).getTimeInMillis();
	}
	
	/**
	*
	*/
	
	public static long getDate(int i) {
		return new GregorianCalendar(1970,0,1,0,0, i).getTimeInMillis();
	}
	
	/**
	*
	*/

	public static String getTimeAsString() {
		GregorianCalendar gc = new GregorianCalendar();
		return new SimpleDateFormat("HH:mm:ss.SSS").format(gc.getTime());
	}

 
	public static String getDate(java.util.Date date) {
 
		java.util.TimeZone tz=java.security.AccessController.doPrivilegedAction("TimeZone.getDefault");
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(date);
	}

	/**
	*
	*/

	static {
		System.getProperties().put("java.security.policy", "/security-policy.policy");
		try {
			System.setSecurityManager(new SecurityManager());
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		System.setInheritable(true);
	}

 
	public static ArrayList<Cookie> getAcceptedCookies() {
		return null; 
	}
	
	public static String getDefaultCookieName() {
		return "fooBar";
	}
	
	
	public static String getCookieValue(String name) {
		String value =  (String) JVCRequestContext.getCookieHandler().getValue(name);
		return value;
	}
	
 
	public static String getCookieName(String name) {
		String value =  (String) JVCRequestContext.getCookieHandler().getValue(name);
		return value;
	}

	public static String encode(String data) throws UnsupportedEncodingException {
		String result = "";
		Base64Coder b = new Base64Coder();
		result = b.encode(data);
		return result;
	}

	public static String decode(String data) throws UnsupportedEncodingException {
		return (String) JVCRequestContext.getCookieHandler().decodeValue(data);
	}
	
	//
	// JVC and JVCGenerator API
	//

	public static String generate(String name) throws IOException {
		return JVCGenerator.generate(name);
	}
	
	public static String generate(String name, String value) throws IOException {
		return JVCGenerator.generate(name,value);
	}

	public static String delete(String name) {
		return (String) JVCRequestContext.getCookieHandler().deleteValue(name);
	}
		
	/*
	* HTTP Header Handler
	*/
	
	public static void addHeader(String name, String value) {
		JVCRequestContext.getHeaders().add(name, value);
	}
	
	