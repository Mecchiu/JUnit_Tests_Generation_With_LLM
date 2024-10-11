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

    /**
     * <p> This method is called if the LoginContext's
     * overall authentication succeeded
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules
     * succeeded).
     *
     * <p> If this LoginModule's own authentication attempt
     * succeeded (checked by retrieving the private state saved by the
     * <code>login</code> method), then this method associates a
     * <code>AACSUserPrincipal</code> and <code>AACSRolePrincipal</code>
     * with the <code>Subject</code> located in the
     * <code>LoginModule</code>.  If this LoginModule's own
     * authentication attempted failed, then this method removes
     * any state that was originally saved.
     *
     * <p>
     *
     * @exception LoginException if the commit fails.
     * @return true if this LoginModule's own login and commit
     * 	attempts succeeded, or false otherwise.
     */
    public boolean commit() throws LoginException {
        if (succeeded == false) {
            return false;
        } else {
            // add a Principal (authenticated identity)
            // to the Subject
            // add an AACSUserPrincipal to the Subject
            userPrincipal = new AACSUserPrincipal(username);
            if (!subject.getPrincipals().contains(userPrincipal))
                subject.getPrincipals().add(userPrincipal);
            if (debug) {
                System.out.println("\t\t[AACSLoginModule] " + "added AACSUserPrincipal [" + userPrincipal + "] to Subject");
            }
            // add the "aacs_role" to the Subject
            rolePrincipal = new AACSRolePrincipal("aacs_role");
            if (!subject.getPrincipals().contains(rolePrincipal))
                subject.getPrincipals().add(rolePrincipal);
            if (debug) {
                System.out.println("\t\t[AACSLoginModule] " + "added AACSRolePrincipal [" + rolePrincipal + "] to Subject");
            }
            // in any case, clean out state
            username = null;
            for (int i = 0; i < password.length; i++) password[i] ='';
            password = null;
            commitSucceeded = true;
            return true;
        }
    }
}

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
	* Constructor test for {@link AACSLoginModule#AACSLoginModule_1Test}.
	*/
	@Test
	public void test_constructor() {
		// check that constructor calls initialize() method
		// and that it throws LoginException when required parameters
		// are not specified...
		assertNotNull("loginModule.loginModule", LoginModule.loginModule.loginModule);
		PasswordCallback pc = new PasswordCallback("FirstPassword", 0);
		Callback[] callbacks = { pc };
		try {
			subject = new Subject();
			subject.getPrincipals().add(new Principal(null, null, null));
			// call the loginModule constructor with no arguments
			// which will throw a LoginException
			throw new LoginException();
		} catch (LoginException le) {
			// if password is null, this should be
			// thrown a LoginException, which will also
			// be used as the argument for callbacks
			assertTrue("Expecting exception when called without username", le.getMessage().contains("loginModule.loginModule"));
		}
		try {
			subject = null;
			subject.getPrincipals().remove(new Principal(null, null, null));
			subject = null;
			// if username is null, this should be
			// returned null as the argument for argument0
			// but for callback0 the it should be
			// the username parameter
			assertNull("Username should be returned null but null is returned", pc.getPassword());
		} catch (LoginException le) {
			// if username is null, return null
			// for callback0, otherwise throw exception.
			assertEquals("wrong username type: " + le.getMessage(), subject.getPrincipals().size(), 0);
		} catch (Exception e) {
			e.printStackTrace();
			assertEquals("wrong username type: " + e.getMessage(), subject.getPrincipals().size(), 0);
		}
	}
}
