// SortThirdTest.java
package original;

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
	* Test case for {@link SortThird#sortThird(List)} method.
	* It tests the method with a list of size 3.
	*/
	@Test
	void testSortThird1() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		assertEquals(l2, SortThird.sortThird(l));
	}
	
	/**
	* Test case for {@link SortThird#sortThird(List)} method.
	* It tests the method with a list of size 7.
	*/
	@Test
	void testSortThird2() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(3);
		l.add(4);
		l.add(8);
		l.add(9);
		l.add(2);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(2);
		l2.add(6);
		l2.add(3);
		l2.add(4);
		l2.add(8);
		l2.add(9);
		l2.add(5);
		assertEquals(l2, SortThird.sortThird(l));
	}
	
	/**
	* Test case for {@link SortThird#sortThird(List)} method.
	* It tests the method with a list of size 3.
	*/
	@Test
	void testSortThird3() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		assertEquals(l2, SortThird.sortThird(l));
	}
	
	/**
	* Test case for {@link SortThird#sortThird(List)} method.
	* It tests the method with a list of size 11.
	*/
	@Test
	void testSortThird4() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(3);
		l.add(-5);
		l.add(2);
		l.add(-3);
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(123);
		l.add(1);
		l.add(-10);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(3);
		l2.add(-5);
		l2.add(2);
		l2.add(-3);
		l2.add(3);
		l2.add(5);
		l2.add(0);
		l2.add(123);
		l2.add(9);
		l2.add(-10);
		assertEquals(l2, SortThird.sortThird(l));
	}
	
	/**
	* Test case for {@link SortThird#sortThird(List)} method.
	* It tests the method with a list of size 10.
	*/
	@Test
	void testSortThird5() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(8);
		l.add(-12);
		l.add(4);
		l.add(23);
		l.add(2);
		l.add(3);
		l.add(11);
		l.add(12);
		l.add(-10);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(-10);
		l2.add(8);
		l2.add(-12);
		l2.add(3);
		l2.add(23);
		l2.add(2);
		l2.add(4);
		l2.add(11);
		l2.add(12);
		l2.add(5);
		assertEquals(l2, SortThird.sortThird(l));
	}
	
	/**
	* Test case for {@link SortThird#sortThird(List)} method.
	* It tests the method with a list of size 7.
	*/
	@Test
	void testSortThird6() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(3);
		l.add(4);
		l.add(8);
		l.add(9);
		l.add(2);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(2);
		l2.add(6);
		l2.add(3);
		l2.add(4);
		l2.add(8);
		l2.add(9);
		l2.add(5);
		assertEquals(l2, SortThird.sortThird(l));
	}
	
	/**
	* Test case for {@link SortThird#sortThird(List)} method.
	* It tests the method with a list of size 7.
	*/
	@Test
	void testSortThird7() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(8);
		l.add(3);
		l.add(4);
		l.add(6);
		l.add(9);
		l.add(2);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(2);
		l2.add(8);
		l2.add(3);
		l2.add(4);
		l2.add(6);
		l2.add(9);
		l2.add(5);
		assertEquals(l2, SortThird.sortThird(l));
	}
	
	/**
	* Test case for {@link SortThird#sortThird(List)} method.
	* It tests the method with a list of size 7.
	*/
	@Test
	void testSortThird8() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(9);
		l.add(4);
		l.add(8);
		l.add(3);
		l.add(2);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(2);
		l2.add(6);
		l2.add(9);
		l2.add(4);
		l2.add(8);
		l2.add(3);
		l2.add(5);
		assertEquals(l2, SortThird.sortThird(l));
	}
	
	/**
	* Test case for {@link SortThird#sortThird(List)} method.
	* It tests the method with a list of size 8.
	*/
	@Test
	void testSortThird9() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(3);
		l.add(4);
		l.add(8);
		l.add(9);
		l.add(2);
		l.add(1);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(2);
		l2.add(6);
		l2.add(3);
		l2.add(4);
		l2.add(8);
		l2.add(9);
		l2.add(5);
		l2.add(1);
		assertEquals(l2, SortThird.sortThird(l));
	}
}