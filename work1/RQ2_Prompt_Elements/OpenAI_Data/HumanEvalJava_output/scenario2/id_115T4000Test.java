// MaxFillTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxFill}.
* It contains ten unit test cases for the {@link MaxFill#maxFill(List, int)} method.
*/
class MaxFillTest {

	@Test
	void testMaxFill() {
		List<List<Integer>> grid = List.of(
			List.of(1, 1, 1, 1, 1),
			List.of(1, 1, 1, 1, 1),
			List.of(1, 1, 1, 1, 1),
			List.of(1, 1, 1, 1, 1),
			List.of(1, 1, 1, 1, 1)
		);
		assertEquals(5, MaxFill.maxFill(grid, 1));
		assertEquals(3, MaxFill.maxFill(grid, 2));
		assertEquals(2, MaxFill.maxFill(grid, 3));
		assertEquals(2, MaxFill.maxFill(grid, 4));
		assertEquals(1, MaxFill.maxFill(grid, 5));
		assertEquals(1, MaxFill.maxFill(grid, 6));
		assertEquals(1, MaxFill.maxFill(grid, 7));
		assertEquals(1, MaxFill.maxFill(grid, 8));
		assertEquals(1, MaxFill.maxFill(grid, 9));
		assertEquals(1, MaxFill.maxFill(grid, 10));
	}
}