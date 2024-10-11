// BelowZeroTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains one unit test case for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {
/**
     * Test cases for the method 'belowZero(List)'.
     */
	@Test
	void test2() {
		List<Object> list  = new ArrayList<>();
		Object  o       = 0;
		double  d       = -1;
		Object  o2      = 1;
		double  d2      = 2;

		// Test values of parameters
		list
				.add(o)
				.add(d)
				.add(o2)
				.add(d2);

		assertEquals(true, belowZero(list).isEmpty()); // isEmpty check

		list = null; // to be sure that the list becomes null
	}
}
