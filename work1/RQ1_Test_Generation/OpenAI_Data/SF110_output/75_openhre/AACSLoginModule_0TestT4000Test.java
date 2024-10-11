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
* It contains ten unit test cases for the {@link AACSLoginModule#login()} method.
*/
class AACSLoginModule_0Test {

	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case that the username is null and the password is null.
	* Expected: {@link FailedLoginException}.
	*/
	@Test
	void testLogin_0() throws Exception {
		AACSLoginModule aACSLoginModule = new AACSLoginModule();
		aACSLoginModule.initialize(null, null, null, null);
		try {
			aACSLoginModule.login();
			fail("Expected FailedLoginException");
		} catch (FailedLoginException e) {
			// We are expecting FailedLoginException
		}
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case that the username is empty and the password is null.
	* Expected: {@link FailedLoginException}.
	*/
	@Test
	void testLogin_1() throws Exception {
		AACSLoginModule aACSLoginModule = new AACSLoginModule();
		aACSLoginModule.initialize(null, null, null, null);
		try {
			aACSLoginModule.login();
			fail("Expected FailedLoginException");
		} catch (FailedLoginException e) {
			// We are expecting FailedLoginException
		}
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case that the username is null and the password is empty.
	* Expected: {@link FailedLoginException}.
	*/
	@Test
	void testLogin_2() throws Exception {
		AACSLoginModule aACSLoginModule = new AACSLoginModule();
		aACSLoginModule.initialize(null, null, null, null);
		try {
			aACSLoginModule.login();
			fail("Expected FailedLoginException");
		} catch (FailedLoginException e) {
			// We are expecting FailedLoginException
		}
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case that the username is empty and the password is empty.
	* Expected: {@link FailedLoginException}.
	*/
	@Test
	void testLogin_3() throws Exception {
		AACSLoginModule aACSLoginModule = new AACSLoginModule();
		aACSLoginModule.initialize(null, null, null, null);
		try {
			aACSLoginModule.login();
			fail("Expected FailedLoginException");
		} catch (FailedLoginException e) {
			// We are expecting FailedLoginException
		}
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case that the username is valid and the password is null.
	* Expected: {@link FailedLoginException}.
	*/
	@Test
	void testLogin_4() throws Exception {
		AACSLoginModule aACSLoginModule = new AACSLoginModule();
		aACSLoginModule.initialize(null, null, null, null);
		try {
			aACSLoginModule.login();
			fail("Expected FailedLoginException");
		} catch (FailedLoginException e) {
			// We are expecting FailedLoginException
		}
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case that the username is valid and the password is empty.
	* Expected: {@link FailedLoginException}.
	*/
	@Test
	void testLogin_5() throws Exception {
		AACSLoginModule aACSLoginModule = new AACSLoginModule();
		aACSLoginModule.initialize(null, null, null, null);
		try {
			aACSLoginModule.login();
			fail("Expected FailedLoginException");
		} catch (FailedLoginException e) {
			// We are expecting FailedLoginException
		}
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case that the username is null and the password is valid.
	* Expected: {@link FailedLoginException}.
	*/
	@Test
	void testLogin_6() throws Exception {
		AACSLoginModule aACSLoginModule = new AACSLoginModule();
		aACSLoginModule.initialize(null, null, null, null);
		try {
			aACSLoginModule.login();
			fail("Expected FailedLoginException");
		} catch (FailedLoginException e) {
			// We are expecting FailedLoginException
		}
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case that the username is empty and the password is valid.
	* Expected: {@link FailedLoginException}.
	*/
	@Test
	void testLogin_7() throws Exception {
		AACSLoginModule aACSLoginModule = new AACSLoginModule();
		aACSLoginModule.initialize(null, null, null, null);
		try {
			aACSLoginModule.login();
			fail("Expected FailedLoginException");
		} catch (FailedLoginException e) {
			// We are expecting FailedLoginException
		}
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case that the username is valid and the password is valid.
	* Expected: {@link FailedLoginException}.
	*/
	@Test
	void testLogin_8() throws Exception {
		AACSLoginModule aACSLoginModule = new AACSLoginModule();
		aACSLoginModule.initialize(null, null, null, null);
		try {
			aACSLoginModule.login();
			fail("Expected FailedLoginException");
		} catch (FailedLoginException e) {
			// We are expecting FailedLoginException
		}
	}
	
	/**
	* Test case for the {@link AACSLoginModule#login()} method.
	* It tests the case that the username is valid and the password is valid.
	* Expected: {@link FailedLoginException}.
	*/
	@Test
	void testLogin_9() throws Exception {
		AACSLoginModule aACSLoginModule = new AACSLoginModule();
		aACSLoginModule.initialize(null, null, null, null);
		try {
			aACSLoginModule.login();
			fail("Expected FailedLoginException");
		} catch (FailedLoginException e) {
			// We are expecting FailedLoginException
		}
	}
	
}

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
* It contains ten unit test cases for the {@link AACSLoginModule#commit()} method.
*/
class AACSLoginModule_1Test {
		
	/**
	* Test case for the {@link AACSLoginModule#commit()} method.
	* It tests the case that the succeeded is false.
	* Expected: false.
	*/
	@Test
	void testCommit_0() throws Exception {
		AACSLoginModule aACSLoginModule = new AACSLoginModule();
		aACSLoginModule.initialize(null, null, null, null);
		aACSLoginModule.succeeded = false;
		assertFalse(aACSLoginModule.commit());
	}
	
	/**
	* Test case for the {@link AACSLoginModule#commit()} method.
	* It tests the case that the succeeded is true and the commitSucceeded is false.
	* Expected: false.
	*/
	@Test
	void testCommit_1() throws Exception {
		AACSLoginModule aACSLoginModule = new AACSLoginModule();
		aACSLoginModule.initialize(null, null, null, null);
		aACSLoginModule.succeeded = true;
		aACSLoginModule.commitSucceeded = false;
		assertFalse(aACSLoginModule.commit());
	}
	
	/**
	* Test case for the {@link AACSLoginModule#commit()} method.
	* It tests the case that the succeeded is true and the commitSucceeded is true.
	* Expected: true.
	*/
	@Test
	void testCommit_2() throws Exception {
		AACSLoginModule aACSLoginModule = new AACSLoginModule();
		aACSLoginModule.initialize(null, null, null, null);
		aACSLoginModule.succeeded = true;
		aACSLoginModule.commitSucceeded = true;
		assertTrue(aACSLoginModule.commit());
	}
	
	/**
	* Test case for the {@link AACSLoginModule#commit()} method.
	* It tests the case that the succeeded is true and the commitSucceeded is true.
	* Expected: true.
	*/
	@Test
	void testCommit_3() throws Exception {
		AACSLoginModule aACSLoginModule = new AACSLoginModule();
		aACSLoginModule.initialize(null, null, null, null);
		aACSLoginModule.succeeded = true;
		aACSLoginModule.commitSucceeded = true;
		assertTrue(aACSLoginModule.commit());
	}
	
	/**
	* Test case for the {@link AACSLoginModule#commit()} method.
	* It tests the case that the succeeded is true and the commitSucceeded is true.
	* Expected: true.
	*/
	@Test
	void testCommit_4() throws Exception {
		AACSLoginModule aACSLoginModule = new AACSLoginModule();
		aACSLoginModule.initialize(null, null, null, null);
		aACSLoginModule.succeeded = true;
		aACSLoginModule.commitSucceeded = true;
		assertTrue(aACSLoginModule.commit());
	}
	
	/**
	* Test case for the {@link AACSLoginModule#commit()} method.
	* It tests the case that the succeeded is true and the commitSucceeded is true.
	* Expected: true.
	*/
	@Test
	void testCommit_5() throws Exception {
		AACSLoginModule aACSLoginModule = new AACSLoginModule();
		aACSLoginModule.initialize(null, null, null, null);
		aACSLoginModule.succeeded = true;
		aACSLoginModule.commitSucceeded = true;
		assertTrue(aACSLoginModule.commit());
	}
	
	/**
	* Test case for the {@link AACSLoginModule#commit()} method.
	* It tests the case that the succeeded is true and the commitSucceeded is true.
	* Expected: true.
	*/
	@Test
	void testCommit_6() throws Exception {
		AACSLoginModule aACSLoginModule = new AACSLoginModule();
		aACSLoginModule.initialize(null, null, null, null);
		aACSLoginModule.succeeded = true;
		aACSLoginModule.commitSucceeded = true;
		assertTrue(aACSLoginModule.commit());
	}
	
	/**
	* Test case for the {@link AACSLoginModule#commit()} method.
	* It tests the case that the succeeded is true and the commitSucceeded is true.
	* Expected: true.
	*/
	@Test
	void testCommit_7() throws Exception {
		AACSLoginModule aACSLoginModule = new AACSLoginModule();
		aACSLoginModule.initialize(null, null, null, null);
		aACSLoginModule.succeeded = true;
		aACSLoginModule.commitSucceeded = true;
		assertTrue(aACSLoginModule.commit());
	}
	
	/**
	* Test case for the {@link AACSLoginModule#commit()} method.
	* It tests the case that the succeeded is true and the commitSucceeded is true.
	* Expected: true.
	*/
	@Test
	void testCommit_8() throws Exception {
		AACSLoginModule aACSLoginModule = new AACSLoginModule();
		aACSLoginModule.initialize(null, null, null, null);
		aACSLoginModule.succeeded = true;
		aACSLoginModule.commitSucceeded = true;
		assertTrue(aACSLoginModule.commit());
	}
	
	/**
	* Test case for the {@link AACSLoginModule#commit()} method.
	* It tests the case that the succeeded is true and the commitSucceeded is true.
	* Expected: true.
	*/
	@Test
	void testCommit_9() throws Exception {
		AACSLoginModule aACSLoginModule = new AACSLoginModule();
		aACSLoginModule.initialize(null, null, null, null);
		aACSLoginModule.succeeded = true;
		aACSLoginModule.commitSucceeded = true;
		assertTrue(aACSLoginModule.commit());
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
* It contains ten unit test cases for the {@link AACSLoginModule#abort()} method.
*/
class AACSLoginModule_2Test {
		
	/**
	* Test case for the {@link AACSLoginModule#abort()} method.
	* It tests the case that the succeeded is false.
	* Expected: false.
	*/
	@Test
	void testAbort_0() throws Exception {
		AACSLoginModule aACSLoginModule = new