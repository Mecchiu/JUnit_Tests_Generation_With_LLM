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
		
	@Test
    public void isValidDate_parseDate() {
		date = parse("2010-11-15 06:00:00");
		assertTrue(isValidDate("2010-11-15 06:00:00"));
        date = parse("2010-11-15 10:00:00");
        assertTrue(isValidDate("2010-11-15 10:00:00"));
        date = parse("2010-11-15 04:00:00");
        assertTrue(isValidDate("2010-11-15 04:00:00"));
        date = parse("2010-11-15 06:00:00");
        assertTrue(isValidDate("2010-11-15 06:00:00"));
        assertTrue(isValidDate("2010-1111-10-14"));
		date = null;
		assertTrue(isValidDate("2010-11-01 03:00:00"));
    }
	
	@Test
    public void isValidDate_parseDateLong() {
		try {
			date = parse("2010-11-15 10:00:");
		}
		catch (ParseException pe) {
			date = null;
		}
		assertTrue(date == null);
	}

	@Test
    public void isValidDate_parseString() {
		try {
		    date = parse("2010-11-15 1:00");
		}
		catch (ParseException pe) {
			date = null;
		}
		assertTrue(date == null);
	}
	
	@Test
	public void isValidDate_badFormat() {
		assertFalse(isValidDate("2010-11-15 11:15:00", "mmm"));
	}

}