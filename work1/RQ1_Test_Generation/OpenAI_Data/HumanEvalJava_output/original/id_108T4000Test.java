// CountNumsTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountNums}.
* It contains ten unit test cases for the {@link CountNums#countNums(List)} method.
*/
class CountNumsTest {

	@Test
	void testCountNums() {
		assertEquals(0, CountNums.countNums(List.of()));
		assertEquals(0, CountNums.countNums(List.of(-1, -2, 0)));
		assertEquals(6, CountNums.countNums(List.of(1, 1, 2, -2, 3, 4, 5)));
		assertEquals(5, CountNums.countNums(List.of(1, 6, 9, -6, 0, 1, 5)));
		assertEquals(4, CountNums.countNums(List.of(1, 100, 98, -7, 1, -1)));
		assertEquals(5, CountNums.countNums(List.of(12, 23, 34, -45, -56, 0)));
		assertEquals(1, CountNums.countNums(List.of(0, 1)));
		assertEquals(1, CountNums.countNums(List.of(1)));
	}
}