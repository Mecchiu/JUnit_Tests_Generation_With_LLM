// HowManyTimes.java
package scenario3;

class HowManyTimes {

    /**
     * Find how many times a given substring can be found in the original string. Count overlapping cases.
     *
     * > howManyTimes("", "a")
     * 0
     * > howManyTimes("aaa", "a")
     * 3
     * > howManyTimes("aaaa", "aa")
     * 3
     * > howManyTimes("", "x")
     * 0
     * > howManyTimes("xyxyxyx", "x")
     * 4
     * > howManyTimes("cacacacac", "cac")
     * 4
     * > howManyTimes("john doe", "john")
     * 1
     */
    public static int howManyTimes(String string, String substring) {
        if (string == null || substring == null || substring.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i <= string.length() - substring.length(); i++) {
            if (string.substring(i, i + substring.length()).equals(substring)) {
                count++;
            }
        }
        return count;
    }
}

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
    void testEmptyString() {
        assertEquals(0, HowManyTimes.howManyTimes("", "a"));
    }

    @Test
    void testSingleCharString() {
        assertEquals(3, HowManyTimes.howManyTimes("aaa", "a"));
    }

    @Test
    void testMultipleCharString() {
        assertEquals(3, HowManyTimes.howManyTimes("aaaa", "aa"));
    }

    @Test
    void testEmptySubstring() {
        assertEquals(0, HowManyTimes.howManyTimes("xyxyxyx", ""));
    }

    @Test
    void testMultipleOccurrences() {
        assertEquals(4, HowManyTimes.howManyTimes("xyxyxyx", "x"));
    }

    @Test
    void testOverlappingOccurrences() {
        assertEquals(4, HowManyTimes.howManyTimes("cacacacac", "cac"));
    }

    @Test
    void testSingleOccurrence() {
        assertEquals(1, HowManyTimes.howManyTimes("john doe", "john"));
    }

    @Test
    void testSubstringLongerThanString() {
        assertEquals(0, HowManyTimes.howManyTimes("a", "aa"));
    }

    @Test
    void testNullString() {
        assertEquals(0, HowManyTimes.howManyTimes(null, "a"));
    }

    @Test
    void testNullSubstring() {
        assertEquals(0, HowManyTimes.howManyTimes("aaa", null));
    }
}