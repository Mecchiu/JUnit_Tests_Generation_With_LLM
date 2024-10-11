// Here's the source code for the Fib4Test class with ten unit test cases for the fib4 method.

package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Fib4Test {

    @Test
    void testFib4WithZero() {
        assertEquals(0, Fib4.fib4(0));
    }

    @Test
    void testFib4WithOne() {
        assertEquals(0, Fib4.fib4(1));
    }

    @Test
    void testFib4WithTwo() {
        assertEquals(2, Fib4.fib4(2));
    }

    @Test
    void testFib4WithThree() {
        assertEquals(0, Fib4.fib4(3));
    }

    @Test
    void testFib4WithFour() {
        assertEquals(2, Fib4.fib4(4));
    }

    @Test
    void testFib4WithFive() {
        assertEquals(6, Fib4.fib4(5));
    }

    @Test
    void testFib4WithSix() {
        assertEquals(14, Fib4.fib4(6));
    }

    @Test
    void testFib4WithSeven() {
        assertEquals(32, Fib4.fib4(7));
    }

    @Test
    void testFib4WithEight() {
        assertEquals(72, Fib4.fib4(8));
    }

    @Test
    void testFib4WithNine() {
        assertEquals(162, Fib4.fib4(9));
    }
}