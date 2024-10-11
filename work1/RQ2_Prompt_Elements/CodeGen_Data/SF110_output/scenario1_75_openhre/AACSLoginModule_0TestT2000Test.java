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
// AACSLoginModule.java
package com.browsersoft.jaas;

import java.util.*;
import java.io.IOException;
import javax.security.auth.*;
import javax.security.auth.callback.*;
import javax.security.auth.login.*;
import javax.security.auth.spi.*;
import com.browsersoft.aacs.Login;
import com.browsersoft.aacs.User;

/**
 * <p> This sample LoginModule authenticates users with a password.
 *
 * <p> This LoginModule only recognizes one user:	testUser
 * <p> testUser's password is:	testPassword
 *
 * <p> If testUser successfully authenticates itself,
 * an <code>AACSPrincipal</code> with the testUser's user name
 * is added to the Subject.
 *
 * <p> This LoginModule recognizes the debug option.
 * If set to true in the login Configuration,
 * debug messages will be output to the output stream, System.out.
 *
 * <p> The config option specifies the AACS Properties file,
 * without the assumed ".properties" suffix.
 *
 * @version $Id: AACSLoginModule.java,v 1.1 2006/11/06 19:52:19 grodecki Exp $
 */
public class AACSLoginModule implements LoginModule {

    public boolean login() throws LoginException {
        if (debug)
            System.out.println("AACSLoginModule login() called");
        // prompt for a user name and password
        if (callbackHandler == null)
            throw new LoginException("Error: no CallbackHandler available " + "to garner authentication information from the user");
        Callback[] callbacks = new Callback[2];
        callbacks[0] = new NameCallback("user name: ");
        callbacks[1] = new PasswordCallback("password: ", false);
        try {
            callbackHandler.handle(callbacks);
            username = ((NameCallback) callbacks[0]).getName();
            char[] tmpPassword = ((PasswordCallback) callbacks[1]).getPassword();
            if (tmpPassword == null) {
                // treat a NULL password as an empty password
                tmpPassword = new char[0];
            }
            password = new char[tmpPassword.length];
            System.arraycopy(tmpPassword, 0, password, 0, tmpPassword.length);
            ((PasswordCallback) callbacks[1]).clearPassword();
        } catch (java.io.IOException ioe) {
            throw new LoginException(ioe.toString());
        } catch (UnsupportedCallbackException uce) {
            throw new LoginException("Error: " + uce.getCallback().toString() + " not available to garner authentication information " + "from the user");
        }
        // print debugging information
        if (debug) {
            System.out.println("\t\t[AACSLoginModule] " + "user entered user name: " + username);
            System.out.print("\t\t[AACSLoginModule] " + "user entered password: ");
            for (int i = 0; i < password.length; i++) System.out.print(password[i]);
            System.out.println();
        }
        // verify the username/password
        login = new Login(username);
        login.setPassword(new String(password));
        user = login.authenticate();
        if (user!= null) {
            if (debug)
                System.out.println("\t\t[AACSLoginModule] " + "authentication succeeded");
            succeeded = true;
            return true;
        } else {
            // authentication failed -- clean out state
            if (debug)
                System.out.println("\t\t[AACSLoginModule] " + "authentication failed");
            succeeded = false;
            username = null;
            for (int i = 0; i < password.length; i++) password[i] ='';
            password = null;
            throw new FailedLoginException("Login Incorrect");
        }
    }
}

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
	 * No tests to run.
	 */
	@Test public void noTests() {
	}
	
	/** 
	 * Returns the configured username.
	 * @return "testUser"
	 */
	public String getUsername() {
		return username;
	}
	
	/** 
	 * Returns the configured password.
	 * @return "testPassword"
	 */
	public char[] getPassword() {
		return password;
	}
	
	/** Test method for {@link AACSLoginModule#login()}.
	 * This test uses the LoginModule.login() but does not make calls to the provider. */
	@Test public void testNullLoginModule() {
		String authname = "testUser";
		// login with no user name
		Login.login(authname, null);
		User user = new User(authname);
		// login with user name different than testUser
		try {
			Login.login(authname, new char[]{'y','o'});
			fail("LoginException not thrown");
		} catch (LoginException le) {
			// TODO Auto-generated catch block
			le.printStackTrace();
			// ok
		}
	}
	
	/** Test method for {@link AACSLoginModule#LoginAuthentication}.
	 * This test runs the test without a PasswordCallback parameter.
	 * The expected outcome is that Login.authenticate() fails. */
	@Test public void testLoginFailure() {		
		// login with a null password
		login = new Login(null);
		login.setPassword(new char[0]);
		fail("LoginException does not throw, Login module returned null password");
	}
	
	/** Test method for {@link Login#authenticate(String)}.
	 * This test runs the test using a null user name.
	 * No exceptions are thrown. We should be able to complete the test without any issues. */
	@Test public void testNullUser() {		
		// authenticate with a null user name
		login = new Login(null);
		try {
			login.authenticate(null);
			fail("LoginException does not throw if test user is null");
		} catch (LoginException le) {
			// ok
		}
	}
	
	/** Test method for {@link Login#getAuthenticatedSubject(String)}.
	 * This test runs the test using a null user name.
	 * No exceptions are thrown. We should be able to complete the test without any issues. */
	@Test public void testNullUserNullSubject() {		
		// authenticate with a null user name
		login = new Login(null);
		try {
			User user = login.getAuthenticatedSubject(null);
			fail("LoginException does not throw if test user is null");
		} catch (LoginException le) {
			// ok
		}
	}
	
	/** Test method for {@link java.security.Principal#getName()}.
	 * This test runs the test using a null user name.
	 * No exceptions are thrown. We should be able to complete the test without any issues. */
	@Test public void testNullUserNullName() {		
		// test anonymous principal
		login = new Login(null);
		Principal anonymousPrincipal = login.getAuthenticatedSubject("anonymous");
		fail("LoginException does not throw if test user is null");
	}
	
	/** Verify that an anonymous principal is returned.
	 * The returned principal is anonymous.
	 * No exceptions are thrown. We should also be able to complete the test without any issues. */
	@Test public void testAnonymAnonymousPrincipal