// StrangeSortListTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrangeSortList}.
* It contains ten unit test cases for the {@link StrangeSortList#strangeSortList(List)} method.
*/
class StrangeSortListTest {

	@Test
	void testStrangeSortList() {
		List<Object> lst = List.of(1, 2, 3, 4);
		List<Object> expected = List.of(1, 4, 2, 3);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
		
		lst = List.of(5, 6, 7, 8, 9);
		expected = List.of(5, 9, 6, 8, 7);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
		
		lst = List.of(1, 2, 3, 4, 5);
		expected = List.of(1, 5, 2, 4, 3);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
		
		lst = List.of(5, 6, 7, 8, 9, 1);
		expected = List.of(1, 9, 5, 8, 6, 7);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
		
		lst = List.of(5, 5, 5, 5);
		expected = List.of(5, 5, 5, 5);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
		
		lst = List.of();
		expected = List.of();
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
		
		lst = List.of(1, 2, 3, 4, 5, 6, 7, 8);
		expected = List.of(1, 8, 2, 7, 3, 6, 4, 5);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
		
		lst = List.of(0, 2, 2, 2, 5, 5, -5, -5);
		expected = List.of(-5, 5, -5, 5, 0, 2, 2, 2);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
		
		lst = List.of(111111);
		expected = List.of(111111);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
		
		lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		expected = List.of(1, 20, 2, 19, 3, 18, 4, 17, 5, 16, 6, 15, 7, 14, 8, 13, 9, 12, 10, 11);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
}