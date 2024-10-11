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
	* Test case 1:
	* Test if the method returns a Properties object.
	*/
	@Test
	public void testGetProps() {
		Properties props = Login.getProps();
		assertNotNull(props);
	}
	
	/**
	* Test case 2:
	* Test if the method returns a Properties object with the correct number of properties.
	*/
	@Test
	public void testGetProps2() {
		Properties props = Login.getProps();
		assertEquals(props.size(), 5);
	}
	
	/**
	* Test case 3:
	* Test if the method returns a Properties object with the correct property names.
	*/
	@Test
	public void testGetProps3() {
		Properties props = Login.getProps();
		assertTrue(props.containsKey("log4j.appender.file"));
		assertTrue(props.containsKey("log4j.appender.file.File"));
		assertTrue(props.containsKey("log4j.appender.file.layout"));
		assertTrue(props.containsKey("log4j.appender.file.layout.ConversionPattern"));
		assertTrue(props.containsKey("log4j.rootLogger"));
	}
	
	/**
	* Test case 4:
	* Test if the method returns a Properties object with the correct property values.
	*/
	@Test
	public void testGetProps4() {
		Properties props = Login.getProps();
		assertEquals(props.getProperty("log4j.appender.file"), "org.apache.log4j.FileAppender");
		assertEquals(props.getProperty("log4j.appender.file.File"), "logs/aacs.log");
		assertEquals(props.getProperty("log4j.appender.file.layout"), "org.apache.log4j.SimpleLayout");
		assertEquals(props.getProperty("log4j.appender.file.layout.ConversionPattern"), "%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n");
		assertEquals(props.getProperty("log4j.rootLogger"), "DEBUG, file");
	}
	
	/**
	* Test case 5:
	* Test if the method returns a Properties object with the correct property values.
	*/
	@Test
	public void testGetProps5() {
		Properties props = Login.getProps();
		assertEquals(props.getProperty("log4j.appender.file"), "org.apache.log4j.FileAppender");
		assertEquals(props.getProperty("log4j.appender.file.File"), "logs/aacs.log");
		assertEquals(props.getProperty("log4j.appender.file.layout"), "org.apache.log4j.SimpleLayout");
		assertEquals(props.getProperty("log4j.appender.file.layout.ConversionPattern"), "%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n");
		assertEquals(props.getProperty("log4j.rootLogger"), "DEBUG, file");
	}
	
	/**
	* Test case 6:
	* Test if the method returns a Properties object with the correct property values.
	*/
	@Test
	public void testGetProps6() {
		Properties props = Login.getProps();
		assertEquals(props.getProperty("log4j.appender.file"), "org.apache.log4j.FileAppender");
		assertEquals(props.getProperty("log4j.appender.file.File"), "logs/aacs.log");
		assertEquals(props.getProperty("log4j.appender.file.layout"), "org.apache.log4j.SimpleLayout");
		assertEquals(props.getProperty("log4j.appender.file.layout.ConversionPattern"), "%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n");
		assertEquals(props.getProperty("log4j.rootLogger"), "DEBUG, file");
	}
	
	/**
	* Test case 7:
	* Test if the method returns a Properties object with the correct property values.
	*/
	@Test
	public void testGetProps7() {
		Properties props = Login.getProps();
		assertEquals(props.getProperty("log4j.appender.file"), "org.apache.log4j.FileAppender");
		assertEquals(props.getProperty("log4j.appender.file.File"), "logs/aacs.log");
		assertEquals(props.getProperty("log4j.appender.file.layout"), "org.apache.log4j.SimpleLayout");
		assertEquals(props.getProperty("log4j.appender.file.layout.ConversionPattern"), "%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n");
		assertEquals(props.getProperty("log4j.rootLogger"), "DEBUG, file");
	}
	
	/**
	* Test case 8:
	* Test if the method returns a Properties object with the correct property values.
	*/
	@Test
	public void testGetProps8() {
		Properties props = Login.getProps();
		assertEquals(props.getProperty("log4j.appender.file"), "org.apache.log4j.FileAppender");
		assertEquals(props.getProperty("log4j.appender.file.File"), "logs/aacs.log");
		assertEquals(props.getProperty("log4j.appender.file.layout"), "org.apache.log4j.SimpleLayout");
		assertEquals(props.getProperty("log4j.appender.file.layout.ConversionPattern"), "%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n");
		assertEquals(props.getProperty("log4j.rootLogger"), "DEBUG, file");
	}
	
	/**
	* Test case 9:
	* Test if the method returns a Properties object with the correct property values.
	*/
	@Test
	public void testGetProps9() {
		Properties props = Login.getProps();
		assertEquals(props.getProperty("log4j.appender.file"), "org.apache.log4j.FileAppender");
		assertEquals(props.getProperty("log4j.appender.file.File"), "logs/aacs.log");
		assertEquals(props.getProperty("log4j.appender.file.layout"), "org.apache.log4j.SimpleLayout");
		assertEquals(props.getProperty("log4j.appender.file.layout.ConversionPattern"), "%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n");
		assertEquals(props.getProperty("log4j.rootLogger"), "DEBUG, file");
	}
	
	/**
	* Test case 10:
	* Test if the method returns a Properties object with the correct property values.
	*/
	@Test
	public void testGetProps10() {
		Properties props = Login.getProps();
		assertEquals(props.getProperty("log4j.appender.file"), "org.apache.log4j.FileAppender");
		assertEquals(props.getProperty("log4j.appender.file.File"), "logs/aacs.log");
		assertEquals(props.getProperty("log4j.appender.file.layout"), "org.apache.log4j.SimpleLayout");
		assertEquals(props.getProperty("log4j.appender.file.layout.ConversionPattern"), "%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n");
		assertEquals(props.getProperty("log4j.rootLogger"), "DEBUG, file");
	}
}