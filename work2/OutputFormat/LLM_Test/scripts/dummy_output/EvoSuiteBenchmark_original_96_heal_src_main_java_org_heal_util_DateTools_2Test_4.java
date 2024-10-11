// DateTools_2Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#parse(String)} method.
*/
class DateTools_2Test {
		
	/**
	 * A unit test for {@link DateTools#parse(String)}.
	 * @throws ParseException if the String cannot be
	 * parsed to a Date.
	 */
	@Test
	public void testParse() throws ParseException {
        Date date = parse("2000-04-02");
		assertEquals("2000-04-02", date.toString());
	}

	/**
	 * A unit test for the long format {@link DATE-FORMAT date format}.
	 * @throws ParseException if the String cannot be
	 * parsed to a Date with the long format.
	 */
	@Test
	public void testFormatLong() throws ParseException {
        Date date = parse("Mon feb 06 15:07:08");
        assertEquals("Mon feb 06 15:07:08", new SimpleDateFormat("YYYY-MM-dd'T'HH:mm:ss 'Z' Z").format(date));
	}
	
	/**
	 * A unit test for the long format {@link DATE-FORMAT date format}.
	 * @throws ParseException if the String cannot be
	 * parsed to a Date with the long format.
	 * @see DATE_FORMAT
	 */
	@Test
	public void testFormatLongWithFormat() throws ParseException {
        Date date = parse("Mon feb 06 15:07:08Z");
        assertEquals("Mon feb 06 15:07:08", new SimpleDateFormat("YYYY-MM-dd'T'HH:mm:ss 'Z' Z").format(date));
	}

	/**
	 * A unit test for the long format {@link DATE-FORMAT date format}.
	 * @throws ParseException if the String cannot be
	 * parsed to a Date with the long format and the format used as a
	 * {@link SimpleDateFormat format used here}.
	 * @see DATE_FORMAT
	 */
	@Test
	public void testFormatLongWithFormatAndDateFormat() throws ParseException {
        Date date = parse("Mon feb 06 15:07:08Z");
        assertEquals("Mon feb 06 15:07:08", new SimpleDateFormat("YYYY-MM-dd'T'HH:mm:ss 'Z' " + DateTools.LONG_DATE_FORMAT + "Z", Locale.US).format(date));
	}

	/**
	 * A unit test for the short format {@link DATE date format}.
	 * @throws ParseException if the String cannot be
	 * parsed to a Date with the short format.
	 * @see DATE_FORMAT
	 */
	@Test
	public void testShortFormat() throws ParseException {
        Date date = parse("03-04-2007");
        assertEquals("03-04-2007", new SimpleDateFormat("yyyy-MM-dd").format(date));
	}

	/**
	 * A unit test for the short format {@link DATE-FORMAT date format}.
	 * @throws ParseException if the String cannot be
	 * parsed to a Date with the specified {@link SimpleDateFormat format}.
	 * @see DATE_FORMAT
	 * @see DATE
	 */
	@Test
	public void testLongWithShortFormat() throws ParseException {
        Date date = parse("Fri Apr 31 15:07:08");
        assertEquals("Fri Apr 31 15:07:08", new SimpleDateFormat("YYYY-MM-dd HH:mm:ss 'Z' Z").format(date));
	}
}