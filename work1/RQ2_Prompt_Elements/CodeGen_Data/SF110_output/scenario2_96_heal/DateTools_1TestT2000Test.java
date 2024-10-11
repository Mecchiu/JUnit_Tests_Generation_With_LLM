// DateTools_1Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#format(Date, String)} method.
*/
class DateTools_1Test {
/**
		 * Test {@link DateTools#format(Date, String)} method
		 * Assert that that output is the same as formatting the date with the specified format.
		*/
    @Test
	public void testFormat() {
        assertEquals("1970-01-06 12:15:00", DateTools.format(new Date(1970, 1, 6, 12, 15, 0), "yy-MM-dd hh:mm:ss"));
        assertEquals("2007-07-07 12:15:00", DateTools.format(new Date(2007, 7, 7, 12, 15, 0), "yyyy-MM-dd HH:mm"));
        assertEquals("2007-07-07 12:15:00", DateTools.format(new Date(2007, 7, 7, 12, 15, 0), "yyyy-MM-dd"));
        assertEquals("2007-07-07 12:15:01", DateTools.format(new Date(2007, 7, 7, 12, 15, 1), "yyyy-MM-dd hh:mm"));
        assertEquals("2007-07-07 12:15:01", DateTools.format(new Date(2007, 7, 7, 12, 15, 1), "yyyy-MM-dd H:mm"));
        assertEquals("2007-07-07 12:15:01", DateTools.format(new Date(2007, 7, 7, 12, 15, 0), "yyyy-MM-dd H"));
        assertEquals("07-07-07 12:15:01", DateTools.format(new Date(2007, 7, 1, 12, 15, 1), "yyyy-MM-dd"));
        assertEquals("07-07-07 12:15:01", DateTools.format(new Date(2007, 7, 1, 1, 15, 1), "yyyy-MM-dd"));
        assertEquals("2007-07-07 12:15:01.00", DateTools.format(new Date(2007, 7, 7, 12, 15, 1), "yyyy-MM-dd.%"));
        assertEquals("2007-07-07 12:15:01.000", DateTools.format(new Date(2007, 7, 7, 12, 15, 1), "yyyy-MM-dd.0"));
        assertEquals("2007-07-07 12:15:01.000", DateTools.format(new Date(2007, 7, 7, 12, 15, 1), "yyyy-MM-dd"));
        assertEquals("2007-07-07 12:15:01", DateTools.format(new Date(2007, 7, 7, 1, 15, 1), "yyyy-MM-dd"));
        assertEquals("07-07-07 12:15:01.000", DateTools.format(new Date(2007, 7, 7, 1, 15, 1), "yyyy-MM-dd.0"));
		}
}
/* 
DateToolstest.java
*/

// DateToolstest_1Test.java
