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
    * The security log file path of the {@link Login}
    */
    final static String  PATH             = "/logs/log";

	/*
	 * Initilize the logger.
	 */
	private static Logger      logger            = null;

	/**
	 * Test the {@link Login#getSecurityLogFilePath()} method.
	*/
	@Test
	public void test_getSecurityLogFilePath()  {

		logger.info("Test getSecurityLogFilePath");

		String  result            = null;
		
		//  Get a property from the environment and check if there is no log file path set in it.
		logger.info("Get a security log file path using environment variable");
		result = getSecurityLogFilePath();
		assertNotNull(result);
		logger.info("Get a security log file path using environment variable");
		logger.info(result);



		//  Get a security log file path by reading the property file from a given file path.
		logger.info("Get a security log file path by reading the property file from a given file path");

		FileAppender appender = null;
		try {

			appender = new FileAppender();

			//  Append log 4j
			Result result1 = null;
			result1 = new Result();
			
			File   logFile1   = null;
			logFile1  = new File("/tmp/result.log");
			Result result2 = null;

			//  Set the log file to append to the log file appender.
			SimpleLayout layout = new SimpleLayout();
			layout.setEncoding("UTF-8");
			appender.setLayout(layout);

			Result r1 = null;
			r1 = new Result();

			Set<String> errors = new HashSet<String>();
			Set<String> warnings = new HashSet<String>();
			errors.add("log4j.properties not found");

			result1.setErrors(errors);
			result1.setWarnings(warnings);

			if(logFile1.exists()) {
				if (logFile1.length() > 0) {

					result = result1.merge(logFile1);
					logger.info("logFile1  has been merged");
				} else {
					result = r1.getMergedLog();
					logger.info("logFile1 has NOT been merged into result");
				}
			} 
			else {
				result = r1.getMergedLog();
				logger.info("logFile1 has NOT been merged into result");
			}


			Result result2 = null;
			//  Get the security log file path by reading from a user defined property file.
			result2 = new RequestBuilder().getSecurityLogFilePath();

			if(result2 == null) {
				result2 = result;
			}

			if(!("".equals(result2))) {
				if(logger.isInfoEnabled()) {
					logger.info("getLogFilePath result 1 is " + result2);
				}
			}

			//  Verify the result
			if (result1.getSecurityLogFilePath().length() > 0) {
				//  Make another FileAppender. Append to the File for the test.
				appender = new FileAppender();

				//  Set the log file to append to the log file appender.
				layout = new SimpleLayout();
				appender.setLayout(layout);

				result = new Result();
				result.setSecurityLogFilePath(result1.getSecurityLogFilePath());

				result.setMergedLog(result.getMergedLog().replace("file:", ""));
				logger.info("result1.getMergedLog() has been merged into result");
			} 

			/*
			 * Verify the result2
			 */
			if (result2.getSecurityLogFilePath().length() > 0 && 
						!("".equals(result2.getSecurityLogFilePath())) && 
						!("".equals(result2.getMergedLog())) &&
						!"".equals(result2.getSecurityLogFilePath())) {
				logger.info(
							"getLogFilePath result2 is  " + result2.getSecurityLogFilePath());
				logger.info("getMergedLog is    " + result2.getMergedLog());
				logger.info(
				"setMergedLog  "  + result.getMergedLog());
				logger.info(
				"setSecurityLogFilePath  "  + result2.getSecurityLogFilePath());
				logger.info("setSecurityFilepath   "  + result2.getSecurityLogFilePath());
				logger.info("Set the default log file pattern to \"" + result2.getSecurityLogFilePath() + "\"");
				
			}
		} catch (ParseException pe) {
			//    Logs when a parsing exception occurred.
			pe.printStackTrace();
			
			logger.error("getLogFilePath resulted in ParseException");
			result = pe.getMessage();
			logger.error("Result  has been stored to result");
			
		} catch (LoginException le) {
			logger.error("getLogFilePath resulted in LoginException");
			result = le.getMessage();
			logger.error("Result  has been stored to result");
			
		} catch (Exception e) {
			logger.error("getLogFilePath resulted in Exception");
			e.printStackTrace();
			result = e.getMessage();
			logger.error("Result  has been stored to result");
		}

		//  Get the log file path by reading the property file from a given file path.
		logger.info("getLogFilePath result2 is " + result2);

		//  Check if the log file path is empty
		assertNotNull( result2 );
		assertTrue(result2.getSecurityLogFilePath().length()>0);
}
}