// DateTools_3Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#parse(String, String)} method.
*/
class DateTools_3Test {
		/**
	 * Test the {@link DateTools#parse(String, String)} method. It checks
	 * whether a {@link Date} is parsed correctly.
	 */
	@Test
	public void testParse() {
		//test default
		Date d = parse("2020-01-01");
		assertEquals(new Date(), dateTools.parse(d));
		d = parse("2020-01-01T13");
		assertEquals(new Date(), dateTools.parse(d));
		d = parse("1/1/1970");
		assertEquals(new Date(), dateTools.parse(d));
		d = parse("1400-01-01T11:11:11:11.11"); //ISO-formatted date string.
		assertEquals(new Date(), dateTools.parse(d));
		//test parsing with a date string without time
		d = parse("15/10/2000");
		assertEquals(new Date(1440,10,10), dateTools.parse(d));
		d = parse("15/05/2000");
		assertEquals(new Date(1440,5,10), dateTools.parse(d));
		//test parsing with a date string with a time part
		d = parse("24/10/2012");
		assertEquals(new Date(1748, 10, 1), dateTools.parse(d, "Z"));
		d = parse("24/12/2012");
		assertEquals(new Date(0, 0, 12), dateTools.parse(d, "Z"));
		//do not care about time
		d = parse("12/10/2012");
		assertEquals(new Date(12, 0, 10), dateTools.parse(d));
		d = parse("12/12/2012");
		assertEquals(new Date(11, 12, 10), dateTools.parse(d));
	}

	/**
	 * Test the {@link DateTools#format(Date)} method. It checks
	 * whether a {@link Date} is formatted correctly.
	 */
	@Test
	public void testFormat() {
		Date d = new Date();

		//test default
		String fmt = null;
		assertNull(dateTools.format(d));
		d = new Date(2, 2, 2);
		assertEquals("0002-02-02", dateTools.format(d));
		d = new Date(12, 12, 12);
		assertEquals("12-12-12", dateTools.format(d));
		//test formatting with a date string without time
		fmt = "2012-04-01T10:10:10";
		d = parse(fmt, "Z");
		assertEquals("2012-04-01T10:10:10", dateTools.format(d));
		//test formatting with a date string with a time part
		fmt = "2012-04-01T01:01:01";
		d = parse(fmt, "Z");
		assertEquals("2012-04-01T03:01:01", dateTools.format(d));
	}

	//DateTools_4Test.java
	/**
	 * Test the method {@link DateTools#isValidDate(String)}.
	 * It checks whether given date string and format are valid.
	 * @throws ParseException 
	 * @throws ParseException 
	 */
	@Test
	public void testIsValidDate() throws ParseException, ParseException {
		assertFalse(isValidDate("2000-01-01T11:11:11"));
		assertFalse(isValidDate("2015-02-01T01:01:01"));
		assertFalse(isValidDate("2015-02-01T50:01:01"));
		assertTrue(isValidDate("2015-2-1T11:11:11")); 
	}
}