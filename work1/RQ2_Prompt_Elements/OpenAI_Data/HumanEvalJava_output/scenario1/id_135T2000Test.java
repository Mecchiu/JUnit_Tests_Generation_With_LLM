// CanArrangeTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CanArrange}.
* It contains ten unit test cases for the {@link CanArrange#canArrange(List)} method.
*/
class CanArrangeTest {
	// Test case 1
    @Test
    void testCanArrange1() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6);
        int expected = -1;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }

    // Test case 2
    @Test
    void testCanArrange2() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7);
        int expected = -1;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }

    // Test case 3
    @Test
    void testCanArrange3() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        int expected = -1;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }

    // Test case 4
    @Test
    void testCanArrange4() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int expected = -1;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }

    // Test case 5
    @Test
    void testCanArrange5() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int expected = -1;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }

    // Test case 6
    @Test
    void testCanArrange6() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        int expected = -1;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }

    // Test case 7
    @Test
    void testCanArrange7() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        int expected = -1;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }

    // Test case 8
    @Test
    void testCanArrange8() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        int expected = -1;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }

    // Test case 9
    @Test
    void testCanArrange9() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        int expected = -1;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }

    // Test case 10
    @Test
    void testCanArrange10() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        int expected = -1;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }
}
