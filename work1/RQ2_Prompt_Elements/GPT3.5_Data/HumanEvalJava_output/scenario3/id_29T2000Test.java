// FilterByPrefix.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class FilterByPrefix {

    /**
     * Filter an input list of strings only for ones that start with a given prefix.
     *
     * > filterByPrefix([], "a")
     * []
     * > filterByPrefix(["abc", "bcd", "cde", "array"], "a")
     * ["abc", "array"]
     * > filterByPrefix([], "john")
     * []
     * > filterByPrefix(["xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx"], "xxx")
     * ["xxx", "xxxAAA", "xxx"]
     */
    public static List<String> filterByPrefix(List<String> strings, String prefix) {
        List<String> filteredStrings = new ArrayList<>();
        for (String s : strings) {
            if (s.startsWith(prefix)) {
                filteredStrings.add(s);
            }
        }
        return filteredStrings;
    }
}

// FilterByPrefixTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterByPrefix}.
* It contains ten unit test cases for the {@link FilterByPrefix#filterByPrefix(List, String)} method.
*/
class FilterByPrefixTest {

    @Test
    void testEmptyList() {
        List<String> input = Arrays.asList();
        List<String> expectedOutput = Arrays.asList();
        assertEquals(expectedOutput, FilterByPrefix.filterByPrefix(input, "a"));
    }

    @Test
    void testNoMatch() {
        List<String> input = Arrays.asList("bcd", "cde", "array");
        List<String> expectedOutput = Arrays.asList();
        assertEquals(expectedOutput, FilterByPrefix.filterByPrefix(input, "a"));
    }

    @Test
    void testSingleMatch() {
        List<String> input = Arrays.asList("abc", "bcd", "cde", "array");
        List<String> expectedOutput = Arrays.asList("abc");
        assertEquals(expectedOutput, FilterByPrefix.filterByPrefix(input, "a"));
    }

    @Test
    void testMultipleMatches() {
        List<String> input = Arrays.asList("abc", "bcd", "cde", "array");
        List<String> expectedOutput = Arrays.asList("abc", "array");
        assertEquals(expectedOutput, FilterByPrefix.filterByPrefix(input, "a"));
    }

    @Test
    void testMatchCaseSensitive() {
        List<String> input = Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
        List<String> expectedOutput = Arrays.asList("xxx", "xxxAAA", "xxx");
        assertEquals(expectedOutput, FilterByPrefix.filterByPrefix(input, "xxx"));
    }

    @Test
    void testMatchCaseInsensitive() {
        List<String> input = Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
        List<String> expectedOutput = Arrays.asList("xxx", "xxxAAA", "xxx");
        assertEquals(expectedOutput, FilterByPrefix.filterByPrefix(input, "XXX"));
    }

    @Test
    void testPrefixEmptyString() {
        List<String> input = Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
        List<String> expectedOutput = Arrays.asList();
        assertEquals(expectedOutput, FilterByPrefix.filterByPrefix(input, ""));
    }

    @Test
    void testPrefixNull() {
        List<String> input = Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
        List<String> expectedOutput = Arrays.asList();
        assertEquals(expectedOutput, FilterByPrefix.filterByPrefix(input, null));
    }

    @Test
    void testInputNull() {
        List<String> input = null;
        List<String> expectedOutput = Arrays.asList();
        assertEquals(expectedOutput, FilterByPrefix.filterByPrefix(input, "a"));
    }

    @Test
    void testInputContainsNull() {
        List<String> input = Arrays.asList("xxx", "asd", null, "john doe", "xxxAAA", "xxx");
        List<String> expectedOutput = Arrays.asList();
        assertEquals(expectedOutput, FilterByPrefix.filterByPrefix(input, "a"));
    }
}