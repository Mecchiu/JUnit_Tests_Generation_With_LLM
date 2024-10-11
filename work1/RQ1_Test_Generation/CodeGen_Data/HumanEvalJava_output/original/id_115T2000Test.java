// MaxFillTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxFill}.
* It contains one unit test case for the {@link MaxFill#maxFill(List, int)} method.
*/
class MaxFillTest {
/** * @param grid
		 * @param capacity
		 * @param expected
		 */
	@Test
	void testMaxFill(List<List<Integer>> grid, int capacity, int expected) {
		assertEquals(expected, maxFill(grid, capacity));
	}

		/** * @param grid
		 * @param capacity
		 */
	@Test
	void testMaxFill2(List<List<Integer>> grid, int capacity) {
		int expected = maxFill(grid, capacity);
		for (int i = 0; expected > 0? i <= expected : i >= 0; i += 2) {
			assertTrue(i > 0? i : expected < 0? expected : i >= expected);
		}
	}
}
