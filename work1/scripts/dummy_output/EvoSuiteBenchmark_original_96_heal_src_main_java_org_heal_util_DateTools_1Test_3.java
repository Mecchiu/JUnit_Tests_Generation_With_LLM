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
     * Test of {@link DateTools#format(Date, String)}.
     */
    @Test
    void testFormat() throws ParseException {
        String dateString = "2013-07-26 16:31:28 +0000";
        Date date = parse(dateString);
        assertNotNull(date);
        String expected = "<2011-06-26 19:31:28:00000>";
        String result = format(date, DEFAULT_DATE_FORMAT);
        assertEquals(expected, result);
        expected = "<2013-07-26 16:31:28.0>";
        result = format(date, POSSIBLE_DATE_FORMATS);
        assertEquals(expected, result);
    }
    
    /**
     * Test of {@link DateTools#format(Date, String)}.
     */
    @Test
    void testFormatWithFormat() throws ParseException {
        String dateString = "2013-07-26 16:31:28.0001";
        Date date = parse(dateString);
        assertNotNull(date);
        String expected = null;
        String result = format(date, DEFAULT_DATE_FORMAT);
        assertEquals(expected, result);
        expected = null;
        result = format(date, LONG_DATE_FORMAT);
        assertEquals(expected, result);
    }
}