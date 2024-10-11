// AnyInt.java
package scenario3;

class AnyInt {

    /**
     * * Create a function that takes 3 numbers.
     * Returns true if one of the numbers is equal to the sum of the other two, and all numbers are integers.
     * Returns false in any other cases.
     *
     * Examples
     * anyInt(5, 2, 7) ➞ True
     *
     * anyInt(3, 2, 2) ➞ False
     *
     * anyInt(3, -2, 1) ➞ True
     *
     * anyInt(3.6, -2.2, 2) ➞ False
     *
     * > anyInt(2, 3, 1)
     * true
     * > anyInt(2.5, 2, 3)
     * false
     * > anyInt(1.5, 5, 3.5)
     * false
     * > anyInt(2, 6, 2)
     * false
     * > anyInt(4, 2, 2)
     * true
     * > anyInt(2.2, 2.2, 2.2)
     * false
     * > anyInt(-4, 6, 2)
     * true
     * > anyInt(2, 1, 1)
     * true
     * > anyInt(3, 4, 7)
     * true
     * > anyInt(3.0, 4, 7)
     * false
     */
    public static Boolean anyInt(Number x, Number y, Number z) {
        if (x instanceof Integer && y instanceof Integer && z instanceof Integer) {
            int a = x.intValue();
            int b = y.intValue();
            int c = z.intValue();
            return a == b + c || b == a + c || c == a + b;
        }
        return false;
    }
}

// AnyIntTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AnyInt}.
* It contains ten unit test cases for the {@link AnyInt#anyInt(Number, Number, Number)} method.
*/
class AnyIntTest {
    @Test
    void testAnyInt1() {
        assertTrue(AnyInt.anyInt(5, 2, 7));
    }

    @Test
    void testAnyInt2() {
        assertFalse(AnyInt.anyInt(3, 2, 2));
    }

    @Test
    void testAnyInt3() {
        assertTrue(AnyInt.anyInt(3, -2, 1));
    }

    @Test
    void testAnyInt4() {
        assertFalse(AnyInt.anyInt(3.6, -2.2, 2));
    }

    @Test
    void testAnyInt5() {
        assertTrue(AnyInt.anyInt(2, 3, 1));
    }

    @Test
    void testAnyInt6() {
        assertFalse(AnyInt.anyInt(2.5, 2, 3));
    }

    @Test
    void testAnyInt7() {
        assertFalse(AnyInt.anyInt(1.5, 5, 3.5));
    }

    @Test
    void testAnyInt8() {
        assertFalse(AnyInt.anyInt(2, 6, 2));
    }

    @Test
    void testAnyInt9() {
        assertTrue(AnyInt.anyInt(4, 2, 2));
    }

    @Test
    void testAnyInt10() {
        assertFalse(AnyInt.anyInt(2.2, 2.2, 2.2));
    }

    @Test
    void testAnyInt11() {
        assertTrue(AnyInt.anyInt(-4, 6, 2));
    }

    @Test
    void testAnyInt12() {
        assertTrue(AnyInt.anyInt(2, 1, 1));
    }

    @Test
    void testAnyInt13() {
        assertTrue(AnyInt.anyInt(3, 4, 7));
    }

    @Test
    void testAnyInt14() {
        assertFalse(AnyInt.anyInt(3.0, 4, 7));
    }
}