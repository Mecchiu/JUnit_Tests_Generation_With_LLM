import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateTools_2Test {

    @Test
    void testParseNull() {
        assertNull(DateTools.parse(null));
    }

    @Test
    void testParseEmptyString() {
        assertNull(DateTools.parse(""));
    }

    @Test
    void testParseInvalidFormat() {
        assertNull(DateTools.parse("2021-01-01 12:00:00", "yyyy-MM-dd"));
    }

    @Test
    void testParseValidFormat() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date expected = sdf.parse("2021-01-01");
        assertEquals(expected, DateTools.parse("2021-01-01", "yyyy-MM-dd"));
    }

    @Test
    void testParseMultipleFormats() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date expected = sdf.parse("2021-01-01");
        assertEquals(expected, DateTools.parse("2021-01-01", "yyyy-MM-dd", "MM/dd/yyyy"));
    }

    @Test
    void testParseInvalidDate() {
        assertNull(DateTools.parse("2021-02-31"));
    }

    @Test
    void testParseValidDate() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date expected = sdf.parse("2021-01-01");
        assertEquals(expected, DateTools.parse("2021-01-01"));
    }

    @Test
    void testParseInvalidDateFormat() {
        assertNull(DateTools.parse("2021-01-01", "MM/dd/yyyy"));
    }

    @Test
    void testParseValidDateFormat() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date expected = sdf.parse("2021-01-01");
        assertEquals(expected, DateTools.parse("01-01-2021", "MM-dd-yyyy"));
    }
}