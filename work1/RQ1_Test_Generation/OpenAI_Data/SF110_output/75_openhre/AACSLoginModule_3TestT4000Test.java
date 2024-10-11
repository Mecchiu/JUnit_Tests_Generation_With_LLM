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
* It contains ten unit test cases for the {@link AACSLoginModule#logout()} method.
*/
class AACSLoginModule_3Test {

	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is null and expects IllegalStateException.
	*/
	@Test
	public void testLogout_NullSubject() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		try {
			aacsLoginModule.logout();
			fail("IllegalStateException expected.");
		} catch (IllegalStateException e) {
			// as expected
		} catch (Exception e) {
			fail("IllegalStateException expected, but caught " + e.getClass().getName());
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is not null and expects true.
	*/
	@Test
	public void testLogout_NotNullSubject() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.logout());
		} catch (Exception e) {
			fail("Unexpected exception occurs in testLogout_NotNullSubject.");
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is not null and expects true.
	*/
	@Test
	public void testLogout_NotNullSubject2() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.logout());
		} catch (Exception e) {
			fail("Unexpected exception occurs in testLogout_NotNullSubject2.");
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is not null and expects true.
	*/
	@Test
	public void testLogout_NotNullSubject3() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.logout());
		} catch (Exception e) {
			fail("Unexpected exception occurs in testLogout_NotNullSubject3.");
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is not null and expects true.
	*/
	@Test
	public void testLogout_NotNullSubject4() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.logout());
		} catch (Exception e) {
			fail("Unexpected exception occurs in testLogout_NotNullSubject4.");
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is not null and expects true.
	*/
	@Test
	public void testLogout_NotNullSubject5() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.logout());
		} catch (Exception e) {
			fail("Unexpected exception occurs in testLogout_NotNullSubject5.");
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is not null and expects true.
	*/
	@Test
	public void testLogout_NotNullSubject6() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.logout());
		} catch (Exception e) {
			fail("Unexpected exception occurs in testLogout_NotNullSubject6.");
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is not null and expects true.
	*/
	@Test
	public void testLogout_NotNullSubject7() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.logout());
		} catch (Exception e) {
			fail("Unexpected exception occurs in testLogout_NotNullSubject7.");
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is not null and expects true.
	*/
	@Test
	public void testLogout_NotNullSubject8() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.logout());
		} catch (Exception e) {
			fail("Unexpected exception occurs in testLogout_NotNullSubject8.");
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is not null and expects true.
	*/
	@Test
	public void testLogout_NotNullSubject9() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.logout());
		} catch (Exception e) {
			fail("Unexpected exception occurs in testLogout_NotNullSubject9.");
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	* It tests the case that when the subject is not null and expects true.
	*/
	@Test
	public void testLogout_NotNullSubject10() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.logout());
		} catch (Exception e) {
			fail("Unexpected exception occurs in testLogout_NotNullSubject10.");
		}
	}
}

// AACSLoginModule_4Test.java
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
class AACSLoginModule_4Test {
		
	/**
	* Test case for {@link AACSLoginModule#abort()} method.
	* It tests the case that when the subject is null and expects IllegalStateException.
	*/
	@Test
	public void testAbort_NullSubject() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		try {
			aacsLoginModule.abort();
			fail("IllegalStateException expected.");
		} catch (IllegalStateException e) {
			// as expected
		} catch (Exception e) {
			fail("IllegalStateException expected, but caught " + e.getClass().getName());
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#abort()} method.
	* It tests the case that when the subject is not null and expects true.
	*/
	@Test
	public void testAbort_NotNullSubject() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.abort());
		} catch (Exception e) {
			fail("Unexpected exception occurs in testAbort_NotNullSubject.");
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#abort()} method.
	* It tests the case that when the subject is not null and expects true.
	*/
	@Test
	public void testAbort_NotNullSubject2() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.abort());
		} catch (Exception e) {
			fail("Unexpected exception occurs in testAbort_NotNullSubject2.");
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#abort()} method.
	* It tests the case that when the subject is not null and expects true.
	*/
	@Test
	public void testAbort_NotNullSubject3() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.abort());
		} catch (Exception e) {
			fail("Unexpected exception occurs in testAbort_NotNullSubject3.");
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#abort()} method.
	* It tests the case that when the subject is not null and expects true.
	*/
	@Test
	public void testAbort_NotNullSubject4() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.abort());
		} catch (Exception e) {
			fail("Unexpected exception occurs in testAbort_NotNullSubject4.");
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#abort()} method.
	* It tests the case that when the subject is not null and expects true.
	*/
	@Test
	public void testAbort_NotNullSubject5() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.abort());
		} catch (Exception e) {
			fail("Unexpected exception occurs in testAbort_NotNullSubject5.");
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#abort()} method.
	* It tests the case that when the subject is not null and expects true.
	*/
	@Test
	public void testAbort_NotNullSubject6() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.abort());
		} catch (Exception e) {
			fail("Unexpected exception occurs in testAbort_NotNullSubject6.");
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#abort()} method.
	* It tests the case that when the subject is not null and expects true.
	*/
	@Test
	public void testAbort_NotNullSubject7() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.abort());
		} catch (Exception e) {
			fail("Unexpected exception occurs in testAbort_NotNullSubject7.");
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#abort()} method.
	* It tests the case that when the subject is not null and expects true.
	*/
	@Test
	public void testAbort_NotNullSubject8() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.abort());
		} catch (Exception e) {
			fail("Unexpected exception occurs in testAbort_NotNullSubject8.");
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#abort()} method.
	* It tests the case that when the subject is not null and expects true.
	*/
	@Test
	public void testAbort_NotNullSubject9() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.abort());
		} catch (Exception e) {
			fail("Unexpected exception occurs in testAbort_NotNullSubject9.");
		}
	}
	
	/**
	* Test case for {@link AACSLoginModule#abort()} method.
	* It tests the case that when the subject is not null and expects true.
	*/
	@Test
	public void testAbort_NotNullSubject10() {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		Subject subject = new Subject();
		aacsLoginModule.initialize(subject, null, null, null);
		try {
			assertTrue(aacsLoginModule.abort());
		} catch (Exception e) {
			fail("Unexpected exception occurs in testAbort_NotNullSubject10.");
		}
	}
}
