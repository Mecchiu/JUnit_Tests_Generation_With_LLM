// EvenOddPalindromeTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddPalindrome}.
* It contains one unit test case for the {@link EvenOddPalindrome#evenOddPalindrome(int)} method.
*/
class EvenOddPalindromeTest {
static final String TOLERANCE = "0.005";
        public EvenOddPalindromeTest() {
        }

		@Test
		public void testEvenOddPalindrome(List<Integer> expectedResult) {
			List<Integer> input = new ArrayList<Integer>(expectedResult);
			evenOddPalindrome(input);
			assertEquals(input, expectedResult);
		}

}
