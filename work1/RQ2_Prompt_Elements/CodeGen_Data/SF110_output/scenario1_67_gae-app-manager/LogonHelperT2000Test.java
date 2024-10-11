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
		
	// Method testLogin
	@Test
	void testLogin() {
		// This test must have a unique outcome on Google:
		// 1. A log-on page with both an accountType
		//    name (HOSTED_OR_GOOGLE) or a hosted or custom accountType
		// 2. a login button
		// 1-2. one-time password: 0-60, 30-60, 1-60
		//        the login button
		// 3. login
		String expectedResponse =
			"HTTP/1.1 200 OK\r\n"
            +"Content-Type: text/html; charset=UTF-8\r\n"
            +"\r\n"
            +"LoginButton\r\n"
            +"\r\n"
            +"<html>\r\n"
            +"<head>\r\n"
            +"<title>Test</title>\r\n"
            +"\r\n"
            +"</head>\r\n"
            +"<body>\r\n"
            +"<p><button>Log-on button</button>\r\n"
            +"<input type=text name=login value=\"0\" style=\"width:60px; max-width: 60px;\">\r\n"
            +"<input type=text name=pass value=\"0\">\r\n"
            +"<input type=text name=hosted value=\"0/google-api-appengine\">\r\n"
            +"<input type=text name=id value=\"0\">\r\n"
            +"<input type=text name=source value=\"http://google.com/\">\r\n"
            +"</p>\r\n"
            +"\r\n"
            +"</body></html>\r\n"
            +"</html>\r\n";

        // Login
        HttpGet loginPage =
			new HttpGet("https://www.google.com/_ah/login?auth="
                               + "&passwd=" + "0/google-apia"
                + "&source=" + "http://google.com/");
        HttpResponse response = loginPage.execute();
        assertEquals(expectedResponse, EntityUtils.toString(response.getEntity()));
	}

        // LoginHelper class - one unit test must have a unique outcome on Google:
        // 1. a log-on page with both an accountType
        //    name (HOSTED_OR_GOOGLE) or a hosted or custom accountType
        // 2. one-time password: 0-60, 30-60, 1-60
        // 1-2. login button
        // 3. login
        // 1-2. one-time password: 0-60, 30-60, 1-60
        // 1-2. login button
        // 3. login
        // 1-2. login
        // 1-2. one-time password: 0-60, 30-60, 1-60
        // 1-2. login button
        // 1-2. two-time password: 0-60, 30-60, 1-60
        // 1-2. login button
        // 1-2. two-time password: 0-60, 30-60, 1-60
        // 1-2. login button
        // 1-2. two-time password: 0-60, 30-60, 1-60
        // 1-2. login button
        // 1-2. login
        // 1-2. two-time password: 0-60, 30-60, 1-60
        // 1-2. login button
        // 1-2. login
        // 1-2. login
        // 4. another way:
        // 1. one-time password: 0-60, 30-60, 1-60
        // 1. two-time password: 0-60, 30-60, 1-60
