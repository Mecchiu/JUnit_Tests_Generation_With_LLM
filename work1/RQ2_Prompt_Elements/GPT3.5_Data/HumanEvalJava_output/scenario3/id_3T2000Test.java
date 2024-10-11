// BelowZero.java
package scenario3;

import java.util.List;

class BelowZero {

    /**
     * You're given a list of deposit and withdrawal operations on a bank account that starts with
     * zero balance. Your task is to detect if at any point the balance of account falls below zero, and
     * at that point function should return True. Otherwise, it should return False.
     *
     * > belowZero([1, 2, 3])
     * false
     * > belowZero([1, 2, -4, 5])
     * true
     * > belowZero([])
     * false
     * > belowZero([1, 2, -3, 1, 2, -3])
     * false
     * > belowZero([1, 2, -4, 5, 6])
     * true
     * > belowZero([1, -1, 2, -2, 5, -5, 4, -4])
     * false
     * > belowZero([1, -1, 2, -2, 5, -5, 4, -5])
     * true
     * > belowZero([1, -2, 2, -2, 5, -5, 4, -4])
     * true
     */
    public static Boolean belowZero(List<Integer> operations) {
        int balance = 0;
        for (int operation : operations) {
            balance += operation;
            if (balance < 0) {
                return true;
            }
        }
        return false;
    }
}

// BelowZeroTest.java
package scenario3;

import java.util.Arrays;
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
        List<Integer> operations = Arrays.asList();
        assertFalse(BelowZero.belowZero(operations));
    }

    @Test
    void testPositiveOperations() {
        List<Integer> operations = Arrays.asList(1, 2, 3);
        assertFalse(BelowZero.belowZero(operations));
    }

    @Test
    void testNegativeOperations() {
        List<Integer> operations = Arrays.asList(-1, -2, -3);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testMixedOperations() {
        List<Integer> operations = Arrays.asList(1, 2, -4, 5);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testZeroBalance() {
        List<Integer> operations = Arrays.asList(0, 0, 0);
        assertFalse(BelowZero.belowZero(operations));
    }

    @Test
    void testNegativeBalance() {
        List<Integer> operations = Arrays.asList(1, 2, -3, 1, 2, -3);
        assertFalse(BelowZero.belowZero(operations));
    }

    @Test
    void testPositiveBalance() {
        List<Integer> operations = Arrays.asList(1, 2, -4, 5, 6);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testNoNegativeBalance() {
        List<Integer> operations = Arrays.asList(1, -1, 2, -2, 5, -5, 4, -4);
        assertFalse(BelowZero.belowZero(operations));
    }

    @Test
    void testNegativeBalanceAtEnd() {
        List<Integer> operations = Arrays.asList(1, -1, 2, -2, 5, -5, 4, -5);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testNegativeBalanceInMiddle() {
        List<Integer> operations = Arrays.asList(1, -2, 2, -2, 5, -5, 4, -4);
        assertTrue(BelowZero.belowZero(operations));
    }
}