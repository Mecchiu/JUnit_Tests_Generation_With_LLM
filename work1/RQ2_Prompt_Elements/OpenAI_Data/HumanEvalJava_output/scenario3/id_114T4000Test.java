// MinsubarraysumTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minsubarraysum}.
* It contains ten unit test cases for the {@link Minsubarraysum#minsubarraysum(List)} method.
*/
class MinsubarraysumTest {

	@Test
	void testMinsubarraysum() {
		assertEquals(1, Minsubarraysum.minsubarraysum(List.of(2, 3, 4, 1, 2, 4)));
		assertEquals(-6, Minsubarraysum.minsubarraysum(List.of(-1, -2, -3)));
		assertEquals(-14, Minsubarraysum.minsubarraysum(List.of(-1, -2, -3, 2, -10)));
		assertEquals(-9999999999999999L, Minsubarraysum.minsubarraysum(List.of(-9999999999999999L)));
		assertEquals(0, Minsubarraysum.minsubarraysum(List.of(0, 10, 20, 1000000)));
		assertEquals(-6, Minsubarraysum.minsubarraysum(List.of(-1, -2, -3, 10, -5)));
		assertEquals(-6, Minsubarraysum.minsubarraysum(List.of(100, -1, -2, -3, 10, -5)));
		assertEquals(3, Minsubarraysum.minsubarraysum(List.of(10, 11, 13, 8, 3, 4)));
		assertEquals(-33, Minsubarraysum.minsubarraysum(List.of(100, -33, 32, -1, 0, -2)));
		assertEquals(-10, Minsubarraysum.minsubarraysum(List.of(-10)));
		assertEquals(7, Minsubarraysum.minsubarraysum(List.of(7)));
		assertEquals(-1, Minsubarraysum.minsubarraysum(List.of(1, -1)));
	}
}