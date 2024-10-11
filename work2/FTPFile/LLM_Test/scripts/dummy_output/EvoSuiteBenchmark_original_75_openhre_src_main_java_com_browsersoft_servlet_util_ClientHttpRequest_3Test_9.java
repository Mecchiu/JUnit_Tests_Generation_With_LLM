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
		 * it calls post() for the test object passed
		 */
	@Test
	void postTest() throws Exception {

		{
			FileInputStream input = null;
			try {
				ClientHttpRequest.post(new Map(), new Map());
			} catch(Exception e) {
				e.printStackTrace();
				fail(e.getMessage());
			}
		}

		{
			Map cookies = new HashMap();
			cookies.put("cookies", new HashMap());
			ClientHttpRequest.post(cookies, null);
			System.out.println(cookies);

			FileInputStream input = new FileInputStream("cookies.txt");
			new Random().nextBytes(input.getChannel().size());
			input.getChannel().flip();
			Object inputObject = Object.class.newInstance();
			input.readLine();
			input.close();
			ClientHttpRequest.post(inputObject, null);

			inputObject.writeLine("abc");
			inputObject.writeLine("xyz");
			inputObject.writeLine("ABC");

			inputObject.writeLine("123");
			inputObject.writeLine("34");
			inputObject.writeLine("5678");
			inputObject.writeLine("defghij");
			inputObject.writeLine("klmnop");
		}

		{
			Map parameters = null;
			parameters = new HashMap();
			parameters.put("param1", new HashMap());
			parameters.put("param2", new HashMap());
			parameters.put(new Integer(42).toString(), new HashMap());
			parameters.put(new Integer(777).toString(), new HashMap());

			ClientHttpRequest.post(parameters, null);

			parameters.put("param1", new HashMap());
			parameters.put("param2", new HashMap());
			parameters.put(new Integer(42).toString(), new HashMap());
			parameters.put(new Integer(777).toString(), new HashMap());
		}
		{
			FileOutputStream output = null;
			output = new FileOutputStream("parameters.txt");
			new Random().nextBytes(output.getChannel().size());
			output.getChannel().flip();
			HashMap parameters = new HashMap();
			Object outputObject = new HashMap();
			parameters.put("param1", new HashMap());
			output.writeObject(outputObject);
			parameters.put("param2", new HashMap());
			output.writeObject(outputObject);

			output.writeObject("");
			HashMap.putAll(parameters, new HashMap());
			output.writeObject(outputObject);

			output.writeObject("");
			HashMap.putAll(parameters, new HashMap());
			output.writeObject(outputObject);

			output.writeObject("");
			HashMap.putAll(parameters, new HashMap());
			output.writeObject(outputObject);

			output.writeObject("");
			HashMap.putAll(parameters, new HashMap());
			output.writeObject(outputObject);

			output.writeObject("");
			HashMap.putAll(parameters, new HashMap());
			output.writeObject(outputObject);
			parameters.close();
			output.close();
		}

		try {
			// System.out.println("post.post()");
			assert_fails(ClientHttpRequest.post(new HashMap(), new HashMap()));
		} catch(Exception e) {
			// System.out.println("post.post() throws: " + e.getMessage());
			e.printStackTrace();
			assert_fails(ClientHttpRequest.post(new Map(), new HashMap()));
		}

		try {
			// System.out.println("post_by_params.post()");
			assert_fails(ClientHttpRequest.post(new HashMap_by_params(new HashMap()), new HashMap()));
		} catch(Exception e) {
			// System.out.println("post_by_params.post() throws: " + e.getMessage());
			e.printStackTrace();
			assert_fails(ClientHttpRequest.post(new Map_by_params(new HashMap()), new HashMap()));
		}
}

/**
 * setParameter() function is used by test classes.
 *
 */
class Map {
		private final Map _parameters;
		private final Map _cookies;

		/**
		 * Initializes this map object with parameters:
		 *
		 * @param parameters map of parameters
		 */
		public Map(Map parameters) {
			_parameters = new HashMap(parameters);
			_cookies = new HashMap();
		}

		private Map _copyAndSetCookies(Map cookies) {
			Map _cookies = new HashMap();
			Object value;
			Iterator it = cookies.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry entry = (Map.Entry) it.next();
				value = entry.getValue();
				_cookies.put(entry.getKey(), value);
			}
			return _cookies;
		}

		/**
		 * add a cookie to this map
		 * @param param key of the parameter to be included in the URL
		 * @param value of the parameter to be included in the URL
		 */
		public Map put(String param, Object value) {
			_parameters.put(param, value);
			return this;
		}

		/**
		 * Sets the cookie to this map
		 * @param cookies map of cookies
		 */
		public Map putCookie(Map cookies) {
			_cookies = _copyAndSetCookies(cookies);
			return this;
		}

		/**
		 * add a cookie to this map
		 * @param cookies map of cookies
		 */
		public Map putCookie(Map cookies, String cookieName) {
			_cookies.putName(cookieName.toLowerCase());
			_cookies.put(cookieName, cookies);
			return this;
		}

		/**
		 * get the parameters as Map of Map, which contains the parameters
		 *
		 * @return the parameter map with all values in it
		 */
		public Map getParameters() {
			return _parameters;
		}

}
}