// ParseNestedParensTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseNestedParens}.
* It contains ten unit test cases for the {@link ParseNestedParens#parseNestedParens(String)} method.
*/
class ParseNestedParensTest {
			/**
			* Test case for empty string.
			*/
			@Test
			void testEmptyString() {
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = ParseNestedParens.parseNestedParens("");
				assertEquals(expected, actual);
			}

			/**
			* Test case for single group.
			*/
			@Test
			void testSingleGroup() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				List<Integer> actual = ParseNestedParens.parseNestedParens("()");
				assertEquals(expected, actual);
			}

			/**
			* Test case for multiple groups.
			*/
			@Test
			void testMultipleGroups() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(3);
				expected.add(1);
				expected.add(3);
				List<Integer> actual = ParseNestedParens.parseNestedParens("(()()) ((())) () ((())()())");
				assertEquals(expected, actual);
			}

			/**
			* Test case for single group with maximum depth.
			*/
			@Test
			void testSingleGroupWithMaximumDepth() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(4);
				List<Integer> actual = ParseNestedParens.parseNestedParens("(()(())((())))");
				assertEquals(expected, actual);
			}

			/**
			* Test case for multiple groups with maximum depth.
			*/
			@Test
			void testMultipleGroupsWithMaximumDepth() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				List<Integer> actual = ParseNestedParens.parseNestedParens("() (()) ((())) (((())))");
				assertEquals(expected, actual);
			}

			/**
			* Test case for single group with no parentheses.
			*/
			@Test
			void testSingleGroupWithNoParentheses() {
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = ParseNestedParens.parseNestedParens("abc");
				assertEquals(expected, actual);
			}

			/**
			* Test case for multiple groups with no parentheses.
			*/
			@Test
			void testMultipleGroupsWithNoParentheses() {
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = ParseNestedParens.parseNestedParens("abc def ghi");
				assertEquals(expected, actual);
			}

			/**
			* Test case for single group with no parentheses and spaces.
			*/
			@Test
			void testSingleGroupWithNoParenthesesAndSpaces() {
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = ParseNestedParens.parseNestedParens("   ");
				assertEquals(expected, actual);
			}

			/**
			* Test case for multiple groups with no parentheses and spaces.
			*/
			@Test
			void testMultipleGroupsWithNoParenthesesAndSpaces() {
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = ParseNestedParens.parseNestedParens("   abc   def   ghi   ");
				assertEquals(expected, actual);
			}

			/**
			* Test case for single group with no parentheses and special characters.
			*/
			@Test
			void testSingleGroupWithNoParenthesesAndSpecialCharacters() {
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = ParseNestedParens.parseNestedParens("abc@#$%^&*()_+{}|:\"<>?[]\\;',./");
				assertEquals(expected, actual);
			}

			/**
			* Test case for multiple groups with no parentheses and special characters.
			*/
			@Test
			void testMultipleGroupsWithNoParenthesesAndSpecialCharacters() {
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = ParseNestedParens.parseNestedParens("abc@#$%^&*()_+{}|:\"<>?[]\\;',./ def@#$%^&*()_+{}|:\"<>?[]\\;',./ ghi@#$%^&*()_+{}|:\"<>?[]\\;',./");
				assertEquals(expected, actual);
			}
}