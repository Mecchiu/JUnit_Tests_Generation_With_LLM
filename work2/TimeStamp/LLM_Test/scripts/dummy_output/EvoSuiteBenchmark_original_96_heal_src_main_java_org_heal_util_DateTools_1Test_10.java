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
     * Test method for
     * 'org.heal.util.DateTools.format(java.util.Date, String)'
     * with two arguments.
     */
    @Test
    void testFormatLng() {
        Date date = null;
        SimpleDateFormat dateFormat = null;
        assertEquals(DEFAULT_DATE_FORMAT, DateTools.format(date, DEFAULT_DATE_FORMAT));
        try {
            dateFormat = new SimpleDateFormat(LONG_DATE_FORMAT);
            assertEquals(LONG_DATE_FORMAT, Long.toString(dateFormat.parse(LONG_DATE_FORMAT)));
            date = Long.valueOf(LONG_DATE_FORMAT);
            assertEquals(LONG_DATE_FORMAT,  DateTools.format(date, Long.toString(DEFAULT_DATE_FORMAT)));
        } catch (ParseException ex) {
           fail("Could not format "+ date +" with "+ DEFAULT_DATE_FORMAT);    
        }
        // assertNotNull();
    }
	
	
	
	
	
    
}
// DateTools_1Test.java