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
		private final LoginModuleConfig config;
		private final Map<String,String> userProperties= new HashMap<String,String>();
		private final Map<String,String> roleProperties= new HashMap<String,String>();
		private Login login;
		private Map<String,String> userRoles;
		private Map<String,String> groupRoles;
		private Map<String,String> userProperties1;
		private Map<String,String> userProperties2;

	/**
     * Sole constructor.
     */
     public AACSLoginModule_3Test() {
     	    config = new LoginModuleConfig(0L);
     }

     /**
     * Creates a new user authentication configuration.
     *
     * <p> The configuration parameter
     * {@value LoginModuleConfig#KEY_PRINCIPAL_USER_PROPERTY}
     * specifies the login configuration,
     * with the name of the principal that will authenticate.
     *
     * <p> {@value LoginModuleConfig#KEY_ROLE_PROPERTY}
     * specifies the login configuration,
     * with the configuration properties of the authentication role.
     *
     * @return the new user authentication configuration.
     */
    private LoginConfiguration getNewUserConfig() {
        UserConfiguration config = new LoginConfiguration("TestUser",null);
        config.setRolePrincipal(config.getProperty(LoginModuleConfig.KEY_PRINCIPAL_USER_PROPERTY));
        config.setRoleMappings(new HashMap<String,String>());
        config.setAuthenticator(new TestAuthenticator());
        return config;
    }

//    /**
//     * Test method for {@link com.browsersoft.jaas.logout()}
//     */
//    @Test
//    public void testLogout() throws Exception{
//    	LoginRequestLogout loginRequest= new LoginRequestLogout();
//    	loginRequest.setRequirement(LoginRequest.REQ_LOGOUT);
//    	loginRequest.setParameter("username", "test");
//    	loginRequest.setParameter( "password", "test");
//    	loginRequest.setParameter("group", "testuser");
//    	User user = LoginConfig.makeUser(loginRequest);
//    	//testLogout(user!= null);
//    }

	private void testLogout(
		User user,
        String configProperty,
        String configValue) throws Exception {
        userRoles = new HashMap<String,String>(user.getRoles());
        configProperties.put(configProperty, configValue);
        user = LoginConfig.makeUser(getNewUserConfig());
        //testLogout(user!= null);

		User user1 = new User();
		user1.setUserName(user.getUserName());
		user1.setPassword(user.getPassword());
		String username= "testuser";
		setUserPassword(user, username, "test");
		userProperties1= user.getProperties();
		testLogout(user1, "password", "test");


		user.setUserName("testuser");
		setUserPassword(user, username, "test");
		userProperties2= user.getProperties();
		testLogout(user1, "password", "test");


//		user.setRole("testuser");
//		setUserPassword(user, username, "test");
//		userProperties1= user.getProperties();
//		userProperties2= user.getProperties();
	}



	private void setUserPassword(User user, String username, String password)
	{
		List<String> userRoles1= user.getRoles();

		String roleSet= user.getRoleSet();
		user.setPassword(password);

		String userProperties1= userProperties1;
		userProperties.clear();
		for(String roleName:roleSet){
			userProperties.putAll(userProperties1);
			userProperties1= userProperties1.get("");
			userProperties1= userProperties1.replaceAll("${"+roleName+} ", "");
			userProperties1= userProperties1.replaceAll("${"+roleName+ "}", username);
		}
		user.setRoles(userRoles1);
	}



	@Override
	public void initialize(Subject subject, CallbackHandler handler,Map<String,?> sharedState, Map<String,?> options) {
            System.setProperty("javax.security.auth.useSubjectCredsOnly","true");
//            System.setProperty("log4j.configurationFile", "conf/aacs.properties");
//            System.setProperty("org.apache.log4j.logger.NullLogger.debug=false");
		LoginModuleControlFlag flag = LoginModuleControlFlag.POST_LOGIN_CALLBACK;
		login = new Login();
	}

	@Override
	public boolean login() throws LoginException {
		return login.login(userProperties);
	}

	@Override
	public boolean commit() throws LoginException {
		return login.commit(userProperties);
	}
}