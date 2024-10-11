// Longest.java
package scenario3;

import java.util.List;

class Longest {

    /**
     * Out of list of strings, return the longest one. Return the first one in case of multiple
     * strings of the same length. Return null in case the input list is empty.
     *
     * > longest(["a", "b", "c"])
     * "a"
     * > longest(["a", "bb", "ccc"])
     * "ccc"
     * > longest([])
     * null
     * > longest(["x", "y", "z"])
     * "x"
     * > longest(["x", "yyy", "zzzz", "www", "kkkk", "abc"])
     * "zzzz"
     */
    public static String longest(List<String> strings) {
        if (strings.isEmpty()) {
            return null;
        }
        String longestString = strings.get(0);
        for (String s : strings) {
            if (s.length() > longestString.length()) {
                longestString = s;
            }
        }
        return longestString;
    }
}

// LongestTest.java
package scenario3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Longest}.
* It contains ten unit test cases for the {@link Longest#longest(List)} method.
*/
class LongestTest {

    @Test
    void testLongestWithEmptyList() {
        List<String> strings = Collections.emptyList();
        assertNull(Longest.longest(strings));
    }

    @Test
    void testLongestWithSingleElementList() {
        List<String> strings = Collections.singletonList("a");
        assertEquals("a", Longest.longest(strings));
    }

    @Test
    void testLongestWithMultipleElementList() {
        List<String> strings = Arrays.asList("a", "bb", "ccc");
        assertEquals("ccc", Longest.longest(strings));
    }

    @Test
    void testLongestWithMultipleElementListAndEqualLength() {
        List<String> strings = Arrays.asList("x", "y", "z");
        assertEquals("x", Longest.longest(strings));
    }

    @Test
    void testLongestWithMultipleElementListAndEqualLength2() {
        List<String> strings = Arrays.asList("x", "yyy", "zzzz", "www", "kkkk", "abc");
        assertEquals("zzzz", Longest.longest(strings));
    }

    @Test
    void testLongestWithNullElement() {
        List<String> strings = Arrays.asList("a", null, "ccc");
        assertEquals("ccc", Longest.longest(strings));
    }

    @Test
    void testLongestWithAllNullElements() {
        List<String> strings = Arrays.asList(null, null, null);
        assertNull(Longest.longest(strings));
    }

    @Test
    void testLongestWithEmptyString() {
        List<String> strings = Arrays.asList("a", "", "ccc");
        assertEquals("ccc", Longest.longest(strings));
    }

    @Test
    void testLongestWithWhitespaceString() {
        List<String> strings = Arrays.asList("a", "  ", "ccc");
        assertEquals("ccc", Longest.longest(strings));
    }

    @Test
    void testLongestWithSpecialCharacters() {
        List<String> strings = Arrays.asList("a", "bb", "c!c");
        assertEquals("c!c", Longest.longest(strings));
    }
}