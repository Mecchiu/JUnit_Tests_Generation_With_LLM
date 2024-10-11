// AACSLoginModule_1Test.java
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
* It contains one unit test case for the {@link AACSLoginModule#commit()} method.
*/
class AACSLoginModule_1Test {
		/**
         * This class is a single unit test case for the {@link AACSLoginModule#commit()} method.
         */
        private static class SimpleTestLoginModule extends TestLoginModule {

			private Map<String,?> serverProps = new HashMap<String,?>(1);

			/*
			 * Set up a login module.
			 */
            public void init(LoginContext context) throws LoginException {

            	// Save configuration properties for later use
				serverProps.put(AACSLoginModule.AACSCredentials.PROP_AACSRolePrincipal,
						new String[]{
							AACSLoginModule.AACSLoginModule.AACSRolePrincipalName
						});
				// Set the default user
				try {
					context.getName().toString();	
				}
				catch(LoginException e) {
					// Ignore
				}
				context.setSubject(subject);
			}	

			/*
			 * Handle a successful login
			 */
			public void login(CallbackHandler handler)
				throws LoginException {
				if (handler.getStatus() == Status.SUCCESS) {
					System.err.println("Successfully authenticated");
				}
				else {
					throw new LoginException("Login failed: " + handler.getStatus().name());
				}
			}

                        public void destroy(LoginContext context) {

            		// Set an empty properties for the login module, so 
            		// it is possible to use this LoginModule again
                    try {
                    	context.setLoginModuleSpecificCredentials(
	                		context.getLoginModuleContext().getSubject()); 
                    }
                    catch(LoginException e) {
					// Ignore
			    	}

            		// Free any resources allocated to these credentials
            		context.getName().clear();
            		context.setLoginModuleSpecificCredentials(null);
			}	

		}

		/**
         * This class implements a test case by validating the
         * login and commit method. 
         */
        @Test
        public void test()
            throws LoginException {

            SimpleTestLoginModule test = new SimpleTestLoginModule();
            HashSet credentials = new HashSet();
            credentials.add(AACSLoginModule.AACSCredentials.PROP_AACSRolePrincipal);
            test.login(new MockCallbackHandler(credentials, true));

            // If the login succeeds,
        	if (!test.commit()) {
        		// This should never happen
                throw new LoginException("Commit failed");
        	}
		}
	}

	/**
	 * An example of login module, which doesn't require an explicit LoginContext
	 * and just provides the LoginModule's own authentication of user.
	 */
	class SimpleTestLoginModule_1 extends SimpleTestLoginModule {
	}