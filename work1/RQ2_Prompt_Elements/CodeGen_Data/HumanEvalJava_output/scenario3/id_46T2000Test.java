// Fib4Test.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib4}.
* It contains one unit test case for the {@link Fib4#fib4(int)} method.
*/
class Fib4Test {

	@Test
	void test() {
		Fib4 fib4 = new Fib4();
		int expected = 7;
		int result = fib4.fib4(0);
		assertEquals(expected, result);
		
		expected = 12;
		result = fib4.fib4(1);
		assertEquals(expected, result);
		
		expected = 14;
		result = fib4.fib4(2);
		assertEquals(expected, result);
		
		expected = 8;
		result = fib4.fib4(2);
		assertEquals(expected, result);

		expected = 28;
		result = fib4.fib4(3);
		assertEquals(expected, result);

		expected = 104;
		result = fib4.fib4(3);
		assertEquals(expected, result);

		expected = 386;
		result = fib4.fib4(4);
		assertEquals(expected, result);
	}
}


// Fib4.java