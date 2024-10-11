// FibTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Fib}.
 * It contains ten unit test cases for the {@link Fib#fib(int)} method.
 */
class FibTest {

    @Test
    void testFibonacciZero() {
        assertEquals(0, Fib.fib(0));
    }

    @Test
    void testFibonacciOne() {
        assertEquals(1, Fib.fib(1));
    }

    @Test
    void testFibonacciTwo() {
        assertEquals(1, Fib.fib(2));
    }

    @Test
    void testFibonacciThree() {
        assertEquals(2, Fib.fib(3));
    }

    @Test
    void testFibonacciFour() {
        assertEquals(3, Fib.fib(4));
    }

    @Test
    void testFibonacciFive() {
        assertEquals(5, Fib.fib(5));
    }

    @Test
    void testFibonacciSix() {
        assertEquals(8, Fib.fib(6));
    }

    @Test
    void testFibonacciSeven() {
        assertEquals(13, Fib.fib(7));
    }

    @Test
    void testFibonacciEight() {
        assertEquals(21, Fib.fib(8));
    }

    @Test
    void testFibonacciNine() {
        assertEquals(34, Fib.fib(9));
    }
}