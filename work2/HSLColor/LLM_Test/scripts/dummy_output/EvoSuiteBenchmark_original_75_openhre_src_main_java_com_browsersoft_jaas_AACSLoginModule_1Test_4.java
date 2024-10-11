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
		 * Creates an instance of a <code>AACSLoginModule.
		 *
		 * @exception Exception
		 */
		AACSLoginModule_1Test(String loginModuleName, String configFilename, String configOptionName) throws Exception {
				System.out.println("AACSLoginModule "+loginModuleName+" created");
				JaasLoginModule.setPropertiesFile(configFilename);
				JaasLoginModule.setConfigurationOption(configOptionName);
				JaasLoginModule.setAuthTimeOut(0);
			}
		/**
		 * Runs this test.
		 *
		 * @throws Exception
		 *             if the test failed or
		  	    invalid parameters are passed to this test.
		 */
		void test() throws Exception {
						String path = "META-INF/aacs-auth.properties";
						JaasLoginModule.setPropertiesFile(path);
						JaasLoginModule.setConfigurationOption("default-password");
						JaasLoginModule.setSystemProperties("debug=true,output=System.out");
						System.out.println("Test started at:"+new Date());
						System.out.println("AACSLoginModule "+JaasLoginModule.LOGIN_MODULE +" test");
						String loginModuleName = JaasLoginModule.LOGIN_MODULE ;
						JaasLoginModule.login(loginModuleName);
						User user = (User) JaasLoginModule.getState();
				 assertNotNull("user", user);
				assertTrue( "user is null", user!=null) ;
						checkPassword("mypassword") ;
					}
}