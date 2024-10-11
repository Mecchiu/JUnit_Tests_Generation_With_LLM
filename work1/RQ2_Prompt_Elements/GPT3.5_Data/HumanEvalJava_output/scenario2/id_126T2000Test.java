// Here's the source code for the IsSortedTest class:

package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsSortedTest {

    @Test
    void testEmptyList() {
        List<Object> lst = Arrays.asList();
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testSingleElementList() {
        List<Object> lst = Arrays.asList(1);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testTwoElementSortedList() {
        List<Object> lst = Arrays.asList(1, 2);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testTwoElementUnsortedList() {
        List<Object> lst = Arrays.asList(2, 1);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testThreeElementSortedList() {
        List<Object> lst = Arrays.asList(1, 2, 3);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testThreeElementUnsortedList() {
        List<Object> lst = Arrays.asList(1, 3, 2);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testDuplicateElements() {
        List<Object> lst = Arrays.asList(1, 2, 2);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testMultipleDuplicateElements() {
        List<Object> lst = Arrays.asList(1, 2, 2, 2);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testLargeSortedList() {
        List<Object> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testLargeUnsortedList() {
        List<Object> lst = Arrays.asList(1, 2, 3, 4, 5, 10, 9, 8, 7, 6);
        assertFalse(IsSorted.isSorted(lst));
    }
}