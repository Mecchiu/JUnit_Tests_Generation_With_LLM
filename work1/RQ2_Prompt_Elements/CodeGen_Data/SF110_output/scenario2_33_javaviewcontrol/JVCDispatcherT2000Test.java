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

	/**
	 * The main method of the JVCDispatcherTest class.
	 * It dispatches requests to JVC.
	 * Method {@link Base64Coder#encode(byte[])} may be overridden to use {@link Base64Coder}
	 * to encrypt the request's body; otherwise the request's body will be encoded by default.
	 *
	 * @param args
	 *		a command-line argument
	 * @throws Exception
	 *		thrown if something went wrong
	 */
	public static void main(String[] args) throws Exception {
		HttpURLConnection urlc = null;
		FileOutputStream fos = null;
		HttpServletRequest request = null;
		HttpServletResponse response = null;
		String requestString = null;

		try {
			response = new HttpServletResponse();



			// Setup a ServletContext that will call the method {@link JVCGenerator#encode(byte[])}
			javax.servlet.ServletContext sc = new javax.servlet.ServletContext();
			sc.setAttribute("javax.servlet.dispatch.Class", "com.pmdesigns.jvc.tools.JVCHandler");
			javax.servlet.ServletContext sc2 = new javax.servlet.ServletContext();
			sc2.setAttribute("javax.servlet.dispatch.Class", "com.pmdesigns.jvc.tools.JVCRequestDispatcher");

			// Configure the JVA request dispatcher
			sc.setAttribute("java.util.Enumeration", new Enumeration());
			sc.setAttribute("java.lang.invoke.LambdaMetafactory", new LambdaMetafactory());
			sc2.setAttribute("java.util.Enumeration", new Enumeration());
			sc2.setAttribute("java.lang.invoke.LambdaMetafactory", new LambdaMetafactory());

			// Launch a new JVM and set the initial request environment
			sc.setAttribute("java.util.ServiceLoader", new ServiceLoader());
			sc2.setAttribute("java.util.ServiceLoader", new ServiceLoader());

			sc.setAttribute("javax.servlet.context.tempdir", new File(".") );
			String dir = "/tmp/Test/";
			sc.setAttribute("javax.servlet.context.tempdir", new StringBuffer(dir));
			
			sc.setAttribute("com.pmdesigns.jvc.tools.JVC_javaconfig", "com.pmdesigns.jvc.tools.JVCGenerator");
			final StringBuffer sb = new StringBuffer();
			ClassLoader loader = ClassLoader.getSystemClassLoader() ;
			Method loadCmp = CMP_method ;
			try {
				loadCmp=Class.forName(loader.getClass().getName(),"java.lang.ClassLoader");
			} catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException e)  {
				e.printStackTrace();
			}
			
			try {
				Class c = Class.forName(loader.getClass().getName(),"java.lang.ClassLoader");
				Constructor ctor = null;	
				while (ctor!= null && ctor.getDeclaringClass() == c) {
					ctor = (Constructor) ctor.getConstructor(new Class[0]);
				}
				assertTrue("CMP request class was not found", 
					          ctor!= null);
				
				ClassLoader baseLoader = (ClassLoader) c.getMethod("getResourceAsStream").invoke(loader);
				//System.out.println("Base loader "+baseLoader);
				System.out.println("Base loader: "+baseLoader);
				ClassLoader loader1 = (ClassLoader) ctor.newInstance(null);
				//System.out.println("Loader1 " + loader1);
				
			} catch (Exception e) {
				e.printStackTrace();
				fail("Unable to load "+loader+" class.");
			}

			// Initialize the response writer for this test
			fos = new FileOutputStream("resources/resp.txt");
			urlc = getRC();
			//urlc is still null because this test just adds content to the file writer. 
			response = new HttpServletResponse();						
			response.setContentType("text/plain");
			ResponseWriter writer = new ResponseWriter(response);

			// Configure a JVO for the test
			javax.servlet.http.HttpServletRequest req = new javax.servlet.http.HttpServletRequest(new javax.servlet.http.HttpServletRequest(), "POST");

			requestString = JVCGenerator.encode(new byte[] {42, 84});


			try {
				urlc.setRequestEntity(new NameValuePair("postdata", requestString), "text/plain");
			} catch (Throwable t) {
				Throwable e = t;
			}
			//urlc.addHeader("Cookie", "fav2=4; Expires=Thu, 01-Jan-99T00:00:01Z");
			int i = 0;
			while (true) {
				try {
					i = urlc.getRequestMethod();
					System.out.println("GET Request: "+i);
					
					try {
						urlc.connect();
						writer.write(sb.toString());
						writer.flush();
						urlc.disconnect();
					} catch (IOException e) {
						urlc = getRC();
					}
					System.out.println("Response "+i+":");
					urlc.getResponseCode();

				} catch (Throwable t) {
					t.printStackTrace();
				}
				System.out.println();
				try {
					Thread.sleep(1000*30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		
			try {
				JVCHandler.getJVCHandler().execute(request);
			} catch (Exception e) {
				if (e.getMessage().contains("Exception was ") && e.getMessage().contains