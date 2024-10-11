```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class BelowThresholdTest {

    @Test
    void testBelowThreshold_AllNumbersBelowThreshold_ReturnsTrue() {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 10);
        assertTrue(BelowThreshold.belowThreshold(numbers, 100));
    }

    @Test
    void testBelowThreshold_SomeNumbersAboveThreshold_ReturnsFalse() {
        List<Integer> numbers = Arrays.asList(1, 20, 4, 10);
        assertFalse(BelowThreshold.belowThreshold(numbers, 5));
    }

    @Test
    void testBelowThreshold_AllNumbersAboveThreshold_ReturnsTrue() {
        List<Integer> numbers = Arrays.asList(1, 20, 4, 10);
        assertTrue(BelowThreshold.belowThreshold(numbers, 21));
    }

    @Test
    void testBelowThreshold_AllNumbersAboveThreshold_ReturnsTrue2() {
        List<Integer> numbers = Arrays.asList(1, 20, 4, 10);
        assertTrue(BelowThreshold.belowThreshold(numbers, 22));
    }

    @Test
    void testBelowThreshold_SomeNumbersAboveThreshold_ReturnsTrue() {
        List<Integer> numbers = Arrays.asList(1, 8, 4, 10);
        assertTrue(BelowThreshold.belowThreshold(numbers, 11));
    }

    @Test
    void testBelowThreshold_SomeNumbersEqualToThreshold_ReturnsFalse() {
        List<Integer> numbers = Arrays.asList(1, 8, 4, 10);
        assertFalse(BelowThreshold.belowThreshold(numbers, 10));
    }
}
```
