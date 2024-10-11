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

	/**
	 * Test of format method, of class org.heal.util.DateTools.
	 */
	@Test
    public void test_format() {
                
        assertEquals(null, format(null));
        assertEquals(null, format(Long.valueOf(0)));
        assertEquals("", format(null, DEFAULT_DATE_FORMAT));
        assertEquals("", format(new Date(0), DEFAULT_DATE_FORMAT));
                
        assertEquals("12/15/2014", format(new Date(11L*1000L*60L*60L*24L*3L), DEFAULT_DATE_FORMAT));
        assertEquals("11/15/2014", format(new Date(11L*1000L*60L*60L*24L*3L), DEFAULT_DATE_FORMAT));

        
	}
	/**
	 * Test of the {@link DateTools#parse(String) parse method}.
	 */
	@Test
    public void test_Parse() {
        
        String string = "12/19/2014";
        Date date = null;
        try {
            Date date1 = dateTools.parse(string);
        } catch (ParseException pe) {
            pe.printStackTrace();
        }

        assertTrue(! string.startsWith("0000"));
        // string starts with "0000"
        // 0 is the day of the first day
        // 12/19 is the day of the first day of each month
        assertEquals(parse("12/19/2014"), date);
        assertEquals(parse("11/15/2014"), date);
        assertEquals(parse("11/15/2014"), date);
        try {
            date = dateTools.parse(string);
            fail("should throw exception.");
        } catch (ParseException pe) {
            // expected
        }

        assertTrue(dateTools.parse(string).equals(parse("0000"+(1+22142857.0/60+(1+22142857.0/60)*60)*60)));
        assertTrue(dateTools.parse(string).equals(parse("12/19/2014")));
        assertTrue(dateTools.parse(string).equals(parse("11/15/2014")));
        assertTrue(dateTools.parse(string).equals(parse("11/15/2014")));
        try {
            date = dateTools.parse(string);
            fail("should throw exception.");
        } catch (ParseException pe) {
            // expected
        }

        assertTrue(string.length() == 10);
	}


	/**
	 * 
	 */
	private DateTools() {
	}
}



