// AACSLoginModuleTest.java
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
* It contains ten unit test cases for the {@link AACSLoginModule#login()} method.
*/
class AACSLoginModuleTest {

	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is null.
	*/
	@Test
	void testLogin_NullUserName() {
		AACSLoginModule loginModule = new AACSLoginModule();
		CallbackHandler callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName(null);
				((PasswordCallback) callbacks[1]).setPassword(new char[] {'t', 'e', 's', 't', 'P', 'a', 's', 's', 'w', 'o', 'r', 'd'});
			}
		};
		loginModule.initialize(null, null, callbackHandler, null);
		assertThrows(LoginException.class, () -> {
			loginModule.login();
		});
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is empty.
	*/
	@Test
	void testLogin_EmptyUserName() {
		AACSLoginModule loginModule = new AACSLoginModule();
		CallbackHandler callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("");
				((PasswordCallback) callbacks[1]).setPassword(new char[] {'t', 'e', 's', 't', 'P', 'a', 's', 's', 'w', 'o', 'r', 'd'});
			}
		};
		loginModule.initialize(null, null, callbackHandler, null);
		assertThrows(LoginException.class, () -> {
			loginModule.login();
		});
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the password is null.
	*/
	@Test
	void testLogin_NullPassword() {
		AACSLoginModule loginModule = new AACSLoginModule();
		CallbackHandler callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("testUser");
				((PasswordCallback) callbacks[1]).setPassword(null);
			}
		};
		loginModule.initialize(null, null, callbackHandler, null);
		assertThrows(LoginException.class, () -> {
			loginModule.login();
		});
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the password is empty.
	*/
	@Test
	void testLogin_EmptyPassword() {
		AACSLoginModule loginModule = new AACSLoginModule();
		CallbackHandler callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("testUser");
				((PasswordCallback) callbacks[1]).setPassword(new char[] {});
			}
		};
		loginModule.initialize(null, null, callbackHandler, null);
		assertThrows(LoginException.class, () -> {
			loginModule.login();
		});
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name and password are correct.
	*/
	@Test
	void testLogin_CorrectUserNameAndPassword() {
		AACSLoginModule loginModule = new AACSLoginModule();
		CallbackHandler callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("testUser");
				((PasswordCallback) callbacks[1]).setPassword(new char[] {'t', 'e', 's', 't', 'P', 'a', 's', 's', 'w', 'o', 'r', 'd'});
			}
		};
		loginModule.initialize(null, null, callbackHandler, null);
		assertDoesNotThrow(() -> {
			loginModule.login();
		});
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is correct but the password is incorrect.
	*/
	@Test
	void testLogin_CorrectUserNameIncorrectPassword() {
		AACSLoginModule loginModule = new AACSLoginModule();
		CallbackHandler callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("testUser");
				((PasswordCallback) callbacks[1]).setPassword(new char[] {'t', 'e', 's', 't', 'P', 'a', 's', 's', 'w', 'o', 'r', 'd', '1'});
			}
		};
		loginModule.initialize(null, null, callbackHandler, null);
		assertThrows(FailedLoginException.class, () -> {
			loginModule.login();
		});
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is incorrect but the password is correct.
	*/
	@Test
	void testLogin_IncorrectUserNameCorrectPassword() {
		AACSLoginModule loginModule = new AACSLoginModule();
		CallbackHandler callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("testUser1");
				((PasswordCallback) callbacks[1]).setPassword(new char[] {'t', 'e', 's', 't', 'P', 'a', 's', 's', 'w', 'o', 'r', 'd'});
			}
		};
		loginModule.initialize(null, null, callbackHandler, null);
		assertThrows(FailedLoginException.class, () -> {
			loginModule.login();
		});
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name and password are incorrect.
	*/
	@Test
	void testLogin_IncorrectUserNameAndPassword() {
		AACSLoginModule loginModule = new AACSLoginModule();
		CallbackHandler callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("testUser1");
				((PasswordCallback) callbacks[1]).setPassword(new char[] {'t', 'e', 's', 't', 'P', 'a', 's', 's', 'w', 'o', 'r', 'd', '1'});
			}
		};
		loginModule.initialize(null, null, callbackHandler, null);
		assertThrows(FailedLoginException.class, () -> {
			loginModule.login();
		});
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is correct but the password is null.
	*/
	@Test
	void testLogin_CorrectUserNameNullPassword() {
		AACSLoginModule loginModule = new AACSLoginModule();
		CallbackHandler callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("testUser");
				((PasswordCallback) callbacks[1]).setPassword(null);
			}
		};
		loginModule.initialize(null, null, callbackHandler, null);
		assertThrows(LoginException.class, () -> {
			loginModule.login();
		});
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is correct but the password is empty.
	*/
	@Test
	void testLogin_CorrectUserNameEmptyPassword() {
		AACSLoginModule loginModule = new AACSLoginModule();
		CallbackHandler callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("testUser");
				((PasswordCallback) callbacks[1]).setPassword(new char[] {});
			}
		};
		loginModule.initialize(null, null, callbackHandler, null);
		assertThrows(LoginException.class, () -> {
			loginModule.login();
		});
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is null but the password is correct.
	*/
	@Test
	void testLogin_NullUserNameCorrectPassword() {
		AACSLoginModule loginModule = new AACSLoginModule();
		CallbackHandler callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName(null);
				((PasswordCallback) callbacks[1]).setPassword(new char[] {'t', 'e', 's', 't', 'P', 'a', 's', 's', 'w', 'o', 'r', 'd'});
			}
		};
		loginModule.initialize(null, null, callbackHandler, null);
		assertThrows(LoginException.class, () -> {
			loginModule.login();
		});
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is empty but the password is correct.
	*/
	@Test
	void testLogin_EmptyUserNameCorrectPassword() {
		AACSLoginModule loginModule = new AACSLoginModule();
		CallbackHandler callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("");
				((PasswordCallback) callbacks[1]).setPassword(new char[] {'t', 'e', 's', 't', 'P', 'a', 's', 's', 'w', 'o', 'r', 'd'});
			}
		};
		loginModule.initialize(null, null, callbackHandler, null);
		assertThrows(LoginException.class, () -> {
			loginModule.login();
		});
	}
}