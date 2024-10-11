// JVCRequestContext_7Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#makeLink(String, String)} method.
*/
class JVCRequestContext_7Test {
		
	@Test
	void makeLink_path() throws IOException {
		JVCRequestContext rc = new JVCRequestContext();
		rc.makeLink("/", "/");
		assertEquals(rc.absPath(""), "/");
		assertEquals(rc.absPath("/"), "/");
	}
	
	@Test
	void makeLink_relative() throws IOException {
		JVCRequestContext rc = new JVCRequestContext();
		rc.makeLink("./", "/");
		assertEquals(rc.absPath("/"), "/");
	}
	
	@Test
	void makeLinkRes() throws IOException {
		JVCRequestContext rc = new JVCRequestContext();
		rc.makeLink(".", "/");
		assertEquals(rc.absPath(""), "/");
		assertEquals(rc.absPath("/"), "/");
	}
	
	@Test
	void makeLinkRes_linkRel() throws IOException {
		JVCRequestContext rc = new JVCRequestContext();
		rc.makeLink("../", "/");
		assertEquals(rc.absPath(""), "/");
		assertEquals(rc.absPath("/"), "/");
	}
	
	@Test
	void makeLinkRes_abs() throws IOException {
		JVCRequestContext rc = new JVCRequestContext();
		rc.makeLink("", "/");
		assertEquals(rc.absPath(""), "/");
		assertEquals(rc.absPath("/"), "/");
	}
	
	@Test
	void makeLinkResContextPath() throws IOException {
		JVCRequestContext rc = new JVCRequestContext();
		rc.makeLink("/" + TestHttpServletRequest.class.getPackage().getName() + "/", "/");
		assertEquals(rc.absPath(""), "/");
		assertEquals(rc.absPath("/"), "/");
	}
	
	@Test
	void makeLinkResContextPath_linkRel() throws IOException {
		JVCRequestContext rc = new JVCRequestContext();
		rc.makeLink("../", "/");
		assertEquals(rc.absPath(""), "/");
		assertEquals(rc.absPath("/"), "/");
	}

	@Test
	void makeLinkResContextPath_abs() throws IOException {
		JVCRequestContext rc = new JVCRequestContext();
		rc.makeLink("./test", "/");
		assertEquals(rc.absPath(""), "/");
		assertEquals(rc.absPath("/"), "/");
	}

	@Test
	void makeLinkResContextPathRel() throws IOException {
		JVCRequestContext rc = new JVCRequestContext();
		rc.makeLink(".//test", "/");
		assertEquals(rc.absPath(""), "/");
		assertEquals(rc.absPath("/"), "/");
	}
	
	@Test
	void makeLinkResContextPathRel_abs() throws IOException {
		JVCRequestContext rc = new JVCRequestContext();
		rc.makeLink("test/", "/");
		assertEquals(rc.absPath(""), "/");
		assertEquals(rc.absPath("/"), "/");
	}
	
	
	@Test
    public void makeLink_ServletContext() throws Exception {
		HttpServletRequest request = new TestHttpServletRequest();
		HttpServletResponse response = new TestHttpServletResponse();
		JVCRequestContext jvcContext = new JVCRequestContext();
		jvcContext.makeLink(request, response);
		String linkFromMethod = jvcContext.link.get(0);

		String[] split = linkFromMethod.split("/");
		String contextPath = split[1].substring(0, split[1].lastIndexOf('/'));

		String targetPath = response.encodeURL(request.getRequestURL());

		assertEquals(contextPath, targetPath);
	}

	@Test
	void makeLink_ServletContextPath() throws Exception {
		HttpServletRequest request = new TestHttpServletRequest();
		HttpServletResponse response = new TestHttpServletResponse();
		JVCRequestContext jvcContext = new JVCRequestContext();
		jvcContext.makeLink(request, response, "/");
		String linkFromMethod = jvcContext.link.get(0);

		String[] split = linkFromMethod.split("/");
		String contextPath = split[1].substring(0, split[1].lastIndexOf('/'));

		String targetPath = response.encodeURL(request.getRequestURL());

		assertEquals(contextPath, targetPath);
	}

	@Test
	void makeLinkAbs_ServletContext() throws Exception {
		HttpServletRequest request = new TestHttpServletRequest();
		HttpServletResponse response = new TestHttpServletResponse();
		JVCRequestContext jvcContext = new JVCRequestContext();
		jvcContext.makeLink(request, response);
		String linkFromMethod = jvcContext.link.get(0);

		String[] split = linkFromMethod.split("/");
		String contextPath = split[1].substring(0, split[1].lastIndexOf('/'));

		String targetPath = response.encodeURL(request.getRequestURL().toString());

		assertEquals(contextPath, targetPath);
	}
	
	@Test
	void makeLinkAbs_ServletContextPath() throws Exception {
		HttpServletRequest request = new TestHttpServletRequest();
		HttpServletResponse response = new TestHttpServletResponse();
		JVCRequestContext jvcContext = new JVCRequestContext();
		jvcContext.makeLink(request, response);
		String linkFromMethod = jvcContext.link.get(0);

		String[] split = linkFromMethod.split("/");
		String contextPath = split[1].substring(0, split[1].lastIndexOf('/'));

		String targetPath = response.encodeURL(request.getRequestURL().toString());

		assertEquals(contextPath, targetPath);
	}
}