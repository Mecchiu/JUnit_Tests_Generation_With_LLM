```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

class MedianTest {

    @Test
    void testMedian_oddSizeList() {
        List<Integer> list = Arrays.asList(3, 1, 2, 4, 5);
        assertEquals(3, Median.median(list));
    }

    @Test
    void testMedian_evenSizeList() {
        List<Integer> list = Arrays.asList(-10, 4, 6, 1000, 10, 20);
        assertEquals(8.0, Median.median(list));
    }

    @Test
    void testMedian_singleElementList() {
        List<Integer> list = Arrays.asList(5);
        assertEquals(5, Median.median(list));
    }

    @Test
    void testMedian_twoElementList() {
        List<Integer> list = Arrays.asList(6, 5);
        assertEquals(5.5, Median.median(list));
    }

    @Test
    void testMedian_duplicateElementsList() {
        List<Integer> list = Arrays.asList(8, 1, 3, 9, 9, 2, 7);
        assertEquals(7, Median.median(list));
    }
}
```
