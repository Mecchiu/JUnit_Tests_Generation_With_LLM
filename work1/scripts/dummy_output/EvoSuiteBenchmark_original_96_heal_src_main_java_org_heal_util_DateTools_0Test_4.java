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
		/// <summary>create a basic {@link Date} to be validated.</summary>
	private Date date;
	
		/// <summary>create a given {@link Date} object.</summary>
	private Date parseDate() throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT, Locale.US);
		return formatter.parse(POSSIBLE_DATE_FORMATS[0] + " HH:mm:ss");
	};

	@Test
	public void formatTest() throws ParseException {
		Date startTime = new Date();
		String dateString = format(startTime);
		Date parseStartTime = parseDate();

		assertSame(startTime, parseStartTime);

		assertTrue(dateString, dateString.equalsIgnoreCase(
				this.parseDate().toString()));

	}
}