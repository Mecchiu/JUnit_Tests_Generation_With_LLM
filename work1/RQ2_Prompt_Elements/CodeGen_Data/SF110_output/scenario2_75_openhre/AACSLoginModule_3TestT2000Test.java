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
     * Logout the user.
     *
     * <p> This method removes the <code>AACSPrincipal</code>
     * that was added by the <code>commit</code> method.
     *
     * <p>
     *
     * @exception LoginException if the logout fails.
     * @return true in all cases since this <code>LoginModule</code>
     *          should not be ignored.
     */
    public boolean logout() throws LoginException {
        subject.getPrincipals().remove(userPrincipal);
        succeeded = false;
        succeeded = commitSucceeded;
        username = null;
        if (password!= null) {
            for (int i = 0; i < password.length; i++) password[i] ='';
            password = null;
        }
        userPrincipal = null;
        rolePrincipal = null;
        user = null;
        login = null;
        return true;
    }
}

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
		//private static final String config = "config/aacs.properties";

		/** test user login name */
		private static final String user = "tester";
		/** test user password */
		private static final char[] password = {'f', 'o'};
		/** tests if the login operation succeeded, false if not. Set true in
			 the login Configuration to get this behaviour */
		private boolean succeed;
		private boolean commitSucceeded = false;

		
		/**
		 * test getSubject method
		 */
		@Test
		void getSubject_LoginModule_test() {
			
			Login login = new Login();
			login.setConfigurationFile("config.properties");
			Subject subject = login.login();

			assertTrue("Subject is not a LoginModule", subject instanceof LoginModule);
			assertEquals("user is not the tester, but was the one set",user, LoginModule.user);
			assertEquals("password is the testPassword, but was the configured one",password, LoginModule.password);
			assertEquals("The configuration file should set the testUser",User.login.login(),LoginModule.user);
			assertTrue("succeeded is true, but failed",succeeded);
			succeeded = commitSucceeded;
		}

		/**
		 * test login method
		 */
		@Test
		void login() throws LoginException {
			
			// Login is not required
			if (succeed) return;

			login = new Login();
			login.setConfigurationFile("config.properties");

			succeeded = false;

			// Login
			login.login();
			if (login.isSuccessful()) return;

			// Authentication failure
			Principal p = login.getLastLogin();
			//Principal p = login.getPrincipal(user);
			if (!(p instanceof User)) return;
			log("logging on user [" + p.getName() + "] who are logged in: " + login.getPrincipal().toString());
			succeeded = true;
		}
		
		/**
		 * test set configuration file
		 */
		@Test
		void setConfigurationFile_LoginModule_test() {
			
			// Login is not required
			if (succeed) return;

			login = new Login();
			login.setConfigurationFile("config.properties");

			succeeded = false;
			
					
			// login
			login.login();
			if (login.isSuccessful()) return;

			// Authentication failure
			Principal p = login.getLastLogin();
			//Principal p = login.getPrincipal(user);
			if (!(p instanceof User)) return;
			log("logging on user [" + p.getName() + "] who are logged in: " + login.getPrincipal().toString());
			succeeded = true;
		}

		/**
		 * tests if the configuration of the class is respected
		 */
		@Test
		void configure_LoginModule_Test() {

			// login is not required
			if (succeed) return;

			// configure
			Login login = new Login();
			login.setConfigurationFile("aacs.properties");
			login.login();
			log("the configuration file in the config.properties is not the same as the configured one");
			succeeded = false;

		}
		
		
		/**
		 * tests if LoginModule's successful authentication succeeded
		 */
		@Test
		void loginSuccess_LoginModule_Test() throws LoginException {
			//Login is not required
			if (succeed) return;
			
			login = new Login();
			login.setConfigurationFile("aacs.properties");
			login.login();
			succeeded = true;
		}
		
		/**
		 * tests if LoginModule's successful authentication succeeded
		 */
		@Test
		void loginSucceeded_LoginModule_Test() throws LoginException {
			//Login is not required
			if (succeed) return;
			login = new Login();
			login.setConfigurationFile("aacs.properties");
			login.login();
			succeeded = true;
		}

		/**
		 * tests if LoginModule login operation succeeds, even during configuration failure
		 */
		@Test
		void login_Logout_LoginModule_Test() throws LoginException {
			//Login is not required
			if (succeed) return;
			
			// set failed login operation to false
			login = new Login();
			login.setConfigurationFile("aacs.properties");
			login.login();
			log("Succeeded after failure");

		}
	}
}