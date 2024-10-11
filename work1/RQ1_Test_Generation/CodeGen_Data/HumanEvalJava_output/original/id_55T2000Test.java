// FibTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib}.
* It contains one unit test case for the {@link Fib#fib(int)} method.
*/
class FibTest {
private int[] testArray = { 8, 15, 40, 6, 14 };
		
	 /**
     * Test for the <code>fib(double)</code> method taking a double-parameter.
     * Accuracy is 1E-5.
     * 
     */
    @Test
    void testFib() {
        assertEquals(Double.valueOf(16.666), new Fib().fib(1), 0.00001);
//    assertEquals(Double.valueOf(17), new Fib().fib(0.5), 0.00001);
        assertEquals(Double.valueOf(18), new Fib().fib(1, 0), 0.00001);
//    assertEquals(Double.valueOf(18.0000), new Fib().fib(0.5, 0), 0.00001);
    }
    
	 /**
	 * Test for the <code>fib(double)</code> method returning an array of integers.
	 * 
	 * Accuracy is 1E-5.
	 *
	 */
    @Test
    void testFibFromArray() {
        assertArrayEquals(testArray, new Fib().fib(testArray));
    }
}