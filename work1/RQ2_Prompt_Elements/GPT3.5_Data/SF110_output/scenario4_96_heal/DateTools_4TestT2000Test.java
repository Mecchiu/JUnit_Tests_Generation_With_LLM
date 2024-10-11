// DateTools_4Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#isValidDate(String)} method.
*/
class DateTools_4Test {

    @Test
    void testIsValidDate_Null() {
        assertFalse(DateTools.isValidDate(null));
    }

    @Test
    void testIsValidDate_Empty() {
        assertFalse(DateTools.isValidDate(""));
    }

    @Test
    void testIsValidDate_InvalidFormat() {
        assertFalse(DateTools.isValidDate("2021/01/01"));
    }

    @Test
    void testIsValidDate_ValidFormat() {
        assertTrue(DateTools.isValidDate("2021-01-01"));
    }

    @Test
    void testIsValidDate_InvalidDate() {
        assertFalse(DateTools.isValidDate("2021-02-31"));
    }

    @Test
    void testIsValidDate_ValidDate() {
        assertTrue(DateTools.isValidDate("2021-02-28"));
    }

    @Test
    void testIsValidDate_InvalidMonth() {
        assertFalse(DateTools.isValidDate("2021-13-01"));
    }

    @Test
    void testIsValidDate_ValidMonth() {
        assertTrue(DateTools.isValidDate("2021-12-01"));
    }

    @Test
    void testIsValidDate_InvalidYear() {
        assertFalse(DateTools.isValidDate("10000-01-01"));
    }

    @Test
    void testIsValidDate_ValidYear() {
        assertTrue(DateTools.isValidDate("2021-01-01"));
    }
}