// SortArray1Test.java
package scenario1;

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

	/**
	* Test case 1.
	* The input array is empty.
	* The expected result is an empty array.
	*/
	@Test
	void testCase1() {
		List<Object> array = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input array contains one element.
	* The expected result is the same array.
	*/
	@Test
	void testCase2() {
		List<Object> array = new ArrayList<Object>();
		array.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input array contains two elements.
	* The expected result is the same array.
	*/
	@Test
	void testCase3() {
		List<Object> array = new ArrayList<Object>();
		array.add(1);
		array.add(2);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input array contains three elements.
	* The expected result is the same array.
	*/
	@Test
	void testCase4() {
		List<Object> array = new ArrayList<Object>();
		array.add(1);
		array.add(2);
		array.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input array contains four elements.
	* The expected result is the same array.
	*/
	@Test
	void testCase5() {
		List<Object> array = new ArrayList<Object>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input array contains five elements.
	* The expected result is the same array.
	*/
	@Test
	void testCase6() {
		List<Object> array = new ArrayList<Object>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input array contains six elements.
	* The expected result is the same array.
	*/
	@Test
	void testCase7() {
		List<Object> array = new ArrayList<Object>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input array contains seven elements.
	* The expected result is the same array.
	*/
	@Test
	void testCase8() {
		List<Object> array = new ArrayList<Object>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(7);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input array contains eight elements.
	* The expected result is the same array.
	*/
	@Test
	void testCase9() {
		List<Object> array = new ArrayList<Object>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(7);
		array.add(8);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input array contains nine elements.
	* The expected result is the same array.
	*/
	@Test
	void testCase10() {
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
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
}