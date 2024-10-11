// DateTools_0Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#format(Date)} method.
*/
class DateTools_0Test {
		
	/**
	 * String representation of a date with the default
	 * {@link #DEFAULT_DATE_FORMAT format}.
	 */
	private static final String DEFAULT_DATE = "2021-01-01 00:00:00";

	/**
	 * String representation of the date with the specified format
	 * {@link #LONG_DATE_FORMAT format}.
	 */
	private static final String LONG_DATE = "2021-01-01T00:00:00.000Z";

	/**
	 * String representation of a date with the specified format
	 * {@link #DEFAULT_DATE_FORMAT format}.
	 */
	private static final String VERY_LONG_DATE = "2021-01-01T00:00:00.000+0000";

	/**
	 * A default {@link SimpleDateFormat} instance, created implicitly by this
	 * utility class with the default set of formatters.
	 */
	private static final SimpleDateFormat DEFAULT_DATE_FORMAT = new SimpleDateFormat(DEFAULT_DATE_FORMAT);

	/**
	 * A default {@link SimpleDateFormat} instance, created implicitly by this
	 * utility class with the specified formatters.
	 */
	private static final SimpleDateFormat LONG_DATE_FORMAT = new SimpleDateFormat(LONG_DATE_FORMAT);

	/**
	 * Test method for {@link DateTools#format(Date)} (test 1)
	 * with null as a {@link Date} argument.
	 */
	@Test
	public void testFormatNull_NULL() {
		assertNull(DateTools._toString(null));
	}

	/**
	 * Test method for {@link DateTools#format(Date)} (test 2) with null as
	 * a {@link Date} argument.
	 */
	@Test
	public void testFormatNull_NULL2() {
		Date date = null;
		assertEquals("Should return a date object as a String object.",
		        DateTools.format(date),
		        DateTools._toString(date));
	}

	/**
	 * Test method for {@link DateTools#format(Date)} (test 3) with null as
	 * a {@link Date} argument.
	 */
	@Test
	public void testFormatNull_null3() {
		Date date = null;
		assertNull(DateTools._toString(date));
	}

	/**
	 * Test method for {@link DateTools#parse(String)} (test 1)
	 * with a null argument as a {@link Date} instance.
	 */
	@Test
	public void testParseNull_NULL() {
		assertNull(DateTools.parse(null));
	}

	/**
	 * Test method for {@link DateTools#parse(String)} (test 2) with a
	 * null as a {@link Date} instance.
	 */
	@Test
	public void testParseNull_NULL2() {
		String test = null;
		Date date = DateTools.parse(test);
		assertEquals("Should return a date object as a Date instance.",
		        date,
		        DateTools.parse(test));
	}

	/**
	 * Test method for {@link DateTools#parse(String)} (test 3) with a
	 * null as a {@link Date} instance.
	 */
	@Test
	public void testParseNull_null3() {
		String test = null;
		Date date = DateTools.parse(test);
		assertNull(DateTools.parse(test));
	}

	/**
	 * Test method for {@link DateTools#isValidDate(String, String)} (test 1)
	 * with a null argument as a {@link Date} instance.
	 */
	@Test
	public void testIsValidDateNull_NULL() {
		assertFalse(DateTools.isValidDate(null, null));
	}

	/**
	 * Test method for {@link DateTools#isValidDate(String, String)} (test 2)
	 * with a null argument as a {@link Date} instance.
	 */
	@Test
	public void testIsValidDateNull_NULL2() {
		assertFalse(DateTools.isValidDate(null, ""));
	}

	/**
	 * Test method for {@link DateTools#isValidDate(String, String)} (test 3)
	 * with a null argument as a {@link Date} instance.
	 */
	@Test
	public void testIsValidDateNull_NULL3() {
		assertFalse(DateTools.isValidDate("", null));
	}

}