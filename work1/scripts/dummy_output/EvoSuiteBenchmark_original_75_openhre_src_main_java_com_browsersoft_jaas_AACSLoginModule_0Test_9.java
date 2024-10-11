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
		* Test method for {@link com.browsersoft.jaas.AACSLoginModule#login()}.
		* @throws FailedLoginException throws if this test is not succeeding or failing.
	*/
    @Test
    public void testLoginModule() throws FailedLoginException {
    	System.err.println("Test of "+getName());

			// TestLoginModule

			boolean result = true;
			Login login = new Login(new TestCallbackHandler());
			try {

					// TestLoginModule login.login() 
				// - TestLoginModule login_default.properties
			result &= checkLogin(login.login(defaultPropertySet(login)));

				// TestLoginModule login_with.properties
			result &= checkLogin(login.login(withPropertySet(login)));

				// TestLoginModule login_with_debug.properties
			result &= checkLogin(login.login(withDebugPropertySet(login)));

				// TestLoginModule login_with_properties.properties
			result &= checkLogin(login.login(withPropertiesPropertySet(login)));

				// TestLoginModule login_with_options.properties = true
			result &= checkLogin(login.login(withOptionsPropertySet(login)));

				// TestLoginModule login_with_options.properties
			result &= checkLogin(login.login(withOptionsPropertySet(login)));

				// TestLoginModule login_with_options.properties = false 
			result &=!checkLogin(login.login(withOptionsPropertySet(login)));
      } catch (java.security.LoginException le) {
			result = false;
			throw le;
		} catch (Exception ex) {
			throw new LoginException("Test failed: " + String.valueOf(ex));
		}
    }

		private SecurityPermission loginWithSecurityPermission = new SecurityPermission("login.login(");

		private SecurityPermission loginWithOptionsSecurityPermission = new SecurityPermission("login.login(");

		private boolean checkLogin(boolean loginValid) throws LoginException {
			if (loginValid)
				return true;
			else
				throw new LoginException("Failed!");
    }

		private boolean checkLogin(boolean loginValid, String debugMessage, boolean required)
				throws LoginException, FailedLoginException {
			if (loginValid)
					return true;
			else
			if (required)
					throw new FailedLoginException(debugMessage);
			else
			throw new LoginException("Failed!");
    }

}