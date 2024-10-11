// ParseNestedParensTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseNestedParens}.
* It contains one unit test case for the {@link ParseNestedParens#parseNestedParens(String)} method.
*/
class ParseNestedParensTest {

	@Test
	public void parseNestedParens() {
		assertEquals(3, ParseNestedParens.parseNestedParens(""));
		assertEquals(2, ParseNestedParens.parseNestedParens("(()()))"));
		assertEquals(2, ParseNestedParens.parseNestedParens("(())()"));
		assertEquals(1, ParseNestedParens.parseNestedParens("()()()"));
	}

}
