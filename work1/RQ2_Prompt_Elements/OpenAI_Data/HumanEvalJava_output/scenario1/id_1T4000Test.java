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

	/**
	* Test case 1.
	* Input: "()()()"
	* Expected output: ["()()()"]
	*/
	@Test
	void testCase1() {
		String input = "()()()";
		List<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("()()()");
		List<String> actualOutput = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expectedOutput, actualOutput);
	}
	
	/**
	* Test case 2.
	* Input: "((()))"
	* Expected output: ["((()))"]
	*/
	@Test
	void testCase2() {
		String input = "((()))";
		List<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("((()))");
		List<String> actualOutput = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expectedOutput, actualOutput);
	}
	
	/**
	* Test case 3.
	* Input: "((()()))"
	* Expected output: ["((()()))"]
	*/
	@Test
	void testCase3() {
		String input = "((()()))";
		List<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("((()()))");
		List<String> actualOutput = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expectedOutput, actualOutput);
	}
	
	/**
	* Test case 4.
	* Input: "()()()()"
	* Expected output: ["()()()()"]
	*/
	@Test
	void testCase4() {
		String input = "()()()()";
		List<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("()()()()");
		List<String> actualOutput = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expectedOutput, actualOutput);
	}
	
	/**
	* Test case 5.
	* Input: "()(())(())"
	* Expected output: ["()", "(())", "(())"]
	*/
	@Test
	void testCase5() {
		String input = "()(())(())";
		List<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("()");
		expectedOutput.add("(())");
		expectedOutput.add("(())");
		List<String> actualOutput = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expectedOutput, actualOutput);
	}
	
	/**
	* Test case 6.
	* Input: "()(()())(())"
	* Expected output: ["()", "(()())", "(())"]
	*/
	@Test
	void testCase6() {
		String input = "()(()())(())";
		List<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("()");
		expectedOutput.add("(()())");
		expectedOutput.add("(())");
		List<String> actualOutput = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expectedOutput, actualOutput);
	}
	
	/**
	* Test case 7.
	* Input: "()(()())(())(())"
	* Expected output: ["()", "(()())", "(())", "(())"]
	*/
	@Test
	void testCase7() {
		String input = "()(()())(())(())";
		List<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("()");
		expectedOutput.add("(()())");
		expectedOutput.add("(())");
		expectedOutput.add("(())");
		List<String> actualOutput = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expectedOutput, actualOutput);
	}
	
	/**
	* Test case 8.
	* Input: "()(()())(())(())(())"
	* Expected output: ["()", "(()())", "(())", "(())", "(())"]
	*/
	@Test
	void testCase8() {
		String input = "()(()())(())(())(())";
		List<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("()");
		expectedOutput.add("(()())");
		expectedOutput.add("(())");
		expectedOutput.add("(())");
		expectedOutput.add("(())");
		List<String> actualOutput = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expectedOutput, actualOutput);
	}
	
	/**
	* Test case 9.
	* Input: "()(()())(())(())(())(())"
	* Expected output: ["()", "(()())", "(())", "(())", "(())", "(())"]
	*/
	@Test
	void testCase9() {
		String input = "()(()())(())(())(())(())";
		List<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("()");
		expectedOutput.add("(()())");
		expectedOutput.add("(())");
		expectedOutput.add("(())");
		expectedOutput.add("(())");
		expectedOutput.add("(())");
		List<String> actualOutput = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expectedOutput, actualOutput);
	}
	
	/**
	* Test case 10.
	* Input: "()(()())(())(())(())(())(())"
	* Expected output: ["()", "(()())", "(())", "(())", "(())", "(())", "(())"]
	*/
	@Test
	void testCase10() {
		String input = "()(()())(())(())(())(())(())";
		List<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("()");
		expectedOutput.add("(()())");
		expectedOutput.add("(())");
		expectedOutput.add("(())");
		expectedOutput.add("(())");
		expectedOutput.add("(())");
		expectedOutput.add("(())");
		List<String> actualOutput = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expectedOutput, actualOutput);
	}
}