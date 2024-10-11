Here's the source code for the `FilterByPrefixTest` class:

```
package scenario2;

import java.util.ArrayList;
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
        List<Object> input = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterByPrefix.filterByPrefix(input, "prefix");
        assertEquals(expected, actual);
    }

    @Test
    void testNoMatch() {
        List<Object> input = Arrays.asList("apple", "banana", "cherry");
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterByPrefix.filterByPrefix(input, "prefix");
        assertEquals(expected, actual);
    }

    @Test
    void testSingleMatch() {
        List<Object> input = Arrays.asList("prefixapple", "banana", "cherry");
        List<Object> expected = Arrays.asList("prefixapple");
        List<Object> actual = FilterByPrefix.filterByPrefix(input, "prefix");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleMatches() {
        List<Object> input = Arrays.asList("prefixapple", "prefixbanana", "cherry", "prefixorange");
        List<Object> expected = Arrays.asList("prefixapple", "prefixbanana", "prefixorange");
        List<Object> actual = FilterByPrefix.filterByPrefix(input, "prefix");
        assertEquals(expected, actual);
    }

    @Test
    void testAllMatch() {
        List<Object> input = Arrays.asList("prefixapple", "prefixbanana", "prefixcherry");
        List<Object> expected = Arrays.asList("prefixapple", "prefixbanana", "prefixcherry");
        List<Object> actual = FilterByPrefix.filterByPrefix(input, "prefix");
        assertEquals(expected, actual);
    }

    @Test
    void testNullInput() {
        List<Object> input = null;
        assertThrows(NullPointerException.class, () -> {
            FilterByPrefix.filterByPrefix(input, "prefix");
        });
    }

    @Test
    void testNullPrefix() {
        List<Object> input = Arrays.asList("apple", "banana", "cherry");
        assertThrows(NullPointerException.class, () -> {
            FilterByPrefix.filterByPrefix(input, null);
        });
    }

    @Test
    void testEmptyPrefix() {
        List<Object> input = Arrays.asList("apple", "banana", "cherry");
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterByPrefix.filterByPrefix(input, "");
        assertEquals(expected, actual);
    }

    @Test
    void testMixedCase() {
        List<Object> input = Arrays.asList("Prefixapple", "prefixBanana", "cherry", "PrefixOrange");
        List<Object> expected = Arrays.asList("Prefixapple", "prefixBanana", "PrefixOrange");
        List<Object> actual = FilterByPrefix.filterByPrefix(input, "prefix");
        assertEquals(expected, actual);
    }

    @Test
    void testNonStringInput() {
        List<Object> input = Arrays.asList(1, "prefixapple", true, 3.14);
        List<Object> expected = Arrays.asList("prefixapple");
        List<Object> actual = FilterByPrefix.filterByPrefix(input, "prefix");
        assertEquals(expected, actual);
    }
}
```

This class contains ten unit test cases for the `FilterByPrefix.filterByPrefix()` method. The test cases cover various scenarios, including empty input list, no match, single match, multiple matches, all match, null input, null prefix, empty prefix, mixed case, and non-string input. The `@Test` annotation is used to mark each test method, and the `assertEquals()` method is used to compare the expected and actual results. The `assertThrows()` method is used to test for expected exceptions.