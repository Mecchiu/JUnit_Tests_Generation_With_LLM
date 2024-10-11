// SortEvenTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortEven}.
* It contains ten unit test cases for the {@link SortEven#sortEven(List)} method.
*/
class SortEvenTest {

	/**
	* Test case for {@link SortEven#sortEven(List)} method.
	* It tests the method with a list of three elements.
	*/
	@Test
	void testSortEven1() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		assertEquals(l2, SortEven.sortEven(l));
	}
	
	/**
	* Test case for {@link SortEven#sortEven(List)} method.
	* It tests the method with a list of four elements.
	*/
	@Test
	void testSortEven2() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(3);
		l.add(4);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(3);
		l2.add(6);
		l2.add(5);
		l2.add(4);
		assertEquals(l2, SortEven.sortEven(l));
	}
	
	/**
	* Test case for {@link SortEven#sortEven(List)} method.
	* It tests the method with a list of three elements.
	*/
	@Test
	void testSortEven3() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		assertEquals(l2, SortEven.sortEven(l));
	}
	
	/**
	* Test case for {@link SortEven#sortEven(List)} method.
	* It tests the method with a list of eleven elements.
	*/
	@Test
	void testSortEven4() {
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
		l2.add(-10);
		l2.add(3);
		l2.add(-5);
		l2.add(2);
		l2.add(-3);
		l2.add(3);
		l2.add(5);
		l2.add(0);
		l2.add(9);
		l2.add(1);
		l2.add(123);
		assertEquals(l2, SortEven.sortEven(l));
	}
	
	/**
	* Test case for {@link SortEven#sortEven(List)} method.
	* It tests the method with a list of ten elements.
	*/
	@Test
	void testSortEven5() {
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
		l2.add(-12);
		l2.add(8);
		l2.add(3);
		l2.add(4);
		l2.add(5);
		l2.add(2);
		l2.add(12);
		l2.add(11);
		l2.add(23);
		l2.add(-10);
		assertEquals(l2, SortEven.sortEven(l));
	}
	
	/**
	* Test case for {@link SortEven#sortEven(List)} method.
	* It tests the method with a list of three elements.
	*/
	@Test
	void testSortEven6() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		assertEquals(l2, SortEven.sortEven(l));
	}
	
	/**
	* Test case for {@link SortEven#sortEven(List)} method.
	* It tests the method with a list of four elements.
	*/
	@Test
	void testSortEven7() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(3);
		l.add(4);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(3);
		l2.add(6);
		l2.add(5);
		l2.add(4);
		assertEquals(l2, SortEven.sortEven(l));
	}
	
	/**
	* Test case for {@link SortEven#sortEven(List)} method.
	* It tests the method with a list of three elements.
	*/
	@Test
	void testSortEven8() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		assertEquals(l2, SortEven.sortEven(l));
	}
	
	/**
	* Test case for {@link SortEven#sortEven(List)} method.
	* It tests the method with a list of eleven elements.
	*/
	@Test
	void testSortEven9() {
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
		l2.add(-10);
		l2.add(3);
		l2.add(-5);
		l2.add(2);
		l2.add(-3);
		l2.add(3);
		l2.add(5);
		l2.add(0);
		l2.add(9);
		l2.add(1);
		l2.add(123);
		assertEquals(l2, SortEven.sortEven(l));
	}
	
	/**
	* Test case for {@link SortEven#sortEven(List)} method.
	* It tests the method with a list of ten elements.
	*/
	@Test
	void testSortEven10() {
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
		l2.add(-12);
		l2.add(8);
		l2.add(3);
		l2.add(4);
		l2.add(5);
		l2.add(2);
		l2.add(12);
		l2.add(11);
		l2.add(23);
		l2.add(-10);
		assertEquals(l2, SortEven.sortEven(l));
	}
}