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
		
    /** User is trying to login. */
    private static User TARGET = null;
    
    /** Default user. */
    User FAST = null;
    
    /** Password. */
    private static String PASSWORD1 = null;
    private static String PASSWORD2 = null;
    
    // A sample password can be found at XACML_PASSWORD_1.
    private static String USERNAME1 = "User1";
    private static String USERNAME2 = "User2";
    private static String USERNAME3 = "User3";
    
    /** {@link Login#authorize()} method returns the specified user 
      after logging in the new one with the specified password. */
    @Test
    public void testLoginValid() throws LoginException {
        FAST = new User(USERNAME1, USERNAME2, true);        
			
        // login to the Fast user
        FAST.login(PASSWORD1);
        
        // login to the Fast user
        TARGET = new User(USERNAME2, USERNAME3, true);        
        assertTrue("TARGET was not the Fast one", TARGET.equals(FAST));
    }
    
    /** {@link Login#authorize()} method returns the default user */
    @Test
    public void testAuthorize() throws LoginException {
        FAST = new User(USERNAME1, USERNAME2, true);        
        
        assertTrue("TARGET was not the Fast one", TARGET.equals(FAST));        
    }
    
    /** {@link Login#authorize()} method returns a bad user */
    @Test
    public void testAuthorizeBad() throws LoginException {
        FAST = new User("bad username", "bad user name", true);        
        
        assertTrue("TARGET was not the Fast one", TARGET.equals(FAST));        
    }       
    
    /** Test class of users. It contains one unit test case for the default
     * method Login. */
    private static class User {

        /** Login user. */
        private User(String user, String password, boolean isUser) throws LoginException {
            User = user;
            password = password;
            if (Logger.getLogger(FileServer.class).isDebugEnabled()) {
                Logger.getLogger(FileServer.class).debug(User + " has " + isUser);        
            }
        }    
        public void login(String password) throws LoginException {
            Logger.getLogger(User.class)
                     .debug("Test user " + User);
            // Create and save the database
            
            if (Logger.getLogger(FileServer.class).isDebugEnabled()) {            
                Logger.getLogger(FileServer.class).debug("Setting properties to "
                        + "testUser " + User
                        );
            }            
            Properties properties = new Properties();
            properties.setProperty("user", User);
            properties.setProperty("password", password);
            properties.setProperty("security.securityProtocol",
                "https");
			/* properties.setProperty("port", "443"); */
            properties.setProperty("port", "9443");
            String username = FAST.authenticate(properties);            
            if (Logger.getLogger(User.class).isDebugEnabled()) {            
                Logger.getLogger(User.class).debug("Login of " + username);
            }
            if (Logger.getLogger(User.class).isDebugEnabled()) {            
                Logger.getLogger(User.class).info("New password: " +
                    username + " has " + isPasswordValid(password));
            }
            TARGET = new User(username, password, isUser);        

            /** Password has been validated, the password hash has been
            modified and the new user is authenticated. */
            if (Logger.getLogger(User.class).isDebugEnabled()) {
            	Logger.getLogger(User.class).debug(Username + " has been changed");
            }
        }      
        
        @Override
        public String toString() {
            return User;
        } 
        
    }
	
    
    
    
}