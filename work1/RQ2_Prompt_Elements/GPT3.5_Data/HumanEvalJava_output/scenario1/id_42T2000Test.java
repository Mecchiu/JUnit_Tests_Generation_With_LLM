Here's the source code for the IncrListTest class:

```
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link IncrList}.
 * It contains ten unit test cases for the {@link IncrList#incrList(List)} method.
 */
class IncrListTest {

    @Test
    void testEmptyList() {
        List<Object> input = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, IncrList.incrList(input));
    }

    @Test
    void testListWithNonIntegerValues() {
        List<Object> input = Arrays.asList("hello", 3.14, true);
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, IncrList.incrList(input));
    }

    @Test
    void testListWithOneIntegerValue() {
        List<Object> input = Arrays.asList(5);
        List<Object> expected = Arrays.asList(6);
        assertEquals(expected, IncrList.incrList(input));
    }

    @Test
    void testListWithMultipleIntegerValues() {
        List<Object> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> expected = Arrays.asList(2, 3, 4, 5, 6);
        assertEquals(expected, IncrList.incrList(input));
    }

    @Test
    void testListWithNegativeIntegerValues() {
        List<Object> input = Arrays.asList(-5, -4, -3, -2, -1);
        List<Object> expected = Arrays.asList(-4, -3, -2, -1, 0);
        assertEquals(expected, IncrList.incrList(input));
    }

    @Test
    void testListWithZeroValue() {
        List<Object> input = Arrays.asList(0);
        List<Object> expected = Arrays.asList(1);
        assertEquals(expected, IncrList.incrList(input));
    }

    @Test
    void testListWithMixedValues() {
        List<Object> input = Arrays.asList(1, "hello", 2.5, true, -3);
        List<Object> expected = Arrays.asList(2, -2);
        assertEquals(expected, IncrList.incrList(input));
    }

    @Test
    void testListWithNullValue() {
        List<Object> input = Arrays.asList(null);
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, IncrList.incrList(input));
    }

    @Test
    void testListWithDuplicateValues() {
        List<Object> input = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        List<Object> expected = Arrays.asList(2, 3, 3, 4, 4, 4, 5, 5, 5, 5);
        assertEquals(expected, IncrList.incrList(input));
    }

    @Test
    void testListWithMaxIntegerValue() {
        List<Object> input = Arrays.asList(Integer.MAX_VALUE);
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, IncrList.incrList(input));
    }
}
```

This class contains ten unit test cases for the `incrList` method of the `IncrList` class. Each test case tests a different scenario, such as an empty list, a list with non-integer values, a list with negative integer values, etc. The `@Test` annotation is used to mark each test method, and the `assertEquals` method is used to compare the expected result with the actual result returned by the `incrList` method.