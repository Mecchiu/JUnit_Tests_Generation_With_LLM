// Here's the source code for the ParseNestedParensTest class:

package scenario3;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParseNestedParensTest {

    @Test
    void testParseNestedParens() {
        List<Integer> expected1 = Arrays.asList(2, 3, 1, 3);
        List<Integer> result1 = ParseNestedParens.parseNestedParens("(()()) ((())) () ((())()())");
        assertEquals(expected1, result1);

        List<Integer> expected2 = Arrays.asList(1, 2, 3, 4);
        List<Integer> result2 = ParseNestedParens.parseNestedParens("() (()) ((())) (((())))");
        assertEquals(expected2, result2);

        List<Integer> expected3 = Arrays.asList(4);
        List<Integer> result3 = ParseNestedParens.parseNestedParens("(()(())((())))");
        assertEquals(expected3, result3);

        List<Integer> expected4 = Arrays.asList(1, 1, 1, 1, 1);
        List<Integer> result4 = ParseNestedParens.parseNestedParens("() () () () ()");
        assertEquals(expected4, result4);

        List<Integer> expected5 = Arrays.asList(1, 2, 3, 2, 1);
        List<Integer> result5 = ParseNestedParens.parseNestedParens("() (()) (((()))) (()) ()");
        assertEquals(expected5, result5);

        List<Integer> expected6 = Arrays.asList(1, 2, 3, 2, 1, 2, 3, 2, 1);
        List<Integer> result6 = ParseNestedParens.parseNestedParens("() (()) (((()))) (()) () (()) (((()))) (()) ()");
        assertEquals(expected6, result6);

        List<Integer> expected7 = Arrays.asList(1, 2, 3, 2, 1, 2, 3, 2, 1, 2, 3, 2, 1);
        List<Integer> result7 = ParseNestedParens.parseNestedParens("() (()) (((()))) (()) () (()) (((()))) (()) () (()) (((()))) (()) ()");
        assertEquals(expected7, result7);

        List<Integer> expected8 = Arrays.asList(1, 2, 3, 2, 1, 2, 3, 2, 1, 2, 3, 2, 1, 2, 3, 2, 1);
        List<Integer> result8 = ParseNestedParens.parseNestedParens("() (()) (((()))) (()) () (()) (((()))) (()) () (()) (((()))) (()) () (()) (((()))) (()) ()");
        assertEquals(expected8, result8);

        List<Integer> expected9 = Arrays.asList(1, 2, 3, 2, 1, 2, 3, 2, 1, 2, 3, 2, 1, 2, 3, 2, 1, 2, 3, 2, 1);
        List<Integer> result9 = ParseNestedParens.parseNestedParens("() (()) (((()))) (()) () (()) (((()))) (()) () (()) (((()))) (()) () (()) (((()))) (()) () (()) (((()))) (()) ()");
        assertEquals(expected9, result9);

        List<Integer> expected10 = Arrays.asList(1, 2, 3, 2, 1, 2, 3, 2, 1, 2, 3, 2, 1, 2, 3, 2, 1, 2, 3, 2, 1, 2, 3, 2, 1);
        List<Integer> result10 = ParseNestedParens.parseNestedParens("() (()) (((()))) (()) () (()) (((()))) (()) () (()) (((()))) (()) () (()) (((()))) (()) () (()) (((()))) (()) () (()) (((()))) (()) ()");
        assertEquals(expected10, result10);
    }
}