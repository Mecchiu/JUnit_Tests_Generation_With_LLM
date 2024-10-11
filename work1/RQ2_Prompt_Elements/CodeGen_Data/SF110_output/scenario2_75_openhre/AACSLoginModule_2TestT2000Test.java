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
// AACSLoginModule.java
package com.browsersoft.jaas;

import java.util.*;
import java.io.IOException;
import javax.security.auth.*;
import javax.security.auth.callback.*;
import javax.security.auth.login.*;
import javax.security.auth.spi.*;
import com.browsersoft.aacs.Login;
import com.browsersoft.aacs.User;

/**
 * <p> This sample LoginModule authenticates users with a password.
 *
 * <p> This LoginModule only recognizes one user:	testUser
 * <p> testUser's password is:	testPassword
 *
 * <p> If testUser successfully authenticates itself,
 * an <code>AACSPrincipal</code> with the testUser's user name
 * is added to the Subject.
 *
 * <p> This LoginModule recognizes the debug option.
 * If set to true in the login Configuration,
 * debug messages will be output to the output stream, System.out.
 *
 * <p> The config option specifies the AACS Properties file,
 * without the assumed ".properties" suffix.
 *
 * @version $Id: AACSLoginModule.java,v 1.1 2006/11/06 19:52:19 grodecki Exp $
 */
public class AACSLoginModule implements LoginModule {

    /**
     * <p> This method is called if the LoginContext's
     * overall authentication failed.
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules
     * did not succeed).
     *
     * <p> If this LoginModule's own authentication attempt
     * succeeded (checked by retrieving the private state saved by the
     * <code>login</code> and <code>commit</code> methods),
     * then this method cleans up any state that was originally saved.
     *
     * <p>
     *
     * @exception LoginException if the abort fails.
     * @return false if this LoginModule's own login and/or commit attempts
     * 	failed, and true otherwise.
     */
    public boolean abort() throws LoginException {
        if (succeeded == false) {
            return false;
        } else if (succeeded == true && commitSucceeded == false) {
            // login succeeded but overall authentication failed
            succeeded = false;
            username = null;
            if (password!= null) {
                for (int i = 0; i < password.length; i++) password[i] ='';
                password = null;
            }
            userPrincipal = null;
            rolePrincipal = null;
        } else {
            // overall authentication succeeded and commit succeeded,
            // but someone else's commit failed
            logout();
        }
        return true;
    }
}

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
     * Test the behaviour of {@link #abort()} properly after a login and
     * commit failure. The configuration file is located at {@link #PATH}
     * and is assumed to contain the following line:
     * "AACSLoginModule_2Test -debug=true".
     * @throws Exception if the configuration fails.
     */
    @Test
    public void abort_with_debug_option_logs_out_of_process() throws Exception {
        new LoginModule_2Test() {
            @Override
            public boolean commit() throws LoginException {
                return false; 
            }

            @Override
            public void initialize(Subject subject, CallbackHandler cbh, Map<String,?> sharedState) {

            }

            @Override
            public boolean abort() throws LoginException {
                return true;
            }

            @Override
            protected boolean onLoginSuccessCheck(Subject subject, CallbackHandler cbh) {
                // this code would be called by the login callback
                // to allow the login module to do an extra "exit"
                // if exit is successful
		/*            // exit was called before login complete
                         cbh.handle(null);
                     System.exit(0);
                 */
                return false;
            }

            @Override
            protected boolean onLoginFailureCheck(Subject subject, CallbackHandler cbh) {
                if (succeeded == false) {
                    // login failed
                    return true;
                } else {
                    // login succeeded and commit succeeded
                    return false;
                }
            }

            protected String getConfigurationPath() {
                return "config/aacs-basic-login-policy.xml";
            }
        }.run();
    }
}

/**
 * A test class for the class {@link LoginModule}.
 */
public class LoginModule_2Test  extends LoginModule_Base {
    /**
     * The configuration file path used by the
     * configuration class {@link LoginModule_2Test}.
     */
    private static final String PATH = "org/junit/jupiter/api/extension/jupiter-auth.properties";
    
    // the class name
    private static final String CLASS = LoginModule_2Test.class.getName();

    // the message to display to the user
    private static final String MSG = MSG.replaceFirst("org/junit/jupiter/api/extension/jupiter-auth.properties", CLASS);

    // the list of all available users
    private static final Set<String> users = new CopyOnWriteArraySet<>();
    
    /**
     * The constructor is called when the first login
     * is performed.
     * @param subject the LoginContext for this Authentication
     * @param callbackHandler an object which carries additional information
     * the authentication module provides.
     */
    public LoginModule_2Test(CallbackHandler callbackHandler) {
        super(callbackHandler);
    }                
    
    @Override
    public boolean login() throws LoginException {
        try {
            // the login module must set at least the username's password
            // this is done in the super method to avoid "login failed" on the command line
            String username = "AACSActiveLoginModule";
            password = getPassword();
            login(username, password);
            users.add(username);
            return true;
        } catch (Exception e) {
            throw new LoginException(e, MSG, new Object[0]);
        }
    }        
    
    /**
     * This method is called if the LoginContext's
     * overall authentication succeeded.
     * @param subject the Subject of the LogoffMessage
     * @param callbackHandler an object which carries additional information
     * the authentication module provides.
     * @param sharedState a Map that will be used as a shared state
     * by the callback-handler for the callback-method
     * {@link AbstractLoginModule#commit(Subject, CallbackHandler)}
     */ 
    @Override
    public void commit(Subject subject, CallbackHandler cbh, Map<String,?> sharedState) throws LoginException {
        callbackHandler.handle(new LogoffMessage(subject, cbh, sharedState));
    }
    
    @Override
    public boolean abort() {
	    return false;
    }
}
