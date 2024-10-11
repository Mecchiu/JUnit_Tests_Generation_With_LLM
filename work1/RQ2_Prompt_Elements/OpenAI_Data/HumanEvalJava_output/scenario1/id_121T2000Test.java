// SolutionTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solution}.
* It contains ten unit test cases for the {@link Solution#solution(List)} method.
*/
class SolutionTest {
	// Test case 1: Empty list
    @Test
    void testEmptyList() {
        List<Integer> lst = List.of();
        int expected = 0;
        int actual = Solution.solution(lst);
        assertEquals(expected, actual);
    }

    // Test case 2: List with only even numbers
    @Test
    void testEvenNumbers() {
        List<Integer> lst = List.of(2, 4, 6, 8);
        int expected = 0;
        int actual = Solution.solution(lst);
        assertEquals(expected, actual);
    }

    // Test case 3: List with only odd numbers
    @Test
    void testOddNumbers() {
        List<Integer> lst = List.of(1, 3, 5, 7);
        int expected = 0;
        int actual = Solution.solution(lst);
        assertEquals(expected, actual);
    }

    // Test case 4: List with alternating even and odd numbers
    @Test
    void testAlternatingNumbers() {
        List<Integer> lst = List.of(2, 1, 4, 3, 6, 5);
        int expected = 9;
        int actual = Solution.solution(lst);
        assertEquals(expected, actual);
    }

    // Test case 5: List with only one element
    @Test
    void testSingleElement() {
        List<Integer> lst = List.of(5);
        int expected = 0;
        int actual = Solution.solution(lst);
        assertEquals(expected, actual);
    }

    // Test case 6: List with negative numbers
    @Test
    void testNegativeNumbers() {
        List<Integer> lst = List.of(-2, -4, -6, -8);
        int expected = 0;
        int actual = Solution.solution(lst);
        assertEquals(expected, actual);
    }

    // Test case 7: List with zero
    @Test
    void testZero() {
        List<Integer> lst = List.of(0);
        int expected = 0;
        int actual = Solution.solution(lst);
        assertEquals(expected, actual);
    }

    // Test case 8: List with multiple zeros
    @Test
    void testMultipleZeros() {
        List<Integer> lst = List.of(0, 0, 0, 0);
        int expected = 0;
        int actual = Solution.solution(lst);
        assertEquals(expected, actual);
    }

    // Test case 9: List with both even and odd numbers
    @Test
    void testMixedNumbers() {
        List<Integer> lst = List.of(2, 1, 4, 3, 6, 5, 8, 7);
        int expected = 16;
        int actual = Solution.solution(lst);
        assertEquals(expected, actual);
    }

    // Test case 10: List with large numbers
    @Test
    void testLargeNumbers() {
        List<Integer> lst = List.of(1000000, 2000000, 3000000, 4000000);
        int expected = 0;
        int actual = Solution.solution(lst);
        assertEquals(expected, actual);
    }
}