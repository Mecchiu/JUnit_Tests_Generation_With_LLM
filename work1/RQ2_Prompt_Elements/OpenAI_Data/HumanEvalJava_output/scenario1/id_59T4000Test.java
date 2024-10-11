// LargestPrimeFactorTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains ten unit test cases for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {

	@Test
	void testLargestPrimeFactor() {
		assertEquals(29, LargestPrimeFactor.largestPrimeFactor(13195));
		assertEquals(6857, LargestPrimeFactor.largestPrimeFactor(600851475143));
		assertEquals(5, LargestPrimeFactor.largestPrimeFactor(5));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(4));
		assertEquals(3, LargestPrimeFactor.largestPrimeFactor(6));
		assertEquals(5, LargestPrimeFactor.largestPrimeFactor(10));
		assertEquals(7, LargestPrimeFactor.largestPrimeFactor(14));
		assertEquals(11, LargestPrimeFactor.largestPrimeFactor(22));
		assertEquals(13, LargestPrimeFactor.largestPrimeFactor(26));
	}
}