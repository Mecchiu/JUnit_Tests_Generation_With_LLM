// Here's an example implementation of the DateTools.parse() method and the ten test cases for it:

// DateTools.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A general utility class for dealing with dates.
 */
public class DateTools {

    /**
     * @param dateString A String to parse into a {@link Date} object.
     * @param format A format to use to parse the date parameter with.
     * @return A {@link Date} representation of the String when possible,
     * 		or <code>null</code> if the date cannot be parsed with the
     * 		given format.
     */
    public static Date parse(String dateString, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(dateString);
        } catch (ParseException e) {
            return null;
        }
    }
}

// DateTools_3Test.java
package org.heal.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#parse(String, String)} method.
*/
class DateTools_3Test {
    
    @Test
    void testParseNull() {
        assertNull(DateTools.parse(null, "yyyy-MM-dd"));
    }
    
    @Test
    void testParseInvalidFormat() {
        assertNull(DateTools.parse("2021-01-01", "invalid format"));
    }
    
    @Test
    void testParseInvalidDate() {
        assertNull(DateTools.parse("2021-13-01", "yyyy-MM-dd"));
    }
    
    @Test
    void testParseValidDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date expected = null;
        try {
            expected = sdf.parse("2021-01-01");
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
        assertEquals(expected, DateTools.parse("2021-01-01", "yyyy-MM-dd"));
    }
    
    @Test
    void testParseValidDateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date expected = null;
        try {
            expected = sdf.parse("2021-01-01 12:34:56");
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
        assertEquals(expected, DateTools.parse("2021-01-01 12:34:56", "yyyy-MM-dd HH:mm:ss"));
    }
    
    @Test
    void testParseValidDateWithTimezone() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        Date expected = null;
        try {
            expected = sdf.parse("2021-01-01T12:34:56.789+0100");
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
        assertEquals(expected, DateTools.parse("2021-01-01T12:34:56.789+0100", "yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
    }
    
    @Test
    void testParseValidDateWithMilliseconds() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date expected = null;
        try {
            expected = sdf.parse("2021-01-01 12:34:56.789");
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
        assertEquals(expected, DateTools.parse("2021-01-01 12:34:56.789", "yyyy-MM-dd HH:mm:ss.SSS"));
    }
    
    @Test
    void testParseValidDateWithSingleDigitMonth() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d");
        Date expected = null;
        try {
            expected = sdf.parse("2021-1-1");
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
        assertEquals(expected, DateTools.parse("2021-1-1", "yyyy-M-d"));
    }
    
    @Test
    void testParseValidDateWithSingleDigitDay() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-d");
        Date expected = null;
        try {
            expected = sdf.parse("2021-01-1");
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
        assertEquals(expected, DateTools.parse("2021-01-1", "yyyy-MM-d"));
    }
    
    @Test
    void testParseValidDateWithSingleDigitHour() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:mm:ss");
        Date expected = null;
        try {
            expected = sdf.parse("2021-01-01 1:34:56");
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
        assertEquals(expected, DateTools.parse("2021-01-01 1:34:56", "yyyy-MM-dd H:mm:ss"));
    }
}