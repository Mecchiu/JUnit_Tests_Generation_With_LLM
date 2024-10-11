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
		private final File logfile = new File("TestAccess.log");
		private FileAppender fapp;

		/**
		* Method to get the log File to output to.
		*/
		private void setUpLogFile() { fapp = new FileAppender();
			fapp.setQueueSize(32);
			fapp.doAppend(logfile);
			fapp.setThreshold(Level.CONFIG);
			fapp.setLayout(new SimpleLayout());
			Logger.getRootLogger().addAppender(fapp);
		}

		/**
		* Method to delete the log File.
		*/
		private void tearDownLogFile() { fapp.doDelete(); Logger.getRootLogger().removeAppender(fapp); }

		private static final String USERNAME = "username";
		private static final String PASSWORD = "password";
		private static final String ENCRYPTION = "X509Enc";
		private static final String AUTH_TYPE = "urn:aus:user:login;scheme:urn-aust-auth";

	/**
	* Method to verify if the login page was received.
	*/
	@Test
    public void verifyLoginPage() throws LoginException {
		fapp = new FileAppender();
		fapp.setQueueSize(32);
		fapp.doAppend(logfile);
		fapp.setThreshold(Level.DEBUG);
		fapp.setLayout(new SimpleLayout());
		Logger.getRootLogger().addAppender(fapp);

        Authentication user = new Authentication();
		boolean result = user.validateUser(USERNAME, PASSWORD);
		if (! result) {
			throw new LoginException("User is not authenticated!");
		}
		System.out.println(String.format("LoginPage Success! %s is authenticated!",USERNAME));
	}

    class Authentication {
      public boolean verifyUser(String user, String password) {
        Properties p = new Properties();
        p.put("user", user);
        p.put("password", password);
        StringTokenizer st = null;
         st = new StringTokenizer(p.getProperty("userInformation"), "/");
        boolean result = false;
        if (st.countTokens() == 2) {
            try {
            	Date timestamp = new Date();
                p.put("timestamp", timestamp.toString());
            	String timezoneid = TimeZone.getDefault().getID().replaceAll("Z$", "");
                p.put("timezone_id", timezoneid);
                RequestCtx ctx = RequestCtx.fromProperties(p).toCtx(null);
                request(ctx);

                result = true;

            } catch (ParseException e) {
                result = false;
            }
        }
        return result;
      }

      public void request(RequestCtx ctx) {
    	logUser = ctx.getContextElements().get(1).getAttribute("login").getValue().toString();
    	logPassword = ctx.getContextElements().get(1).getAttribute("password").getValue().toString();
    	logGTS = ctx.getContextElements().get(1).getAttribute("globalTimeStamp").getValue().toString();
    }

		private String logUser;
		private String logPassword;
		private String logGTS;

		 public boolean logUser  = "";
		 public boolean logPassword = "";
		 public boolean logGlobalTimeStamp = "";

		 public String logGTS = logGTS;


}
}