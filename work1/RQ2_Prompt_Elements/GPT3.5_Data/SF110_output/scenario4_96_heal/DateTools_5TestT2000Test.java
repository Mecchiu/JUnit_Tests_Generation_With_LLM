import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateTools_5Test {

    @Test
    void testValidDateWithDefaultFormat() {
        assertTrue(DateTools.isValidDate("2021-01-01"));
    }

    @Test
    void testValidDateWithLongFormat() {
        assertTrue(DateTools.isValidDate("2021-01-01 12:00:00", DateTools.LONG_DATE_FORMAT));
    }

    @Test
    void testValidDateWithCustomFormat() {
        assertTrue(DateTools.isValidDate("01/01/2021", "MM/dd/yyyy"));
    }

    @Test
    void testInvalidDateWithDefaultFormat() {
        assertFalse(DateTools.isValidDate("2021-13-01"));
    }

    @Test
    void testInvalidDateWithLongFormat() {
        assertFalse(DateTools.isValidDate("2021-01-01 25:00:00", DateTools.LONG_DATE_FORMAT));
    }

    @Test
    void testInvalidDateWithCustomFormat() {
        assertFalse(DateTools.isValidDate("01/01/2021 12:00:00", "MM/dd/yyyy"));
    }

    @Test
    void testInvalidDateFormat() {
        assertFalse(DateTools.isValidDate("2021-01-01", "invalid format"));
    }

    @Test
    void testNullDateString() {
        assertFalse(DateTools.isValidDate(null));
    }

    @Test
    void testNullFormat() {
        assertFalse(DateTools.isValidDate("2021-01-01", null));
    }

    @Test
    void testEmptyDateString() {
        assertFalse(DateTools.isValidDate(""));
    }
}