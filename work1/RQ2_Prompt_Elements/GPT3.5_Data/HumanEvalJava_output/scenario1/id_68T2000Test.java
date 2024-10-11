Here's the source code for the PluckTest class:

```
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Pluck}.
 * It contains ten unit test cases for the {@link Pluck#pluck(List)} method.
 */
class PluckTest {

    @Test
    void testEmptyList() {
        List<Object> arr = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testNoIntegers() {
        List<Object> arr = Arrays.asList("a", "b", "c");
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testNoEvenIntegers() {
        List<Object> arr = Arrays.asList(1, 3, 5);
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testOneEvenInteger() {
        List<Object> arr = Arrays.asList(1, 2, 3);
        List<Object> expected = Arrays.asList(2, 1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testMultipleEvenIntegers() {
        List<Object> arr = Arrays.asList(4, 2, 6, 8);
        List<Object> expected = Arrays.asList(2, 1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testNegativeIntegers() {
        List<Object> arr = Arrays.asList(-4, -2, -6, -8);
        List<Object> expected = Arrays.asList(-8, 3);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testMixedIntegers() {
        List<Object> arr = Arrays.asList(-4, 2, -6, 8);
        List<Object> expected = Arrays.asList(-4, 0);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testMixedIntegersAndStrings() {
        List<Object> arr = Arrays.asList(-4, "a", -6, 8);
        List<Object> expected = Arrays.asList(-4, 0);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testNullElement() {
        List<Object> arr = Arrays.asList(-4, null, -6, 8);
        List<Object> expected = Arrays.asList(-4, 0);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testDuplicateMinValues() {
        List<Object> arr = Arrays.asList(2, 4, 2, 6, 8);
        List<Object> expected = Arrays.asList(2, 0);
        assertEquals(expected, Pluck.pluck(arr));
    }
}
```