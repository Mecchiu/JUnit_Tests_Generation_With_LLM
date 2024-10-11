// Longest.java
package scenario2;

import java.util.List;

class Longest {

    /**
     * Out of list of strings, return the longest one. Return the first one in case of multiple
     * strings of the same length. Return null in case the input list is empty.
     */
    public static String longest(List<String> strings) {
        if (strings.size() == 0) {
            return null;
        }
        String longest = strings.get(0);
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).length() > longest.length()) {
                longest = strings.get(i);
            }
        }
        return longest;
    }
}

// LongestTest.java
package scenario2;

import java.util.Arrays;
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
        List<String> strings = Arrays.asList();
        assertNull(Longest.longest(strings));
    }

    @Test
    void testLongestWithOneElement() {
        List<String> strings = Arrays.asList("hello");
        assertEquals("hello", Longest.longest(strings));
    }

    @Test
    void testLongestWithTwoElements() {
        List<String> strings = Arrays.asList("hello", "world");
        assertEquals("world", Longest.longest(strings));
    }

    @Test
    void testLongestWithMultipleElements() {
        List<String> strings = Arrays.asList("hello", "world", "foo", "bar", "baz");
        assertEquals("hello", Longest.longest(strings));
    }

    @Test
    void testLongestWithMultipleElementsAndSameLength() {
        List<String> strings = Arrays.asList("hello", "world", "foo", "bar", "baz", "hi");
        assertEquals("hello", Longest.longest(strings));
    }

    @Test
    void testLongestWithNullElement() {
        List<String> strings = Arrays.asList("hello", null, "world");
        assertEquals("hello", Longest.longest(strings));
    }

    @Test
    void testLongestWithEmptyString() {
        List<String> strings = Arrays.asList("hello", "", "world");
        assertEquals("hello", Longest.longest(strings));
    }

    @Test
    void testLongestWithWhitespaceString() {
        List<String> strings = Arrays.asList("hello", "  ", "world");
        assertEquals("hello", Longest.longest(strings));
    }

    @Test
    void testLongestWithSpecialCharacters() {
        List<String> strings = Arrays.asList("hello", "world!", "foo bar", "baz@#$%");
        assertEquals("baz@#$%", Longest.longest(strings));
    }

    @Test
    void testLongestWithUnicodeCharacters() {
        List<String> strings = Arrays.asList("hello", "world", "foo", "bar", "baz", "こんにちは");
        assertEquals("こんにちは", Longest.longest(strings));
    }
}