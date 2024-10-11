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
public final void test() throws Exception {

			String loginId = "TestLoginID_12";
			String password = "1234567890";
	
			File appFile =  new File("src/main/java/com/browsersoft/aacs/xacml/xacml2xacml.conf");
			FileAppender appender = new FileAppender();
			appender.activateOptions();
			appender.setPrefix("\n\t\t\t\t\t");
			appender.setFile(false, appFile.getAbsolutePath(), true);
					appender.append(new Logger.Log4JLogger(Login.class.getName()), "root");
			Logger root = Logger.getRootLogger();
	
			// Create the loggers
	
			Logger log = root.getLogger("testAppenderFactory");
			Logger log1 =  new Logger("testAppender1Factory", "root");
	
	
			// Log the initialization - this has the side effect of creating
			//   another XML configuration file containing the same
			//   configuration variables as the last file in the Log Manager

			XACML_LOG.infoLogMessage("\nLogin Test: starting the xacml configuration and init");
	
			XACML_LOG.infoLogMessage("Setting Properties");
			log.info(XACML_LOG.infoLogMessage("Setting Properties"));
	
			XACML_LOG.assertLogMessage(XACML_LOG.INFO, "login_password_mismatch",
				"password", password, null);
			XACML_LOG.assertLogMessage(XACML_LOG.INFO, "login_id_mismatch",
				"loginId", loginId, null);
	
			XACML_LOG.assertLogMessage(XACML_LOG.INFO, "calling getProps()",
				"id_token", loginId, "<null>");
	
			XACML_LOG.infoLogMessage("Log in with password");
	
	
	try {
			
			XACML_LOG.infoLogMessage("Started successfully");
	
			// Check if we have the required parameters
	
			Set<String> requiredParams = new HashSet<String>();
	
			requiredParams.add("id_token");
	
			XACML_LOG.assertLogMessage(LogManager.AUTHENTICATION, "xacml_requiredParams",
				requiredParams);
	
	
	
			// Login
	
	
	
			// check the parameters are correct
	
			Iterator <String> expectedParams = 
		new HashSet<String>(Login.getProps().stringPropertyNames())
			.iterator();
			
			Set<String> expectedParam = new HashSet<String>();
			Iterator <String> actualParam = 
		requiredParams.iterator();
			
			//check that id_token variable is present
	
			expectedParam.add("id_token");
	
			actualParam.next();
	
			actualParam.hasNext();
	
			// the expected params should be correct
	
			while (expectedParam.iterator().hasNext()) {
				
				boolean found = false;
				
				String expectedName = expectedParam.next();
	
				Set<String> expectedValue;
	
				while(expectedParams.hasNext() &&! found) {
		
					expectedValue = 
		new HashSet<String>();
		
					expectedParam.next();
	
					expectedValue.add(expectedName);
					
		}

	
				XACML_LOG.infoLogMessage(	
					"The expected param names and variables is " + expectedParam.toString());
	
	
				Set<String> expectedVar = new HashSet<String>();
	
				expectedValue = 
		new HashSet<String>();
	
				expectedParam.next();
		
				System.out.println("expected variable is " + expectedParam.next());
	
	
				//check if we have the correct value for the variable
	
				expectedValue.add(expectedName);
	
				found = expectedParam.hasNext();
	
				XACML_LOG.assertLogMessage(LogManager.AUTHENTICATION, "expectedVar",
					expectedVar, expectedValue);
	
	
	
				// check for the expected value
	
				XACML_LOG.assertLogMessage(LogManager.AUTHENTICATION, expectedParam.next(), expectedVar);
	
	
				actualParam.next();
	
				actualParam.hasNext();
	
				found = false;
				while(actualParam.hasNext() &&! found) {
		
					found = 
	new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS-")
	.parse(actualParam.next())
					.after(expectedParam.next())
					.equals(expectedValue);
		
					System.out.println("actual param is " + actualParam.next());
		
					expectedValue.add(actualParam.next());
		
					XACML_LOG.infoLogMessage("the expected value is " + expectedValue);
	
				}

}
	}
		
}
