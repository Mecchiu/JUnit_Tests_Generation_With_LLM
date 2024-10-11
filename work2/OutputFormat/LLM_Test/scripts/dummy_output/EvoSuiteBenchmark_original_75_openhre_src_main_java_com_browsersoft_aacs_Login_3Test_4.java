// Login_3Test.java
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
* It contains one unit test case for the {@link Login#authorize()} method.
*/
class Login_3Test {
		private static final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-ddTHH:mm:ss");
		private static final SimpleLayout layout = new SimpleLayout();
		private static Logger log = Logger.getLogger(Login_3Test.class);
		private Class testClass;
		private String userName = "USERID";
		private String password = "PASSWORD";
		
	/**
	 * Generate a test class for the login method of {@link Login}.
	 *
	 * @return Test class
	 */
	@Test
	public String testMethod_login() throws LoginException;
	/**
	 * Generate a test class for the validate method of {@link Login}.
	 *
	 * @return Test class
	 */
	public String testMethod_validate() throws LoginException;
	/**
	 * Execute the authentication
	 */
	void executeAuth() throws LoginException;
	
	/**
	 * Login method for authenticated user.
	 *
	 * @param userName User name to login
	 * @param password Password to login
	 * @return authenticated user
	 * @throws LoginException Exception is thrown
	 */
	User authorize(String userName, String password) throws LoginException;
}
