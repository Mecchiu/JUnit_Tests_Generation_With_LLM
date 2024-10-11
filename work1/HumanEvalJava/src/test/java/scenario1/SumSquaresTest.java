// SumSquaresTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares}.
* It contains ten unit test cases for the {@link SumSquares#sumSquares(List)} method.
*/
class SumSquaresTest {
			// Test case 1: Test with an empty list
    @Test
    void testSumSquaresEmptyList() {
        List<Number> lst = List.of();
        int result = SumSquares.sumSquares(lst);
        assertEquals(0, result);
    }

    // Test case 2: Test with a list containing one element
    @Test
    void testSumSquaresOneElement() {
        List<Number> lst = List.of(5);
        int result = SumSquares.sumSquares(lst);
        assertEquals(25, result);
    }

    // Test case 3: Test with a list containing two elements
    @Test
    void testSumSquaresTwoElements() {
        List<Number> lst = List.of(5, 10);
        int result = SumSquares.sumSquares(lst);
        assertEquals(125, result);
    }

    // Test case 4: Test with a list containing three elements
    @Test
    void testSumSquaresThreeElements() {
        List<Number> lst = List.of(5, 10, 15);
        int result = SumSquares.sumSquares(lst);
        assertEquals(350, result);
    }

    // Test case 5: Test with a list containing four elements
    @Test
    void testSumSquaresFourElements() {
        List<Number> lst = List.of(5, 10, 15, 20);
        int result = SumSquares.sumSquares(lst);
        assertEquals(630, result);
    }

    // Test case 6: Test with a list containing five elements
    @Test
    void testSumSquaresFiveElements() {
        List<Number> lst = List.of(5, 10, 15, 20, 25);
        int result = SumSquares.sumSquares(lst);
        assertEquals(1055, result);
    }

    // Test case 7: Test with a list containing six elements
    @Test
    void testSumSquaresSixElements() {
        List<Number> lst = List.of(5, 10, 15, 20, 25, 30);
        int result = SumSquares.sumSquares(lst);
        assertEquals(1615, result);
    }

    // Test case 8: Test with a list containing seven elements
    @Test
    void testSumSquaresSevenElements() {
        List<Number> lst = List.of(5, 10, 15, 20, 25, 30, 35);
        int result = SumSquares.sumSquares(lst);
        assertEquals(2310, result);
    }

    // Test case 9: Test with a list containing eight elements
    @Test
    void testSumSquaresEightElements() {
        List<Number> lst = List.of(5, 10, 15, 20, 25, 30, 35, 40);
        int result = SumSquares.sumSquares(lst);
        assertEquals(3140, result);
    }

    // Test case 10: Test with a list containing nine elements
    @Test
    void testSumSquaresNineElements() {
        List<Number> lst = List.of(5, 10, 15, 20, 25, 30, 35, 40, 45);
        int result = SumSquares.sumSquares(lst);
        assertEquals(4105, result);
    }
}