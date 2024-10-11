// IsMultiplyPrimeTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsMultiplyPrime}.
* It contains one unit test case for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
*/
class IsMultiplyPrimeTest {

	/**
	 * Test method for {@link IsMultiplyPrime#isMultiplyPrime(int)}.
	 */
	@Test
	public void test() {
		assertTrue(new IsMultiplyPrime().isMultiplyPrime(3));
	}
}

// IsMultiplyPrimeTest1.java
