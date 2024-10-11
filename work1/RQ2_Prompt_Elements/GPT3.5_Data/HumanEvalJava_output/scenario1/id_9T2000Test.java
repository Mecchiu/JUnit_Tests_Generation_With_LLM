Here's the source code for the RollingMaxTest class:

```
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link RollingMax}.
 * It contains ten unit test cases for the {@link RollingMax#rollingMax(List)} method.
 */
class RollingMaxTest {

    @Test
    void testEmptyList() {
        List<Object> numbers = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testSingleNumber() {
        List<Object> numbers = Arrays.asList(5);
        List<Object> expected = Arrays.asList(5);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testIncreasingNumbers() {
        List<Object> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testDecreasingNumbers() {
        List<Object> numbers = Arrays.asList(5, 4, 3, 2, 1);
        List<Object> expected = Arrays.asList(5, 5, 5, 5, 5);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testRandomNumbers() {
        List<Object> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3);
        List<Object> expected = Arrays.asList(3, 3, 4, 4, 5, 9, 9, 9, 9, 9);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testMixedNumbers() {
        List<Object> numbers = Arrays.asList(1, 2, 3, "4", 5, 6, "7", 8, 9);
        assertThrows(IllegalArgumentException.class, () -> RollingMax.rollingMax(numbers));
    }

    @Test
    void testNullNumber() {
        List<Object> numbers = Arrays.asList(1, 2, null, 4, 5);
        assertThrows(NullPointerException.class, () -> RollingMax.rollingMax(numbers));
    }

    @Test
    void testLargeNumbers() {
        List<Object> numbers = Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        List<Object> expected = Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testDuplicateNumbers() {
        List<Object> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        List<Object> expected = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testNegativeNumbers() {
        List<Object> numbers = Arrays.asList(-5, -2, -10, -8, -3);
        List<Object> expected = Arrays.asList(-5, -2, -2, -2, -2);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testMixedNegativeNumbers() {
        List<Object> numbers = Arrays.asList(-5, -2, 3, -10, 8, -8, -3);
        List<Object> expected = Arrays.asList(-5, -2, 3, 3, 8, 8, 8);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }
}
```

This class contains ten unit test cases for the `RollingMax` class. The test cases cover various scenarios, including empty lists, single numbers, increasing and decreasing numbers, random numbers, mixed numbers, null numbers, large numbers, duplicate numbers, and negative numbers. The test cases use the `assertEquals` method to compare the expected output with the actual output of the `rollingMax` method. The `assertThrows` method is used to test for exceptions.