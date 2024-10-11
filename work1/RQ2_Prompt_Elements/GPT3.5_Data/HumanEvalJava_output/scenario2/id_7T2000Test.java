Here's the source code for the test class:

```
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilterBySubstringTest {

    @Test
    void testFilterBySubstring_emptyList() {
        List<Object> input = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "test");
        assertEquals(expected, actual);
    }

    @Test
    void testFilterBySubstring_noMatch() {
        List<Object> input = Arrays.asList("hello", "world", "java");
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "test");
        assertEquals(expected, actual);
    }

    @Test
    void testFilterBySubstring_singleMatch() {
        List<Object> input = Arrays.asList("hello", "world", "java");
        List<Object> expected = Arrays.asList("world");
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "orl");
        assertEquals(expected, actual);
    }

    @Test
    void testFilterBySubstring_multipleMatches() {
        List<Object> input = Arrays.asList("hello", "world", "java", "corona", "virus");
        List<Object> expected = Arrays.asList("corona", "virus");
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "or");
        assertEquals(expected, actual);
    }

    @Test
    void testFilterBySubstring_caseSensitive() {
        List<Object> input = Arrays.asList("hello", "World", "java");
        List<Object> expected = Arrays.asList("World");
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "W");
        assertEquals(expected, actual);
    }

    @Test
    void testFilterBySubstring_nullInput() {
        List<Object> input = null;
        assertThrows(NullPointerException.class, () -> {
            FilterBySubstring.filterBySubstring(input, "test");
        });
    }

    @Test
    void testFilterBySubstring_nullSubstring() {
        List<Object> input = Arrays.asList("hello", "world", "java");
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterBySubstring.filterBySubstring(input, null);
        assertEquals(expected, actual);
    }

    @Test
    void testFilterBySubstring_emptySubstring() {
        List<Object> input = Arrays.asList("hello", "world", "java");
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "");
        assertEquals(expected, actual);
    }

    @Test
    void testFilterBySubstring_inputContainsNull() {
        List<Object> input = Arrays.asList("hello", null, "world", "java");
        List<Object> expected = Arrays.asList(null);
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "l");
        assertEquals(expected, actual);
    }

    @Test
    void testFilterBySubstring_inputContainsNonString() {
        List<Object> input = Arrays.asList("hello", 123, "world", true);
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "l");
        assertEquals(expected, actual);
    }
}
```