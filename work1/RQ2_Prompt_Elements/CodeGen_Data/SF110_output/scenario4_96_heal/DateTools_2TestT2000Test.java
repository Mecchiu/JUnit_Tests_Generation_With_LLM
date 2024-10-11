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

    @Test
    void testIsValidDate() {
        assertTrue(DateTools.isValidDate("2013-05-31"));
        assertFalse(DateTools.isValidDate(null) );
    } 

    @Test
    void testParseDateString() {
        assertEquals(new Date(2012,2,2,0,0), DateTools.parse("2012-02-02"));
        assertEquals(new Date(0,0,0), DateTools.parse(" 0:0:0"));
        assertEquals(new Date(0,0), DateTools.parse(" 00:00:00"));
        assertEquals(new Date(0), DateTools.parse(" 00:00"));
        assertEquals(new Date(2000), DateTools.parse(" 2016"));
        assertEquals(new Date(new Date(null,0)), DateTools.parse(" 2037-11-27"));
    }
    @Test
    void testParseDateString2() {
        // test two formats
        assertEquals(new Date(2012,2,2,0,0), DateTools.parse("20120512","MM-dd-yyyy"));
        assertEquals(new Date(0,0,0), DateTools.parse(" 01,01,00",""));
        assertEquals(new Date(0), DateTools.parse(" 00,00", ""));
        assertEquals(new Date(2000), DateTools.parse(" 2016", "MM-dd-yyyy"));
        assertEquals(new Date(1980+4), DateTools.parse("1961-12-31", "MM-dd-yyyy"));
	assertEquals(new Date(-12*12), DateTools.parse("-12-12", ""));
        assertEquals(new Date(1980+(12-12)), DateTools.parse("1961-12-31", "MM-dd-yyyy"));
	assertEquals(new Date(1980)+12, DateTools.parse("1961-12-31", "MM-dd-yyyy"));
	assertEquals(new Date(1980+1), DateTools.parse("1961-12-31", "MM-dd-yyyy"));
	assertEquals(new Date(1980+12), DateTools.parse("1961-12-31", "MM-dd-yyyy"));
	assertEquals(new Date(1970+1), DateTools.parse("1900-1-1", ""));

}
