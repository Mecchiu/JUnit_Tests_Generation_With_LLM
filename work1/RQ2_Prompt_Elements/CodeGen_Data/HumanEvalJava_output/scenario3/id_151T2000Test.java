// DoubleTheDifferenceTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DoubleTheDifference}.
* It contains one unit test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
*/
class DoubleTheDifferenceTest {
@Test
		public void testDoubleTheDifference() {
		// Given
		List<Object> input = null;
		// When
		DoubleTheDifference obj = null;
		// Then
		assertEquals(0, obj.doubleTheDifference(input));
		}
}
