// ParseNestedParensTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseNestedParens}.
* It contains ten unit test cases for the {@link ParseNestedParens#parseNestedParens(String)} method.
*/
class ParseNestedParensTest {

	@Test
	void testParseNestedParens() {
		List<Integer> result = ParseNestedParens.parseNestedParens("(()()) ((())) () ((())()())");
		assertEquals(4, result.size());
		assertEquals(2, result.get(0).intValue());
		assertEquals(3, result.get(1).intValue());
		assertEquals(1, result.get(2).intValue());
		assertEquals(3, result.get(3).intValue());
		
		result = ParseNestedParens.parseNestedParens("() (()) ((())) (((())))");
		assertEquals(4, result.size());
		assertEquals(1, result.get(0).intValue());
		assertEquals(2, result.get(1).intValue());
		assertEquals(3, result.get(2).intValue());
		assertEquals(4, result.get(3).intValue());
		
		result = ParseNestedParens.parseNestedParens("(()(())((())))");
		assertEquals(1, result.size());
		assertEquals(4, result.get(0).intValue());
	}
}