// GetClosestVowel.java
package scenario3;

class GetClosestVowel {

    /**
     * You are given a word. Your task is to find the closest vowel that stands between
     * two consonants from the right side of the word (case sensitive).
     *
     * Vowels in the beginning and ending doesn't count. Return empty string if you didn't
     * find any vowel met the above condition.
     *
     * You may assume that the given string contains English letter only.
     *
     * Example:
     * getClosestVowel("yogurt") ==> "u"
     * getClosestVowel("FULL") ==> "U"
     * getClosestVowel("quick") ==> ""
     * getClosestVowel("ab") ==> ""
     *
     * > getClosestVowel("yogurt")
     * "u"
     * > getClosestVowel("full")
     * "u"
     * > getClosestVowel("easy")
     * ""
     * > getClosestVowel("eAsy")
     * ""
     * > getClosestVowel("ali")
     * ""
     * > getClosestVowel("bad")
     * "a"
     * > getClosestVowel("most")
     * "o"
     * > getClosestVowel("ab")
     * ""
     * > getClosestVowel("ba")
     * ""
     * > getClosestVowel("quick")
     * ""
     * > getClosestVowel("anime")
     * "i"
     * > getClosestVowel("Asia")
     * ""
     * > getClosestVowel("Above")
     * "o"
     */
    public static String getClosestVowel(String word) {
        String vowels = "aeiouAEIOU";
        int index = -1;
        for (int i = word.length() - 2; i > 0; i--) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return "";
        }
        for (int i = index - 1; i > 0; i--) {
            if (vowels.indexOf(word.charAt(i)) == -1 && vowels.indexOf(word.charAt(i + 1)) != -1 && vowels.indexOf(word.charAt(i - 1)) != -1) {
                return String.valueOf(word.charAt(i));
            }
        }
        return "";
    }
}

// GetClosestVowelTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains ten unit test cases for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {
    @Test
    void testGetClosestVowel1() {
        assertEquals("u", GetClosestVowel.getClosestVowel("yogurt"));
    }

    @Test
    void testGetClosestVowel2() {
        assertEquals("U", GetClosestVowel.getClosestVowel("FULL"));
    }

    @Test
    void testGetClosestVowel3() {
        assertEquals("", GetClosestVowel.getClosestVowel("quick"));
    }

    @Test
    void testGetClosestVowel4() {
        assertEquals("", GetClosestVowel.getClosestVowel("ab"));
    }

    @Test
    void testGetClosestVowel5() {
        assertEquals("", GetClosestVowel.getClosestVowel("eAsy"));
    }

    @Test
    void testGetClosestVowel6() {
        assertEquals("", GetClosestVowel.getClosestVowel("ali"));
    }

    @Test
    void testGetClosestVowel7() {
        assertEquals("a", GetClosestVowel.getClosestVowel("bad"));
    }

    @Test
    void testGetClosestVowel8() {
        assertEquals("o", GetClosestVowel.getClosestVowel("most"));
    }

    @Test
    void testGetClosestVowel9() {
        assertEquals("", GetClosestVowel.getClosestVowel("ba"));
    }

    @Test
    void testGetClosestVowel10() {
        assertEquals("i", GetClosestVowel.getClosestVowel("anime"));
    }

    @Test
    void testGetClosestVowel11() {
        assertEquals("", GetClosestVowel.getClosestVowel("Asia"));
    }

    @Test
    void testGetClosestVowel12() {
        assertEquals("o", GetClosestVowel.getClosestVowel("Above"));
    }
}