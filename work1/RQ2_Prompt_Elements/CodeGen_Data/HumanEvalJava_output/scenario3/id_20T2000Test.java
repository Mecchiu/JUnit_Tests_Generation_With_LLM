// FindClosestElementsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindClosestElements}.
* It contains one unit test case for the {@link FindClosestElements#findClosestElements(List)} method.
*/
class FindClosestElementsTest {
/**
		 * Tests for a case described in test setup method of {@link FindClosestElements}.
		 */
		@Test
		void findClosestElements(){
				List<Double> numbers = new FindClosestElements().findClosestElements(null);
				assertNotNull(numbers);
		}
		
}
