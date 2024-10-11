// CycpatternCheckTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CycpatternCheck}.
* It contains one unit test case for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
*/
class CycpatternCheckTest {

	/**
	 * Tests the constructor by calling all its constructor and test method.
	 */
	@Test
	public void testCycpatternCheck() {
		//
		Boolean ans = cycpatternCheck("whattup", "ptut");
		//
		ans = cycpatternCheck( "tvin", "tvin");
		//
		ans = cycpatternCheck("yello", "ell");
		//
		ans = cycpatternCheck("wimmtt", "tinem");
		//
		ans = cycpatternCheck("yooo", "");
	}
}