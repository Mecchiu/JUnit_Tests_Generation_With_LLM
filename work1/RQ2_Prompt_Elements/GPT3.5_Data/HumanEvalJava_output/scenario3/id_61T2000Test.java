// CorrectBracketing1.java
package scenario3;

class CorrectBracketing1 {

    /**
     * brackets is a string of "(" and ")".
     * return True if every opening bracket has a corresponding closing bracket.
     *
     * > correctBracketing("()")
     * true
     * > correctBracketing("(()())")
     * true
     * > correctBracketing("()()(()())()")
     * true
     * > correctBracketing("()()((()()())())(()()(()))")
     * true
     * > correctBracketing("((()())))")
     * false
     * > correctBracketing(")(()")
     * false
     * > correctBracketing("(")
     * false
     * > correctBracketing("((((")
     * false
     * > correctBracketing(")")
     * false
     * > correctBracketing("(()")
     * false
     * > correctBracketing("()()(()())())(()")
     * false
     * > correctBracketing("()()(()())()))()")
     * false
     */
    public static Boolean correctBracketing(String brackets) {
        int count = 0;
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(') {
                count++;
            } else if (brackets.charAt(i) == ')') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }
}

// CorrectBracketing1Test.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing1}.
* It contains ten unit test cases for the {@link CorrectBracketing1#correctBracketing(String)} method.
*/
class CorrectBracketing1Test {
    @Test
    void testCorrectBracketing1() {
        assertTrue(CorrectBracketing1.correctBracketing("()"));
    }

    @Test
    void testCorrectBracketing2() {
        assertTrue(CorrectBracketing1.correctBracketing("(()())"));
    }

    @Test
    void testCorrectBracketing3() {
        assertTrue(CorrectBracketing1.correctBracketing("()()(()())()"));
    }

    @Test
    void testCorrectBracketing4() {
        assertTrue(CorrectBracketing1.correctBracketing("()()((()()())())(()()(()))"));
    }

    @Test
    void testCorrectBracketing5() {
        assertFalse(CorrectBracketing1.correctBracketing("((()())))"));
    }

    @Test
    void testCorrectBracketing6() {
        assertFalse(CorrectBracketing1.correctBracketing(")(()"));
    }

    @Test
    void testCorrectBracketing7() {
        assertFalse(CorrectBracketing1.correctBracketing("("));
    }

    @Test
    void testCorrectBracketing8() {
        assertFalse(CorrectBracketing1.correctBracketing("((((("));
    }

    @Test
    void testCorrectBracketing9() {
        assertFalse(CorrectBracketing1.correctBracketing(")"));
    }

    @Test
    void testCorrectBracketing10() {
        assertFalse(CorrectBracketing1.correctBracketing("(()"));
    }

    @Test
    void testCorrectBracketing11() {
        assertFalse(CorrectBracketing1.correctBracketing("()()(()())())(()"));
    }

    @Test
    void testCorrectBracketing12() {
        assertFalse(CorrectBracketing1.correctBracketing("()()(()())()))()"));
    }
}