// ParseNestedParensTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseNestedParens}.
* It contains one unit test case for the {@link ParseNestedParens#parseNestedParens(String)} method.
*/
class ParseNestedParensTest {
public enum TestMessage {
			A,
			B,
			C
		};

		/**
		 * This test case checks for the behavior of the method {@link ParseNestedParens#parseNestedParens(String)}
		 * for the nested parentheses in a string represented using the following grammar: 
		 *  ( '(' ( ')' ( ')' ) )
		 * 
		 * The output of the method call is one of the expected results. In this case,
		 * the result should be true for A to B to B, false for B to C to A.
		*/
		@Test
		void getOutputNestedParens() {
			List<Integer> result = ParseNestedParens.parseNestedParens(TestMessage.A.getMessage());
			assertEquals(TestMessage.A.getMessage(), result.get(0));
			assertTrue(result.get(1) == TestMessage.A.getMessage());
			assertFalse(result.get(2) == TestMessage.C.getMessage());
		}
		
		@Test
		void testNonNegative() {
			List<Integer> result = ParseNestedParens.parseNestedParens("()");
			assertEquals(0, result.size());
		}

		@Test
		void testNegative() {
			assertThrowsNo(IllegalArgumentException.class, () -> ParseNestedParens.parseNestedParens("(()"));
		}

}