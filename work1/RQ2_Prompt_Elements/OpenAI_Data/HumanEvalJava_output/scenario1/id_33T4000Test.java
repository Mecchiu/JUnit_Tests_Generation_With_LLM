// SortThirdTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortThird}.
* It contains ten unit test cases for the {@link SortThird#sortThird(List)} method.
*/
class SortThirdTest {

	/**
	* Test case 1.
	* The input list is empty.
	* The expected result is an empty list.
	*/
	@Test
	void test1() {
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> expected = new ArrayList<Integer>();
		List<Integer> actual = SortThird.sortThird(l);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input list contains one element.
	* The expected result is the same list.
	*/
	@Test
	void test2() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		List<Integer> actual = SortThird.sortThird(l);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input list contains two elements.
	* The expected result is the same list.
	*/
	@Test
	void test3() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		List<Integer> actual = SortThird.sortThird(l);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input list contains three elements.
	* The expected result is the same list.
	*/
	@Test
	void test4() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		List<Integer> actual = SortThird.sortThird(l);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input list contains four elements.
	* The expected result is the same list.
	*/
	@Test
	void test5() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		List<Integer> actual = SortThird.sortThird(l);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input list contains five elements.
	* The expected result is the same list.
	*/
	@Test
	void test6() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		List<Integer> actual = SortThird.sortThird(l);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input list contains six elements.
	* The expected result is the same list.
	*/
	@Test
	void test7() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		List<Integer> actual = SortThird.sortThird(l);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input list contains seven elements.
	* The expected result is the same list.
	*/
	@Test
	void test8() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		List<Integer> actual = SortThird.sortThird(l);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input list contains eight elements.
	* The expected result is the same list.
	*/
	@Test
	void test9() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		List<Integer> actual = SortThird.sortThird(l);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input list contains nine elements.
	* The expected result is the same list.
	*/
	@Test
	void test10() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		List<Integer> actual = SortThird.sortThird(l);
		assertEquals(expected, actual);
	}
}