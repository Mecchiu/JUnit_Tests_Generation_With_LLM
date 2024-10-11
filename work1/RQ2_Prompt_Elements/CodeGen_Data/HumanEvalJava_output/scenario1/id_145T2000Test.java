// OrderByPointsTest.java
package scenario1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OrderByPoints}.
* It contains one unit test case for the {@link OrderByPoints#orderByPoints(List)} method.
*/
class OrderByPointsTest {

	/**
	 * Test for the {@link OrderByPoints#orderByPoints(List)} method.
	 */
	@Test
	void orderByPoints1() {
		List<Integer> orderByPoints1 = OrderByPoints.orderByPoints(Collections.singletonList(5));
		List<Integer> orderByPoints2 = OrderByPoints.orderByPoints(Collections.singletonList(3));
		List<Double> orderByPoints3 = OrderByPoints.orderByPoints(Collections.singletonList(1d));
		
		
	
	}
	
	/**
	 * Test for the {@link OrderByPoints#orderByPoints(List)} method.
	 */
	@Test
	void orderByPoints2() {
		List<Integer> orderByPoints1 = OrderByPoints.orderByPoints(Collections.singletonList(6));
		List<Double> orderByPoints2 = OrderByPoints.orderByPoints(Collections.singletonList(1d));
		
		
	
	}
	
}
