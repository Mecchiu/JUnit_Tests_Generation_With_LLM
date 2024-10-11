```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestSmallestIntegersTest {

    @Test
    void testLargestSmallestIntegers1() {
        List<Object> input = new ArrayList<>();
        assertEquals(List.of(null, null), LargestSmallestIntegers.largestSmallestIntegers(input));
    }

    @Test
    void testLargestSmallestIntegers2() {
        List<Object> input = List.of(2, 4, 1, 3, 5, 7);
        assertEquals(List.of(null, 1), LargestSmallestIntegers.largestSmallestIntegers(input));
    }

    @Test
    void testLargestSmallestIntegers3() {
        List<Object> input = List.of(1, 3, 2, 4, 5, 6, -2);
        assertEquals(List.of(-2, 1), LargestSmallestIntegers.largestSmallestIntegers(input));
    }

    @Test
    void testLargestSmallestIntegers4() {
        List<Object> input = List.of(4, 5, 3, 6, 2, 7, -7);
        assertEquals(List.of(-7, 2), LargestSmallestIntegers.largestSmallestIntegers(input));
    }

    @Test
    void testLargestSmallestIntegers5() {
        List<Object> input = List.of(7, 3, 8, 4, 9, 2, 5, -9);
        assertEquals(List.of(-9, 2), LargestSmallestIntegers.largestSmallestIntegers(input));
    }

    @Test
    void testLargestSmallestIntegers6() {
        List<Object> input = List.of(0);
        assertEquals(List.of(null, null), LargestSmallestIntegers.largestSmallestIntegers(input));
    }

    @Test
    void testLargestSmallestIntegers7() {
        List<Object> input = List.of(-1, -3, -5, -6);
        assertEquals(List.of(-1, null), LargestSmallestIntegers.largestSmallestIntegers(input));
    }

    @Test
    void testLargestSmallestIntegers8() {
        List<Object> input = List.of(-1, -3, -5, -6, 0);
        assertEquals(List.of(-1, null), LargestSmallestIntegers.largestSmallestIntegers(input));
    }

    @Test
    void testLargestSmallestIntegers9() {
        List<Object> input = List.of(-6, -4, -4, -3, 1);
        assertEquals(List.of(-3, 1), LargestSmallestIntegers.largestSmallestIntegers(input));
    }

    @Test
    void testLargestSmallestIntegers10() {
        List<Object> input = List.of(-6, -4, -4, -3, -100, 1);
        assertEquals(List.of(-3, 1), LargestSmallestIntegers.largestSmallestIntegers(input));
    }
}
```
