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
		public static void main(String[] args) throws Exception {
                        javax.security.auth.login.Configuration config = javax.security.auth.login.Configuration.getConfiguration();

                        config.setLoginModuleControlFlag(LoginModuleControlFlag.NEED_REPLY | LoginModuleControlFlag.NO_AUTHENTICATION_INFO);
                        config.setLoginTimeout(0);

                        Configuration.setConfiguration(config);
                        
                        JAVAX.security.auth.login.LoginModuleControls controls = LoginModuleControls.getInstance();
                        controls.loginModules = new String[] {new AACSLoginModule_2_1(), new AACSLoginModule_3_0()};

                        // The login module called as a member of the LoginModuleControls object
                        loginModules = new String[] { new AACSLoginModule_2_1(), new AACSLoginModule_3_0()};

						// Use this listener to start, stop and dispose the provider.
						listener = new Login.UserListener() {
							public void userLoggedIn(String userName, boolean authenticated)
							{
								if (authenticated) {
									listener = null;

								} else {
									listener = Login.getLoginListener();
								}
							}
						};

						// Let the provider use the listener.
						provider = new Login.Provider();

						// Let the provider use the listener and start using any existing authentication
						boolean started = provider.login(listener);

						// We must be sure that we are notified about the start of the provider.
						synchronized (provider) {
							provider.wait(1000);
						}

						// We now have two users from the listener
						User oldUser = provider.getCurrentUser();
						User newUser = new User();

						if (oldUser!= null)
							newUser.setUserName(oldUser.getUserName());
						else 
							newUser.setUserName("unknown");
						
				final String password = newUser.getPassword();
				
				// Check if the password matches the user name.
				if (password.equals(AuthenticationProvider.PASSWORD_MULTIPLE_EQUAL))
					listener.userLoggedIn(newUser);
				else {
					listener.userLoggedOut(newUser);
					// the listener must be notified that the login was unsuccessful.
					provider.notifyLoginFailure();
				}

				provider = null;
				listener = null;
				started = false;

}
}