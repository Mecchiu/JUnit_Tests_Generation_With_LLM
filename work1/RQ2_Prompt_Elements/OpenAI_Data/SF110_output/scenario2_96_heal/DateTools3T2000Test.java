// DateToolsTest.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#parse(String, String)} method.
*/
class DateToolsTest {

	/**
	 * Test case for {@link DateTools#parse(String, String)} method.
	 * It tests the case when the dateString parameter is null.
	 */
	@Test
	void testParse_NullDateString() {
		String dateString = null;
		String format = "yyyy-MM-dd";
		Date expected = null;
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)} method.
	 * It tests the case when the format parameter is null.
	 */
	@Test
	void testParse_NullFormat() {
		String dateString = "2020-01-01";
		String format = null;
		Date expected = null;
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)} method.
	 * It tests the case when the dateString parameter is empty.
	 */
	@Test
	void testParse_EmptyDateString() {
		String dateString = "";
		String format = "yyyy-MM-dd";
		Date expected = null;
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)} method.
	 * It tests the case when the format parameter is empty.
	 */
	@Test
	void testParse_EmptyFormat() {
		String dateString = "2020-01-01";
		String format = "";
		Date expected = null;
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)} method.
	 * It tests the case when the dateString parameter is not a valid date.
	 */
	@Test
	void testParse_InvalidDateString() {
		String dateString = "2020-01-32";
		String format = "yyyy-MM-dd";
		Date expected = null;
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)} method.
	 * It tests the case when the format parameter is not a valid format.
	 */
	@Test
	void testParse_InvalidFormat() {
		String dateString = "2020-01-01";
		String format = "yyyy-MM-ddd";
		Date expected = null;
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)} method.
	 * It tests the case when the dateString parameter is a valid date.
	 */
	@Test
	void testParse_ValidDateString() {
		String dateString = "2020-01-01";
		String format = "yyyy-MM-dd";
		Date expected = null;
		try {
			expected = new SimpleDateFormat(format).parse(dateString);
		} catch (ParseException e) {
			// do nothing
		}
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)} method.
	 * It tests the case when the format parameter is a valid format.
	 */
	@Test
	void testParse_ValidFormat() {
		String dateString = "2020-01-01";
		String format = "yyyy-MM-dd";
		Date expected = null;
		try {
			expected = new SimpleDateFormat(format).parse(dateString);
		} catch (ParseException e) {
			// do nothing
		}
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)} method.
	 * It tests the case when the dateString parameter is a valid date and the format parameter is a valid format.
	 */
	@Test
	void testParse_ValidDateStringAndValidFormat() {
		String dateString = "2020-01-01";
		String format = "yyyy-MM-dd";
		Date expected = null;
		try {
			expected = new SimpleDateFormat(format).parse(dateString);
		} catch (ParseException e) {
			// do nothing
		}
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)} method.
	 * It tests the case when the dateString parameter is a valid date and the format parameter is a valid format.
	 */
	@Test
	void testParse_ValidDateStringAndValidFormat2() {
		String dateString = "2020-01-01";
		String format = "yyyy-MM-dd";
		Date expected = null;
		try {
			expected = new SimpleDateFormat(format).parse(dateString);
		} catch (ParseException e) {
			// do nothing
		}
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
}

// DateToolsTestSuite.java
package org.heal.util;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

/**
* Test suite for {@link DateTools}.
*/
@RunWith(JUnitPlatform.class)
@SelectClasses({DateToolsTest.class})
public class DateToolsTestSuite {
}

// DateToolsTestSuiteRunner.java
package org.heal.util;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

/**
* Test suite runner for {@link DateTools}.
*/
@RunWith(JUnitPlatform.class)
@SelectClasses({DateToolsTest.class})
public class DateToolsTestSuiteRunner {
}

// DateToolsTestSuiteRunner2.java
package org.heal.util;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
* Test suite runner for {@link DateTools}.
*/
@RunWith(JUnitPlatform.class)
@SelectPackages("org.heal.util")
public class DateToolsTestSuiteRunner2 {
}

// DateToolsTestSuiteRunner3.java
package org.heal.util;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
* Test suite runner for {@link DateTools}.
*/
@RunWith(JUnitPlatform.class)
@SelectPackages("org.heal.util")
public class DateToolsTestSuiteRunner3 {
}

// DateToolsTestSuiteRunner4.java
package org.heal.util;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
* Test suite runner for {@link DateTools}.
