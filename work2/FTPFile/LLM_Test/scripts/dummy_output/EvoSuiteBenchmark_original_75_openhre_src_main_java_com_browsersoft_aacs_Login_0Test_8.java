// Login_0Test.java
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
* It contains one unit test case for the {@link Login#getProps(String)} method.
*/
class Login_0Test {
		
	/**
	 * Create logger, which is used for the tests.
	*/
	private static final Logger logger = Logger.getLogger(Login_0Test.class);

	// Class under test
	private static Authentication auth = null;
	//
	/**
	 * Test case 001 initialize the class from ConfigFile.
	*/
	@Test
	public void test001() {
		Properties props = new Properties();
/** Create a properties file and initialize it.
    * Properties properties = new Properties();
    * Properties properties = new Properties();
    * properties.setProperty("login", "browsersoft");
    * properties.setProperty("key", "bowser");
    * Set<String> set = new Set<String>();
    * set.add("Login:browsersoft");
    * set.add("Login:bowser");
    * set.add("Login:bowser.test");
	** Get the class from the properties file.
	*/
		try {
			props = getProps("login.properties");
			String login = props.getProperty("login").toLowerCase();
			String key = props.getProperty("key").toLowerCase();

			/*
			 * Set the value of the login attribute.
			 */
			if (!("login".toLowerCase().equals(login))) {
				throw new LoginException("Illegal value for the property "
						+ "login attribute");
			}

						if (!("test".toLowerCase().equals(key))) {
			    throw new LoginException("Illegal value for the property "
						+ "key attribute");
		}
			System.out.println("Login class initialized");
			break;
		} catch (LoginException e) {
			System.out.println("Login class not initialized");
			return;
		} catch (java.security.LoginException e) {
			System.out.println("Login class not initialized");
			return;
		}
/** Execute the RequestBuilder for the Request.
* If the request was not successful, then exception is throw in the method.
* Otherwise, it calls the request with the value of login as the Request argument
* and the value of key as the Value argument.
* Exceptions are thrown if the login value is invalid, but request not successful.
* Exceptions are never thrown if the login value is invalid, but the password is wrong.
*/
		
		try { 

    	  	RequestCtx req = new RequestCtx();
	   		req.addAttribute("login", login);
	   		req.addAttribute("key", key);
	   		
			auth = RequestBuilder.buildAuthentication(req);
		} catch (RequestException e) {

			String strError = AuthUtils.getErrorText(e);
			logger.error("Execute the Login RequestBuilder Failed: " + strError, e);
			fail("Unable to build the request, authentication failure");
		} catch (LoginException e) {

			String strError = AuthUtils.getErrorText(e);
			logger.error("Execute the Login RequestBuilder Failed: " + strError, e);
			fail("Unable to build the request, authentication failure");
		} catch (Throwable e) {
			String strError = AuthUtils.getErrorText(e);
			logger.error("Execute the Login RequestBuilder Failed: " + strError, e);
			fail("Unable to build the request, authentication error");
		}

/**
 * Set the default values for the fields of Authentication, when none were filled in.
*/

        logger.addAppender(new FileAppender(new SimpleLayout("%d{Cron}\n"),
                                      new File("logs/"), Level.ALL));

/** Set the value of the P-Padder, when it is not found in the Properties file. 
        * It is called at the first use of the class.
        */
        if (!("RequestBuilder".toLowerCase().equals(auth.getAuthType()))) {
            String strError = "The P-Padder class was not found in the properties file";
            logger.debug(strError, e);
		}
} // End of Login_0Test.test001

		if (auth == null) {
			fail("Login class not initialized");
		}
} // End of Login_0Test_Main