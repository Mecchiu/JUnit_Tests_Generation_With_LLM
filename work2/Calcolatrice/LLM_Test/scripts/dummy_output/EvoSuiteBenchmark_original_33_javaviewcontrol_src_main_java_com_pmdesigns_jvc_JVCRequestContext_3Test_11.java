// JVCRequestContext_3Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getAttribute(String)} method.
*/
class JVCRequestContext_3Test {
		/**
		* Sets up before each test method.
		*/
        private File directory, uploadDirectory;

        /**
		* Constructs a new JVCRequestContext object.
		*/
		public JVCRequestContext_3Test() throws IOException {
			directory = File.createTempFile("context", "properties");
			uploadDirectory = File.createTempFile("upload", "properties");
		}

        /**
		* Test method.
		*/
		@Test
        public void testAttribut_FileUploadRequest() {
			File file = new File("temp").getAbsoluteFile();

			// Test case.
			JVCRequestContext.getAttribute(file.getPath());
			assertTrue(file.length() > 0);
		}

		/**
		* Test method.
		*/
		@Test
        public void testAttribut_ServletRequest() {
			JVCRequestContext.getAttribute(new ServletRequest((HttpServletRequest)null));

			FileUploadFields theFields = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(null);
			assertTrue(theFields.getSize() > 0);

			// Test case.
			String tempKey = (String) theFields.getFieldByName("file.path").getValue();
			assertNotNull(tempKey);
			assertTrue(tempKey.length() > 0);

			String tempDescription = (String) theFields.getFieldByName("javax.servlet.description")
           .getValue();
			assertNotNull(tempDescription);

			// Test case.
			// Upload directory has to exist
			File uploadDirectory = new File(uploadDirectory.getAbsolutePath() + File.separator + "upload");
			assertTrue(uploadDirectory.exists());
			assertTrue(uploadDirectory.isDirectory());


			// Test case.
			// test case.
		}

		/**
		* Test method.
		*/
		@Test
		public void testAttribut_ServletResponse() {
			JVCRequestContext.getAttribute((HttpServletResponse)null);

			// Test case.
			HttpServletResponse response = new HttpServletResponse();
			assertNotNull(response);
			assertTrue(String.class.isAssignableFrom(response.getClass()));
		}

        /**
		* Test case.
		*/
        @Test
        public void testAttribut_JavascriptRequest() {
			try {
				Thread.sleep(10);
			} catch (InterruptedException ex) {

			}
			String aString;
			// Get attribute from JVM and test 
			// it works.
			aString = "aVar";

			{
				assertEquals(aString, "Hello World");
			}

			{
				try {
					Thread.sleep(10);
				} catch (InterruptedException ex) {

				}
			}
		}

        /**
		* Test case.
		*/
        @Test
        public void testAttribut_BlockedRequest() {
			// Make a blocking request in a thread pool.
			Thread pool = new Thread(() -> {
				try {
					HttpURLConnection urlconv = new HttpURLConnection(new URL(
							"http://localhost:10/redirect/test"), false);
					urlconv.setConnectTimeout(5);
					urlconv.setReadTimeout(5);

					final Set<String> keys = new HashSet<String>();
					final Map<String, String> params = new HashMap<String, String>();
					params.put("jvcs", "context=http://localhost:10/jvc");

					final InputStreamWriter writer = new InputStreamWriter(urlconv, true);

					ThreadPoolRequest testRequest = new ThreadPoolRequest(params, writer,
							new ResponseListener<byte[]>() {
								public void onCompleted(byte[] response) {
									System.out.println("Response: " + response.length + " bytes");
								}

								public void onResponseCode(Integer responseCode) {
								}
								public void onError(Exception exception) {
									System.out.println("Error: " + exception);
								}
							}, new BasicResponseErrorListener() {
								public void onErrorResponse(VolleyError error) {
								}
							});

					pool.start();
					try {
						urlconv.addRequestInterceptor(testRequest);
					} catch (IllegalStateException e) {

					}
					urlconv.disconnect();
					pool.interrupt();
				} catch (Exception e) {

					// TODO Auto-generated catch block
					e.printStackTrace();
				}



			});

			// Start a blocking server
			pool.start();

			// Waiting for the test thread to get something from the pool
			pool.join();

			// Make the thread return with a success
			pool.interrupt();
			// The pool should have been shutdown
			assertEquals(pool.getState(), Thread.State.TERMINATED);
		}

		/**
		 * Returns a byte array containing the file from the upload directory.
		 * The actual content depends on the request type.
		 * @return the byte array
		 * @throws IOException
		 */
		public byte[] getContent() throws IOException {
			InputStream is = new FileInputStream("/jvc/jvc.txt");
			byte[] buffer = new byte[64];
			ReadableByteChannel readChannel = Channels.newChannel(is);
			int bytes = readChannel.read(buffer);
			return bytes > 0? buffer : null;
		}



















}