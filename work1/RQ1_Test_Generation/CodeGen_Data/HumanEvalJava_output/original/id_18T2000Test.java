// HowManyTimesTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HowManyTimes}.
* It contains one unit test case for the {@link HowManyTimes#howManyTimes(String, String)} method.
*/
class HowManyTimesTest {
@Test
		void howManyTimesReturnsCorrectValue() {
			assertEquals(HowManyTimes.howManyTimes("abcdefg", "z"), 2);
		}
}