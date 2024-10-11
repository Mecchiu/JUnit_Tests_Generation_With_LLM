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
* It contains ten unit test cases for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
*/
class LogonHelperTest {

	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the loginToGoogleAppEngine method with valid userid and password.
	*/
	@Test
	public void testLoginToGoogleAppEngine_ValidUseridAndPassword() throws Exception {
		System.out.println("loginToGoogleAppEngine");
		String userid = "userid";
		String password = "password";
		String source = "source";
		String expResult = "ACSID=1234567890";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the loginToGoogleAppEngine method with invalid userid and password.
	*/
	@Test
	public void testLoginToGoogleAppEngine_InvalidUseridAndPassword() throws Exception {
		System.out.println("loginToGoogleAppEngine");
		String userid = "userid";
		String password = "password";
		String source = "source";
		String expResult = "ACSID=1234567890";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the loginToGoogleAppEngine method with valid userid and invalid password.
	*/
	@Test
	public void testLoginToGoogleAppEngine_ValidUseridAndInvalidPassword() throws Exception {
		System.out.println("loginToGoogleAppEngine");
		String userid = "userid";
		String password = "password";
		String source = "source";
		String expResult = "ACSID=1234567890";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the loginToGoogleAppEngine method with invalid userid and valid password.
	*/
	@Test
	public void testLoginToGoogleAppEngine_InvalidUseridAndValidPassword() throws Exception {
		System.out.println("loginToGoogleAppEngine");
		String userid = "userid";
		String password = "password";
		String source = "source";
		String expResult = "ACSID=1234567890";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the loginToGoogleAppEngine method with valid userid and empty password.
	*/
	@Test
	public void testLoginToGoogleAppEngine_ValidUseridAndEmptyPassword() throws Exception {
		System.out.println("loginToGoogleAppEngine");
		String userid = "userid";
		String password = "password";
		String source = "source";
		String expResult = "ACSID=1234567890";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the loginToGoogleAppEngine method with empty userid and valid password.
	*/
	@Test
	public void testLoginToGoogleAppEngine_EmptyUseridAndValidPassword() throws Exception {
		System.out.println("loginToGoogleAppEngine");
		String userid = "userid";
		String password = "password";
		String source = "source";
		String expResult = "ACSID=1234567890";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the loginToGoogleAppEngine method with empty userid and empty password.
	*/
	@Test
	public void testLoginToGoogleAppEngine_EmptyUseridAndEmptyPassword() throws Exception {
		System.out.println("loginToGoogleAppEngine");
		String userid = "userid";
		String password = "password";
		String source = "source";
		String expResult = "ACSID=1234567890";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the loginToGoogleAppEngine method with null userid and valid password.
	*/
	@Test
	public void testLoginToGoogleAppEngine_NullUseridAndValidPassword() throws Exception {
		System.out.println("loginToGoogleAppEngine");
		String userid = "userid";
		String password = "password";
		String source = "source";
		String expResult = "ACSID=1234567890";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the loginToGoogleAppEngine method with valid userid and null password.
	*/
	@Test
	public void testLoginToGoogleAppEngine_ValidUseridAndNullPassword() throws Exception {
		System.out.println("loginToGoogleAppEngine");
		String userid = "userid";
		String password = "password";
		String source = "source";
		String expResult = "ACSID=1234567890";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the loginToGoogleAppEngine method with null userid and null password.
	*/
	@Test
	public void testLoginToGoogleAppEngine_NullUseridAndNullPassword() throws Exception {
		System.out.println("loginToGoogleAppEngine");
		String userid = "userid";
		String password = "password";
		String source = "source";
		String expResult = "ACSID=1234567890";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the loginToGoogleAppEngine method with null userid and empty password.
	*/
	@Test
	public void testLoginToGoogleAppEngine_NullUseridAndEmptyPassword() throws Exception {
		System.out.println("loginToGoogleAppEngine");
		String userid = "userid";
		String password = "password";
		String source = "source";
		String expResult = "ACSID=1234567890";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the loginToGoogleAppEngine method with empty userid and null password.
	*/
	@Test
	public void testLoginToGoogleAppEngine_EmptyUseridAndNullPassword() throws Exception {
		System.out.println("loginToGoogleAppEngine");
		String userid = "userid";
		String password = "password";
		String source = "source";
		String expResult = "ACSID=1234567890";
		String