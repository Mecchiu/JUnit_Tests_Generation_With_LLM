package org.heal.util;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateTools_5Test {

    @Test
    void testIsValidDateWithValidDateAndFormat() {
        assertTrue(DateTools.isValidDate("2021-12-31", "yyyy-MM-dd"));
    }

    @Test
    void testIsValidDateWithInvalidDateAndFormat() {
        assertFalse(DateTools.isValidDate("31-12-2021", "yyyy-MM-dd"));
    }

    @Test
    void testIsValidDateWithNullDate() {
        assertFalse(DateTools.isValidDate(null, "yyyy-MM-dd"));
    }

    @Test
    void testIsValidDateWithNullFormat() {
        assertFalse(DateTools.isValidDate("2021-12-31", null));
    }

    @Test
    void testIsValidDateWithEmptyDate() {
        assertFalse(DateTools.isValidDate("", "yyyy-MM-dd"));
    }

    @Test
    void testIsValidDateWithEmptyFormat() {
        assertFalse(DateTools.isValidDate("2021-12-31", ""));
    }

    @Test
    void testIsValidDateWithInvalidDateFormat() {
        assertFalse(DateTools.isValidDate("2021-12-31", "dd-MM-yyyy"));
    }

    @Test
    void testIsValidDateWithInvalidDate() {
        assertFalse(DateTools.isValidDate("2021-13-31", "yyyy-MM-dd"));
    }

    @Test
    void testIsValidDateWithValidDateAndInvalidFormat() {
        assertFalse(DateTools.isValidDate("2021-12-31", "MM/dd/yyyy"));
    }

    @Test
    void testIsValidDateWithInvalidDateAndInvalidFormat() {
        assertFalse(DateTools.isValidDate("31-12-2021", "MM/dd/yyyy"));
    }
}
