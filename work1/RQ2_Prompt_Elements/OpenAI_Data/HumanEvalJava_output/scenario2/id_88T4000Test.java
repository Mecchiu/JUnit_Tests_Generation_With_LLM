// SortArray1Test.java
package scenario2;

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
	void testSortArray_1() {
		List<Object> array = new ArrayList<Object>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(7);
		array.add(8);
		array.add(9);
		array.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortArray_2() {
		List<Object> array = new ArrayList<Object>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(7);
		array.add(8);
		array.add(9);
		array.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(10);
		expected.add(9);
		expected.add(8);
		expected.add(7);
		expected.add(6);
		expected.add(5);
		expected.add(4);
		expected.add(3);
		expected.add(2);
		expected.add(1);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortArray_3() {
		List<Object> array = new ArrayList<Object>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(7);
		array.add(8);
		array.add(9);
		array.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortArray_4() {
		List<Object> array = new ArrayList<Object>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(7);
		array.add(8);
		array.add(9);
		array.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(10);
		expected.add(9);
		expected.add(8);
		expected.add(7);
		expected.add(6);
		expected.add(5);
		expected.add(4);
		expected.add(3);
		expected.add(2);
		expected.add(1);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortArray_5() {
		List<Object> array = new ArrayList<Object>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(7);
		array.add(8);
		array.add(9);
		array.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortArray_6() {
		List<Object> array = new ArrayList<Object>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(7);
		array.add(8);
		array.add(9);
		array.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(10);
		expected.add(9);
		expected.add(8);
		expected.add(7);
		expected.add(6);
		expected.add(5);
		expected.add(4);
		expected.add(3);
		expected.add(2);
		expected.add(1);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortArray_7() {
		List<Object> array = new ArrayList<Object>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(7);
		array.add(8);
		array.add(9);
		array.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortArray_8() {
		List<Object> array = new ArrayList<Object>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(7);
		array.add(8);
		array.add(9);
		array.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(10);
		expected.add(9);
		expected.add(8);
		expected.add(7);
		expected.add(6);
		expected.add(5);
		expected.add(4);
		expected.add(3);
		expected.add(2);
		expected.add(1);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortArray_9() {
		List<Object> array = new ArrayList<Object>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(7);
		array.add(8);
		array.add(9);
		array.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortArray_10() {
		List<Object> array = new ArrayList<Object>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(7);
		array.add(8);
		array.add(9);
		array.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(10);
		expected.add(9);
		expected.add(8);
		expected.add(7);
		expected.add(6);
		expected.add(5);
		expected.add(4);
		expected.add(3);
		expected.add(2);
		expected.add(1);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
}