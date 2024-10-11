// Here's the implementation of the Simplify class and the test cases for the simplify method.

// Simplify.java
package scenario3;

class Simplify {

    /**
     * Your task is to implement a function that will simplify the expression
     * x * n. The function returns True if x * n evaluates to a whole number and False
     * otherwise. Both x and n, are string representation of a fraction, and have the following format,
     * <numerator>/<denominator> where both numerator and denominator are positive whole numbers.
     *
     * You can assume that x, and n are valid fractions, and do not have zero as denominator.
     *
     * simplify("1/5", "5/1") = True
     * simplify("1/6", "2/1") = False
     * simplify("7/10", "10/2") = False
     *
     * > simplify("1/5", "5/1")
     * true
     * > simplify("1/6", "2/1")
     * false
     * > simplify("5/1", "3/1")
     * true
     * > simplify("7/10", "10/2")
     * false
     * > simplify("2/10", "50/10")
     * true
     * > simplify("7/2", "4/2")
     * true
     * > simplify("11/6", "6/1")
     * true
     * > simplify("2/3", "5/2")
     * false
     * > simplify("5/2", "3/5")
     * false
     * > simplify("2/4", "8/4")
     * true
     * > simplify("2/4", "4/2")
     * true
     * > simplify("1/5", "5/1")
     * true
     * > simplify("1/5", "1/5")
     * false
     */
    public static Boolean simplify(String x, String n) {
        String[] xParts = x.split("/");
        String[] nParts = n.split("/");

        int xNumerator = Integer.parseInt(xParts[0]);
        int xDenominator = Integer.parseInt(xParts[1]);
        int nNumerator = Integer.parseInt(nParts[0]);
        int nDenominator = Integer.parseInt(nParts[1]);

        int numerator = xNumerator * nNumerator;
        int denominator = xDenominator * nDenominator;

        int gcd = gcd(numerator, denominator);

        numerator /= gcd;
        denominator /= gcd;

        return denominator == 1;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

// SimplifyTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Simplify}.
* It contains ten unit test cases for the {@link Simplify#simplify(String, String)} method.
*/
class SimplifyTest {

    @Test
    void testSimplify1() {
        assertTrue(Simplify.simplify("1/5", "5/1"));
    }

    @Test
    void testSimplify2() {
        assertFalse(Simplify.simplify("1/6", "2/1"));
    }

    @Test
    void testSimplify3() {
        assertTrue(Simplify.simplify("5/1", "3/1"));
    }

    @Test
    void testSimplify4() {
        assertFalse(Simplify.simplify("7/10", "10/2"));
    }

    @Test
    void testSimplify5() {
        assertTrue(Simplify.simplify("2/10", "50/10"));
    }

    @Test
    void testSimplify6() {
        assertTrue(Simplify.simplify("7/2", "4/2"));
    }

    @Test
    void testSimplify7() {
        assertTrue(Simplify.simplify("11/6", "6/1"));
    }

    @Test
    void testSimplify8() {
        assertFalse(Simplify.simplify("2/3", "5/2"));
    }

    @Test
    void testSimplify9() {
        assertFalse(Simplify.simplify("5/2", "3/5"));
    }

    @Test
    void testSimplify10() {
        assertTrue(Simplify.simplify("2/4", "8/4"));
    }

    @Test
    void testSimplify11() {
        assertTrue(Simplify.simplify("2/4", "4/2"));
    }

    @Test
    void testSimplify12() {
        assertTrue(Simplify.simplify("1/5", "5/1"));
    }

    @Test
    void testSimplify13() {
        assertFalse(Simplify.simplify("1/5", "1/5"));
    }
}