// NextSmallestTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NextSmallest}.
* It contains ten unit test cases for the {@link NextSmallest#nextSmallest(List)} method.
*/
class NextSmallestTest {
	// Test case 1: List is empty
    @Test
    void testNextSmallestEmptyList() {
        List<Object> lst = List.of();
        Integer result = NextSmallest.nextSmallest(lst);
        assertNull(result);
    }
			// Test case 2: List contains only one element
    @Test
    void testNextSmallestOneElement() {
        List<Object> lst = List.of(1);
        Integer result = NextSmallest.nextSmallest(lst);
        assertNull(result);
    }
			// Test case 3: List contains two elements
    @Test
    void testNextSmallestTwoElements() {
        List<Object> lst = List.of(1, 2);
        Integer result = NextSmallest.nextSmallest(lst);
        assertEquals(2, result);
    }
			// Test case 4: List contains two elements with same value
    @Test
    void testNextSmallestTwoElementsSameValue() {
        List<Object> lst = List.of(1, 1);
        Integer result = NextSmallest.nextSmallest(lst);
        assertNull(result);
    }
			// Test case 5: List contains three elements
    @Test
    void testNextSmallestThreeElements() {
        List<Object> lst = List.of(1, 2, 3);
        Integer result = NextSmallest.nextSmallest(lst);
        assertEquals(2, result);
    }
			// Test case 6: List contains three elements with same value
    @Test
    void testNextSmallestThreeElementsSameValue() {
        List<Object> lst = List.of(1, 1, 1);
        Integer result = NextSmallest.nextSmallest(lst);
        assertNull(result);
    }
			// Test case 7: List contains three elements with same value
    @Test
    void testNextSmallestThreeElementsSameValue2() {
        List<Object> lst = List.of(1, 2, 1);
        Integer result = NextSmallest.nextSmallest(lst);
        assertEquals(2, result);
    }
			// Test case 8: List contains three elements with same value
    @Test
    void testNextSmallestThreeElementsSameValue3() {
        List<Object> lst = List.of(2, 1, 1);
        Integer result = NextSmallest.nextSmallest(lst);
        assertEquals(2, result);
    }
			// Test case 9: List contains three elements with same value
    @Test
    void testNextSmallestThreeElementsSameValue4() {
        List<Object> lst = List.of(2, 2, 1);
        Integer result = NextSmallest.nextSmallest(lst);
        assertEquals(2, result);
    }
			// Test case 10: List contains three elements with same value
    @Test
    void testNextSmallestThreeElementsSameValue5() {
        List<Object> lst = List.of(2, 2, 2);
        Integer result = NextSmallest.nextSmallest(lst);
        assertNull(result);
    }
}
