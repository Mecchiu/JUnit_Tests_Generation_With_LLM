// HowManyTimesTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HowManyTimes}.
* It contains ten unit test cases for the {@link HowManyTimes#howManyTimes(String, String)} method.
*/
class HowManyTimesTest {
	@Test
			void testEmptyString() {
				assertEquals(0, HowManyTimes.howManyTimes("", "a"));
			}

			@Test
			void testEmptySubstring() {
				assertEquals(0, HowManyTimes.howManyTimes("aaa", ""));
			}

			@Test
			void testEmptyBoth() {
				assertEquals(0, HowManyTimes.howManyTimes("", ""));
			}

			@Test
			void testOneChar() {
				assertEquals(3, HowManyTimes.howManyTimes("aaa", "a"));
			}

			@Test
			void testTwoChars() {
				assertEquals(3, HowManyTimes.howManyTimes("aaaa", "aa"));
			}

			@Test
			void testNoMatch() {
				assertEquals(0, HowManyTimes.howManyTimes("", "x"));
			}

			@Test
			void testOverlapping() {
				assertEquals(4, HowManyTimes.howManyTimes("xyxyxyx", "x"));
			}

			@Test
			void testOverlapping2() {
				assertEquals(4, HowManyTimes.howManyTimes("cacacacac", "cac"));
			}

			@Test
			void testOneMatch() {
				assertEquals(1, HowManyTimes.howManyTimes("john doe", "john"));
			}

			@Test
			void testNoMatch2() {
				assertEquals(0, HowManyTimes.howManyTimes("john doe", "jane"));
			}
}
