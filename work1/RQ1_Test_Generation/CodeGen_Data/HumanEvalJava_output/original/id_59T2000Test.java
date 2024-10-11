// LargestPrimeFactorTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains one unit test case for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {
private LargestPrimeFactor t = new LargestPrimeFactor();

		/**
		* Tests for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
		*/
		@Test
		void testForLargestPrimeFactor() {
			assertEquals("Invalid largest prime test results.", t.largestPrimeFactor(2048), 8059328917, 100.000001);
			assertEquals("Invalid largest prime test results.", t.largestPrimeFactor(27), 123829097, 100.000001);
			assertEquals("Invalid largest prime test results.", t.largestPrimeFactor(63), 1338956935, 100.000001);
			assertEquals("Invalid largest prime test results.", t.largestPrimeFactor(330), 3118993761, 100.000001);
		}
}