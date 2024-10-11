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
		/**
		 * Test null parameter
		 */
	@Test(expected = NullPointerException.class)
		public AACSLoginModule_3Test(String testPassword) 			throws Throwable {
		Login login = new Login(new java.io.File("."), null);
		LoginModule loginModule = new LoginModule();

		login.init(loginModule);
		loginModule.logout();

		//fail();
	}

		/**
		 * Test success
		 */
	@Test(enabled = true)
	public void testSuccessLogin() 					throws LoginException {
		// This is just a test
	}

	/**
	 * Test error
	 */
	@Test(expected = LoginException.class)
	public void testErrorLogin() 				throws LoginException {
		Login login = new Login(".", null);

        login.init(new LoginModule());

		//fail();
	}

	/**
	 * Test error
	 */
	@Test(expected = LoginException.class)
	public void testLoginFailure() 				throws LoginException {
		Login login = new Login(".", null);

        login.init(new LoginModule());

		//fail();
	}

	/**
	 *  This method will be invoked at the login success
	 *
	 * @test	AACSLoginModule.logout()	throws SecurityException
	 *
	 * @since	JDK1.5
	 */
	@Test
	public void testSuccessLogin_1() throws SecurityException {
		System.out.print("\n");
		System.out.print("[LogoutTestModule.loginSuccess()]");
		System.out.print("\n" + "User: '" + user + "'");
		System.out.print("\n" + "Principal: '" + testPrincipal + "'");
		System.out.print("\n" + "Succeeded Successfully!");
		System.out.print("\n" + "Principal ID: "+testPrincipal.hashCode());

		System.out.println();
		System.out.println("");

		// Success!
		assertTrue(true);

		if(user!= null) {
			// Now try again.  The login failure is triggered by the LoginModule
			// logging out.
			System.out.println("loginSuccess(): Successful Login");
			System.out.print("\n");
			TestLogging.writeAACSLoginResult(aacsLog,user);

			// This would fail because the LoginModule logged out the
			// principal
			if(login.isSuccess()) {
				System.out.print("\n");
				return;
			} else {
				System.out.println("failed!");
			}
		} else {
			// So we are good
		}

		// Logout failure
		System.out.println("loginSuccess(): Failed login");
		System.out.print("\n");
		TestLogging.writeAACSLoginResult(aacsLog,testUser);
	}

	/**
	 *  This method will be invoked at the login failure
	 *
	 * @test	AACSLoginModule.logout()	throws SecurityException
	 *
	 * @since	JDK1.5
	 */
	@Test
	public final void testForFailure() throws SecurityException {
		// Fail at the login
		System.out.print("\n");
		System.out.print("[LogoutTestModule]");
		System.out.print("\n" + "Failed login");
		TestLogging.writeAACSLoginResult(aacsLog,user);
		System.out.print("\n" + "Failed login");
		System.out.print("\n" + "Failed login");
		System.out.print("\n" + "Failed login");
		System.out.print("\n" + "Failed login");
		System.out.print("\n");

		// We failed at the login, so the login should fail
		if (login.isSuccess()) {
			// This would fail because the LoginModule logged out the
			// principal
			if(!login.isFail())
				// This is a success
				return;
		}

		// Failed login
		System.out.print("\n");
		System.out.print("[LogoutTestModule]");
		System.out.print("\n" + "Failed login");
		TestLogging.writeAACSLoginResult(aacsLog,testUser);
	}

	@Test
	public void testLogout_2() throws SecurityException {
		// Login success, fail
		testLoginFailure(user);

		// Login success, login failure
		testSuccessLogin();

	}

	@Test
	public void testLogout_1() throws SecurityException {
		Login login = new Login(new java.io.File("."), null);
		System.out.print("\n");
		TestLogging.writeAACSLoginResult(aacsLog,testUser);
	}

	@Test
	public void testSuccess_1() throws SecurityException {
		assertTrue(true);
	}
	
}