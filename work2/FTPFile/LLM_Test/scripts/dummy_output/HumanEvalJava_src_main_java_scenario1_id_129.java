// MinpathTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minpath}.
* It contains ten unit test cases for the {@link Minpath#minpath(List, int)} method.
*/
class MinpathTest {
			// Test case 1: Empty grid
    @Test
    void testEmptyGrid() {
        List<List<Integer>> grid = new ArrayList<>();
        int k = 5;
        List<Integer> expected = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            expected.add(1);
        }
        List<Integer> actual = Minpath.minpath(grid, k);
        assertEquals(expected, actual);
    }

    // Test case 2: Grid with one element
    @Test
    void testOneElementGrid() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Collections.singletonList(1));
        int k = 5;
        List<Integer> expected = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            expected.add(1);
        }
        List<Integer> actual = Minpath.minpath(grid, k);
        assertEquals(expected, actual);
    }

    // Test case 3: Grid with all elements equal to 1
    @Test
    void testAllOnesGrid() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Collections.nCopies(5, 1));
        grid.add(Collections.nCopies(5, 1));
        grid.add(Collections.nCopies(5, 1));
        grid.add(Collections.nCopies(5, 1));
        grid.add(Collections.nCopies(5, 1));
        int k = 5;
        List<Integer> expected = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            expected.add(1);
        }
        List<Integer> actual = Minpath.minpath(grid, k);
        assertEquals(expected, actual);
    }

    // Test case 4: Grid with all elements equal to 2
    @Test
    void testAllTwosGrid() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Collections.nCopies(5, 2));
        grid.add(Collections.nCopies(5, 2));
        grid.add(Collections.nCopies(5, 2));
        grid.add(Collections.nCopies(5, 2));
        grid.add(Collections.nCopies(5, 2));
        int k = 5;
        List<Integer> expected = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            expected.add(2);
        }
        List<Integer> actual = Minpath.minpath(grid, k);
        assertEquals(expected, actual);
    }

    // Test case 5: Grid with alternating 1s and 2s
    @Test
    void testAlternatingOnesAndTwosGrid() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Collections.nCopies(5, 1));
        grid.add(Collections.nCopies(5, 2));
        grid.add(Collections.nCopies(5, 1));
        grid.add(Collections.nCopies(5, 2));
        grid.add(Collections.nCopies(5, 1));
        int k = 5;
        List<Integer> expected = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (i % 2 == 0) {
                expected.add(1);
            } else {
                expected.add(2);
            }
        }
        List<Integer> actual = Minpath.minpath(grid, k);
        assertEquals(expected, actual);
    }

    // Test case 6: Grid with all elements equal to 3
    @Test
    void testAllThreesGrid() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Collections.nCopies(5, 3));
        grid.add(Collections.nCopies(5, 3));
        grid.add(Collections.nCopies(5, 3));
        grid.add(Collections.nCopies(5, 3));
        grid.add(Collections.nCopies(5, 3));
        int k = 5;
        List<Integer> expected = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            expected.add(3);
        }
        List<Integer> actual = Minpath.minpath(grid, k);
        assertEquals(expected, actual);
    }

    // Test case 7: Grid with alternating 1s, 2s and 3s
    @Test
    void testAlternatingOnesTwosAndThreesGrid() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Collections.nCopies(5, 1));
        grid.add(Collections.nCopies(5, 2));
        grid.add(Collections.nCopies(5, 3));
        grid.add(Collections.nCopies(5, 1));
        grid.add(Collections.nCopies(5, 2));
        int k = 5;
        List<Integer> expected = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (i % 3 == 0) {
                expected.add(1);
            } else if (i % 3 == 1) {
                expected.add(2);
            } else {
                expected.add(3);
            }
        }
        List<Integer> actual = Minpath.minpath(grid, k);
        assertEquals(expected, actual);
    }

    // Test case 8: Grid with all elements equal to 4
    @Test
    void testAllFoursGrid() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Collections.nCopies(5, 4));
        grid.add(Collections.nCopies(5, 4));
        grid.add(Collections.nCopies(5, 4));
        grid.add(Collections.nCopies(5, 4));
        grid.add(Collections.nCopies(5, 4));
        int k = 5;
        List<Integer> expected = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            expected.add(4);
        }
        List<Integer> actual = Minpath.minpath(grid, k);
        assertEquals(expected, actual);
    }

    // Test case 9: Grid with alternating 1s, 2s, 3s and 4s
    @Test
    void testAlternatingOnesTwosThreesAndFoursGrid() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Collections.nCopies(5, 1));
        grid.add(Collections.nCopies(5, 2));
        grid.add(Collections.nCopies(5, 3));
        grid.add(Collections.nCopies(5, 4));
        grid.add(Collections.nCopies(5, 1));
        int k = 5;
        List<Integer> expected = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (i % 4 == 0) {
                expected.add(1);
            } else if (i % 4 == 1) {
                expected.add(2);
            } else if (i % 4 == 2) {
                expected.add(3);
            } else {
                expected.add(4);
            }
        }
        List<Integer> actual = Minpath.minpath(grid, k);
        assertEquals(expected, actual);
    }

    // Test case 10: Grid with all elements equal to 5
    @Test
    void testAllFivesGrid() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Collections.nCopies(5, 5));
        grid.add(Collections.nCopies(5, 5));
        grid.add(Collections.nCopies(5, 5));
        grid.add(Collections.nCopies(5, 5));
        grid.add(Collections.nCopies(5, 5));
        int k = 5;
        List<Integer> expected = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            expected.add(5);
        }
        List<Integer> actual = Minpath.minpath(grid, k);
        assertEquals(expected, actual);
    }
}