// CircularShift.java
package scenario3;

class CircularShift {

    /**
     * Circular shift the digits of the integer x, shift the digits right by shift
     * and return the result as a string.
     * If shift > number of digits, return digits reversed.
     *
     * > circularShift(100, 2)
     * "001"
     * > circularShift(12, 2)
     * "12"
     * > circularShift(97, 8)
     * "79"
     * > circularShift(12, 1)
     * "21"
     * > circularShift(11, 101)
     * "11"
     */
    public static String circularShift(int x, int shift) {
        String str = Integer.toString(x);
        int len = str.length();
        if (shift > len) {
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            return sb.toString();
        }
        shift = shift % len;
        String shiftedStr = str.substring(len - shift) + str.substring(0, len - shift);
        return shiftedStr;
    }
}

// CircularShiftTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CircularShift}.
* It contains ten unit test cases for the {@link CircularShift#circularShift(int, int)} method.
*/
class CircularShiftTest {
    @Test
    void testCircularShift1() {
        assertEquals("001", CircularShift.circularShift(100, 2));
    }

    @Test
    void testCircularShift2() {
        assertEquals("12", CircularShift.circularShift(12, 2));
    }

    @Test
    void testCircularShift3() {
        assertEquals("79", CircularShift.circularShift(97, 8));
    }

    @Test
    void testCircularShift4() {
        assertEquals("21", CircularShift.circularShift(12, 1));
    }

    @Test
    void testCircularShift5() {
        assertEquals("11", CircularShift.circularShift(11, 101));
    }

    @Test
    void testCircularShift6() {
        assertEquals("12345", CircularShift.circularShift(12345, 0));
    }

    @Test
    void testCircularShift7() {
        assertEquals("12345", CircularShift.circularShift(12345, 5));
    }

    @Test
    void testCircularShift8() {
        assertEquals("54321", CircularShift.circularShift(12345, 10));
    }

    @Test
    void testCircularShift9() {
        assertEquals("54321", CircularShift.circularShift(12345, 15));
    }

    @Test
    void testCircularShift10() {
        assertEquals("12345", CircularShift.circularShift(12345, 20));
    }
}