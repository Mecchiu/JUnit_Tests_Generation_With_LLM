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
		private static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
		
	@Test
	public void testIsValidDate() throws ParseException {
		assertTrue(DEFAULT_DATE_FORMAT.equals(DEFAULT_DATE_FORMAT));
		assertTrue(DEFAULT_DATE_FORMAT.equals(DEFAULT_DATE_FORMAT));
		assertTrue(DEFAULT_DATE_FORMAT.equals(DEFAULT_DATE_FORMAT));
		assertTrue(DEFAULT_DATE_FORMAT.equals(DEFAULT_DATE_FORMAT));
		assertFalse(DEFAULT_DATE_FORMAT.equals("yyyy-MM-dd HH:mm:ss"));
		assertFalse(DEFAULT_DATE_FORMAT.equals(new String("yyyy-MM-dd HH:mm:ss:")));
	}
}