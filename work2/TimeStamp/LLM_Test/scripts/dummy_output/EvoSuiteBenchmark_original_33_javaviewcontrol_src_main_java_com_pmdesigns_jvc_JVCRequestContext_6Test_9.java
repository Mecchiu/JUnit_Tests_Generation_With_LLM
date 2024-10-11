// JVCRequestContext_6Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#absPath(String)} method.
*/
class JVCRequestContext_6Test {
		JVCRequestContext object;
	
	/**
	 * Constructor of the class.
	 * Create a new JVCRequestContext.
	 */
        public JVCRequestContext_6Test()
       {
        }

	/**
	 * Constructor of the class with a servlet path.
	 * Create a new JVCRequestContext with the specified servlet path.
	 * @param path the servlet path
	 */
        public JVCRequestContext_6Test(String path)
       {
        this.object = new JVCRequestContext(path);
       }

	/**
	 * Test method for {@link JVCRequestContext#absPath(String)} method.
	 * Test to ensure that an absolute path is correctly calculated.
	 * @throws ServletException if there is a Servlet problem.
	 * @throws IOException if there is a problem in reading the file
	 */
        @Test
		public void testAbsPath() throws Exception {
    		RequestContext requestContext = new RequestContext();
    
    		String tempFile = "/home/mike/tmp2.txt";
    		Files.createTempFile("src/test/resources/", "jsch").toFile().deleteOnExit();
    			Streams.copy("http://c.firmestar.com/download_url.cgi?url=http%3A%2F%2Fwww.jvc.gov&amp;type=audio&amp;format=audio", new FileOutputStream(Files.createTempFile(tempFile,'.txt')));
    			HttpURLConnection connection = (HttpURLConnection) new URL("http://c.firmestar.com/download_url.cgi?url=http%3A%2F%2Fwww.jvc.gov&amp;type=audio&amp;format=audio").openConnection();
    			System.out.println("Connection status: " + connection.getURL().toString());
    			requestContext.startRequest();
    			response("/files/", HttpServletResponse.SC_OK, connection);
    		assertNotNull(requestContext.getFlash());
    		assertEquals("A flash string.", object.absPath(tempFile));
    		requestContext.startRequest();
    		response("/files/123", HttpServletResponse.SC_OK, connection);
    		assertEquals("A flash string.  Expected 200, got " + connection.getResponseCode(), HttpServletResponse.SC_OK);
    		response("/files/123/", HttpServletResponse.SC_OK, connection);
    		assertEquals("A temp file was not uploaded. Expected response of 200, got " + response(tempFile), HttpServletResponse.SC_OK);
		}
	}