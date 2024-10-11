// UniqueTest.java
package scenario1;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Unique}.
* It contains ten unit test cases for the {@link Unique#unique(List)} method.
*/
class UniqueTest {

	/**
	* Test case 1.
	* The input list is empty.
	* The expected result is an empty list.
	*/
	@Test
	void test1() {
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> expected = new ArrayList<Integer>();
		List<Integer> actual = Unique.unique(l);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input list contains one element.
	* The expected result is a list with one element.
	*/
	@Test
	void test2() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		List<Integer> actual = Unique.unique(l);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input list contains two elements.
	* The expected result is a list with two elements.
	*/
	@Test
	void test3() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		List<Integer> actual = Unique.unique(l);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input list contains two elements.
	* The expected result is a list with one element.
	*/
	@Test
	void test4() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(1);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		List<Integer> actual = Unique.unique(l);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input list contains three elements.
	* The expected result is a list with three elements.
	*/
	@Test
	void test5() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		List<Integer> actual = Unique.unique(l);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input list contains three elements.
	* The expected result is a list with two elements.
	*/
	@Test
	void test6() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(1);
		l.add(2);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		List<Integer> actual = Unique.unique(l);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input list contains three elements.
	* The expected result is a list with two elements.
	*/
	@Test
	void test7() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(2);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		List<Integer> actual = Unique.unique(l);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input list contains three elements.
	* The expected result is a list with one element.
	*/
	@Test
	void test8() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(1);
		l.add(1);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		List<Integer> actual = Unique.unique(l);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input list contains four elements.
	* The expected result is a list with four elements.
	*/
	@Test
	void test9() {
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
		List<Integer> actual = Unique.unique(l);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input list contains four elements.
	* The expected result is a list with three elements.
	*/
	@Test
	void test10() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(1);
		l.add(2);
		l.add(2);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		List<Integer> actual = Unique.unique(l);
		assertEquals(expected, actual);
	}
}