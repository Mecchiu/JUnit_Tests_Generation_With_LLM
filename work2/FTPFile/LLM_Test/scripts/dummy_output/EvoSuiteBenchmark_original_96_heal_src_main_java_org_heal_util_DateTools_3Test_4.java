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
	     * Test cases for {@link DateTools#parse(String, String)}.
	     */
		@Test
		public void testParse() throws ParseException, Exception {
				String date = "2014-10-24";
				String format = "yyyy-MM-dd";
				Date dateAsDate = parse(date, format);
				assertNotNull(dateAsDate);
				
				assertEquals(new SimpleDateFormat("yyyy-MM-dd").parse(date), dateAsDate);
				assertEquals(date, parse(dateAsDate, "yyyy-MM-dd"));
				assertNotNull(parse(dateAsDate, format));
				
				dateAsDate = parse("2014-10-24", format);
				assertNotNull(dateAsDate);
				assertEquals(new SimpleDateFormat("yyyy-MM-dd").parse(dateAsDate), dateAsDate);
		}
}