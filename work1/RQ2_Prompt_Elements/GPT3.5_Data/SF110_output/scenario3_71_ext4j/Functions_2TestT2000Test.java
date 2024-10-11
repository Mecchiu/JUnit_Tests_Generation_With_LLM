// Functions_2Test.java
package net.sourceforge.ext4j.taglib.tag;

import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Functions}.
 * It contains ten unit test cases for the {@link Functions#dateToMilliseconds(Date)} method.
 */
class Functions_2Test {

    @Test
    void testDateToMilliseconds() {
        // Test case 1: null date
        assertEquals(0, Functions.dateToMilliseconds(null));

        // Test case 2: epoch date
        assertEquals(0, Functions.dateToMilliseconds(new Date(0)));

        // Test case 3: current date
        long expected = System.currentTimeMillis();
        long actual = Functions.dateToMilliseconds(new Date(expected));
        assertTrue(Math.abs(expected - actual) < 1000);

        // Test case 4: future date
        expected = System.currentTimeMillis() + 1000000;
        actual = Functions.dateToMilliseconds(new Date(expected));
        assertTrue(Math.abs(expected - actual) < 1000);

        // Test case 5: past date
        expected = System.currentTimeMillis() - 1000000;
        actual = Functions.dateToMilliseconds(new Date(expected));
        assertTrue(Math.abs(expected - actual) < 1000);

        // Test case 6: leap year
        expected = 946684800000L; // 2000-01-01 00:00:00
        actual = Functions.dateToMilliseconds(new Date(expected));
        assertEquals(expected, actual);

        // Test case 7: non-leap year
        expected = 1577836800000L; // 2020-01-01 00:00:00
        actual = Functions.dateToMilliseconds(new Date(expected));
        assertEquals(expected, actual);

        // Test case 8: daylight saving time
        expected = 1583011200000L; // 2020-02-29 00:00:00
        actual = Functions.dateToMilliseconds(new Date(expected));
        assertEquals(expected, actual);

        // Test case 9: negative milliseconds
        expected = -1000000;
        actual = Functions.dateToMilliseconds(new Date(expected));
        assertEquals(expected, actual);

        // Test case 10: large positive milliseconds
        expected = 999999999999L;
        actual = Functions.dateToMilliseconds(new Date(expected));
        assertEquals(expected, actual);
    }
}