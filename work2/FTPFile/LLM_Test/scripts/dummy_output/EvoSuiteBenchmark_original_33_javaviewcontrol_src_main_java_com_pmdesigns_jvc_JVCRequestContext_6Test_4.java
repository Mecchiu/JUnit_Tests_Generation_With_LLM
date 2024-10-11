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
		
    private List<JVCUpload> uploads; 
    
    @Before
    public void init() throws Exception {
		uploads = new ArrayList();
    }
    
	/**
	 * Prepare (store) a JVCRequestContext object for use with tests.
	 *
	 * @param name the name of the object to create
	 * @return a new instance of JVCRequestContext
	 */
    public JVCRequestContext createRequestContext(String name) {
	    return new JVCRequestContext(name);
    }

	/**
	 * Prepare (store) a HttpServletRequest object for use with tests.
	 *
	 * @param name the servlet name to create, must not be null
	 * @return a new instance of HttpServletRequest
	 */
    public HttpServletRequest createRequest(String name) throws Exception {
	    HttpServletRequest request = new MockServletRequest(this,name); 
	    
	    // set session data key
	    request.setAttribute("session", "key=" + UUID.randomUUID().toString());
	    
	    // store session key
	    Session sessionKey = new Session(request);
	    sessionKey.setSession(true);
	    
	    return request;
    }

	/**
	 * Prepare (store) a HttpServletResponse object for use with tests.
	 *
	 * @param name the servlet name to create, must not be null
	 * @return a new instance of HttpServletResponse
	 */
    public HttpServletResponse createResponse(String name) throws Exception {
	    HttpServletResponse response = new MockServletResponse(this);
	    response.setStatus(HttpServletResponse.SC_OK);
		
	    // Set response header
	    response.setStatus(200);
	    // set session key
	    response.setAttribute("session", "Key=" + UUID.randomUUID().toString());
	    return response;
	}
    
	/**
	* Test for a HttpServletRequest with null servlet class.
	*/
    @Test
    public void testNullServletClass() throws Exception {
		try {
			// create request object
			HttpServletRequest request = new MockServletRequest(null) {

				public String getParameter(String key) {
					return null;
				}
				
			};

			// check session key
			assertEquals("null key", "Key=" + UUID.randomUUID().toString());
		}
		catch (Exception e) {
			fail("Error in test. " + e.getMessage());
		}				
    }

	/**
	 * Constructs a servlet with a mock servlet.
	 *
	 * @param name
	 * @return the mock servlet object
	 */
    private HttpServlet createMockServlet(String name) {
	    return mock(HttpServlet.class);
    }

	/**
	 * This method creates a JVCRequestContext and stores it in the JVCRequestContext
	 * instance variable. 
	 *
	 * @param request
	 * @return the JVCRequestContext
	 */
    private JVCRequestContext createRequestContext(HttpServletRequest request)
    {
    	String name = "test";
        uploads.add(new JVCUpload(MockServletRequest.uploadURL, request));
    	return new JVCRequestContext(name);
    }

	/**
	* This method creates test data.
	*/
    private void createTestData(JVCRequestContext context) {
		context.createRequestContext(""); // requestContext used by both mock servlet and real servlet
		context.createServletRequest(""); // servlet request does nothing
		context.createServletResponse(""); // no response
	}
	
	/**
	 * Test for the getAbsolutePath (see javadoc for that method)
	 */
    @Test
    public void testGetAbsolutePath() throws Exception {
		JVCRequestContext context = createRequestContext("");
		context.setAttribute(JVCRequestContext.ABS_REL_PATH, "test");

		assertNotNull("Returned an absolute path.", context.getAbsolutePath(this.createRequest(this.createRequest(this.createRequest("http://something.org/abc", "bcd"))), this.createRequest(this.createRequest("http://something.org/test", "xyz"))));
		assertEquals("Absolute path in request was wrong.", "test/abc/bcd", context.getAbsolutePath(this.createRequest(this.createRequest("http://something.org/a/b/c", "xyz")), this.createRequest(this.createRequest("http://something.org/z", "hello"))));
		
		createTestData(context);
		
		assertNotNull("Absolute path result is null.", context.getAbsolutePath(this.createRequest(this.createRequest("http://something.org/abc", "bcd")), this.createRequest(this.createRequest("http://something.org/test", "xyz"))));
		assertEquals("Absolute result in request was wrong.", "http://something.org/z/hello/test/abc/bcd", context.getAbsolutePath(this.createRequest(this.createRequest("http://something.org/abc", "bcd")), this.createRequest(this.createRequest("http://something.org/z", "hello"))));
	}

	/**
	 * Test for the getCompleteUrl() (see javadoc for that method)
	 */
    @Test
    public void testGetCompleteUrl() throws Exception {
		JVCRequestContext context = createRequestContext(this.createRequest(this.createRequest(this.createRequest("http://something.org/abc", "bcd"), this.createRequest("http://something.org/z/hello/test/abc/bcd")), this.createRequest(this.createRequest("http://something.org/testx", "xyz"))));
		assertEquals("Complete url in request was wrong.", "http://something.org//testx/z/hello/test/abc/bcd", context.getCompleteUrl(this.createRequest(this.createRequest("http://something.org/z/hello/test/abc/bcd"), this.createRequest("http://something.org/testx", "xyz"))));
	}

}