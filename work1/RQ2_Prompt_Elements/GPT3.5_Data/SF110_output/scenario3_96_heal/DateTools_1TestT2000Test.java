// Here's an example implementation of the DateTools.format() method and its test cases:

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
     * @param date A {@link Date} to format.
     * @param format A format (corresponding to {@link SimpleDateFormat}'s syntax)
     * 		to convert the date to.
     * @return A String representation of the date parameter in the
     * 		specified format, or null if the given date is null.
     */
    public static String format(Date date, String format) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }
}

// DateTools_1Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#format(Date, String)} method.
*/
class DateTools_1Test {

    @Test
    void testFormatNullDate() {
        assertNull(DateTools.format(null, "yyyy-MM-dd"));
    }

    @Test
    void testFormatNullFormat() {
        Date date = new Date();
        assertEquals(date.toString(), DateTools.format(date, null));
    }

    @Test
    void testFormatEmptyFormat() {
        Date date = new Date();
        assertEquals(date.toString(), DateTools.format(date, ""));
    }

    @Test
    void testFormatInvalidFormat() {
        Date date = new Date();
        assertEquals(date.toString(), DateTools.format(date, "invalid format"));
    }

    @Test
    void testFormatValidFormat() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        assertEquals(formatter.format(date), DateTools.format(date, "yyyy-MM-dd"));
    }

    @Test
    void testFormatDifferentValidFormat() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        assertEquals(formatter.format(date), DateTools.format(date, "dd/MM/yyyy"));
    }

    @Test
    void testFormatWithTime() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        assertEquals(formatter.format(date), DateTools.format(date, "yyyy-MM-dd HH:mm:ss"));
    }

    @Test
    void testFormatWithMilliseconds() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        assertEquals(formatter.format(date), DateTools.format(date, "yyyy-MM-dd HH:mm:ss.SSS"));
    }

    @Test
    void testFormatWithTimeZone() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        assertEquals(formatter.format(date), DateTools.format(date, "yyyy-MM-dd HH:mm:ss z"));
    }

    @Test
    void testFormatWithInvalidDate() {
        Date date = null;
        assertEquals(null, DateTools.format(date, "yyyy-MM-dd"));
    }
}