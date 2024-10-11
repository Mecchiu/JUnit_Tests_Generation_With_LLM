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
		
	// Class variables
	private static final String TESTUSER = "testUser";
	private static final String TESTPASS = "testPassword";
	
	// Class constructors
	public AACSLoginModule_2Test() {
	}

	// Unit test methods called by the LoginModule
	@Test
	public void test() throws Exception {
		
		// LoginModule constructors
		LoginModule loginModule = new AACSLoginModule();
        
	}
	
}