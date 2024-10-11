// Functions_2Test.java
package net.sourceforge.ext4j.taglib.tag;

import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Functions}.
 * It contains ten unit test cases for the {@link Functions#dateToMilliseconds(Date)} method.
 */
class Functions_2Test {

    @Test
    void testDateToMilliseconds_NullDate() {
        long result = Functions.dateToMilliseconds(null);
        assertEquals(0, result);
    }

    @Test
    void testDateToMilliseconds_ValidDate() {
        Calendar c = Calendar.getInstance();
        c.set(2021, Calendar.JANUARY, 1, 0, 0, 0);
        Date date = c.getTime();
        long result = Functions.dateToMilliseconds(date);
        assertEquals(1609459200000L, result);
    }

    @Test
    void testDateToMilliseconds_DateBefore1970() {
        Calendar c = Calendar.getInstance();
        c.set(1969, Calendar.DECEMBER, 31, 23, 59, 59);
        Date date = c.getTime();
        long result = Functions.dateToMilliseconds(date);
        assertEquals(-1000L, result);
    }

    @Test
    void testDateToMilliseconds_DateAfter2038() {
        Calendar c = Calendar.getInstance();
        c.set(2039, Calendar.JANUARY, 1, 0, 0, 0);
        Date date = c.getTime();
        long result = Functions.dateToMilliseconds(date);
        assertEquals(2147483648000L, result);
    }

    @Test
    void testDateToMilliseconds_DateWithMilliseconds() {
        Calendar c = Calendar.getInstance();
        c.set(2021, Calendar.JANUARY, 1, 0, 0, 0);
        c.set(Calendar.MILLISECOND, 500);
        Date date = c.getTime();
        long result = Functions.dateToMilliseconds(date);
        assertEquals(1609459200500L, result);
    }

    @Test
    void testDateToMilliseconds_DateWithSeconds() {
        Calendar c = Calendar.getInstance();
        c.set(2021, Calendar.JANUARY, 1, 0, 0, 30);
        Date date = c.getTime();
        long result = Functions.dateToMilliseconds(date);
        assertEquals(1609459230000L, result);
    }

    @Test
    void testDateToMilliseconds_DateWithMinutes() {
        Calendar c = Calendar.getInstance();
        c.set(2021, Calendar.JANUARY, 1, 0, 30, 0);
        Date date = c.getTime();
        long result = Functions.dateToMilliseconds(date);
        assertEquals(1609459800000L, result);
    }

    @Test
    void testDateToMilliseconds_DateWithHours() {
        Calendar c = Calendar.getInstance();
        c.set(2021, Calendar.JANUARY, 1, 12, 0, 0);
        Date date = c.getTime();
        long result = Functions.dateToMilliseconds(date);
        assertEquals(1609492800000L, result);
    }

    @Test
    void testDateToMilliseconds_DateWithDays() {
        Calendar c = Calendar.getInstance();
        c.set(2021, Calendar.JANUARY, 15, 0, 0, 0);
        Date date = c.getTime();
        long result = Functions.dateToMilliseconds(date);
        assertEquals(1610678400000L, result);
    }

    @Test
    void testDateToMilliseconds_DateWithMonths() {
        Calendar c = Calendar.getInstance();
        c.set(2021, Calendar.MARCH, 1, 0, 0, 0);
        Date date = c.getTime();
        long result = Functions.dateToMilliseconds(date);
        assertEquals(1614556800000L, result);
    }
}