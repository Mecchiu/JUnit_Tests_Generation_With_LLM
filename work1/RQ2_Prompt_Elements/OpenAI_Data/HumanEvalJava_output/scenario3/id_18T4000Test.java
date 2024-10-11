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
	void testHowManyTimes_EmptyString_EmptySubstring() {
		assertEquals(0, HowManyTimes.howManyTimes("", ""));
	}
	
	@Test
	void testHowManyTimes_EmptyString_NonEmptySubstring() {
		assertEquals(0, HowManyTimes.howManyTimes("", "a"));
	}
	
	@Test
	void testHowManyTimes_NonEmptyString_EmptySubstring() {
		assertEquals(0, HowManyTimes.howManyTimes("a", ""));
	}
	
	@Test
	void testHowManyTimes_NonEmptyString_NonEmptySubstring() {
		assertEquals(3, HowManyTimes.howManyTimes("aaa", "a"));
	}
	
	@Test
	void testHowManyTimes_NonEmptyString_NonEmptySubstring_Overlapping() {
		assertEquals(3, HowManyTimes.howManyTimes("aaaa", "aa"));
	}
	
	@Test
	void testHowManyTimes_NonEmptyString_NonEmptySubstring_NotFound() {
		assertEquals(0, HowManyTimes.howManyTimes("xyxyxyx", "x"));
	}
	
	@Test
	void testHowManyTimes_NonEmptyString_NonEmptySubstring_Found() {
		assertEquals(4, HowManyTimes.howManyTimes("cacacacac", "cac"));
	}
	
	@Test
	void testHowManyTimes_NonEmptyString_NonEmptySubstring_Found_Overlapping() {
		assertEquals(1, HowManyTimes.howManyTimes("john doe", "john"));
	}
	
	@Test
	void testHowManyTimes_NonEmptyString_NonEmptySubstring_Found_Overlapping_CaseSensitive() {
		assertEquals(1, HowManyTimes.howManyTimes("john doe", "John"));
	}
	
	@Test
	void testHowManyTimes_NonEmptyString_NonEmptySubstring_Found_Overlapping_CaseSensitive_2() {
		assertEquals(1, HowManyTimes.howManyTimes("john doe", "doe"));
	}
}