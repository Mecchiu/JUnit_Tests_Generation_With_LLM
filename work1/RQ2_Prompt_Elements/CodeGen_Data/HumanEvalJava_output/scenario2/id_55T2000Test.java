// FibTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib}.
* It contains one unit test case for the {@link Fib#fib(int)} method.
*/
class FibTest {

    /**
     * Test method for next.
     */
    @Test
    public void testNext() {
        Fib f = new Fib(10);
        assertEquals("0", f.next());
        assertEquals("1", f.next());
        assertEquals("2", f.next());
        assertEquals("3", f.next());
        assertEquals("4", f.next());
        assertEquals("5", f.next());
        assertEquals("6", f.next());
        assertEquals("7", f.next());
        assertEquals("8", f.next());
        assertEquals("9", f.next());
        assertEquals("10", f.next());
    }
}
