// LargestSmallestIntegersTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestSmallestIntegers}.
* It contains ten unit test cases for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
*/
class LargestSmallestIntegersTest {

	/**
	* Test case 1.
	* The input list contains only negative integers.
	* The expected result is a list containing the largest negative integer and null.
	*/
	@Test
	void testCase1() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-1);
		lst.add(-2);
		lst.add(-3);
		lst.add(-4);
		lst.add(-5);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(-1);
		expected.add(null);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
	
	/**
	* Test case 2.
	* The input list contains only positive integers.
	* The expected result is a list containing null and the smallest positive integer.
	*/
	@Test
	void testCase2() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(null);
		expected.add(1);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
	
	/**
	* Test case 3.
	* The input list contains only zero.
	* The expected result is a list containing null and null.
	*/
	@Test
	void testCase3() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(0);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(null);
		expected.add(null);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
	
	/**
	* Test case 4.
	* The input list contains only one negative integer.
	* The expected result is a list containing the negative integer and null.
	*/
	@Test
	void testCase4() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-1);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(-1);
		expected.add(null);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
	
	/**
	* Test case 5.
	* The input list contains only one positive integer.
	* The expected result is a list containing null and the positive integer.
	*/
	@Test
	void testCase5() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(null);
		expected.add(1);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
	
	/**
	* Test case 6.
	* The input list contains negative and positive integers.
	* The expected result is a list containing the largest negative integer and the smallest positive integer.
	*/
	@Test
	void testCase6() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-1);
		lst.add(1);
		lst.add(-2);
		lst.add(2);
		lst.add(-3);
		lst.add(3);
		lst.add(-4);
		lst.add(4);
		lst.add(-5);
		lst.add(5);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(-1);
		expected.add(1);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
	
	/**
	* Test case 7.
	* The input list contains negative and positive integers.
	* The expected result is a list containing the largest negative integer and the smallest positive integer.
	*/
	@Test
	void testCase7() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-1);
		lst.add(1);
		lst.add(-2);
		lst.add(2);
		lst.add(-3);
		lst.add(3);
		lst.add(-4);
		lst.add(4);
		lst.add(-5);
		lst.add(5);
		lst.add(0);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(-1);
		expected.add(1);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
	
	/**
	* Test case 8.
	* The input list contains negative and positive integers.
	* The expected result is a list containing the largest negative integer and the smallest positive integer.
	*/
	@Test
	void testCase8() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-1);
		lst.add(1);
		lst.add(-2);
		lst.add(2);
		lst.add(-3);
		lst.add(3);
		lst.add(-4);
		lst.add(4);
		lst.add(-5);
		lst.add(5);
		lst.add(0);
		lst.add(0);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(-1);
		expected.add(1);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
	
	/**
	* Test case 9.
	* The input list contains negative and positive integers.
	* The expected result is a list containing the largest negative integer and the smallest positive integer.
	*/
	@Test
	void testCase9() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-1);
		lst.add(1);
		lst.add(-2);
		lst.add(2);
		lst.add(-3);
		lst.add(3);
		lst.add(-4);
		lst.add(4);
		lst.add(-5);
		lst.add(5);
		lst.add(0);
		lst.add(0);
		lst.add(0);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(-1);
		expected.add(1);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
	
	/**
	* Test case 10.
	* The input list contains negative and positive integers.
	* The expected result is a list containing the largest negative integer and the smallest positive integer.
	*/
	@Test
	void testCase10() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-1);
		lst.add(1);
		lst.add(-2);
		lst.add(2);
		lst.add(-3);
		lst.add(3);
		lst.add(-4);
		lst.add(4);
		lst.add(-5);
		lst.add(5);
		lst.add(0);
		lst.add(0);
		lst.add(0);
		lst.add(0);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(-1);
		expected.add(1);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
}