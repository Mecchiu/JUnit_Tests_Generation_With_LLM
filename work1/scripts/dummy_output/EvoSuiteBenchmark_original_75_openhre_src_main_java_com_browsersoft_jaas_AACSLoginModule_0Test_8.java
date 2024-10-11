// AACSLoginModule_0Test.java
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
* It contains one unit test case for the {@link AACSLoginModule#login()} method.
*/
class AACSLoginModule_0Test {
		
    @Test
		public void loginFailureTest() {
    	boolean result = login();
    	assertTrue("Login failure", result);
		}
		
    @Test
    public void testUsernamePassword() {
    	String p,q;
    	List passwords = new ArrayList();
    	login();
    	
    	// Get a list of passwords and verify that the name is correct
    	// in them.
    	for (int i=0; i<10;i++) {
    		q = Login.getPassword(pw, true, "test"); // password is null if the string is null
    		passwords.add(q);
    		p = pw;
    	}
    	p = "test";
    	// Verify that p is the same
    	assertEquals(p, passwords.get(0));
    	// Now get the password again.
    	pw = p;
    	// Verify that p is not the same
    	p = "new";
    	assertFalse(p, passwords.get(0).equals(p));
    }
}