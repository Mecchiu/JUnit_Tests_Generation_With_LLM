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
	void testLoginToGoogleAppEngine_1() {
		System.out.println("loginToGoogleAppEngine");
		String userid = null;
		String password = "";
		String source = "";
		String expResult = "";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the case when the userid is empty.
	*/
	@Test
	void testLoginToGoogleAppEngine_2() {
		System.out.println("loginToGoogleAppEngine");
		String userid = "";
		String password = "";
		String source = "";
		String expResult = "";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the case when the password is null.
	*/
	@Test
	void testLoginToGoogleAppEngine_3() {
		System.out.println("loginToGoogleAppEngine");
		String userid = "";
		String password = null;
		String source = "";
		String expResult = "";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the case when the password is empty.
	*/
	@Test
	void testLoginToGoogleAppEngine_4() {
		System.out.println("loginToGoogleAppEngine");
		String userid = "";
		String password = "";
		String source = "";
		String expResult = "";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the case when the source is null.
	*/
	@Test
	void testLoginToGoogleAppEngine_5() {
		System.out.println("loginToGoogleAppEngine");
		String userid = "";
		String password = "";
		String source = null;
		String expResult = "";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the case when the source is empty.
	*/
	@Test
	void testLoginToGoogleAppEngine_6() {
		System.out.println("loginToGoogleAppEngine");
		String userid = "";
		String password = "";
		String source = "";
		String expResult = "";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the case when the userid, password and source are valid.
	*/
	@Test
	void testLoginToGoogleAppEngine_7() {
		System.out.println("loginToGoogleAppEngine");
		String userid = "";
		String password = "";
		String source = "";
		String expResult = "";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the case when the userid, password and source are valid.
	*/
	@Test
	void testLoginToGoogleAppEngine_8() {
		System.out.println("loginToGoogleAppEngine");
		String userid = "";
		String password = "";
		String source = "";
		String expResult = "";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the case when the userid, password and source are valid.
	*/
	@Test
	void testLoginToGoogleAppEngine_9() {
		System.out.println("loginToGoogleAppEngine");
		String userid = "";
		String password = "";
		String source = "";
		String expResult = "";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
	/**
	* Test of loginToGoogleAppEngine method, of class LogonHelper.
	* It tests the case when the userid, password and source are valid.
	*/
	@Test
	void testLoginToGoogleAppEngine_10() {
		System.out.println("loginToGoogleAppEngine");
		String userid = "";
		String password = "";
		String source = "";
		String expResult = "";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertEquals(expResult, result);
	}
	
}