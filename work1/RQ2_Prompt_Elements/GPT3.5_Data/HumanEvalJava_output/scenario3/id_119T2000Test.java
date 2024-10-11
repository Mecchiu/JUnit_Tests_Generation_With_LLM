// MatchParens.java
package scenario3;

import java.util.List;
import java.util.Stack;

class MatchParens {

    /**
     * * You are given a list of two strings, both strings consist of open
     * parentheses '(' or close parentheses ')' only.
     * Your job is to check if it is possible to concatenate the two strings in
     * some order, that the resulting string will be good.
     * A string S is considered to be good if and only if all parentheses in S
     * are balanced. For example: the string '(())()' is good, while the string
     * '())' is not.
     * Return 'Yes' if there's a way to make a good string, and return 'No' otherwise.
     *
     * Examples:
     * matchParens(['()(', ')']) == 'Yes'
     * matchParens([')', ')']) == 'No'
     *
     * > matchParens(["()(", ")"])
     * "Yes"
     * > matchParens([")", ")"])
     * "No"
     * > matchParens(["(()(())", "())())"])
     * "No"
     * > matchParens([")())", "(()()("])
     * "Yes"
     * > matchParens(["(())))", "(()())(("])
     * "Yes"
     * > matchParens(["()", "())"])
     * "No"
     * > matchParens(["(()(", "()))()"])
     * "Yes"
     * > matchParens(["((((", "((())"])
     * "No"
     * > matchParens([")(()", "(()("])
     * "No"
     * > matchParens([")(", ")("])
     * "No"
     * > matchParens(["(", ")"])
     * "Yes"
     * > matchParens([")", "("])
     * "Yes"
     */
    public static String matchParens(List<String> lst) {
        String s1 = lst.get(0);
        String s2 = lst.get(1);
        String s = s1 + s2;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "No";
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty() ? "Yes" : "No";
    }
}

// MatchParensTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MatchParens}.
* It contains ten unit test cases for the {@link MatchParens#matchParens(List)} method.
*/
class MatchParensTest {

    @Test
    void testMatchParens1() {
        List<String> lst = Arrays.asList("()(", ")");
        String expected = "Yes";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchParens2() {
        List<String> lst = Arrays.asList(")", ")");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchParens3() {
        List<String> lst = Arrays.asList("(()(())", "())())");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchParens4() {
        List<String> lst = Arrays.asList(")())", "(()()(");
        String expected = "Yes";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchParens5() {
        List<String> lst = Arrays.asList("(())))", "(()())((");
        String expected = "Yes";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchParens6() {
        List<String> lst = Arrays.asList("()", "())");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchParens7() {
        List<String> lst = Arrays.asList("(()(", "()))()");
        String expected = "Yes";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchParens8() {
        List<String> lst = Arrays.asList("((((", "((())");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchParens9() {
        List<String> lst = Arrays.asList(")(()", "(()(");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchParens10() {
        List<String> lst = Arrays.asList(")(", ")(");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchParens11() {
        List<String> lst = Arrays.asList("(", ")");
        String expected = "Yes";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchParens12() {
        List<String> lst = Arrays.asList(")", "(");
        String expected = "Yes";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }
}