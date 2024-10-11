```java
import original.RollingMax;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class RollingMaxTest {

    @Test
    void testRollingMax_emptyList() {
        List<Object> input = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMax_increasingSequence() {
        List<Object> input = List.of(1, 2, 3, 4);
        List<Object> expected = List.of(1, 2, 3, 4);
        assertEquals(expected, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMax_decreasingSequence() {
        List<Object> input = List.of(4, 3, 2, 1);
        List<Object> expected = List.of(4, 4, 4, 4);
        assertEquals(expected, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMax_mixedSequence() {
        List<Object> input = List.of(1, 2, 3, 2, 3, 4, 2);
        List<Object> expected = List.of(1, 2, 3, 3, 3, 4, 4);
        assertEquals(expected, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMax_singleElement() {
        List<Object> input = List.of(5);
        List<Object> expected = List.of(5);
        assertEquals(expected, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMax_allEqualElements() {
        List<Object> input = List.of(2, 2, 2, 2);
        List<Object> expected = List.of(2, 2, 2, 2);
        assertEquals(expected, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMax_negativeNumbers() {
        List<Object> input = List.of(-1, -2, -3, -2, -3, -4, -2);
        List<Object> expected = List.of(-1, -1, -1, -1, -1, -1, -1);
        assertEquals(expected, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMax_withZero() {
        List<Object> input = List.of(0, 1, 0, 2, 0, 3, 0);
        List<Object> expected = List.of(0, 1, 1, 2, 2, 3, 3);
        assertEquals(expected, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMax_invalidInput() {
        List<Object> input = List.of(1, 2, "3", 4);
        assertThrows(IllegalArgumentException.class, () -> RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMax_largeNumbers() {
        List<Object> input = List.of(1000, 2000, 1500, 3000, 2500);
        List<Object> expected = List.of(1000, 2000, 2000, 3000, 3000);
        assertEquals(expected, RollingMax.rollingMax(input));
    }
}
```
