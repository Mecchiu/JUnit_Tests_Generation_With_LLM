import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

class DateTools_1Test {

    @Test
    void testFormatWithDefaultFormat() {
        Date date = new Date(1627776000000L); // July 31, 2021
        String expected = "2021-07-31";
        String actual = DateTools.format(date);
        assertEquals(expected, actual);
    }

    @Test
    void testFormatWithLongFormat() {
        Date date = new Date(1627776000000L); // July 31, 2021
        String expected = "2021-07-31 00:00:00";
        String actual = DateTools.format(date, DateTools.LONG_DATE_FORMAT);
        assertEquals(expected, actual);
    }

    @Test
    void testFormatWithInvalidFormat() {
        Date date = new Date(1627776000000L); // July 31, 2021
        String expected = null;
        String actual = DateTools.format(date, "invalid format");
        assertEquals(expected, actual);
    }

    @Test
    void testFormatWithNullDate() {
        Date date = null;
        String expected = null;
        String actual = DateTools.format(date);
        assertEquals(expected, actual);
    }

    @Test
    void testParseWithDefaultFormat() throws Exception {
        String dateString = "2021-07-31";
        Date expected = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT).parse(dateString);
        Date actual = DateTools.parse(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testParseWithLongFormat() throws Exception {
        String dateString = "2021-07-31 00:00:00";
        Date expected = new SimpleDateFormat(DateTools.LONG_DATE_FORMAT).parse(dateString);
        Date actual = DateTools.parse(dateString, DateTools.LONG_DATE_FORMAT);
        assertEquals(expected, actual);
    }

    @Test
    void testParseWithInvalidFormat() {
        String dateString = "2021-07-31";
        Date expected = null;
        Date actual = DateTools.parse(dateString, "invalid format");
        assertEquals(expected, actual);
    }

    @Test
    void testParseWithNullDateString() {
        String dateString = null;
        Date expected = null;
        Date actual = DateTools.parse(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDateWithValidDateString() {
        String dateString = "2021-07-31";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDateWithInvalidDateString() {
        String dateString = "invalid date";
        boolean expected = false;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDateWithNullDateString() {
        String dateString = null;
        boolean expected = false;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDateWithValidDateStringAndFormat() {
        String dateString = "2021-07-31";
        String format = DateTools.DEFAULT_DATE_FORMAT;
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString, format);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDateWithInvalidDateStringAndFormat() {
        String dateString = "2021-07-31";
        String format = "invalid format";
        boolean expected = false;
        boolean actual = DateTools.isValidDate(dateString, format);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDateWithNullDateStringAndFormat() {
        String dateString = null;
        String format = DateTools.DEFAULT_DATE_FORMAT;
        boolean expected = false;
        boolean actual = DateTools.isValidDate(dateString, format);
        assertEquals(expected, actual);
    }
}