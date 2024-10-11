// IntersperseTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersperse}.
* It contains ten unit test cases for the {@link Intersperse#intersperse(List, int)} method.
*/
class IntersperseTest {
	// Test case 1: Empty list
    @Test
    void testIntersperseEmptyList() {
        List<Object> numbers = List.of();
        List<Object> expected = List.of();
        List<Object> actual = Intersperse.intersperse(numbers, 4);
        assertEquals(expected, actual);
    }

    // Test case 2: List with one element
    @Test
    void testIntersperseListWithOneElement() {
        List<Object> numbers = List.of(1);
        List<Object> expected = List.of(1);
        List<Object> actual = Intersperse.intersperse(numbers, 4);
        assertEquals(expected, actual);
    }

    // Test case 3: List with two elements
    @Test
    void testIntersperseListWithTwoElements() {
        List<Object> numbers = List.of(1, 2);
        List<Object> expected = List.of(1, 4, 2);
        List<Object> actual = Intersperse.intersperse(numbers, 4);
        assertEquals(expected, actual);
    }

    // Test case 4: List with three elements
    @Test
    void testIntersperseListWithThreeElements() {
        List<Object> numbers = List.of(1, 2, 3);
        List<Object> expected = List.of(1, 4, 2, 4, 3);
        List<Object> actual = Intersperse.intersperse(numbers, 4);
        assertEquals(expected, actual);
    }

    // Test case 5: List with four elements
    @Test
    void testIntersperseListWithFourElements() {
        List<Object> numbers = List.of(5, 6, 3, 2);
        List<Object> expected = List.of(5, 8, 6, 8, 3, 8, 2);
        List<Object> actual = Intersperse.intersperse(numbers, 8);
        assertEquals(expected, actual);
    }

    // Test case 6: List with five elements
    @Test
    void testIntersperseListWithFiveElements() {
        List<Object> numbers = List.of(2, 2, 2, 2, 2);
        List<Object> expected = List.of(2, 2, 2, 2, 2, 2, 2, 2, 2);
        List<Object> actual = Intersperse.intersperse(numbers, 2);
        assertEquals(expected, actual);
    }

    // Test case 7: List with six elements
    @Test
    void testIntersperseListWithSixElements() {
        List<Object> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Object> expected = List.of(1, 7, 2, 7, 3, 7, 4, 7, 5, 7, 6);
        List<Object> actual = Intersperse.intersperse(numbers, 7);
        assertEquals(expected, actual);
    }

    // Test case 8: List with seven elements
    @Test
    void testIntersperseListWithSevenElements() {
        List<Object> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Object> expected = List.of(1, 8, 2, 8, 3, 8, 4, 8, 5, 8, 6, 8, 7);
        List<Object> actual = Intersperse.intersperse(numbers, 8);
        assertEquals(expected, actual);
    }

    // Test case 9: List with eight elements
    @Test
    void testIntersperseListWithEightElements() {
        List<Object> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Object> expected = List.of(1, 9, 2, 9, 3, 9, 4, 9, 5, 9, 6, 9, 7, 9, 8);
        List<Object> actual = Intersperse.intersperse(numbers, 9);
        assertEquals(expected, actual);
    }

    // Test case 10: List with nine elements
    @Test
    void testIntersperseListWithNineElements() {
        List<Object> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Object> expected = List.of(1, 10, 2, 10, 3, 10, 4, 10, 5, 10, 6, 10, 7, 10, 8, 10, 9);
        List<Object> actual = Intersperse.intersperse(numbers, 10);
        assertEquals(expected, actual);
    }
}
