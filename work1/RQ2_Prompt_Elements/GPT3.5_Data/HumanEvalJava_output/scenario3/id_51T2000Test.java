// RemoveVowels.java
package scenario3;

class RemoveVowels {

    /**
     * removeVowels is a function that takes string and returns string without vowels.
     *
     * > removeVowels("abcdef")
     * "bcdf"
     * > removeVowels("aaaaa")
     * ""
     * > removeVowels("aaBAA")
     * "B"
     * > removeVowels("zbcd")
     * "zbcd"
     * > removeVowels("")
     * ""
     * > removeVowels("abcdef\nghijklm")
     * "bcdf\nghjklm"
     * > removeVowels("fedcba")
     * "fdcb"
     * > removeVowels("eeeee")
     * ""
     * > removeVowels("acBAA")
     * "cB"
     * > removeVowels("EcBOO")
     * "cB"
     * > removeVowels("ybcd")
     * "ybcd"
     */
    public static String removeVowels(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (!isVowel(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}

// RemoveVowelsTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains ten unit test cases for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {

    @Test
    void testRemoveVowels1() {
        assertEquals("bcdf", RemoveVowels.removeVowels("abcdef"));
    }

    @Test
    void testRemoveVowels2() {
        assertEquals("", RemoveVowels.removeVowels("aaaaa"));
    }

    @Test
    void testRemoveVowels3() {
        assertEquals("B", RemoveVowels.removeVowels("aaBAA"));
    }

    @Test
    void testRemoveVowels4() {
        assertEquals("zbcd", RemoveVowels.removeVowels("zbcd"));
    }

    @Test
    void testRemoveVowels5() {
        assertEquals("", RemoveVowels.removeVowels(""));
    }

    @Test
    void testRemoveVowels6() {
        assertEquals("bcdf\nghjklm", RemoveVowels.removeVowels("abcdef\nghijklm"));
    }

    @Test
    void testRemoveVowels7() {
        assertEquals("fdcb", RemoveVowels.removeVowels("fedcba"));
    }

    @Test
    void testRemoveVowels8() {
        assertEquals("", RemoveVowels.removeVowels("eeeee"));
    }

    @Test
    void testRemoveVowels9() {
        assertEquals("cB", RemoveVowels.removeVowels("acBAA"));
    }

    @Test
    void testRemoveVowels10() {
        assertEquals("cB", RemoveVowels.removeVowels("EcBOO"));
    }

    @Test
    void testRemoveVowels11() {
        assertEquals("ybcd", RemoveVowels.removeVowels("ybcd"));
    }
}