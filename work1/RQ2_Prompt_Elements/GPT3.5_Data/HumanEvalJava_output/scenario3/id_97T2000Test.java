// Multiply.java
package scenario3;

class Multiply {

    /**
     * Complete the function that takes two integers and returns
     * the product of their unit digits.
     * Assume the input is always valid.
     * Examples:
     * multiply(148, 412) should return 16.
     * multiply(19, 28) should return 72.
     * multiply(2020, 1851) should return 0.
     * multiply(14,-15) should return 20.
     *
     * > multiply(148, 412)
     * 16
     * > multiply(19, 28)
     * 72
     * > multiply(2020, 1851)
     * 0
     * > multiply(14, -15)
     * 20
     * > multiply(76, 67)
     * 42
     * > multiply(17, 27)
     * 49
     * > multiply(0, 1)
     * 0
     * > multiply(0, 0)
     * 0
     */
    public static int multiply(int a, int b) {
        int unitA = Math.abs(a) % 10;
        int unitB = Math.abs(b) % 10;
        return unitA * unitB;
    }
}

// MultiplyTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Multiply}.
* It contains ten unit test cases for the {@link Multiply#multiply(int, int)} method.
*/
class MultiplyTest {
    @Test
    void testMultiplyPositiveNumbers() {
        assertEquals(16, Multiply.multiply(148, 412));
        assertEquals(72, Multiply.multiply(19, 28));
        assertEquals(42, Multiply.multiply(76, 67));
        assertEquals(49, Multiply.multiply(17, 27));
    }

    @Test
    void testMultiplyNegativeNumbers() {
        assertEquals(20, Multiply.multiply(14, -15));
    }

    @Test
    void testMultiplyZero() {
        assertEquals(0, Multiply.multiply(2020, 1851));
        assertEquals(0, Multiply.multiply(0, 1));
        assertEquals(0, Multiply.multiply(0, 0));
    }
}