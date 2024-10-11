// LogonHelperTest.java
package net.sf.gaeappmanager.google;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LogonHelper}.
* It contains one unit test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
*/
class LogonHelperTest {
		@Test
		void testAuthToken() throws Exception {
			// InputStream inputStream = new URL("http", "www.google.com", 80, "login.google.com?app_name=google_appmanager+google+service", null, null).openStream();
			// try (InputStream is = inputStream) {
				// int length
				// = 0;
				// InputStream inputStream = is;
				// while (length == 0) {
					// length = inputStream.read();
				// }
			// }
			// else {
				// throw new Exception("Test failed 1");
			// }

			// InputStream inputStream = new URL("http", "www.google.com", 80, "login.google.com?app_name=google_appmanager+google+service", null, null).openStream();
			// try (InputStream is = inputStream) {
				// int length
				// = 0;
				// InputStream inputStream = is;
				// while (length == 0) {
					// length = inputStream.read();
				// }
			// }
			// else {
				// throw new Exception("Test failed 2");
			// }
			// System.out.println("AUTH: "+ new String(new byte[length], HTTP.UTF_8));
			// final String authToken = new String(new byte[length], HTTP.UTF_8);
			// final String code = "eyJhbGciOiJIUzI1NiIsImtpZCI6IkpMCU1MjM0MTQ1MTgzNjA0NTNiMjQzOLFRmVmVyZW50ZXJlcjEiLCJjcmwvWmh0ZXJuZXJ0OmRlbWUiLCJhY2lvbmluZy5nb24nIiwiZXhwIjoxMjM2NTIuYzoxMzU4MjI3MzUjMDE4OGI0MmwM2IxMjQxMDE3OGJhZjElODU4NDIzIiwiZXhhbXBsZS9kbyVjbGllbSIsInR5dCI6ID0uMjQ2NjU2MWk5MDk0Mzg0MDVhZDU1NjQ2YzR0Mzg0MDY4ODIyZmVlZDQ1ZjVTM0ODQyMzM2ZTU4NDkyMzU4OGIxZTU4NDQmODQwQ1NmZmODQwMFkZTU4MDAyZTFkODEYjNjJmMTM4MDAwMDY1OTU4MDE1MTQ0ZDU1ZTU1NjU1MzUwMDUyZDE3NTQwNTFkOTF1ZTF0MjVkMDE4MDE3MDJkNDZlM2MjM5MjUyNTl2NjMzM4MDEyMkNjMzMzMiMTFxZTBmZjVkNjMiMSAwNTJkZTM2MzQ1MDI4MDE0NDJkZTUhMDEwMjM0MFowb3B0ZS4KQ1M2MzIzZTU2NjV1ZTU1NzQyMDEyMzI1NTI5MDY0MDE2MjFmODQ2MDE0MjM0NDQ3MjIwODIyMDAwMTMwMWJhZjEcNCJhlIiwicGF0MzEjNzMwMjM0MWQwMTEsMTI5OTExZDAyMzI4MDE3MjVkNTBhb3EiMTc2OTIyMDA1MTA4OTI3MzU4"
}
}