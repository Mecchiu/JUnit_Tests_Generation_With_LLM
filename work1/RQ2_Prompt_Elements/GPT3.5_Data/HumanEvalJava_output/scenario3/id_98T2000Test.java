// CountUpper.java
package scenario3;

class CountUpper {

    /**
     * * Given a string s, count the number of uppercase vowels in even indices.
     *
     * For example:
     * countUpper('aBCdEf') returns 1
     * countUpper('abcdefg') returns 0
     * countUpper('dBBE') returns 0
     *
     * > countUpper("abcdefg")
     * 0
     * > countUpper("dBBE")
     * 0
     * > countUpper("")
     * 0
     * > countUpper("EEEE")
     * 2
     */
    public static int countUpper(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i += 2) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c) && (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                count++;
            }
        }
        return count;
    }
}

// CountUpperTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpper}.
* It contains ten unit test cases for the {@link CountUpper#countUpper(String)} method.
*/
class CountUpperTest {

    @Test
    void testEmptyString() {
        assertEquals(0, CountUpper.countUpper(""));
    }

    @Test
    void testNoUppercaseVowels() {
        assertEquals(0, CountUpper.countUpper("abcdefg"));
    }

    @Test
    void testNoEvenIndices() {
        assertEquals(0, CountUpper.countUpper("dBBE"));
    }

    @Test
    void testOneUppercaseVowel() {
        assertEquals(1, CountUpper.countUpper("aBCdEf"));
    }

    @Test
    void testTwoUppercaseVowels() {
        assertEquals(2, CountUpper.countUpper("aBCdEFG"));
    }

    @Test
    void testAllUppercaseVowels() {
        assertEquals(2, CountUpper.countUpper("EEEE"));
    }

    @Test
    void testAllUppercaseConsonants() {
        assertEquals(0, CountUpper.countUpper("BCDFGH"));
    }

    @Test
    void testMixedCaseVowels() {
        assertEquals(1, CountUpper.countUpper("aBCdEFGhIjKlMnOp"));
    }

    @Test
    void testMixedCaseConsonants() {
        assertEquals(0, CountUpper.countUpper("aBCdEFGhIjKlMnOpQrStUvWxYz"));
    }

    @Test
    void testSpecialCharacters() {
        assertEquals(0, CountUpper.countUpper("!@#$%^&*()_+-=[]{}|;':\",./<>?\\"));
    }
}