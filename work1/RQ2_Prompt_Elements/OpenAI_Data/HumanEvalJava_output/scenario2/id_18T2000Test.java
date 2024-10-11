// HowManyTimesTest.java
package scenario2;


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
        assertEquals(0, HowManyTimes.howManyTimes("", ""));
    }

    // Test case 2: Test with empty string and non-empty substring
    @Test
    void testEmptyStringAndNonEmptySubstring() {
        assertEquals(0, HowManyTimes.howManyTimes("", "a"));
    }

    // Test case 3: Test with non-empty string and empty substring
    @Test
    void testNonEmptyStringAndEmptySubstring() {
        assertEquals(0, HowManyTimes.howManyTimes("a", ""));
    }

    // Test case 4: Test with non-empty string and substring that does not exist in the string
    @Test
    void testNonEmptyStringAndSubstringNotExist() {
        assertEquals(0, HowManyTimes.howManyTimes("a", "b"));
    }

    // Test case 5: Test with non-empty string and substring that exists in the string once
    @Test
    void testNonEmptyStringAndSubstringExistOnce() {
        assertEquals(1, HowManyTimes.howManyTimes("a", "a"));
    }

    // Test case 6: Test with non-empty string and substring that exists in the string more than once
    @Test
    void testNonEmptyStringAndSubstringExistMoreThanOnce() {
        assertEquals(2, HowManyTimes.howManyTimes("aba", "a"));
    }

    // Test case 7: Test with non-empty string and substring that exists in the string more than once with overlapping
    @Test
    void testNonEmptyStringAndSubstringExistMoreThanOnceWithOverlapping() {
        assertEquals(2, HowManyTimes.howManyTimes("ababa", "aba"));
    }

    // Test case 8: Test with non-empty string and substring that exists in the string more than once without overlapping
    @Test
    void testNonEmptyStringAndSubstringExistMoreThanOnceWithoutOverlapping() {
        assertEquals(2, HowManyTimes.howManyTimes("abab", "ab"));
    }

    // Test case 9: Test with non-empty string and substring that exists in the string more than once with overlapping
    @Test
    void testNonEmptyStringAndSubstringExistMoreThanOnceWithOverlapping2() {
        assertEquals(3, HowManyTimes.howManyTimes("ababab", "aba"));
    }

    // Test case 10: Test with non-empty string and substring that exists in the string more than once without overlapping
    @Test
    void testNonEmptyStringAndSubstringExistMoreThanOnceWithoutOverlapping2() {
        assertEquals(3, HowManyTimes.howManyTimes("ababab", "ab"));
    }
}
