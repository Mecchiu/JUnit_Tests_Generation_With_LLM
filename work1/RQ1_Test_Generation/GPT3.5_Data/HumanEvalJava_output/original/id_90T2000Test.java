```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

class NextSmallestTest {

    @Test
    void testNextSmallest_Example1() {
        List<Object> input = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(2, NextSmallest.nextSmallest(input));
    }

    @Test
    void testNextSmallest_Example2() {
        List<Object> input = Arrays.asList(5, 1, 4, 3, 2);
        assertEquals(2, NextSmallest.nextSmallest(input));
    }

    @Test
    void testNextSmallest_EmptyList() {
        List<Object> input = Arrays.asList();
        assertEquals(null, NextSmallest.nextSmallest(input));
    }

    @Test
    void testNextSmallest_SameElements() {
        List<Object> input = Arrays.asList(1, 1);
        assertEquals(null, NextSmallest.nextSmallest(input));
    }

    @Test
    void testNextSmallest_AllSameElements() {
        List<Object> input = Arrays.asList(1, 1, 1, 1, 0);
        assertEquals(1, NextSmallest.nextSmallest(input));
    }

    @Test
    void testNextSmallest_NegativeNumbers() {
        List<Object> input = Arrays.asList(-35, 34, 12, -45);
        assertEquals(-35, NextSmallest.nextSmallest(input));
    }
}
```
