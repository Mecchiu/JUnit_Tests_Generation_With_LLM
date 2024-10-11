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
    public void testLoginToGoogleAppEngine() {
		System.out.println("=== logon google test");
		String userid = "your user";
		String password = "pass";
		InputStream input = this.getClass().getClassLoader().getResourceAsStream("google.properties");
		
		String response = this.loginToGoogleAppEngine(userid, password, "google");
		assertNotNull(response);
		assertEquals(userid, response.split("\n")[0]);
		assertEquals(password, response.split("\n")[1]);
		assertTrue(input!= null);
	}
	
	@Test
    public void testLoginToGoogleAppEngineNoPassword() {
		System.out.println("=== logon google test");
		String userid = "your user";
		InputStream input = this.getClass().getClassLoader().getResourceAsStream("google.properties");
		
		String response = this.loginToGoogleAppEngine(userid, null, "google");
		assertTrue(input!= null);
		assertEquals(userid, response);
	}
	
	@Test
    public void testLoginToGoogleAppEngineInvalidUserData() {
		System.out.println("=== logon google test");
		String invalidUserdata = "cacaca";
		InputStream input = this.getClass().getClassLoader().getResourceAsStream("google.properties");
		String response = this.loginToGoogleAppEngine(invalidUserdata, "bad user", "google");
		assertTrue(input!= null);
		assertEquals(userid, response);
	}
	
	@Test
	void testLoginToGoogleAppEngineNotLoggedIn() throws Exception {
		TestResult testResult = new TestResult();

		TestLoginResponse testLoginResponse = testResult.loginToGoogleAppEngine("user",
				"pass",
				"google");

		assertNotNull(testLoginResponse);
		assertFalse(testLoginResponse.isGoogleLoggedIn());
		assertNull("No error occurred, logged in as user", testLoginResponse.getLoginErrorInfo());
		
		testResult.assertTestResultNotMigrated();
		
		testLoginResponse = testResult.loginToGoogleAppEngine("guid", "pass", "google");
		assertTrue(testLoginResponse.isGoogleLoggedIn());
		assertNotNull(testLoginResponse.getLoginErrorInfo());
		assertEquals(LoginCheckResponse.RESULT, testLoginResponse.getLoginErrorInfo().getResult());

		testResult.assertTestResultNotMigrated();
	}
	
	/**
	 * Tests the result of logging in with invalid credentials in case of invalid source.
	 *
	 * @throws Exception
	 *             if any error occurs creating Google App engine credentials
	 */
	@Test
	public void testLoginWithInvalidSource() throws Exception {
		System.out.println("=== logon google test");
		InputStream input = this.getClass().getClassLoader().getResourceAsStream("google.properties");

		String responseString = this.loginToGoogleAppEngine("user", "pass", "google");
		BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		String line = null;
		List<HttpNameValuePair> formAuthHeader = new ArrayList<HttpNameValuePair>();

		while ((line = reader.readLine())!= null) {
			formAuthHeader.add(BasicNameValuePair.valueOf("AUTH_CREDENTIALS", line));
		}
		HttpGet authRequest = new HttpGet(new URL("https://apps.google.com/appengine/secureconnect/token"));
		authRequest.setHeader(HTTP.CONTENT_TYPE, "application/x-www-form-urlencoded");

		DefaultHttpClient client = new DefaultHttpClient();
		HttpResponse response = client.execute(authRequest);
		try (LineNumberReader reader = new LineNumberReader(new InputStreamReader(response.getEntity().getContent()))) {
			String firstLine = reader.readLine();
			StringBuffer secondLine = new StringBuffer();
			
			// line[0] = email
			// line[1] = userid
			// line[2] = google userid
			// line[3] = password

			while ((firstLine = reader.readLine())!= null) {
				String split[] = firstLine.split(" ");
                assertTrue(firstLine.startsWith("AUTH_CREDENTIALS="));
				if (split[2].equals("guid")) {
	                firstLine = split[4];
	        	} else if (split[2].equals("GEMAIN_EMAIL")) {
	        		firstLine = split[4];
	        	} else if (split[2].equals("GEMAIN_GUSERID")) {
	        		firstLine = split[4];
	        	} else {
	        		firstLine = split[0];
	        	}
				secondLine.append(firstLine + "\n");
			}
			if (secondLine.toString().equals("ERROR")) {
				throw new RuntimeException("Invalid username/password", reader.readLine());
			}
			formAuthHeader.add(new BasicNameValuePair("AUTH_CREDENTIALS", secondLine.toString()));
		}
		HttpPost request = new HttpPost("https://apps.google.com/appengine/secureconnect/login");
}
}