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
		
	/**
	* Constructor of the class.
	*
	* @param name class name, not null
	* @throws NullPointerException if the name parameter is <B><I>null</I></B>
	* @throws SecurityException thrown if the {@link TestUserPrincipal}
	* cannot be authenticated.
	* @see #AACSLoginModule
	*/
	public AACSLoginModule_1Test(String name) throws SecurityException {
        if (name == null)
            throw new NullPointerException("param: 'name' cannot be null.");
        
        this.name = name;
	}

        private final String name;
	public static final String name = "AACSLoginModule_"+ Integer.toHexString(System.identityHashCode(this));
        private AuthToken aAuthenticatedToken;

    /**
    * Constructor of the class.
    *
    * @param name class name, not null
    * @param token authentication token, in challenge form or not null
    */
    public AACSLoginModule_1Test(String name,
                                AuthToken token) throws
            IOException,
            LoginException {
        if (name == null)
            throw new NullPointerException("param: 'name' cannot be null.");
        this.name = name;
        this.aAuthenticatedToken = token;
    }

    /**
    * Verify whether user with password is authenticated
    */
    public AuthToken getAuthenticatedToken() {
        return this.aAuthenticatedToken;
    }
}