// MonotonicTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains one unit test case for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {

	private final List<Integer> l1 = new Integer[] { 1, 2, 3, 4, 5 };
	
	private final List<Integer> l2 = new Integer[] { 6, 7, 8, 9 };
	
	@Test
	public void testMonotonic() {
		assertEquals("Monotonically monotonic list", new Monotonic().monotonic(l1), true);
		assertEquals("Monotonically monotonic list", new Monotonic().monotonic(l2), true);
	}
}