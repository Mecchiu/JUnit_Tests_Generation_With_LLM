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
		/**
 * Tests the {@link DateTools#isValidDate(String, String)} method.
 * If the given dateString is the same as the one the following one will be
 * returned:
 * return {@link SimpleDateFormat#parse(String)},
 * return {@link SimpleDateFormat#parse(String)},
 * return {@link SimpleDateFormat#parse(String)},
 * return {@link SimpleDateFormat#parse(String)},
 * return {@link SimpleDateFormat#parse(String)},
 * return {@link SimpleDateFormat#parse(String)},
 * return {@link SimpleDateFormat#parse(String)},
 * return {@link SimpleDateFormat#parse(String)},
 * return {@link SimpleDateFormat#parse(String)},
 * return {@link SimpleDateFormat#parse(String)},
 * return {@link DateTools.DEFAULT_DATE_FORMAT},
 * return {@link SimpleDateFormat#parse(String)}
 */
	@Test
    public void test_isValidDate_withValidParams()
    {
        assertEquals(DateTools.DEFAULT_DATE_FORMAT, DateTools.isValidDate(DEFAULT_DATE_FORMAT));
        assertEquals(DateTools.LONG_DATE_FORMAT, DateTools.isValidDate(LONG_DATE_FORMAT));
        assertEquals(DateTools.POSSIBLE_DATE_FORMATS[1], DateTools.isValidDate(POSSIBLE_DATE_FORMATS[1]));
    }

	/**
	 * Tests the {@link DateTools#isValidDate(String, String)} method.
	 * If the given dateString is the same as the one the following one will be
	 * returned:
	 * return {@link SimpleDateFormat#parse(String)},
	 * return {@link SimpleDateFormat#parse(String)},
	 * return {@link SimpleDateFormat#parse(String)},
	 * return {@link SimpleDateFormat#parse(String)},
	 * return {@link SimpleDateFormat#parse(String)},
	 * return {@link SimpleDateFormat#parse(String)},
	 * return {@link DateTools.DEFAULT_DATE_FORMAT},
	 * return {@link SimpleDateFormat#parse(String)}
	 */
	@Test
    public void test_isValidDate_withInvalidParams()
	{
		assertFalse(DateTools.isValidDate(DEFAULT_DATE_FORMAT, "yyyy-MM-dd"));
		assertFalse(DateTools.isValidDate(DEFAULT_DATE_FORMAT, "-"));
		assertFalse(DateTools.isValidDate(DEFAULT_DATE_FORMAT, "yyy/MM/dd"));
		assertFalse(DateTools.isValidDate(DEFAULT_DATE_FORMAT, "yyyy-MM-"));
		assertFalse(DateTools.isValidDate(DEFAULT_DATE_FORMAT, "yyy-MM-)"));
		
		try 
		{
			DateTools.isValidDate(DEFAULT_DATE_FORMAT, "yyy-MM-dd HH"); 
			fail("should have failed");
		}
		catch (ParseException pe) 
		{ 
			assertTrue(pe.getMessage(),pe.getMessage().endsWith("Invalid date format.") == false);
		}

		try
		{
			DateTools.isValidDate(DEFAULT_DATE_FORMAT, "+-"); 
			fail("should have failed");
		}
		catch (ParseException pe) 
		{ 
			assertEquals("+/- date format must contain year", pe.getMessage());
		}

		try
		{
			DateTools.isValidDate(DEFAULT_DATE_FORMAT, "-"); 
			fail("should have failed");
		}
		catch (ParseException pe) 
		{ 
			assertEquals("\- format must not contain time", pe.getMessage());
		}
	}

}