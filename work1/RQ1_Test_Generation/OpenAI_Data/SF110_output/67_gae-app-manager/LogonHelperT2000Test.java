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
	* It tests the case when the userid is null.
	*/
	@Test
	void testLoginToGoogleAppEngine_UseridNull() {
		System.out.println("loginToGoogleAppEngine_UseridNull");
		String userid = null;
		String password = "";
		String source = "";
		String expResult = "";
		String result = "";
		try {
			result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		} catch (Exception ex) {
			fail("Exception thrown: " + ex.getMessage());
		}
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the case when the userid is empty.
	*/
	@Test
	void testLoginToGoogleAppEngine_UseridEmpty() {
		System.out.println("loginToGoogleAppEngine_UseridEmpty");
		String userid = "";
		String password = "";
		String source = "";
		String expResult = "";
		String result = "";
		try {
			result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		} catch (Exception ex) {
			fail("Exception thrown: " + ex.getMessage());
		}
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the case when the userid is invalid.
	*/
	@Test
	void testLoginToGoogleAppEngine_UseridInvalid() {
		System.out.println("loginToGoogleAppEngine_UseridInvalid");
		String userid = "invalid";
		String password = "";
		String source = "";
		String expResult = "";
		String result = "";
		try {
			result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		} catch (Exception ex) {
			fail("Exception thrown: " + ex.getMessage());
		}
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the case when the password is null.
	*/
	@Test
	void testLoginToGoogleAppEngine_PasswordNull() {
		System.out.println("loginToGoogleAppEngine_PasswordNull");
		String userid = "";
		String password = null;
		String source = "";
		String expResult = "";
		String result = "";
		try {
			result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		} catch (Exception ex) {
			fail("Exception thrown: " + ex.getMessage());
		}
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the case when the password is empty.
	*/
	@Test
	void testLoginToGoogleAppEngine_PasswordEmpty() {
		System.out.println("loginToGoogleAppEngine_PasswordEmpty");
		String userid = "";
		String password = "";
		String source = "";
		String expResult = "";
		String result = "";
		try {
			result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		} catch (Exception ex) {
			fail("Exception thrown: " + ex.getMessage());
		}
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the case when the password is invalid.
	*/
	@Test
	void testLoginToGoogleAppEngine_PasswordInvalid() {
		System.out.println("loginToGoogleAppEngine_PasswordInvalid");
		String userid = "";
		String password = "invalid";
		String source = "";
		String expResult = "";
		String result = "";
		try {
			result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		} catch (Exception ex) {
			fail("Exception thrown: " + ex.getMessage());
		}
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the case when the source is null.
	*/
	@Test
	void testLoginToGoogleAppEngine_SourceNull() {
		System.out.println("loginToGoogleAppEngine_SourceNull");
		String userid = "";
		String password = "";
		String source = null;
		String expResult = "";
		String result = "";
		try {
			result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		} catch (Exception ex) {
			fail("Exception thrown: " + ex.getMessage());
		}
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the case when the source is empty.
	*/
	@Test
	void testLoginToGoogleAppEngine_SourceEmpty() {
		System.out.println("loginToGoogleAppEngine_SourceEmpty");
		String userid = "";
		String password = "";
		String source = "";
		String expResult = "";
		String result = "";
		try {
			result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		} catch (Exception ex) {
			fail("Exception thrown: " + ex.getMessage());
		}
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the case when the source is invalid.
	*/
	@Test
	void testLoginToGoogleAppEngine_SourceInvalid() {
		System.out.println("loginToGoogleAppEngine_SourceInvalid");
		String userid = "";
		String password = "";
		String source = "invalid";
		String expResult = "";
		String result = "";
		try {
			result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		} catch (Exception ex) {
			fail("Exception thrown: " + ex.getMessage());
		}
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the case when the userid, password and source are valid.
	*/
	@Test
	void testLoginToGoogleAppEngine_Valid() {
		System.out.println("loginToGoogleAppEngine_Valid");
		String userid = "";
		String password = "";
		String source = "";
		String expResult = "";
		String result = "";
		try {
			result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		} catch (Exception ex) {
			fail("Exception thrown: " + ex.getMessage());
		}
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the case when the userid, password and source are valid.
	*/
	@Test
	void testLoginToGoogleAppEngine_Valid2() {
		System.out.println("loginToGoogleAppEngine_Valid2");
		String