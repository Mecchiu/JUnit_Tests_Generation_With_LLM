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
     * Constructor.
     */
    DateTools_0Test() {
    }

    /**
     * Tests the {@link DateTools#format(Date)} method.
     */
    @Test
    void testFormat() {

        assertEquals(DEFAULT_DATE_FORMAT + " 'yyyy-mm-dd'",
                format(new Date(0)),
                DateTools.CURRENT_DATE_START_FORMAT.format(new Date()));

        assertEquals(DEFAULT_DATE_FORMAT + " 'yyyy-mm-dd'",
                format(DateTools.CURRENT_DATE_START_ATTRIBUTE),
                DateTools.CURRENT_DATE_START_ATTRIBUTE.format(new Date()));
    }

    /**
     * Checks the parsing of the {@link String} in the format specified by
     * {@link #DEFAULT_DATE_FORMAT}.
     */
    @Test
    void parse_Test() {
        SimpleDateFormat oldFormatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);

        assertNotNull(oldFormatter);
        assertEquals(DEFAULT_DATE_FORMAT + "[dd] yyyy-mm-dd",
                oldFormatter.parse(
                    "yyyy-mm-dd")
                       .toString());
        assertEquals(DEFAULT_DATE_FORMAT + "[yyyy-mm-dd]",
                oldFormatter.parse(
                    "yyyy-mm-dd")
                       .toString());
    }

    /**
     * Tests the {@link SimpleDateFormat#parse(String)} method.
     */
    @Test
    void parseTest() {
        SimpleDateFormat oldFormatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);

        assertNotNull(oldFormatter);
        assertEquals(oldFormatter.parse("'yyyy-mm-dd'").toString(),
                oldFormatter.parse("yyyy-mm-dd")
                       .toString());
        assertEquals(oldFormatter.parse("'yyyy-mm-dd'").toString(),
                oldFormatter.parse(
                    "yyyy-mm-dd")
                       .toString());
    }

    /**
     * Tests the {@link SimpleDateFormat#dateInstance() method}.
     */
    @Test
    void dateInstanceTest() {
        SimpleDateFormat oldFormatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);

        SimpleDate date = oldFormatter.dateInstance();
        System.out.println("date instance = " + date);

        assertNotNull(date);
        SimpleDate date2 = date.getTime();
        SimpleDate date4 = (SimpleDate)date;
        System.out.println("date instance = " + (date2.getTime()));
        assertNotNull(date);

        assertTrue(date instanceof java.util.Date);
        assertTrue(date2 instanceof java.util.Date);
        assertTrue(date4 instanceof java.util.Date);
    }

    /**
     * Asserts that a {@link ParseException} occurs when {@link #DEFAULT_DATE_FORMAT} is not
     * provided as a parameter.
     * @throws UnsupportedOperationException 
     */
    @Test(expected = UnsupportedOperationException.class)
    void testParsing_NullTest() throws UnsupportedOperationException {
        DateTools.CURRENT_DATE_START_ATTRIBUTE.parse(null);
    }
    
    @Test
    void testParsingTest() {
        int value = 10000;
        Date date = new Date(value);
        
        assertNotNull(("Date must not be null!"));
        assertNotNull(("Date must be a date instance!"));

        String dateString = "";
        String currentDate = DateTools.CURRENT_DATE_START_ATTRIBUTE.format(date);
        
        DateTools.CURRENT_DATE_START_ATTRIBUTE.parse(currentDate);

        SimpleDate oldFormatter = date instanceof SimpleDate?(SimpleDate)date:null;
        assertEquals(currentDate,oldFormatter.toString());
        assertNull(oldFormatter);
    }

}