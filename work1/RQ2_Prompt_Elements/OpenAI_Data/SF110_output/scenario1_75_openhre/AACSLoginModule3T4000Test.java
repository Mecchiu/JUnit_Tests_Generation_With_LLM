// AACSLoginModuleTest.java
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
* It contains ten unit test cases for the {@link AACSLoginModule#logout()} method.
*/
class AACSLoginModuleTest {

	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is null and expects NullPointerException.
	*/
	@Test
	public void testLogout_NullSubject() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		try {
			aacsLoginModule.logout();
			fail("NullPointerException expected.");
		} catch (NullPointerException e) {
			// As expected
		} catch (LoginException e) {
			fail("NullPointerException expected, but got " + e);
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is not null and the user principal is null and expects NullPointerException.
	*/
	@Test
	public void testLogout_NullUserPrincipal() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			aacsLoginModule.logout();
			fail("NullPointerException expected.");
		} catch (NullPointerException e) {
			// As expected
		} catch (LoginException e) {
			fail("NullPointerException expected, but got " + e);
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is not null and the user principal is not null and the user is null and expects NullPointerException.
	*/
	@Test
	public void testLogout_NullUser() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		AACSPrincipal userPrincipal = new AACSPrincipal("testUser");
		subject.getPrincipals().add(userPrincipal);
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			aacsLoginModule.logout();
			fail("NullPointerException expected.");
		} catch (NullPointerException e) {
			// As expected
		} catch (LoginException e) {
			fail("NullPointerException expected, but got " + e);
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is not null and the user principal is not null and the user is not null and the login is null and expects NullPointerException.
	*/
	@Test
	public void testLogout_NullLogin() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		AACSPrincipal userPrincipal = new AACSPrincipal("testUser");
		subject.getPrincipals().add(userPrincipal);
		User user = new User();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			aacsLoginModule.logout();
			fail("NullPointerException expected.");
		} catch (NullPointerException e) {
			// As expected
		} catch (LoginException e) {
			fail("NullPointerException expected, but got " + e);
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is not null and the user principal is not null and the user is not null and the login is not null and the password is null and expects NullPointerException.
	*/
	@Test
	public void testLogout_NullPassword() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		AACSPrincipal userPrincipal = new AACSPrincipal("testUser");
		subject.getPrincipals().add(userPrincipal);
		User user = new User();
		Login login = new Login();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			aacsLoginModule.logout();
			fail("NullPointerException expected.");
		} catch (NullPointerException e) {
			// As expected
		} catch (LoginException e) {
			fail("NullPointerException expected, but got " + e);
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is not null and the user principal is not null and the user is not null and the login is not null and the password is not null and the role principal is null and expects NullPointerException.
	*/
	@Test
	public void testLogout_NullRolePrincipal() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		AACSPrincipal userPrincipal = new AACSPrincipal("testUser");
		subject.getPrincipals().add(userPrincipal);
		User user = new User();
		Login login = new Login();
		char[] password = new char[0];
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			aacsLoginModule.logout();
			fail("NullPointerException expected.");
		} catch (NullPointerException e) {
			// As expected
		} catch (LoginException e) {
			fail("NullPointerException expected, but got " + e);
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is not null and the user principal is not null and the user is not null and the login is not null and the password is not null and the role principal is not null and the username is null and expects NullPointerException.
	*/
	@Test
	public void testLogout_NullUsername() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		AACSPrincipal userPrincipal = new AACSPrincipal("testUser");
		subject.getPrincipals().add(userPrincipal);
		User user = new User();
		Login login = new Login();
		char[] password = new char[0];
		AACSPrincipal rolePrincipal = new AACSPrincipal("testRole");
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			aacsLoginModule.logout();
			fail("NullPointerException expected.");
		} catch (NullPointerException e) {
			// As expected
		} catch (LoginException e) {
			fail("NullPointerException expected, but got " + e);
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is not null and the user principal is not null and the user is not null and the login is not null and the password is not null and the role principal is not null and the username is not null and the succeeded is false and expects NullPointerException.
	*/
	@Test
	public void testLogout_FalseSucceeded() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		AACSPrincipal userPrincipal = new AACSPrincipal("testUser");
		subject.getPrincipals().add(userPrincipal);
		User user = new User();
		Login login = new Login();
		char[] password = new char[0];
		AACSPrincipal rolePrincipal = new AACSPrincipal("testRole");
		String username = "testUser";
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			aacsLoginModule.logout();
			fail("NullPointerException expected.");
		} catch (NullPointerException e) {
			// As expected
		} catch (LoginException e) {
			fail("NullPointerException expected, but got " + e);
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is not null and the user principal is not null and the user is not null and the login is not null and the password is not null and the role principal is not null and the username is not null and the succeeded is true and the commitSucceeded is false and expects NullPointerException.
	*/
	@Test
	public void testLogout_FalseCommitSucceeded() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		AACSPrincipal userPrincipal = new AACSPrincipal("testUser");
		subject.getPrincipals().add(userPrincipal);
		User user = new User();
		Login login = new Login();
		char[] password = new char[0];
		AACSPrincipal rolePrincipal = new AACSPrincipal("testRole");
		String username = "testUser";
		boolean succeeded = true;
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			aacsLoginModule.logout();
			fail("NullPointerException expected.");
		} catch (NullPointerException e) {
			// As expected
		} catch (LoginException e) {
			fail("NullPointerException expected, but got " + e);
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is not null and the user principal is not null and the user is not null and the login is not null and the password is not null and the role principal is not null and the username is not null and the succeeded is true and the commitSucceeded is true and expects true.
	*/
	@Test
	public void testLogout_True() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		AACSPrincipal userPrincipal = new AACSPrincipal("testUser");
		subject.getPrincipals().add(userPrincipal);
		User user = new User();
		Login login = new Login();
		char[] password = new char[0];
		AACSPrincipal rolePrincipal = new AACSPrincipal("testRole");
		String username = "testUser";
		boolean succeeded = true;
		boolean commitSucceeded = true;
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.logout());
		} catch (LoginException e) {
			fail("Unexpected exception occurs: " + e);
		}
	}
}