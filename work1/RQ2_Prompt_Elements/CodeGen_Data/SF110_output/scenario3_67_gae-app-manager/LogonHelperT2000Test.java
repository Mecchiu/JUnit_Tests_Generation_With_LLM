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

	/** logon to google app engine function.
	 * @param userid full gmail address for user
	 * @param password password
	 * @param source name of application requesting quota details
	 * @throws Exception if any error occurs executing the {@link LogonController#loginToGoogleAppEngine(String, String, String)} method.
	 */
	@Test
	void loginToGoogleAppEngine() throws Exception {
		String source = "Google App Engine";
		String userid = "user1";
		String password = "passwd1";
		String token = LogicController.loginToGoogleAppEngine(userid, password, source);
		LogicController.deleteLogon(userid, token);
	}
	
	
	/**  Tests Get the URL by the method {@link LogonController#loginToGoogleAppEngine(String, String, String)} method.
	 * 
	 * **************
	 * 
	 * @throws Exception if any error occurs.
	 */
	@Test
	void getURL()  throws Exception {
		String userid = "user1";
		String password = "passwd1";
		String token = LogicController.loginToGoogleAppEngine(userid, password);
		String url = LogicController.getUrlByLogon(userid, token);
		assertTrue(url!= null);
	}
		
	@Test
	void postForm() throws Exception {
		String postForm = "{\"user\":{\"email\":\"test@example.com\"},\"password\":\"user2\"}";
		List<NameValuePair> postFormParams = new ArrayList<NameValuePair>();
		postFormParams.add(new BasicNameValuePair("user", "user1"));
		postFormParams.add(new BasicNameValuePair("password", "user2"));
		assertNotNull(LogicController.postForm(postForm, postFormParams));
	}
	
	
	/**
	 * Tests the URL of the method {@link #PostLogon(String, String, String)} that
	 * is given in a logon to Google AppEngine request
	 * by the client.
	 * 
	 * @throws Exception if any error occurs.
	 */
	@Test
	void testPostLogonByGmailApp() throws Exception {
		String userid = "user1";
		String password = "passwd1";
		LogonController.loginToGoogleAppEngine(userid, password);
	}
	
	/**
	 * Tests {@link #PostLogon(String, String, String) PostLogon} that
	 * is given in a logon to Google AppEngine request.
	 *
	 * @throws Exception if any error occurs.
	 */
	@Test
	void testPostLogonByGmail() throws Exception {
		String userid = "user1";
		String password = "passwd1";
		LogonController.loginToGoogleAppEngine(userid, password);
	}

	public static String loginToGoogleAppEngine(String userid, String password) throws Exception {
		String uriString = "http://www.google.com";
		return loginToGoogleAppEngine(userid, password, uriString);
	}
	
}
