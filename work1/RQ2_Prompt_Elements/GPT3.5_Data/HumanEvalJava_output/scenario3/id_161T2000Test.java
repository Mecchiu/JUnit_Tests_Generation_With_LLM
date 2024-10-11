Here's the completed code for the `Solve` class and `SolveTest` class:

```
// Solve.java
package scenario3;

class Solve {

    /**
     * You are given a string s.
     * if s[i] is a letter, reverse its case from lower to upper or vise versa,
     * otherwise keep it as it is.
     * If the string contains no letters, reverse the string.
     * The function should return the resulted string.
     * Examples
     * solve("1234") = "4321"
     * solve("ab") = "AB"
     * solve("#a@C") = "#A@c"
     *
     * > solve("AsDf")
     * "aSdF"
     * > solve("1234")
     * "4321"
     * > solve("ab")
     * "AB"
     * > solve("#a@C")
     * "#A@c"
     * > solve("#AsdfW^45")
     * "#aSDFw^45"
     * > solve("#6@2")
     * "2@6#"
     * > solve("#$a^D")
     * "#$A^d"
     * > solve("#ccc")
     * "#CCC"
     */
    public static String solve(String s) {
        StringBuilder sb = new StringBuilder();
        boolean hasLetters = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                hasLetters = true;
                if (Character.isUpperCase(c)) {
                    sb.append(Character.toLowerCase(c));
                } else {
                    sb.append(Character.toUpperCase(c));
                }
            } else {
                sb.append(c);
            }
        }
        if (!hasLetters) {
            sb.reverse();
        }
        return sb.toString();
    }
}

// SolveTest.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve}.
* It contains ten unit test cases for the {@link Solve#solve(String)} method.
*/
class SolveTest {

    @Test
    void testSolve1() {
        String result = Solve.solve("AsDf");
        assertEquals("aSdF", result);
    }

    @Test
    void testSolve2() {
        String result = Solve.solve("1234");
        assertEquals("4321", result);
    }

    @Test
    void testSolve3() {
        String result = Solve.solve("ab");
        assertEquals("AB", result);
    }

    @Test
    void testSolve4() {
        String result = Solve.solve("#a@C");
        assertEquals("#A@c", result);
    }

    @Test
    void testSolve5() {
        String result = Solve.solve("#AsdfW^45");
        assertEquals("#aSDFw^45", result);
    }

    @Test
    void testSolve6() {
        String result = Solve.solve("#6@2");
        assertEquals("2@6#", result);
    }

    @Test
    void testSolve7() {
        String result = Solve.solve("#$a^D");
        assertEquals("#$A^d", result);
    }

    @Test
    void testSolve8() {
        String result = Solve.solve("#ccc");
        assertEquals("#CCC", result);
    }

    @Test
    void testSolve9() {
        String result = Solve.solve("a");
        assertEquals("A", result);
    }

    @Test
    void testSolve10() {
        String result = Solve.solve("A");
        assertEquals("a", result);
    }
}
```