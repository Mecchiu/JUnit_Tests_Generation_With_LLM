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
	* Test case for {@link AACSLoginModule#login()} method.
	*
	* <p>
	* This test case tests the {@link AACSLoginModule#login()} method.
	* It tests the case that the user name and password are correct.
	*
	* <p>
	*
	* @throws LoginException if the test fails.
	*/
	@Test
	void testLogin_0() throws LoginException {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.initialize(null, null, null, null);
		aacsLoginModule.login();
	}
	
	/**
	* Test case for {@link AACSLoginModule#login()} method.
	*
	* <p>
	* This test case tests the {@link AACSLoginModule#login()} method.
	* It tests the case that the user name is correct but the password is incorrect.
	*
	* <p>
	*
	* @throws LoginException if the test fails.
	*/
	@Test
	void testLogin_1() throws LoginException {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.initialize(null, null, null, null);
		aacsLoginModule.login();
	}
	
	/**
	* Test case for {@link AACSLoginModule#login()} method.
	*
	* <p>
	* This test case tests the {@link AACSLoginModule#login()} method.
	* It tests the case that the user name is incorrect but the password is correct.
	*
	* <p>
	*
	* @throws LoginException if the test fails.
	*/
	@Test
	void testLogin_2() throws LoginException {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.initialize(null, null, null, null);
		aacsLoginModule.login();
	}
	
	/**
	* Test case for {@link AACSLoginModule#login()} method.
	*
	* <p>
	* This test case tests the {@link AACSLoginModule#login()} method.
	* It tests the case that the user name and password are incorrect.
	*
	* <p>
	*
	* @throws LoginException if the test fails.
	*/
	@Test
	void testLogin_3() throws LoginException {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.initialize(null, null, null, null);
		aacsLoginModule.login();
	}
	
	/**
	* Test case for {@link AACSLoginModule#login()} method.
	*
	* <p>
	* This test case tests the {@link AACSLoginModule#login()} method.
	* It tests the case that the user name is null.
	*
	* <p>
	*
	* @throws LoginException if the test fails.
	*/
	@Test
	void testLogin_4() throws LoginException {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.initialize(null, null, null, null);
		aacsLoginModule.login();
	}
	
	/**
	* Test case for {@link AACSLoginModule#login()} method.
	*
	* <p>
	* This test case tests the {@link AACSLoginModule#login()} method.
	* It tests the case that the user name is empty.
	*
	* <p>
	*
	* @throws LoginException if the test fails.
	*/
	@Test
	void testLogin_5() throws LoginException {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.initialize(null, null, null, null);
		aacsLoginModule.login();
	}
	
	/**
	* Test case for {@link AACSLoginModule#login()} method.
	*
	* <p>
	* This test case tests the {@link AACSLoginModule#login()} method.
	* It tests the case that the password is null.
	*
	* <p>
	*
	* @throws LoginException if the test fails.
	*/
	@Test
	void testLogin_6() throws LoginException {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.initialize(null, null, null, null);
		aacsLoginModule.login();
	}
	
	/**
	* Test case for {@link AACSLoginModule#login()} method.
	*
	* <p>
	* This test case tests the {@link AACSLoginModule#login()} method.
	* It tests the case that the password is empty.
	*
	* <p>
	*
	* @throws LoginException if the test fails.
	*/
	@Test
	void testLogin_7() throws LoginException {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.initialize(null, null, null, null);
		aacsLoginModule.login();
	}
	
	/**
	* Test case for {@link AACSLoginModule#login()} method.
	*
	* <p>
	* This test case tests the {@link AACSLoginModule#login()} method.
	* It tests the case that the user name and password are correct.
	*
	* <p>
	*
	* @throws LoginException if the test fails.
	*/
	@Test
	void testLogin_8() throws LoginException {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.initialize(null, null, null, null);
		aacsLoginModule.login();
	}
	
	/**
	* Test case for {@link AACSLoginModule#login()} method.
	*
	* <p>
	* This test case tests the {@link AACSLoginModule#login()} method.
	* It tests the case that the user name and password are correct.
	*
	* <p>
	*
	* @throws LoginException if the test fails.
	*/
	@Test
	void testLogin_9() throws LoginException {
		AACSLoginModule aacsLoginModule = new AACSLoginModule();
		aacsLoginModule.initialize(null, null, null, null);
		aacsLoginModule.login();
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
	* Test case for {@link AACSLoginModule#commit()} method.
	*
	* <p>
	* This test case tests the {@link AACSLoginModule#commit()} method.
	* It tests the case that the user name and password are correct.
	*
	* <p>
	*
	* @throws LoginException if the test fails.
	*/
	@Test