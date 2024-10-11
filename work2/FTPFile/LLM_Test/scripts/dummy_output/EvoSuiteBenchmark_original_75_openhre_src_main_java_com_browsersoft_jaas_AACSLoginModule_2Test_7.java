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
		/**
     * Testcase 1.
		 * The LoginModule implementation of this method must
		 * properly be called, and correctly set the state
		 * of the LoginModule.
		 *
   		 * <p/> The LoginModule implementation is invoked by <code>LoginModule.login()</code>.
   		 * To be the case, this LoginModule does <b>not</b> need
   		 * to set or change the state of the LoginModule, as
   		 * the state will be properly updated by the
   		 * LoginModule implementation.
   		 *
   		 * @param subject  the login subject
   		 * @param credentials the credentials used to login.
    */
static void test_1_login_login_failures(Subject subject, CallbackHandler callback)
        throws LoginException {
        // Invoke the method twice, one by setstate, and one by calling
        // the method.  As the login object must set or remove the state,
        // the login object's login method must be called.

        callback.handle(null);
        callback.handle(null);
		try {
			callback.handle(null);
			fail("unexpected success");
		} catch (Exception e) {
			assertTrue(e instanceof LoginException);
		}
		callback.handle(null);
		subject.getPrincipals().clear();
		// Since we didn't even call on logout before, the callback
		// must have been set to a non-null value.
		assertTrue(callback instanceof LoginCallback);
		assertEquals(1, subject.getPrincipals().size());
		assertTrue(subject.getPrincipals().contains(AACSLoginModule.LOGIN_PRINCIPAL.getName()));

	}

	static Subject logged_user, password_user, otherUser, test_user;

		/**
     * Testcase 2.
		 * The Login module is invoking <code>abort()</code>.
		 * The state of the LoginModule must be properly set by
		 * the method call after this method call.
		 *
   		 * The Login module's <code>abort()</code> method must not
    * fail.
   		 *
   		 * It is expected that, on the first invocation, the state
   		 * of the LoginModule must be initialized with <code>getLogin</code>
   		 * pointing to the <code>LoginModule</code>s implementation.
    *
    * @throws LoginException
		 *   If a specified error occurs.
*/

static void test_2() throws LoginException {
  try {
    getLogin().login(getCR(), "password");
  } catch( UnsupportedCallbackException ucbe ) {
    ucbe.printStackTrace(System.err);
    fail("Should have thrown exception");
  } catch (LoginFailedException failed) {
    // Success: logon failed
  }		
}
	/**
* <p>Testcase - aaci.login
*/
@Test
public void test_login() throws LoginException {
	logged_user = new Subject();
	try {
						login_password_login_failures(logged_user, null);	// Login fails

	// success
				fail("login_login_failures succeeded");
	} catch (Exception exception) {
		// success
	}

	// login fails
				fail("login_failures succeeded");

	/**
* <p>Testcase - two user
*/
	try {
		getCR1().login(getCR(), "password");
		// success
				fail("getCR_login_failures succeeded");
	} catch (Exception e) {
				assertTrue(e instanceof LoginException);
	}

	// login_login_failures succeeded
		// success


	/**
* <p>Testcase - login succeeds
*/

	try {
		getCR().login(getCR1(), "password");
		// success
				pass("successful login successful");
	} catch (Exception e) {
				assertTrue(e instanceof LoginException);
	}
}
	public static String[] configuration = new String[] {"-a", AUTH_PARAMCOUNT, "+a", new String[] {
        AACSLoginModule.PASSWORD_KEY, AUTH_CREDCOUNT
   }};

	static final int	AUTH_PARAMCOUNT = 6;
	static final int	AUTH_CREDCOUNT = 1;

	public static void main(String[] args) {
		try {
			for (int i = 0; i < configuration.length; i++) {
				AACSModule module = null;
				if (configuration[i] == "+a") {
					module = new AACSLoginModule_2();
				} else {
					module = new AACSLoginModule();
				}
				module.configure(configuration[i]);
				module.initialize(AUTH_PRINCIPAL.getName(), PASSWORD.getName());
				module.configure(configuration[i]);
				AACSLoginModule.test_login();
				if (!module.isLoginActive) {
					throw new RuntimeException(module.getLoginModuleDescriptor() + " login is disabled");
				}
			}
		} catch (Exception e) {
			System.out.println("Exception "+e.getMessage());
			e.printStackTrace(System.out);
		}
	}

 	public static AuthPermission[] getLoginModuleAuthenticationPermissions() {
}
}