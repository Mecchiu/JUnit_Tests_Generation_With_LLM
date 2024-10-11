// SeparateParenGroupsTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SeparateParenGroups}.
* It contains ten unit test cases for the {@link SeparateParenGroups#separateParenGroups(String)} method.
*/
class SeparateParenGroupsTest {
			// Test case 1: Empty string
			@Test
			void testEmptyString() {
				String input = "";
				List<String> expected = new ArrayList<String>();
				List<String> actual = SeparateParenGroups.separateParenGroups(input);
				assertEquals(expected, actual);
			}
			
			// Test case 2: String with no parentheses
			@Test
			void testNoParentheses() {
				String input = "abc";
				List<String> expected = new ArrayList<String>();
				List<String> actual = SeparateParenGroups.separateParenGroups(input);
				assertEquals(expected, actual);
			}
			
			// Test case 3: String with one pair of parentheses
			@Test
			void testOnePairParentheses() {
				String input = "(abc)";
				List<String> expected = new ArrayList<String>();
				expected.add("(abc)");
				List<String> actual = SeparateParenGroups.separateParenGroups(input);
				assertEquals(expected, actual);
			}
			
			// Test case 4: String with multiple pairs of parentheses
			@Test
			void testMultiplePairsParentheses() {
				String input = "(abc)(def)(ghi)";
				List<String> expected = new ArrayList<String>();
				expected.add("(abc)");
				expected.add("(def)");
				expected.add("(ghi)");
				List<String> actual = SeparateParenGroups.separateParenGroups(input);
				assertEquals(expected, actual);
			}
			
			// Test case 5: String with nested parentheses
			@Test
			void testNestedParentheses() {
				String input = "((abc)(def))";
				List<String> expected = new ArrayList<String>();
				expected.add("((abc)(def))");
				List<String> actual = SeparateParenGroups.separateParenGroups(input);
				assertEquals(expected, actual);
			}
			
			// Test case 6: String with unbalanced parentheses
			@Test
			void testUnbalancedParentheses() {
				String input = "(abc(def)";
				List<String> expected = new ArrayList<String>();
				expected.add("(abc(def)");
				List<String> actual = SeparateParenGroups.separateParenGroups(input);
				assertEquals(expected, actual);
			}
			
			// Test case 7: String with only opening parentheses
			@Test
			void testOnlyOpeningParentheses() {
				String input = "(((";
				List<String> expected = new ArrayList<String>();
				List<String> actual = SeparateParenGroups.separateParenGroups(input);
				assertEquals(expected, actual);
			}
			
			// Test case 8: String with only closing parentheses
			@Test
			void testOnlyClosingParentheses() {
				String input = ")))";
				List<String> expected = new ArrayList<String>();
				List<String> actual = SeparateParenGroups.separateParenGroups(input);
				assertEquals(expected, actual);
			}
			
			// Test case 9: String with special characters
			@Test
			void testSpecialCharacters() {
				String input = "a!@#$%^&*()b";
				List<String> expected = new ArrayList<String>();
				expected.add("a!@#$%^&*()b");
				List<String> actual = SeparateParenGroups.separateParenGroups(input);
				assertEquals(expected, actual);
			}
			
			// Test case 10: String with spaces
			@Test
			void testSpaces() {
				String input = " (abc) (def) (ghi) ";
				List<String> expected = new ArrayList<String>();
				expected.add("(abc)");
				expected.add("(def)");
				expected.add("(ghi)");
				List<String> actual = SeparateParenGroups.separateParenGroups(input);
				assertEquals(expected, actual);
			}
}