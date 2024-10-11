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
		
	private DateTools() {}
	
	/**
	 * Tests whether a string can be parsed into a {@link Date} from the given
	 * format.
	 * @throws ParseException if the String could not be parsed into a
	 *	   Date from the format.
 	*/
	@Test
	public void canParseString() throws ParseException {
		assertEquals("String format", DEFAULT_DATE_FORMAT, new DateTools().parse("2001-01-01").toString());
		assertEquals("String format", LONG_DATE_FORMAT, new DateTools().parse("2001-01-01 07:00:00").toString());
		
		try {
			new DateTools().parse("2001-01-01");
			fail();
		} catch (ParseException pe) {
			// expected
		}
		try {
			new DateTools().parse("2001-01-01 07:00:00");
			fail();
		} catch (ParseException pe) {
			// expected
		}
		try {
			new DateTools().parse("2001-01-01 07:00:00.000");
			fail();
		} catch (ParseException pe) {
			// expected
		}
		try {
			new DateTools().parse("2001-01-01 07:00:00.000000");
			fail();
		} catch (ParseException pe) {
			// expected
		}
		try {
			new DateTools().parse("2001-01-01 07:00:00.000001");
			fail();
		} catch (ParseException pe) {
			// expected
		}
		new DateTools().parse("");
	}

	/**
	 * Tests the result of {@link DateTools#parse(String, String)} against the
	 * specified format.
	 * @throws ParseException if the String format cannot be parsed
	 */
	@Test
	public void testParseAllString() throws ParseException {
		assertEquals("String format", DEFAULT_DATE_FORMAT, 
				new DateTools().parse("1 Jan 2001", DEFAULT_DATE_FORMAT).toString()); 
		assertEquals("String format", DEFAULT_DATE_FORMAT, 
				new DateTools().parse("1 Jan 2001 01:02:03", DEFAULT_DATE_FORMAT).toString()); 
		assertEquals("String format", DEFAULT_DATE_FORMAT, 
				new DateTools().parse("1 Jan 2001 01:02:03 17", DEFAULT_DATE_FORMAT).toString()); 
		assertEquals("String format", DEFAULT_DATE_FORMAT, 
				new DateTools().parse("1 Jan 2001 01:02:03T17", DEFAULT_DATE_FORMAT).toString()); 
		assertEquals("String format", DEFAULT_DATE_FORMAT, 
				new DateTools().parse("2001-01-01 07:00:00", DEFAULT_DATE_FORMAT).toString()); 
		assertEquals("String format", DEFAULT_DATE_FORMAT, 
				new DateTools().parse("2001-01-01 07:00:00.000", DEFAULT_DATE_FORMAT).toString()); 
		assertEquals("String format", DEFAULT_DATE_FORMAT, 
				new DateTools().parse("2001-01-01 07:00:00.000001", DEFAULT_DATE_FORMAT).toString()); 
		assertEquals("String format", DEFAULT_DATE_FORMAT, 
				new DateTools().parse("2001-01-01", DEFAULT_DATE_FORMAT).toString()); 
	}

	/**
	 * Tests the result of {@link DateTools#isValidDate(Date)} against a given format.
	 * @throws ParseException if the format cannot be parsed.
	 */
	@Test
	public void testIsValidDate() throws ParseException {
		Date date = new Date();
		assertFalse(new DateTools().isValidDate(date));

		date = new Date();
		date.setDateOnly();
		assertFalse(new DateTools().isValidDate(date));

		date = new Date();
		date.setTimeOnly();
		assertFalse(new DateTools().isValidDate(date));
	}
}