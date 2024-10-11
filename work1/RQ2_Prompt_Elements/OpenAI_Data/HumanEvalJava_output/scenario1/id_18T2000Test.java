// HowManyTimesTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HowManyTimes}.
* It contains ten unit test cases for the {@link HowManyTimes#howManyTimes(String, String)} method.
*/
class HowManyTimesTest {
	// Test case 1: Test with empty string and empty substring
			@Test
			void testEmptyStringAndEmptySubstring() {
				int expected = 0;
				int actual = HowManyTimes.howManyTimes("", "");
				assertEquals(expected, actual);
			}
			
			// Test case 2: Test with empty string and non-empty substring
			@Test
			void testEmptyStringAndNonEmptySubstring() {
				int expected = 0;
				int actual = HowManyTimes.howManyTimes("", "a");
				assertEquals(expected, actual);
			}
			
			// Test case 3: Test with non-empty string and empty substring
			@Test
			void testNonEmptyStringAndEmptySubstring() {
				int expected = 0;
				int actual = HowManyTimes.howManyTimes("abc", "");
				assertEquals(expected, actual);
			}
			
			// Test case 4: Test with string and substring that do not match
			@Test
			void testNoMatch() {
				int expected = 0;
				int actual = HowManyTimes.howManyTimes("abc", "d");
				assertEquals(expected, actual);
			}
			
			// Test case 5: Test with string and substring that match once
			@Test
			void testMatchOnce() {
				int expected = 1;
				int actual = HowManyTimes.howManyTimes("abc", "a");
				assertEquals(expected, actual);
			}
			
			// Test case 6: Test with string and substring that match multiple times
			@Test
			void testMatchMultipleTimes() {
				int expected = 3;
				int actual = HowManyTimes.howManyTimes("ababab", "ab");
				assertEquals(expected, actual);
			}
			
			// Test case 7: Test with string and substring that match at the beginning
			@Test
			void testMatchAtBeginning() {
				int expected = 1;
				int actual = HowManyTimes.howManyTimes("abc", "ab");
				assertEquals(expected, actual);
			}
			
			// Test case 8: Test with string and substring that match at the end
			@Test
			void testMatchAtEnd() {
				int expected = 1;
				int actual = HowManyTimes.howManyTimes("abc", "bc");
				assertEquals(expected, actual);
			}
			
			// Test case 9: Test with string and substring that match multiple times with overlapping
			@Test
			void testMatchWithOverlapping() {
				int expected = 2;
				int actual = HowManyTimes.howManyTimes("ababab", "aba");
				assertEquals(expected, actual);
			}
			
			// Test case 10: Test with string and substring that match multiple times with same characters
			@Test
			void testMatchWithSameCharacters() {
				int expected = 3;
				int actual = HowManyTimes.howManyTimes("aaaaa", "aa");
				assertEquals(expected, actual);
			}
}