// FilterIntegersTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterIntegers}.
* It contains one unit test case for the {@link FilterIntegers#filterIntegers(List)} method.
*/
class FilterIntegersTest {

	@Test
	public void testFilterIntegers() {
		List<Object> list = new FilterIntegers().filterIntegers(new List<Object>());
		
		compareObjectList(3, 4, list);
		compareObjectList(3, 4, new List<Object>());
		compareObjectList(3, 4, new List<Object>());
		compareObjectList(3, 4, "3");
		compareObjectList(3, 4, 4);
	}
	
}