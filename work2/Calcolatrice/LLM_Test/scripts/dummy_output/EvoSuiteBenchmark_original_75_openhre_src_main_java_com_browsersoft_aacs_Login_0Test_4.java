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
	 * Test method.
	 * @throws LoginException LoginException
	 
	 */
	@Test
	public void getProps() throws LoginException {
		// Create the log with null as default logger
		/*
		final Date date = new Date();
		final String timestamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'SSSZZZ'").format(date);
		final String className = "com.browsersoft.aacs.domain.Log";
		final String username = "";
		final String password = "";
		Logger logger = Logger.getLogger(className);
		log(logger, level.INFO, timestamp, className, username, password, level.DEBUG, "", null, null);
		*/
		// Create the test configuration
		Properties props = new Properties();
		
		
		// Write configuration properties
		props.put("Logger", "Logger");
		props.put("className", "com.browsersoft.aacs.domain.Logger");
		props.put("logger", null);
		String username = "Test@Test";
		String password = "a0-test";
		String timestamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z']'SSSZZZ'").format(new Date());
		
		Logger logger = Logger.getLogger(props.getProperty("className"));
		log(logger, level.INFO, timestamp, props.getProperty("className"), username, password); 
		
		
		// Create the test configuration
		props.put("Logger", "Logger");
		props.put("className", "com.browsersoft.aacs.domain.Logger");
		props.put("logger", Logger.getLogger(props.getProperty("className")));
		props.put("username", username);
		props.put("password", password);
		props.put("level", "INFO");
		String timestamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z']'SSSZZZ'").format(new Date());
		
		log(logger, level.INFO, timestamp, props.getProperty("className"), username, password); 
		
		
		// Get the props that are required by the test code
		props = getProps(new String[] {"Logger", "className", "username", "password"} );
		// Create a Configuration Properties object and save it, then use the new Properties object 
		// to create a Config file 	
	
		// create the configuration file 
}
}