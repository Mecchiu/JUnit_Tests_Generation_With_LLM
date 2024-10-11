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
		
    /**
     * Test method for
     * {@link com.browsersoft.jaas.AACSLoginModule#logout()}.
     */
    @Test
    public void testLogout() {
    	
    	// test invalid parameter.
    	try {
	    	AACSLoginModule.logout("bad"); 
	    	fail("AACSLoginModule.logout should throw an exception");
    	} catch (LoginException le) {
    		// PASS
    	}
    	
    	// test successful call.
    	AACSLoginModule ml = new AESLoginModule(new PasswordCallback("PasswordCallback", new String[0]));
    	ml.initialize(new ArrayList<ClientCallback>(), new ArrayList<LoginCallback>(), null);
    	
    	// test successful initializing.
    	ml.logout();
    	assertNull(ml.getLoggedInUser());
    	
    	// test success with null username and password.
        ml = new AESLoginModule(null, new PasswordCallback("PasswordCallback", new String[0]));
        ml.login();
        assertEquals("testUser", ml.getLoggedInUser());
    }
}