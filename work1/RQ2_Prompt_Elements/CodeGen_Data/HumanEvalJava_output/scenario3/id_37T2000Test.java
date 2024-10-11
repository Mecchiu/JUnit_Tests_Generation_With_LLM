// SortEvenTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortEven}.
* It contains one unit test case for the {@link SortEven#sortEven(List)} method.
*/
class SortEvenTest {

	/**
	 * Test for {@link SortEven#sortEven(List)}.
	 */
	@Test
	void test() {
		List<Integer> evenList = sortEven([1, 2, 3]);
		List<Integer> oddList = sortEven([5, 6, 3, 4]);
		assertTrue("The even list is not equal to the odd list.", evenList.equals(oddList));
	}

}
