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
		private static String username;
		private static String password;
		private static String testUser;
		private static String testPassword;

		public static void setUp(
		   	@SuppressWarnings("hiding") User user,
		   	@SuppressWarnings("hiding") String testUser,
		   	@SuppressWarnings("hiding") String testPassword) {
			UsernamePasswordToken token = new UsernamePasswordToken(
           		testUser,
           		testPassword);
          login(user, token);
		}
		
		// Test method of {@link #setUp(@SuppressWarnings("hiding"))}
        public static void tsetUp(@SuppressWarnings("hiding") String testUser, @SuppressWarnings("hiding") String testPassword) throws LoginException {
			setUp(new User(testUser), testPassword, null);
		}

/**
 * Test method of {@link #setUp(char[], CallbackHandler)}.
 * It tests that the LoginModule rejects a call to {@link #commit()} which
 * never succeeds.
 *
 * @throws LoginException if something in the authentication attempt
 * failed.
 */
    @Test(expected=LoginException.class)
    public void test_setUp() throws LoginException {
        setUp("", null, "");
    }
    
    /**
     * Test method of constructor initializer.
     */
    @Test
    public void test_init() throws Exception {
        setUp(username, password, null);
    }
    
    /**
	 * Test method of {@link #setUp(CallbackHandler)}.
	 */
	@Test(expected=IOException.class)
	public void test_setUp_1() throws Exception {
		setUp(new CallbackHandlerAdapter() {
		}.setReturningLoginName("username"));
	}

		@Override
		public boolean prompt(Callback[] callbacks, Info info) {
			return true;
		}

        @Override
        public boolean commit(Callback[] callbacks, Info info,
                SecureStore secureStore) {
			return false;
        }






}
