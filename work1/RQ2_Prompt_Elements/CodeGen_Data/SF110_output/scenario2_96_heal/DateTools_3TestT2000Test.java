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

    /**
     * @param dateString A String to parse into a {@link Date} object.
     * @param format A format to use to parse the date parameter with.
     * @return A {@link Date} representation of the String when possible,
     * 		or <code>null</code> if the date cannot be parsed with the
     * 		given format.
     */
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
		
    @Test
    public void testParse_validDate_failWithNull() {
        String d2 = null;

        DateTools.parse(d2, null);
        assertTrue(false);
    }
    
    @Test
    public void testParse_validDate_failWithInvalid() {
        String d2 = "0000-00-00 00:00:00";
        Date d3 = null;

        d3 = DateTools.parse(d2, "yyyy-MM-dd HH:mm:ss");
        assertTrue(false);
    }

		
    @Test
    public void testParse_nullTimeAndDate_withZero_returnsDefaultDate() {
        String d2 = null;

        DateTools.parse(d2, null);
        assertTrue(DateTools.validDate(d2));
    }

 		
    @Test
    public void testParse_nullTimeAndDate_withInvalidData_returnsDefaultDate() {
        String d2 = null;
        String d3 = null;

        d3 = DateTools.parse(d2, "yyyy-MM-dd HH:mm:ss");
        assertTrue(true);
        assertEquals(d3, DateTools.parse(d2, "yyyy-MM-dd"));
    }
        
	
        
}
// DateTools_4Test.java
