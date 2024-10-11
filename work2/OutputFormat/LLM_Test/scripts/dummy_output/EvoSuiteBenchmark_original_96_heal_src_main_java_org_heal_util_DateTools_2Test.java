 package org.heal.util;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
class DateTools_2Test {
    @Test
    void testParse_NullInput() {
        assertNull(DateTools.parse(null));
    }
    @Test
    void testParse_EmptyInput() {
        assertNull(DateTools.parse(""));
    }
    @Test
    void testParse_InvalidDateFormat() {
        assertNull(DateTools.parse("2021-13-01"));
    }
    @Test
    void testParse_ValidDateFormat1() {
        Date expectedDate = new Date(Long.parseLong("1610617200000"));
        assertEquals(expectedDate, DateTools.parse("2021-01-14"));
    }
    @Test
    void testParse_ValidDateFormat2() {
        Date expectedDate = new Date(Long.parseLong("1610617200000"));
        assertEquals(expectedDate, DateTools.parse("01/14/2021"));
    }
    @Test
    void testParse_ValidDateFormat3() {
        Date expectedDate = new Date(Long.parseLong("1610617200000"));
        assertEquals(expectedDate, DateTools.parse("01-14-2021"));
    }
    @Test
    void testParse_ValidDateFormat4() {
        Date expectedDate = new Date(Long.parseLong("1609477200000"));
        assertEquals(expectedDate, DateTools.parse("2021"));
    }
    @Test
    void testParse_InvalidDate() {
        assertNull(DateTools.parse("InvalidDate"));
    }
}