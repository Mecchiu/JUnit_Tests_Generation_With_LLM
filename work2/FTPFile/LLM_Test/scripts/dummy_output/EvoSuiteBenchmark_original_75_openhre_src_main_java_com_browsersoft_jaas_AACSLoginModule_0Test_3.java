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
	* The user can login, only by Username.
	*/
	@Test
	/*
	 *
	 * @throws LoginException if login fails(should never happen)
	 *
	 */
	public void testLogin_ByUsername() throws LoginException {

		// setup
		System.setProperty( "java.security.use.certs", "false" );
		User userLogin = new User( "Name", "Password" );
		userLogin.setPassword( "passw0rd" );

		System.setProperty( "AACSLoginModules.ClassLoader.pathToDefaultLibrary", "bin/aacslib" );

		AACSLoginModule m = new AACSLoginModule();

		// test login
		boolean result = userLogin.login();
		
		if ( result ) {
			System.out.println( "Login successful.");
		} else {
			// should never be successful
			throw new RuntimeException();
		}
	}

	/**
	* The user can login, by Password (should always work):
	* testLogin_ByPassword
	*/
	@Test
	/*
	 *
	 * @throws LoginException if login fails(should never happen)
	 *
	 */
	public void testLogin_ByPassword() throws LoginException {

		// setup
		System.setProperty( "java.security.use.certs", "false" );
		User userLogin = new User( "Name", "Password" );
		userLogin.setPassword( "passw0rd" );

		System.setProperty( "AACSLoginModules.ClassLoader.pathToDefaultLibrary", "bin/aacslib" );

		AACSLoginModule m = new AACSLoginModule();

		// test login
		boolean result = userLogin.login( "passw0rd" );
		
		if ( result ) {
			System.out.println( "Login successful.");
		} else {
			// should never be successful
			throw new RuntimeException();
		}
	}

	/**
	 * testLogin_ByBASICPassword_withoutLogin.
	 *
	 * @throws Exception if login can't be successful
	 */
	@Test(expected = InvalidLoginException.class)
	public void testLogin_ByBASICPassword_withoutLogin() throws Exception {
		
		User userLogin = new User( "Name", "Password" );
		userLogin.setPassword( "" );
		AACSLoginModule m = new AACSLoginModule();

		m.login( userLogin );
	}
	
	/**
	 * testLogin_ByBASICPassword_withLoginFailed.
	 *
	 * @throws LoginException if login failed, should never happen
	 *
	 */
	@Test(expected = FailedLoginException.class)
	public void testLogin_ByBASICPassword_withLoginFailed() throws LoginException {
		
		User userLogin = new User( "Name", "Password" );
		
		AACSLoginModule m = new AACSLoginModule();

		userLogin.setPassword( "" );
		m.login( userLogin );
	}
}