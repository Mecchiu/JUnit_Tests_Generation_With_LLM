// SameCharsTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SameChars}.
* It contains ten unit test cases for the {@link SameChars#sameChars(String, String)} method.
*/
class SameCharsTest {
	// Test case 1: s0 = "abc", s1 = "cba"
    @Test
    void testSameChars1() {
        assertTrue(SameChars.sameChars("abc", "cba"));
    }

    // Test case 2: s0 = "a", s1 = "a"
    @Test
    void testSameChars2() {
        assertTrue(SameChars.sameChars("a", "a"));
    }

    // Test case 3: s0 = "ab", s1 = "ba"
    @Test
    void testSameChars3() {
        assertTrue(SameChars.sameChars("ab", "ba"));
    }

    // Test case 4: s0 = "ab", s1 = "ab"
    @Test
    void testSameChars4() {
        assertTrue(SameChars.sameChars("ab", "ab"));
    }

    // Test case 5: s0 = "a", s1 = "b"
    @Test
    void testSameChars5() {
        assertFalse(SameChars.sameChars("a", "b"));
    }

    // Test case 6: s0 = "ab", s1 = "ac"
    @Test
    void testSameChars6() {
        assertFalse(SameChars.sameChars("ab", "ac"));
    }

    // Test case 7: s0 = "ab", s1 = "a"
    @Test
    void testSameChars7() {
        assertFalse(SameChars.sameChars("ab", "a"));
    }

    // Test case 8: s0 = "ab", s1 = "baa"
    @Test
    void testSameChars8() {
        assertFalse(SameChars.sameChars("ab", "baa"));
    }

    // Test case 9: s0 = "ab", s1 = "baaa"
    @Test
    void testSameChars9() {
        assertFalse(SameChars.sameChars("ab", "baaa"));
    }

    // Test case 10: s0 = "ab", s1 = "bba"
    @Test
    void testSameChars10() {
        assertFalse(SameChars.sameChars("ab", "bba"));
    }
}
