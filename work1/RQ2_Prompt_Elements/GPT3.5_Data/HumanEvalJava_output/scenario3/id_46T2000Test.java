// Fib4.java
package scenario3;

class Fib4 {

    /**
     * The Fib4 number sequence is a sequence similar to the Fibbonacci sequence that's defined as follows:
     * fib4(0) -> 0
     * fib4(1) -> 0
     * fib4(2) -> 2
     * fib4(3) -> 0
     * fib4(n) -> fib4(n-1) + fib4(n-2) + fib4(n-3) + fib4(n-4).
     * Please write a function to efficiently compute the n-th element of the fib4 number sequence.  Do not use recursion.
     *
     * > fib4(5)
     * 4
     * > fib4(6)
     * 8
     * > fib4(7)
     * 14
     * > fib4(5)
     * 4
     * > fib4(8)
     * 28
     * > fib4(10)
     * 104
     * > fib4(12)
     * 386
     */
    public static int fib4(int n) {
        if (n == 0 || n == 1) {
            return 0;
        } else if (n == 2) {
            return 2;
        } else if (n == 3) {
            return 0;
        } else {
            int[] fib = new int[n + 1];
            fib[0] = 0;
            fib[1] = 0;
            fib[2] = 2;
            fib[3] = 0;
            for (int i = 4; i <= n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2] + fib[i - 3] + fib[i - 4];
            }
            return fib[n];
        }
    }
}

// Fib4Test.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib4}.
* It contains ten unit test cases for the {@link Fib4#fib4(int)} method.
*/
class Fib4Test {
    @Test
    void testFib4_0() {
        assertEquals(0, Fib4.fib4(0));
    }

    @Test
    void testFib4_1() {
        assertEquals(0, Fib4.fib4(1));
    }

    @Test
    void testFib4_2() {
        assertEquals(2, Fib4.fib4(2));
    }

    @Test
    void testFib4_3() {
        assertEquals(0, Fib4.fib4(3));
    }

    @Test
    void testFib4_4() {
        assertEquals(2, Fib4.fib4(4));
    }

    @Test
    void testFib4_5() {
        assertEquals(4, Fib4.fib4(5));
    }

    @Test
    void testFib4_6() {
        assertEquals(8, Fib4.fib4(6));
    }

    @Test
    void testFib4_7() {
        assertEquals(14, Fib4.fib4(7));
    }

    @Test
    void testFib4_8() {
        assertEquals(28, Fib4.fib4(8));
    }

    @Test
    void testFib4_9() {
        assertEquals(52, Fib4.fib4(9));
    }
}