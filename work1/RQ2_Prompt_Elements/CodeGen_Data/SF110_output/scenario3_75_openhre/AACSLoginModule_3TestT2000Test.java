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
private AuthGroup grp;
		
		private static final PasswordAuthentication pass = new PasswordAuthentication("test", "test");
					 

	/**
	 * test method.
	 */
	@Test
	void testLogin() throws LoginException {
					
		//create a new instance.
		login = new Login(new Logout(new PasswordLogoutManager(new Login.Manager() {
						public boolean isSynchronous() {
							return true;
						}
						public void stopLogout() {
						}
						public void stopLogout(String user, String login, List<KeyToken> keys) throws IOException,LoginException {
						}
						public KeyToken obtainKey(String user, String password) throws LoginException {
							return null;
						}
		}), pass));
					
		//inject the authentication mechanism.
		grp = new AuthGroup(new Login.Manager() {
				public void stopLogout() {
				}
				public void stopLogout(List<KeyToken> keys) throws IOException,LoginException {
				}
				public KeyToken obtainKey(List<KeyToken> keys) throws LoginException {
					return keys.get(0);
				}
		}, login, null);
		grp.addCallbackHandler(new MyLoginCallback(null, null));

		//test basic login.
		log(null, "Basic test", null, "user1", new String("user1"), new String("password1"));

		//test that login method returns null.
		AuthResult result =  login(null, new Callback[] {new MyLoginCallback(null, null)});
				assertEquals(AuthStatus.SUCCESS, result.get(AuthResult.class));
				assertNull(result.get(CallbackHandler.class).callback[0]);
								
		//test username attribute
		log(null, "testuserattr1", null, "user1", new String("testuserattr1"), null);
		result= login(null, new Callback[] {new MyLoginCallback("testuserattr1", "password1")});
		assertEquals(AuthStatus.SUCCESS, result.get(AuthResult.class));
		assertEquals("testuserattr1", result.get(callback[0]).username);
		
		//test password attribute
		log(null, "testuserattr2", null, "user1", new String("testuserattr2"), new String("password1"));
		result= login(null, new Callback[] {new MyLoginCallback("testuserattr2", "password1")});
		assertEquals(AuthStatus.SUCCESS, result.get(AuthResult.class));
		assertEquals("testuserattr2", result.get(callback[0]).password);
				
		//test that the correct logout happens when a new authentication request has been made
		logout();
				
		//test logging out
		logout = new Logout(new Logout(new Login.Manager() {
				public boolean isSynchronous() {
					return true;
				}
				public void stopLogout() {
				}
				public void stopLogout(String user, String login, List<KeyToken> keys) throws IOException,LoginException {
				}
				public KeyToken obtainKey(String user, String password) throws LoginException {
					return keys.get(0);
				}
		}, login, null));
		grp.addCallbackHandler(new MyLoginCallback(null, null));

		//test basic logout.
		log(null, "Basic test", null, "user1", new String("user1"), new String("password1"));
		logout();
		
		//test that logout does not succeed
		log(null, "Basic test", null, null, new String("user1"), new String("password1"));
		logout();

		//test that exception is thrown on invalid login
		login(new Callback[] {
						new MyLoginCallback(null, new LoginException()),
						new Callback[] {
								new MyLoginCallback(null, new LoginException()),
								new MyLoginCallback(new LoginException(), null)
						}
		})												
	}
}

