// CanArrangeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CanArrange}.
* It contains ten unit test cases for the {@link CanArrange#canArrange(List)} method.
*/
class CanArrangeTest {

	@Test
	void testCanArrange() {
		assertEquals(3, CanArrange.canArrange(List.of(1, 2, 4, 3, 5)));
		assertEquals(-1, CanArrange.canArrange(List.of(1, 2, 4, 5)));
		assertEquals(2, CanArrange.canArrange(List.of(1, 4, 2, 5, 6, 7, 8, 9, 10)));
		assertEquals(4, CanArrange.canArrange(List.of(4, 8, 5, 7, 3)));
		assertEquals(-1, CanArrange.canArrange(List.of()));
		assertEquals(0, CanArrange.canArrange(List.of(1)));
		assertEquals(0, CanArrange.canArrange(List.of(1, 2)));
		assertEquals(1, CanArrange.canArrange(List.of(2, 1)));
		assertEquals(1, CanArrange.canArrange(List.of(1, 2, 3)));
		assertEquals(2, CanArrange.canArrange(List.of(3, 2, 1)));
	}
}