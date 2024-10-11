// MatchParensTest.java
package scenario1;

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
        List<String> lst = Arrays.asList("()", "()()");
        String result = MatchParens.matchParens(lst);
        assertEquals("Yes", result);
    }

    @Test
    void testMatchParens2() {
        List<String> lst = Arrays.asList("()", "())");
        String result = MatchParens.matchParens(lst);
        assertEquals("No", result);
    }

    @Test
    void testMatchParens3() {
        List<String> lst = Arrays.asList("(", ")");
        String result = MatchParens.matchParens(lst);
        assertEquals("No", result);
    }

    @Test
    void testMatchParens4() {
        List<String> lst = Arrays.asList("()", "()");
        String result = MatchParens.matchParens(lst);
        assertEquals("Yes", result);
    }

    @Test
    void testMatchParens5() {
        List<String> lst = Arrays.asList("(", "(");
        String result = MatchParens.matchParens(lst);
        assertEquals("No", result);
    }

    @Test
    void testMatchParens6() {
        List<String> lst = Arrays.asList("()", "(())");
        String result = MatchParens.matchParens(lst);
        assertEquals("Yes", result);
    }

    @Test
    void testMatchParens7() {
        List<String> lst = Arrays.asList("()", "(()))");
        String result = MatchParens.matchParens(lst);
        assertEquals("No", result);
    }

    @Test
    void testMatchParens8() {
        List<String> lst = Arrays.asList("()", "(()())");
        String result = MatchParens.matchParens(lst);
        assertEquals("Yes", result);
    }

    @Test
    void testMatchParens9() {
        List<String> lst = Arrays.asList("()", "(()))(");
        String result = MatchParens.matchParens(lst);
        assertEquals("No", result);
    }

    @Test
    void testMatchParens10() {
        List<String> lst = Arrays.asList("()", "(()))()");
        String result = MatchParens.matchParens(lst);
        assertEquals("No", result);
    }
}