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
	* Prints out information about the test.
	*/
	@Test
	void shouldPrintInformationAboutTheTest() {
		
		/**
		 * Test the success case:
		 * Test LoginAction.execute() and set a new password.
		 */
		LoginAction.ExecuteAction action1;
		action1 = new LoginAction.ExecuteAction(null);
		assertTrue(action1.hasResult());
		
		/**
		 * Test the fail case:
		 * Test LoginAction.clearFields(); set a different password.
		 */
		LoginAction.ClearFieldsAction action2;
		action2 = new LoginAction.ClearFieldsAction(null);
		assertTrue(!action2.hasResult());
		
		/**
		 * Test the failure case:
		 * Test LoginModule.login(); set a different user.
		 */
		LoginModule.login(new String[0]);
		assertTrue(!action2.hasResult());
		
		/**
		 * Test the failure case:
		 * Test LoginRequest.addUser().
		 */
		LoginRequest request1;
		request1 = new LoginRequest(null);
		assertTrue(!request1.hasResult());
		
		/**
		 * Test the fail case:
		 * Test LoginModule.login(); add another user.
		 */
		LoginModule.login(request1);
		assertTrue(request1.hasResult());
	}
	
	/**
	* Loads a given file.
	*/
	@Test
	void shouldLoadAMap() {
		
		/**
		 * Test the success case:
		 * LoginModule.init();
		 */
		LoginModule.init();
		assertTrue(LoginModule.init().hasResult());
	}
	
	/**
	* @return the description for this module.
	* The description is a string starting with the module name and a blank
	* in the middle.
	*/
	String getDescription() {
		return "This LoginModule is meant to be used inside the test suite.";
	}
	Class<? extends AuthProvider>[] getProviderClasses() {
		return new Class[] {
			PasswordAuthProvider.class,
			CredentialAuthProvider.class,
		};
	}

}