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

	private Set<String> groups = new HashSet<String> ();

	private void testCheckOutGroupAndSetLoginMethod (String loginMethod) throws Exception {
		
		//
		// Prepare the LoginModule (or not) to do this action.
		// This method performs the actions of the LoginModule.
		// 
		logout();
		//
		// create a login object and initiate the authentification of the
		// user
		login();
		assertTrue("expecting method to return false", false);
		//

		//
		// Create a LoginModule with an optional group name.
        //
        LoginModule
        new LoginModule(System.getProperty("AACSLoginModule.AASSLoginModule.DEBUG")
                                            == "true")
        {
            public void initialize(Subject subject, CallbackHandler cbh,
                                    Map<String,?> sharedState, Map<String,?> options)
            {
                @SuppressWarnings("unchecked")
                List<String> groups = ((ArrayList<String>)options.get(
                                                                 LoginModule.PARAM_REALM_GROUPS));
                String realmNames = null;

                //
                // When the parameter "REALM_GROUPS" is non-null,
                // it will be the array of strings passed into the method parameters.
                //
                if (realmNames == null) {
                    realmNames =
                    new ArrayList<String> (Arrays.asList (groups.toArray()));
                } else {
                    realmNames = groups.toArray()[0]; // the single element
                }

                groups.add(realmNames);

                groups.add("group0"); // for testing
            }
            private int
            getLoginResult(CallbackHandler cbh,
                                        String loginMethod, String loginName, Map props)
            {
                return ((LoginCallbackHandler) cbh).success(loginMethod, loginName,
                                                               props);
            }
        };
		//
		// Do the login action.
		//
		assertEquals("User method not properly invoked",true,"");
	}

	@Test
	public void testCheckOutGroups () throws Exception {
		//
		// if the PASSWORD field is empty, it means PASS or PWD
		testCheckOutGroupAndSetLoginMethod("PASS");
	}

        @Test
	public void testCheckOutGroupAndSetLoginMethod_NoGroup () throws Exception {
		//
		// if the PASSWORD field is not empty, it means PASS
		testCheckOutGroupAndSetLoginMethod("PWD");
	}

	@Test
	public void testCheckOutIncorrectLogin () throws Exception {
		//
		// invalid method
		//
		try
        {
            // if an invalid method is specified,
            // the LoginModule will throw an exception
			this.testCheckOutGroupAndSetLoginMethod(LoginModule.LOGIN_FAILURE_PATH);

        } catch (LoginException le) {
       
           @SuppressWarnings("unchecked")
           List<String> groups = rethrowLoginException(((ArrayList<String>)groups.get(0)), le);
           assertTrue("error logged as failure",
                           (groups.get(0).equals("LoginModule.FAILURE") ||
                           groups.get(0).equals("LoginModule.EXCEPTION")));
        }

		//
		// PASS
		//
		testCheckOutGroupAndSetLoginMethod("PASS");
	}

}
