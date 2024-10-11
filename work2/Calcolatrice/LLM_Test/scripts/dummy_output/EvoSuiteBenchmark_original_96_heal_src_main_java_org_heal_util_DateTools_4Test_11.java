// DateTools_4Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#isValidDate(String)} method.
*/
class DateTools_4Test {
		
/**
 * Test isValidDate method for {@link DateTools#parse(String)}.
 */
	public final void testParse_1() {
		DateTools t = new DateTools();
		try {
			t.parse("2016-01");
			assertTrue(false);
		} catch (IllegalArgumentException ex) {
			assertTrue(ex instanceof java.text.ParseException);
		}
	}

	/**
 * Date isValid date and format check for {@link DateTools#parse(String)}.
 */
	@Test
	public final void testParse(String dateString) throws ParseException {
			DateTools d = new DateTools();
			assertTrue(d.isValidDate(dateString));
	}
}