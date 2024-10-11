// ClosestInteger.java
package scenario3;

class ClosestInteger {

    /**
     * * Create a function that takes a value (string) representing a number
     * and returns the closest integer to it. If the number is equidistant
     * from two integers, round it away from zero.
     *
     * Examples
     * >>> closestInteger("10")
     * 10
     * >>> closestInteger("15.3")
     * 15
     *
     * Note:
     * Rounding away from zero means that if the given number is equidistant
     * from two integers, the one you should return is the one that is the
     * farthest from zero. For example closest_integer("14.5") should
     * return 15 and closest_integer("-14.5") should return -15.
     *
     * > closestInteger("10")
     * 10
     * > closestInteger("14.5")
     * 15
     * > closestInteger("-15.5")
     * -16
     * > closestInteger("15.3")
     * 15
     * > closestInteger("0")
     * 0
     */
    public static int closestInteger(String value) {
        double num = Double.parseDouble(value);
        int rounded = (int) Math.round(num);
        if (num == rounded) {
            return rounded;
        } else if (num > 0) {
            return (int) Math.ceil(num);
        } else {
            return (int) Math.floor(num);
        }
    }
}

// ClosestIntegerTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClosestInteger}.
* It contains ten unit test cases for the {@link ClosestInteger#closestInteger(String)} method.
*/
class ClosestIntegerTest {
    @Test
    void testClosestInteger1() {
        assertEquals(10, ClosestInteger.closestInteger("10"));
    }

    @Test
    void testClosestInteger2() {
        assertEquals(15, ClosestInteger.closestInteger("15.3"));
    }

    @Test
    void testClosestInteger3() {
        assertEquals(15, ClosestInteger.closestInteger("14.5"));
    }

    @Test
    void testClosestInteger4() {
        assertEquals(-15, ClosestInteger.closestInteger("-15.5"));
    }

    @Test
    void testClosestInteger5() {
        assertEquals(15, ClosestInteger.closestInteger("15.5"));
    }

    @Test
    void testClosestInteger6() {
        assertEquals(-15, ClosestInteger.closestInteger("-14.5"));
    }

    @Test
    void testClosestInteger7() {
        assertEquals(0, ClosestInteger.closestInteger("0"));
    }

    @Test
    void testClosestInteger8() {
        assertEquals(1, ClosestInteger.closestInteger("0.5"));
    }

    @Test
    void testClosestInteger9() {
        assertEquals(-1, ClosestInteger.closestInteger("-0.5"));
    }

    @Test
    void testClosestInteger10() {
        assertEquals(0, ClosestInteger.closestInteger("0.4"));
    }
}