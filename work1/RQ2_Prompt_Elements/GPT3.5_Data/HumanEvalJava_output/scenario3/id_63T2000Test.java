// Fibfib.java
package scenario3;

class Fibfib {

    /**
     * The FibFib number sequence is a sequence similar to the Fibbonacci sequence that's defined as follows:
     * fibfib(0) == 0
     * fibfib(1) == 0
     * fibfib(2) == 1
     * fibfib(n) == fibfib(n-1) + fibfib(n-2) + fibfib(n-3).
     * Please write a function to efficiently compute the n-th element of the fibfib number sequence.
     *
     * > fibfib(2)
     * 1
     * > fibfib(1)
     * 0
     * > fibfib(5)
     * 4
     * > fibfib(8)
     * 24
     * > fibfib(10)
     * 81
     * > fibfib(12)
     * 274
     * > fibfib(14)
     * 927
     */
    public static int fibfib(int n) {
        if (n == 0 || n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            int[] fib = new int[n + 1];
            fib[0] = 0;
            fib[1] = 0;
            fib[2] = 1;
            for (int i = 3; i <= n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2] + fib[i - 3];
            }
            return fib[n];
        }
    }
}

// FibfibTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fibfib}.
* It contains ten unit test cases for the {@link Fibfib#fibfib(int)} method.
*/
class FibfibTest {
    @Test
    void testFibfib0() {
        assertEquals(0, Fibfib.fibfib(0));
    }

    @Test
    void testFibfib1() {
        assertEquals(0, Fibfib.fibfib(1));
    }

    @Test
    void testFibfib2() {
        assertEquals(1, Fibfib.fibfib(2));
    }

    @Test
    void testFibfib3() {
        assertEquals(1, Fibfib.fibfib(3));
    }

    @Test
    void testFibfib4() {
        assertEquals(2, Fibfib.fibfib(4));
    }

    @Test
    void testFibfib5() {
        assertEquals(4, Fibfib.fibfib(5));
    }

    @Test
    void testFibfib6() {
        assertEquals(9, Fibfib.fibfib(6));
    }

    @Test
    void testFibfib7() {
        assertEquals(20, Fibfib.fibfib(7));
    }

    @Test
    void testFibfib8() {
        assertEquals(24, Fibfib.fibfib(8));
    }

    @Test
    void testFibfib9() {
        assertEquals(81, Fibfib.fibfib(10));
    }
}