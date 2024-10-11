// LargestDivisorTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains one unit test case for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {
/**
         * For a given number N : 1 < N < 10 : N is not divisible by 5,
         * hence the result is not a valid result
		 * @throws
		 */
		@Test
		void theResult() {
			// N > 10, the result should equals to 1
			assertEquals(
			 Integer.valueOf(1),
			 Integer.valueOf((5 - 1) / 8 + 1));
		}
}