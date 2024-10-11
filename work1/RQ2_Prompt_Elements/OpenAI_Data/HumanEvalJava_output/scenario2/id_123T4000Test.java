// GetOddCollatzTest.java
package scenario2;

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
	* Test case 1:
	* Input: n = 1
	* Expected output: [1]
	*/
	@Test
	void testCase1() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		List<Integer> actual = GetOddCollatz.getOddCollatz(1);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2:
	* Input: n = 2
	* Expected output: [1]
	*/
	@Test
	void testCase2() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		List<Integer> actual = GetOddCollatz.getOddCollatz(2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3:
	* Input: n = 3
	* Expected output: [3, 10, 5, 16, 8, 4, 2, 1]
	*/
	@Test
	void testCase3() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(3);
		expected.add(10);
		expected.add(5);
		expected.add(16);
		expected.add(8);
		expected.add(4);
		expected.add(2);
		expected.add(1);
		List<Integer> actual = GetOddCollatz.getOddCollatz(3);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4:
	* Input: n = 4
	* Expected output: [1]
	*/
	@Test
	void testCase4() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		List<Integer> actual = GetOddCollatz.getOddCollatz(4);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5:
	* Input: n = 5
	* Expected output: [5, 16, 8, 4, 2, 1]
	*/
	@Test
	void testCase5() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(5);
		expected.add(16);
		expected.add(8);
		expected.add(4);
		expected.add(2);
		expected.add(1);
		List<Integer> actual = GetOddCollatz.getOddCollatz(5);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6:
	* Input: n = 6
	* Expected output: [3, 10, 5, 16, 8, 4, 2, 1]
	*/
	@Test
	void testCase6() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(3);
		expected.add(10);
		expected.add(5);
		expected.add(16);
		expected.add(8);
		expected.add(4);
		expected.add(2);
		expected.add(1);
		List<Integer> actual = GetOddCollatz.getOddCollatz(6);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7:
	* Input: n = 7
	* Expected output: [7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1]
	*/
	@Test
	void testCase7() {
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
		List<Integer> actual = GetOddCollatz.getOddCollatz(7);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8:
	* Input: n = 8
	* Expected output: [1]
	*/
	@Test
	void testCase8() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		List<Integer> actual = GetOddCollatz.getOddCollatz(8);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9:
	* Input: n = 9
	* Expected output: [9, 28, 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1]
	*/
	@Test
	void testCase9() {
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
		List<Integer> actual = GetOddCollatz.getOddCollatz(9);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10:
	* Input: n = 10
	* Expected output: [5, 16, 8, 4, 2, 1]
	*/
	@Test
	void testCase10() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(5);
		expected.add(16);
		expected.add(8);
		expected.add(4);
		expected.add(2);
		expected.add(1);
		List<Integer> actual = GetOddCollatz.getOddCollatz(10);
		assertEquals(expected, actual);
	}
}