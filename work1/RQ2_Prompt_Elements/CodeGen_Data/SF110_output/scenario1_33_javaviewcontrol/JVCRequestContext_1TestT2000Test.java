// JVCRequestContext_1Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getParamMap(String)} method.
*/
class JVCRequestContext_1Test {
public JVCRequestContext_1Test() { }

		private static File getFile(String name) {
			File dir = new File(System.getProperty("java.io.tmpdir")+"/JVCRequestContext_1Test_"+name);
			if (dir.exists() &&! dir.isDirectory()) throw new IllegalArgumentException("File " + dir + " is not a directory");
			if (! dir.mkdir()) throw new RuntimeException("Cannot create directory " + dir);
			return new File(dir, name);
		}
	@Test
	public void test_getParamMap(){
		File f = getFile("default.txt");
		JVCRequestContext jvc = new JVCRequestContext();
		HttpServletRequest request = jvc.getRequest();
		assertEquals(HttpServletRequest.class.getResource("default.txt"), request.getAttribute("javax.servlet.include.servlet_path"));
		f = getFile("file.txt");
		request = jvc.getRequest();
		assertEquals(HttpServletRequest.class.getResource("file.txt"), request.getAttribute("javax.servlet.include.servlet_path"));
		f = getFile("file.txt2");
		request = jvc.getRequest();
		assertEquals(HttpServletRequest.class.getResource("file.txt"),"none");
		request = jvc.getRequest();
		assertNull(request.getAttribute("javax.servlet.include.servlet_path"));
		f = getFile("file2.txt");
		request = jvc.getRequest();
		assertEquals(HttpServletRequest.class.getResource("file2.txt"), request.getAttribute("javax.servlet.include.servlet_path"));
		request = jvc.getRequest();
		assertNull(request.getAttribute("javax.servlet.include.servlet_path"));
	}
	@Test
	public void test_getParamMap_1(){
		HttpServletRequest request = jvc.getRequest();
		HttpServletResponse response = jvc.getResponse();
		String fileName = "default.txt";
		File f = getFile(fileName);
		assertNotNull("file " + fileName + " should not be null", f);
		if (request!= null && response!= null) {
			assertEquals(HttpServletResponse.class.getResource(fileName), response.getHeader("Cache-Control"));
			assertEquals(HttpServletResponse.class.getResource(fileName), response.getHeader("Pragma"));
			Object tmp = request.getAttribute("javax.servlet.include.servlet_path");
			if (tmp == null) {
				throw new IllegalStateException("Request has no include servlet path");
			}
			if (tmp instanceof String) {
				f = getFile(tmp + ((String)tmp).substring(1,tmp.length()));
				assertNotNull("Servlet path not null", f);
				assertEquals(HttpServletResponse.class.getResource(tmp + ((String)tmp).substring(1,tmp.length())), response.getHeader("Cache-Control"));
				assertEquals(HttpServletResponse.class.getResource(tmp + ((String)tmp).substring(1,tmp.length())), response.getHeader("Pragma"));
				tmp = request.getAttribute("javax.servlet.include.request_path");
				if (tmp == null) {
					throw new IllegalStateException("Request has no include request path");
				}
				if (tmp instanceof String) {
					f = getFile(tmp + ((String)tmp).substring(1,tmp.length()));
					assertNotNull("Servlet path not null", f);
					assertEquals(HttpServletResponse.class.getResource(tmp + ((String)tmp).substring(1,tmp.length())), response.getHeader("Cache-Control"));
					assertEquals(HttpServletResponse.class.getResource(tmp + ((String)tmp).substring(1,tmp.length())), response.getHeader("Pragma"));
					tmp = request.getAttribute("javax.servlet.request_path");
					if (tmp == null) {
						throw new IllegalStateException("Request has no include request path");
					}
					if (tmp instanceof String) {
						f = getFile((String)tmp + ((String)tmp).substring(1,tmp.length()));
						assertNotNull("Servlet path not null", f);
						assertEquals(HttpServletResponse.class.getResource("none"), response.getHeader("Cache-Control"));
						assertEquals(HttpServletResponse.class.getResource("none"), response.getHeader("Pragma"));
						tmp = request.getAttribute("javax.servlet.request_context_path");
						if (tmp == null) {
							throw new IllegalStateException("Request has no include request context path");
						}
						if (tmp instanceof String) {
							f = getFile((String)tmp + ((String)tmp).substring(1,tmp.length()));
							assertNotNull("Servlet path not null", f);
							assertEquals(HttpServletResponse.class.getResource("none"), response.getHeader("Cache-Control"));
							assertEquals(HttpServletResponse.class.getResource("none"), response.getHeader("Pragma"));
							tmp = request.getAttribute("