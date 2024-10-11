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
		
	private final Set<String> loginFailures = new HashSet<String>();

	@Test
	void testBadParamLoginFailOnLogin() throws LoginException {

	}
	
	/**
	 * This tests to ensure that login failures are logged in a manner that allows the
	 * login handler to perform login without an initial credential attempt. 
	 */

	@Test
	public void testLoginFailWithInvalidConfig() throws LoginException, ParseException {

		Properties props = getProps();
		props.put("logFile", new File("/tmp/test.log"));
		StringTokenizer st = new StringTokenizer(
		    props.getProperty("config.failure.login.invalid.login.file-extended"),
		    ",");
		props.put("config.failure.login.invalid.login.file-extended",
		            new File("/tmp/test.log").getAbsolutePath());
		log("Fetch failed by extension: " + st.nextToken().trim());
		log("Invalid configuration: " + st.nextToken().trim());
		
		// Test
		
		this.setLoginState(true, "/tmp/test.log");
		RequestBuilder builder = new RequestBuilder();
		
		RequestCtx ctx = builder.setResource("/tmp/test.login").build();
	
		// Fail the user
		ctx = RequestCtx.create(ctx, RequestCtx.Type.HTTP);
		
		ctx = RequestCtx.create(ctx, RequestCtx.Type.POST_FORM_URLENCODED);
		ctx = RequestCtx.create(ctx, RequestCtx.Type.CONNECT_HEADER);
		ctx = RequestCtx.create(ctx, RequestCtx.Type.POST);
		ctx = RequestCtx.create(ctx, RequestCtx.Type.POST_DATA);
		
		// Make the POST data contain a password containing
		//  some invalid characters
		String postData = "This is something that should fail.".trim();
		
		FileAppender appender = new FileAppender(postData, SimpleLayout.getLayout());
		appender.setName("log");
		ctx = RequestCtx.create(ctx, RequestCtx.Type.POST_DATA);
		appender.addAppender(ctx);
		postData = "[" + postData + "]";
		ctx = RequestCtx.create(ctx, RequestCtx.Type.POST);
		appender.addAppender(ctx);
		
		String content = PostRequestHandler.encodePostData(postData.trim());
		
		ctx = null;
		Login handler = new Login();
		
		int countFailures = 0;
		
		while (countFailures < 3) {
			loginFailures.add(String.valueOf(countFailures));
			
			// Log the request
			ctx = login(handler.getClass().getCanonicalName(),
			            new File("/tmp/test.log"), ctx,appender, content);

			// Ensure we never see a login failure
			assertFalse(countFailures++);
			
			// Ensure that the login handler has attempted an attempt
			//   to login with invalid credentials
			assertTrue(isLoginState(true));
			
			ListLogger.getLogger().fireLogEvent(handler.getClass());
			
			// We can keep going as long as the login handler has worked
			if (countFailures > 100) {
				break;
			}
		}
		
		// Test
		
		assertFalse(countFailures > 100);
		
		ListLogger.getLogger().assertLog("Failed login: "+
		    LoginEx.getLogger(this.getClass().getCanonicalName()).
		    findLastLogEntry(LoginEx.Level.WARN).trim());
	}
	
	@Test
	public void testLoginFailWithNoInvalidCredentials() throws LoginException {
	
		Properties props = getProps();
		props.put("config.failure.login.username", "javafx"); //
		props.put("config.login.timeout", "300000"); //
		props.put("config.failure.login.max.fail.time", "80000"); //
		
		// Setup the props and the builder
		RequestBuilder builder = new RequestBuilder();
		log(builder.setResource(new File("/tmp/test.login")));
		RequestCtx ctx = builder.setResource("/tmp/test.login").build();
	
		// Make a ctx that will fail login attempt for a failure, but the
		//  logging should not fail
		TestUtil.setLoginState(true);
		RequestCtx ctx = login(LoginEx.getLoginHandlerClass(),
		                          new File("/tmp/test.log"), 
		                          ctx);
	
		// Make sure a request did not fail by specifying a blank username, 
		// as a config parameter
		
		try {
			log("Fetch succeeded with an empty username");
			fail("Expected a login failure.");
		} catch (LoginException e) {
			assertTrue(e.getMessage().contains(
			            "LoginException: The user name parameter sent "
			                            +"could not be found"));
		}
		
		ListLogger.getLogger().fireLogEvent(handler.getClass());
	}
	
	/**
	 * @param f The file to write out to
	 * @param level the formatting level
	 * @param t The log entry to write out
	 */
	
	private void log(StringWriter t, String level,
	    String format, String msg) {
	
}
}