// GetRowTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetRow}.
* It contains ten unit test cases for the {@link GetRow#getRow(List, int)} method.
*/
class GetRowTest {

	@Test
	void testGetRow() {
		List<Object> lst = List.of(
				List.of(1, 2, 3, 4, 5, 6),
				List.of(1, 2, 3, 4, 1, 6),
				List.of(1, 2, 3, 4, 5, 1)
		);
		List<Object> expected = List.of(
				List.of(0, 0),
				List.of(1, 4),
				List.of(1, 0),
				List.of(2, 5),
				List.of(2, 0)
		);
		assertEquals(expected, GetRow.getRow(lst, 1));
	}
	
	@Test
	void testGetRowEmpty() {
		List<Object> lst = List.of();
		List<Object> expected = List.of();
		assertEquals(expected, GetRow.getRow(lst, 1));
	}
	
	@Test
	void testGetRowEmptyList() {
		List<Object> lst = List.of(List.of());
		List<Object> expected = List.of();
		assertEquals(expected, GetRow.getRow(lst, 1));
	}
	
	@Test
	void testGetRowEmptyList2() {
		List<Object> lst = List.of(List.of(), List.of(1), List.of(1, 2, 3));
		List<Object> expected = List.of(List.of(2, 2));
		assertEquals(expected, GetRow.getRow(lst, 3));
	}
	
	@Test
	void testGetRowEmptyList3() {
		List<Object> lst = List.of(List.of(), List.of(1), List.of(1, 2, 3));
		List<Object> expected = List.of();
		assertEquals(expected, GetRow.getRow(lst, 4));
	}
	
	@Test
	void testGetRowEmptyList4() {
		List<Object> lst = List.of(List.of(), List.of(1), List.of(1, 2, 3));
		List<Object> expected = List.of();
		assertEquals(expected, GetRow.getRow(lst, 0));
	}
	
	@Test
	void testGetRowEmptyList5() {
		List<Object> lst = List.of(List.of(), List.of(1), List.of(1, 2, 3));
		List<Object> expected = List.of(List.of(1, 0));
		assertEquals(expected, GetRow.getRow(lst, 1));
	}
	
	@Test
	void testGetRowEmptyList6() {
		List<Object> lst = List.of(List.of(), List.of(1), List.of(1, 2, 3));
		List<Object> expected = List.of(List.of(2, 0), List.of(2, 1));
		assertEquals(expected, GetRow.getRow(lst, 1));
	}
	
	@Test
	void testGetRowEmptyList7() {
		List<Object> lst = List.of(List.of(), List.of(1), List.of(1, 2, 3));
		List<Object> expected = List.of(List.of(2, 2));
		assertEquals(expected, GetRow.getRow(lst, 3));
	}
	
	@Test
	void testGetRowEmptyList8() {
		List<Object> lst = List.of(List.of(), List.of(1), List.of(1, 2, 3));
		List<Object> expected = List.of();
		assertEquals(expected, GetRow.getRow(lst, 4));
	}
	
	@Test
	void testGetRowEmptyList9() {
		List<Object> lst = List.of(List.of(), List.of(1), List.of(1, 2, 3));
		List<Object> expected = List.of();
		assertEquals(expected, GetRow.getRow(lst, 0));
	}
}