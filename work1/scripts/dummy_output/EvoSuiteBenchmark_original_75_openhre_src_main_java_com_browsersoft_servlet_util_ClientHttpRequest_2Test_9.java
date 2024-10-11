// ClientHttpRequest_2Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(Object[])} method.
*/
class ClientHttpRequest_2Test {
		private final ClientHttpRequest request;
		private final Random randomNumber;
		private final long duration;
		private final int timeoutThreadCount;
		private final int maxBodySize;
		/**
		 * Create a new test object.
		 * @param request contains the parameters and cookies that are added before
		 * @param connectionConnection connection used to send the body
		 * @param randomNumber generator of test threads
		 * @param timeoutThreadcount number of test threads
		 * @param maxBodySize maximum number of bytes received
		 */
		public ClientHttpRequest_2Test(ClientHttpRequest request, URLConnection connectionConnection, Random randomNumber, long duration){
			this.request = request;
			this.randomNumber = randomNumber;
			this.duration = duration;
			this.timeoutThreadCount = randomNumber.nextInt(5);
			this.maxBodySize = (int) (request.maxBodySize / (this.randomNumber.nextDouble() * (Math.pow(2, request.maxBodySize))));
		}
		/**
		 * This test just tests that the request contains all the parameters that are added before in the {@link ClientHttpRequest#post(Object[])} method.
		 */
		@Test
		public void createTestRequest(){
			assertEquals(request.getPath(), Utils.createTestPath("HelloWorld", randomNumber.nextInt() % 1));
			assertArrayEquals(request.getParameters(), Utils.getTestParameters());
			assertArrayEquals(request.getCookies(), Utils.getTestCookies());
			assertArrayEquals(request.getHeaders(), Utils.getTestHeaders());
		}
		/**
		 * The test method creates the request with a non zero maximum body size, the request returns a file which has the size greater
		 * than the maximum body size and it then sends the body using a new {@link ClientHttpRequest} which contains the body of the file
		 */
		@Test
		public void createFile(){
			Map<String, String> requestFields = new HashMap<>(1);
			requestFields.put("body", "Hello World");
			request.setHeader("Content-type", "application/pdf");
			request.setHeader("Accept", "application/pdf, application/x-shockwave-flash");
			String requestPath = "/" + urlFor(requestFields);
			assertTrue(request.equals
					(ClientHttpRequest.newBuilder().setPath(urlFor(requestFields)).setMethod("POST", "/")
							.setBody("Hello World").setParameters(requestFields)).body() instanceof File);
			ByteArrayOutputStream fos = new NullOutputStream();
			outputStream(request.getBody(), fos);
			assertThat(fos.getStream(), notNullValue());
			OutputStream outStream = fos.getOutputStream();
			File file = new File("/tmp/" + request.getBody() + ".log");
			setLogFileAndPrint(outStream, file);
			request.post(requestFields);
			assertElementsEqual(requestFields, ((ClientHttpRequest.Builder)request).post(requestFields));
			assertElementsEqual(requestFields, ((ClientHttpRequest.Builder)request).getHeaders());
			assertThat(file, not(isSameAs(fos.getFile()))); 

		}
		/**
		 * The test method creates the test request using the {@link ClientHttpRequest#post(Object[])} method.
		 * @param parameters request parameters
		 */
		@Test
		public void createFromFieldsParameters(Object[] parameters){
			Map<String, String> requestFields = new HashMap<>(parameters.length);
			for (int i = 0; i < parameters.length; i++) {
				requestFields.put(parameters[i].toString(), parameters[i].toString());
			}
			request.setParameters(requestFields);
			assertEquals(request.getPath(), Utils.createTestPath("HelloWorld", randomNumber.nextInt() % 1));
			assertArrayEquals(request.getParameters(), Utils.getTestParameters());
			assertEquals(request.getBody(), "Hello World");
		}
		/**
		 * The test method creates the test request using the {@link ClientHttpRequest#post(Object[])} method with parameters.
		 * @param parameters request parameters
		 * @param isFile if the argument is a file (has content type), the mock object will get the file content as input stream
		 */
		@Test
		public void createFromFieldsParametersParametersFile(Object[] parameters, File isFile){
			Map<String, String> requestFields = new HashMap<>(parameters.length);
			requestFields.put("body", "Hello World");
			if (isFile!= null) {
				request.setParameters(FileUtils.getReadableBodyAsStream(new NullOutputStream().getStream()));
				request.setBody(isFile.getName());
			} else {
				request.setParameters(requestFields);
				assertEquals(request.getPath(), Utils.createTestPath("HelloWorld", randomNumber.nextInt() % 1));
				assertEquals(request.getParameters(), Utils.getTestParameters());
				assertNull(request.getBody());
			}
			assertEquals(request.getBody(), "Hello World");
			assertTrue(isFile.exists());
			request.post(requestFields);
		}
		
		/**
		 * The test method builds the request with parameters based on the the test request fields added before it.
		 * @param isFile if the parameter is a file (has content type), the mock object will get the file content as input stream
		 * @param parameters contains the parameters that are added before
		 * @param isWriter if inputStream is outputstream
		 */
		@Test
		public void createFromFieldsWithSameParametersAndContentType(File isFile, Object fields, boolean isWriter){
			
			assertEquals(request.getPath(), urlFor(fields));
			assertEquals(request.getHttpMethod(), "POST");
			assertEquals(request.getBody(), "Hello World");
			assertEquals(request.getParameters(), FileUtils.toMap(fields)).size();
			assertEquals(request.getHeaders(),
					Utils.getTestHeaders(request.getParameters()));
			String requestPath = "/" + urlFor(new HashMap<>(request.getParameters()));
}
}