// CommonTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains ten unit test cases for the {@link Common#common(List, List)} method.
*/
class CommonTest {
			// Test case 1
    @Test
    void testCommon1() {
        List<Integer> l1 = List.of(1, 4, 3, 34, 653, 2, 5);
        List<Object> l2 = List.of(5, 7, 1, 5, 9, 653, 121);
        List<Object> expected = List.of(1, 5, 653);
        List<Object> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    // Test case 2
    @Test
    void testCommon2() {
        List<Integer> l1 = List.of(5, 3, 2, 8);
        List<Object> l2 = List.of(3, 2);
        List<Object> expected = List.of(2, 3);
        List<Object> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    // Test case 3
    @Test
    void testCommon3() {
        List<Integer> l1 = List.of(4, 3, 2, 8);
        List<Object> l2 = List.of(3, 2, 4);
        List<Object> expected = List.of(2, 3, 4);
        List<Object> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    // Test case 4
    @Test
    void testCommon4() {
        List<Integer> l1 = List.of(4, 3, 2, 8);
        List<Object> l2 = List.of();
        List<Object> expected = List.of();
        List<Object> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    // Test case 5
    @Test
    void testCommon5() {
        List<Integer> l1 = List.of(1, 2, 3, 4, 5);
        List<Object> l2 = List.of(6, 7, 8, 9, 10);
        List<Object> expected = List.of();
        List<Object> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    // Test case 6
    @Test
    void testCommon6() {
        List<Integer> l1 = List.of(1, 2, 3, 4, 5);
        List<Object> l2 = List.of(1, 2, 3, 4, 5);
        List<Object> expected = List.of(1, 2, 3, 4, 5);
        List<Object> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    // Test case 7
    @Test
    void testCommon7() {
        List<Integer> l1 = List.of(1, 2, 3, 4, 5);
        List<Object> l2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Object> expected = List.of(1, 2, 3, 4, 5);
        List<Object> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    // Test case 8
    @Test
    void testCommon8() {
        List<Integer> l1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Object> l2 = List.of(1, 2, 3, 4, 5);
        List<Object> expected = List.of(1, 2, 3, 4, 5);
        List<Object> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    // Test case 9
    @Test
    void testCommon9() {
        List<Integer> l1 = List.of(1, 2, 3, 4, 5);
        List<Object> l2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Object> expected = List.of(1, 2, 3, 4, 5);
        List<Object> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    // Test case 10
    @Test
    void testCommon10() {
        List<Integer> l1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Object> l2 = List.of(1, 2, 3, 4, 5);
        List<Object> expected = List.of(1, 2, 3, 4, 5);
        List<Object> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
}