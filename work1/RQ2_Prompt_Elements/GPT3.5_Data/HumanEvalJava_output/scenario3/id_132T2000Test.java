// IsNested.java
package scenario3;

import java.util.Stack;

class IsNested {

    /**
     * * Create a function that takes a string as input which contains only square brackets.
     * The function should return True if and only if there is a valid subsequence of brackets
     * where at least one bracket in the subsequence is nested.
     *
     * isNested('[[]]') ➞ True
     * isNested('[]]]]]]][[[[[]') ➞ False
     * isNested('[][]') ➞ False
     * isNested('[]') ➞ False
     * isNested('[[][]]') ➞ True
     * isNested('[[]][[') ➞ True
     *
     * > isNested("[[]]")
     * true
     * > isNested("[]]]]]]][[[[[]")
     * false
     * > isNested("[][]")
     * false
     * > isNested("[]")
     * false
     * > isNested("[[[[]]]]")
     * true
     * > isNested("[]]]]]]]]]]")
     * false
     * > isNested("[][][[]]")
     * true
     * > isNested("[[]")
     * false
     * > isNested("[]]")
     * false
     * > isNested("[[]][[")
     * true
     * > isNested("[[][]]")
     * true
     * > isNested("")
     * false
     * > isNested("[[[[[[[[")
     * false
     * > isNested("]]]]]]]]")
     * false
     */
    public static Boolean isNested(String string) {
        Stack<Character> stack = new Stack<>();
        for (char c : string.toCharArray()) {
            if (c == '[') {
                stack.push(c);
            } else if (c == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                    if (stack.size() > 0) {
                        return true;
                    }
                } else {
                    stack.push(c);
                }
            }
        }
        return false;
    }
}

// IsNestedTest.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsNested}.
* It contains ten unit test cases for the {@link IsNested#isNested(String)} method.
*/
class IsNestedTest {

    @Test
    void testIsNested1() {
        assertTrue(IsNested.isNested("[[]]"));
    }

    @Test
    void testIsNested2() {
        assertFalse(IsNested.isNested("[]]]]]]][[[[[]"));
    }

    @Test
    void testIsNested3() {
        assertFalse(IsNested.isNested("[][]"));
    }

    @Test
    void testIsNested4() {
        assertFalse(IsNested.isNested("[]"));
    }

    @Test
    void testIsNested5() {
        assertTrue(IsNested.isNested("[[[[]]]]"));
    }

    @Test
    void testIsNested6() {
        assertFalse(IsNested.isNested("[]]]]]]]]]]"));
    }

    @Test
    void testIsNested7() {
        assertTrue(IsNested.isNested("[][][[]]"));
    }

    @Test
    void testIsNested8() {
        assertFalse(IsNested.isNested("[[]"));
    }

    @Test
    void testIsNested9() {
        assertFalse(IsNested.isNested("[]]"));
    }

    @Test
    void testIsNested10() {
        assertTrue(IsNested.isNested("[[]][["));
    }

    @Test
    void testIsNested11() {
        assertTrue(IsNested.isNested("[[][]]"));
    }

    @Test
    void testIsNested12() {
        assertFalse(IsNested.isNested(""));
    }

    @Test
    void testIsNested13() {
        assertFalse(IsNested.isNested("[[[[[[[["));
    }

    @Test
    void testIsNested14() {
        assertFalse(IsNested.isNested("]]]]]]]]"));
    }
}