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
		
	/**
	 * Test method for {@link JVCRequestContext#makeLink(String, String)}.
	 */
	@Test
	void testMakeLink() {
		// Set up an empty context for the tests:
		HttpServletRequest request = new HttpServletRequest() {
	
		};
		HttpServletResponse response = new HttpServletResponse() {
		
		};

		// Make a request URL pointing to an anchor link (in this example):
		String location = "/foo";		
		request.setParameter("url", location);
		assertTrue("Make a valid anchor link", request.getParameter("url")!= null);	                
		
		// Make a request URL pointing to a local file (in this example):
		location = newFile("/etc/web/jsp/sample2.jsp").getAbsolutePath();
		request.setParameter("url", location);
		assertTrue("Make a valid local file", request.getParameter("url")!= null);	 	
		
		// Make a request URL pointing to a remote URL (in this example):
		location = "/web";
		request.setParameter("url", location);
		assertTrue("Make a valid remote URL", request.getParameter("url")!= null);	
				
		assertSucceeded("Make a valid link", request);
		
		assertTrue(request.getParameter("url")!= null);   	
		System.out.println("Link url: " + request.getParameter("url"));        
		
		try {
			makeLink("/foo", location);
		} catch (FileNotFoundException fne) {
			fne.printStackTrace();
		}		    
     
		try {
			request.getParameter("url");
		} catch (IllegalStateException ise) {
			ise.printStackTrace();
		} 
	}	       
    }