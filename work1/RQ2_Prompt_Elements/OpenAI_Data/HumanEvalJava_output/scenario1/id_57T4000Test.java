// MonotonicTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains ten unit test cases for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {

	/**
	* Test case 1.
	* The input list is empty.
	* The expected result is true.
	*/
	@Test
	void test1() {
		List<Integer> l = List.of();
		assertTrue(Monotonic.monotonic(l));
	}
	
	/**
	* Test case 2.
	* The input list contains one element.
	* The expected result is true.
	*/
	@Test
	void test2() {
		List<Integer> l = List.of(1);
		assertTrue(Monotonic.monotonic(l));
	}
	
	/**
	* Test case 3.
	* The input list contains two elements.
	* The expected result is true.
	*/
	@Test
	void test3() {
		List<Integer> l = List.of(1, 2);
		assertTrue(Monotonic.monotonic(l));
	}
	
	/**
	* Test case 4.
	* The input list contains two elements.
	* The expected result is true.
	*/
	@Test
	void test4() {
		List<Integer> l = List.of(2, 1);
		assertTrue(Monotonic.monotonic(l));
	}
	
	/**
	* Test case 5.
	* The input list contains three elements.
	* The expected result is true.
	*/
	@Test
	void test5() {
		List<Integer> l = List.of(1, 2, 3);
		assertTrue(Monotonic.monotonic(l));
	}
	
	/**
	* Test case 6.
	* The input list contains three elements.
	* The expected result is true.
	*/
	@Test
	void test6() {
		List<Integer> l = List.of(3, 2, 1);
		assertTrue(Monotonic.monotonic(l));
	}
	
	/**
	* Test case 7.
	* The input list contains three elements.
	* The expected result is false.
	*/
	@Test
	void test7() {
		List<Integer> l = List.of(1, 3, 2);
		assertFalse(Monotonic.monotonic(l));
	}
	
	/**
	* Test case 8.
	* The input list contains three elements.
	* The expected result is false.
	*/
	@Test
	void test8() {
		List<Integer> l = List.of(2, 3, 1);
		assertFalse(Monotonic.monotonic(l));
	}
	
	/**
	* Test case 9.
	* The input list contains three elements.
	* The expected result is false.
	*/
	@Test
	void test9() {
		List<Integer> l = List.of(2, 1, 3);
		assertFalse(Monotonic.monotonic(l));
	}
	
	/**
	* Test case 10.
	* The input list contains three elements.
	* The expected result is false.
	*/
	@Test
	void test10() {
		List<Integer> l = List.of(3, 1, 2);
		assertFalse(Monotonic.monotonic(l));
	}
}