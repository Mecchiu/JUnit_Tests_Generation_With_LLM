// ParseNestedParensTest.java
package scenario2;

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
			* Test case for single group with no nested parentheses.
			*/
			@Test
			void testSingleGroupNoNested() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(0);
				List<Integer> actual = ParseNestedParens.parseNestedParens("()");
				assertEquals(expected, actual);
			}
			
			/**
			* Test case for single group with nested parentheses.
			*/
			@Test
			void testSingleGroupNested() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				List<Integer> actual = ParseNestedParens.parseNestedParens("((()))");
				assertEquals(expected, actual);
			}
			
			/**
			* Test case for multiple groups with no nested parentheses.
			*/
			@Test
			void testMultipleGroupsNoNested() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(0);
				expected.add(0);
				expected.add(0);
				List<Integer> actual = ParseNestedParens.parseNestedParens("() () ()");
				assertEquals(expected, actual);
			}
			
			/**
			* Test case for multiple groups with nested parentheses.
			*/
			@Test
			void testMultipleGroupsNested() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(3);
				expected.add(1);
				List<Integer> actual = ParseNestedParens.parseNestedParens("((())) () (((()))) ()");
				assertEquals(expected, actual);
			}
			
			/**
			* Test case for multiple groups with different levels of nested parentheses.
			*/
			@Test
			void testMultipleGroupsDifferentLevels() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(3);
				expected.add(1);
				expected.add(2);
				expected.add(1);
				List<Integer> actual = ParseNestedParens.parseNestedParens("((())) () (((()))) () (())");
				assertEquals(expected, actual);
			}
			
			/**
			* Test case for multiple groups with no parentheses.
			*/
			@Test
			void testMultipleGroupsNoParentheses() {
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = ParseNestedParens.parseNestedParens("abc def ghi");
				assertEquals(expected, actual);
			}
			
			/**
			* Test case for multiple groups with only opening parentheses.
			*/
			@Test
			void testMultipleGroupsOnlyOpeningParentheses() {
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = ParseNestedParens.parseNestedParens("(((())) (((((())))) ()");
				assertEquals(expected, actual);
			}
			
			/**
			* Test case for multiple groups with only closing parentheses.
			*/
			@Test
			void testMultipleGroupsOnlyClosingParentheses() {
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = ParseNestedParens.parseNestedParens("))))) ((()) ))))");
				assertEquals(expected, actual);
			}
			
			/**
			* Test case for multiple groups with uneven number of parentheses.
			*/
			@Test
			void testMultipleGroupsUnevenParentheses() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(3);
				expected.add(1);
				expected.add(2);
				List<Integer> actual = ParseNestedParens.parseNestedParens("((())) () (((()))) () (()) (");
				assertEquals(expected, actual);
			}
}