// AACSLoginModule_2Test.java
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
* It contains one unit test case for the {@link AACSLoginModule#abort()} method.
*/
class AACSLoginModule_2Test {
		/* testcase name */
		private final String testname;

		/**
		 * Constructor.
		 * (testcase's name)
		 *
		 * @param testcase name
		 */
		public AACSLoginModule_2Test(String testname) {
			this.testname = testname;
	}

	/**
	 * Test the login and configuration behaviour of {@link LoginModule}.
	 */
	@Test
	void testLoginAndConfiguration() throws IOException, LoginException {
				/* userName (in case we have to create an account) */
				User user1 = new User("testUser"); // user name of testUser

				LogonInfo[] loginfos = new LogonInfo[1];
		    	loginfos[0] = new LogonInfo(null, "test", "testUser", "testUser", true, "password");       
		    	PropertiesInfo user1Properties = new PropertiesInfo();
		    	user1Properties.addProperty("user1", testName);
				loginfos[0] = new LogonInfo(loginfos[0], "test", "testUser", "testUser2", true, 
							 user1Properties);
				
				AACSLoginModule aacsloginmodule = new AACSLoginModule();

			LogonInfo loginf1 = new LogonInfo(user1, "test", "testUser", "testUser", true, 
								loginfos[0]);
		    	LogonInfo loginfo2 = new LogonInfo(loginf1, "test", "testUser2", "testUser2", false,
								 loginfones[1]);
		    	
		    	String sessionFactory = aacsloginmodule.login(loginfo2,loginfones[1]);
		    	System.out.println("sessionFactory: " + sessionFactory);

		    	boolean result = aacsloginmodule.commit(sessionFactory);
		    	System.out.println("\nLogout was success!");

		    	assertTrue(result);
			
			// the logoutsession does an abort by itself
			assertTrue(aacsloginmodule.abort());
	}
}