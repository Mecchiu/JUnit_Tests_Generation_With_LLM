```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import original.Unique;
import java.util.Arrays;
import java.util.List;

class UniqueTest {

    @Test
    void testUniqueWithDuplicates() {
        List<Integer> input = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> expected = Arrays.asList(0, 2, 3, 5, 9, 123);
        List<Integer> result = Unique.unique(input);
        assertEquals(expected, result);
    }

    @Test
    void testUniqueWithoutDuplicates() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = Unique.unique(input);
        assertEquals(expected, result);
    }

    @Test
    void testUniqueWithEmptyList() {
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        List<Integer> result = Unique.unique(input);
        assertEquals(expected, result);
    }

    @Test
    void testUniqueWithSingleElement() {
        List<Integer> input = Arrays.asList(5);
        List<Integer> expected = Arrays.asList(5);
        List<Integer> result = Unique.unique(input);
        assertEquals(expected, result);
    }

    @Test
    void testUniqueWithNegativeNumbers() {
        List<Integer> input = Arrays.asList(-5, -3, -5, -2, -3, -3, -9, 0, -123);
        List<Integer> expected = Arrays.asList(-123, -9, -5, -3, -2, 0);
        List<Integer> result = Unique.unique(input);
        assertEquals(expected, result);
    }

    @Test
    void testUniqueWithMixedNumbers() {
        List<Integer> input = Arrays.asList(5, -3, 5, -2, 3, 3, -9, 0, -123);
        List<Integer> expected = Arrays.asList(-123, -9, -3, -2, 0, 3, 5);
        List<Integer> result = Unique.unique(input);
        assertEquals(expected, result);
    }

    @Test
    void testUniqueWithNullList() {
        List<Integer> input = null;
        List<Integer> expected = Arrays.asList();
        List<Integer> result = Unique.unique(input);
        assertEquals(expected, result);
    }

    @Test
    void testUniqueWithLargeList() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        List<Integer> result = Unique.unique(input);
        assertEquals(expected, result);
    }

    @Test
    void testUniqueWithRepeatedLargeNumbers() {
        List<Integer> input = Arrays.asList(1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000);
        List<Integer> expected = Arrays.asList(1000);
        List<Integer> result = Unique.unique(input);
        assertEquals(expected, result);
    }
}
```
