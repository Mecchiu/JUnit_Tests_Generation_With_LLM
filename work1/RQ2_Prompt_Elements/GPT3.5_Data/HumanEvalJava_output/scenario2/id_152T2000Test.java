// CompareTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Compare}.
 * It contains ten unit test cases for the {@link Compare#compare(List, List)} method.
 */
class CompareTest {

    @Test
    void testCompareWithCorrectGuesses() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> guess = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 0);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test
    void testCompareWithIncorrectGuesses() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> guess = Arrays.asList(2, 3, 4, 5, 6);
        List<Integer> expected = Arrays.asList(1, 1, 1, 1, 1);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test
    void testCompareWithMixedGuesses() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> guess = Arrays.asList(1, 3, 2, 5, 4);
        List<Integer> expected = Arrays.asList(0, 1, 1, 1, 1);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test
    void testCompareWithEmptyLists() {
        List<Integer> game = new ArrayList<>();
        List<Integer> guess = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test
    void testCompareWithDifferentListSizes() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> guess = Arrays.asList(1, 2, 3, 4);
        assertThrows(IllegalArgumentException.class, () -> Compare.compare(game, guess));
    }

    @Test
    void testCompareWithNullLists() {
        assertThrows(NullPointerException.class, () -> Compare.compare(null, null));
    }

    @Test
    void testCompareWithNullGameList() {
        List<Integer> guess = Arrays.asList(1, 2, 3, 4, 5);
        assertThrows(NullPointerException.class, () -> Compare.compare(null, guess));
    }

    @Test
    void testCompareWithNullGuessList() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5);
        assertThrows(NullPointerException.class, () -> Compare.compare(game, null));
    }

    @Test
    void testCompareWithLargeNumbers() {
        List<Integer> game = Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        List<Integer> guess = Arrays.asList(Integer.MIN_VALUE, Integer.MAX_VALUE, 1);
        List<Integer> expected = Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE, 1);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test
    void testCompareWithNegativeNumbers() {
        List<Integer> game = Arrays.asList(-1, -2, -3, -4, -5);
        List<Integer> guess = Arrays.asList(-1, -3, -2, -5, -4);
        List<Integer> expected = Arrays.asList(0, 1, 1, 1, 1);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }
}