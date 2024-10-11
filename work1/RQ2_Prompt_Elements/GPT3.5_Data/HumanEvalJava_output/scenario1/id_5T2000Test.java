Here's the source code for the IntersperseTest class:

```
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Intersperse}.
 * It contains ten unit test cases for the {@link Intersperse#intersperse(List, int)} method.
 */
class IntersperseTest {

    @Test
    void testIntersperseWithEmptyList() {
        List<Object> numbers = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        int delimiter = 0;
        List<Object> actual = Intersperse.intersperse(numbers, delimiter);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperseWithSingleElementList() {
        List<Object> numbers = Arrays.asList(1);
        List<Object> expected = Arrays.asList(1);
        int delimiter = 0;
        List<Object> actual = Intersperse.intersperse(numbers, delimiter);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperseWithTwoElementList() {
        List<Object> numbers = Arrays.asList(1, 2);
        List<Object> expected = Arrays.asList(1, 0, 2);
        int delimiter = 0;
        List<Object> actual = Intersperse.intersperse(numbers, delimiter);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperseWithThreeElementList() {
        List<Object> numbers = Arrays.asList(1, 2, 3);
        List<Object> expected = Arrays.asList(1, 0, 2, 0, 3);
        int delimiter = 0;
        List<Object> actual = Intersperse.intersperse(numbers, delimiter);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperseWithFourElementList() {
        List<Object> numbers = Arrays.asList(1, 2, 3, 4);
        List<Object> expected = Arrays.asList(1, 0, 2, 0, 3, 0, 4);
        int delimiter = 0;
        List<Object> actual = Intersperse.intersperse(numbers, delimiter);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperseWithDelimiterGreaterThanZero() {
        List<Object> numbers = Arrays.asList(1, 2, 3, 4);
        List<Object> expected = Arrays.asList(1, 5, 2, 5, 3, 5, 4);
        int delimiter = 5;
        List<Object> actual = Intersperse.intersperse(numbers, delimiter);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperseWithDelimiterLessThanZero() {
        List<Object> numbers = Arrays.asList(1, 2, 3, 4);
        List<Object> expected = Arrays.asList(1, -5, 2, -5, 3, -5, 4);
        int delimiter = -5;
        List<Object> actual = Intersperse.intersperse(numbers, delimiter);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperseWithNullList() {
        List<Object> numbers = null;
        int delimiter = 0;
        assertThrows(NullPointerException.class, () -> Intersperse.intersperse(numbers, delimiter));
    }

    @Test
    void testIntersperseWithNullDelimiter() {
        List<Object> numbers = Arrays.asList(1, 2, 3, 4);
        Integer delimiter = null;
        assertThrows(NullPointerException.class, () -> Intersperse.intersperse(numbers, delimiter));
    }

    @Test
    void testIntersperseWithMixedTypes() {
        List<Object> numbers = Arrays.asList(1, "two", 3.0, true);
        List<Object> expected = Arrays.asList(1, 0, "two", 0, 3.0, 0, true);
        int delimiter = 0;
        List<Object> actual = Intersperse.intersperse(numbers, delimiter);
        assertEquals(expected, actual);
    }
}
```

This class contains ten unit test cases for the `Intersperse.intersperse()` method. The test cases cover various scenarios, such as empty list, single element list, list with multiple elements, list with mixed types, null list, null delimiter, and delimiter greater than or less than zero. The `@Test` annotation is used to mark each test case method, and the `assertEquals()` method is used to compare the expected and actual results. The `assertThrows()` method is used to test for expected exceptions.