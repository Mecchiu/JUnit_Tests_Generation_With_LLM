// SeparateParenGroupsTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SeparateParenGroups}.
* It contains one unit test case for the {@link SeparateParenGroups#separateParenGroups(String)} method.
*/
class SeparateParenGroupsTest {

	/**
	 * Unit test cases for the {@link SeparateParenGroups} test method.
	*/
	@Test
	public final void whenGettingTwoNestedGroupsThenItReturnsCorrectNumbers() {
	
		try {
			String expectedResult =
									"((((((a)))))))])((())}})",
			             inputString = """[((())))()])((())]])()]))]]]()))])((())))()()()()";
			List<String> input = new ArrayList<>();
			input.add(expectedResult);
			List<String> result = SeparateParenGroups.separateParenGroups(inputString);
			assertTrue(expectedResult.equals(result.get(0)));
			}
		
		catch(Exception e) {
			fail();
			}
		}
}
// SeparateParenGroupsTest.java