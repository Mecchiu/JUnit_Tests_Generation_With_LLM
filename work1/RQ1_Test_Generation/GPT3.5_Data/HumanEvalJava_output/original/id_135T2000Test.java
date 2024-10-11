```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

class CanArrangeTest {

    @Test
    void testCanArrangeExample1() {
        List<Object> arr = Arrays.asList(1, 2, 4, 3, 5);
        assertEquals(3, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrangeExample2() {
        List<Object> arr = Arrays.asList(1, 2, 3);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrangeEmptyArray() {
        List<Object> arr = Arrays.asList();
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrangeDescendingOrder() {
        List<Object> arr = Arrays.asList(5, 4, 3, 2, 1);
        assertEquals(4, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrangeAscendingOrder() {
        List<Object> arr = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrangeMixedOrder() {
        List<Object> arr = Arrays.asList(1, 4, 2, 5, 6, 7, 8, 9, 10);
        assertEquals(2, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrangeSingleElement() {
        List<Object> arr = Arrays.asList(1);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrangeNegativeNumbers() {
        List<Object> arr = Arrays.asList(-1, -2, -3, -4, -5);
        assertEquals(4, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrangeMixedNumbers() {
        List<Object> arr = Arrays.asList(1, -2, 3, -4, 5);
        assertEquals(3, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrangeLargeNumbers() {
        List<Object> arr = Arrays.asList(1000, 2000, 1500, 3000, 2500);
        assertEquals(2, CanArrange.canArrange(arr));
    }
}
```
