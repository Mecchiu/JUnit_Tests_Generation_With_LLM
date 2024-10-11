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
	* <p> The name of this module.
	*/
	private final String MODULE_NAME = "TEST_LOGIN_MODULE";
        /**
         * The Subject to add to when the LoginModule's state is retrieved.
         */
	private static Subject mState;
	/**
	 * <p> The name of this LoginModule configured to authenticate and authenticate
	 * users.
	 */
	private final String AUTHENTICATED_USER = "TEST_AUTHENTICATED_USER";
	/**
	 * <p> The name of this LoginModule configured to authenticate users whose password
	 * is not verified.
	 */
	private final String NON_AUTHENTICATED_USER = "TEST_NON_AUTHENTICATED_USER";
	/**
	 * Creates a new <code>AACSLoginModule</code> object.
	*/
	public AACSLoginModule_1Test() throws PrivilegedActionException, NoSuchAlgorithmException {
		ClassLoader testLoader = Thread.currentThread().getContextClassLoader();
		String configFilename = System.getProperty("test.src", ".", false) + "/aacs/aacs.properties";
		String configPath = new File(configFilename).getAbsolutePath();

		// create login module
		AACSLoginModule genAuthModule = new AACSLoginModule(AACSLoginModule.SUBJECT_NAME, configPath);
		GenState genState = new GenState(genAuthModule);
		mState = genState.createSubject();
		System.setSecurityManager(new java.lang.SecurityManager());
		System.setSecurityProperty("ssl.permit.system.certs", "true");
	}

	/**
	 * Perform a simple test of the <code>commit()</code> method
	 * of the <code>AACSLoginModule</code>
	 */	
	@Test
        public void test() throws Exception {
		mState.add(AACSUserPrincipal.class, new AuthenticatedUser(AUTHENTICATED_USER));
		mState.add(AACSRolePrincipal.class, new RolePrincipal(NON_AUTHENTICATED_USER));

		mState.getPrincipals(Principal.class).add(TestUser.class);

        java.security.Provider provider = new com.browsersoft.aacs.TestKeyStore.Provider();
        mState.getPrincipals(Principal.class).add(Login.class,
                new TestLoginModule.TestLoginModule(TestUser.class, provider));
	}
}