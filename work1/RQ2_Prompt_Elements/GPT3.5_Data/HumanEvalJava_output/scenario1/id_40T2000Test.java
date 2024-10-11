// TriplesSumToZeroTest.java
package scenario1;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains ten unit test cases for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {

    @Test
    void testEmptyList() {
        List<Integer> l = Arrays.asList();
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testListWithOneElement() {
        List<Integer> l = Arrays.asList(1);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testListWithTwoElements() {
        List<Integer> l = Arrays.asList(1, 2);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testListWithThreeElementsSumToZero() {
        List<Integer> l = Arrays.asList(-1, 0, 1);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testListWithThreeElementsNotSumToZero() {
        List<Integer> l = Arrays.asList(-1, 0, 2);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testListWithFourElementsSumToZero() {
        List<Integer> l = Arrays.asList(-1, 0, 1, 2);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testListWithFourElementsNotSumToZero() {
        List<Integer> l = Arrays.asList(-1, 0, 1, 3);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testListWithFiveElementsSumToZero() {
        List<Integer> l = Arrays.asList(-1, 0, 1, 2, -2);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testListWithFiveElementsNotSumToZero() {
        List<Integer> l = Arrays.asList(-1, 0, 1, 2, 3);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testListWithSixElementsSumToZero() {
        List<Integer> l = Arrays.asList(-1, 0, 1, 2, -2, 3);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testListWithSixElementsNotSumToZero() {
        List<Integer> l = Arrays.asList(-1, 0, 1, 2, 3, 4);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }
}