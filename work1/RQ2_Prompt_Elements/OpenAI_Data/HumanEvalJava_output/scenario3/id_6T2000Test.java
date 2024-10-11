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
				assertEquals(2, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(1, result.get(2));
				assertEquals(3, result.get(3));
			}
			
			@Test
			void testParseNestedParens2() {
				List<Integer> result = ParseNestedParens.parseNestedParens("() (()) ((())) (((())))");
				assertEquals(1, result.get(0));
				assertEquals(2, result.get(1));
				assertEquals(3, result.get(2));
				assertEquals(4, result.get(3));
			}
			
			@Test
			void testParseNestedParens3() {
				List<Integer> result = ParseNestedParens.parseNestedParens("(()(())((())))");
				assertEquals(4, result.get(0));
			}
			
			@Test
			void testParseNestedParens4() {
				List<Integer> result = ParseNestedParens.parseNestedParens("()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()