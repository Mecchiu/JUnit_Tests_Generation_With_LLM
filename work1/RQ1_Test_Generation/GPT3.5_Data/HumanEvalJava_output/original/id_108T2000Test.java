```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

class CountNumsTest {

    @Test
    void testEmptyList() {
        List<Object> arr = Arrays.asList();
        assertEquals(0, CountNums.countNums(arr));
    }

    @Test
    void testNegativeNumbers() {
        List<Object> arr = Arrays.asList(-1, -2, 0);
        assertEquals(0, CountNums.countNums(arr));
    }

    @Test
    void testPositiveNumbers() {
        List<Object> arr = Arrays.asList(1, 1, 2, -2, 3, 4, 5);
        assertEquals(6, CountNums.countNums(arr));
    }

    @Test
    void testMixedNumbers() {
        List<Object> arr = Arrays.asList(1, 6, 9, -6, 0, 1, 5);
        assertEquals(5, CountNums.countNums(arr));
    }

    @Test
    void testLargeNumbers() {
        List<Object> arr = Arrays.asList(1, 100, 98, -7, 1, -1);
        assertEquals(4, CountNums.countNums(arr));
    }

    @Test
    void testMixedLargeNumbers() {
        List<Object> arr = Arrays.asList(12, 23, 34, -45, -56, 0);
        assertEquals(5, CountNums.countNums(arr));
    }

    @Test
    void testSinglePositiveNumber() {
        List<Object> arr = Arrays.asList(0, 1);
        assertEquals(1, CountNums.countNums(arr));
    }

    @Test
    void testSingleNegativeNumber() {
        List<Object> arr = Arrays.asList(1);
        assertEquals(1, CountNums.countNums(arr));
    }
}
```
