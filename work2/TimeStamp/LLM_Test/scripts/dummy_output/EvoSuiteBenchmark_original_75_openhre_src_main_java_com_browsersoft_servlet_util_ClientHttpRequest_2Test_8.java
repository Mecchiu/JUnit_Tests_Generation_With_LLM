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
		/**
		* post the request with all the cookies and parameters.
		*
		* @throws IOException
		*/
		@Test
		void post() throws IOException {
			int numberOfCookies = getNumberOfCookies();
			Random random = new Random();
			for (int i = 0; i < numberOfCookies; i++) {
				Object name = "name" + i;
				String value = "value of name" + i;
/*
				System.err.println("Cookies:\n\t" + name + ": " + value);
*/
				Map<String, String> parameters = new HashMap<>();
				parameters.put("key_1", name);
				parameters.put("key_2", value);
				post(parameters);
			}
		}

}

/**
* This class contains the functions for all the requests
*/
public class ClientHttpRequest {

	/**
	 * Returns the number of cookies that are added to the server request.
	 *
	 * @return number of cookies
	 * @throws IOException
	 */
	public int getNumberOfCookies() throws IOException {
		// TODO: make something more clever such as this.
		InputStream res = ClientHttpRequest_2Test.this.getClass().getResourceAsStream("/resources/cookie_0.json");
		assertNotNull(res);
		return ClientHttpRequest_2Test.this.getResult(res);
	}

	/**
	 * Get the result of the operation.
	 *
	 * @param res the input stream of the result
	 * @return result of the operation
	 * @throws IOException
	 */
	public int getResult(InputStream res) throws IOException {
		return 0;
	}

	/**
	 * Sends POST http get request.
	 *
	 * @param parameters request parameters
	 * @return response status
	 * @throws IOException
	 */
	public InputStream post(Object[] parameters) throws IOException {
		URLConnection conn = new URL("http://localhost:8082/").openConnection();
		conn.addRequestProperty("Host", "localhost");
		conn.setDoOutput(true);
		for (int i = 0; i < parameters.length; i++) {
			conn.addRequestProperty(parameters[i] + "=" + System.getProperty("key_" + i), parameters[i]);
		}
		conn.connect();
		OutputStream out = conn.getOutputStream();
		out.write("1".getBytes());
		out.flush();
		out.close();
		int responseCode = conn.getResponseCode();
		if (responseCode!= 200) {
			throw new IOException("Server responded with: " + responseCode);
		}
		return new InputStream() {
			@Override
			public int read() throws IOException {
				int n = 0;
				byte[] buffer = new byte[1024];
				try (InputStream in = conn.getInputStream();
				 	  OutputStream out =
					   	   conn.getOutputStream()) {
				while (-1!= (n = in.read(buffer))) {
					out.write(buffer, 0, n);
				}
				}
				return n;
			}
		};
	}

}