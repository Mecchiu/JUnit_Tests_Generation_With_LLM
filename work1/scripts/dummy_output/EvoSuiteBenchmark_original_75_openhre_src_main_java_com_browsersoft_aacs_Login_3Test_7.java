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
		
	/**
	* Test for basic login.
	* It tests to complete the required work by checking
	* both the correct context, the values of {@code host},
	* {@code resource} and {@code request} attributes.
	* The other attributes test are in {@link Login}.
	*
	* @throws LoginException thrown when the operation fails
	*/
	@Test
	void basicTest() throws LoginException {
		
		// Define a test with an "unauthentic" policy of the form

		RequestBuilder builder = new RequestBuilder();
		RequestCtx context = builder.createAuthSystemRequest();
		
		// Set the server policy
		context.setPolicy(new BasePolicy().buildPolicy());

		// Set the PolicyName
		context.setPolicyName("unauthentic-server-policy");
		
		// Set the Server
		StringTokenizer st = new StringTokenizer("unauthentic-server");
		st.nextToken();
		context.setServer(st.nextToken());

		// Set the ServerTimezone
		StringTokenizer stzt = new StringTokenizer("unauthentic-server-tz");
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		c.set(Calendar.ZONE_OFFSET, stzt.nextToken().length());
		c.set(Calendar.DST_OFFSET, stzt.nextToken().length());
		context.setServerTimezone(c);

		// Set the PolicyPath
		context.setPolicyPath(BasePolicy.findPath());

		RequestStarter starter = new RequestStarter();
		starter.setFilePath(new File("./log4j.properties"));

		context.setRequestStarter(starter);

		request(context, "unauthentic-request-path");

		boolean authenticated = authenticate(true);

		assertNotNull("authenticated is null", authenticated);

		context = null;
	}
	
	RequestBuilder newRequestBuilder(String policyName, String service, Date request) {
        RequestBuilder builder = new RequestBuilder(new PropertySource(policyName, service));
        builder.setRequest(request);
        return builder;
    }

    private boolean authenticate(boolean checkPassword) throws LoginException {
        setHost("authenticate");

        if (checkPassword) {
            String password = "password";

            Properties values = new Properties();
            values.put("base64Password", password);

            new File("log4j.properties").deleteOnExit();

            RequestCtx context = null;
            RequestBuilder builder = newRequestBuilder("unauthentic", "unauthentic", new Date());
            builder.setValue("password", values, context);

            context = builder.createAuthSystemRequest();
            assertNotNull("unauthentic cannot perform authentication", context);
            log.info(context);
            return true;
        } else {
            throw new LoginException("This platform does not support login via Password");
        }
    }

	/**
	* Test for {@link Login#authorize()} using a {@code Host}
	* of {@code unauthentic-server-policy}.
	* This method will test the following cases:
	* Case where {@code unauthentic-server-policy} has the form "<hostName> unauthentic-server-policy".
	* It will test:
	* Case where {@code host} contains a {@code "unauthentic"} (i.e. {@code
	* unauthentic-server-policy})
	* Case where {@code request} contains value of {@code "unauthentic-request-path"} (i.e.
	* {@code unauthentic-server-policy}}
	*
	* It will set the {@code host} attribute of "request" to {@code "unauthentic-server-policy"
	* in accordance to the "Host" value, but otherwise make sure the value can't be {@code null}
	* since a {@code null} "Host" attribute will cause the property is never set.
	* Then, this set attribute will be checked.
	*
	* {@link #request(RequestCtx, String)} performs its corresponding test as well and,
	* the actual value of {@code request} will not be checked and the attribute is always set
	* to {@code "unauthentic-server-policy"}.
	*
	* @throws LoginException thrown when the operation fails
	*/
	@Test
	void login_2() throws LoginException {
		
		// Define a test with an "unauthentic" policy of the form

		setHost("unauthentic");
		
		String policyName = "unauthentic-server-policy";
		
		new File("log4j.properties").deleteOnExit();
		
		RequestBuilder builder = new RequestBuilder(new PropertySource(policyName, null));

		builder.setRequest("unauthentic-request-path");

		RequestCtx context = builder.createAuthSystemRequest();
		assertNotNull("unauthentic cannot perform authentication", context);
		context.setHost("unauthentic-server-policy");
		
		login();

		assertNotNull("The attribute " + policyName + " has no value", request("unauthentic-request-path"));

		Context contextRead = request(context, policyName);
		assertNotNull("The attribute " + policyName + " has no value", contextRead);

		String host = contextRead.getHost();

		contextRead = login();
		assertNull("The attribute " + policyName + " has value: " + host, contextRead);

		context = null;
		builder = newRequestBuilder(policyName, null, null);
		builder.setRequest("unauthentic-request-path");

		contextRead = login();
		context = contextRead;
		contextRead = null;

		builder = new RequestBuilder(new PropertySource(policyName, null));

}
}