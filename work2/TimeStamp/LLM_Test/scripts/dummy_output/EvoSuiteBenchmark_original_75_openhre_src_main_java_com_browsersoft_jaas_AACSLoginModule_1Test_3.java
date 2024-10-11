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
		
		// Class variables.
        public boolean success = false;
        public boolean success1 = false;
        public User user_1 = null;
        public User user_2 = null;
        public JAINSession s1 = null;
        public JAINSession s2 = null;
        public Login login = null;
        public String testuser1 = null;
        public String testuser2 = null;
        public String[] testParams1= null;
        
	  /**
	  * Test method for {@link com.browsersoft.jaas.AACSLoginModule#commit()}.
	  */
	  @org.junit.Ignore
	  @Test
	  public void testCommit() {
			
		  // Initialize variable array.
    		success = false;
    		success1 = false;
    		user_1 = null;
    		user_2 = null;
    		s1 = null;
    		s2 = null;
    		login = null;
    		logout = null;
    		testuser1 = null;
    		testuser2 = null;
    		testParams1= null;
    		
    		// Executing the "commit" action of the LoginModule.
		  success = commit();
		  assertTrue("The LoginModule did not commit successfully", success);
		  // Executing the "commit" action of the LoginModule when using the
		  // JAINLogin interface (LoginModule,JAINLogin).
		  success = login = new JAINLogin(testuser1, TestUser.class.getName(), testParams1,null);
			  
		  // Validation.
			  // System.err.println("1");
			  // Get LoginModule's login result.
		  try {
			success = login.login();
			assertTrue("This LoginModule did not succeed", success);
			//System.err.println("2");
			success1 = success;
		  } catch (Throwable t) {
			  fail("The LoginModule's login failed." + t.getMessage());
			}
			   
		  // Validation.
			  // System.err.println("3");
			  // Get LoginModule's login result.
		  try {
		  login = new JAINLogin(testuser2, TestUser.class.getName(), testParams1,null);
			  } catch (IOException ioe) {
				  fail("This LoginModule does not validate the provided parameters." + ioe.getMessage());
			  }
		  // Get LoginModule's login result.
		  success = login.login();
		  assertTrue("This LoginModule did not succeed", success);
		  //System.err.println("4");
		  success1 = success;
  
		  assertTrue(success);
		  // Validation.
			  // System.err.println("5");
			  // Get LoginModule's login result.
		 	String name = testuser_1.getName();
			  // String password = testuser_1.getPassword();
			  // String name_1 = testuser_1.getName();
			  // String name_2 = testuser_1.getName();
		  user_1 = (User) login.getUser();
		  assertTrue("TestUser user2 not found in the LoginModule's authenticated user list", user_2 == null || user_2.equals(user_1));
		  assertTrue("TestUser user2 not found in the LoginModule's authenticated user list", user_1 == null || user_2.equals(user_1));

		  assertTrue("TestUser object is not initialized yet.", testuser_2 == null || testuser_1.equals(testuser_2));
		  
		  // Validation.
			  // System.err.println("6");
			  // Get LoginModule's login result.
	  	success = login.login();
	  	assertTrue("TestUser not properly logged in", success &&!user_1.isAnonymous());
	  	assertTrue("TestUser object is not initialized yet.", user_1 == null || testuser_2.equals(user_1));

		  // Create an authenticated instance of User.
    	  user_1.setName(name);
		  try {
			  user_2 = (User) session.authenticate(user_1, testuser1);
			  
			  // Get LoginModule's login result.
			  success = login = new JAINLogin(testuser2, TestUser.class.getName(), testParams1);
			  // Get LoginModule's login result.
			  success1 = success;
		  } catch (Throwable t) {
			  fail("The LoginModule's authenticated user list did not initialize properly");
		  }
		  // Get LoginModule's login result.
		  success = login.login();
		  assertTrue("TestUser incorrect information", success1);

		  // Validation.
			  // System.err.println("7");
			  // Get LoginModule's login result.
		  logout = new JAINLogin(testuser_1, "logout", null, null);
		  // Get LoginModule's login result.
}
}