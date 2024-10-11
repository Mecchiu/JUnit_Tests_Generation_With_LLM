// CompareTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Compare}.
* It contains ten unit test cases for the {@link Compare#compare(List, List)} method.
*/
class CompareTest {
			// Test case 1: Both lists are empty
    @Test
    void testCompareEmptyLists() {
        List<Integer> game = new ArrayList<>();
        List<Integer> guess = new ArrayList<>();
        List<Integer> result = Compare.compare(game, guess);
        assertTrue(result.isEmpty());
    }

    // Test case 2: One list is empty
    @Test
    void testCompareOneEmptyList() {
        List<Integer> game = new ArrayList<>();
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        List<Integer> result = Compare.compare(game, guess);
        assertTrue(result.isEmpty());
    }

    // Test case 3: Both lists have one element
    @Test
    void testCompareOneElementLists() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(0, result.get(0));
    }

    // Test case 4: Both lists have multiple elements and all guesses are correct
    @Test
    void testCompareCorrectGuesses() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(2);
        guess.add(3);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(0, result.get(0));
        assertEquals(0, result.get(1));
        assertEquals(0, result.get(2));
    }

    // Test case 5: Both lists have multiple elements and all guesses are incorrect
    @Test
    void testCompareIncorrectGuesses() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        List<Integer> guess = new ArrayList<>();
        guess.add(4);
        guess.add(5);
        guess.add(6);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(3, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(3, result.get(2));
    }

    // Test case 6: Both lists have multiple elements and some guesses are correct
    @Test
    void testCompareSomeCorrectGuesses() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(5);
        guess.add(6);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(0, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(3, result.get(2));
    }

    // Test case 7: Both lists have multiple elements and some guesses are incorrect
    @Test
    void testCompareSomeIncorrectGuesses() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        List<Integer> guess = new ArrayList<>();
        guess.add(4);
        guess.add(2);
        guess.add(6);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(3, result.get(0));
        assertEquals(0, result.get(1));
        assertEquals(3, result.get(2));
    }

    // Test case 8: Both lists have multiple elements and all guesses are negative
    @Test
    void testCompareNegativeGuesses() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        List<Integer> guess = new ArrayList<>();
        guess.add(-1);
        guess.add(-2);
        guess.add(-3);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(2, result.get(0));
        assertEquals(4, result.get(1));
        assertEquals(6, result.get(2));
    }

    // Test case 9: Both lists have multiple elements and all guesses are positive
    @Test
    void testComparePositiveGuesses() {
        List<Integer> game = new ArrayList<>();
        game.add(-1);
        game.add(-2);
        game.add(-3);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(2);
        guess.add(3);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(2, result.get(0));
        assertEquals(4, result.get(1));
        assertEquals(6, result.get(2));
    }

    // Test case 10: Both lists have multiple elements and all guesses are zero
    @Test
    void testCompareZeroGuesses() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        List<Integer> guess = new ArrayList<>();
        guess.add(0);
        guess.add(0);
        guess.add(0);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
    }
}