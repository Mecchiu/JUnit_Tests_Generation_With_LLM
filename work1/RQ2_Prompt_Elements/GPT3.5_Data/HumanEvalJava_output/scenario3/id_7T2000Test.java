// FilterBySubstring.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class FilterBySubstring {

    /**
     * Filter an input list of strings only for ones that contain given substring
     * > filterBySubstring([], "a")
     * []
     * > filterBySubstring(["abc", "bacd", "cde", "array"], "a")
     * ["abc", "bacd", "array"]
     * > filterBySubstring([], "john")
     * []
     * > filterBySubstring(["xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx"], "xxx")
     * ["xxx", "xxxAAA", "xxx"]
     * > filterBySubstring(["xxx", "asd", "aaaxxy", "john doe", "xxxAAA", "xxx"], "xx")
     * ["xxx", "aaaxxy", "xxxAAA", "xxx"]
     * > filterBySubstring(["grunt", "trumpet", "prune", "gruesome"], "run")
     * ["grunt", "prune"]
     */
    public static List<String> filterBySubstring(List<String> strings, String substring) {
        List<String> filteredStrings = new ArrayList<>();
        for (String str : strings) {
            if (str.contains(substring)) {
                filteredStrings.add(str);
            }
        }
        return filteredStrings;
    }
}

// FilterBySubstringTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterBySubstring}.
* It contains ten unit test cases for the {@link FilterBySubstring#filterBySubstring(List, String)} method.
*/
class FilterBySubstringTest {

    @Test
    void testEmptyList() {
        List<String> input = Arrays.asList();
        List<String> expectedOutput = Arrays.asList();
        assertEquals(expectedOutput, FilterBySubstring.filterBySubstring(input, "a"));
    }

    @Test
    void testNoMatch() {
        List<String> input = Arrays.asList("abc", "def", "ghi");
        List<String> expectedOutput = Arrays.asList();
        assertEquals(expectedOutput, FilterBySubstring.filterBySubstring(input, "j"));
    }

    @Test
    void testSingleMatch() {
        List<String> input = Arrays.asList("abc", "def", "ghi");
        List<String> expectedOutput = Arrays.asList("abc");
        assertEquals(expectedOutput, FilterBySubstring.filterBySubstring(input, "a"));
    }

    @Test
    void testMultipleMatches() {
        List<String> input = Arrays.asList("abc", "bacd", "cde", "array");
        List<String> expectedOutput = Arrays.asList("abc", "bacd", "array");
        assertEquals(expectedOutput, FilterBySubstring.filterBySubstring(input, "a"));
    }

    @Test
    void testMatchAtBeginning() {
        List<String> input = Arrays.asList("abc", "def", "ghi");
        List<String> expectedOutput = Arrays.asList("abc");
        assertEquals(expectedOutput, FilterBySubstring.filterBySubstring(input, "ab"));
    }

    @Test
    void testMatchAtEnd() {
        List<String> input = Arrays.asList("abc", "def", "ghi");
        List<String> expectedOutput = Arrays.asList("abc");
        assertEquals(expectedOutput, FilterBySubstring.filterBySubstring(input, "bc"));
    }

    @Test
    void testMatchInMiddle() {
        List<String> input = Arrays.asList("abc", "def", "ghi");
        List<String> expectedOutput = Arrays.asList("abc");
        assertEquals(expectedOutput, FilterBySubstring.filterBySubstring(input, "b"));
    }

    @Test
    void testMatchCaseSensitive() {
        List<String> input = Arrays.asList("abc", "def", "ghi");
        List<String> expectedOutput = Arrays.asList();
        assertEquals(expectedOutput, FilterBySubstring.filterBySubstring(input, "A"));
    }

    @Test
    void testMatchSubstringIsLonger() {
        List<String> input = Arrays.asList("abc", "def", "ghi");
        List<String> expectedOutput = Arrays.asList();
        assertEquals(expectedOutput, FilterBySubstring.filterBySubstring(input, "abcd"));
    }

    @Test
    void testMatchSubstringIsShorter() {
        List<String> input = Arrays.asList("abc", "def", "ghi");
        List<String> expectedOutput = Arrays.asList();
        assertEquals(expectedOutput, FilterBySubstring.filterBySubstring(input, "ab"));
    }
}