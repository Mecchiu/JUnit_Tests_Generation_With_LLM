// StrangeSortListTest.java
package scenario1;

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
	* The input list is empty.
	* The expected result is an empty list.
	*/
	@Test
	void testCase1() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case 2.
	* The input list contains only one element.
	* The expected result is the same list.
	*/
	@Test
	void testCase2() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case 3.
	* The input list contains only two elements.
	* The expected result is the same list.
	*/
	@Test
	void testCase3() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case 4.
	* The input list contains only three elements.
	* The expected result is the same list.
	*/
	@Test
	void testCase4() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case 5.
	* The input list contains only four elements.
	* The expected result is the same list.
	*/
	@Test
	void testCase5() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case 6.
	* The input list contains only five elements.
	* The expected result is the same list.
	*/
	@Test
	void testCase6() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case 7.
	* The input list contains only six elements.
	* The expected result is the same list.
	*/
	@Test
	void testCase7() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case 8.
	* The input list contains only seven elements.
	* The expected result is the same list.
	*/
	@Test
	void testCase8() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		lst.add(7);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case 9.
	* The input list contains only eight elements.
	* The expected result is the same list.
	*/
	@Test
	void testCase9() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		lst.add(7);
		lst.add(8);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case 10.
	* The input list contains only nine elements.
	* The expected result is the same list.
	*/
	@Test
	void testCase10() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		lst.add(7);
		lst.add(8);
		lst.add(9);
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
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
}