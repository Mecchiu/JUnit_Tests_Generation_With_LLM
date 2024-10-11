// CorrectBracketing1Test.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing1}.
* It contains one unit test case for the {@link CorrectBracketing1#correctBracketing(String)} method.
*/
class CorrectBracketing1Test {

			
// CorrectBracketing1Test.java
// Class to test in java.
	@Test
	public void test(){
		assertTrue(correctBracketing("()"));
		assertTrue(correctBracketing("()("));
		assertTrue(correctBracketing("())"));
		assertTrue(correctBracketing("()()(()())"));
		assertTrue(correctBracketing("()()()()()()"));
		assertTrue(correctBracketing("()()(())()()"));
		assertTrue(correctBracketing("()()()()()()"));
	}
	
	
}