// TriplesSumToZeroTest.java
package scenario2;

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
    void testListWithThreeElementsSummingToZero() {
        List<Integer> l = Arrays.asList(1, -2, 1);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }
    
    @Test
    void testListWithThreeElementsNotSummingToZero() {
        List<Integer> l = Arrays.asList(1, 2, 3);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }
    
    @Test
    void testListWithFourElementsSummingToZero() {
        List<Integer> l = Arrays.asList(1, -2, 1, 0);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }
    
    @Test
    void testListWithFourElementsNotSummingToZero() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }
    
    @Test
    void testListWithFiveElementsSummingToZero() {
        List<Integer> l = Arrays.asList(1, -2, 1, 0, 0);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }
    
    @Test
    void testListWithFiveElementsNotSummingToZero() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }
    
    @Test
    void testListWithSixElementsSummingToZero() {
        List<Integer> l = Arrays.asList(1, -2, 1, 0, 0, 2);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }
}