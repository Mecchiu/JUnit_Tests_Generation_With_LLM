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
		
	@Test
	public void a() throws Exception {
		AACSLoginModule am = new AACSLoginModule();
		CallbackHandler ch = new ChallengeCallbackHandler();
		am.setCallbackHandler(ch);
		assertTrue(am.abort());
	}

	@Test
	public void b() throws LoginException {
		System.out.println(new LoginRequest(new Callback[0]));
		System.setSecurityManager(new SecurityManager());
		User user = new User("testUser", "testPassword");
		do {
			System.out.print("login [Test]");
			ch = new ChallengeCallbackHandler();
			ch.handle(new LoginRequest(new Callback[0]));
			System.out.println("login [PASS]");
		} while(!ch.getStatus());

		AACSLoginModule am = new AACSLoginModule();
		CallbackHandler ch = new ChallengeCallbackHandler();
		am.setCallbackHandler(ch);
		ch.setErrorHandler(new ErrorHandler() {
			/** A method that is called after the login fails */
			public void handle(Callback[] callbacks)
				throws IOException, UnavailableAuthenticationException {
				System.out.println("Error: Not logged in");
			}
		});
		boolean status = am.abort();
		if (!status) System.out.println("login [FAIL]");
		System.out.println();
	}
}