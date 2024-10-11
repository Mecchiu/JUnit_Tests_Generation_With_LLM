// CircularShiftTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link CircularShift}.
 * It contains ten unit test cases for the {@link CircularShift#circularShift(int, int)} method.
 */
class CircularShiftTest {

    @Test
    void testCircularShiftWithShiftGreaterThanLength() {
        assertEquals("4321", CircularShift.circularShift(1234, 5));
    }

    @Test
    void testCircularShiftWithShiftEqualToLength() {
        assertEquals("1234", CircularShift.circularShift(1234, 4));
    }

    @Test
    void testCircularShiftWithShiftLessThanLength() {
        assertEquals("3412", CircularShift.circularShift(1234, 2));
    }

    @Test
    void testCircularShiftWithShiftEqualToZero() {
        assertEquals("1234", CircularShift.circularShift(1234, 0));
    }

    @Test
    void testCircularShiftWithNegativeShift() {
        assertEquals("3412", CircularShift.circularShift(1234, -2));
    }

    @Test
    void testCircularShiftWithNegativeNumber() {
        assertEquals("4321", CircularShift.circularShift(-1234, 5));
    }

    @Test
    void testCircularShiftWithZero() {
        assertEquals("0", CircularShift.circularShift(0, 1));
    }

    @Test
    void testCircularShiftWithSingleDigitNumber() {
        assertEquals("1", CircularShift.circularShift(1, 1));
    }

    @Test
    void testCircularShiftWithLargeNumber() {
        assertEquals("9876543210", CircularShift.circularShift(1234567890, 10));
    }

    @Test
    void testCircularShiftWithLargeNegativeShift() {
        assertEquals("345612", CircularShift.circularShift(123456, -2));
    }
}