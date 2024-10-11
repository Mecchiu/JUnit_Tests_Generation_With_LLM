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
* It contains ten unit test cases for the {@link AACSLoginModule#abort()} method.
*/
class AACSLoginModuleTest {

	/**
	* Test case for the {@link AACSLoginModule#abort()} method.
	* It tests the case when the LoginContext's overall authentication failed.
	* The relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules did not succeed.
	* If this LoginModule's own authentication attempt succeeded (checked by retrieving the private state saved by the login and commit methods),
	* then this method cleans up any state that was originally saved.
	* @throws LoginException if the abort fails.
	*/
	@Test
	void testAbort1() throws LoginException {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.succeeded = false;
		assertFalse(aacsLoginModule.abort());
	}
	
	/**
	* Test case for the {@link AACSLoginModule#abort()} method.
	* It tests the case when the LoginContext's overall authentication failed.
	* The relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules did not succeed.
	* If this LoginModule's own authentication attempt succeeded (checked by retrieving the private state saved by the login and commit methods),
	* then this method cleans up any state that was originally saved.
	* @throws LoginException if the abort fails.
	*/
	@Test
	void testAbort2() throws LoginException {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.succeeded = true;
		aacsLoginModule.commitSucceeded = false;
		aacsLoginModule.username = "testUser";
		aacsLoginModule.password = new char[] {'t', 'e', 's', 't', 'P', 'a', 's', 's', 'w', 'o', 'r', 'd'};
		aacsLoginModule.userPrincipal = new AACSPrincipal("testUser");
		aacsLoginModule.rolePrincipal = new AACSPrincipal("testRole");
		assertTrue(aacsLoginModule.abort());
		assertFalse(aacsLoginModule.succeeded);
		assertNull(aacsLoginModule.username);
		assertNull(aacsLoginModule.password);
		assertNull(aacsLoginModule.userPrincipal);
		assertNull(aacsLoginModule.rolePrincipal);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#abort()} method.
	* It tests the case when the LoginContext's overall authentication failed.
	* The relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules did not succeed.
	* If this LoginModule's own authentication attempt succeeded (checked by retrieving the private state saved by the login and commit methods),
	* then this method cleans up any state that was originally saved.
	* @throws LoginException if the abort fails.
	*/
	@Test
	void testAbort3() throws LoginException {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.succeeded = true;
		aacsLoginModule.commitSucceeded = true;
		aacsLoginModule.username = "testUser";
		aacsLoginModule.password = new char[] {'t', 'e', 's', 't', 'P', 'a', 's', 's', 'w', 'o', 'r', 'd'};
		aacsLoginModule.userPrincipal = new AACSPrincipal("testUser");
		aacsLoginModule.rolePrincipal = new AACSPrincipal("testRole");
		assertTrue(aacsLoginModule.abort());
		assertFalse(aacsLoginModule.succeeded);
		assertNull(aacsLoginModule.username);
		assertNull(aacsLoginModule.password);
		assertNull(aacsLoginModule.userPrincipal);
		assertNull(aacsLoginModule.rolePrincipal);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#abort()} method.
	* It tests the case when the LoginContext's overall authentication failed.
	* The relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules did not succeed.
	* If this LoginModule's own authentication attempt succeeded (checked by retrieving the private state saved by the login and commit methods),
	* then this method cleans up any state that was originally saved.
	* @throws LoginException if the abort fails.
	*/
	@Test
	void testAbort4() throws LoginException {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.succeeded = true;
		aacsLoginModule.commitSucceeded = true;
		aacsLoginModule.username = "testUser";
		aacsLoginModule.password = new char[] {'t', 'e', 's', 't', 'P', 'a', 's', 's', 'w', 'o', 'r', 'd'};
		aacsLoginModule.userPrincipal = new AACSPrincipal("testUser");
		aacsLoginModule.rolePrincipal = new AACSPrincipal("testRole");
		assertTrue(aacsLoginModule.abort());
		assertFalse(aacsLoginModule.succeeded);
		assertNull(aacsLoginModule.username);
		assertNull(aacsLoginModule.password);
		assertNull(aacsLoginModule.userPrincipal);
		assertNull(aacsLoginModule.rolePrincipal);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#abort()} method.
	* It tests the case when the LoginContext's overall authentication failed.
	* The relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules did not succeed.
	* If this LoginModule's own authentication attempt succeeded (checked by retrieving the private state saved by the login and commit methods),
	* then this method cleans up any state that was originally saved.
	* @throws LoginException if the abort fails.
	*/
	@Test
	void testAbort5() throws LoginException {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.succeeded = true;
		aacsLoginModule.commitSucceeded = true;
		aacsLoginModule.username = "testUser";
		aacsLoginModule.password = new char[] {'t', 'e', 's', 't', 'P', 'a', 's', 's', 'w', 'o', 'r', 'd'};
		aacsLoginModule.userPrincipal = new AACSPrincipal("testUser");
		aacsLoginModule.rolePrincipal = new AACSPrincipal("testRole");
		assertTrue(aacsLoginModule.abort());
		assertFalse(aacsLoginModule.succeeded);
		assertNull(aacsLoginModule.username);
		assertNull(aacsLoginModule.password);
		assertNull(aacsLoginModule.userPrincipal);
		assertNull(aacsLoginModule.rolePrincipal);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#abort()} method.
	* It tests the case when the LoginContext's overall authentication failed.
	* The relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules did not succeed.
	* If this LoginModule's own authentication attempt succeeded (checked by retrieving the private state saved by the login and commit methods),
	* then this method cleans up any state that was originally saved.
	* @throws LoginException if the abort fails.
	*/
	@Test
	void testAbort6() throws LoginException {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.succeeded = true;
		aacsLoginModule.commitSucceeded = true;
		aacsLoginModule.username = "testUser";
		aacsLoginModule.password = new char[] {'t', 'e', 's', 't', 'P', 'a', 's', 's', 'w', 'o', 'r', 'd'};
		aacsLoginModule.userPrincipal = new AACSPrincipal("testUser");
		aacsLoginModule.rolePrincipal = new AACSPrincipal("testRole");
		assertTrue(aacsLoginModule.abort());
		assertFalse(aacsLoginModule.succeeded);
		assertNull(aacsLoginModule.username);
		assertNull(aacsLoginModule.password);
		assertNull(aacsLoginModule.userPrincipal);
		assertNull(aacsLoginModule.rolePrincipal);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#abort()} method.
	* It tests the case when the LoginContext's overall authentication failed.
	* The relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules did not succeed.
	* If this LoginModule's own authentication attempt succeeded (checked by retrieving the private state saved by the login and commit methods),
	* then this method cleans up any state that was originally saved.
	* @throws LoginException if the abort fails.
	*/
	@Test
	void testAbort7() throws LoginException {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.succeeded = true;
		aacsLoginModule.commitSucceeded = true;
		aacsLoginModule.username = "testUser";
		aacsLoginModule.password = new char[] {'t', 'e', 's', 't', 'P', 'a', 's', 's', 'w', 'o', 'r', 'd'};
		aacsLoginModule.userPrincipal = new AACSPrincipal("testUser");
		aacsLoginModule.rolePrincipal = new AACSPrincipal("testRole");
		assertTrue(aacsLoginModule.abort());
		assertFalse(aacsLoginModule.succeeded);
		assertNull(aacsLoginModule.username);
		assertNull(aacsLoginModule.password);
		assertNull(aacsLoginModule.userPrincipal);
		assertNull(aacsLoginModule.rolePrincipal);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#abort()} method.
	* It tests the case when the LoginContext's overall authentication failed.
	* The relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules did not succeed.
	* If this LoginModule's own authentication attempt succeeded (checked by retrieving the private state saved by the login and commit methods),
	* then this method cleans up any state that was originally saved.
	* @throws LoginException if the abort fails.
	*/
	@Test
	void testAbort8() throws LoginException {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.succeeded = true;
		aacsLoginModule.commitSucceeded = true;
		aacsLoginModule.username = "testUser";
		aacsLoginModule.password = new char[] {'t', 'e', 's', 't', 'P', 'a', 's', 's', 'w', 'o', 'r', 'd'};
		aacsLoginModule.userPrincipal = new AACSPrincipal("testUser");
		aacsLoginModule.rolePrincipal = new AACSPrincipal("testRole");
		assertTrue(aacsLoginModule.abort());
		assertFalse(aacsLoginModule.succeeded);
		assertNull(aacsLoginModule.username);
		assertNull(aacsLoginModule.password);
		assertNull(aacsLoginModule.userPrincipal);
		assertNull(aacsLoginModule.rolePrincipal);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#abort()} method.
	* It tests the case when the LoginContext's overall authentication failed.
	* The relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules did not succeed.
	* If this LoginModule's own authentication attempt succeeded (checked by retrieving the private state saved by the login and commit methods),
	* then this method cleans up any state that was originally saved.
	* @throws LoginException if the abort fails.
	*/
	@Test
	void testAbort9() throws LoginException {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.succeeded = true;
		aacsLoginModule.commitSucceeded = true;
		aacsLoginModule.username = "testUser";
		aacsLoginModule.password = new char[] {'t', 'e', 's', 't', 'P', 'a', 's', 's', 'w', 'o', 'r', 'd'};
		aacsLoginModule.userPrincipal = new AACSPrincipal("testUser");
		aacsLoginModule.rolePrincipal = new AACSPrincipal("testRole");
		assertTrue(aacsLoginModule.abort());
		assertFalse(aacsLoginModule.succeeded);
		assertNull(aacsLoginModule.username);
		assertNull(aacsLoginModule.password);
		assertNull(aacsLoginModule.userPrincipal);
		assertNull(aacsLoginModule.rolePrincipal);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#abort()} method.
	* It tests the case when the LoginContext's overall authentication failed.
	* The relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules did not succeed.
	* If this LoginModule's own authentication attempt succeeded (checked by retrieving the private state saved by the login and commit methods),
	* then this method cleans up any state that was originally saved.
	* @throws LoginException if the abort fails.
	*/
	@Test
	void testAbort10() throws LoginException {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.succeeded = true;
		aacsLoginModule.commitSucceeded = true;
		aacsLoginModule.username = "testUser";
		aacsLoginModule.password = new char[] {'t', 'e', 's', 't', 'P', 'a', 's', 's', 'w', 'o', 'r', 'd'};
		aacsLoginModule.userPrincipal = new AACSPrincipal("testUser");
		aacsLoginModule.rolePrincipal = new AACSPrincipal("testRole");
		assertTrue(aacsLoginModule.abort());
		assertFalse(aacsLoginModule.succeeded);
		assertNull(aacsLoginModule.username);
		assertNull(aacsLoginModule.password);
		assertNull(aacsLoginModule.userPrincipal);
		assertNull(aacsLoginModule.rolePrincipal);
	}
}