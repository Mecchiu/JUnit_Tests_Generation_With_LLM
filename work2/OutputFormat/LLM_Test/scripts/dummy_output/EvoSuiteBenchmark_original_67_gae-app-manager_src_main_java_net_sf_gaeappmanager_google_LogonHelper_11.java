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
		
	// Test cases below this line.
	@Test
	void testLogOnGoogleAppEngine() throws Exception {
        final List<String> logonInputStream = new ArrayList<>();
		logonInputStream.add("user:guid@test.com");
		logonInputStream.add("password:123456777");
		logonInputStream.add("source:googleaccount");

		final DefaultHttpClient httpClient = new DefaultHttpClient();
		final HttpPost post = new HttpPost(getAuthToken(logonInputStream.get(0)));
		post.addHeader("X-User-Id", "");
		post.addHeader("Auth-Type", "Password");
		post.setEntity(new UrlEncodedFormEntity(new BasicNameValuePair("password", "123456777")));

		final Response response = new HttpPost(post).execute();
		assertNotNull(response);

		assertTrue(new ResponseMatcher(response.getStatusLine(), "OK")).matches();

		assertNotNull(response);

		try (final InputStream inputStream = response.getEntity().getContent()) {
            final LineNumberReader reader = new LineNumberReader(
                    new BufferedReader(new InputStreamReader(inputStream)));
            final List<String> receivedInput = readAndParseLogonInput();
			assertTrue(receivedInput.contains("user:guid@test.com"));
			assertTrue(receivedInput.contains("password:123456777"));
		}
	}

	@Test
	void testLogonGoogleAccount() throws Exception {
		final HttpPost post = new HttpPost(getAuthToken(getAuthToken(Http.Context.current(), "User:GUID@test.com", "Password:123456777")));

		final Response response = new HttpPost(post).execute();
		assertNotNull(response);
	}

	@Test
	void testLogoffGoogleAccount() throws Exception {
		final HttpPost post = new HttpPost(getAuthToken(getAuthToken(Http.Context.current(), "User:GUID@test.com", "Password:123")));

		final Response response = new HttpPost(post).execute();
		assertNotNull(response);
	}

	@Test
	void loginToGoogleAppengineReturnsAuthToken() throws Exception {

		final String expected = getAuthToken(Http.Context.current());
//		final String authToken = new LogonHelper().loginToGoogleAppEngine(getAuthId(expected), "123");
		final String authToken = new LogonHelper().loginToGoogleAppEngine(getAuthId("123"), "123");
		assertEquals(expected, authToken);
	}

        // For testing a single request for the 'googleapi' method
        private String getAuthId(final String expected) {
                final String authParam = new LogonHelper().loginToGoogleAppEngine(getAuthId(expected), "123");
                return authParam;
        }

        // For testing a single request for the 'googleapi' method
        private String getAuthId(final InputStream is) {
                final String authParam = new LogonHelper().loginToGoogleAppEngine(getAuthId(InputStream.class), "");
                return authParam;
        }
}