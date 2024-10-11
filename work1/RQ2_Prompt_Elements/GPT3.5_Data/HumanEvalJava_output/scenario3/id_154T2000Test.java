// CycpatternCheck.java
package scenario3;

class CycpatternCheck {

    /**
     * You are given 2 words. You need to return True if the second word or any of its rotations is a substring in the first word
     * cycpatternCheck("abcd","abd") => False
     * cycpatternCheck("hello","ell") => True
     * cycpatternCheck("whassup","psus") => False
     * cycpatternCheck("abab","baa") => True
     * cycpatternCheck("efef","eeff") => False
     * cycpatternCheck("himenss","simen") => True
     *
     * > cycpatternCheck("xyzw", "xyw")
     * false
     * > cycpatternCheck("yello", "ell")
     * true
     * > cycpatternCheck("whattup", "ptut")
     * false
     * > cycpatternCheck("efef", "fee")
     * true
     * > cycpatternCheck("abab", "aabb")
     * false
     * > cycpatternCheck("winemtt", "tinem")
     * true
     */
    public static Boolean cycpatternCheck(String a, String b) {
        if (a == null || b == null || a.length() < b.length()) {
            return false;
        }
        String aDouble = a + a;
        return aDouble.contains(b);
    }
}

// CycpatternCheckTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CycpatternCheck}.
* It contains ten unit test cases for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
*/
class CycpatternCheckTest {
    @Test
    void testCycpatternCheck1() {
        assertFalse(CycpatternCheck.cycpatternCheck("abcd", "abd"));
    }

    @Test
    void testCycpatternCheck2() {
        assertTrue(CycpatternCheck.cycpatternCheck("hello", "ell"));
    }

    @Test
    void testCycpatternCheck3() {
        assertFalse(CycpatternCheck.cycpatternCheck("whassup", "psus"));
    }

    @Test
    void testCycpatternCheck4() {
        assertTrue(CycpatternCheck.cycpatternCheck("abab", "baa"));
    }

    @Test
    void testCycpatternCheck5() {
        assertFalse(CycpatternCheck.cycpatternCheck("efef", "eeff"));
    }

    @Test
    void testCycpatternCheck6() {
        assertTrue(CycpatternCheck.cycpatternCheck("himenss", "simen"));
    }

    @Test
    void testCycpatternCheck7() {
        assertFalse(CycpatternCheck.cycpatternCheck("xyzw", "xyw"));
    }

    @Test
    void testCycpatternCheck8() {
        assertTrue(CycpatternCheck.cycpatternCheck("yello", "ell"));
    }

    @Test
    void testCycpatternCheck9() {
        assertFalse(CycpatternCheck.cycpatternCheck("whattup", "ptut"));
    }

    @Test
    void testCycpatternCheck10() {
        assertTrue(CycpatternCheck.cycpatternCheck("efef", "fee"));
    }

    @Test
    void testCycpatternCheck11() {
        assertFalse(CycpatternCheck.cycpatternCheck("abab", "aabb"));
    }

    @Test
    void testCycpatternCheck12() {
        assertTrue(CycpatternCheck.cycpatternCheck("winemtt", "tinem"));
    }
}