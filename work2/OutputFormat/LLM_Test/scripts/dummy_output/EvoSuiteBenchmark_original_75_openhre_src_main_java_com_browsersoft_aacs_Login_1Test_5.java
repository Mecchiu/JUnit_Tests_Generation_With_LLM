// Login_1Test.java
package com.browsersoft.aacs;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.security.auth.login.LoginException;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import com.browsersoft.aacs.xacml.PDPadapter;
import com.browsersoft.aacs.xacml.RequestBuilder;
import com.sun.xacml.Indenter;
import com.sun.xacml.ctx.RequestCtx;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Login}.
* It contains one unit test case for the {@link Login#getProps()} method.
*/
class Login_1Test {
		
	private String username("");
	private String password("");
	private boolean testLoginRequired("");
	private File logFile(String logfile) throws LoginException {
		String f = logfile.substring("/opt/".length());
		return new File(f);
	}
	/**
	* test logfile of login processing.
	*/
	@Test
	public void testLogFile() throws LoginException {
		
		logFile(testLoginRequired + "/test.log");
		File resultFile = logFile(testLoginRequired + "/result.txt");
		logFile(testLoginRequired + "/result2.txt");
	}
	/**
	* test password management
	*/
	@Test
	public void testPassword() throws LoginException {
		
		logFile(testLoginRequired + "/test2.log");
		File logFile2 = logFile(testLoginRequired + "/result.txt");
		logFile(testLoginRequired + "/result2.txt");
		
		String password_2 = login();
		boolean result_1 = login(password_2);
		assertTrue(result_1);		
		boolean result_2 = login(password_2);
		assertTrue(result_2);
		boolean result_3 = login(password_2);
		assertFalse(result_3);
		boolean result_4 = login(password_2);
		assertTrue(result_4);
		
		
		
		boolean result_3x = login(password_2);
		assertFalse(result_3x);
		boolean result_4x = login(password_2);
		assertTrue(result_4x);
	}

	/**
	* tests login using a password which is not empty
	*/
	@Test
	public void testPasswordNotEmptyFail() throws LoginException {
		
		logFile(testLoginRequired + "/test3.log");
		
		boolean result_3x = login(username, password);
		assertFalse(result_3x);
	}
	
	/**
	* tests login using a password which is a subset of the password
	*/
	@Test
	public void testPasswordSubsetFail() throws LoginException {
		
		logFile(testLoginRequired + "/test4.log");
		
		boolean result_3x = login(username, password.substring(0, 2));
		assertFalse(result_3x);
	}
	
	/**
	* tests login with a required password
	*/
	@Test
	public void testLoginRequiredFail() throws LoginException {
		
		logFile(testLoginRequired + "/test5.log");
		
		boolean result = login("");
		assertFalse(result);
	}
	
	/**
	* tests login with a supplied password as a required one
	*/
	@Test
	public void testLoginSuppliedPasswordFail() throws LoginException {
		
		logFile(testLoginRequired + "/test6.log");
		
		boolean result = login(username.toCharArray());
		assertFalse(result);
	}
	/**
	* tests to see if a required value is present in
	* a result text file
	*/
	@Test
	public void testLoginRequiredTest() throws LoginException {
		
		logFile(testLoginRequired + "/test7.log");
		
		boolean result = login(username.toCharArray());
		assertTrue(result);
	}
	/**
	* creates a user given username from a password
	*
	* @param username the username
	* @return password as a string
	*
	* @throws LoginException
	*/
	private String login(char[] username) throws LoginException {
		
		if (testLoginRequired) {
			String password = password("");
			if (username.length > 0) {
				return PDPadapter.sign(username, password);
			}
			return password;
		} else {
			try {
				HashSet<String> users = new HashSet();
				users.add(username);
				RequestBuilder b = new RequestBuilder(users);
				RequestCtx reqCtx = b.build();
				
				b = new RequestBuilder(b).setVersion(1.2);
				//b = new RequestBuilder(b).setCredentials(null,null);
				Logger logger = Logger.getLogger(Users.class).getLogger("com.bbrowse.aacs.java.test");
				logger.setLevel(Level.INFO);
				
				return PDPadapter.sign(reqCtx);
			} catch (Indenter se) {
				se.printStackTrace(System.out);
				throw new LoginException(se.getMsg());
			}
		}
	}
}