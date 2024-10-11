// MaxFillTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxFill}.
* It contains ten unit test cases for the {@link MaxFill#maxFill(List, int)} method.
*/
class MaxFillTest {
			// Test case 1
    @Test
    void testMaxFill1() {
        List<List<Integer>> grid = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        int capacity = 10;
        int expected = 1;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
			// Test case 2
    @Test
    void testMaxFill2() {
        List<List<Integer>> grid = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        int capacity = 1;
        int expected = 45;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
			// Test case 3
    @Test
    void testMaxFill3() {
        List<List<Integer>> grid = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        int capacity = 2;
        int expected = 23;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
			// Test case 4
    @Test
    void testMaxFill4() {
        List<List<Integer>> grid = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        int capacity = 3;
        int expected = 15;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
			// Test case 5
    @Test
    void testMaxFill5() {
        List<List<Integer>> grid = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        int capacity = 4;
        int expected = 12;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
			// Test case 6
    @Test
    void testMaxFill6() {
        List<List<Integer>> grid = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        int capacity = 5;
        int expected = 10;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
			// Test case 7
    @Test
    void testMaxFill7() {
        List<List<Integer>> grid = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        int capacity = 6;
        int expected = 9;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
			// Test case 8
    @Test
    void testMaxFill8() {
        List<List<Integer>> grid = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        int capacity = 7;
        int expected = 8;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
			// Test case 9
    @Test
    void testMaxFill9() {
        List<List<Integer>> grid = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        int capacity = 8;
        int expected = 8;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
			// Test case 10
    @Test
    void testMaxFill10() {
        List<List<Integer>> grid = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        int capacity = 9;
        int expected = 7;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
}