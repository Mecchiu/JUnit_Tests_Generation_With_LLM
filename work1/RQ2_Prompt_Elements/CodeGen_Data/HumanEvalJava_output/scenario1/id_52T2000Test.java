// BelowThresholdTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains one unit test case for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {

	/**
	 * Test method for {@link scenario1.BelowThreshold#belowThreshold(List, int)}.
	 */
	@Test
	public void testBelowThreshold() {
		List<Integer> testList = Arrays.asList(1, 2, 3);
		List<Integer> actualList = BelowThreshold.belowThreshold(testList, 2);
		assertEquals(testList, actualList);
	}
}
