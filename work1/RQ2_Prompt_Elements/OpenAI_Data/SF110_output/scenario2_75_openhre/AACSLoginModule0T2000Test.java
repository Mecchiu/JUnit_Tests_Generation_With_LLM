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
	* It tests the case when the user name and password are correct.
	*/
	@Test
	void testLogin_CorrectUserNameAndPassword() {
		// Arrange
		AACSLoginModule loginModule = new AACSLoginModule();
		CallbackHandler callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("testUser");
				((PasswordCallback) callbacks[1]).setPassword("testPassword".toCharArray());
			}
		};
		loginModule.initialize(null, callbackHandler, null, null);
		
		// Act
		boolean result = loginModule.login();
		
		// Assert
		assertTrue(result);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is correct but the password is incorrect.
	*/
	@Test
	void testLogin_CorrectUserNameAndIncorrectPassword() {
		// Arrange
		AACSLoginModule loginModule = new AACSLoginModule();
		CallbackHandler callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("testUser");
				((PasswordCallback) callbacks[1]).setPassword("incorrectPassword".toCharArray());
			}
		};
		loginModule.initialize(null, callbackHandler, null, null);
		
		// Act
		boolean result = loginModule.login();
		
		// Assert
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is incorrect but the password is correct.
	*/
	@Test
	void testLogin_IncorrectUserNameAndCorrectPassword() {
		// Arrange
		AACSLoginModule loginModule = new AACSLoginModule();
		CallbackHandler callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("incorrectUser");
				((PasswordCallback) callbacks[1]).setPassword("testPassword".toCharArray());
			}
		};
		loginModule.initialize(null, callbackHandler, null, null);
		
		// Act
		boolean result = loginModule.login();
		
		// Assert
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name and password are incorrect.
	*/
	@Test
	void testLogin_IncorrectUserNameAndPassword() {
		// Arrange
		AACSLoginModule loginModule = new AACSLoginModule();
		CallbackHandler callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("incorrectUser");
				((PasswordCallback) callbacks[1]).setPassword("incorrectPassword".toCharArray());
			}
		};
		loginModule.initialize(null, callbackHandler, null, null);
		
		// Act
		boolean result = loginModule.login();
		
		// Assert
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is null.
	*/
	@Test
	void testLogin_NullUserName() {
		// Arrange
		AACSLoginModule loginModule = new AACSLoginModule();
		CallbackHandler callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName(null);
				((PasswordCallback) callbacks[1]).setPassword("testPassword".toCharArray());
			}
		};
		loginModule.initialize(null, callbackHandler, null, null);
		
		// Act
		boolean result = loginModule.login();
		
		// Assert
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is empty.
	*/
	@Test
	void testLogin_EmptyUserName() {
		// Arrange
		AACSLoginModule loginModule = new AACSLoginModule();
		CallbackHandler callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("");
				((PasswordCallback) callbacks[1]).setPassword("testPassword".toCharArray());
			}
		};
		loginModule.initialize(null, callbackHandler, null, null);
		
		// Act
		boolean result = loginModule.login();
		
		// Assert
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the password is null.
	*/
	@Test
	void testLogin_NullPassword() {
		// Arrange
		AACSLoginModule loginModule = new AACSLoginModule();
		CallbackHandler callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("testUser");
				((PasswordCallback) callbacks[1]).setPassword(null);
			}
		};
		loginModule.initialize(null, callbackHandler, null, null);
		
		// Act
		boolean result = loginModule.login();
		
		// Assert
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the password is empty.
	*/
	@Test
	void testLogin_EmptyPassword() {
		// Arrange
		AACSLoginModule loginModule = new AACSLoginModule();
		CallbackHandler callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("testUser");
				((PasswordCallback) callbacks[1]).setPassword("".toCharArray());
			}
		};
		loginModule.initialize(null, callbackHandler, null, null);
		
		// Act
		boolean result = loginModule.login();
		
		// Assert
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the callback handler is null.
	*/
	@Test
	void testLogin_NullCallbackHandler() {
		// Arrange
		AACSLoginModule loginModule = new AACSLoginModule();
		loginModule.initialize(null, null, null, null);
		
		// Act
		boolean result = loginModule.login();
		
		// Assert
		assertFalse(result);
	}
	
	/**