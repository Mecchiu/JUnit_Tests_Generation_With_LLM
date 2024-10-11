```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

class MaxElementTest {

    @Test
    void testMaxElementWithPositiveNumbers() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        assertEquals(3, MaxElement.maxElement(list));
    }

    @Test
    void testMaxElementWithNegativeNumbers() {
        List<Integer> list = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
        assertEquals(123, MaxElement.maxElement(list));
    }

    @Test
    void testMaxElementWithDifferentMax() {
        List<Integer> list = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10);
        assertEquals(124, MaxElement.maxElement(list));
    }

    // Add more test cases as needed
}
```
