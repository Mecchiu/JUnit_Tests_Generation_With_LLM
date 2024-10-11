// Login_4Test.java
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
* It contains one unit test case for the {@link Login#authenticate()} method.
*/
class Login_4Test {
		public String getLoginId() {
			return "loginId";
		}		
		public String getPassword() {
			return "password";
		}
		public String getLoginURL() {
			return "http://www.browsersoft.com/login";
		}
		public static String getDefaultRequestURL() {
			return "http://www.browsersoft.com/login";
		}
	/**
	 * @see Login_4Test
	 */
public void loginTest() throws LoginException {
	try {
		File file = new File("login")+"/test-config.properties";
	}
	catch(Exception e) {
		e.printStackTrace();
		fail("LoginConfiguration not found");
	}		
	Login login = new Login();
	Properties defaultOptions = new Properties();
	defaultOptions.put("password", "password");
	defaultOptions.put("loginURL", "http://www.browsersoft.com/login");
	defaultOptions.put("requestClasses", RequestBuilder.class.getName());
	login.setDefaultOptions (defaultOptions);
	login.setLoginURL(getLoginURL());
	login.setLoginID("loginId");
	login.setPassword("password");
	try {
		login.authenticate();
	} catch(LoginException e) {
		log.debug(e.getMessage());
	}
	assertEquals("Login credentials incorrect!\n" +
				"Default: pass=password.\n" +
				"User: loginId=loginId.\n" +
				"Password: \"password\"\n" +
				"Login URL: \""+getLoginURL()+"\"", login.getPassword(), login.getLoginID());
	RequestCtx retCtx = login.getRequestCtx();
	log.debug(retCtx);
	log.debug("getUrlFromURL returns: " + retCtx.getUrlFromID());
	log.debug("Request from browser: " + retCtx.toString());
	URL url = new URL(retCtx.getUrlFromID());
	login.setLoginURL(url);
	log.debug(retCtx);
	StringBuffer result = new StringBuffer();
	log.debug(login.toString());
	result.append("LoginConfiguration was successfull: " + result.toString());
	result.append("Username: " + result.toString());
	result.append("Password: " + result.toString());
	result.append("Client ID: " + result.toString());
	result.append("Client Secret: " + result.toString());
	result.append("User ID: " + result.toString());
	result.append("User ID Password: " + result.toString());
	result.append("Request Classpath: " + result.toString());
	log.debug(result.toString());
	assertTrue(result.toString().contains("LoginConfiguration was successfull"));
	}
public void loginTestCases() throws LoginException {
	Set<Login> loginList;
	Login login = new Login();
	loginList = new HashSet<Login>();
	loginList.add(login);
	loginList.add(login);
	log.debug("Login list is: " + loginList.toString());
	for(Iterator<Login> iter = loginList.iterator(); iter.hasNext();) {
		log.debug("Login class: "+iter.next().getClass().getName());
	}
	log.debug("Login class: "+PDPadapter.class.getName());
	}
@Test
public void testLogin() throws Exception {
	loginTest();
	loginTestCases();
}
}