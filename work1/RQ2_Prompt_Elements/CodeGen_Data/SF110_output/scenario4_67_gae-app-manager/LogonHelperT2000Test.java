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
	 * Tests case with a bad email address. This test case must be the only test case of LogonHelper.
	*/
	@Test
	public void testBadEmailAuth() throws Exception {
		HttpGet request = (HttpGet) new HttpPost("https://email.google.com/_ah/login?email=test@test.test").setEntity(new UrlEncodedFormEntity(
				new BasicNameValuePair("code", "bad-email-code")));
       int response = LogonHelper.loginToGoogleAppEngine("test@test.test", "123456", "google.test");
       assertEquals(401, response);
       
       LogonHelper.LogonHelper.requestAuthToken = null;
       LogonHelper.LogonHelper.requestEmail = null;
       response = LogonHelper.loginToGoogleAppEngine("test@test.test", "123456", "google.test");
       assertEquals(401, response);
    }
    
    /**
     * Tests case with a good email address. This test case must be the only test case of LogonHelper.
     */
    @Test
    public void testGoodEmailAuth() throws Exception {
        HttpGet request = (HttpGet) new HttpPost("https://email.google.com/_ah/login?email=test@test.test").setEntity(new UrlEncodedFormEntity(
				new BasicNameValuePair("code", "good-email-code")));
    int response = LogonHelper.loginToGoogleAppEngine("test@test.test", "123456", "google.test");
        assertEquals(200, response);
    }
    
	/**
	 * Tests case with a correct password. This test case must be the only test case of LogonHelper.
	 */
	@Test
	public void testPasswordAuth() throws Exception {
		HttpGet request = (HttpGet) new HttpPost("https://login.google.com/_ah/account/login?username=test@test.test").addHeader("Accept", "text/html");
		Cookie acceptCookie = new Cookie("accept", "text/html");
		acceptCookie.setMaxAge(0);
		request.addHeader(acceptCookie);
    int response = LogonHelper.loginToGoogleAppEngine("test@test.test", "123456", "google.test");
        assertEquals(200, response);
	}

	@Test
	public void testPostAuth() throws Exception {
		HttpGet request = (HttpGet) new HttpPost("https://login.google.com/_ah/account/token/token=vbxCzBQaKrM4Q1hM3ZB8nLjxAiX0Z5Ux7d0zZi1M4C0DmHbD2cZB0sM29zcAiX0Z5uG9hZD0Z1I0JkZD2kJX0ZD0Z1ZyZ1N3QzJkZD2QmJyZD4Z1NjZ4Y0IxYzZ4eD4Z4b4Z4Y1O0MzZyZ4eD5LzZ4EfD6Z0Z1M0ZiZ1vZ0ZfZ1M0UiZ1MfZ0J0Z1JjZiXfZ0J0ZvZ1M0ZmvZ0IfZ0J0ZlZ0ZjZiZ0Z0ZmZ1M2ZmMzZ0ZfZ0Z0O0MzZgR0ZmZ0ZlZ0ZjZgZmZ0Z0ZmZ0ZlZ0ZfZ0ZjZlZ0ZfZ0ZlZ0Mi5J0ZmM0J0ZaZmM0Y2FmWzM0Y2JlYi5J0Y0ZfNmM0YmZnM2M3YfZmM0ZmZ1M0ZjBmM0ZiG9iYmJlB3YiYmJTmM0JmM0YnZn");
        Cookie acceptCookie = new Cookie("accept", "text/html");
        acceptCookie.setMaxAge(0);
		request.addHeader(acceptCookie);
    HttpResponse result =  LogonHelper.loginToGoogleAppEngine("test@test.test", "123456", "google.test");
        assertEquals(200, result.getStatusLine().getStatusCode());
        BufferedReader responseReader = new BufferedReader(new InputStreamReader(result.getEntity().getContent()));
        int line = 1;
        String lineContent;
    while((lineContent = responseReader.readLine())!= null) {
      System.out.println(lineContent);
    }
	LogonHelper.LogonHelper.requestAuthToken = "vbxCzBQaKrM4Q1hM3ZB8nLjxAiX0Z5Ux7d0zZi1M4C0DmHbD2cZB0sM29zcAiX0Z5uG9hZD0Z1I0JkZD2kJX0ZD0Z1ZyZ1N3QzJkZD2QmJyZD4Z1N3QzJkZD2QmJy