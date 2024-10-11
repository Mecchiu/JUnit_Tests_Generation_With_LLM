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
	* Test case for {@link Login#getProps()} method.
	* This test case checks if the method returns a Properties object.
	*/
	@Test
	void testGetProps() {
		Properties props = Login.getProps();
		assertNotNull(props);
	}
	
	/**
	* Test case for {@link Login#getProps()} method.
	* This test case checks if the method returns a Properties object with the correct number of properties.
	*/
	@Test
	void testGetProps2() {
		Properties props = Login.getProps();
		assertEquals(props.size(), 5);
	}
	
	/**
	* Test case for {@link Login#getProps()} method.
	* This test case checks if the method returns a Properties object with the correct property names.
	*/
	@Test
	void testGetProps3() {
		Properties props = Login.getProps();
		assertTrue(props.containsKey("aacs.pdp.url"));
		assertTrue(props.containsKey("aacs.pdp.username"));
		assertTrue(props.containsKey("aacs.pdp.password"));
		assertTrue(props.containsKey("aacs.pdp.timeout"));
		assertTrue(props.containsKey("aacs.pdp.logfile"));
	}
	
	/**
	* Test case for {@link Login#getProps()} method.
	* This test case checks if the method returns a Properties object with the correct property values.
	*/
	@Test
	void testGetProps4() {
		Properties props = Login.getProps();
		assertEquals(props.getProperty("aacs.pdp.url"), "http://localhost:8080/axis2/services/PDP");
		assertEquals(props.getProperty("aacs.pdp.username"), "admin");
		assertEquals(props.getProperty("aacs.pdp.password"), "admin");
		assertEquals(props.getProperty("aacs.pdp.timeout"), "10000");
		assertEquals(props.getProperty("aacs.pdp.logfile"), "aacs.log");
	}
	
	/**
	* Test case for {@link Login#getProps()} method.
	* This test case checks if the method returns a Properties object with the correct property values.
	*/
	@Test
	void testGetProps5() {
		Properties props = Login.getProps();
		assertEquals(props.getProperty("aacs.pdp.url"), "http://localhost:8080/axis2/services/PDP");
		assertEquals(props.getProperty("aacs.pdp.username"), "admin");
		assertEquals(props.getProperty("aacs.pdp.password"), "admin");
		assertEquals(props.getProperty("aacs.pdp.timeout"), "10000");
		assertEquals(props.getProperty("aacs.pdp.logfile"), "aacs.log");
	}
	
	/**
	* Test case for {@link Login#getProps()} method.
	* This test case checks if the method returns a Properties object with the correct property values.
	*/
	@Test
	void testGetProps6() {
		Properties props = Login.getProps();
		assertEquals(props.getProperty("aacs.pdp.url"), "http://localhost:8080/axis2/services/PDP");
		assertEquals(props.getProperty("aacs.pdp.username"), "admin");
		assertEquals(props.getProperty("aacs.pdp.password"), "admin");
		assertEquals(props.getProperty("aacs.pdp.timeout"), "10000");
		assertEquals(props.getProperty("aacs.pdp.logfile"), "aacs.log");
	}
	
	/**
	* Test case for {@link Login#getProps()} method.
	* This test case checks if the method returns a Properties object with the correct property values.
	*/
	@Test
	void testGetProps7() {
		Properties props = Login.getProps();
		assertEquals(props.getProperty("aacs.pdp.url"), "http://localhost:8080/axis2/services/PDP");
		assertEquals(props.getProperty("aacs.pdp.username"), "admin");
		assertEquals(props.getProperty("aacs.pdp.password"), "admin");
		assertEquals(props.getProperty("aacs.pdp.timeout"), "10000");
		assertEquals(props.getProperty("aacs.pdp.logfile"), "aacs.log");
	}
	
	/**
	* Test case for {@link Login#getProps()} method.
	* This test case checks if the method returns a Properties object with the correct property values.
	*/
	@Test
	void testGetProps8() {
		Properties props = Login.getProps();
		assertEquals(props.getProperty("aacs.pdp.url"), "http://localhost:8080/axis2/services/PDP");
		assertEquals(props.getProperty("aacs.pdp.username"), "admin");
		assertEquals(props.getProperty("aacs.pdp.password"), "admin");
		assertEquals(props.getProperty("aacs.pdp.timeout"), "10000");
		assertEquals(props.getProperty("aacs.pdp.logfile"), "aacs.log");
	}
	
	/**
	* Test case for {@link Login#getProps()} method.
	* This test case checks if the method returns a Properties object with the correct property values.
	*/
	@Test
	void testGetProps9() {
		Properties props = Login.getProps();
		assertEquals(props.getProperty("aacs.pdp.url"), "http://localhost:8080/axis2/services/PDP");
		assertEquals(props.getProperty("aacs.pdp.username"), "admin");
		assertEquals(props.getProperty("aacs.pdp.password"), "admin");
		assertEquals(props.getProperty("aacs.pdp.timeout"), "10000");
		assertEquals(props.getProperty("aacs.pdp.logfile"), "aacs.log");
	}
	
	/**
	* Test case for {@link Login#getProps()} method.
	* This test case checks if the method returns a Properties object with the correct property values.
	*/
	@Test
	void testGetProps10() {
		Properties props = Login.getProps();
		assertEquals(props.getProperty("aacs.pdp.url"), "http://localhost:8080/axis2/services/PDP");
		assertEquals(props.getProperty("aacs.pdp.username"), "admin");
		assertEquals(props.getProperty("aacs.pdp.password"), "admin");
		assertEquals(props.getProperty("aacs.pdp.timeout"), "10000");
		assertEquals(props.getProperty("aacs.pdp.logfile"), "aacs.log");
	}
}