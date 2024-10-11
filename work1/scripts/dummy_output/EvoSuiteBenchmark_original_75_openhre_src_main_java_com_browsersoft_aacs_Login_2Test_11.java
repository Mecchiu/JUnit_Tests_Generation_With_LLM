// Login_2Test.java
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
* It contains one unit test case for the {@link Login#getSecurityLogFilePath()} method.
*/
class Login_2Test {
		
	static boolean foundLog4j = false;
	
	@Test
	void testGetSecurityLogFilePath() {
		if(!foundLog4j) FileAppender.reset();            
	        FileAppender.addAppend(Login_2Test.class.getClassLoader().getResource("log4j-stored.log"),
	                        (Appender) FileAppender.getAppender("log4j-stored.log"));
	        FileAppender.addAppend(Login_2Test.class.getClassLoader().getResource("log4j-user.log"),
	                        (Appender) FileAppender.getAppender("log4j-user.log"));
	        FileAppender.addAppend(Login_2Test.class.getClassLoader().getResource("log4j-request.log"),
	                        (Appender) FileAppender.getAppender("log4j-request.log"));
	        
	        String path = "/Users/Sakim-sakkic/Desktop/aacsth/aacs-log/SecurityLog.out";
	        String pdb = System.getProperty("pdb");
	        System.clearProperty("pdb");	
	        if (pdb.length() == -1) {
	            System.setProperty("pdb", "com.browsersoft.aacs.xacml.UserAuthenticatorFactory");
	        }
	        try {
	            File logFile = new File(Login_2Test.getSecurityLogFilePath());
	            assertTrue("Get security log file path  \n" +
	                            "is not the same as user log file\n" +
	                            "path, \n\tgetLogFilePath returns \n" +
	                            logFile.getPath() + "\n", logFile.getPath().equals(pdb));
	        } catch (LoginException ex) {
	            fail("Get logging file fails:\n" + ex);
	        }
	        String env = System.getenv("PAWD");
	        assertTrue("System.getenv() return PWD \n" + env + " is not set to \n" + path,!env.equals(path));
	        //System.out.println("Environment variable PAWD = " + System.getenv("PAWD"));
	        //System.out.println("Current time zone = " + 
	        //		        new SimpleDateFormat("ddMMyyyy_HHmmSS").format(Calendar.getInstance().getTime()));

	    }

 		@Test
		void getSecurityLogFilePath_noUser() {
			String path =
					Login_2Test.getSecurityLogFilePath() + "/SecurityLog_2Test.log";
			String pdb = System.getProperty("pdb");
            System.clearProperty("pdb");
            try {
	            File logFile = new File(Login_2Test.getSecurityLogFilePath());
	            assertTrue("Get security logging file path \n" +
	                            "is not the same as user log file\n" +
	                            "path, \n\treply is not \n" + pdb + "\n", logFile.exists() && logFile.isFile() && logFile.getPath().equals(pdb));
	            assertTrue("Log4j output " + logFile.getName()
	                            + " is not the same as the same result of " + pdb,
	                            logFile.getName().equals(pdb));
	            System.out.println("Log file is identical \n" + logFile.getCanonicalPath());
            } catch (LoginException ex) {
                fail("Log4j output cannot be found: " + ex);
            }
		}
		
		@Test
		void getSecurityLogFilePath_singleUser() {
			// Set system property "pdb" to the value "com.browsersoft.aacs.xacml"
			try {
				String path =
						Login_2Test.getSecurityLogFilePath() + "/singleUser" + ".log";
				String pdb = System.getProperty("pdb");
                System.clearProperty("pdb");
                File logFile = new File(path);
                assertTrue("Log4j output " + path + " is not the same as the same result of " + pdb,
                        logFile.exists() && logFile.isFile() && pdb.equals(logFile.getName()));
                System.out.println("Log file is identical \n" + logFile.getCanonicalPath());
	        } catch (LoginException ex) {
	            fail("Log4j output cannot be found: " + ex);
	        }
		}

		@Test
		void getSecurityLogFilePath_null() {
			String path = GetSecurityLogFilePath_null();
			FileLogFile.append(path);
			String pdb = System.getProperty("pdb");
            System.clearProperty("pdb");
            File logFile = new File(path);
            assertTrue("Log4j output " + path + " is not the same as the same result of " + pdb, logFile.exists() && pdb.equals(logFile.getName()));
            System.out.println("Log file is identical \n" + logFile.getCanonicalPath());
	        //System.out.println("LogFile.saveToFile - \n" + logFile.toString());
        }


		String GetSecurityLogFilePath_null() throws LoginException {
			Logger.getLogger(Logger.ROOT_LOGGER_NAME).setLevel(Level.INFO);
			Logger.getLogger(Logger.ROOT_LOGGER_NAME).addAppender(new FileAppender("SekaiLog.fails"));
			String path = 
					Login_2Test.getSecurityLogFilePath() + "/NoUser/"
					+ System.getenv("user") + "/.log";
}
}