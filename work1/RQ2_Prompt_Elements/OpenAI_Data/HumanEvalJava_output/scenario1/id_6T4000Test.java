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

	/**
	* Test case 1.
	* The input string is empty.
	* The expected result is an empty list.
	*/
	@Test
	void testCase1() {
		String input = "";
		List<Integer> expected = new ArrayList<Integer>();
		List<Integer> actual = ParseNestedParens.parseNestedParens(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input string is "()".
	* The expected result is a list containing 1.
	*/
	@Test
	void testCase2() {
		String input = "()";
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		List<Integer> actual = ParseNestedParens.parseNestedParens(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input string is "()()".
	* The expected result is a list containing 1, 1.
	*/
	@Test
	void testCase3() {
		String input = "()()";
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(1);
		List<Integer> actual = ParseNestedParens.parseNestedParens(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input string is "()(())".
	* The expected result is a list containing 1, 2.
	*/
	@Test
	void testCase4() {
		String input = "()(())";
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		List<Integer> actual = ParseNestedParens.parseNestedParens(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input string is "()(()())".
	* The expected result is a list containing 1, 2, 1.
	*/
	@Test
	void testCase5() {
		String input = "()(()())";
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(1);
		List<Integer> actual = ParseNestedParens.parseNestedParens(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input string is "()(()())(())".
	* The expected result is a list containing 1, 2, 1, 2.
	*/
	@Test
	void testCase6() {
		String input = "()(()())(())";
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(1);
		expected.add(2);
		List<Integer> actual = ParseNestedParens.parseNestedParens(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input string is "()(()())(()())".
	* The expected result is a list containing 1, 2, 1, 2, 1.
	*/
	@Test
	void testCase7() {
		String input = "()(()())(()())";
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(1);
		expected.add(2);
		expected.add(1);
		List<Integer> actual = ParseNestedParens.parseNestedParens(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input string is "()(()())(()())(())".
	* The expected result is a list containing 1, 2, 1, 2, 1, 2.
	*/
	@Test
	void testCase8() {
		String input = "()(()())(()())(())";
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(1);
		expected.add(2);
		expected.add(1);
		expected.add(2);
		List<Integer> actual = ParseNestedParens.parseNestedParens(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input string is "()(()())(()())(()())".
	* The expected result is a list containing 1, 2, 1, 2, 1, 2, 1.
	*/
	@Test
	void testCase9() {
		String input = "()(()())(()())(()())";
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(1);
		expected.add(2);
		expected.add(1);
		expected.add(2);
		expected.add(1);
		List<Integer> actual = ParseNestedParens.parseNestedParens(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input string is "()(()())(()())(()())(())".
	* The expected result is a list containing 1, 2, 1, 2, 1, 2, 1, 2.
	*/
	@Test
	void testCase10() {
		String input = "()(()())(()())(()())(())";
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(1);
		expected.add(2);
		expected.add(1);
		expected.add(2);
		expected.add(1);
		expected.add(2);
		List<Integer> actual = ParseNestedParens.parseNestedParens(input);
		assertEquals(expected, actual);
	}
}