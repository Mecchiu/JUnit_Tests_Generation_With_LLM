// DateTools_0Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#format(Date)} method.
*/
class DateTools_0Test {

    @Test
    void testFormat_NullDate() {
        assertNull(DateTools.format(null));
    }

    @Test
    void testFormat_DefaultFormat() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT);
        Date date = sdf.parse("2021-01-01");
        assertEquals("2021-01-01", DateTools.format(date));
    }

    @Test
    void testFormat_LongFormat() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(DateTools.LONG_DATE_FORMAT);
        Date date = sdf.parse("2021-01-01 12:00:00");
        assertEquals("2021-01-01 12:00:00", DateTools.format(date, DateTools.LONG_DATE_FORMAT));
    }

    @Test
    void testFormat_CustomFormat() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse("01/01/2021");
        assertEquals("01/01/2021", DateTools.format(date, "dd/MM/yyyy"));
    }

    @Test
    void testFormat_NullFormat() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT);
        Date date = sdf.parse("2021-01-01");
        assertEquals("2021-01-01", DateTools.format(date, null));
    }

    @Test
    void testFormat_InvalidFormat() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT);
        Date date = sdf.parse("2021-01-01");
        assertNull(DateTools.format(date, "invalid format"));
    }

    @Test
    void testFormat_InvalidDate() {
        assertNull(DateTools.format(new Date(Long.MAX_VALUE)));
    }

    @Test
    void testFormat_EmptyFormat() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT);
        Date date = sdf.parse("2021-01-01");
        assertEquals("2021-01-01", DateTools.format(date, ""));
    }

    @Test
    void testFormat_WhitespaceFormat() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT);
        Date date = sdf.parse("2021-01-01");
        assertEquals("2021-01-01", DateTools.format(date, " "));
    }

    @Test
    void testFormat_MultipleFormats() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse("01/01/2021");
        assertEquals("01/01/2021", DateTools.format(date, DateTools.DEFAULT_DATE_FORMAT, "dd/MM/yyyy"));
    }
}