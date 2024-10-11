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
		
		@Test
        public void isValidDateTest1() {
            assertTrue(DateTools.isValidDate("2014-11-06 15:59:19"));
        }

        @Test
        public void formatTest1() {
            assertEquals("2015-11-06", DateTools.format("2015-11-06 15:59:19", "yyyy-MM-dd HH:mm:ss"));
        }

        @Test
        public void parseTest1() {
            String dateString = "2015-11-06 15:59:19";
            Date date = Event.parse(dateString);
            assertNotNull(date);
            assertTrue(DateTools.isValidDate(dateString, "yyyy-MM-dd HH:mm:ss"));
        }

        @Test
        public void parseAndFormatTest1() throws ParseException {
            String dateString = "2014-11-06 15:59:19";
            Date date = Event.parse(dateString);
            assertNotNull(date);
            assertTrue(DateTools.isValidDate(dateString, "yyyy-MM-dd HH:mm:ss"));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
            String expectedDateString = simpleDateFormat.format(date);
            assertEquals(expectedDateString, dateString);
        }
	
}