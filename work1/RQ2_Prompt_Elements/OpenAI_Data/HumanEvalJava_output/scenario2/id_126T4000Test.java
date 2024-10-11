// IsSortedTest.java
package scenario2;

import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains ten unit test cases for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {

	/**
	* Test case 1:
	* Input: [1, 2, 3, 4, 5]
	* Expected output: true
	*/
	@Test
	void test1() {
		List<Object> lst = List.of(1, 2, 3, 4, 5);
		assertTrue(IsSorted.isSorted(lst));
	}
	
	/**
	* Test case 2:
	* Input: [1, 2, 3, 4, 5, 5]
	* Expected output: false
	*/
	@Test
	void test2() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 5);
		assertFalse(IsSorted.isSorted(lst));
	}
	
	/**
	* Test case 3:
	* Input: [1, 2, 3, 4, 5, 5, 5]
	* Expected output: false
	*/
	@Test
	void test3() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 5, 5);
		assertFalse(IsSorted.isSorted(lst));
	}
	
	/**
	* Test case 4:
	* Input: [1, 2, 3, 4, 5, 5, 5, 6]
	* Expected output: false
	*/
	@Test
	void test4() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 5, 5, 6);
		assertFalse(IsSorted.isSorted(lst));
	}
	
	/**
	* Test case 5:
	* Input: [1, 2, 3, 4, 5, 5, 5, 6, 7]
	* Expected output: false
	*/
	@Test
	void test5() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 5, 5, 6, 7);
		assertFalse(IsSorted.isSorted(lst));
	}
	
	/**
	* Test case 6:
	* Input: [1, 2, 3, 4, 5, 5, 5, 6, 7, 8]
	* Expected output: false
	*/
	@Test
	void test6() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 5, 5, 6, 7, 8);
		assertFalse(IsSorted.isSorted(lst));
	}
	
	/**
	* Test case 7:
	* Input: [1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9]
	* Expected output: false
	*/
	@Test
	void test7() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9);
		assertFalse(IsSorted.isSorted(lst));
	}
	
	/**
	* Test case 8:
	* Input: [1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10]
	* Expected output: false
	*/
	@Test
	void test8() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10);
		assertFalse(IsSorted.isSorted(lst));
	}
	
	/**
	* Test case 9:
	* Input: [1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 11]
	* Expected output: false
	*/
	@Test
	void test9() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 11);
		assertFalse(IsSorted.isSorted(lst));
	}
	
	/**
	* Test case 10:
	* Input: [1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 11, 12]
	* Expected output: false
	*/
	@Test
	void test10() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 11, 12);
		assertFalse(IsSorted.isSorted(lst));
	}
}