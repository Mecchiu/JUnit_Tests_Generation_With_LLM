// Login_4Test.java
package com.browsersoft.aacs;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.security.auth.login.LoginException;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import com.browsersoft.aacs.xacml.PDPadapter;
import com.browsersoft.aacs.xacml.RequestBuilder;
import com.sun.xacml.Indenter;
import com.sun.xacml.ctx.RequestCtx;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Login}.
* It contains one unit test case for the {@link Login#authenticate()} method.
*/
class Login_4Test {
		/**
		* Class under test
		*/
		Login login;
	/**
	* Test method for {@link Login#authenticate()} method.
	*/
	@Test
	void testAuthenticate1() {
		System.out.println("testAuthenticate1");
		User user;
		File f = new File("Actors/login.ini.txt");
		try {
			login = new Login(new File("test/testUsers/Actors"),new File(f));
			user = login.authenticate();
			if (user.isValid()) {
				System.out.println("Test PASSED");				
			} else {
				System.out.println("AUTH FAILED");
			}
		} catch (Exception exc) {
			exc.printStackTrace();
			fail ("Exception during authentication:\n" + exc);
		}
	}
	
	/**
     * Test method for {@link Login#authenticate()} method.
     */
    @Test
    void testAuthenticate2() {
		File f = new File("test/testUsers/xacmlUsers");
		try {
			login = new Login(new File("test/testUsers"), new File(f));
			User user;
			user = login.authenticate();
			if (user.isValid()) {
				System.out.println("Test PASSED");
			} else {
				System.out.println("AUTH FAILED");
			}
		} catch (Exception exc) {
			exc.printStackTrace();
			fail ("Exception during authentication:\n" + exc);
		}
		System.out.println("authenticate() ->user.isValid() ->" + user.isValid() + " user.toString() -->" + user.toString());

    }
	
	/**
     * Test method for {@link Login#authenticate()} method.
     */
    @Test
    void testAuthenticate3() {
		User user;
		File f = new File("test/testUsers/Actors");
		try {
			login = new Login(new File("test/testUsers"), new File(f));
			user = login.authenticate();
			assertNotNull(user);
			assertTrue(user.isValid());
		} catch (Exception exc) {
			exc.printStackTrace();
			fail ("Exception during authentication:\n" + exc);
		}
		
    }
	


    /**
    * Test method for {@link Login#authenticate()} method.
    */
    @Test
    public void testAuthenticate4() {
		System.out.println("testAuthenticate4");
		
		//login from xaacsUser file - a user file 
		
		String xaacsUser = "Xaacs_User_11";
    	Properties dataObjects = new Properties();		
		dataObjects.load(new File("test/testUsers/xaacsUser"));		
		String pw = dataObjects.getProperty("password");	
		if (xaacsUser.equals(pw)) {
			File f = new File(testdir + "/' + " + pw + "/Xaacs_User_11");
			try {
				login = new Login(new File("test/testUsers"), new File(f));
				User user = login.authenticate();
				if (user.isValid()) {
					System.out.println("Test PASSED");				
				} else {
					System.out.println("AUTH FAILED");
				}
			} catch (Exception exc) {
				exc.printStackTrace();
			}		
		} else {
			fail("Unknown user");
		}
		
    }

		File f = new File("test/testUsers/xacmlUsers");
		Properties dataObjects = new Properties();		
}