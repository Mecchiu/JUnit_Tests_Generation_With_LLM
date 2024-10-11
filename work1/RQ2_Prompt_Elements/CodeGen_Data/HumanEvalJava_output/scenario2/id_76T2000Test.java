// IsSimplePowerTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSimplePower}.
* It contains one unit test case for the {@link IsSimplePower#isSimplePower(int, int)} method.
*/
class IsSimplePowerTest {
/**
		 * Test method for
		 * {@link IsSimplePower#isSimplePower(_int, _int)}.
		 */
		 @Test public void test() {
				 // check parameter
				 assertNotNull(IsSimplePower.isSimplePower(_0, _0));
				 assertNull(IsSimplePower.isSimplePower(_0, _0 + 10));
				 assertNull(IsSimplePower.isSimplePower(_0, _0 - 10));

		}

}