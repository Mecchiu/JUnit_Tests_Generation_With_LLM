// DateTools_0Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#format(Date)} method.
*/
class DateTools_0Test {

	@Test
	public void testFormat() throws ParseException {
		assertEquals("01-01-2008 07:00:00", format(new Date()).toString());
		assertEquals("02-02-2008 07:00:00", format((Date) null).toString());
		assertEquals("00-01-2008 07:00:00", format(new Date(1)));
	}
	
	@Test
	public void testFormatWithTime () throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat(LONG_DATE_FORMAT);
		Date date = df.parse("01-01-2008 07:00:00");
		assertEquals(date, format(date));
	}
}