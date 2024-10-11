// DateTools_3Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#parse(String, String)} method.
*/
class DateTools_3Test {
// DateTools.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A general utility class for dealing with dates.
 */
public class DateTools {

    public static Date parse(String dateString, String format) {
        Date ret = null;
        if (null!= dateString) {
            SimpleDateFormat formatter = new SimpleDateFormat(format);
            formatter.setLenient(false);
            try {
                ret = formatter.parse(dateString);
            } catch (ParseException e) {
                // do nothing
            }
        }
        return ret;
    }
}

// DateTools_3Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#parse(String, String)} method.
*/
class DateTools_3Test {
		private final static String DATE = "yyyy-MM-dd hh:mm:ss";
		private static final String DATE_TIME = "yyyy-MM-dd HH:mm:ss";
		private static final String DATE_TIME_TIME = "yyyy-MM-dd HH:mm:ss.ffffffff";

    /** 
     * Tests parsing a DATE string with a date with no format.
     */
    @Test
    public void testParse_01() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE);
        formatter.setLenient(false);
        Date date = formatter.parse("test");
        assertEquals(formatter.parse("test"), date);
    }

    /** 
     * Tests parsing a DATE string with a date with format.
     */
    @Test
    public void testParse_02() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_TIME);
        formatter.setLenient(false);
        Date date = formatter.parse("test");
        assertEquals(formatter.parse("test"), date);
    }
    
    /** 
     * Tests parsing a DATE_TIME string with a date with no format.
     */
    @Test
    public void testParseDateTime_01() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_TIME_TIME);
        formatter.setLenient(false);
        Date date = formatter.parse("test");
        assertEquals(formatter.parse("test"), date);
    }

    /** 
     * Tests parsing a DATE_TIME string with a date with format.
     */
    @Test
    public void testParseDateTime_02() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_TIME_TIME);
        formatter.setLenient(false);
        Date date = formatter.parse("test");
        assertEquals(formatter.parse("test"), date);
    }

}