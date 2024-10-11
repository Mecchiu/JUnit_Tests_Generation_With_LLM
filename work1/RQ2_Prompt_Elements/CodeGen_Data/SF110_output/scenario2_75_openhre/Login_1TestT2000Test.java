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

    private static String prop_file_name = "/conf/log4j_log.properties";
    private static String testCaseFile = "../test_data/login_1_basic_auth_checks";

	/** Main method that tests all cases of login from file */
	@Test
    public void loginTest01() throws LoginException, ParseException, ParseException{
	
	    RequestBuilder reqBuilder = RequestBuilder.newBuilder()
	       .withLoginRequestBuilder(FileHelper.fetchResourceAsString(testCaseFile))
	       .withCredentials("browsersoft", "aacs")
	       .withClientCredentials("browsersoft", "AACS")
	       .withResource("http://example.com")
	       .startBuilder();

     // Test with invalid login form element
	reqBuilder = reqBuilder.withLoginRequestBuilder(FileHelper.fetchResourceAsString("/conf/non_exist.log4j.properties"))
	       .withResource("http://example.com");
     assertNull(reqBuilder.endStringBuilder());

	// Test with no login form element
	reqBuilder = reqBuilder.withLoginRequestBuilder(FileHelper.fetchResourceAsString("/conf/login.log4j.properties"))
	        .withResource("http://example.com");
	assertSame(testCaseFile, reqBuilder.endStringBuilder());

	
	// Test with invalid client
	reqBuilder = reqBuilder.withLoginRequestBuilder(FileHelper.fetchResourceAsString("/conf/simple.log4j"));
     assertNull(reqBuilder.endStringBuilder());
	reqBuilder = reqBuilder.withLoginRequestBuilder(FileHelper.fetchResourceAsString("/conf/nonexistent.log4j"));
     assertNull(reqBuilder.endStringBuilder());

	// Test with invalid resource
	reqBuilder = reqBuilder.withLoginRequestBuilder(FileHelper.fetchResourceAsString("/conf/complex.log4j"));
     assertNull(reqBuilder.endStringBuilder());

	// Test with no valid token.  Check login and password for the client creds and resource.  Also, validate login and password.
     reqBuilder = reqBuilder.withLoginRequestBuilder(FileHelper.fetchResourceAsString("/conf/expired_token.log4j"));
     assertEquals(testCaseFile, reqBuilder.endStringBuilder());


	// Test with valid login
	// Test with client credentials.  Check login for the client creds and resource.  Also, validate login and password.


     reqBuilder = reqBuilder.withLoginRequestBuilder(FileHelper.fetchResourceAsString(testCaseFile));
     
     String password = "password";
     // Test with login as client credentials
     reqBuilder = reqBuilder.withClientCredentials("browsersoft",password);
     assertEquals("password",reqBuilder.endStringBuilder().getValue());
     // Test with login as invalid credential credentials.  Test with empty username and password.
     String invalid_cred="password";
     reqBuilder = reqBuilder.withLoginRequestBuilder(invalid_cred);
     assertEquals("password",reqBuilder.endStringBuilder().getValue());
     
	 }
	
	
}
/*
 * Log4j Config File is stored in 
 * /user/sc/aacs/xacml/aacs_lib/target/testcase/log4j_log.properties
*/
