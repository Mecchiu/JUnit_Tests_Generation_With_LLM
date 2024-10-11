// IsSimplePower.java
package scenario3;

class IsSimplePower {

    /**
     * Your task is to write a function that returns true if a number x is a simple
     * power of n and false in other cases.
     * x is a simple power of n if n**int=x
     * For example:
     * isSimplePower(1, 4) => true
     * isSimplePower(2, 2) => true
     * isSimplePower(8, 2) => true
     * isSimplePower(3, 2) => false
     * isSimplePower(3, 1) => false
     * isSimplePower(5, 3) => false
     *
     * > isSimplePower(16, 2)
     * true
     * > isSimplePower(143214, 16)
     * false
     * > isSimplePower(4, 2)
     * true
     * > isSimplePower(9, 3)
     * true
     * > isSimplePower(16, 4)
     * true
     * > isSimplePower(24, 2)
     * false
     * > isSimplePower(128, 4)
     * false
     * > isSimplePower(12, 6)
     * false
     * > isSimplePower(1, 1)
     * true
     * > isSimplePower(1, 12)
     * true
     */
    public static Boolean isSimplePower(int x, int n) {
        if (x == 1) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            int p = i;
            while (p <= x) {
                p *= i;
                if (p == x) {
                    return true;
                }
            }
        }
        return false;
    }
}

// IsSimplePowerTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSimplePower}.
* It contains ten unit test cases for the {@link IsSimplePower#isSimplePower(int, int)} method.
*/
class IsSimplePowerTest {
    @Test
    void testIsSimplePower1() {
        assertTrue(IsSimplePower.isSimplePower(16, 2));
    }

    @Test
    void testIsSimplePower2() {
        assertFalse(IsSimplePower.isSimplePower(143214, 16));
    }

    @Test
    void testIsSimplePower3() {
        assertTrue(IsSimplePower.isSimplePower(4, 2));
    }

    @Test
    void testIsSimplePower4() {
        assertTrue(IsSimplePower.isSimplePower(9, 3));
    }

    @Test
    void testIsSimplePower5() {
        assertTrue(IsSimplePower.isSimplePower(16, 4));
    }

    @Test
    void testIsSimplePower6() {
        assertFalse(IsSimplePower.isSimplePower(24, 2));
    }

    @Test
    void testIsSimplePower7() {
        assertFalse(IsSimplePower.isSimplePower(128, 4));
    }

    @Test
    void testIsSimplePower8() {
        assertFalse(IsSimplePower.isSimplePower(12, 6));
    }

    @Test
    void testIsSimplePower9() {
        assertTrue(IsSimplePower.isSimplePower(1, 1));
    }

    @Test
    void testIsSimplePower10() {
        assertTrue(IsSimplePower.isSimplePower(1, 12));
    }
}