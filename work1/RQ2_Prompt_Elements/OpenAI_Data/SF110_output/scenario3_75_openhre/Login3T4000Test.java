// LoginTest.java
package com.browsersoft.aacs;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.security.auth.login.LoginException;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import com.browsersoft.aacs.xacml.PDPadapter;
import com.browsersoft.aacs.xacml.RequestBuilder;
import com.sun.xacml.Indenter;
import com.sun.xacml.ctx.RequestCtx;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Login}.
* It contains ten unit test cases for the {@link Login#authorize()} method.
*/
class LoginTest {

	/**
	* Test case 1 for {@link Login#authorize()}.
	* This test case tests the {@link Login#authorize()} method
	* with a valid user.
	*/
	@Test
	public void testAuthorize1() throws LoginException {
		User user = new User("user1", "password1");
		Login login = new Login(user);
		User authorizedUser = login.authorize();
		assertEquals(user, authorizedUser);
	}
	
	/**
	* Test case 2 for {@link Login#authorize()}.
	* This test case tests the {@link Login#authorize()} method
	* with a valid user.
	*/
	@Test
	public void testAuthorize2() throws LoginException {
		User user = new User("user2", "password2");
		Login login = new Login(user);
		User authorizedUser = login.authorize();
		assertEquals(user, authorizedUser);
	}
	
	/**
	* Test case 3 for {@link Login#authorize()}.
	* This test case tests the {@link Login#authorize()} method
	* with a valid user.
	*/
	@Test
	public void testAuthorize3() throws LoginException {
		User user = new User("user3", "password3");
		Login login = new Login(user);
		User authorizedUser = login.authorize();
		assertEquals(user, authorizedUser);
	}
	
	/**
	* Test case 4 for {@link Login#authorize()}.
	* This test case tests the {@link Login#authorize()} method
	* with a valid user.
	*/
	@Test
	public void testAuthorize4() throws LoginException {
		User user = new User("user4", "password4");
		Login login = new Login(user);
		User authorizedUser = login.authorize();
		assertEquals(user, authorizedUser);
	}
	
	/**
	* Test case 5 for {@link Login#authorize()}.
	* This test case tests the {@link Login#authorize()} method
	* with a valid user.
	*/
	@Test
	public void testAuthorize5() throws LoginException {
		User user = new User("user5", "password5");
		Login login = new Login(user);
		User authorizedUser = login.authorize();
		assertEquals(user, authorizedUser);
	}
	
	/**
	* Test case 6 for {@link Login#authorize()}.
	* This test case tests the {@link Login#authorize()} method
	* with a valid user.
	*/
	@Test
	public void testAuthorize6() throws LoginException {
		User user = new User("user6", "password6");
		Login login = new Login(user);
		User authorizedUser = login.authorize();
		assertEquals(user, authorizedUser);
	}
	
	/**
	* Test case 7 for {@link Login#authorize()}.
	* This test case tests the {@link Login#authorize()} method
	* with a valid user.
	*/
	@Test
	public void testAuthorize7() throws LoginException {
		User user = new User("user7", "password7");
		Login login = new Login(user);
		User authorizedUser = login.authorize();
		assertEquals(user, authorizedUser);
	}
	
	/**
	* Test case 8 for {@link Login#authorize()}.
	* This test case tests the {@link Login#authorize()} method
	* with a valid user.
	*/
	@Test
	public void testAuthorize8() throws LoginException {
		User user = new User("user8", "password8");
		Login login = new Login(user);
		User authorizedUser = login.authorize();
		assertEquals(user, authorizedUser);
	}
	
	/**
	* Test case 9 for {@link Login#authorize()}.
	* This test case tests the {@link Login#authorize()} method
	* with a valid user.
	*/
	@Test
	public void testAuthorize9() throws LoginException {
		User user = new User("user9", "password9");
		Login login = new Login(user);
		User authorizedUser = login.authorize();
		assertEquals(user, authorizedUser);
	}
	
	/**
	* Test case 10 for {@link Login#authorize()}.
	* This test case tests the {@link Login#authorize()} method
	* with a valid user.
	*/
	@Test
	public void testAuthorize10() throws LoginException {
		User user = new User("user10", "password10");
		Login login = new Login(user);
		User authorizedUser = login.authorize();
		assertEquals(user, authorizedUser);
	}
}