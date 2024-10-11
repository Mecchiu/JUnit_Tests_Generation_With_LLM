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
	 * Test method for {@link DateTools#format(Date, String)}.
	 */
	@Test
	public void format_01() {
		
		DateTools dt = new DateTools();
		String result = dt.format(null, null);
		assertNull(result);
		
		// Parse a date.
		String testDateString = "2011-07-16";
		result = dt.parse(testDateString);
		assertEquals(testDateString, result);
		
		// Format a date in some format
		for (String format: dt.POSSIBLE_DATE_FORMATS) {
			result = dt.format(new Date(), format);
			assertEquals(testDateString, result);
		}
		
		// Parse a date.
		testDateString = "2012-02-03";       // Long date, with milliseconds later in the future
		result = dt.parse(testDateString);       // Not present in any format!
		assertEquals(testDateString, result);          
		
	}
		
	/**
	 * Test method for {@link DateTools#isValidDate(String)}.
	 */
	@Test
	public void isValidDate_01() {
		
		// Parse some DateString in some format.
		String testDateString = "2011-07-16";
		Date date = dt.parse(testDateString);
		assertNotNull(date);
		
		String result;
		
		// Check parsing a date that is not in DateString
		result = dt.parse(testDateString);
		assertEquals("Invalid date string", "2011-07-16", result);

		// Check parsing a date in a new DateFormat
		testDateString = "08-01-2010";       // ISO year, with milliseconds later in the past
		date = dt.parse(testDateString);
		assertNotNull(date);
		
		result = dt.format(date, "yyyy-MM-dd HH:mm:ss");
		assertEquals("Invalid date string", "2011-07-16", result);

		// Parse a date that can be parsed but cannot
		result = dt.parse(testDateString, null);
		assertEquals("Invalid date string", "2011-07-16", result);
	}
			
}