// SortArray1Test.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray1}.
* It contains ten unit test cases for the {@link SortArray1#sortArray(List)} method.
*/
class SortArray1Test {

	@Test
	void testSortArray_emptyArray() {
		List<Object> array = List.of();
		List<Object> expected = List.of();
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortArray_oneElementArray() {
		List<Object> array = List.of(5);
		List<Object> expected = List.of(5);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortArray_oddSumArray() {
		List<Object> array = List.of(2, 4, 3, 0, 1, 5);
		List<Object> expected = List.of(0, 1, 2, 3, 4, 5);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortArray_evenSumArray() {
		List<Object> array = List.of(2, 4, 3, 0, 1, 5, 6);
		List<Object> expected = List.of(6, 5, 4, 3, 2, 1, 0);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortArray_twoElementArray() {
		List<Object> array = List.of(2, 1);
		List<Object> expected = List.of(1, 2);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortArray_oddSumArray2() {
		List<Object> array = List.of(15, 42, 87, 32, 11, 0);
		List<Object> expected = List.of(0, 11, 15, 32, 42, 87);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortArray_evenSumArray2() {
		List<Object> array = List.of(21, 14, 23, 11);
		List<Object> expected = List.of(23, 21, 14, 11);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortArray_oddSumArray3() {
		List<Object> array = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortArray_evenSumArray3() {
		List<Object> array = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		List<Object> expected = List.of(11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortArray_oddSumArray4() {
		List<Object> array = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortArray_evenSumArray4() {
		List<Object> array = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
		List<Object> expected = List.of(13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
}