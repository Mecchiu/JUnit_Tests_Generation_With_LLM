// SortArrayTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray}.
* It contains ten unit test cases for the {@link SortArray#sortArray(List)} method.
*/
class SortArrayTest {

	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the case when the input list is empty.
	*/
	@Test
	void testSortArray_EmptyList() {
		List<Object> input = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = SortArray.sortArray(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the case when the input list contains only one element.
	*/
	@Test
	void testSortArray_OneElement() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		List<Object> actual = SortArray.sortArray(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the case when the input list contains only two elements.
	*/
	@Test
	void testSortArray_TwoElements() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		List<Object> actual = SortArray.sortArray(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the case when the input list contains only three elements.
	*/
	@Test
	void testSortArray_ThreeElements() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		expected.add(2);
		List<Object> actual = SortArray.sortArray(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the case when the input list contains only four elements.
	*/
	@Test
	void testSortArray_FourElements() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		expected.add(2);
		expected.add(4);
		List<Object> actual = SortArray.sortArray(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the case when the input list contains only five elements.
	*/
	@Test
	void testSortArray_FiveElements() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(2);
		expected.add(4);
		List<Object> actual = SortArray.sortArray(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the case when the input list contains only six elements.
	*/
	@Test
	void testSortArray_SixElements() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(2);
		expected.add(4);
		expected.add(6);
		List<Object> actual = SortArray.sortArray(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the case when the input list contains only seven elements.
	*/
	@Test
	void testSortArray_SevenElements() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(2);
		expected.add(4);
		expected.add(6);
		List<Object> actual = SortArray.sortArray(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the case when the input list contains only eight elements.
	*/
	@Test
	void testSortArray_EightElements() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(2);
		expected.add(4);
		expected.add(6);
		expected.add(8);
		List<Object> actual = SortArray.sortArray(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the case when the input list contains only nine elements.
	*/
	@Test
	void testSortArray_NineElements() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		input.add(9);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(9);
		expected.add(2);
		expected.add(4);
		expected.add(6);
		expected.add(8);
		List<Object> actual = SortArray.sortArray(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the case when the input list contains only ten elements.
	*/
	@Test
	void testSortArray_TenElements() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		input.add(9);
		input.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(9);
		expected.add(2);
		expected.add(4);
		expected.add(6);
		expected.add(8);
		expected.add(10);
		List<Object> actual = SortArray.sortArray(input);
		assertEquals(expected, actual);
	}
}