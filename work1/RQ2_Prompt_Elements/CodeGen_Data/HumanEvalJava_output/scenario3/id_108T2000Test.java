// CountNumsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountNums}.
* It contains one unit test case for the {@link CountNums#countNums(List)} method.
*/
class CountNumsTest {

	@Test
	  public void testCountNums() {
		List<Object> arr = new java.util.ArrayList<Object>();
		//countNums([]) -> 0
		assertEquals(0, CountNums.countNums(arr));
		arr.add(-1L);
		assertEquals(0, CountNums.countNums(arr));
		arr.add(2L);
		assertEquals(1, CountNums.countNums(arr));
		arr.add(10L);
		assertEquals(2, CountNums.countNums(arr));
		arr.add(101L);
		assertEquals(3, CountNums.countNums(arr));
		arr.add(-2);
		assertEquals(5, CountNums.countNums(arr));
		arr.add(3);
		assertEquals(6, CountNums.countNums(arr));
		arr.add(4L);
		assertEquals(5, CountNums.countNums(arr));
		arr.add(5);
		assertEquals(6, CountNums.countNums(arr));
		arr.add(-3L);
		assertEquals(6, CountNums.countNums(arr));
		arr.add(-4);
		assertEquals(6, CountNums.countNums(arr));
		//null
		assertEquals(0, CountNums.countNums(null));
	}
}
