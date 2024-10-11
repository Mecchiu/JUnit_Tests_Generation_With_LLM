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
	 * This class provides test cases for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It is a list of test methods where we define some cases for the logon test.
	 */
	private static final List<LogonTestCase> TEST_CASES = new ArrayList<LogonTestCase>();
	/**
	 * This class provides test cases for the {@link LogonHelper#logonToGoogleAppEngine(String, String, String)} method.
	* It is a list of test cases where we define several cases for the logon test.
	 */
	private static final List<LogonTestCase> LOGON_TESTS = new ArrayList<LogonTestCase>();
	static {
		TEST_CASES.add(new LogonTestCase("TEST_LOGON"));
		LOGON_TESTS.add(new LogonTestCase("TEST_LOGON", "TEST_SRCNAME"));
	}
	static int i = 1;

	/**
	 * This class provides test cases for the {@link LogonHelper#logonToGoogleAppEngine(String, String, String)} method.
	* It is a test case for the case where we know the parameters passed to the method.
	*/
	@Test
	void testCase1() throws Exception {
	//	logonHelper.setLogonParameters();
	}

	/**
	 * This class provides test cases for the {@link LogonHelper#logonToGoogleAppEngine(String, String, String)} method.
	* It is a test case for the case where the user is not verified.
	*/
	@Test
	void testCase() throws Exception {
		try {
			HttpGet httpGet = new HttpGet("http://auth.google.com/accounts/o/feed?format=xml&id=me");
			httpGet.setHeader("Accept", "application/xml");
			//Get username and password again
			//Because we don't use some value to specify the
			//AuthToken object we need to reset it
			BasicNameValuePair usernamePasswordPair = new BasicNameValuePair("Username",
					"test");
			HttpPost httpPost = new HttpPost(
					"http://auth.google.com/accounts/o/feed");
			httpPost.setEntity(new UrlEncodedFormEntity(
					new NameValuePair[] { usernamePasswordPair }));
			httpGet = new HttpGet("https://www.google.com");
			//If authentication is successful, HTTP Post should return a 200
			HttpClient client = new DefaultHttpClient();
			HttpResponse response = client.execute(httpGet);
			assertEquals(respon.getStatusLine().getStatusCode(), 200);
			Cookie[] cookies = respon.getCookies();
			assertNull(cookies);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	private static class LogonTestCase {
		private String source;
		private String logonParameters;
		private List<NameValuePair> nameValuePairs;

		private String getSource() {
			return source;
		}

		private String getLogonParameters() {
			return logonParameters;
		}

		private String getNameValuePairs() {
			if (nameValuePairs == null) {
				nameValuePairs = new ArrayList<NameValuePair>();
			}
			return nameValuePairs.toString();
		}

		private LogonTestCase(String source, String logonParameters, String listOfParams) {
			this.source = source;
			this.logonParameters = logonParameters;
			this.nameValuePairs = new ArrayList<NameValuePair>();
			this.nameValuePairs.add(new BasicNameValuePair("source", source));
			if(listOfParams!= null && listOfParams.length() > 0) {
				for(String param : listOfParams.split(";"))
					this.nameValuePairs.add(new BasicNameValuePair(param, parameter(param)));
			}
		}

		public String logonToGoogleAppEngine(String userid, String pwd,
				String sogAuthToken) throws Exception {
			BasicNameValuePair usernamePasswordPair = new BasicNameValuePair("Username",
					userid);
			BasicNameValuePair pwdBytes = new BasicNameValuePair("Passwd", pwd);
			BasicNameValuePair oAuthToken = new BasicNameValuePair(
					logonParameters, sogAuthToken);
			BasicNameValuePair nameValuePairList = new BasicNameValuePair("Auth_Token",
					oAuthToken);

			// We dont' need any query param for this test (the nameValuePairs in the post is enough)
			HttpPost httpPost = new HttpPost("http://auth.google.com/accounts/oauth2/token");
			httpPost.setEntity(new UrlEncodedFormEntity(
					new NameValuePair[] { usernamePasswordPair, nameValuePairList }));
			HttpResponse response = httpPost.execute();
			final int httpStatus = response.getStatusLine().getStatusCode();
			if ((int) httpStatus == 200) {
				assertEquals(httpStatus, 201, httpStatus);
				return httpPost.getURI().getEncodedPath();
			}
			return "";
		}
}
}