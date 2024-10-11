// StartsOneEndsTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartsOneEnds}.
* It contains one unit test case for the {@link StartsOneEnds#startsOneEnds(int)} method.
*/
class StartsOneEndsTest {

	int n = 4;
	/**
	 * Tests the {@link StartsOneEnds#startsOneEnds(int)} method.
	 */
	@Test
	public void whenSTartsOneEndsThenReturnTrue() {
		boolean expected = true; // The expected result.
		boolean result = startsOneEnds(n);
		assertTrue(expected);
		assertTrue("return value is not equal", result);
	}
}