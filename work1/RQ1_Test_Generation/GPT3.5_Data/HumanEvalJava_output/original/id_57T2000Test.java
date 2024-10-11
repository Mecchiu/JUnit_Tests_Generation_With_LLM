```java
import original.Monotonic;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class MonotonicTest {

    @Test
    void testMonotonicIncreasing() {
        List<Integer> list = Arrays.asList(1, 2, 4, 10);
        assertTrue(Monotonic.monotonic(list));
    }

    @Test
    void testMonotonicDecreasing() {
        List<Integer> list = Arrays.asList(4, 1, 0, -10);
        assertTrue(Monotonic.monotonic(list));
    }

    @Test
    void testMonotonicNonMonotonic() {
        List<Integer> list = Arrays.asList(1, 20, 4, 10);
        assertFalse(Monotonic.monotonic(list));
    }

    @Test
    void testMonotonicEqualElements() {
        List<Integer> list = Arrays.asList(9, 9, 9, 9);
        assertTrue(Monotonic.monotonic(list));
    }

    @Test
    void testMonotonicIncreasingWithEqualElements() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 60);
        assertTrue(Monotonic.monotonic(list));
    }

    @Test
    void testMonotonicNonMonotonicWithEqualElements() {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 5, 60);
        assertFalse(Monotonic.monotonic(list));
    }

    @Test
    void testMonotonicEqualElementsWithDirectionChange() {
        List<Integer> list = Arrays.asList(4, 1, 1, 0);
        assertTrue(Monotonic.monotonic(list));
    }

    @Test
    void testMonotonicSingleElement() {
        List<Integer> list = Arrays.asList(5);
        assertTrue(Monotonic.monotonic(list));
    }

    @Test
    void testMonotonicEmptyList() {
        List<Integer> list = Arrays.asList();
        assertTrue(Monotonic.monotonic(list));
    }
}
```
