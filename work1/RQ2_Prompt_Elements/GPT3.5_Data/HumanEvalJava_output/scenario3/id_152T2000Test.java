// Compare.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class Compare {

    /**
     * I think we all remember that feeling when the result of some long-awaited
     * event is finally known. The feelings and thoughts you have at that moment are
     * definitely worth noting down and comparing.
     * Your task is to determine if a person correctly guessed the results of a number of matches.
     * You are given two arrays of scores and guesses of equal length, where each index shows a match.
     * Return an array of the same length denoting how far off each guess was. If they have guessed correctly,
     * the value is 0, and if not, the value is the absolute difference between the guess and the score.
     *
     * example:
     *
     * compare([1,2,3,4,5,1],[1,2,3,4,2,-2]) -> [0,0,0,0,3,3]
     * compare([0,5,0,0,0,4],[4,1,1,0,0,-2]) -> [4,4,1,0,0,6]
     *
     * > compare([1, 2, 3, 4, 5, 1], [1, 2, 3, 4, 2, -2])
     * [0, 0, 0, 0, 3, 3]
     * > compare([0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0])
     * [0, 0, 0, 0, 0, 0]
     * > compare([1, 2, 3], [-1, -2, -3])
     * [2, 4, 6]
     * > compare([1, 2, 3, 5], [-1, 2, 3, 4])
     * [2, 0, 0, 1]
     */
    public static List<Integer> compare(List<Integer> game, List<Integer> guess) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < game.size(); i++) {
            int diff = Math.abs(game.get(i) - guess.get(i));
            result.add(diff);
        }
        return result;
    }
}

// CompareTest.java
package scenario3;

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
    void testCompare() {
        List<Integer> game1 = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> guess1 = Arrays.asList(1, 2, 3, 4, 2, -2);
        List<Integer> expected1 = Arrays.asList(0, 0, 0, 0, 3, 3);
        assertEquals(expected1, Compare.compare(game1, guess1));
        
        List<Integer> game2 = Arrays.asList(0, 5, 0, 0, 0, 4);
        List<Integer> guess2 = Arrays.asList(4, 1, 1, 0, 0, -2);
        List<Integer> expected2 = Arrays.asList(4, 4, 1, 0, 0, 6);
        assertEquals(expected2, Compare.compare(game2, guess2));
        
        List<Integer> game3 = Arrays.asList(1, 2, 3);
        List<Integer> guess3 = Arrays.asList(-1, -2, -3);
        List<Integer> expected3 = Arrays.asList(2, 4, 6);
        assertEquals(expected3, Compare.compare(game3, guess3));
        
        List<Integer> game4 = Arrays.asList(1, 2, 3, 5);
        List<Integer> guess4 = Arrays.asList(-1, 2, 3, 4);
        List<Integer> expected4 = Arrays.asList(2, 0, 0, 1);
        assertEquals(expected4, Compare.compare(game4, guess4));
        
        List<Integer> game5 = Arrays.asList(0, 0, 0, 0, 0, 0);
        List<Integer> guess5 = Arrays.asList(0, 0, 0, 0, 0, 0);
        List<Integer> expected5 = Arrays.asList(0, 0, 0, 0, 0, 0);
        assertEquals(expected5, Compare.compare(game5, guess5));
        
        List<Integer> game6 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> guess6 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected6 = Arrays.asList(0, 0, 0, 0, 0);
        assertEquals(expected6, Compare.compare(game6, guess6));
        
        List<Integer> game7 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> guess7 = Arrays.asList(6, 7, 8, 9, 10);
        List<Integer> expected7 = Arrays.asList(5, 5, 5, 5, 5);
        assertEquals(expected7, Compare.compare(game7, guess7));
        
        List<Integer> game8 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> guess8 = Arrays.asList(5, 4, 3, 2, 1);
        List<Integer> expected8 = Arrays.asList(4, 2, 0, 2, 4);
        assertEquals(expected8, Compare.compare(game8, guess8));
        
        List<Integer> game9 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> guess9 = Arrays.asList(0, 0, 0, 0, 0);
        List<Integer> expected9 = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected9, Compare.compare(game9, guess9));
        
        List<Integer> game10 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> guess10 = Arrays.asList(1, 1, 1, 1, 1);
        List<Integer> expected10 = Arrays.asList(0, 1, 2, 3, 4);
        assertEquals(expected10, Compare.compare(game10, guess10));
    }
}