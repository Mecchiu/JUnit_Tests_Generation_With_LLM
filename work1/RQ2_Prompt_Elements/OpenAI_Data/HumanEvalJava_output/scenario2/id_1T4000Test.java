// SeparateParenGroupsTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SeparateParenGroups}.
* It contains ten unit test cases for the {@link SeparateParenGroups#separateParenGroups(String)} method.
*/
class SeparateParenGroupsTest {

	/**
	* Test case for {@link SeparateParenGroups#separateParenGroups(String)} method.
	* It tests the case when the input string contains only one group of parentheses.
	*/
	@Test
	void testOneGroup() {
		String input = "(())";
		List<String> expected = new ArrayList<String>();
		expected.add("(())");
		List<String> actual = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SeparateParenGroups#separateParenGroups(String)} method.
	* It tests the case when the input string contains only one group of parentheses.
	*/
	@Test
	void testOneGroup2() {
		String input = "(()())";
		List<String> expected = new ArrayList<String>();
		expected.add("(()())");
		List<String> actual = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SeparateParenGroups#separateParenGroups(String)} method.
	* It tests the case when the input string contains only one group of parentheses.
	*/
	@Test
	void testOneGroup3() {
		String input = "((()))";
		List<String> expected = new ArrayList<String>();
		expected.add("((()))");
		List<String> actual = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SeparateParenGroups#separateParenGroups(String)} method.
	* It tests the case when the input string contains only one group of parentheses.
	*/
	@Test
	void testOneGroup4() {
		String input = "((()()))";
		List<String> expected = new ArrayList<String>();
		expected.add("((()()))");
		List<String> actual = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SeparateParenGroups#separateParenGroups(String)} method.
	* It tests the case when the input string contains only one group of parentheses.
	*/
	@Test
	void testOneGroup5() {
		String input = "(((())))";
		List<String> expected = new ArrayList<String>();
		expected.add("(((())))");
		List<String> actual = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SeparateParenGroups#separateParenGroups(String)} method.
	* It tests the case when the input string contains only one group of parentheses.
	*/
	@Test
	void testOneGroup6() {
		String input = "(((()())))";
		List<String> expected = new ArrayList<String>();
		expected.add("(((()())))");
		List<String> actual = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SeparateParenGroups#separateParenGroups(String)} method.
	* It tests the case when the input string contains only one group of parentheses.
	*/
	@Test
	void testOneGroup7() {
		String input = "(((()))())";
		List<String> expected = new ArrayList<String>();
		expected.add("(((()))())");
		List<String> actual = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SeparateParenGroups#separateParenGroups(String)} method.
	* It tests the case when the input string contains only one group of parentheses.
	*/
	@Test
	void testOneGroup8() {
		String input = "(((())))(())";
		List<String> expected = new ArrayList<String>();
		expected.add("(((())))(())");
		List<String> actual = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SeparateParenGroups#separateParenGroups(String)} method.
	* It tests the case when the input string contains only one group of parentheses.
	*/
	@Test
	void testOneGroup9() {
		String input = "(((())))(())(())";
		List<String> expected = new ArrayList<String>();
		expected.add("(((())))(())(())");
		List<String> actual = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SeparateParenGroups#separateParenGroups(String)} method.
	* It tests the case when the input string contains only one group of parentheses.
	*/
	@Test
	void testOneGroup10() {
		String input = "(((())))(())(())(())";
		List<String> expected = new ArrayList<String>();
		expected.add("(((())))(())(())(())");
		List<String> actual = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expected, actual);
	}
}