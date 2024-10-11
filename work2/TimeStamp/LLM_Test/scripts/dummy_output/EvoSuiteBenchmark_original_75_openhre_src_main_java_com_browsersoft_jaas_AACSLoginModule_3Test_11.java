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
		private static final String AUTH_PROP = "com.browsersoft.aacs.AUTH";
			//
			static final String PASSWORD = "testPassword";
					private static final Hashtable<String,String> props = new Hashtable<String,String>();		
		/**
		 * Test method for {@link com.browsersoft.aacs.LoginModule#logout()}.
		 */
		@Test
		public void test() {
			//
			UsernamePasswordCredential cred = new UsernamePasswordCredential(
						AUTH_PROP + ":" + PASSWORD, AUTH_PROP);
			//
			User u = new User();
			u = new User("testuser", AUTH_PROP, PASSWORD, "TESTUSER2", "", false);
			//
			LoginContext ctx = new LoginContext("testuser", cred, null, null);
			//
			assertTrue(ctx.logout());
		}
}