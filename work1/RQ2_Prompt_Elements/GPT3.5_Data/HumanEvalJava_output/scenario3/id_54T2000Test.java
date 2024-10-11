// SameChars.java
package scenario3;

import java.util.HashMap;

class SameChars {

    /**
     * Check if two words have the same characters.
     *
     * > sameChars("abcd", "dddddddabce")
     * false
     * > sameChars("eabcdzzzz", "dddzzzzzzzddeddabc")
     * true
     * > sameChars("abcd", "dddddddabc")
     * true
     * > sameChars("dddddddabc", "abcd")
     * true
     * > sameChars("eabcd", "dddddddabc")
     * false
     * > sameChars("abcd", "dddddddabcf")
     * false
     * > sameChars("eabcdzzzz", "dddzzzzzzzddddabc")
     * false
     * > sameChars("aabb", "aaccc")
     * false
     */
    public static Boolean sameChars(String s0, String s1) {
        if (s0.length() != s1.length()) {
            return false;
        }
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s0.length(); i++) {
            char c = s0.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (!charCount.containsKey(c)) {
                return false;
            }
            int count = charCount.get(c);
            if (count == 1) {
                charCount.remove(c);
            } else {
                charCount.put(c, count - 1);
            }
        }
        return true;
    }
}

// SameCharsTest.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SameChars}.
* It contains ten unit test cases for the {@link SameChars#sameChars(String, String)} method.
*/
class SameCharsTest {

    @Test
    void testSameChars1() {
        assertFalse(SameChars.sameChars("abcd", "dddddddabce"));
    }

    @Test
    void testSameChars2() {
        assertTrue(SameChars.sameChars("eabcdzzzz", "dddzzzzzzzddeddabc"));
    }

    @Test
    void testSameChars3() {
        assertTrue(SameChars.sameChars("abcd", "dddddddabc"));
    }

    @Test
    void testSameChars4() {
        assertTrue(SameChars.sameChars("dddddddabc", "abcd"));
    }

    @Test
    void testSameChars5() {
        assertFalse(SameChars.sameChars("eabcd", "dddddddabc"));
    }

    @Test
    void testSameChars6() {
        assertFalse(SameChars.sameChars("abcd", "dddddddabcf"));
    }

    @Test
    void testSameChars7() {
        assertFalse(SameChars.sameChars("eabcdzzzz", "dddzzzzzzzddddabc"));
    }

    @Test
    void testSameChars8() {
        assertFalse(SameChars.sameChars("aabb", "aaccc"));
    }

    @Test
    void testSameChars9() {
        assertTrue(SameChars.sameChars("", ""));
    }

    @Test
    void testSameChars10() {
        assertFalse(SameChars.sameChars("abcd", "abcc"));
    }
}