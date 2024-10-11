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
		
	/**
	 * Asserts that result is {@link HTTP#SC_OK}.
	 * Then, the result of
	 * {@link LogonHelper#loginToGoogleAppEngine(String, String, String)}  method is {@link HTTP#SC_OK}.
	 * @throws Exception any error occur during test case
	 **/
	@Test
	void assertionPass() throws Exception {
		String source = "testapp";
		String token = LogonHelper.loginToGoogleAppEngine("someuser@google.com", "pass", "testapp");
		HttpResponse response = getResponse(source, token);
		assertEquals("OK", response.getStatusLine().getStatusCode());
	}
	
}
//LogonHelperTest.java