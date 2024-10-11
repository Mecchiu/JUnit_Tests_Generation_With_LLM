// Here's the source code for the Fib class and FibTest class with a basic implementation of the fib method and test cases.

// Fib.java
package scenario3;

class Fib {

    /**
     * Return n-th Fibonacci number.
     *
     * > fib(10)
     * 55
     * > fib(1)
     * 1
     * > fib(8)
     * 21
     * > fib(11)
     * 89
     * > fib(12)
     * 144
     */
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}

// FibTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib}.
* It contains ten unit test cases for the {@link Fib#fib(int)} method.
*/
class FibTest {
    
    @Test
    void testFib1() {
        assertEquals(0, Fib.fib(0));
    }
    
    @Test
    void testFib2() {
        assertEquals(1, Fib.fib(1));
    }
    
    @Test
    void testFib3() {
        assertEquals(1, Fib.fib(2));
    }
    
    @Test
    void testFib4() {
        assertEquals(2, Fib.fib(3));
    }
    
    @Test
    void testFib5() {
        assertEquals(3, Fib.fib(4));
    }
    
    @Test
    void testFib6() {
        assertEquals(5, Fib.fib(5));
    }
    
    @Test
    void testFib7() {
        assertEquals(8, Fib.fib(6));
    }
    
    @Test
    void testFib8() {
        assertEquals(13, Fib.fib(7));
    }
    
    @Test
    void testFib9() {
        assertEquals(21, Fib.fib(8));
    }
    
    @Test
    void testFib10() {
        assertEquals(55, Fib.fib(10));
    }
}