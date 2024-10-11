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
// LogonHelper.java
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

/**
 * Google login helper.
 *
 * Based on work of Cheers Geoff.
 *
 * http://groups.google.com/group/google-appengine
 * -java/browse_thread/thread/c96d4fff73117e1d?pli=1
 *
 * @author Alois Belaska
 */
public class LogonHelper {

    /**
     * Returns the ACSID string to be set as the Cookie field in the request
     * header.
     *
     * @param userid full gmail address for user
     * @param password password
     * @param source name of application requesting quota details
     * @return the ACSID field value
     * @throws Exception if any error occurs getting the ACSID
     */
    public static String loginToGoogleAppEngine(String userid, String password, String source) throws Exception {
        DefaultHttpClient client = new DefaultHttpClient();
        try {
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            nvps.add(new BasicNameValuePair("accountType", "HOSTED_OR_GOOGLE"));
            nvps.add(new BasicNameValuePair("Email", userid));
            nvps.add(new BasicNameValuePair("Passwd", password));
            nvps.add(new BasicNameValuePair("service", "ah"));
            nvps.add(new BasicNameValuePair("source", source));
            HttpPost post = new HttpPost("https://www.google.com/accounts/ClientLogin");
            post.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
            HttpResponse response = client.execute(post);
            if (response.getStatusLine().getStatusCode()!= 200) {
                throw new Exception("Error obtaining ACSID");
            }
            String authToken = getAuthToken(response.getEntity().getContent());
            post.abort();
            HttpGet get = new HttpGet("https://appengine.google.com/_ah/login?auth=" + authToken);
            response = client.execute(get);
            for (Cookie cookie : client.getCookieStore().getCookies()) {
                if (cookie.getName().startsWith("ACSID")) {
                    return cookie.getValue();
                }
            }
            get.abort();
            throw new Exception("Did not find ACSID cookie");
        } finally {
            client.getConnectionManager().shutdown();
        }
    }
}

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
  void testLoginToGoogleAppElement() throws Exception {
    logon(new LoginRequestBuilder().success("email1@yahoo.com").user("me"));
    assertEquals("email1@yahoo.com", getAuthToken("https://www.google.com/_ah/account/email"));
    assertEquals("me", getAuthToken("https://www.google.com/_ah/account/email"), "Authentication failed for user'me'");  

    // Make sure LoginRequestBuilder doesn't require a user token
    List<NameValuePair> nvps = new ArrayList<NameValuePair>();
    nvps.add(new BasicNameValuePair("accountType", "HOSTED_OR_GOOGLE"));
    HttpPost post = new HttpPost("https://www.google.com/_ah/login");
    post.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));

    try {
      client.execute(post);
    } catch (Exception ex) {
      // We expect the POST to fail
    }    
  }
	
  @Test
  void testLoginToGoogleAppManager() throws Exception {
    List<NameValuePair> nvps = new ArrayList<NameValuePair>();
    nvps.add(new BasicNameValuePair("accountType", "MANAGER"));
    HttpPost post = new HttpPost("https://www.google.com/_ah/login");
    post.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));

    try {
      client.execute(post);
    } catch (Exception ex) {
      // We expect the POST to fail
    }    

    // Make sure LoginRequestBuilder doesn't require a user token
    nvps = new ArrayList<NameValuePair>();
    nvps.add(new BasicNameValuePair("accountType", "HOSTED_OR_GOOGLE"));
    nvps.add(new BasicNameValuePair("Email", "test@mail.com"));
    post = new HttpPost("https://www.google.com/_ah/login");
    post.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));

    try {
      client.execute(post);
    } catch (Exception ex) {
      // We expect the POST to fail
    }
  }
    
  /**
   * A utility method for logging in to Google via HttpGet.
   *
   * @param post HTTP POST object
   */
  private static void logon(HttpPost post) throws Exception {
    List<NameValuePair> nvps = new ArrayList<NameValuePair>();
    List<String> values = new ArrayList<String>();
    for (String rv : getAuthTokenValues()) {
      ValuesPair value = new ValuesPair();
      values.add(rv);
      ArrayList<String> pv = new ArrayList<String>();
      pv.add(value.name);
      pv.add(value.value);
      List<String> r = new ArrayList<String>();
      r.add(rv);
      nvps.add(new BasicNameValuePair(pv.get(0), r.get(0)));
    }
    input(post, values);
  }

}
