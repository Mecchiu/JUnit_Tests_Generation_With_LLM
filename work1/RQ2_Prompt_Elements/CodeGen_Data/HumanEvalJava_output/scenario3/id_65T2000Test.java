// CircularShiftTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CircularShift}.
* It contains one unit test case for the {@link CircularShift#circularShift(int, int)} method.
*/
class CircularShiftTest {

    @Test
    void testCircularShift() {
        assertEquals("[11, " + (11 << shift) + "]",  new CircularShift().circularShift(11, (9 << shift)));
        assertEquals("[10, " + (10 << shift) + "]",  new CircularShift().circularShift(10, (8 << shift)));
        assertEquals("[97, 8]",  new CircularShift().circularShift(97, 8));
        assertEquals("[99, 9]",  new CircularShift().circularShift(99, 9));
        assertEquals("[78, 1]",  new CircularShift().circularShift(78, 1));
        assertEquals("[76, 101]",  new CircularShift().circularShift(76, 101));
        assertEquals("[11, " + (12 << (shift - 1)) + "]",  new CircularShift().circularShift(11, (12 << (shift - 1))));
    }
}

// Test {@link CircularShift#circularShift(int, int)}.
class CircularShiftTester {
	
    @Test
    void testCircularShift1() {
        // [11, "1"] is not a proper solution, but is needed for test case 9.
        assertEquals("[11, " + (2 << shift) + "]",
                 new CircularShift().circularShift(11, (2 << shift)));
    }
    
    @Test
    void testCircularShift2() {
        assertEquals("[78, 101]", new CircularShift().circularShift(78, 100));
        try { assertEquals("[]", new CircularShift().circularShift("[78, 103]", 2)); } catch (IllegalArgumentException ex) { Assert.fail("" + ex); }
//    }
}

class ArithmeticDivider {

    /**
     * Division will be performed by adding the carry to the most significant "digit" from the value of x.
     * Then, the carry of the first digit is removed from the most significant "digit" from the value of x.
     * The result of the result should be equal to the original x plus the carry.
     * If the argument does not belong to the sum, the result is returned as the original value.
     *
     * 1. Add carry (11 = "1") to the carry of the first digit.
     * 2. Add carry (101 = "99") to the carry of the first digit.
     * 3. Remove carry (1 = "11") from the most significant digits of "x".
     * 4. Add carry (0 = "12") to the carry of the second digit.
     * 5. Add carry (100 = "99") to the carry of the second digit.
     *
     * > divideAddC(101, 0)
     * 11
     * > divideAddC(101, 100)
     * 99
     * > divideAddC(101, 101)
     * 11
     *
     * @param a
     * @param b
     * @return the most significant digit which can be added to x plus the carry.
     */
    public static String divideAddC(int a, int b) {
	a -= 1;
	if (b == 0) return "99";
	return String.valueOf(a << (a >> (b >> 1)));
    }
    
    /**
     * The result of the divide by x + b will be equal to the value x divided by b.
     * If argument x is less than zero, x cannot divided (ie "0".
     * If argument x is larger than 1, x cannot divided (ie "1".
     */
    public static String divideDivided(int x, int b) {
        x += b;
        if (b < 0) return "";
        return x / b;
    }
    
    /**
     * "0" will be returned if x <= 0 or x + b == 0.
     *
     * @param a
     * @return the divisor.
     */
    public static int divideByZero(int a) {
        return (a + 3) >> 2;
    }
}