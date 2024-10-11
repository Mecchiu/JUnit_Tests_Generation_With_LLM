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
	* Test case for {@link AACSLoginModule#login()} method.
	* It tests the case when the user name and password are correct.
	*/
	@Test
	public void testLogin_CorrectUserNameAndPassword() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is correct but the password is incorrect.
	*/
	@Test
	public void testLogin_CorrectUserNameIncorrectPassword() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is incorrect but the password is correct.
	*/
	@Test
	public void testLogin_IncorrectUserNameCorrectPassword() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for {@link AACSLoginModule#login()} method.
	* It tests the case when the user name and password are incorrect.
	*/
	@Test
	public void testLogin_IncorrectUserNameAndPassword() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is null.
	*/
	@Test
	public void testLogin_NullUserName() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for {@link AACSLoginModule#login()} method.
	* It tests the case when the password is null.
	*/
	@Test
	public void testLogin_NullPassword() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is empty.
	*/
	@Test
	public void testLogin_EmptyUserName() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for {@link AACSLoginModule#login()} method.
	* It tests the case when the password is empty.
	*/
	@Test
	public void testLogin_EmptyPassword() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for {@link AACSLoginModule#login()} method.
	* It tests the case when the user name is blank.
	*/
	@Test
	public void testLogin_BlankUserName() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for {@link AACSLoginModule#login()} method.
	* It tests the case when the password is blank.
	*/
	@Test
	public void testLogin_BlankPassword() {
		// TODO: implement this test case
	}
}