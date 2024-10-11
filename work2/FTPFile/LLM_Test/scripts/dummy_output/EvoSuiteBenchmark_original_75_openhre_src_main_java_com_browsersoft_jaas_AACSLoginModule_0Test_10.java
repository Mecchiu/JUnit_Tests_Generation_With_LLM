// AACSLoginModule_0Test.java
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
* It contains one unit test case for the {@link AACSLoginModule#login()} method.
*/
class AACSLoginModule_0Test {
		  
    /**
     * Test case where the login fails.
     *
    */
	@Test(expected=FailedLoginException.class)
	public void loginFail() { 

        System.out.println("\n\n### LoginModule_0_Test_1 ### \n");

		// Create LoginContext to run testLoginModule
        final LoginContext lc = new LoginContext("testLoginModule", null);

		// Define callback functions
		final AbstractCallbackHandler acbh = new AbstractCallbackHandler() {
			 public void handle(Callback[] call,
							    		    					String tos,
							    				 	    					Set<String> methods)
								throws IOException, UnsupportedCallbackException {
		     // Callback is the login exception (throws an exception when
		     // user name or password is incorrect).
		     throw new LoginException('1');
	     // Exception will be thrown by the login failure.
		     }
		 };

        // Set the CallbackHandler callback functions
        lc.setCallbackHandler(acbh);

		// Try to log in the user
        lc.login();
	}

  
}