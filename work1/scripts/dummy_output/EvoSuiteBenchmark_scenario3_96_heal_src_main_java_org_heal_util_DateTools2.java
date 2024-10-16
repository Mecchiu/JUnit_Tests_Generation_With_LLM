// DateToolsTest.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#parse(String)} method.
*/
class DateToolsTest {
		
	/**
	 * Test case for {@link DateTools#parse(String)}
	 * @throws ParseException
	 */
	@Test
	void testParse() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("2020-01-01");
		assertEquals(date, DateTools.parse("2020-01-01"));
	}
}