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
		
    /**
     * This method performs a test case of {@link AACSLoginModule#abort()} method.
     * @throws LoginException if an error occurred while performing the test case.
     */
    @Test
    public void testAbort_Success() throws LoginException {
        
        final User usertestUser = new User("usrTESTuser", "Test User");
        final User usertestAdminUser = new User("usrTESTadmin", "Test Admin");
        final HashMap<String,Object> props = new HashMap<String,Object>();
        final HashMap<String,Object> props2 = new HashMap<String,Object>();
        props.put("debug",Boolean.TRUE);
        Authenticator auth = new TestAuthenticator(usertestAdminUser,
                usertestUser,props);
        try {
            AACSLoginModule module = new AACSLoginModule(auth);
        	module.abort();
        } catch (LoginException le) {
        }
     
    }

	/**
	 * This method tests a {@link LoginModule} that is only capable
	 * of authenticating with the username, the password
	 * and the specified user.
	 * @throws LoginException if the test failed.
	 * @throws InvalidLoginException if an error occurs while authenticating.
	 * @throws NullLoginModuleException if the test is cancelled.
	 */
    @Test
    public void testLoginModule_Success() throws LoginException,
            InvalidLoginException, NullLoginModuleException {
        
        final HashMap<UsernamePasswordCredentials,Object> credentials = 
            new HashMap<UsernamePasswordCredentials,Object>();
        Utils.getAdminUsernamePassword("usrTESTadmin", "test password");
        testLoginModuleLogin(credentials);
    }
	/**
	 * This method performs a test case of {@link LoginModule#commit()} method.
	 * @throws LoginException if an error occurred while performing the test case.
	 */
    @Test
    public void testLogin() throws LoginException {
    	 final HashMap<UsernamePasswordCredentials,Object> credentials = 
    		    new HashMap<UsernamePasswordCredentials,Object>();
    	 credentials.put(new UsernamePasswordCredentials("usr4", "superTest password"),
    			new Password(Utils.PASSWORD_1234));
    	 credentials.put(new UsernamePasswordCredentials("usr5", "anotherTest password"),
    			new Password(Utils.PASSWORD_5678));
    	 try {
    		 final HashMap<String,Object> props = new HashMap<String,Object>();
    		 
    		 final HashMap<String,Object> props2 = 
    			    new HashMap<String,Object>();
    		 
    		 props.put("debug","true");
    		 props.put("configuration", new File("src/test/resources/config.xml"));
    		 final LoginModule lm = new TestLoginModule(credentials, props);
    		 lm.login();
    		 fail("testLoginModule_Success should has failed.");
    	 } catch (LoginException e) {
    	 }
		
    }
}