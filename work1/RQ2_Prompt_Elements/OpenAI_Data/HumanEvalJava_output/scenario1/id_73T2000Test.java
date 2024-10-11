// SmallestChangeTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SmallestChange}.
* It contains ten unit test cases for the {@link SmallestChange#smallestChange(List)} method.
*/
class SmallestChangeTest {
	// Test case 1: Empty list
    @Test
    void testEmptyList() {
        List<Integer> arr = List.of();
        int result = SmallestChange.smallestChange(arr);
        assertEquals(0, result);
    }

    // Test case 2: List with one element
    @Test
    void testOneElementList() {
        List<Integer> arr = List.of(1);
        int result = SmallestChange.smallestChange(arr);
        assertEquals(0, result);
    }

    // Test case 3: List with two equal elements
    @Test
    void testTwoEqualElementsList() {
        List<Integer> arr = List.of(1, 1);
        int result = SmallestChange.smallestChange(arr);
        assertEquals(0, result);
    }

    // Test case 4: List with two different elements
    @Test
    void testTwoDifferentElementsList() {
        List<Integer> arr = List.of(1, 2);
        int result = SmallestChange.smallestChange(arr);
        assertEquals(1, result);
    }

    // Test case 5: List with three equal elements
    @Test
    void testThreeEqualElementsList() {
        List<Integer> arr = List.of(1, 1, 1);
        int result = SmallestChange.smallestChange(arr);
        assertEquals(0, result);
    }

    // Test case 6: List with three different elements
    @Test
    void testThreeDifferentElementsList() {
        List<Integer> arr = List.of(1, 2, 3);
        int result = SmallestChange.smallestChange(arr);
        assertEquals(2, result);
    }

    // Test case 7: List with four equal elements
    @Test
    void testFourEqualElementsList() {
        List<Integer> arr = List.of(1, 1, 1, 1);
        int result = SmallestChange.smallestChange(arr);
        assertEquals(0, result);
    }

    // Test case 8: List with four different elements
    @Test
    void testFourDifferentElementsList() {
        List<Integer> arr = List.of(1, 2, 3, 4);
        int result = SmallestChange.smallestChange(arr);
        assertEquals(2, result);
    }

    // Test case 9: List with five equal elements
    @Test
    void testFiveEqualElementsList() {
        List<Integer> arr = List.of(1, 1, 1, 1, 1);
        int result = SmallestChange.smallestChange(arr);
        assertEquals(0, result);
    }

    // Test case 10: List with five different elements
    @Test
    void testFiveDifferentElementsList() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        int result = SmallestChange.smallestChange(arr);
        assertEquals(2, result);
    }
}
