// SumSquaresTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares}.
* It contains ten unit test cases for the {@link SumSquares#sumSquares(List)} method.
*/
class SumSquaresTest {
	// Test case 1: Test with empty list
    @Test
    void testSumSquaresEmptyList() {
        List<Number> lst = List.of();
        int result = SumSquares.sumSquares(lst);
        assertEquals(0, result);
    }

    // Test case 2: Test with list containing one element
    @Test
    void testSumSquaresOneElement() {
        List<Number> lst = List.of(2);
        int result = SumSquares.sumSquares(lst);
        assertEquals(4, result);
    }

    // Test case 3: Test with list containing two elements
    @Test
    void testSumSquaresTwoElements() {
        List<Number> lst = List.of(2, 3);
        int result = SumSquares.sumSquares(lst);
        assertEquals(13, result);
    }

    // Test case 4: Test with list containing three elements
    @Test
    void testSumSquaresThreeElements() {
        List<Number> lst = List.of(2, 3, 4);
        int result = SumSquares.sumSquares(lst);
        assertEquals(29, result);
    }

    // Test case 5: Test with list containing four elements
    @Test
    void testSumSquaresFourElements() {
        List<Number> lst = List.of(2, 3, 4, 5);
        int result = SumSquares.sumSquares(lst);
        assertEquals(55, result);
    }

    // Test case 6: Test with list containing five elements
    @Test
    void testSumSquaresFiveElements() {
        List<Number> lst = List.of(2, 3, 4, 5, 6);
        int result = SumSquares.sumSquares(lst);
        assertEquals(91, result);
    }

    // Test case 7: Test with list containing six elements
    @Test
    void testSumSquaresSixElements() {
        List<Number> lst = List.of(2, 3, 4, 5, 6, 7);
        int result = SumSquares.sumSquares(lst);
        assertEquals(140, result);
    }

    // Test case 8: Test with list containing seven elements
    @Test
    void testSumSquaresSevenElements() {
        List<Number> lst = List.of(2, 3, 4, 5, 6, 7, 8);
        int result = SumSquares.sumSquares(lst);
        assertEquals(204, result);
    }

    // Test case 9: Test with list containing eight elements
    @Test
    void testSumSquaresEightElements() {
        List<Number> lst = List.of(2, 3, 4, 5, 6, 7, 8, 9);
        int result = SumSquares.sumSquares(lst);
        assertEquals(285, result);
    }

    // Test case 10: Test with list containing nine elements
    @Test
    void testSumSquaresNineElements() {
        List<Number> lst = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result = SumSquares.sumSquares(lst);
        assertEquals(385, result);
    }
}
