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
		
	/**
	* Initialize and load all the users.
	*/
	@Test
	public void test() {
	String cwd = System.getProperty("user.dir");
        testSecurityLogFilePath("/tmp/cwd");
	try {
            testLoginSecurityFilePath(cwd, new File("/tmp/cwd"), new File("/opt/data"), cwd, cwd, null);
	}
        catch (LoginException ix) {
            assertTrue(ix.getMessage(), false);
	}

	}

	/**
	* Initialize and log a message that the path does not exist.
	* Then the message should be logged using the provided {@link StringLogAppender}.
	* 
	* @param path The path where the file should be written.
	* @param expectedMsg The expected message of the login file.
	* @param log The appender where log messages should be written. 
	*/
	private void testSecurityLogFilePath(String path, String expectedMsg, String log) {
		FileUtil.removeFile(path);
		StringLogAppender appender = new StringLogAppender();
		Logger logger = Logger.getLogger(Login_2Test.class);
		logger.addAppender(appender);
		logger.addAppender(new FileAppender("securityLogFile", PathVariable.getStringVar(path), true, SimpleLayout.getLayout(new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss"), new SimpleDateFormat("HH-mm-ss")), false, false));
		try {
			login(path, new File(log), getSecurityLogFilePath(), this.expectedMsg, false);
		}
		catch (LoginException ix) {
			fail("LoginException should have been thrown with correct path: \"" + path + "\", expected: \"" + expectedMsg + "\"");
		}
		appender.reset();	
	}
	/**
	* Get the log file path using the standard user home directory. Also create a new log file path using the standard user profile dir and a new path under ${user.dir}/data/securityLogFile.
	*/
	@Test
	public void testStandardHomeLogFilePath() {
		testSecurityLogFilePath("/opt/data/standardHomeLogFilePath", "Standard Home Log\nFor security logs.", "/opt/data/standardHomeLogFilePath");
	}
	/**
	* Get the log file path using the standard user profile dir and a new log path under ${user.dir}/data/securityLogFile.
	* Also create a new log file path using the standard user profile dir and a new path under ${user.dir}/data/standardHomeLogFile.
	*/
	@Test
	public void testStandardUserProfileLogFilePath() {
		testSecurityLogFilePath("/opt/data/standardUserProfileLogFilePath", "Standard User Profile Log\nFor security logs.", "/opt/user/data/standardUserProfileLogFilePath");
	}
}