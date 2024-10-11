// SeparateParenGroups.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class SeparateParenGroups {

    /**
     * Input to this function is a string containing multiple groups of nested parentheses.
     * Your goal is to separate those group into separate strings and return the list of those.
     * Separate groups are balanced (each open brace is properly closed) and not nested within each other.
     * Ignore any spaces in the input string.
     *
     * > separateParenGroups("(()()) ((())) () ((())()())")
     * ["(()())", "((()))", "()", "((())()())"]
     * > separateParenGroups("() (()) ((())) (((())))")
     * ["()", "(())", "((()))", "(((())))"]
     * > separateParenGroups("(()(())((())))")
     * ["(()(())((())))"]
     * > separateParenGroups("( ) (( )) (( )( ))")
     * ["()", "(())", "(()())"]
     */
    public static List<String> separateParenGroups(String parenString) {
        List<String> result = new ArrayList<>();
        int start = 0;
        int end = 0;
        int count = 0;
        for (int i = 0; i < parenString.length(); i++) {
            char c = parenString.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
            if (count == 0) {
                end = i;
                result.add(parenString.substring(start, end + 1).replaceAll("\\s+", ""));
                start = i + 1;
            }
        }
        return result;
    }
}

// SeparateParenGroupsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SeparateParenGroups}.
* It contains ten unit test cases for the {@link SeparateParenGroups#separateParenGroups(String)} method.
*/
class SeparateParenGroupsTest {

    @Test
    void testSeparateParenGroups1() {
        List<String> result = SeparateParenGroups.separateParenGroups("(()()) ((())) () ((())()())");
        List<String> expected = List.of("(()())", "((()))", "()", "((())()())");
        assertEquals(expected, result);
    }

    @Test
    void testSeparateParenGroups2() {
        List<String> result = SeparateParenGroups.separateParenGroups("() (()) ((())) (((())))");
        List<String> expected = List.of("()", "(())", "((()))", "(((())))");
        assertEquals(expected, result);
    }

    @Test
    void testSeparateParenGroups3() {
        List<String> result = SeparateParenGroups.separateParenGroups("(()(())((())))");
        List<String> expected = List.of("(()(())((())))");
        assertEquals(expected, result);
    }

    @Test
    void testSeparateParenGroups4() {
        List<String> result = SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))");
        List<String> expected = List.of("()", "(())", "(()())");
        assertEquals(expected, result);
    }

    @Test
    void testSeparateParenGroups5() {
        List<String> result = SeparateParenGroups.separateParenGroups("()()()()()()()()()()");
        List<String> expected = List.of("()", "()", "()", "()", "()", "()", "()", "()", "()");
        assertEquals(expected, result);
    }

    @Test
    void testSeparateParenGroups6() {
        List<String> result = SeparateParenGroups.separateParenGroups("((((((())))))))");
        List<String> expected = List.of("((((((())))))))");
        assertEquals(expected, result);
    }

    @Test
    void testSeparateParenGroups7() {
        List<String> result = SeparateParenGroups.separateParenGroups("()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()