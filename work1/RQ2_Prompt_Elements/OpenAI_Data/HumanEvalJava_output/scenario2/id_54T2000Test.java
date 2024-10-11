// SameCharsTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SameChars}.
* It contains ten unit test cases for the {@link SameChars#sameChars(String, String)} method.
*/
class SameCharsTest {
	// Test case 1: Two empty strings
    @Test
    void testSameChars1() {
        assertTrue(SameChars.sameChars("", ""));
    }

    // Test case 2: Two strings with the same character
    @Test
    void testSameChars2() {
        assertTrue(SameChars.sameChars("a", "a"));
    }

    // Test case 3: Two strings with the same characters
    @Test
    void testSameChars3() {
        assertTrue(SameChars.sameChars("abc", "abc"));
    }

    // Test case 4: Two strings with the same characters but different order
    @Test
    void testSameChars4() {
        assertTrue(SameChars.sameChars("abc", "cba"));
    }

    // Test case 5: Two strings with the same characters but different case
    @Test
    void testSameChars5() {
        assertTrue(SameChars.sameChars("abc", "ABC"));
    }

    // Test case 6: Two strings with the same characters and some other characters
    @Test
    void testSameChars6() {
        assertTrue(SameChars.sameChars("abc", "abc123"));
    }

    // Test case 7: Two strings with the same characters and some other characters
    @Test
    void testSameChars7() {
        assertTrue(SameChars.sameChars("abc123", "abc"));
    }

    // Test case 8: Two strings with the same characters and some other characters
    @Test
    void testSameChars8() {
        assertTrue(SameChars.sameChars("abc123", "123abc"));
    }

    // Test case 9: Two strings with the same characters and some other characters
    @Test
    void testSameChars9() {
        assertTrue(SameChars.sameChars("123abc", "abc123"));
    }

    // Test case 10: Two strings with different characters
    @Test
    void testSameChars10() {
        assertFalse(SameChars.sameChars("abc", "def"));
    }
}
