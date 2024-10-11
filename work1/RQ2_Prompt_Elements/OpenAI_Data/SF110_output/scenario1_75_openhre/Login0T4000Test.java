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
	* Test case 1 for the {@link Login#getProps(String)} method.
	* This test case tests the method with a valid configuration file.
	*/
	@Test
	public void testGetProps1() {
		Properties props = Login.getProps("src/test/resources/config.properties");
		assertNotNull(props);
	}
	
	/**
	* Test case 2 for the {@link Login#getProps(String)} method.
	* This test case tests the method with a non-existing configuration file.
	*/
	@Test
	public void testGetProps2() {
		Properties props = Login.getProps("src/test/resources/config2.properties");
		assertNull(props);
	}
	
	/**
	* Test case 3 for the {@link Login#getProps(String)} method.
	* This test case tests the method with a configuration file that contains an invalid property.
	*/
	@Test
	public void testGetProps3() {
		Properties props = Login.getProps("src/test/resources/config3.properties");
		assertNull(props);
	}
	
	/**
	* Test case 4 for the {@link Login#getProps(String)} method.
	* This test case tests the method with a configuration file that contains an invalid property.
	*/
	@Test
	public void testGetProps4() {
		Properties props = Login.getProps("src/test/resources/config4.properties");
		assertNull(props);
	}
	
	/**
	* Test case 5 for the {@link Login#getProps(String)} method.
	* This test case tests the method with a configuration file that contains an invalid property.
	*/
	@Test
	public void testGetProps5() {
		Properties props = Login.getProps("src/test/resources/config5.properties");
		assertNull(props);
	}
	
	/**
	* Test case 6 for the {@link Login#getProps(String)} method.
	* This test case tests the method with a configuration file that contains an invalid property.
	*/
	@Test
	public void testGetProps6() {
		Properties props = Login.getProps("src/test/resources/config6.properties");
		assertNull(props);
	}
	
	/**
	* Test case 7 for the {@link Login#getProps(String)} method.
	* This test case tests the method with a configuration file that contains an invalid property.
	*/
	@Test
	public void testGetProps7() {
		Properties props = Login.getProps("src/test/resources/config7.properties");
		assertNull(props);
	}
	
	/**
	* Test case 8 for the {@link Login#getProps(String)} method.
	* This test case tests the method with a configuration file that contains an invalid property.
	*/
	@Test
	public void testGetProps8() {
		Properties props = Login.getProps("src/test/resources/config8.properties");
		assertNull(props);
	}
	
	/**
	* Test case 9 for the {@link Login#getProps(String)} method.
	* This test case tests the method with a configuration file that contains an invalid property.
	*/
	@Test
	public void testGetProps9() {
		Properties props = Login.getProps("src/test/resources/config9.properties");
		assertNull(props);
	}
	
	/**
	* Test case 10 for the {@link Login#getProps(String)} method.
	* This test case tests the method with a configuration file that contains an invalid property.
	*/
	@Test
	public void testGetProps10() {
		Properties props = Login.getProps("src/test/resources/config10.properties");
		assertNull(props);
	}
}