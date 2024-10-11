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
/**
		* This utility method provides a basic example
		* of how the LoginModule can do its work.
		* This example shows how a {@link LoginModule}
		* could perform authentication and login.
		*
		* @return true if successful.
		*/
	public boolean login() {
		LoginModule.setDebugEnabled(true);

		// the example demonstrates how to log on a user as a 
		// group with a property file in the system's $AACSProperties
		LoginModule.setProperty("com.google.aacs.username", "test");
        LoginModule.setProperty("javax.security.auth.useSubjectCredentialsAsLogin", "false");
		LoginModule.setProperty("javax.security.auth.login.name", "bob");
		LoginModule.setProperty("javax.security.auth.login.name.homePage", "http://bob:8080/");				
		
		return true;
	}
    /**
	* This utility method provides a simple example
	* that demonstrates how to create an instance of {@link AccountAuthenticator}
	* using the {@link LoginModule}.
	*
	* @return a new AccountAuthenticator instance with the password authentication
	*   enabled
	*/
	public static AccountAuthenticator getAuthenticator() {
		return new PrincipalTestModule.AccountAuthenticator();
	}


}

// LoginModule_0Test.java
