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
	void testLogin_1() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		try {
			aacsLoginModule.login();
			fail("LoginException expected");
		} catch (LoginException e) {
			assertEquals("Error: no CallbackHandler available to garner authentication information from the user", e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is empty.
	*/
	@Test
	void testLogin_2() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("");
				((PasswordCallback) callbacks[1]).setPassword("testPassword".toCharArray());
			}
		};
		try {
			aacsLoginModule.login();
			fail("LoginException expected");
		} catch (LoginException e) {
			assertEquals("Error: no CallbackHandler available to garner authentication information from the user", e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is not empty and the password is null.
	*/
	@Test
	void testLogin_3() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("testUser");
				((PasswordCallback) callbacks[1]).setPassword(null);
			}
		};
		try {
			aacsLoginModule.login();
			fail("LoginException expected");
		} catch (LoginException e) {
			assertEquals("Error: no CallbackHandler available to garner authentication information from the user", e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is not empty and the password is empty.
	*/
	@Test
	void testLogin_4() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("testUser");
				((PasswordCallback) callbacks[1]).setPassword("".toCharArray());
			}
		};
		try {
			aacsLoginModule.login();
			fail("LoginException expected");
		} catch (LoginException e) {
			assertEquals("Error: no CallbackHandler available to garner authentication information from the user", e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is not empty and the password is not empty.
	*/
	@Test
	void testLogin_5() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("testUser");
				((PasswordCallback) callbacks[1]).setPassword("testPassword".toCharArray());
			}
		};
		try {
			aacsLoginModule.login();
			fail("LoginException expected");
		} catch (LoginException e) {
			assertEquals("Error: no CallbackHandler available to garner authentication information from the user", e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is not empty and the password is not empty.
	*/
	@Test
	void testLogin_6() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("testUser");
				((PasswordCallback) callbacks[1]).setPassword("testPassword".toCharArray());
			}
		};
		aacsLoginModule.debug = true;
		try {
			aacsLoginModule.login();
			fail("LoginException expected");
		} catch (LoginException e) {
			assertEquals("Error: no CallbackHandler available to garner authentication information from the user", e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is not empty and the password is not empty.
	*/
	@Test
	void testLogin_7() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("testUser");
				((PasswordCallback) callbacks[1]).setPassword("testPassword".toCharArray());
			}
		};
		aacsLoginModule.debug = true;
		aacsLoginModule.config = "testConfig";
		try {
			aacsLoginModule.login();
			fail("LoginException expected");
		} catch (LoginException e) {
			assertEquals("Error: no CallbackHandler available to garner authentication information from the user", e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is not empty and the password is not empty.
	*/
	@Test
	void testLogin_8() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.callbackHandler = new CallbackHandler() {
			public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				((NameCallback) callbacks[0]).setName("testUser");
				((PasswordCallback) callbacks[1]).setPassword("testPassword".toCharArray());
			}
		};
		aacsLoginModule.debug = true;
		aacsLoginModule.config = "testConfig";
		aacsLoginModule.loginContext = new LoginContext("testContext", new Subject());
		try {
			aacsLoginModule.login();
			fail("LoginException expected");
		} catch (LoginException e) {
			assertEquals("Error: no CallbackHandler available to garner authentication information from the user", e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is not empty and the password is not empty.
	*/