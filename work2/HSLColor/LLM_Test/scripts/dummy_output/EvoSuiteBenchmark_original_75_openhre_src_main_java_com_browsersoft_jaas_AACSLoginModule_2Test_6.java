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
	 * <p> This method is called by the
	 * {@link #abort} method after a successful authentication occurs.
	 *
	 * @param state the private state saved by the
	 *		   LoginModule's {@link #login()} method.
	 * @param user the username associated with the state.
	 * @param password the password associated with the state.
	 * @return the state, saved by the <code>login()</code> method.
	 * @exception LoginException if the abort fails.
	*/
	private LoginState loginState(Map state, String user, String password) throws LoginException {
		return new LoginState(user, password);
	}
	 
	/**
	 * <p> This method checks the state saved by the previous
	 * login method that executed <code>abort()</code>.
	 * The method determines which user the current LoginModule was called for,
	 * and then verifies that the current user was the one passed as 
	 * a parameter.
	 * 
	 * @param cur the user for this test.
	 */
	@Test
	public void checkState(String cur) throws LoginException {
				 
		Map state = loginState( (Map) null, cur, null);

		// check that the LoginModule was called with the correct parameters
		boolean found = false;
		for (Enumeration o = state.keys(); o.hasMoreElements(); ) {
				String key = (String)o.nextElement();
				if (key.toLowerCase().startsWith("testUser") ) {
					assertTrue("testUser was not retrieved", key.equals(cur));
					found = true;
				}
		}

		// check that the state did not change anymore, as the previous
		// login method logged in the state
		if (!found)  			fail("testUser was restored");
	}
     
	@Test
	public void checkStateNoUser() throws LoginException {
		 Map state = loginState( (Map) null, null, null);

		 // check that the LoginModule was called with the correct parameters
		 boolean found = false;
		for (Enumeration o = state.keys(); o.hasMoreElements(); ) {
			String key = (String)o.nextElement();
			System.out.println("testUser was not retrieved");
			if (key.toLowerCase().startsWith("testUser")) {
				assertTrue("testUser was not retrieved!", key.equals(null));
				System.out.println("testUser was retrieved:" + key);
				found = true;
			}
		}
		assertTrue("testUser was not retrieved yet!", found);
	
	}
	
	@Test
	public void checkStateNoPassword() throws LoginException {
		 Map state = loginState( (Map) null, null, null);

		// check that the LoginModule was called with the correct parameters
		boolean found = false;
		for (Enumeration o = state.keys(); o.hasMoreElements(); ) {
			String key = (String)o.nextElement();
			if (key.toLowerCase().startsWith("testUser")) {
				System.out.println("testUser was not retrieved");
				assertTrue("testUser was not retrieved!", key.equals(null));
				System.out.println("testUser was retrieved again:" + key);
				found = true;
			}
		}
		assertFalse("testUser was retrived again!", found);
	}
	 
	private static class Login extends AbstractLoginModule {
		 Login(String name) {
			 super(name);
		 }
		 public void initialize(Subject subject, CallbackHandler callbackHandler, Map sharedState) throws LoginException {
		     }	
		 public boolean login() throws LoginException {
		     return new LoginState("", getPassword());
		 }
		 public boolean commit() throws LoginException, IOException { 
			 return true;
		 }
		 public boolean abort() throws LoginException {
			 return true;
		 }
		 
		 private String getPassword() {
		     User usr = (User) subject.getPrincipals().nextElement();
		     return usr.getPassword();
		 });
	 }
}


// Test the login method

/*
public class AbstractLoginModule {
	public Login authenticate(LoginConfirmation confirm)
			throws LoginException {
		return new LoginState("", "");
	}
	public boolean login() throws LoginException {
		return true;
	}
	public boolean commit() throws LoginException, IOException {
		return true;
	}
	public boolean abort() throws LoginException {
		return true;
	}
	public String getPassword() {
		return null;
	}
	public Map getInitialPrompts() {
		return null;
	}
	public Map getUserPrompts() {
		return null;
	}
	public boolean prompt(Callback[] callbacks, Map session) {
		 return true;
	}
	public boolean prompt(Callback[] callbacks, Map state, Map<String,?> serverData) {
		 return true;
	}	
}
*/