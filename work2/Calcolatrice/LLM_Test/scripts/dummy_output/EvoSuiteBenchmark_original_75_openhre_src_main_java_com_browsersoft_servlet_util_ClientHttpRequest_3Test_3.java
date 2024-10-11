// ClientHttpRequest_3Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(Map, Map)} method.
*/
class ClientHttpRequest_3Test {
		/**
		* this test validates the parameters of the {@link ClientHttpRequest#post(Map, Map)} method
		*
		* @throws IOException
		*/
	@Test
	public void testPost() throws IOException {

			ClientHttpRequest request = null;
			try {
				request = new ClientHttpRequest();
				try {
					request.post("1p1", "test");
					fail("Should throw No response.");
				} catch (IOException e) {
					assertEquals("Could not send request.", e.getMessage());
				}
			} catch (Exception e) {
				fail("Failed to send HTTP POST request with: ", e);
			}
		}

		/**
		* test the following parameters to send POST http request with values as
		* values of the file parameter.
		*
		* for the map {1p1,"test"};
		*
		* @throws IOException
		*/
	@Test
	public void testPostWithFile() throws IOException {

			ClientHttpRequest request = null;
			try {
				request = new ClientHttpRequest();

				try {
					request.post("1p1", "test", "1p1", "1p1", new File("test.jpg"));
					fail("Should throw No response.");
				} catch (IOException e) {
					assertEquals("Could not send request.", e.getMessage());
				}
			} catch (Exception e) {
				fail("Failed to send HTTP POST request with values : ", e);
			}
		}

		/**
		* test POST http request with file.
		*
		* for the map {1p1,"test"};
		* for the map {1p1,"test"};
		*
		* @throws IOException
		*/
	@Test
	public void testPostWithFileAndMap() throws IOException {

			ClientHttpRequest request = null;
			try {
				request = new ClientHttpRequest();

				try {
					request.post("1p1", "test", "1p1", "1p1", new File("test.jpg"),
							"1p1", "1p1", new HashMap());
					fail("Should throw No response.");
				} catch (IOException e) {
					assertEquals("Could not send request.", e.getMessage());
				}
			} catch (Exception e) {
				fail("Failed to send HTTP POST request with values : ", e);
			}
		}
}
