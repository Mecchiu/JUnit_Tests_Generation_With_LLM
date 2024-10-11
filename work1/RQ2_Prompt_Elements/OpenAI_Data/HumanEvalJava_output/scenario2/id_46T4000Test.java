// Fib4Test.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib4}.
* It contains ten unit test cases for the {@link Fib4#fib4(int)} method.
*/
class Fib4Test {

	@Test
	void testFib4() {
		assertEquals(0, Fib4.fib4(0));
		assertEquals(0, Fib4.fib4(1));
		assertEquals(2, Fib4.fib4(2));
		assertEquals(0, Fib4.fib4(3));
		assertEquals(2, Fib4.fib4(4));
		assertEquals(4, Fib4.fib4(5));
		assertEquals(6, Fib4.fib4(6));
		assertEquals(10, Fib4.fib4(7));
		assertEquals(16, Fib4.fib4(8));
		assertEquals(26, Fib4.fib4(9));
	}
}