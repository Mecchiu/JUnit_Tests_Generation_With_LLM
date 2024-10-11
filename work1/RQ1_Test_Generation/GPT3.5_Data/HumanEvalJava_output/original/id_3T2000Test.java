```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BelowZeroTest {

    @Test
    void testBelowZero_emptyList() {
        assertFalse(BelowZero.belowZero(List.of()));
    }

    @Test
    void testBelowZero_noNegativeBalance() {
        assertFalse(BelowZero.belowZero(List.of(1, 2, 3)));
    }

    @Test
    void testBelowZero_negativeBalanceExists() {
        assertTrue(BelowZero.belowZero(List.of(1, 2, -4, 5)));
    }

    @Test
    void testBelowZero_negativeBalanceInMiddle() {
        assertFalse(BelowZero.belowZero(List.of(1, 2, -3, 1, 2, -3)));
    }

    @Test
    void testBelowZero_negativeBalanceAtEnd() {
        assertTrue(BelowZero.belowZero(List.of(1, 2, -4, 5, 6)));
    }

    @Test
    void testBelowZero_alternatingPositiveNegative() {
        assertFalse(BelowZero.belowZero(List.of(1, -1, 2, -2, 5, -5, 4, -4)));
    }

    @Test
    void testBelowZero_lastOperationNegative() {
        assertTrue(BelowZero.belowZero(List.of(1, -1, 2, -2, 5, -5, 4, -5)));
    }

    @Test
    void testBelowZero_firstOperationNegative() {
        assertTrue(BelowZero.belowZero(List.of(1, -2, 2, -2, 5, -5, 4, -4)));
    }

    @Test
    void testBelowZero_invalidOperationType() {
        assertThrows(IllegalArgumentException.class, () -> BelowZero.belowZero(List.of("invalid")));
    }
}
```
