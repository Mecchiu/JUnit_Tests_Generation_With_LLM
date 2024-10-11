// LargestPrimeFactorTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains one unit test case for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {
/**
		 * @test case for {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
		 * Test method for the {@link LargestPrimeFactor#largestPrimeFactor} method.
		 * <p />
		 * The actual result is 1.
		 *
		 * @throws Exception if an error occurs in the creation of a fixture.
		 */
		@Test
		public void testBiggerInteger() throws Exception {
				int result = LargestPrimeFactor.largestPrimeFactor(4);
				final int resultExpected = -1;
				assertEquals("Result does not match expected result", result, resultExpected);
		}
		/**
		 * @testCase
		 * Bigger Integer.
		 * Test method for the {@link LargestPrimeFactor#largestPrimeFactor} method.
		 * <p />
		 * The actual result is 1.
		 *
		 * @throws Exception if an error occurs in the creation of a fixture.
		 */
		@Test
		public void testBiggerByte() throws Exception {
				int result = LargestPrimeFactor.largestPrimeFactor(4294967296);
				final int resultExpected = 1;
				assertEquals("Result does not match expected result", result, resultExpected);
		}
		/**
		 * @testCase
		 * Bigger Byte.
		 * Test method for the {@link LargestPrimeFactor#largestPrimeFactor} method.
		 * <p />
		 * The actual result is 1.
		 *
		 * @throws Exception if an error occurs in the creation of a fixture.
		 */
		@Test
		public void testBiggerShort() throws Exception {
				int result = LargestPrimeFactor.largestPrimeFactor(16777216);
				final int resultExpected = 2;
				assertEquals("Result does not match expected result", result, resultExpected);
		}
}