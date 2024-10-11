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
     * The following is used to ensure that the constructor gets run for
     * each test case.
	 */
	@Test
    public void testConstructor() throws Exception {

		// Get a reference to the request object for this unit test.
		HttpServletRequest httpReq = request("http://www.google.com", null, null, null, null, null);
	
		// Create a new context with the request.
		// We are using a new context here.
		JVCRequestContext context = new JVCRequestContext();
	
		// Ensure the name of the request is used for links.
		assertEquals("http://www.google.com", context.getParam("http://www.google.com"));

	
	}

	/**
     * Test method to ensure that the method takes a single header as input argument
     * 
     * @see JVCRequestContext#makeLink(String, String)
     */
    @Test
    public void testGetParam() throws Exception {

        JVCRequestContext context = new JVCRequestContext();
		
		// Create a key from the link text.
		String key = "foo&bar";
		
		// Ensure the first parameter does not return a null value.
		String value = context.getParam(key);
		assertNotNull("Didn't fetch key '" + key + "' as first value.", value);
		assertTrue("Key '" + key + "' is null.", value.startsWith("\""));
		assertFalse("Key '" + key + "' is missing.", value.startsWith("'"));
		assertFalse("Key '" + key + "' is missing.", value.endsWith(".'"));

		// Ensure that a null parameter does not return a null value.
		value = context.getParam(null);
		assertNotNull("Didn't fetch null object key.", value);

		// Ensure that a null parameter does not return an empty value.
		assertNull(context.getParam(null));
		
	}

	/**
     * Test method to ensure that the method returns a single header as the request object
     * 
     * @see JVCRequestContext#makeLink(String, String)
     */
    @Test
    public void testGetParamNull() throws Exception {

        JVCRequestContext context = new JVCRequestContext();
		
		// Create a key from the link text.
		String key = "";
		
		// Ensure the first parameter does not return a null value.
		String value = context.getParam(key);
		assertNotNull("Didn't fetch key '" + key + "' as first value.", value);
		assertFalse("Key '" + key + "' is null.", value.startsWith("\""));
		assertFalse("Key '" + key + "' is missing.", value.startsWith("'"));		
		
		// Ensure that a null parameter does not return a null value.
		value = context.getParam(null);
		assertNotNull("Didn't fetch null object key.", value);

		// Ensure that a null parameter does not return an empty value.
		assertNull(context.getParam(null));
		
	}

	/**
	 * Returns the appropriate path to use for an absolute path in a request context
	 * 
	 * @param context the context to work with
	 * @return the appropriate path
	 */
	private String absPath(Context context) {
		// Assume the path starts with "/" and doesn't start with "http://"
		String path = "/";
        ContextPath pathContext = context.getContextPath();
        String pathVariable = pathContext.getContextVariable(pathContext.getDefaultContextParameterName());
        if (pathVariable!= null) {
            if (pathVariable.startsWith("/") || pathVariable.startsWith("http://")) {
                path = pathVariable;
            }
        }

		// Make sure the path is not null and it has a value.
		if (path == null || path.equals("")) {
			path = "/";
		}

        // Create and return the relative path to path.
        // Note: the path is always relative to the current path in the context 
        //       so we replace the / path with an 'o' char.
        //
		// If path does not yet exist in the context then it is added to the 
		// newPath.
		return context.getRelativePath(path).replace("/o", "");

	}

	/**
     * Test method to ensure that the method allows the relative URL to be used
     * across links
	 * 
     * @see JVCRequestContext#makeLink(String, String)
	 */
    @Test
    public void testMakeLink() throws Exception {

        JVCRequestContext context = new JVCRequestContext();

		// Create a key from the link text.
		
		// Ensure that the parameter is null.
		String key = "http://www.google.com";
		assertNull(context.getParam(key));

		// Create the link string
		String link = "http://www.google.com?key=value";
		int index = link.indexOf("&");
		assertEquals(5, index); // "key" is added to the url,
								// first & & are appended to it.
		String url = link.substring(0, index);
		String keyUrl = context.getParam(key);
		assertNotNull("Didn't fetch key '" + key + "' as first value.", keyUrl);
		assertTrue("Key '" + key + "' is null.", keyUrl.startsWith("\""));
		assertFalse("Key '" + key + "' is missing.", keyUrl.startsWith("'"));
		assertTrue("Key '" + key + "' is missing.", keyUrl.endsWith(".'"));
		assertTrue("Key '" + key + "' is missing.", keyUrl.endsWith("'"));
		String keyValue = context.getParam(key);
		assertNotNull("Didn't fetch key '" + key + "' as first value.", keyValue);
		assertTrue("Key '" + key + "' is null.", keyValue.startsWith("\""));
		assertFalse("Key '" + key + "' is missing.", keyValue.startsWith("'"));
}
}