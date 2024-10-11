// Login_3Test.java
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
* It contains one unit test case for the {@link Login#authorize()} method.
*/
class Login_3Test {

      @Test
      public void login_1_notAuthorized() throws LoginException {
              User user_01 = new User("user_01", "password_01");
              User user_02 = new User("user_02", "password_02");
              
      	        assertFalse(user_01.equals(user_02)); // Same username is not equal
      		        
      		try {               // Try to login with user_01
      		        System.out.println("Login : " + user_01);
      					user_01.login();
          	}
      		catch (Exception e) {
                  	e.printStackTrace();
      		}
          	         
                        // Logout
                        try {
                                RequestBuilder.auth.login(user_02, "password_02");
                        } catch (Exception e) {
                                e.printStackTrace();
                        }
                        
                        try {
                                user_02.login();
                        } catch (LoginException e) {
                                assertTrue("Login failed, no expected exception!",  e.getCause() instanceof LoginException);
                        }
                  	
      		            // First user must be successfully authenticated.
      		            assertTrue(
      		            "Check password for user " + "user_01".concat(": "));
      		}
      	}
  
    @Test
    public void login_2_Authorized() throws LoginException {
              User user_01 = new User("user_01", "password_01");
              User user_02 = new User("user_02", "password_02");
              
      	            // First user must be successfully authenticated.
      	            assertFalse(
      	            "Check password for user " + "user_02".concat(": "));
      	}
       
    @Test
    public void login_3_notAuthorized() throws LoginException {
              User user_01 = new User("user_01", "password_01");
              User user_02 = new User("user_02", "password_02");
              
      	            // First user must be successfully authenticated.
      	            assertFalse(
      	            "Check password for user " + "user_02".concat(": "));
      	}
       
       
    @Test
    public void login_4_Authorized() throws LoginException {
              User user_01 = new User("user_01", "password_01");
              User user_02 = new User("user_02", "password_02");
              
      	            // First user must be successfully authenticated.
      	            assertTrue(
      	            "Check password for user " + "user_02".concat(": "));
      	}
       
    @Test
    public void login_5_Authorized() throws LoginException {
              User user_01 = new User("user_01", "password_01");
              User user_02 = new User("user_02", "password_02");
              
      	            // First user must be successfully authenticated.
      	            assertTrue(
      	            "Check password for user " + "user_02".concat(": "));
      	}
       
    @Test
    public void login_6_Authorized() throws LoginException {
              User user_01 = new User("user_01", "password_01");
              User user_02 = new User("user_02", "password_02");
                  System.out.println("Login : " + user_01);
                          User user_03 = new User("user_03", "password_03");
                            user_01.login();
            	          System.out.println("Login : " + user_01);
                          User user_04 = new User("user_04", "password_04");
                         user_02.login();
            	          System.out.println("Login : " + user_02);
                          User user_05 = new User("user_05", "password_05");
                         user_03.login();
            	          System.out.println("Login : " + user_03);
                          User user_06 = new User("user_06", "password_06");
                         user_04.login();
            	          System.out.println("Login : " + user_04);
                          User user_07 = new User("user_07", "password_07");
                         user_05.login();
            	          System.out.println("Login : " + user_05);
                          User user_08 = new User("user_08", "password_08");
                         user_06.login();
            	          System.out.println("Login : " + user_06);
                          User user_09 = new User("user_09", "password_09");
                         user_07.login();
                            System.out.println("Login : " + user_07);
                          User user_10 = new User("user_10", "password_10");
                         user_08.login();
                         user_09.login();
        	 	    
  
    @Test
    public void login_7_Authorized() throws LoginException {
              User user_01 = new User("user_01", "password_01");
              User user_02 = new User("user_02", "password_02");
              
      	            // First user must be successfully authenticated.
      	            assertTrue(
      	            "Check password for user " + "user_02".concat(": "));
      	
      	            // Second user must be successfully authenticated.
      	            assertFalse(
      	            "Check password for user " + "user_02".concat(": "));
      	}
       
       
        @Test
        public void login_8_Authorized() throws LoginException {
              User user_01 = new User("user_01", "password_01");
              User user_02 = new User("user_02", "password_02");
              
      	            // First user must be successfully authenticated.
      	            assertTrue(
