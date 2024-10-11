// PairsSumToZeroTest.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PairsSumToZero}.
* It contains ten unit test cases for the {@link PairsSumToZero#pairsSumToZero(List)} method.
*/
class PairsSumToZeroTest {

    @Test
    void testEmptyList() {
        List<Integer> l = Arrays.asList();
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }

    @Test
    void testSingleElementList() {
        List<Integer> l = Arrays.asList(5);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }

    @Test
    void testTwoElementListSumToZero() {
        List<Integer> l = Arrays.asList(-2, 2);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    @Test
    void testTwoElementListNotSumToZero() {
        List<Integer> l = Arrays.asList(-2, 3);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }

    @Test
    void testThreeElementListSumToZero() {
        List<Integer> l = Arrays.asList(-1, 2, -1);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    @Test
    void testThreeElementListNotSumToZero() {
        List<Integer> l = Arrays.asList(-1, 2, 3);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }

    @Test
    void testFourElementListSumToZero() {
        List<Integer> l = Arrays.asList(-1, 2, 1, -2);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    @Test
    void testFourElementListNotSumToZero() {
        List<Integer> l = Arrays.asList(-1, 2, 3, 4);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }

    @Test
    void testLargeListSumToZero() {
        List<Integer> l = Arrays.asList(-1, 2, 1, -2, 3, -3, 4, -4, 5, -5);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    @Test
    void testLargeListNotSumToZero() {
        List<Integer> l = Arrays.asList(-1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }
}