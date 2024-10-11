// JVCRequestContext_8Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
*/
class JVCRequestContext_8Test {
		
    /**
     * Test method for {@link JVCRequestContext#JVCRequestContext(javax.servlet.ServletRequest)}.
     */
    @Test
    public void testJVCRequestContext() throws IOException, ServletException {

    	// Create our Request and response objects
    	Request request = new MockServletRequest("POST", "/");
    	ServletRequestAttributes attr = 
    			new ServletRequestWrapper(request) {
    	        public Request getRequest() {
    	            return request;
    	        }
    	    };
    	   
    	  // Perform test and return result
    	  String filePath = "test.png";
    	  String filePathRelative = "test1";
    	  byte[] fileBytes = "this is the test byte array".getBytes();

    	  // Create our HttpServletRequest and servlet response
    	  HttpServletRequest httpServletRequest = 
    	  new MockHttpServletRequest(attr);
    	  HttpServletResponse httpServletResponse = 
    	  new MockHttpServletResponse();
    	  JVCRequestContext jvcRequestContext = 
    	  new JVCRequestContext(httpServletRequest, httpServletResponse, fileBytes);
    	  
    	  RequestAttributeStream requestStream = jvcRequestContext.getRequestStream();

    	  // Try to get our file
    	  String fileSuffix = ".txt";
    	  ByteArrayOutputStream baos = new ByteArrayOutputStream();
    	  requestStream.getInputStream().read(baos);
    	  // Get the html
    	  String html = baos.toString();
    	  
    	  // Add some html
    	  httpServletRequest.getSession().setAttribute("TEXT-XML", html + baos.toString());
    	  
    	  String link = jvcRequestContext.makeLink(filePathRelative, filePath, null);

    	  // Create the actual servlet response object
    	  ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
    	  ServletFileUpload uploadFile = null;

    	  uploadFile = upload.parseRequest(request);

    	  FileInputStream input = new FileInputStream(filePathRelative);
    	  try{
    	  	byte[] array = new byte [fileBytes.length];
    	  	Streams.copy(input, 0, array, 0, fileBytes.length);
    	  	assertEquals(filePathRelative, upload.getFieldName());
    	  	assertEquals(Arrays.toString(fileBytes), Arrays.toString(array));
    	  	assertEquals(0, array.length);
    	  	assertEquals("TEXT-XML", jvcRequestContext.getRequest().getRequestURL().getParameter(link));
    	  } finally {
    	  	if(input!=null) input.close();
    	  }
     	}

	}//JVCRequestContext_8Test_8Test.class