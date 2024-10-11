// LargestSmallestIntegersTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestSmallestIntegers}.
* It contains ten unit test cases for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
*/
class LargestSmallestIntegersTest {

	@Test
	void testLargestSmallestIntegers() {
		List<Object> lst1 = List.of(2, 4, 1, 3, 5, 7);
		List<Object> lst2 = List.of(2, 4, 1, 3, 5, 7, 0);
		List<Object> lst3 = List.of(1, 3, 2, 4, 5, 6, -2);
		List<Object> lst4 = List.of(4, 5, 3, 6, 2, 7, -7);
		List<Object> lst5 = List.of(7, 3, 8, 4, 9, 2, 5, -9);
		List<Object> lst6 = List.of();
		List<Object> lst7 = List.of(0);
		List<Object> lst8 = List.of(-1, -3, -5, -6);
		List<Object> lst9 = List.of(-1, -3, -5, -6, 0);
		List<Object> lst10 = List.of(-6, -4, -4, -3, 1);
		List<Object> lst11 = List.of(-6, -4, -4, -3, -100, 1);
		
		List<Integer> expected1 = List.of(null, 1);
		List<Integer> expected2 = List.of(null, 1);
		List<Integer> expected3 = List.of(-2, 1);
		List<Integer> expected4 = List.of(-7, 2);
		List<Integer> expected5 = List.of(-9, 2);
		List<Integer> expected6 = List.of(null, null);
		List<Integer> expected7 = List.of(null, null);
		List<Integer> expected8 = List.of(-1, null);
		List<Integer> expected9 = List.of(-1, null);
		List<Integer> expected10 = List.of(-3, 1);
		List<Integer> expected11 = List.of(-3, 1);
		
		assertEquals(expected1, LargestSmallestIntegers.largestSmallestIntegers(lst1));
		assertEquals(expected2, LargestSmallestIntegers.largestSmallestIntegers(lst2));
		assertEquals(expected3, LargestSmallestIntegers.largestSmallestIntegers(lst3));
		assertEquals(expected4, LargestSmallestIntegers.largestSmallestIntegers(lst4));
		assertEquals(expected5, LargestSmallestIntegers.largestSmallestIntegers(lst5));
		assertEquals(expected6, LargestSmallestIntegers.largestSmallestIntegers(lst6));
		assertEquals(expected7, LargestSmallestIntegers.largestSmallestIntegers(lst7));
		assertEquals(expected8, LargestSmallestIntegers.largestSmallestIntegers(lst8));
		assertEquals(expected9, LargestSmallestIntegers.largestSmallestIntegers(lst9));
		assertEquals(expected10, LargestSmallestIntegers.largestSmallestIntegers(lst10));
		assertEquals(expected11, LargestSmallestIntegers.largestSmallestIntegers(lst11));
	}
}