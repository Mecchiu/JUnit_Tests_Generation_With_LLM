// ParseNestedParensTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseNestedParens}.
* It contains ten unit test cases for the {@link ParseNestedParens#parseNestedParens(String)} method.
*/
class ParseNestedParensTest {
			// Test case 1: Empty string
			@Test
			void testEmptyString() {
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = ParseNestedParens.parseNestedParens("");
				assertEquals(expected, actual);
			}
			
			// Test case 2: String with no parentheses
			@Test
			void testNoParentheses() {
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = ParseNestedParens.parseNestedParens("abc");
				assertEquals(expected, actual);
			}
			
			// Test case 3: String with one pair of parentheses
			@Test
			void testOnePairParentheses() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				List<Integer> actual = ParseNestedParens.parseNestedParens("(abc)");
				assertEquals(expected, actual);
			}
			
			// Test case 4: String with multiple pairs of parentheses
			@Test
			void testMultiplePairsParentheses() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(3);
				List<Integer> actual = ParseNestedParens.parseNestedParens("((abc)(def))");
				assertEquals(expected, actual);
			}
			
			// Test case 5: String with nested parentheses
			@Test
			void testNestedParentheses() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(3);
				List<Integer> actual = ParseNestedParens.parseNestedParens("((abc(def)))");
				assertEquals(expected, actual);
			}
			
			// Test case 6: String with unbalanced parentheses
			@Test
			void testUnbalancedParentheses() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				List<Integer> actual = ParseNestedParens.parseNestedParens("((abc)");
				assertEquals(expected, actual);
			}
			
			// Test case 7: String with only opening parentheses
			@Test
			void testOnlyOpeningParentheses() {
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = ParseNestedParens.parseNestedParens("(((");
				assertEquals(expected, actual);
			}
			
			// Test case 8: String with only closing parentheses
			@Test
			void testOnlyClosingParentheses() {
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = ParseNestedParens.parseNestedParens(")))");
				assertEquals(expected, actual);
			}
			
			// Test case 9: String with special characters
			@Test
			void testSpecialCharacters() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				List<Integer> actual = ParseNestedParens.parseNestedParens("((a@b#c))");
				assertEquals(expected, actual);
			}
			
			// Test case 10: String with spaces
			@Test
			void testSpaces() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				List<Integer> actual = ParseNestedParens.parseNestedParens("( (abc) )");
				assertEquals(expected, actual);
			}
}