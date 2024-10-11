// ClientHttpRequest_1Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(Map)} method.
*/
class ClientHttpRequest_1Test {
		// Tested object
	private final ClientHttpRequest clientHttpRequest;
	
	/**
	 * Constructor
	 * @param requestClientHttpRequest a ClientHttpRequest object
	 * @throws ClassNotFoundException thrown from this constructor if the ClientHttpRequest class could not be loaded
	 */
	ClientHttpRequest_1Test(ClientHttpRequest requestClientHttpRequest) throws ClassNotFoundException {
		// create an instance of the ClientHttpRequest object
		String requestUrl = "http://guit.eso.co.uk/servlet/servlet3.0/ServletRequest";
		String requestMethod = "POST";
		String contentType   = "application/x-www-form-urlencoded";
		String postData = "form=post:postName&form=queryParameter:param&form=id&form=method";
		String postFile   = "http://guit.eso.co.uk/servlet/servlet3.0/ServletRequest_1test-FormFile.txt";
		String postFileName = "Form File Name";
		String postFileUpload = "Form File Upload";
		
		// create object of ClientHttpRequest

		// for POST data, set the name of the field we are going to post to and name of paramaters to send
		clientHttpRequest = new ClientHttpRequest();
		clientHttpRequest.setPostFormData(postData);
		clientHttpRequest.setPostUrl(requestUrl);
		clientHttpRequest.setPostMethod(requestMethod);
		clientHttpRequest.setContentType(contentType);
		clientHttpRequest.setPostData(postFile);
		clientHttpRequest.setPostFileName(postFileName);
		clientHttpRequest.setPostFileUpload(postFileUpload);
	}
	
	/**
	 * @return the ClientHttpRequest object itself
	 */
	public ClientHttpRequest getClientHttpRequest() {
		return clientHttpRequest;
	}
	
	/**
	 * Test method for {@link ClientHttpRequest#post(Map)}.
	 * This method tests the {@link ClientHttpRequest#post(Map)} method by
	 * sending the forms in JSON and passing as the parameter, using the request methods, POST, PUT etc.
	 * @throws IOException
	 */
	@Test
	public void testPost() throws IOException {
		// test case 1
		Map requestParameters = new HashMap();
		// set parameters
		requestParameters.put("name", "name1");
		requestParameters.put("param","value1");
		// test case 2
		Map<String, Object> postFormData = new HashMap<>();
		postFormData.put("new_param", requestParameters);
		mapRequestForm(postFormData);
		
		// post using GET method
		clientHttpRequest.post(requestParameters);
		// test case 3
		Iterator<String> postNames = clientHttpRequest.getPostParams().keySet().iterator();

		while(postNames.hasNext()) {
			assertEquals("param", postNames.next());
		}
		assertEquals("id", clientHttpRequest.getPostParams().get("id"));
		assertEquals("method", clientHttpRequest.getPostParams().get("method"));
	}
	
	/**
	 * Test method for {@link ClientHttpRequest#post(Map)} with a POST with form data.
	 * This method tests the {@link ClientHttpRequest#post(Map)} method by
	 * sending the forms in JSON and passing as the parameter, using the request methods, POST, PUT etc.
	 * @throws IOException
	 */
	@Test
	public void testPostWithFormData() throws IOException {
		// test case 1
		Map requestParameters = new HashMap();
		// set parameters
		requestParameters.put("name", "name1");
		requestParameters.put("param", "value1");
		// test case 2
		Map<String, Object> postFormData = null;
		postFormData = new HashMap<>();
		postFormData.put("new_param", requestParameters);
		mapRequestForm(postFormData);
		
		// test case 3
		Iterator<String> postNames = clientHttpRequest.getPostParams().keySet().iterator();
		while(postNames.hasNext()) {
			// TODO implement assertArrayEquals.
			String postParameterKey = postNames.next();
			assertEquals("name", postParameterKey);
			assertEquals("param", clientHttpRequest.getPostParams().get(postParameterKey));
			assertEquals("value1", clientHttpRequest.getPostParams().get("param").toString());
		}
		
		// test case 4
		Iterator<String> postNames = clientHttpRequest.postFiles().keySet().iterator();
}
}