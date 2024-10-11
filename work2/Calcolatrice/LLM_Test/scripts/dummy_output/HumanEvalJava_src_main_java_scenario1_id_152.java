// CompareTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Compare}.
* It contains ten unit test cases for the {@link Compare#compare(List, List)} method.
*/
class CompareTest {
			// Test case 1: game and guess lists are empty
    @Test
    void testCompareEmptyLists() {
        List<Integer> game = new ArrayList<>();
        List<Integer> guess = new ArrayList<>();
        List<Integer> result = Compare.compare(game, guess);
        assertTrue(result.isEmpty());
    }

    // Test case 2: game list is empty
    @Test
    void testCompareEmptyGameList() {
        List<Integer> game = new ArrayList<>();
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(2);
        guess.add(3);
        List<Integer> result = Compare.compare(game, guess);
        assertTrue(result.isEmpty());
    }

    // Test case 3: guess list is empty
    @Test
    void testCompareEmptyGuessList() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        List<Integer> guess = new ArrayList<>();
        List<Integer> result = Compare.compare(game, guess);
        assertTrue(result.isEmpty());
    }

    // Test case 4: game and guess lists have different sizes
    @Test
    void testCompareDifferentSizeLists() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(2);
        List<Integer> result = Compare.compare(game, guess);
        assertTrue(result.isEmpty());
    }

    // Test case 5: game and guess lists have same size and same elements
    @Test
    void testCompareSameElements() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(2);
        guess.add(3);
        List<Integer> result = Compare.compare(game, guess);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(0);
        expectedResult.add(0);
        expectedResult.add(0);
        assertEquals(expectedResult, result);
    }

    // Test case 6: game and guess lists have same size and different elements
    @Test
    void testCompareDifferentElements() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        List<Integer> guess = new ArrayList<>();
        guess.add(4);
        guess.add(5);
        guess.add(6);
        List<Integer> result = Compare.compare(game, guess);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(3);
        expectedResult.add(3);
        expectedResult.add(3);
        assertEquals(expectedResult, result);
    }

    // Test case 7: game and guess lists have same size and negative elements
    @Test
    void testCompareNegativeElements() {
        List<Integer> game = new ArrayList<>();
        game.add(-1);
        game.add(-2);
        game.add(-3);
        List<Integer> guess = new ArrayList<>();
        guess.add(-4);
        guess.add(-5);
        guess.add(-6);
        List<Integer> result = Compare.compare(game, guess);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(3);
        expectedResult.add(3);
        expectedResult.add(3);
        assertEquals(expectedResult, result);
    }

    // Test case 8: game and guess lists have same size and zero elements
    @Test
    void testCompareZeroElements() {
        List<Integer> game = new ArrayList<>();
        game.add(0);
        game.add(0);
        game.add(0);
        List<Integer> guess = new ArrayList<>();
        guess.add(0);
        guess.add(0);
        guess.add(0);
        List<Integer> result = Compare.compare(game, guess);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(0);
        expectedResult.add(0);
        expectedResult.add(0);
        assertEquals(expectedResult, result);
    }

    // Test case 9: game and guess lists have same size and large elements
    @Test
    void testCompareLargeElements() {
        List<Integer> game = new ArrayList<>();
        game.add(1000000);
        game.add(2000000);
        game.add(3000000);
        List<Integer> guess = new ArrayList<>();
        guess.add(4000000);
        guess.add(5000000);
        guess.add(6000000);
        List<Integer> result = Compare.compare(game, guess);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(3000000);
        expectedResult.add(3000000);
        expectedResult.add(3000000);
        assertEquals(expectedResult, result);
    }

    // Test case 10: game and guess lists have same size and duplicate elements
    @Test
    void testCompareDuplicateElements() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(1);
        game.add(1);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(1);
        guess.add(1);
        List<Integer> result = Compare.compare(game, guess);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(0);
        expectedResult.add(0);
        expectedResult.add(0);
        assertEquals(expectedResult, result);
    }
}