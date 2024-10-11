// Modp.java
package scenario3;

class Modp {

    /**
     * Return 2^n modulo p (be aware of numerics).
     * >>> modp(3, 5)
     * 3
     * >>> modp(1101, 101)
     * 2
     * >>> modp(0, 101)
     * 1
     * >>> modp(3, 11)
     * 8
     * >>> modp(100, 101)
     * 1
     * > modp(3, 5)
     * 3
     * > modp(1101, 101)
     * 2
     * > modp(0, 101)
     * 1
     * > modp(3, 11)
     * 8
     * > modp(100, 101)
     * 1
     * > modp(30, 5)
     * 4
     * > modp(31, 5)
     * 3
     */
    public static int modp(int n, int p) {
        if (p == 1) {
            return 0;
        }
        int result = 1;
        n = n % p;
        while (p > 0) {
            if ((p & 1) == 1) {
                result = (result * n) % p;
            }
            p = p >> 1;
            n = (n * n) % p;
        }
        return result;
    }
}

// ModpTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Modp}.
* It contains ten unit test cases for the {@link Modp#modp(int, int)} method.
*/
class ModpTest {
    @Test
    void testModp1() {
        assertEquals(3, Modp.modp(3, 5));
    }

    @Test
    void testModp2() {
        assertEquals(2, Modp.modp(1101, 101));
    }

    @Test
    void testModp3() {
        assertEquals(1, Modp.modp(0, 101));
    }

    @Test
    void testModp4() {
        assertEquals(8, Modp.modp(3, 11));
    }

    @Test
    void testModp5() {
        assertEquals(1, Modp.modp(100, 101));
    }

    @Test
    void testModp6() {
        assertEquals(4, Modp.modp(30, 5));
    }

    @Test
    void testModp7() {
        assertEquals(3, Modp.modp(31, 5));
    }

    @Test
    void testModp8() {
        assertEquals(0, Modp.modp(0, 1));
    }

    @Test
    void testModp9() {
        assertEquals(0, Modp.modp(0, 2));
    }

    @Test
    void testModp10() {
        assertEquals(0, Modp.modp(0, 3));
    }
}