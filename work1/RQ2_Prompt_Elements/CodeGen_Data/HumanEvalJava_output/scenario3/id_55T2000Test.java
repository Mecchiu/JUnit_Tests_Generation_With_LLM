// FibTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib}.
* It contains one unit test case for the {@link Fib#fib(int)} method.
*/
class FibTest {

	@Test
	void test() throws Exception {
		
		// Numerator.
        Integer n1 = new Integer(1);
        assertEquals(1, Fib.fib(n1));

        // Denominator
        Integer n2 = new Integer(2);
        assertEquals(1, Fib.n-Fib.fib(n2));
        
        // Divisor
        Integer n3 = new Integer(30);
        assertEquals(1, Fib.fib(Fib.fib(n3)));
        
        // Fraction
        assertEquals(n3, Fib.fib(Fib.fib(n2)-Fib.fib(n1)));
        
        // Inversion
        assertEquals(1, Fib.fib(n2)-Fib.fib(n1));

        // Remainder
        assertEquals(1, Fib.fib(n2)-Fib.fib(Fib.fib(n2)-1));
        
	}

}
