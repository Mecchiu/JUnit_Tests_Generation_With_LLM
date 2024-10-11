// SortArray1Test.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		List<Object> array = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_oneElementArray() {
		List<Object> array = new ArrayList<Object>();
		array.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(5);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_oddSumArray() {
		List<Object> array = new ArrayList<Object>();
		array.add(2);
		array.add(4);
		array.add(3);
		array.add(0);
		array.add(1);
		array.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(0);
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_evenSumArray() {
		List<Object> array = new ArrayList<Object>();
		array.add(2);
		array.add(4);
		array.add(3);
		array.add(0);
		array.add(1);
		array.add(5);
		array.add(6);
		List<Object> expected = new ArrayList<Object>();
		expected.add(6);
		expected.add(5);
		expected.add(4);
		expected.add(3);
		expected.add(2);
		expected.add(1);
		expected.add(0);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_twoElementArray() {
		List<Object> array = new ArrayList<Object>();
		array.add(2);
		array.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_sixElementArray() {
		List<Object> array = new ArrayList<Object>();
		array.add(15);
		array.add(42);
		array.add(87);
		array.add(32);
		array.add(11);
		array.add(0);
		List<Object> expected = new ArrayList<Object>();
		expected.add(0);
		expected.add(11);
		expected.add(15);
		expected.add(32);
		expected.add(42);
		expected.add(87);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_fourElementArray() {
		List<Object> array = new ArrayList<Object>();
		array.add(21);
		array.add(14);
		array.add(23);
		array.add(11);
		List<Object> expected = new ArrayList<Object>();
		expected.add(23);
		expected.add(21);
		expected.add(14);
		expected.add(11);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_nullArray() {
		List<Object> array = null;
		assertNull(SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_nullElementArray() {
		List<Object> array = new ArrayList<Object>();
		array.add(null);
		List<Object> expected = new ArrayList<Object>();
		expected.add(null);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_nullElementArray2() {
		List<Object> array = new ArrayList<Object>();
		array.add(null);
		array.add(null);
		List<Object> expected = new ArrayList<Object>();
		expected.add(null);
		expected.add(null);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_nullElementArray3() {
		List<Object> array = new ArrayList<Object>();
		array.add(null);
		array.add(null);
		array.add(null);
		List<Object> expected = new ArrayList<Object>();
		expected.add(null);
		expected.add(null);
		expected.add(null);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_nullElementArray4() {
		List<Object> array = new ArrayList<Object>();
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		List<Object> expected = new ArrayList<Object>();
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_nullElementArray5() {
		List<Object> array = new ArrayList<Object>();
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		List<Object> expected = new ArrayList<Object>();
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_nullElementArray6() {
		List<Object> array = new ArrayList<Object>();
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		List<Object> expected = new ArrayList<Object>();
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_nullElementArray7() {
		List<Object> array = new ArrayList<Object>();
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		List<Object> expected = new ArrayList<Object>();
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_nullElementArray8() {
		List<Object> array = new ArrayList<Object>();
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		List<Object> expected = new ArrayList<Object>();
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_nullElementArray9() {
		List<Object> array = new ArrayList<Object>();
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		List<Object> expected = new ArrayList<Object>();
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_nullElementArray10() {
		List<Object> array = new ArrayList<Object>();
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		List<Object> expected = new ArrayList<Object>();
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_nullElementArray11() {
		List<Object> array = new ArrayList<Object>();
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		List<Object> expected = new ArrayList<Object>();
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_nullElementArray12() {
		List<Object> array = new ArrayList<Object>();
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		List<Object> expected = new ArrayList<Object>();
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_nullElementArray13() {
		List<Object> array = new ArrayList<Object>();
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		List<Object> expected = new ArrayList<Object>();
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_nullElementArray14() {
		List<Object> array = new ArrayList<Object>();
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		List<Object> expected = new ArrayList<Object>();
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		expected.add(null);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_nullElementArray15() {
		List<Object> array = new ArrayList<Object>();
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add(null);
		array.add