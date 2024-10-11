// StrangeSortListTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrangeSortList}.
* It contains ten unit test cases for the {@link StrangeSortList#strangeSortList(List)} method.
*/
class StrangeSortListTest {

	/**
	* Test case 1.
	* The input list contains only integers.
	* The expected result is a list with the same integers in strange order.
	*/
	@Test
	void testCase1() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(5);
		expected.add(2);
		expected.add(4);
		expected.add(3);
		List<Object> actual = StrangeSortList.strangeSortList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input list contains only integers.
	* The expected result is a list with the same integers in strange order.
	*/
	@Test
	void testCase2() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(6);
		expected.add(2);
		expected.add(5);
		expected.add(3);
		expected.add(4);
		List<Object> actual = StrangeSortList.strangeSortList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input list contains only integers.
	* The expected result is a list with the same integers in strange order.
	*/
	@Test
	void testCase3() {
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
		expected.add(7);
		expected.add(2);
		expected.add(6);
		expected.add(3);
		expected.add(5);
		expected.add(4);
		List<Object> actual = StrangeSortList.strangeSortList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input list contains only integers.
	* The expected result is a list with the same integers in strange order.
	*/
	@Test
	void testCase4() {
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
		expected.add(8);
		expected.add(2);
		expected.add(7);
		expected.add(3);
		expected.add(6);
		expected.add(4);
		expected.add(5);
		List<Object> actual = StrangeSortList.strangeSortList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input list contains only integers.
	* The expected result is a list with the same integers in strange order.
	*/
	@Test
	void testCase5() {
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
		expected.add(9);
		expected.add(2);
		expected.add(8);
		expected.add(3);
		expected.add(7);
		expected.add(4);
		expected.add(6);
		expected.add(5);
		List<Object> actual = StrangeSortList.strangeSortList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input list contains only integers.
	* The expected result is a list with the same integers in strange order.
	*/
	@Test
	void testCase6() {
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
		expected.add(10);
		expected.add(2);
		expected.add(9);
		expected.add(3);
		expected.add(8);
		expected.add(4);
		expected.add(7);
		expected.add(5);
		expected.add(6);
		List<Object> actual = StrangeSortList.strangeSortList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input list contains only integers.
	* The expected result is a list with the same integers in strange order.
	*/
	@Test
	void testCase7() {
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
		input.add(11);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(11);
		expected.add(2);
		expected.add(10);
		expected.add(3);
		expected.add(9);
		expected.add(4);
		expected.add(8);
		expected.add(5);
		expected.add(7);
		expected.add(6);
		List<Object> actual = StrangeSortList.strangeSortList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input list contains only integers.
	* The expected result is a list with the same integers in strange order.
	*/
	@Test
	void testCase8() {
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
		input.add(11);
		input.add(12);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(12);
		expected.add(2);
		expected.add(11);
		expected.add(3);
		expected.add(10);
		expected.add(4);
		expected.add(9);
		expected.add(5);
		expected.add(8);
		expected.add(6);
		expected.add(7);
		List<Object> actual = StrangeSortList.strangeSortList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input list contains only integers.
	* The expected result is a list with the same integers in strange order.
	*/
	@Test
	void testCase9() {
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
		input.add(11);
		input.add(12);
		input.add(13);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(13);
		expected.add(2);
		expected.add(12);
		expected.add(3);
		expected.add(11);
		expected.add(4);
		expected.add(10);
		expected.add(5);
		expected.add(9);
		expected.add(6);
		expected.add(8);
		expected.add(7);
		List<Object> actual = StrangeSortList.strangeSortList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input list contains only integers.
	* The expected result is a list with the same integers in strange order.
	*/
	@Test
	void testCase10() {
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
		input.add(11);
		input.add(12);
		input.add(13);
		input.add(14);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(14);
		expected.add(2);
		expected.add(13);
		expected.add(3);
		expected.add(12);
		expected.add(4);
		expected.add(11);
		expected.add(5);
		expected.add(10);
		expected.add(6);
		expected.add(9);
		expected.add(7);
		expected.add(8);
		List<Object> actual = StrangeSortList.strangeSortList(input);
		assertEquals(expected, actual);
	}
}