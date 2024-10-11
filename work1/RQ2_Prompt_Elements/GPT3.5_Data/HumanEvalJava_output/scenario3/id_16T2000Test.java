// CountDistinctCharacters.java
package scenario3;

import java.util.HashSet;
import java.util.Set;

class CountDistinctCharacters {

    /**
     * Given a string, find out how many distinct characters (regardless of case)  it consists  of.
     *
     * > countDistinctCharacters("xyzXYZ")
     * 3
     * > countDistinctCharacters("Jerry")
     * 4
     * > countDistinctCharacters("")
     * 0
     * > countDistinctCharacters("abcde")
     * 5
     * > countDistinctCharacters("abcdecadeCADE")
     * 5
     * > countDistinctCharacters("aaaaAAAAaaaa")
     * 1
     * > countDistinctCharacters("Jerry jERRY JeRRRY")
     * 5
     */
    public static int countDistinctCharacters(String string) {
        Set<Character> distinctChars = new HashSet<>();
        for (char c : string.toCharArray()) {
            if (Character.isLetter(c)) {
                distinctChars.add(Character.toLowerCase(c));
            }
        }
        return distinctChars.size();
    }
}

// CountDistinctCharactersTest.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains ten unit test cases for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {

    @Test
    void testEmptyString() {
        assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
    }

    @Test
    void testSingleCharacter() {
        assertEquals(1, CountDistinctCharacters.countDistinctCharacters("a"));
    }

    @Test
    void testAllSameCharacters() {
        assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aaaaa"));
    }

    @Test
    void testAllDifferentCharacters() {
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcde"));
    }

    @Test
    void testMixedCase() {
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcdecadeCADE"));
    }

    @Test
    void testWithSpaces() {
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("Jerry jERRY JeRRRY"));
    }

    @Test
    void testWithNumbers() {
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abc123de123"));
    }

    @Test
    void testWithSpecialCharacters() {
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abc!@#de!@#"));
    }

    @Test
    void testWithMixedCharacters() {
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcde123!@#"));
    }

    @Test
    void testWithNull() {
        assertThrows(NullPointerException.class, () -> CountDistinctCharacters.countDistinctCharacters(null));
    }
}