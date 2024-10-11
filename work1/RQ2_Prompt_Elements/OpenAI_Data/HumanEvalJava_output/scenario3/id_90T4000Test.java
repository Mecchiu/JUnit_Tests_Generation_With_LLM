// NextSmallestTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NextSmallest}.
* It contains ten unit test cases for the {@link NextSmallest#nextSmallest(List)} method.
*/
class NextSmallestTest {

	@Test
	void testNextSmallest() {
		assertEquals(2, NextSmallest.nextSmallest(List.of(1, 2, 3, 4, 5)));
		assertEquals(2, NextSmallest.nextSmallest(List.of(5, 1, 4, 3, 2)));
		assertEquals(null, NextSmallest.nextSmallest(List.of()));
		assertEquals(null, NextSmallest.nextSmallest(List.of(1, 1)));
		assertEquals(1, NextSmallest.nextSmallest(List.of(1, 1, 1, 1, 0)));
		assertEquals(null, NextSmallest.nextSmallest(List.of(1, 1)));
		assertEquals(-35, NextSmallest.nextSmallest(List.of(-35, 34, 12, -45)));
		assertEquals(null, NextSmallest.nextSmallest(List.of(1, 1, 1, 1, 1)));
		assertEquals(null, NextSmallest.nextSmallest(List.of(1, 1, 1, 1, 1, 1)));
		assertEquals(null, NextSmallest.nextSmallest(List.of(1, 1, 1, 1, 1, 1, 1)));
	}
}