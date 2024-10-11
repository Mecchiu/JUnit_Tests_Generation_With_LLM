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
     * Tests the format method, which takes a string in the given format.
     */
    @Test
    public void testFormat() {
        final Date date1 = new Date(2007,3,15);
        final Date date2 = new Date(2010,10,5);
        final String format = "yyyy-MM-dd";

        assertEquals(
            "The formatter doesn't return the input.",
            null,
            DateTools.format(date1, format)); 			

        assertEquals(
            "The formatter returns null.",
            null,
            DateTools.format(date2, format)
        ); 			
    }
    
    /**
     * Tests the parse method, which takes a string in the given format.
     */
    @Test
    public void testParse() {
        Date date = null;
        
        try {
            date = DateTools.parse("20010104", "yyyy-MM-dd");
        } catch (ParseException e) {
            fail(e.getMessage());
        } 
        
        assertEquals(
            "The parse method doesn't return a valid date.",
            date1,
            date); 			

        date = DateTools.parse("2007-03-15", "yyyy-MM-dd");
        assertEquals(
            "The parse method doesn't return a valid date.",
            date1,
            date); 			
    }
}