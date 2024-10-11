```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilterByPrefixTest {

    @Test
    void testEmptyListWithPrefix() {
        List<Object> input = new ArrayList<>();
        List<Object> result = FilterByPrefix.filterByPrefix(input, "a");
        assertTrue(result.isEmpty());
    }

    @Test
    void testListWithPrefix() {
        List<Object> input = new ArrayList<>();
        input.add("abc");
        input.add("bcd");
        input.add("cde");
        input.add("array");
        List<Object> result = FilterByPrefix.filterByPrefix(input, "a");
        assertEquals(2, result.size());
        assertTrue(result.contains("abc"));
        assertTrue(result.contains("array"));
    }

    @Test
    void testEmptyListWithNonMatchingPrefix() {
        List<Object> input = new ArrayList<>();
        List<Object> result = FilterByPrefix.filterByPrefix(input, "john");
        assertTrue(result.isEmpty());
    }

    @Test
    void testListWithNonMatchingPrefix() {
        List<Object> input = new ArrayList<>();
        input.add("xxx");
        input.add("asd");
        input.add("xxy");
        input.add("john doe");
        input.add("xxxAAA");
        input.add("xxx");
        List<Object> result = FilterByPrefix.filterByPrefix(input, "xxx");
        assertEquals(3, result.size());
        assertTrue(result.contains("xxx"));
        assertTrue(result.contains("xxxAAA"));
        assertTrue(result.contains("xxx"));
    }
}
```
