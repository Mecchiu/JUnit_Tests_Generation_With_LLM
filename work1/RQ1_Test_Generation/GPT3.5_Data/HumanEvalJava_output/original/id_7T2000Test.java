```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilterBySubstringTest {

    @Test
    void testEmptyListWithSubstring() {
        List<Object> input = new ArrayList<>();
        List<Object> result = FilterBySubstring.filterBySubstring(input, "a");
        assertTrue(result.isEmpty());
    }

    @Test
    void testListWithSubstring() {
        List<Object> input = new ArrayList<>();
        input.add("abc");
        input.add("bacd");
        input.add("cde");
        input.add("array");
        List<Object> result = FilterBySubstring.filterBySubstring(input, "a");
        assertEquals(3, result.size());
        assertTrue(result.contains("abc"));
        assertTrue(result.contains("bacd"));
        assertTrue(result.contains("array"));
    }

    @Test
    void testEmptyListWithNonExistentSubstring() {
        List<Object> input = new ArrayList<>();
        List<Object> result = FilterBySubstring.filterBySubstring(input, "john");
        assertTrue(result.isEmpty());
    }

    @Test
    void testListWithNonExistentSubstring() {
        List<Object> input = new ArrayList<>();
        input.add("xxx");
        input.add("asd");
        input.add("xxy");
        input.add("john doe");
        input.add("xxxAAA");
        input.add("xxx");
        List<Object> result = FilterBySubstring.filterBySubstring(input, "john");
        assertTrue(result.isEmpty());
    }

    @Test
    void testListWithSubstringContainingSubstring() {
        List<Object> input = new ArrayList<>();
        input.add("xxx");
        input.add("asd");
        input.add("aaaxxy");
        input.add("john doe");
        input.add("xxxAAA");
        input.add("xxx");
        List<Object> result = FilterBySubstring.filterBySubstring(input, "xx");
        assertEquals(4, result.size());
        assertTrue(result.contains("xxx"));
        assertTrue(result.contains("aaaxxy"));
        assertTrue(result.contains("xxxAAA"));
        assertTrue(result.contains("xxx"));
    }

    @Test
    void testListWithSubstringContainingSubstring2() {
        List<Object> input = new ArrayList<>();
        input.add("grunt");
        input.add("trumpet");
        input.add("prune");
        input.add("gruesome");
        List<Object> result = FilterBySubstring.filterBySubstring(input, "run");
        assertEquals(2, result.size());
        assertTrue(result.contains("grunt"));
        assertTrue(result.contains("prune"));
    }
}
```
```