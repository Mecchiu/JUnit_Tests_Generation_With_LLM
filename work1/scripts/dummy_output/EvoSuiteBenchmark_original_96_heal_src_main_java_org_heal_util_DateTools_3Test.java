package org.heal.util;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateTools_3Test {

    @Test
    void testParseValidDateWithDefaultFormat() {
        String dateString = "2022-01-15";
        Date expectedDate = new Date(122, 0, 15); // January is 0-based
        Date actualDate = DateTools.parse(dateString, "yyyy-MM-dd");
        assertEquals(expectedDate, actualDate);
    }

    @Test
    void testParseValidDateWithLongFormat() {
        String dateString = "2022-01-15 12:30:45";
        Date expectedDate = new Date(122, 0, 15, 12, 30, 45); // January is 0-based
        Date actualDate = DateTools.parse(dateString, "yyyy-MM-dd HH:mm:ss");
        assertEquals(expectedDate, actualDate);
    }

    @Test
    void testParseValidDateWithDifferentFormat() {
        String dateString = "01/15/2022";
        Date expectedDate = new Date(122, 0, 15); // January is 0-based
        Date actualDate = DateTools.parse(dateString, "MM/dd/yyyy");
        assertEquals(expectedDate, actualDate);
    }

    @Test
    void testParseInvalidDate() {
        String dateString = "2022/01/15";
        Date actualDate = DateTools.parse(dateString, "yyyy-MM-dd");
        assertNull(actualDate);
    }

    @Test
    void testParseNullDate() {
        String dateString = null;
        Date actualDate = DateTools.parse(dateString, "yyyy-MM-dd");
        assertNull(actualDate);
    }

    @Test
    void testParseInvalidFormat() {
        String dateString = "2022-01-15";
        Date actualDate = DateTools.parse(dateString, "MM/dd/yyyy");
        assertNull(actualDate);
    }

    @Test
    void testParseEmptyFormat() {
        String dateString = "2022-01-15";
        Date actualDate = DateTools.parse(dateString, "");
        assertNull(actualDate);
    }

    @Test
    void testParseInvalidDateFormat() {
        String dateString = "2022-01-15";
        Date actualDate = DateTools.parse(dateString, "yyyy/MM/dd");
        assertNull(actualDate);
    }

    @Test
    void testParseValidDateWithYearFormat() {
        String dateString = "2022";
        Date expectedDate = new Date(122, 0, 1); // January is 0-based
        Date actualDate = DateTools.parse(dateString, "yyyy");
        assertEquals(expectedDate, actualDate);
    }
}
