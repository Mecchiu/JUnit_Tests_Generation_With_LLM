// AACSLoginModule_2Test.java
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
* It contains one unit test case for the {@link AACSLoginModule#abort()} method.
*/
class AACSLoginModule_2Test {
		
    // Test LoginModule with debug option and null-properties.
    private boolean tryCallAgain = true;

    @junit.Test
    /**
     *
     */
    public void testWithDebug() throws Exception {

    	// Create Auth Context for this test.
    	AuthContext authContext =
                    new AuthContext(AuthContext.TYPE_INT_AUTH_CONTEXT, null, null);

    	// Create a call-back for logging in failure.
    	AuthCallback authCallback = new GetUserIdCallback(null, null, null);
    	JAXBContext jaxbContext =
                    JAXBContext.newInstance(com.browsersoft.jakaspinc.aacs.Login.class);
    	LoginCredential loginCredential = new LoginCredential("login", null, null, null, null);
        LoginModuleCallbackHandler callbackHandler = new LoginModuleCallbackHandler(authContext, null, null);
        try {
        	// Use custom login module.
        	CustomLoginModule customLoginModule =
                        new CustomLoginModule(callbackHandler);
        	customLoginModule.login();
        	//
        	// Check to see if the login phase succeeded.
        	//
        	if (tryCallAgain)  {
        		// Should not have logged in and it was successfully.
        		assertFalse("AuthCtx object should not be used by LoginModule.", authContext.isValid());
        		assertNull("LoginContext object should be null for AuthCtx object", authContext.loginContext());
        		assertNull("User object should be null for LoginContext object", authContext.user());
        		assertNull("Password object should be null for LoginContext object", authContext.password());
        		assertTrue("LoginContext object should include both User and Password", authContext.isSetLoginContext());
        		assertEquals("LoginContext object should not include both User and Password", authContext, authContext.loginContext());
        		assertFalse("User object should not include both LoginContext and User", authContext.isSetUser());
        		assertEquals("Password object should not include both LoginContext and Password", authContext, authContext.password());
        		assertTrue("LoginContext object should include both User and Password", authContext.isSetLoginContext());
        		assertNull("LoginContext object should not include both User and Password", authContext.loginContext());
        		assertTrue("User object should have no loginCredential after a refresh()", authContext.loginCredential() == null);
        		// Should not have called commit with loginCredential set to null.
        		fail("LoginContext must not accept null credentials.");
        	}
        } catch (Exception testException) {
        	// Callback should successfully be sent and the LoginException will be used.
        	// Check that the exception message is correct.
        	assertEquals("Wrong exception message",
                    testException.getClass().getCanonicalName() + ": " +
                    testException.getMessage(),
					testException.getMessage());
        	assertNull("LoginException should be null.", testException);
        	//
        	// Check that LoginException wasn't passed to custom login module.
        	assertTrue("AuthCtx object should not be used by LoginException", authContext.isValid());
        	assertNull("LoginContext object should be null for AuthCtx object", authContext.loginContext());
        	assertNull("User object should be null for LoginContext object", authContext.user());
        	assertTrue("Password object should not be null for LoginContext object", authContext.password() == null);
        	assertTrue("LoginContext object should include both User and Password", authContext.isSetLoginContext());
        	assertEquals("LoginContext object should not include both User and Password", authContext, authContext.loginContext());
        	assertTrue("Password object should include both LoginContext and User", authContext.password() == null);
        	assertTrue("LoginContext object should include both User and Password", authContext.loginCredential() == null);
        }
    }
}