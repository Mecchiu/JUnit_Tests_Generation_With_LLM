// XOrYTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XOrY}.
* It contains one unit test case for the {@link XOrY#xOrY(int, int, int)} method.
*/
class XOrYTest {

		/**
		 * Gets the value of x if its n is an integer.
		 */
	@Test
	public void testXor() {
		assertEquals(14, XOrY.xOrY(99, 0, 14));
	}
}
