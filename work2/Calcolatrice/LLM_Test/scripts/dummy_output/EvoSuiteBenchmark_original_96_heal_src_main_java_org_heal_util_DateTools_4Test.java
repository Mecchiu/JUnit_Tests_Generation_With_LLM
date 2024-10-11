package org.heal.util;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateTools_4Test {

    @Test
    void testIsValidDate_NullInput() {
        assertFalse(DateTools.isValidDate(null));
    }

    @Test
    void testIsValidDate_EmptyInput() {
        assertFalse(DateTools.isValidDate(""));
    }

    @Test
    void testIsValidDate_ValidDateFormat1() {
        assertTrue(DateTools.isValidDate("2022-01-15"));
    }

    @Test
    void testIsValidDate_ValidDateFormat2() {
        assertTrue(DateTools.isValidDate("01/15/2022"));
    }

    @Test
    void testIsValidDate_InvalidDateFormat() {
        assertFalse(DateTools.isValidDate("2022/01/15"));
    }

    @Test
    void testIsValidDate_ValidYearFormat() {
        assertTrue(DateTools.isValidDate("2022"));
    }

    @Test
    void testIsValidDate_InvalidYearFormat() {
        assertFalse(DateTools.isValidDate("22"));
    }

    @Test
    void testIsValidDate_InvalidDate() {
        assertFalse(DateTools.isValidDate("invalid date"));
    }

    @Test
    void testIsValidDate_ValidLongDateFormat() {
        assertTrue(DateTools.isValidDate("2022-01-15 12:30:45", "yyyy-MM-dd HH:mm:ss"));
    }

    @Test
    void testIsValidDate_InvalidLongDateFormat() {
        assertFalse(DateTools.isValidDate("2022-01-15 12:30:45", "MM/dd/yyyy"));
    }
}
