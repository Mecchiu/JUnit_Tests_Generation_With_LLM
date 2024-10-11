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
* It contains ten unit test cases for the {@link Login#getProps()} method.
*/
class LoginTest {

	/**
	* Test case 1 for {@link Login#getProps()}.
	* This test case checks if the method returns a non-null value.
	*/
	@Test
	void testGetProps1() {
		assertNotNull(Login.getProps());
	}
	
	/**
	* Test case 2 for {@link Login#getProps()}.
	* This test case checks if the method returns a non-null value.
	*/
	@Test
	void testGetProps2() {
		assertNotNull(Login.getProps());
	}
	
	/**
	* Test case 3 for {@link Login#getProps()}.
	* This test case checks if the method returns a non-null value.
	*/
	@Test
	void testGetProps3() {
		assertNotNull(Login.getProps());
	}
	
	/**
	* Test case 4 for {@link Login#getProps()}.
	* This test case checks if the method returns a non-null value.
	*/
	@Test
	void testGetProps4() {
		assertNotNull(Login.getProps());
	}
	
	/**
	* Test case 5 for {@link Login#getProps()}.
	* This test case checks if the method returns a non-null value.
	*/
	@Test
	void testGetProps5() {
		assertNotNull(Login.getProps());
	}
	
	/**
	* Test case 6 for {@link Login#getProps()}.
	* This test case checks if the method returns a non-null value.
	*/
	@Test
	void testGetProps6() {
		assertNotNull(Login.getProps());
	}
	
	/**
	* Test case 7 for {@link Login#getProps()}.
	* This test case checks if the method returns a non-null value.
	*/
	@Test
	void testGetProps7() {
		assertNotNull(Login.getProps());
	}
	
	/**
	* Test case 8 for {@link Login#getProps()}.
	* This test case checks if the method returns a non-null value.
	*/
	@Test
	void testGetProps8() {
		assertNotNull(Login.getProps());
	}
	
	/**
	* Test case 9 for {@link Login#getProps()}.
	* This test case checks if the method returns a non-null value.
	*/
	@Test
	void testGetProps9() {
		assertNotNull(Login.getProps());
	}
	
	/**
	* Test case 10 for {@link Login#getProps()}.
	* This test case checks if the method returns a non-null value.
	*/
	@Test
	void testGetProps10() {
		assertNotNull(Login.getProps());
	}
}