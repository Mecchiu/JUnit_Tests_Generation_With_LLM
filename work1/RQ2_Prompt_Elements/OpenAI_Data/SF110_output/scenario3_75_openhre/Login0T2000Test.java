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
* It contains ten unit test cases for the {@link Login#getProps(String)} method.
*/
class LoginTest {

	/**
	* Test case 1 for {@link Login#getProps(String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetProps1() throws Exception {
		// Test case 1
		// Input:
		// theConfigFile = "config.properties"
		// Expected output:
		// Properties object
		// Actual output:
		// Properties object
		// Assertion:
		// Properties object is returned
		String theConfigFile = "config.properties";
		Properties result = Login.getProps(theConfigFile);
		assertNotNull(result);
	}
	
	/**
	* Test case 2 for {@link Login#getProps(String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetProps2() throws Exception {
		// Test case 2
		// Input:
		// theConfigFile = "config.properties"
		// Expected output:
		// Properties object
		// Actual output:
		// Properties object
		// Assertion:
		// Properties object is returned
		String theConfigFile = "config.properties";
		Properties result = Login.getProps(theConfigFile);
		assertNotNull(result);
	}
	
	/**
	* Test case 3 for {@link Login#getProps(String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetProps3() throws Exception {
		// Test case 3
		// Input:
		// theConfigFile = "config.properties"
		// Expected output:
		// Properties object
		// Actual output:
		// Properties object
		// Assertion:
		// Properties object is returned
		String theConfigFile = "config.properties";
		Properties result = Login.getProps(theConfigFile);
		assertNotNull(result);
	}
	
	/**
	* Test case 4 for {@link Login#getProps(String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetProps4() throws Exception {
		// Test case 4
		// Input:
		// theConfigFile = "config.properties"
		// Expected output:
		// Properties object
		// Actual output:
		// Properties object
		// Assertion:
		// Properties object is returned
		String theConfigFile = "config.properties";
		Properties result = Login.getProps(theConfigFile);
		assertNotNull(result);
	}
	
	/**
	* Test case 5 for {@link Login#getProps(String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetProps5() throws Exception {
		// Test case 5
		// Input:
		// theConfigFile = "config.properties"
		// Expected output:
		// Properties object
		// Actual output:
		// Properties object
		// Assertion:
		// Properties object is returned
		String theConfigFile = "config.properties";
		Properties result = Login.getProps(theConfigFile);
		assertNotNull(result);
	}
	
	/**
	* Test case 6 for {@link Login#getProps(String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetProps6() throws Exception {
		// Test case 6
		// Input:
		// theConfigFile = "config.properties"
		// Expected output:
		// Properties object
		// Actual output:
		// Properties object
		// Assertion:
		// Properties object is returned
		String theConfigFile = "config.properties";
		Properties result = Login.getProps(theConfigFile);
		assertNotNull(result);
	}
	
	/**
	* Test case 7 for {@link Login#getProps(String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetProps7() throws Exception {
		// Test case 7
		// Input:
		// theConfigFile = "config.properties"
		// Expected output:
		// Properties object
		// Actual output:
		// Properties object
		// Assertion:
		// Properties object is returned
		String theConfigFile = "config.properties";
		Properties result = Login.getProps(theConfigFile);
		assertNotNull(result);
	}
	
	/**
	* Test case 8 for {@link Login#getProps(String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetProps8() throws Exception {
		// Test case 8
		// Input:
		// theConfigFile = "config.properties"
		// Expected output:
		// Properties object
		// Actual output:
		// Properties object
		// Assertion:
		// Properties object is returned
		String theConfigFile = "config.properties";
		Properties result = Login.getProps(theConfigFile);
		assertNotNull(result);
	}
	
	/**
	* Test case 9 for {@link Login#getProps(String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetProps9() throws Exception {
		// Test case 9
		// Input:
		// theConfigFile = "config.properties"
		// Expected output:
		// Properties object
		// Actual output:
		// Properties object
		// Assertion:
		// Properties object is returned
		String theConfigFile = "config.properties";
		Properties result = Login.getProps(theConfigFile);
		assertNotNull(result);
	}
	
	/**
	* Test case 10 for {@link Login#getProps(String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetProps10() throws Exception {
		// Test case 10
		// Input:
		// theConfigFile = "config.properties"
		// Expected output:
		// Properties object
		// Actual output:
		// Properties object
		// Assertion:
		// Properties object is returned
		String theConfigFile = "config.properties";
		Properties result = Login.getProps(theConfigFile);
		assertNotNull(result);
	}
}