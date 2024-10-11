// ParseNestedParensTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseNestedParens}.
* It contains one unit test case for the {@link ParseNestedParens#parseNestedParens(String)} method.
*/
class ParseNestedParensTest {

    /**
     * Test case for {@link ParseNestedParens#parseNestedParens(String)}.
     */
    @Test
    public void testParseNestedParens(){
        List<String> parens = Parse.parseNestedParens("()()()()()()()()()()()()()()()");
        assertThat(parens.size(), is(7));
        int level = 0;
        for (String p : parens) {
            assertThat(level, is(p.charAt(0))); // "()()" to check next level
            level++;
        }
    }
}
