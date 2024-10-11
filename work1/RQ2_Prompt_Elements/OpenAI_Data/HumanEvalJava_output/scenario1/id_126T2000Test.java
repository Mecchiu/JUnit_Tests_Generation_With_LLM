// IsSortedTest.java
package scenario1;

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
    void testIsSorted1() {
        List<Object> lst = List.of();
        assertTrue(IsSorted.isSorted(lst));
    }

    // Test case 2: List with one element
    @Test
    void testIsSorted2() {
        List<Object> lst = List.of(1);
        assertTrue(IsSorted.isSorted(lst));
    }

    // Test case 3: List with two elements
    @Test
    void testIsSorted3() {
        List<Object> lst = List.of(1, 2);
        assertTrue(IsSorted.isSorted(lst));
    }

    // Test case 4: List with three elements
    @Test
    void testIsSorted4() {
        List<Object> lst = List.of(1, 2, 3);
        assertTrue(IsSorted.isSorted(lst));
    }

    // Test case 5: List with four elements
    @Test
    void testIsSorted5() {
        List<Object> lst = List.of(1, 2, 3, 4);
        assertTrue(IsSorted.isSorted(lst));
    }

    // Test case 6: List with five elements
    @Test
    void testIsSorted6() {
        List<Object> lst = List.of(1, 2, 3, 4, 5);
        assertTrue(IsSorted.isSorted(lst));
    }

    // Test case 7: List with six elements
    @Test
    void testIsSorted7() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6);
        assertTrue(IsSorted.isSorted(lst));
    }

    // Test case 8: List with seven elements
    @Test
    void testIsSorted8() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7);
        assertTrue(IsSorted.isSorted(lst));
    }

    // Test case 9: List with eight elements
    @Test
    void testIsSorted9() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertTrue(IsSorted.isSorted(lst));
    }

    // Test case 10: List with nine elements
    @Test
    void testIsSorted10() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertTrue(IsSorted.isSorted(lst));
    }
}
