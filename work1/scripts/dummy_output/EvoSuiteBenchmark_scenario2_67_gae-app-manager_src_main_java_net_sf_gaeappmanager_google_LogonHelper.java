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
	* Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the method with a valid userid and password.
	*/
	@Test
	void testLoginToGoogleAppEngine_ValidUseridAndPassword() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the method with a valid userid and password.
	*/
	@Test
	void testLoginToGoogleAppEngine_ValidUseridAndPassword2() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the method with a valid userid and password.
	*/
	@Test
	void testLoginToGoogleAppEngine_ValidUseridAndPassword3() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the method with a valid userid and password.
	*/
	@Test
	void testLoginToGoogleAppEngine_ValidUseridAndPassword4() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the method with a valid userid and password.
	*/
	@Test
	void testLoginToGoogleAppEngine_ValidUseridAndPassword5() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the method with a valid userid and password.
	*/
	@Test
	void testLoginToGoogleAppEngine_ValidUseridAndPassword6() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the method with a valid userid and password.
	*/
	@Test
	void testLoginToGoogleAppEngine_ValidUseridAndPassword7() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the method with a valid userid and password.
	*/
	@Test
	void testLoginToGoogleAppEngine_ValidUseridAndPassword8() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the method with a valid userid and password.
	*/
	@Test
	void testLoginToGoogleAppEngine_ValidUseridAndPassword9() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
	* It tests the method with a valid userid and password.
	*/
	@Test
	void testLoginToGoogleAppEngine_ValidUseridAndPassword10() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String result = LogonHelper.loginToGoogleAppEngine(userid, password, source);
		assertNotNull(result);
	}
	
}