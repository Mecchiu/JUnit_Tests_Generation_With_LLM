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
         *  This code blocks until all threads have executed all login-calls in the sequence below.
         * At this point the authentication is complete.
         * The login mechanism also supports authentication of self
         * without authentication of other users.
         */
    public static void main(String[] args) throws Exception {
        LoginModule module = new AESCACSLoginModule();
        System.setSecurityManager(new AEManager());
        SSPIHashCallback handler = new SSPIHashCallback("hash") {
            public Void callback(MessageContext context) {
                System.out.println("Hash callback invoked on " + context + ":");
                User userInfo = (User) context.getUser();
                System.out.println("User name: "+userInfo.getUserName());
                System.out.println("Authenticated as: "+userInfo.getAuthenticatedUser());
                return null;	// Return null since the callback may change the hash
            }
        };
        HashCallback[] hcf = new HashCallback[1];
        hcf[0] = handler;
        AuthenticationContext context = new AuthenticationContext(
            null,new HashLoginModule(true,hcf),new HashLoginPolicy());
        iface.invoke(null, context);
    }
}