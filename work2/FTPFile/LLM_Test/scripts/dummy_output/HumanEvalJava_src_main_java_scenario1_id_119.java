// MatchParensTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MatchParens}.
* It contains ten unit test cases for the {@link MatchParens#matchParens(List)} method.
*/
class MatchParensTest {
			// Test case 1
    @Test
    void testMatchParens1() {
        List<String> lst = List.of("(", ")");
        String result = MatchParens.matchParens(lst);
        assertEquals("Yes", result);
    }
			// Test case 2
    @Test
    void testMatchParens2() {
        List<String> lst = List.of("(", "()");
        String result = MatchParens.matchParens(lst);
        assertEquals("No", result);
    }
			// Test case 3
    @Test
    void testMatchParens3() {
        List<String> lst = List.of("(", "(()))");
        String result = MatchParens.matchParens(lst);
        assertEquals("Yes", result);
    }
			// Test case 4
    @Test
    void testMatchParens4() {
        List<String> lst = List.of("(", "(()))(");
        String result = MatchParens.matchParens(lst);
        assertEquals("No", result);
    }
			// Test case 5
    @Test
    void testMatchParens5() {
        List<String> lst = List.of("(", "(()))()");
        String result = MatchParens.matchParens(lst);
        assertEquals("Yes", result);
    }
			// Test case 6
    @Test
    void testMatchParens6() {
        List<String> lst = List.of("(", "(()))()(");
        String result = MatchParens.matchParens(lst);
        assertEquals("No", result);
    }
			// Test case 7
    @Test
    void testMatchParens7() {
        List<String> lst = List.of("(", "(()))()()");
        String result = MatchParens.matchParens(lst);
        assertEquals("Yes", result);
    }
			// Test case 8
    @Test
    void testMatchParens8() {
        List<String> lst = List.of("(", "(()))()()(");
        String result = MatchParens.matchParens(lst);
        assertEquals("No", result);
    }
			// Test case 9
    @Test
    void testMatchParens9() {
        List<String> lst = List.of("(", "(()))()()()");
        String result = MatchParens.matchParens(lst);
        assertEquals("Yes", result);
    }
			// Test case 10
    @Test
    void testMatchParens10() {
        List<String> lst = List.of("(", "(()))()()()(");
        String result = MatchParens.matchParens(lst);
        assertEquals("No", result);
    }
}