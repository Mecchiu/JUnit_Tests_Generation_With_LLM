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
	* Test method for {@link javax.security.auth.spi.LoginModule#commit()}.
	*/
	@Test
	public void testCommit() {
		Login auth = new Login("admin");
		final LoginModule.CallbackHandler handler = createCallBack();
		SecurityContext[] sc1 = new SecurityContext[] { null };
		try {
			auth.login(sc1);
			fail("Login Module login() should throw LoginException");
		}
		catch (LoginException ex) {
			assertNull(ex.getMessage());
		}
		assertFalse(auth.succeeded());
		try {
			auth.login(new CallbackHandlerImpl());
			fail("Login Module login() should throw LoginException");
		}
		catch (LoginException ex) {
			assertTrue(ex.getMessage().startsWith("Login failed"));
		}
	}

	/**
	* This is an inner class which takes a single parameter (String)
	* and expects it to fail.
	*/
	private class CallbackHandlerImpl implements CallbackHandler {

		/**
		 * @see javax.security.auth.spi.LoginModule#setPrivateCredential(Callback, InputArgument)
		 */
		public void setPrivateCredential(Callback cb,
			InputArgument input) throws LoginException {
		}

		/**
		 * @see javax.security.auth.spi.LoginModule#getPrivateCredential(Callback)
		 */
		public Object getPrivateCredential(Callback c) throws LoginException {
			return null;
		}

		/**
		* @see javax.security.auth.spi.LoginModule#addCallback(javax.security.auth.callback.CallbackHandler)
		*/
		public void addCallback(Callback cb) throws LoginException {
			assertSecurityContextIsValid();
			c.done(cb);
		}

		/**
		* @see javax.security.auth.spi.LoginModule#beforeLogin()
		 */
		public void beforeLogin() throws LoginException {
		}

		/**
		* @see javax.security.auth.spi.LoginModule#logout()
		 */
		public void logout() throws LoginException {
			assertTrue("Not expecting a logout", afterLogout());
		}

		/**
		 * @see javax.security.auth.spi.LoginModule#assertSecurityContextIsValid()
		 */
		public void assertSecurityContextIsValid()
			throws LoginException {
		}

	}

	
	// A trivial example that can be used to validate that the login module correctly
	// detects failures when not logging in the subject.
	private boolean assertTrue(String s) {
		assertFalse(s + "not expecting this", afterLogout());
		return true;
	}
	
	private boolean afterLogout() {
		return true;
	}

	// This simple set of login modules is taken from
	// http://stackoverflow.com/a/26276972/87935
	private static final CallbackHandler createCallBack(boolean debug) {
		Callback[] callbacks = new LoginModule.Callback[] { 
		    new Callback[] { 
				new Callback() 
			    {
					public void done(Callback[] callbacks) {
						// This call would be necessary if the LoginModule
						// modified the state.
					}

					public void initialize(Callback[] callbacks, Subject subject) {
					}

					public boolean afterLogin() {
						// This call would be necessary if the LoginModule
						// modified the state.
						return true;
					}

					public boolean login() {
						return true;
					}

					public boolean logout() {
						// This call would be necessary if the LoginModule
						// modified the state.
						return true;
					}

					public boolean assertSecurityContextIsValid() {
						return true;
					}
				}
			}
		};
		return new CallbackHandlerImpl(debug);
	}

}