// PairsSumToZeroTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PairsSumToZero}.
* It contains ten unit test cases for the {@link PairsSumToZero#pairsSumToZero(List)} method.
*/
class PairsSumToZeroTest {

	/**
	* Test case 1:
	* Input: [1, 2, 3, -3]
	* Expected output: true
	*/
	@Test
	void test1() {
		List<Integer> l = List.of(1, 2, 3, -3);
		assertTrue(PairsSumToZero.pairsSumToZero(l));
	}
	
	/**
	* Test case 2:
	* Input: [1, 2, 3, -2]
	* Expected output: false
	*/
	@Test
	void test2() {
		List<Integer> l = List.of(1, 2, 3, -2);
		assertFalse(PairsSumToZero.pairsSumToZero(l));
	}
	
	/**
	* Test case 3:
	* Input: [1, 2, 3, -1]
	* Expected output: false
	*/
	@Test
	void test3() {
		List<Integer> l = List.of(1, 2, 3, -1);
		assertFalse(PairsSumToZero.pairsSumToZero(l));
	}
	
	/**
	* Test case 4:
	* Input: [1, 2, 3, 0]
	* Expected output: false
	*/
	@Test
	void test4() {
		List<Integer> l = List.of(1, 2, 3, 0);
		assertFalse(PairsSumToZero.pairsSumToZero(l));
	}
	
	/**
	* Test case 5:
	* Input: [1, 2, 3, -4]
	* Expected output: false
	*/
	@Test
	void test5() {
		List<Integer> l = List.of(1, 2, 3, -4);
		assertFalse(PairsSumToZero.pairsSumToZero(l));
	}
	
	/**
	* Test case 6:
	* Input: [1, 2, 3, -5]
	* Expected output: false
	*/
	@Test
	void test6() {
		List<Integer> l = List.of(1, 2, 3, -5);
		assertFalse(PairsSumToZero.pairsSumToZero(l));
	}
	
	/**
	* Test case 7:
	* Input: [1, 2, 3, -6]
	* Expected output: false
	*/
	@Test
	void test7() {
		List<Integer> l = List.of(1, 2, 3, -6);
		assertFalse(PairsSumToZero.pairsSumToZero(l));
	}
	
	/**
	* Test case 8:
	* Input: [1, 2, 3, -7]
	* Expected output: false
	*/
	@Test
	void test8() {
		List<Integer> l = List.of(1, 2, 3, -7);
		assertFalse(PairsSumToZero.pairsSumToZero(l));
	}
	
	/**
	* Test case 9:
	* Input: [1, 2, 3, -8]
	* Expected output: false
	*/
	@Test
	void test9() {
		List<Integer> l = List.of(1, 2, 3, -8);
		assertFalse(PairsSumToZero.pairsSumToZero(l));
	}
	
	/**
	* Test case 10:
	* Input: [1, 2, 3, -9]
	* Expected output: false
	*/
	@Test
	void test10() {
		List<Integer> l = List.of(1, 2, 3, -9);
		assertFalse(PairsSumToZero.pairsSumToZero(l));
	}
}