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
* It contains ten unit test cases for the {@link AACSLoginModule#commit()} method.
*/
class AACSLoginModuleTest {

	/**
	* Test case for the {@link AACSLoginModule#commit()} method.
	* It tests the case when the user is not authenticated.
	*/
	@Test
	void testCommit_NotAuthenticated() {
		// create a new AACSLoginModule instance
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		// set the succeeded field to false
		aacsLoginModule.succeeded = false;
		// call the commit method
		boolean result = aacsLoginModule.commit();
		// check the result
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#commit()} method.
	* It tests the case when the user is authenticated.
	*/
	@Test
	void testCommit_Authenticated() {
		// create a new AACSLoginModule instance
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		// set the succeeded field to true
		aacsLoginModule.succeeded = true;
		// set the username field to "testUser"
		aacsLoginModule.username = "testUser";
		// create a new Subject instance
		Subject subject = new Subject();
		// set the subject field to the created Subject instance
		aacsLoginModule.subject = subject;
		// call the commit method
		boolean result = aacsLoginModule.commit();
		// check the result
		assertTrue(result);
		// check the subject field
		assertEquals(subject, aacsLoginModule.subject);
		// check the userPrincipal field
		assertEquals(new AACSUserPrincipal("testUser"), aacsLoginModule.userPrincipal);
		// check the rolePrincipal field
		assertEquals(new AACSRolePrincipal("aacs_role"), aacsLoginModule.rolePrincipal);
		// check the username field
		assertNull(aacsLoginModule.username);
		// check the password field
		assertNull(aacsLoginModule.password);
		// check the commitSucceeded field
		assertTrue(aacsLoginModule.commitSucceeded);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#commit()} method.
	* It tests the case when the user is authenticated and the userPrincipal is already in the subject.
	*/
	@Test
	void testCommit_Authenticated_UserPrincipalInSubject() {
		// create a new AACSLoginModule instance
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		// set the succeeded field to true
		aacsLoginModule.succeeded = true;
		// set the username field to "testUser"
		aacsLoginModule.username = "testUser";
		// create a new Subject instance
		Subject subject = new Subject();
		// add the userPrincipal to the subject
		subject.getPrincipals().add(new AACSUserPrincipal("testUser"));
		// set the subject field to the created Subject instance
		aacsLoginModule.subject = subject;
		// call the commit method
		boolean result = aacsLoginModule.commit();
		// check the result
		assertTrue(result);
		// check the subject field
		assertEquals(subject, aacsLoginModule.subject);
		// check the userPrincipal field
		assertEquals(new AACSUserPrincipal("testUser"), aacsLoginModule.userPrincipal);
		// check the rolePrincipal field
		assertEquals(new AACSRolePrincipal("aacs_role"), aacsLoginModule.rolePrincipal);
		// check the username field
		assertNull(aacsLoginModule.username);
		// check the password field
		assertNull(aacsLoginModule.password);
		// check the commitSucceeded field
		assertTrue(aacsLoginModule.commitSucceeded);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#commit()} method.
	* It tests the case when the user is authenticated and the rolePrincipal is already in the subject.
	*/
	@Test
	void testCommit_Authenticated_RolePrincipalInSubject() {
		// create a new AACSLoginModule instance
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		// set the succeeded field to true
		aacsLoginModule.succeeded = true;
		// set the username field to "testUser"
		aacsLoginModule.username = "testUser";
		// create a new Subject instance
		Subject subject = new Subject();
		// add the rolePrincipal to the subject
		subject.getPrincipals().add(new AACSRolePrincipal("aacs_role"));
		// set the subject field to the created Subject instance
		aacsLoginModule.subject = subject;
		// call the commit method
		boolean result = aacsLoginModule.commit();
		// check the result
		assertTrue(result);
		// check the subject field
		assertEquals(subject, aacsLoginModule.subject);
		// check the userPrincipal field
		assertEquals(new AACSUserPrincipal("testUser"), aacsLoginModule.userPrincipal);
		// check the rolePrincipal field
		assertEquals(new AACSRolePrincipal("aacs_role"), aacsLoginModule.rolePrincipal);
		// check the username field
		assertNull(aacsLoginModule.username);
		// check the password field
		assertNull(aacsLoginModule.password);
		// check the commitSucceeded field
		assertTrue(aacsLoginModule.commitSucceeded);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#commit()} method.
	* It tests the case when the user is authenticated and the userPrincipal and the rolePrincipal are already in the subject.
	*/
	@Test
	void testCommit_Authenticated_UserPrincipalAndRolePrincipalInSubject() {
		// create a new AACSLoginModule instance
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		// set the succeeded field to true
		aacsLoginModule.succeeded = true;
		// set the username field to "testUser"
		aacsLoginModule.username = "testUser";
		// create a new Subject instance
		Subject subject = new Subject();
		// add the userPrincipal to the subject
		subject.getPrincipals().add(new AACSUserPrincipal("testUser"));
		// add the rolePrincipal to the subject
		subject.getPrincipals().add(new AACSRolePrincipal("aacs_role"));
		// set the subject field to the created Subject instance
		aacsLoginModule.subject = subject;
		// call the commit method
		boolean result = aacsLoginModule.commit();
		// check the result
		assertTrue(result);
		// check the subject field
		assertEquals(subject, aacsLoginModule.subject);
		// check the userPrincipal field
		assertEquals(new AACSUserPrincipal("testUser"), aacsLoginModule.userPrincipal);
		// check the rolePrincipal field
		assertEquals(new AACSRolePrincipal("aacs_role"), aacsLoginModule.rolePrincipal);
		// check the username field
		assertNull(aacsLoginModule.username);
		// check the password field
		assertNull(aacsLoginModule.password);
		// check the commitSucceeded field
		assertTrue(aacsLoginModule.commitSucceeded);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#commit()} method.
	* It tests the case when the user is authenticated and the debug field is set to true.
	*/
	@Test
	void testCommit_Authenticated