// SearchTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Search}.
* It contains ten unit test cases for the {@link Search#search(List)} method.
*/
class SearchTest {

	/**
	* Test case 1.
	* The input list is empty.
	* The expected result is -1.
	*/
	@Test
	void test1() {
		List<Integer> lst = List.of();
		int expected = -1;
		int actual = Search.search(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input list contains only one element.
	* The expected result is -1.
	*/
	@Test
	void test2() {
		List<Integer> lst = List.of(1);
		int expected = -1;
		int actual = Search.search(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input list contains only two elements.
	* The expected result is -1.
	*/
	@Test
	void test3() {
		List<Integer> lst = List.of(1, 2);
		int expected = -1;
		int actual = Search.search(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input list contains only three elements.
	* The expected result is -1.
	*/
	@Test
	void test4() {
		List<Integer> lst = List.of(1, 2, 3);
		int expected = -1;
		int actual = Search.search(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input list contains only four elements.
	* The expected result is -1.
	*/
	@Test
	void test5() {
		List<Integer> lst = List.of(1, 2, 3, 4);
		int expected = -1;
		int actual = Search.search(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input list contains only five elements.
	* The expected result is -1.
	*/
	@Test
	void test6() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5);
		int expected = -1;
		int actual = Search.search(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input list contains only six elements.
	* The expected result is -1.
	*/
	@Test
	void test7() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6);
		int expected = -1;
		int actual = Search.search(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input list contains only seven elements.
	* The expected result is -1.
	*/
	@Test
	void test8() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7);
		int expected = -1;
		int actual = Search.search(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input list contains only eight elements.
	* The expected result is -1.
	*/
	@Test
	void test9() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8);
		int expected = -1;
		int actual = Search.search(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input list contains only nine elements.
	* The expected result is -1.
	*/
	@Test
	void test10() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int expected = -1;
		int actual = Search.search(lst);
		assertEquals(expected, actual);
	}
}