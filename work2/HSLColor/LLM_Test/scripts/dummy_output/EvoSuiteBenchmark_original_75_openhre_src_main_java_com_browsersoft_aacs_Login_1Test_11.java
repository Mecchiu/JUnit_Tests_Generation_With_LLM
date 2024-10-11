// Login_1Test.java
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
* It contains one unit test case for the {@link Login#getProps()} method.
*/
class Login_1Test {
		private static boolean BOOLEAN = false;
		private static String STRING = "";
		private static long INTEGER = 0l;
		private static double REAL = 0.0d;
		private static String UNDEFINED = "undefined";
		private static String TIMESTAMP = "1969-06-29T00:00:00Z";
		private static String SLEEPENDANCE = "0";
		private static boolean UNDEFINED_SHOW = false;

		/**
		* Test method for {@link Login#getProps()} method.
		* @throws ParseException
		*/
		@Test
		public void testGetProps() throws ParseException {
			System.out.println("testGetProps");
			String file = "test.properties";
			String testString = getProps().getProperty("logs.name", "test").toString();
			String propsFilename = ("/" + "/" + file + "/") + testString;
			File fileProperties = new File(propsFilename);
			Properties props = new Properties();
			boolean readProperty = false;
			try {
				FileAppender fileAppender = new FileAppender(new SimpleLayout(), fileProperties.getAbsolutePath());
				fileAppender.addAppender(new FileAppender(new SimpleLayout(), "log4j.file", file, "UTF-8"));
				props.load(fileAppender);		
			} catch (Exception e) {
				// System.out.println(e.getMessage());
				FileAppender fileAppender = new FileAppender(new SimpleLayout(), fileProperties.getAbsolutePath());
				fileAppender.addAppender(new FileAppender(new SimpleLayout(), "log4j.file", file, "UTF-8"));
				props.load(fileAppender);
			}
			assertNotNull("Properties file not found.", fileProperties);
			assertNotNull("Properties cannot contain properties.", props);
			String expectedProperties = getProps().toString();
			String actualProperties = props.getProperty(testString);
			String propsFilename2 = ("/" + "/" + file + "/") + expectedProperties;
			fileProperties = new File(propsFilename2);
			readProperty = true;
			boolean readProperty2 = false;
			try {
				FileAppender fileAppender = new FileAppender(new SimpleLayout(), propsFilename2);
				fileAppender.addAppender(new FileAppender(new SimpleLayout(), "log4j.file", file, "UTF-8"));
				String testString2 = props.getProperty(testString);
				readProperty2 |= testString2!= null;
			} catch (Exception e) {
				// System.out.println(e.getMessage());
				FileAppender fileAppender = new FileAppender(new SimpleLayout(), propsFilename2);
				fileAppender.addAppender(new FileAppender(new SimpleLayout(), "log4j.file", propsFilename2, "UTF-8"));
				readProperty2 &= props.getProperty(testString2)!= null;
			}
			assertEquals("Properties property does not equal expected property", props.size(), readProperty? 1 : 0);
			assertEquals("Properties property does not equal expected property", props.size(), readProperty2? 1 : 0);
			String expectedFileName = ((file + "/Test" + testString) + ".properties").substring(3);
			String actualFileName = ((propsFilename + "/Test" + testString + ".properties")).substring(3);
			assertEquals("Mock properties are not consistent", expectedProperties, props.getProperty(expectedFileName));
			assertEquals("Mock properties are not consistent", expectedProperties, props.getProperty(actualFileName));

		}

		@Test
		public void testNullName() {
			String testString = null;
			try {
			System.out.println("testNullName");
			if (testString!= null) {
			// no test
			}
			fail("No test error for null name");
	        } catch (LoginException e) {
	        	assertNull("Null Name has occurred!", e.getMessage());
	        }
			}
			@Test
			public void testName() {
			String testString = "test";
			String testString2 = "test.test";
			String testString3 = "test_test";
			String testString4 = "TestTest.java";
			System.out.println("testName");
			String name = getProps().getProperty("logs.name", testString);
			System.out.println(name);
			String value;
			if (name!= null && value = getProps().getProperty("logs.value", UNDEFINED)) {
			// no test
			} else {
				value = UNDEFINED;
			}
			assertEquals("Bad Logs.name property value", testString, value);
			assertEquals("Bad Logs.value property value", testString2, value);
			assertEquals("Bad Logs.name property value", testString3, getProps().getProperty("logs.name", UNDEFINED));
			assertEquals("Bad Logs.value property value", name, getProps().getProperty("logs.subvalue", UNDEFINED));
			}
		
			
}