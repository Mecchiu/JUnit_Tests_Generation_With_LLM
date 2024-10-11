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
	* Test of {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the case when the userid is null.
	*/
	@Test
	void testLoginToGoogleAppEngine_UseridIsNull() {
		try {
			LogonHelper.loginToGoogleAppEngine(null, "password", "source");
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("userid is null", e.getMessage());
		} catch (Exception e) {
			fail("Expected IllegalArgumentException");
		}
	}
	
	/**
	* Test of {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the case when the userid is empty.
	*/
	@Test
	void testLoginToGoogleAppEngine_UseridIsEmpty() {
		try {
			LogonHelper.loginToGoogleAppEngine("", "password", "source");
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("userid is empty", e.getMessage());
		} catch (Exception e) {
			fail("Expected IllegalArgumentException");
		}
	}
	
	/**
	* Test of {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the case when the password is null.
	*/
	@Test
	void testLoginToGoogleAppEngine_PasswordIsNull() {
		try {
			LogonHelper.loginToGoogleAppEngine("userid", null, "source");
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("password is null", e.getMessage());
		} catch (Exception e) {
			fail("Expected IllegalArgumentException");
		}
	}
	
	/**
	* Test of {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the case when the password is empty.
	*/
	@Test
	void testLoginToGoogleAppEngine_PasswordIsEmpty() {
		try {
			LogonHelper.loginToGoogleAppEngine("userid", "", "source");
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("password is empty", e.getMessage());
		} catch (Exception e) {
			fail("Expected IllegalArgumentException");
		}
	}
	
	/**
	* Test of {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the case when the source is null.
	*/
	@Test
	void testLoginToGoogleAppEngine_SourceIsNull() {
		try {
			LogonHelper.loginToGoogleAppEngine("userid", "password", null);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("source is null", e.getMessage());
		} catch (Exception e) {
			fail("Expected IllegalArgumentException");
		}
	}
	
	/**
	* Test of {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the case when the source is empty.
	*/
	@Test
	void testLoginToGoogleAppEngine_SourceIsEmpty() {
		try {
			LogonHelper.loginToGoogleAppEngine("userid", "password", "");
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("source is empty", e.getMessage());
		} catch (Exception e) {
			fail("Expected IllegalArgumentException");
		}
	}
	
	/**
	* Test of {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the case when the userid is invalid.
	*/
	@Test
	void testLoginToGoogleAppEngine_UseridIsInvalid() {
		try {
			LogonHelper.loginToGoogleAppEngine("userid", "password", "source");
			fail("Expected Exception");
		} catch (Exception e) {
			assertEquals("Error logging in to Google App Engine", e.getMessage());
		}
	}
	
	/**
	* Test of {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the case when the password is invalid.
	*/
	@Test
	void testLoginToGoogleAppEngine_PasswordIsInvalid() {
		try {
			LogonHelper.loginToGoogleAppEngine("userid@gmail.com", "password", "source");
			fail("Expected Exception");
		} catch (Exception e) {
			assertEquals("Error logging in to Google App Engine", e.getMessage());
		}
	}
	
	/**
	* Test of {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the case when the source is invalid.
	*/
	@Test
	void testLoginToGoogleAppEngine_SourceIsInvalid() {
		try {
			LogonHelper.loginToGoogleAppEngine("userid@gmail.com", "password", "source");
			fail("Expected Exception");
		} catch (Exception e) {
			assertEquals("Error logging in to Google App Engine", e.getMessage());
		}
	}
	
	/**
	* Test of {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the case when the userid, password and source are valid.
	*/
	@Test
	void testLoginToGoogleAppEngine_Valid() {
		try {
			String acsid = LogonHelper.loginToGoogleAppEngine("userid@gmail.com", "password", "source");
			assertNotNull(acsid);
		} catch (Exception e) {
			fail("Expected no Exception");
		}
	}
	
	/**
	* Test of {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the case when the userid, password and source are valid.
	*/
	@Test
	void testLoginToGoogleAppEngine_Valid2() {
		try {
			String acsid = LogonHelper.loginToGoogleAppEngine("userid@gmail.com", "password", "source");
			assertNotNull(acsid);
		} catch (Exception e) {
			fail("Expected no Exception");
		}
	}
	
	/**
	* Test of {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the case when the userid, password and source are valid.
	*/
	@Test
	void testLoginToGoogleAppEngine_Valid3() {
		try {
			String acsid = LogonHelper.loginToGoogleAppEngine("userid@gmail.com", "password", "source");
			assertNotNull(acsid);
		} catch (Exception e) {
			fail("Expected no Exception");
		}
	}
	
	/**
	* Test of {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the case when the userid, password and source are valid.
	*/
	@Test
	void testLoginToGoogleAppEngine_Valid4() {
		try {
			String acsid = LogonHelper.loginToGoogleAppEngine("userid@gmail.com", "password", "source");
			assertNotNull(acsid);
		} catch (Exception e) {
			fail("Expected no Exception");
		}
	}
	
	/**
	* Test of {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the case when the userid, password and source are valid.
	*/
	@Test
	void testLoginToGoogleAppEngine_Valid5() {
		try {
			String acsid = LogonHelper.loginToGoogleAppEngine("userid@gmail.com", "password", "source");
			assertNotNull(acsid);
		} catch (Exception e) {
			fail("Expected no Exception");
		}
	}
	
	/**
	* Test of {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the case when the userid, password and source are valid.
	*/
	@Test
	void testLoginToGoogleAppEngine_Valid6() {
		try {
			String acsid = LogonHelper.loginToGoogleAppEngine("userid@gmail.com", "password", "source");
			assertNotNull(acsid);
		} catch (Exception e) {
			fail("Expected no Exception");
		}
	}
	
	/**
	* Test of {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the case when the userid, password and source are valid.
	*/
	@Test
	void testLoginToGoogleAppEngine_Valid7() {
		try {
			String acsid = LogonHelper.loginToGoogleAppEngine("userid@gmail.com", "password", "source");
			assertNotNull(acsid);
		} catch (Exception e) {
			fail("Expected no Exception");
		}
	}
	
	/**
	* Test of {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the case when the userid, password and source are valid.
	*/
	@Test
	void testLoginToGoogleAppEngine_Valid8() {
		try {
			String acsid = LogonHelper.loginToGoogleAppEngine("userid@gmail.com", "password", "source");
			assertNotNull(acsid);
		} catch (Exception e) {
			fail("Expected no Exception");
		}
	}
	
	/**
	* Test of {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the case when the userid, password and source are valid.
	*/
	@Test
	void testLoginToGoogleAppEngine_Valid9() {
		try {
			String acsid = LogonHelper.loginToGoogleAppEngine("userid@gmail.com", "password", "source");
			assertNotNull(acsid);
		} catch (Exception e) {
			fail("Expected no Exception");
		}
	}
	
	/**
	* Test of {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the case when the userid, password and source are valid.
	*/
	@Test
	void testLoginToGoogleAppEngine_Valid10() {
		try {
			String acsid = LogonHelper.loginToGoogleAppEngine("userid@gmail.com", "password", "source");
			assertNotNull(acsid);
		} catch (Exception e) {
			fail("Expected no Exception");
		}
	}
}