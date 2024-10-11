// BelowZeroTest.java
package scenario2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link BelowZero}.
 * It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
 */
class BelowZeroTest {

    @Test
    void testEmptyList() {
        List<Object> operations = Collections.emptyList();
        assertFalse(BelowZero.belowZero(operations));
    }

    @Test
    void testZeroBalance() {
        List<Object> operations = Arrays.asList(10.0, -10.0);
        assertFalse(BelowZero.belowZero(operations));
    }

    @Test
    void testPositiveBalance() {
        List<Object> operations = Arrays.asList(100, 50.0, -20.0, 30);
        assertFalse(BelowZero.belowZero(operations));
    }

    @Test
    void testNegativeBalance() {
        List<Object> operations = Arrays.asList(100, -200, 50.0, -20.0, 30);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testAllDeposits() {
        List<Object> operations = Arrays.asList(100, 50.0, 20.0, 30);
        assertFalse(BelowZero.belowZero(operations));
    }

    @Test
    void testAllWithdrawals() {
        List<Object> operations = Arrays.asList(-100, -50.0, -20.0, -30);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testMixedOperations() {
        List<Object> operations = Arrays.asList(100, -50.0, 20.0, -30, 10, -5);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testOnlyDeposits() {
        List<Object> operations = Arrays.asList(100, 50.0, 20.0, 30, 10, 5);
        assertFalse(BelowZero.belowZero(operations));
    }

    @Test
    void testOnlyWithdrawals() {
        List<Object> operations = Arrays.asList(-100, -50.0, -20.0, -30, -10, -5);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testInvalidOperationType() {
        List<Object> operations = Arrays.asList(100, "50.0", 20.0, 30);
        assertThrows(IllegalArgumentException.class, () -> BelowZero.belowZero(operations));
    }
}