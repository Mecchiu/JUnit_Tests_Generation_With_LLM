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
		public final Map<String, Object> localConf = new HashMap<String, Object>();
	private final PrintStream originalOut;
	private final OutputStream os;

	public AACSLoginModule_3Test() throws IOException {
		originalOut = System.out;
		os = new PrintStream(new BufferedOutputStream(System.out));

	}

	/**
* Test case for {@link AACSLoginModule#logout()}.
* Checks that the method call does not throws an exception.
*/
	@Test
    public void testLogout() {
	boolean origSuccessful = Login.isSuccessfulLogin(os);
	// The test code is run by an unprivileged user.
	System.setSecurityManager(new TestSecurityManager());
	System.setSecurityProperty("auth.module.testRole", "com.browsersoft.aacs.LoginModule");

	try {
	    // this user does not have a login
	    fail("Login succeeded.");
	} catch (LoginException e) {
	    // success
	}

	// logout() should not fail.
	if (Login.isSuccessfulLogin(os)) {
	    // success
	} else {
	    fail("Login failed. Check that the user was not logged in.");
	}
	assertTrue("Test login failed.", origSuccessful);
	}

	/**
* Test case for {@link AudioSystemTest}
*/
public class AudioSystemTest extends TestCase {
	@Override
	protected String getTestName() {
		return "AudioSystemTest";
	}

	@Override
	protected void runTest() throws Throwable
	{
		// get a reference to the call back handler
		CallbackHandler ch = new CallbackHandler();

		// create a LoginModule
		AudioSystemTest_1LoginModule loginModule = new AudioSystemTest_1LoginModule();

		// add the call back handler to the reference
		ch.addCallback(loginModule);

		// add the reference to the call back handler
		System.setProperty("java.security.auth.login.config", "dummy.properties");

        // setup the password callback for the user.
		PasswordCallback passwordCallback = new PasswordCallback("testPasswd", false);
		PasswordAuthentication passwordAuthentication = new PasswordAuthentication("testUser", "testPasswd");
		Callbacks.setCallbacks(ch, passwordCallback, passwordAuthentication);

		// authenticate user
		loginModule.logout();
	}

	@Override
	protected void tearDown() throws Exception {

		// remove the java.security.* system properties
		System.clearProperty("java.security.auth.login.config");

		// remove the call back handler for a user
		CallbackHandler ch = (CallbackHandler) System.getSecurityManager().getCallbacks().get(
				"com.browsersoft.aacs.LoginModule");
		ch.removeCallbacks(ch, passwordCallback);

		// remove the reference to the call back handler
		System.setProperty("java.security.auth.login.config", null);

		super.tearDown();

	}

}

/**
* AACSLoginModule_1LoginModule.
*
* @version $Revision: 1.1 2012-02-07 15:47:07 $
*/
class AudioSystemTest_1LoginModule extends LoginModule {
    // A static variable to hold the user name.
    private String aacS = null;

    @Override
    public PasswordCallback getPasswordCallback() {
        return null;
    }

    @Override
    public boolean authenticate(Callback[] callbacks) throws LoginException {
        // A static variable contains the user's name.
        aacS = callbacks[0].getName();

        // if the call back is a password callback, it must handle the
        // user's password
        PasswordCallback pc = (PasswordCallback) callbacks[0];
        return false;
    }

    @Override
    public boolean prompt(Callback[] callbacks, String argument) throws LoginException {
        // A static variable contains the user's password.
        return false;
    }

    @Override
    public boolean getPassword() {
        // if a password has been given, then we must be logged in

        // if no password have been given, we must be logged out
        return true;
    }

    @Override
    public boolean commit(Callback[] callbacks) throws LoginException {
        // A static variable contains the user's login name.
        String name = callbacks[0].getName();

        // if no user name has been given, then we should not be logged out
        if (name == null) {
            return false;
        }

        // if this is the only call, then no login has been made, return false
        if (aacS == null) {
            return false;
        }

        // if a login from this name has not been made, then return false
        if (!User.userExists(aacS, os)) {
            return false;
        }

        User auser = User.getInstance(os);
        return true;
    }

    @Override
    public boolean logout() throws LoginException {
        // clear the call back's name
        callbacks[0] = null;

        // return the old object value of the LoginModule's state
        return super.logout();
    }

}

// AudioSystemTest_1LoginModule.java ends here
}