// Here's the source code for the CircularShiftTest class:

package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link CircularShift}.
 * It contains ten unit test cases for the {@link CircularShift#circularShift(int, int)} method.
 */
class CircularShiftTest {

    @Test
    void testCircularShiftWithShiftGreaterThanXLength() {
        String result = CircularShift.circularShift(1234, 5);
        assertEquals("4321", result);
    }

    @Test
    void testCircularShiftWithShiftEqualToXLength() {
        String result = CircularShift.circularShift(1234, 4);
        assertEquals("1234", result);
    }

    @Test
    void testCircularShiftWithShiftLessThanXLength() {
        String result = CircularShift.circularShift(1234, 2);
        assertEquals("3412", result);
    }

    @Test
    void testCircularShiftWithXEqualToZero() {
        String result = CircularShift.circularShift(0, 3);
        assertEquals("000", result);
    }

    @Test
    void testCircularShiftWithShiftEqualToZero() {
        String result = CircularShift.circularShift(1234, 0);
        assertEquals("1234", result);
    }

    @Test
    void testCircularShiftWithNegativeShift() {
        String result = CircularShift.circularShift(1234, -2);
        assertEquals("3412", result);
    }

    @Test
    void testCircularShiftWithNegativeX() {
        String result = CircularShift.circularShift(-1234, 2);
        assertEquals("-3412", result);
    }

    @Test
    void testCircularShiftWithNegativeXAndNegativeShift() {
        String result = CircularShift.circularShift(-1234, -2);
        assertEquals("-3412", result);
    }

    @Test
    void testCircularShiftWithXGreaterThanIntegerMaxValue() {
        String result = CircularShift.circularShift(Integer.MAX_VALUE, 2);
        assertEquals("473709551", result);
    }

    @Test
    void testCircularShiftWithXLessThanIntegerMinValue() {
        String result = CircularShift.circularShift(Integer.MIN_VALUE, 2);
        assertEquals("-473709552", result);
    }
}