// IsNestedTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsNested}.
* It contains one unit test case for the {@link IsNested#isNested(String)} method.
*/
class IsNestedTest {

	/**
	 * A unit test method of {@link IsNested#isNested(String)}.
	 */
	@Test
	public void test() {
        ArrayList<Integer> opening_bracket_index = new ArrayList<Integer>();
        ArrayList<Integer> closing_bracket_index = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            opening_bracket_index.add(i);
        }
        Collections.reverse(opening_bracket_index);
        final String string = "";
        final Boolean b = IsNested.isNested(string);
        assertEquals(true, b);
    }
}
