// AACSLoginModule_3Test.java
package com.browsersoft.jaas;

import java.util.*;
import java.io.IOException;
import javax.security.auth.*;
import javax.security.auth.callback.*;
import javax.security.auth.login.*;
import javax.security.auth.spi.*;
import com.browsersoft.aacs.Login;
import com.browsersoft.aacs.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AACSLoginModule}.
* It contains one unit test case for the {@link AACSLoginModule#logout()} method.
*/
class AACSLoginModule_3Test {
		
	/**
	 * Test case for the {@link #logout()} method.
	 *
	 * @throws LoginException if the tests failed.
	 */
	@Test
    public void testLogout()  throws LoginException {
		User testUser = new User(User.TestUserName);
		Set<String> properties;

		// Create a new User
		String username = User.TestUserName;
		String password = "1234";
		String domainName = "DOMAIN";
		int port = 1234;

		// Create an empty Subject
		Set<String> subjectProperties = new HashSet<>(4);
		subjectProperties.add("USERNAME=" + username);
		subjectProperties.add("PASSWORD=" + password);
		subjectProperties.add("DOMAIN=" + domainName);
		subjectProperties.add("PROTTCONTEXT=" + port);

		Set<String> principals = new HashSet<>(4);

		// Create a user and a subject
		LoginCallbackHandler loginCallbackHandler = new LoginCallbackHandler();
		LoginContext loginContext = new LoginContext("User", new HashSet<>(Arrays.asList(username + "@"+ domainName)),
                                                                                      LoginContext.STATE_NEW,
				null, loginCallbackHandler);

	    Object result = null;

	    // Get User from UserManager
	    UserManager userManager = SecurityStore.getUserManager();
	    User user = userManager.getUser(testUser);
	    assertNotNull("No user", user);

	    // Logout
	    password = "";//"";
	    properties = user.getProperties();
	    assertEquals(1, properties.size());
	    properties.remove("PASSWORD="+password);
	    assertNull(properties);

	    // Login
	    result = loginContext.login();
	    assertTrue("Login failed", result instanceof java.io.IOException);

	        // Create a new LoginContext
	   // LoginContext loginContext = new LoginContext("User",
	//                                                      new Set(
	//                                                                Arrays.asList(
	//                                                                               username + "@"+ domainName)),
	//                                                                LoginContext.STATE_STARTING, null, null, (CallbackHandler)null);

		// Get User from UserManager

	    //loginContext.login(user);

	    // Get properties
	    properties = user.getProperties();
	    assertTrue(properties.size() == 0);

	    String key = "key";

	    result = loginContext.login(testUser, user.getPrincipal().toString(),
      			                                subjectProperties, null);
	    assertTrue(result instanceof java.io.IOException);
	    assertTrue(user instanceof Login);
	    assertTrue(loginContext instanceof LoginContext);
	    assertTrue(loginContext.getUserProperties().size() == 1);
	    assertTrue(loginContext.getUserProperties().containsKey(key));
	}
}