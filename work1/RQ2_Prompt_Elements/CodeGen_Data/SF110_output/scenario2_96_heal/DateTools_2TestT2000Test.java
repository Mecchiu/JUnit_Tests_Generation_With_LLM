// DateTools_2Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#parse(String)} method.
*/
class DateTools_2Test {
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
     * @return A {@link Date} representation of the String when possible,
     * 		or <code>null</code> if the date cannot be parsed.
     */
    public static Date parse(String dateString) {
        Date ret = null;
        if (null!= dateString) {
            boolean match = false;
            SimpleDateFormat formatter = new SimpleDateFormat();
            formatter.setLenient(false);
            for (int i = 0; i < POSSIBLE_DATE_FORMATS.length &&!match; ++i) {
                formatter.applyPattern(POSSIBLE_DATE_FORMATS[i]);
                try {
                    ret = formatter.parse(dateString);
                    match = true;
                } catch (ParseException e) {
                    // do nothing
                }
            }
        }
        return ret;
    }
}

// DateTools_2Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#parse(String)} method.
*/
class DateTools_2Test {
		   
    /**
     * Test method for {@link DateTools#parse(String)}.
     */
    @Test
    public void testParse() {
        assertNotNull("parsing did not work", new DateTools().parse("12/12/2001"));
        assertEquals("Invalid date", new Date(123456789), new DateTools().parse("1/13/2001"));
        assertNull("Invalid date", new DateTools().parse("12/13/2001"));
        assertIllegalArgument("Malformatted date not parsed", new DateTools().parse("4/10/2001"));
        assertIllegalArgument("Invalid date", new DateTools().parse("1/16/2001"));
        assertIllegalArgument("Invalid date", new DateTools().parse("01/31/2001"));
        assertIllegalArgument("Invalid date", new DateTools().parse("01/31/2001"));
        assertIllegalArgument("Invalid date", new DateTools().parse("01/31/2001"));
        assertIllegalArgument("Invalid date", new DateTools().parse("01/31/2009"));
        assertIllegalArgument("Bad date", new DateTools().parse("01/31-2/2009"));
    }


		   
    /**
     * Test method for {@link DateTools#parse(String)} using the same format as <code>Date</code>.
     */
    @Test
    public void testParsesForSameFormatAsDate() {
        assertNull("First format", new DateTools().parse("Mon Apr 01 12:12:12"));
        assertEquals("Second date format", new Date(2012, 10, 10, 12, 12, 12), new DateTools().parse("10/10/12"));
        assertNull("First format", new DateTools().parse("Mon Apr 30 12:12:12"));
        assertEquals("Second date format", new Date(2012, 10, 12, 12, 12, 12), new DateTools().parse("10/10/12"));
        assertNull("First format", new DateTools().parse("Mon Apr 33 12:12:12"));
        assertEquals("Second date format", new Date(2012, 11, 30, 12, 12, 12), new DateTools().parse("10/11/30"));
        assertNull("First format", new DateTools().parse("Mon Apr 41 12:30:12"));
        assertNull("Second date format", new Date(2012, 11, 30, 12 + 12, 30, 12));
        assertNull("Second date format", new DateTools().parse("Mon 04/10/14"));
        assertNull("First format", new DateTools().parse("Mon 16/13/13"));
        assertNull("Second date format", new DateTools().parse("Mon 17/13/13"));
        assertNull("Second date format", new DateTools().parse("Mon 22_2/13/13"));
        assertNull("First format", new DateTools().parse("Mon 13/10/11"));
    }
     


    @Test
    public void testHasTheRightLengthAndFormat() throws ParseException {
        assertFalse("This test failed, because the given date was invalid: Tue May 10 10:12:00 2017", new DateTools().hasTheRightLengthAndFormat("Mon May 10 10:12:00 2017"));
        assertTrue("This test failed, because the given date was invalid: Tue May 10 10:12:00", new DateTools().hasTheRightLengthAndFormat("Mon May 10 10:12:00"));
        assertFalse("This test failed, because the given date was invalid: Tue May 10 10:12:00", new DateTools().hasTheRightLengthAndFormat("Mon Jan 01"));
        assertTrue("This test failed, because the given date was invalid: Tue Feb 12 08:12:00 2017", new DateTools().hasTheRightLengthAndFormat("Tue Feb 12 08:12:00 2017"));
        assertFalse("This test failed, because the given date was invalid: Tue Feb 15 08:12:00 2015", new DateTools().hasTheRightLengthAndFormat("Tue Feb 15 08:12:00 2015"));
        assertTrue("This test failed, because the given date was invalid: Tue Feb 15 08:12:00", new DateTools().hasTheRightLengthAndFormat("01/01"));
        assertFalse("This test failed because the given date was invalid: Tue 03/15/00", new DateTools().hasTheRightLengthAndFormat("Tue 03/15/00"));
        assertFalse("This test failed, because the given date was invalid: Tue 03/01", new DateTools().hasTheRightLengthAndFormat("Tue 03/01"));
        assertTrue("This test failed, because the given date was invalid: Tue 2/15/00", new DateTools().hasTheRightLengthAndFormat("Tue 2/15/00"));
    }


		   

}
