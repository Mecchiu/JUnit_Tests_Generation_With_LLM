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
		* A parameterized unit test of this class.
		* @throws ParseException If there is an exception parsing the given string.
		* @see <a href="https://github.com/javier-perezbo/DateTools-Test">DateTools-Test Javadoc</a>
		*/
	@Test public void test_isValidDate() throws ParseException {
		assertNotNull(new DateTools().isValidDate("1/1/2000"));
		assertTrue(new DateTools().isValidDate("1/1/2000"));
		assertFalse(new DateTools().isValidDate("01/01/2000"));
		assertTrue(new DateTools().isValidDate("1/1"));
	}
 
		/**
		* Test the String method: {@link DateTools#format(String)}.
		* @throws ParseException If there is an exception parsing the given string.
		* @see <a href="https://github.com/javier-perezbo/DateTools-Test">DateTools-Test Javadoc</a>
		*/
	@Test public void test_format() throws ParseException {
		String dateString ="1/1/2000";
		Date date=parse(dateString);
		String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
		assertEquals(format, "yyyy-MM-dd HH:mm:ss");
		
		assertEquals(DateTools.parse(dateString), null);
		assertEquals(DateTools.parse(null, "yyyy-MM-dd HH:mm:ss"), null);
		
		
	}
}