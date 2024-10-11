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
		/**
		 * Constructs a new instance of ClientHttpRequest.
		 *
		 * @param parameters a map of cookie and parameters to be added to the request
		 */
		public ClientHttpRequest_1Test(Map parameters) {
			if (parameters == null) {
				throw new IllegalArgumentException("parameters == null");
			}
			this.parameters = new HashMap(parameters);
		}

		/**
		 * Adds some parameters to a form as cookies.
		 * Adds a random parameter value (if any) (if any)
		 *
		 * @param cookie Cookie name
		 * @param parameter the value
		 * @return true if no parameter found, false otherwise
		 * @throws IOException
		 */
		public boolean addParameter(String cookie, String parameter) throws IOException {
			parameters.put(cookie, parameter);
			return true;
		}

		/**
		 * Adds a parameter of key and value as url parameter.
		 *
		 * @param key Key
		 * @param value Value
		 * @return true if a parameter named key existed, false otherwise
		 * @throws IOException
		 */
		public boolean addParameter(String key, String value) throws IOException {
			return parameters.containsKey(key) && parameters.get(key)!= null &&
					(value == null || value.length() > 0?
							parameters.get(key) + "=" + value :
							parameters.get(key) == null || value == null || value.length() == 0? parameters.get(key) + "=" + value : 
												parameters.get(key) + "=" + value);
		}

		/**
		 * Checks if there is a cookie named name.
		 *
		 * @param name The name
		 * @return true if the cookie is found and non-empty, false otherwise
		 * @throws IOException
		 */
		public boolean containsParameter(String name) throws IOException {
			return parameters.get(name)!= null && parameters.get(name).length() > 0;
		}

		/**
		 * Sends the request with the parameters as HTTP headers.
		 *
		 * @param url the URL that contains the parameters as query string
		 * @return HTTP request
		 * @throws IOException
		 */
		public ClientHttpRequest sendMethod(String url) throws IOException {
			URLConnection object;
			object = new URL(url).openConnection();
			return new ClientHttpRequest(url, parameters);
		}

		/**
		 * Send a request with the parameters as query string.
		 *
		 * @param url the URL to send the request to
		 * @param parameters the request parameters
		 * @return HTTP request
		 * @throws IOException
		 */
		public ClientHttpRequest sendRequest(String url, Map parameters) throws IOException {
			URLConnection object = new URL(url).openConnection();
			return new ClientHttpRequest(url, parameters);
		}

		private final Map parameters;
	}