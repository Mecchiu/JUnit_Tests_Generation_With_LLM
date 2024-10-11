// SeparateParenGroupsTest.java
package original;

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
	* It tests the method with a string containing multiple groups of nested parentheses.
	* The method should return a list of those groups.
	*/
	@Test
	void testSeparateParenGroups() {
		List<String> expected = new ArrayList<String>();
		expected.add("(()())");
		expected.add("((()))");
		expected.add("()");
		expected.add("((())()())");
		assertEquals(expected, SeparateParenGroups.separateParenGroups("(()()) ((())) () ((())()())"));
		
		expected = new ArrayList<String>();
		expected.add("()");
		expected.add("(())");
		expected.add("((()))");
		expected.add("(((())))");
		assertEquals(expected, SeparateParenGroups.separateParenGroups("() (()) ((())) (((())))"));
		
		expected = new ArrayList<String>();
		expected.add("(()(())((())))");
		assertEquals(expected, SeparateParenGroups.separateParenGroups("(()(())((())))"));
		
		expected = new ArrayList<String>();
		expected.add("()");
		expected.add("(())");
		expected.add("(()())");
		assertEquals(expected, SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))"));
	}
}