// Login_2Test.java
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
* It contains ten unit test cases for the {@link Login#getSecurityLogFilePath()} method.
*/
class Login_2Test {

	/**
	* Test case for the {@link Login#getSecurityLogFilePath()} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>{@code null}</li>
	* </ul>
	* The test case expects the following:
	* <ul>
	* <li>{@code NullPointerException}</li>
	* </ul>
	*/
	@Test
	public void testGetSecurityLogFilePath_1() {
		// Arrange
		Login login = new Login();
		
		// Act
		try {
			login.getSecurityLogFilePath();
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// Assert
			assertNotNull(e);
		}
	}
	
	/**
	* Test case for the {@link Login#getSecurityLogFilePath()} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>{@code null}</li>
	* </ul>
	* The test case expects the following:
	* <ul>
	* <li>{@code NullPointerException}</li>
	* </ul>
	*/
	@Test
	public void testGetSecurityLogFilePath_2() {
		// Arrange
		Login login = new Login();
		
		// Act
		try {
			login.getSecurityLogFilePath();
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// Assert
			assertNotNull(e);
		}
	}
	
	/**
	* Test case for the {@link Login#getSecurityLogFilePath()} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>{@code null}</li>
	* </ul>
	* The test case expects the following:
	* <ul>
	* <li>{@code NullPointerException}</li>
	* </ul>
	*/
	@Test
	public void testGetSecurityLogFilePath_3() {
		// Arrange
		Login login = new Login();
		
		// Act
		try {
			login.getSecurityLogFilePath();
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// Assert
			assertNotNull(e);
		}
	}
	
	/**
	* Test case for the {@link Login#getSecurityLogFilePath()} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>{@code null}</li>
	* </ul>
	* The test case expects the following:
	* <ul>
	* <li>{@code NullPointerException}</li>
	* </ul>
	*/
	@Test
	public void testGetSecurityLogFilePath_4() {
		// Arrange
		Login login = new Login();
		
		// Act
		try {
			login.getSecurityLogFilePath();
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// Assert
			assertNotNull(e);
		}
	}
	
	/**
	* Test case for the {@link Login#getSecurityLogFilePath()} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>{@code null}</li>
	* </ul>
	* The test case expects the following:
	* <ul>
	* <li>{@code NullPointerException}</li>
	* </ul>
	*/
	@Test
	public void testGetSecurityLogFilePath_5() {
		// Arrange
		Login login = new Login();
		
		// Act
		try {
			login.getSecurityLogFilePath();
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// Assert
			assertNotNull(e);
		}
	}
	
	/**
	* Test case for the {@link Login#getSecurityLogFilePath()} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>{@code null}</li>
	* </ul>
	* The test case expects the following:
	* <ul>
	* <li>{@code NullPointerException}</li>
	* </ul>
	*/
	@Test
	public void testGetSecurityLogFilePath_6() {
		// Arrange
		Login login = new Login();
		
		// Act
		try {
			login.getSecurityLogFilePath();
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// Assert
			assertNotNull(e);
		}
	}
	
	/**
	* Test case for the {@link Login#getSecurityLogFilePath()} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>{@code null}</li>
	* </ul>
	* The test case expects the following:
	* <ul>
	* <li>{@code NullPointerException}</li>
	* </ul>
	*/
	@Test
	public void testGetSecurityLogFilePath_7() {
		// Arrange
		Login login = new Login();
		
		// Act
		try {
			login.getSecurityLogFilePath();
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// Assert
			assertNotNull(e);
		}
	}
	
	/**
	* Test case for the {@link Login#getSecurityLogFilePath()} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>{@code null}</li>
	* </ul>
	* The test case expects the following:
	* <ul>
	* <li>{@code NullPointerException}</li>
	* </ul>
	*/
	@Test
	public void testGetSecurityLogFilePath_8() {
		// Arrange
		Login login = new Login();
		
		// Act
		try {
			login.getSecurityLogFilePath();
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// Assert
			assertNotNull(e);
		}
	}
	
	/**
	* Test case for the {@link Login#getSecurityLogFilePath()} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>{@code null}</li>
	* </ul>
	* The test case expects the following:
	* <ul>
	* <li>{@code NullPointerException}</li>
	* </ul>
	*/
	@Test
	public void testGetSecurityLogFilePath_9() {
		// Arrange
		Login login = new Login();
		
		// Act
		try {
			login.getSecurityLogFilePath();
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// Assert
			assertNotNull(e);
		}
	}
	
	/**
	* Test case for the {@link Login#getSecurityLogFilePath()} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>{@code null}</li>
	* </ul>
