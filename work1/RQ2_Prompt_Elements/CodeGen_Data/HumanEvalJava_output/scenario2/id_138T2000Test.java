// IsEqualToSumEvenTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsEqualToSumEven}.
* It contains one unit test case for the {@link IsEqualToSumEven#isEqualToSumEven(int)} method.
*/
class IsEqualToSumEvenTest {
/**
		 * Initialize the test
		 */
		public IsEqualToSumEvenTest() {
		}

		/**
		 * Execute the test
		 */
		@Test
		public final void test() {
				int sum = 0;
				assertEquals(0, ((int) (IsEqualToSumEven.isEqualToSumEven(1))));
		}


}