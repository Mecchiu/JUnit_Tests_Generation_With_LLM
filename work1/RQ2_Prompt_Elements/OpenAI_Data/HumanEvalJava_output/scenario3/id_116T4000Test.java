// SortArrayTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray}.
* It contains ten unit test cases for the {@link SortArray#sortArray(List)} method.
*/
class SortArrayTest {

	@Test
	void testSortArray() {
		assertEquals(List.of(1, 2, 4, 3, 5), SortArray.sortArray(List.of(1, 5, 2, 3, 4)));
		assertEquals(List.of(0, 1, 2, 4, 3), SortArray.sortArray(List.of(1, 0, 2, 3, 4)));
		assertEquals(List.of(), SortArray.sortArray(List.of()));
		assertEquals(List.of(2, 2, 4, 4, 3, 3, 5, 5, 5, 7, 77), SortArray.sortArray(List.of(2, 5, 77, 4, 5, 3, 5, 7, 2, 3, 4)));
		assertEquals(List.of(32, 3, 5, 6, 12, 44), SortArray.sortArray(List.of(3, 6, 44, 12, 32, 5)));
		assertEquals(List.of(2, 4, 8, 16, 32), SortArray.sortArray(List.of(2, 4, 8, 16, 32)));
		assertEquals(List.of(2, 4, 8, 16, 32), SortArray.sortArray(List.of(2, 4, 8, 16, 32)));
		assertEquals(List.of(2, 4, 8, 16, 32), SortArray.sortArray(List.of(2, 4, 8, 16, 32)));
		assertEquals(List.of(2, 4, 8, 16, 32), SortArray.sortArray(List.of(2, 4, 8, 16, 32)));
		assertEquals(List.of(2, 4, 8, 16, 32), SortArray.sortArray(List.of(2, 4, 8, 16, 32)));
	}
}