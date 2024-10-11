// JVCRequestContext_4Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getSessionAttr(String)} method.
*/
class JVCRequestContext_4Test {
		
    @Test
    void testGetSessionAttr() {

		try {
			JVCRequestContext request = new JVCRequestContext();
			assertNotNull(request.getSessionAttr("foo"));
			assertNotNull(request.getSessionAttr("bar"));
			assertNull(request.getSessionAttr("baz"));
			assertNotNull(request.getSessionAttr("quux"));
		} catch(Exception e) {
			throw new RuntimeException("Unexpected exception from getSessionAttr.", e);
		}
    }

    @Test
    void testSetSessionAttr() {

		try {
			JVCRequestContext request = new JVCRequestContext();
			request.setSessionAttr("foo", "bar");
			String baz = "quux";		
			assertEquals("bar", request.getSessionAttr("baz"));
			assertEquals(baz, request.getSessionAttr("foo"));
		} catch(Exception e) {
			throw new RuntimeException("Unexpected exception from setSessionAttr.", e);
		}
    }
	@Test
    void testGetSessionAttrs() {
		HttpServletRequest request = new HttpServletRequest("GET", "/page?format=json");
		try {
			request.setAttribute("foo", "bar");
			String baz = "quux";
			request.setAttribute("baz", baz);		
			List<String> keysList = new LinkedList<String>();
			keysList.add("baz");
			keysList.add("quux");
			request.addParameter("keys", keysList);

			request.addHeader("accept", "application/xml");

            request.getRequestDispatcher("/page").include(request);

            
		} catch(Exception e) {
			throw new RuntimeException("Unexpected exception from getSessionAttrs.", e);
		}
    }
	@Test
    void testSetSessionAttrs() {
		HttpServletRequest request = new HttpServletRequest("GET", "/page?format=json");
		try {
			request.setAttribute("foo", "bar");
			request.setAttribute("baz", "quux");
			request.setAttribute("keys", new LinkedList<String>("baz"));		
			List<String> keysList = new LinkedList<String>();
			keysList.add("baz");
			request.addParameter("keys", keysList);

			request.addHeader("accept", "application/xml");

            request.getRequestDispatcher("/page").include(request);

            
		} catch(Exception e) {
			throw new RuntimeException("Unexpected exception from setSessionAttrs.", e);
		}	        	
	}

}