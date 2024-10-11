// GreatestCommonDivisor.java
package scenario3;

class GreatestCommonDivisor {

    /**
     * Return the greatest common divisor of two integers a and b.
     *
     * > greatestCommonDivisor(3, 5)
     * 1
     * > greatestCommonDivisor(25, 15)
     * 5
     * > greatestCommonDivisor(3, 7)
     * 1
     * > greatestCommonDivisor(10, 15)
     * 5
     * > greatestCommonDivisor(49, 14)
     * 7
     * > greatestCommonDivisor(144, 60)
     * 12
     */
    public static int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return greatestCommonDivisor(b, a % b);
        }
    }
}

// GreatestCommonDivisorTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GreatestCommonDivisor}.
* It contains ten unit test cases for the {@link GreatestCommonDivisor#greatestCommonDivisor(int, int)} method.
*/
class GreatestCommonDivisorTest {
    @Test
    void testGreatestCommonDivisor() {
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(3, 5));
        assertEquals(5, GreatestCommonDivisor.greatestCommonDivisor(25, 15));
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(3, 7));
        assertEquals(5, GreatestCommonDivisor.greatestCommonDivisor(10, 15));
        assertEquals(7, GreatestCommonDivisor.greatestCommonDivisor(49, 14));
        assertEquals(12, GreatestCommonDivisor.greatestCommonDivisor(144, 60));
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(1, 1));
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(1, 2));
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(2, 1));
        assertEquals(2, GreatestCommonDivisor.greatestCommonDivisor(2, 2));
    }
}