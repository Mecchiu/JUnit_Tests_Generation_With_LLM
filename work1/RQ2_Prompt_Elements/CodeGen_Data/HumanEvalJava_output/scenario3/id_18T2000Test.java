// HowManyTimesTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HowManyTimes}.
* It contains one unit test case for the {@link HowManyTimes#howManyTimes(String, String)} method.
*/
class HowManyTimesTest {

	@Test
	void test() {
		// Given
		String input = "hello, how are you";

		// When & When
		int howManyTimes = HowManyTimes.howManyTimes(input, "how are you");
		int howManyTimes2 = HowManyTimes.howManyTimes(input, "how do you");
		int howManyTimes3 = HowManyTimes.howManyTimes(input, "how do you", "how do you");
		int howManyTimes4 = HowManyTimes.howManyTimes(input, "how do you", "how do you", 0);
		
		// Then
		assertEquals(input, howManyTimes, "Failed with a different number of calls, so they should match.");
		assertEquals(input, howManyTimes2, "Failed with a different number of calls, so they should match.");
		assertEquals(input, howManyTimes3, "Failed with a different number of calls, so they should match.");
		assertEquals(input, howManyTimes4, "Failed with a different number of calls, so they should match.");

	}

}
