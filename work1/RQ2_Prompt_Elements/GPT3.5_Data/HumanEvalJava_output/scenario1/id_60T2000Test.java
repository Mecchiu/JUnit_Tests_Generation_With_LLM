// Here's the source code for the SumToNTest class with ten unit test cases for the SumToN.sumToN() method.

package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link SumToN}.
 * It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
 */
class SumToNTest {

    @Test
    void testSumToNWithZero() {
        int result = SumToN.sumToN(0);
        assertEquals(0, result);
    }

    @Test
    void testSumToNWithOne() {
        int result = SumToN.sumToN(1);
        assertEquals(1, result);
    }

    @Test
    void testSumToNWithTwo() {
        int result = SumToN.sumToN(2);
        assertEquals(3, result);
    }

    @Test
    void testSumToNWithThree() {
        int result = SumToN.sumToN(3);
        assertEquals(6, result);
    }

    @Test
    void testSumToNWithFour() {
        int result = SumToN.sumToN(4);
        assertEquals(10, result);
    }

    @Test
    void testSumToNWithFive() {
        int result = SumToN.sumToN(5);
        assertEquals(15, result);
    }

    @Test
    void testSumToNWithSix() {
        int result = SumToN.sumToN(6);
        assertEquals(21, result);
    }

    @Test
    void testSumToNWithSeven() {
        int result = SumToN.sumToN(7);
        assertEquals(28, result);
    }

    @Test
    void testSumToNWithEight() {
        int result = SumToN.sumToN(8);
        assertEquals(36, result);
    }

    @Test
    void testSumToNWithNine() {
        int result = SumToN.sumToN(9);
        assertEquals(45, result);
    }
}