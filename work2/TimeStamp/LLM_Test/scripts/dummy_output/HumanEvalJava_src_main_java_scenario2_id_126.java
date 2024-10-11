// IsSortedTest.java
package scenario2;

import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains ten unit test cases for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {
			// Test case 1: Empty list
    @Test
    void testEmptyList() {
        List<Object> lst = List.of();
        assertTrue(IsSorted.isSorted(lst));
    }

    // Test case 2: List with one element
    @Test
    void testOneElementList() {
        List<Object> lst = List.of(1);
        assertTrue(IsSorted.isSorted(lst));
    }

    // Test case 3: List with two elements
    @Test
    void testTwoElementList() {
        List<Object> lst = List.of(1, 2);
        assertTrue(IsSorted.isSorted(lst));
    }

    // Test case 4: List with three elements
    @Test
    void testThreeElementList() {
        List<Object> lst = List.of(1, 2, 3);
        assertTrue(IsSorted.isSorted(lst));
    }

    // Test case 5: List with four elements
    @Test
    void testFourElementList() {
        List<Object> lst = List.of(1, 2, 3, 4);
        assertTrue(IsSorted.isSorted(lst));
    }

    // Test case 6: List with five elements
    @Test
    void testFiveElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5);
        assertTrue(IsSorted.isSorted(lst));
    }

    // Test case 7: List with six elements
    @Test
    void testSixElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6);
        assertTrue(IsSorted.isSorted(lst));
    }

    // Test case 8: List with seven elements
    @Test
    void testSevenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7);
        assertTrue(IsSorted.isSorted(lst));
    }

    // Test case 9: List with eight elements
    @Test
    void testEightElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertTrue(IsSorted.isSorted(lst));
    }

    // Test case 10: List with nine elements
    @Test
    void testNineElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertTrue(IsSorted.isSorted(lst));
    }
}