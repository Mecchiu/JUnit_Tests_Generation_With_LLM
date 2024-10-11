// DateTools_5Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#isValidDate(String, String)} method.
*/
class DateTools_5Test {
		public static void main(String[] args) {
				junit.textui.TestRunner.run(DateTools_5Test.class);
		}
	
		/**
     * Test for {@link DateTools#isValidDate(DateString, String)}.
     */
	@Test
    public void testIsValidDateStringDate() {
		assertTrue(isValidDate("January 1, 2006", "EEE, d MMM yyyy"));
	}

		/**
     * Test for {@link DateTools#isValidDate(DateString, String)}.
     */
	@Test
    public void testIsValidDateStringFormat() {
		assertTrue(isValidDate("01-2006", DEFAULT_DATE_FORMAT));
	}

	/**
     * Test for {@link DateTools#isValidDate(DateString, String)}.
     */
	@Test
    public void testIsValidDateInvalidFormat() {
		assertFalse(isValidDate("2005-03-22 23:45:60", "MM/dd/yyyy"));
	}

 		/**
     * Test for {@link DateTools#isValidDate(DateString, String)}.
     */
	@Test
    public void testIsValidDateInvalidFormatDateString() {
		assertFalse(isValidDate("2005-03-22 23:45:60", "MM/d/yyyy"));
	}

 		/**
     * Test for {@link DateTools#isValidDate(DateString, String)}.
     */
	@Test
    public void testIsValidDateInvalidFormatDateStringFormat() {
		assertFalse(isValidDate("2005-03-22 23:45:60", "MM/dd/yyyy"));
	}

 		/**
     * Test for {@link DateTools#isValidDate(DateString, String)}.
     */
	@Test
    public void testIsValidDateInvalidDateString() {
		assertFalse(isValidDate("01-03", "MM-dd-yyyy"));
	}

 			/**
     * Test for {@link DateTools#isValidDate(DateString, String)}.
     */
	@Test
    public void testIsValidDateInvalidFormatDateString() {
		assertFalse(isValidDate("2005-03-22", "MM/d/yyyy"));
	}

 		/**
     * Test for {@link DateTools#isValidDate(DateString, String)}.
     */
	@Test
    public void testIsValidDateInvalidString() {
		assertFalse(isValidDate("TestString", "MM/dd/yyyy"));
	}

	/**
     * Test for {@link DateTools#isValidDate(DateString, String)}.
     */
	@Test
    public void testIsValidDateInvalidFormatString() {
		assertFalse(isValidDate("MM-dd-yyyy", "MM-dd-yyyy"));
	}

 		/**
     * Test for {@link DateTools#isValidDate(DateString, String)}.
     */
	@Test
    public void testIsValidDateInvalidDateString() {
		assertFalse(isValidDate("TestString", "MM-dd-yyyy"));
	}

	/**
     * Test for {@link DateTools#format(Date)}.
     */
	@Test
    public void testFormat_null() {
		assertNull(DateTools.parse(null));
	}

	/**
     * Test for {@link DateTools#parse(String)}.
     */
	@Test
    public void testParse_null() {
		assertNull(DateTools.parse(null));
	}

	/**
     * Test for {@link DateTools#parse(String)}.
     */
	@Test
    public void testParse_notNull() {
		assertNotNull(DateTools.parse("2013-07-23 00:00:01"));
	}

	/**
     * Test for {@link DateTools#isValidDate(Date)}.
     */
	@Test
    public void testIsValidDate_success_parseDate() throws ParseException {
		Date date = new Date(0);
		assertTrue(DateTools.isValidDate("2018-06-23 00:01", "HH:mm:ss"));
	}

	/**
     * Test for {@link DateTools#isValidDate(Date)}.
     */
	@Test
    public void testIsValidDate_invalidFormat() {
		assertFalse(DateTools.isValidDate("TestString", "MM-dd-yyyy"));
	}

	/**
     * Test for {@link DateTools#isValidDate(Date)}.
     */
}