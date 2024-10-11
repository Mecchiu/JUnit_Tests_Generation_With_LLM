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
		 * tests method of {@link ClientHttpRequest}.
		 *
		 * @throws Exception any exception while testing
		 */
		@Test
		void testPost()  throws Exception {
			// setup request parameters
			Map<String, String> parameters = new HashMap<String, String>();

			URLConnection connection = new URL("http://192.0.2.1/").openConnection();
			connection.setRequestProperty("Cookie", "test_cred_"+new Random().nextInt());
			String response = connection.getResponseMessage();
			Iterator it = response.iterator();
			if (it.hasNext()) {
				response = it.next();
				String[] parts = response.split(";");
				if (parts.length == 1) {  // we didn't add any cookie
					parameters.put("name", "value");
			}
				else if (parts.length > 1) {
				}
			}
			connection = connection.getConnection();
			// send request
			for (int i=0; i<5; i++) {
				parameters.put("val", "val_"+i);
			}
			parameters.put("foo", "bar");
			parameters.put("bar", "baz");
			parameters.put("bzz", "1234123");

			// build request url
			String url = "http://localhost:8778/request/cgi/http-bin.cgi";
			URLConnection connection2 = new URL(url).openConnection();
			connection2.setRequestProperty("Cookie", "myCookie");
			String response2 = connection2.getResponseMessage();
			it = response2.iterator();
			if (it.hasNext()) {
				response2 = it.next();
				String[] parts = response2.split(";");
				if (parts.length == 1) {
					// only name param is added, hence we do not want to pass the additional param
					parameters.remove("name");
				}
			}

			// POST to the url
			URL urlWithCookies = new URL(url+"?val=val&baz=baz&bzz=1234123");
			URLConnection connection3 = urlWithCookies.openConnection();

			// Set cookie
			connection3.setRequestProperty("Cookie", "test_cred_42e1b2bd-0ca9-48dd-ae0d-ff2e938ff5f5","cred_test_cred_");
			connection3.setRequestMethod("POST");

			// build the parameters
			Iterator it3 = parameters.entrySet().iterator();
			Map<String, Object> param3 = new HashMap<String, Object>();
			Map<String, Object> cookies = new HashMap<String, Object>();
			parameters.put("name", "value");
			parameters.put("value", "");
			parameters.put("baz", "");
			parameters.put("val", "val");
			while (it3.hasNext()) {
				Map.Entry entry = (Map.Entry)it3.next();
				Object value = entry.getValue();
				String value3 = value==null? "" : (String)value;
				String key3 = (String) entry.getKey();
				cookies.put(key3, value3);
			}
			param3.put("foo", "bar");
			param3.put("bzz", "1234123");
			param3.remove("baz");
			parameters.setProperty("cred_test_cred_", param3);

			// add cookies
			for (Map.Entry<String, Object> entry : cookies.entrySet()) {
				connection3.setRequestProperty(entry.getKey(), entry.getValue().toString());
			}

			// add cookies and add new params
			connection.setRequestProperty("Cookie", "cred_cred_myCookie", "true");
			connection.setRequestProperty("Cookie", "cred_cred_", "true");
			parameters.put("foo", "bar");
			parameters.put("val++bzz", "3456789");

			// add cookies and add new params
			for (Map.Entry<String, Object> entry : cookies.entrySet()) {
				connection3.setRequestProperty(entry.getKey(), entry.getValue().toString());  // add cookie
				connection3.setRequestProperty(entry.getKey(), entry.getValue().toString()+"++bzz", "true"); // add param
			}

			// send request with credentials
			parameters.put("name", "value");
			response = connection3.getResponseMessage();
			it = response.iterator();
			if (it.hasNext()) {
				response = it.next();
				String[] parts = response.split(";");
				if (parts.length == 1) {
					// only name param is added, hence we do not want to pass the additional param
					parameters.remove("name");
				}
			}

			// POST to the url
			urlWithCookies = new URL(url+"?val=val&baz=baz&bzz=1234123");
			connection2 = urlWithCookies.openConnection();

			// Set cookie
			connection2.setRequestProperty("Cookie", "test_cred_42e1b2bd-0ca9-48dd-ae0d-ff2e938ff5f5","cred_cred_test_cred_");
			connection2.setRequestMethod("POST");

			// build the parameters
			param3 = new HashMap<String, Object>();
			parameters.put("name", "value");
			parameters.put("value", "");
			parameters.put("baz", "");
			parameters.put("val", "val");
			while (it3.hasNext()) {
				Map.Entry entry = (Map.Entry)it3.next();
				param3.put((String)entry.getKey(), (String)entry.getValue());
			}
			parameters.setProperty("cred_cred_test_cred_", param3);

			urlWithCookies = new URL(url+"?val="+"val&baz=baz&bzz="+"3456789");
			connection2 = urlWithCookies.openConnection();

			// Set HTTP header and get response
			connection2.setRequestProperty("Http-Method", "POST");
			URLConnection connection4 = urlWithCookies.openConnection();
			OutputStream os = connection4.getOutputStream();
}
}