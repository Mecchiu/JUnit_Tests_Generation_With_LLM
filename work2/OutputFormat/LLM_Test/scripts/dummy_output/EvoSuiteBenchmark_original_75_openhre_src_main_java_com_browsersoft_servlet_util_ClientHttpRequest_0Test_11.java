// ClientHttpRequest_0Test.java
package com.browsersoft.servlet.util;

import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.InputStream;
import java.util.Random;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientHttpRequest}.
* It contains one unit test case for the {@link ClientHttpRequest#post()} method.
*/
class ClientHttpRequest_0Test {
		
	/**
	 * Test case where the request content is uploaded,
	 * including the cookies and parameters that were added
	 *
	 * @throws IOException
	 */
	@Test
	void test0001_POSTPOSTRequestUpload() throws IOException {
		final ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		
		// Post the requests
		final InputStream content = clientHttpRequest.post();
        assertNotNull(content);
		
        // Get the response
        final OutputStream responseStream = clientHttpRequest.getOutputStream();
        assertNotNull(responseStream);
    }
	
	/**
    * Test case where the parameters in POST are uploaded,
    * also including the cookies, which are not included with POST.
    * It tests that POST with all the parameters will not return the form field with cookies as content for POST and
    * if any are present in a POST request, they are used as the form content.
    *
    * @throws IOException
    * @throws UnsupportedEncodingException
    */
    @SuppressWarnings("deprecation")
    @Test
    public final void test0101_POSTPostParameters() throws IOException {
        final ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		
		// Upload the form parameters
		Map<String, String> formParameters = new HashMap<>();
		clientHttpRequest.setFormParameters(formParameters);
		
		// Post the requests
		final InputStream content = clientHttpRequest.post();
        assertNotNull(content);
		
		// Get the response
		final OutputStream responseStream = clientHttpRequest.getOutputStream();
        assertNotNull(responseStream);
    }
	
	/**
    * Test case where the response body has POST parameters,
    * also including the cookies and parameters that were added
    *
    * @throws IOException
    */
    @SuppressWarnings("deprecation")
    @Test
    public final void test0102_POSTPostPostBody() throws IOException {
        final ClientHttpRequest clientHttpRequest = new ClientHttpRequest("", new ContentType());
		
		// Upload the form parameters
		Map<String, String> formParameters = new HashMap<>();
		clientHttpRequest.setFormParameters(formParameters);
		
		// Post the requests
		final InputStream content = clientHttpRequest.post();
        assertNotNull(content);
		assertNotNull(content.markSupported());
		assertTrue(content.mark(0).isEOF());
		
		// Get the response
		final OutputStream responseStream = clientHttpRequest.getOutputStream();
        assertNotNull(responseStream);
        
        // Get the response body
        final String responseBody = clientHttpRequest.getBody();
        assertNotNull(responseBody);
        
        // Assert that server response is as expected
        assertEquals("body", responseBody);
        
        // Assert response and body are equal
        assertEquals(clientHttpRequest.getHeaders().get("Content-Length"), new Long(0).toString());
        assertEquals(clientHttpRequest.getHeaders().containsKey("Content-Type"), false);
        assertEquals(clientHttpRequest.getHeaders().get("Accept").isEmpty(), true);
        assertEquals(clientHttpRequest.getHeaders().containsKey("User-Agent"), false);
        
        // Close resources
        responseStream.close();
        content.close();
        formParameters.clear();
    }
	
	/**
    * Test case where the body includes request content as the first form param (POST)
    * Also included the cookies and parameters that were added
    *
    * @throws IOException
    */
    @SuppressWarnings("deprecation")
    @Test
    public final void test0103_POSTPostPartOfBody() throws IOException {
        final ClientHttpRequest clientHttpRequest = new ClientHttpRequest("", new ContentType());
		
		// Upload the form parameters
		Map<String, String> formParameters = new HashMap<>();
		clientHttpRequest.setFormParameters(formParameters);
		
		// Post the requests
		final InputStream content = clientHttpRequest.post();
        assertNotNull(content);
		
        // Get the response
        final OutputStream responseStream = clientHttpRequest.getOutputStream();
        assertNotNull(responseStream);
		
        // Get the response body
        final String responseBody = clientHttpRequest.getBody();
        assertNotNull(responseBody);
        
        // Assert that server response is as expected
        assertEquals("body", responseBody);
        
        // Assert response and body are equal
        assertEquals(clientHttpRequest.getHeaders().get("Content-Length"), new Long(0).toString());
        assertEquals(clientHttpRequest.getHeaders().get("Content-Type"), new ContentType());
        assertEquals(clientHttpRequest.getHeaders().get("Accept").isEmpty(), true);
        assertEquals(clientHttpRequest.getHeaders().get("User-Agent").contains("Mozilla/4.0"), true);
        
        // Close resources
        responseStream.close();
        content.close();
        formParameters.clear();
    }
	
	/**
    * Test case where the response stream is not yet added to the request
    * Also included the cookies and parameters that were added
    *
    * @throws IOException
    */
    @Test
    public final void test0104_POSTPostStreamAppear() throws IOException {
        final ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		
		// Upload the form parameters
		Map<String, String> formParameters = new HashMap<>();
		clientHttpRequest.setFormParameters(formParameters);
		
		// Post the requests
		final InputStream content = clientHttpRequest.post();
        assertNotNull(content);
		// Get the response
		assertNotNull(clientHttpRequest.getBody());

		// Assert that stream is not added yet
        assertEquals(clientHttpRequest.getHeaders().get("Content-Length"), new Long(0).toString());
    }
}