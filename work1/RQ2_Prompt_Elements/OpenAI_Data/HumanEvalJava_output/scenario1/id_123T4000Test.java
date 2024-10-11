// GetOddCollatzTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetOddCollatz}.
* It contains ten unit test cases for the {@link GetOddCollatz#getOddCollatz(int)} method.
*/
class GetOddCollatzTest {

	/**
	* Test case 1.
	* The input is 1.
	* The expected output is [1].
	*/
	@Test
	void test1() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		assertEquals(expected, GetOddCollatz.getOddCollatz(1));
	}
	
	/**
	* Test case 2.
	* The input is 2.
	* The expected output is [1].
	*/
	@Test
	void test2() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		assertEquals(expected, GetOddCollatz.getOddCollatz(2));
	}
	
	/**
	* Test case 3.
	* The input is 3.
	* The expected output is [3, 10, 5, 16, 8, 4, 2, 1].
	*/
	@Test
	void test3() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(3);
		expected.add(10);
		expected.add(5);
		expected.add(16);
		expected.add(8);
		expected.add(4);
		expected.add(2);
		expected.add(1);
		assertEquals(expected, GetOddCollatz.getOddCollatz(3));
	}
	
	/**
	* Test case 4.
	* The input is 4.
	* The expected output is [1].
	*/
	@Test
	void test4() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		assertEquals(expected, GetOddCollatz.getOddCollatz(4));
	}
	
	/**
	* Test case 5.
	* The input is 5.
	* The expected output is [5, 16, 8, 4, 2, 1].
	*/
	@Test
	void test5() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(5);
		expected.add(16);
		expected.add(8);
		expected.add(4);
		expected.add(2);
		expected.add(1);
		assertEquals(expected, GetOddCollatz.getOddCollatz(5));
	}
	
	/**
	* Test case 6.
	* The input is 6.
	* The expected output is [5, 16, 8, 4, 2, 1].
	*/
	@Test
	void test6() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(5);
		expected.add(16);
		expected.add(8);
		expected.add(4);
		expected.add(2);
		expected.add(1);
		assertEquals(expected, GetOddCollatz.getOddCollatz(6));
	}
	
	/**
	* Test case 7.
	* The input is 7.
	* The expected output is [7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1].
	*/
	@Test
	void test7() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(7);
		expected.add(22);
		expected.add(11);
		expected.add(34);
		expected.add(17);
		expected.add(52);
		expected.add(26);
		expected.add(13);
		expected.add(40);
		expected.add(20);
		expected.add(10);
		expected.add(5);
		expected.add(16);
		expected.add(8);
		expected.add(4);
		expected.add(2);
		expected.add(1);
		assertEquals(expected, GetOddCollatz.getOddCollatz(7));
	}
	
	/**
	* Test case 8.
	* The input is 8.
	* The expected output is [1].
	*/
	@Test
	void test8() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		assertEquals(expected, GetOddCollatz.getOddCollatz(8));
	}
	
	/**
	* Test case 9.
	* The input is 9.
	* The expected output is [9, 28, 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1].
	*/
	@Test
	void test9() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(9);
		expected.add(28);
		expected.add(14);
		expected.add(7);
		expected.add(22);
		expected.add(11);
		expected.add(34);
		expected.add(17);
		expected.add(52);
		expected.add(26);
		expected.add(13);
		expected.add(40);
		expected.add(20);
		expected.add(10);
		expected.add(5);
		expected.add(16);
		expected.add(8);
		expected.add(4);
		expected.add(2);
		expected.add(1);
		assertEquals(expected, GetOddCollatz.getOddCollatz(9));
	}
	
	/**
	* Test case 10.
	* The input is 10.
	* The expected output is [5, 16, 8, 4, 2, 1].
	*/
	@Test
	void test10() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(5);
		expected.add(16);
		expected.add(8);
		expected.add(4);
		expected.add(2);
		expected.add(1);
		assertEquals(expected, GetOddCollatz.getOddCollatz(10));
	}
}