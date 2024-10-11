// DoubleTheDifferenceTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DoubleTheDifference}.
* It contains ten unit test cases for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
*/
class DoubleTheDifferenceTest {

	/**
	* Test case 1.
	* The input list contains only one element.
	* The element is an integer.
	* The integer is odd.
	* The integer is positive.
	* The expected result is the square of the integer.
	*/
	@Test
	void test1() {
		List<Object> lst = List.of(1);
		int expected = 1;
		int actual = DoubleTheDifference.doubleTheDifference(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input list contains only one element.
	* The element is an integer.
	* The integer is even.
	* The integer is positive.
	* The expected result is zero.
	*/
	@Test
	void test2() {
		List<Object> lst = List.of(2);
		int expected = 0;
		int actual = DoubleTheDifference.doubleTheDifference(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input list contains only one element.
	* The element is an integer.
	* The integer is odd.
	* The integer is negative.
	* The expected result is zero.
	*/
	@Test
	void test3() {
		List<Object> lst = List.of(-1);
		int expected = 0;
		int actual = DoubleTheDifference.doubleTheDifference(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input list contains only one element.
	* The element is an integer.
	* The integer is even.
	* The integer is negative.
	* The expected result is zero.
	*/
	@Test
	void test4() {
		List<Object> lst = List.of(-2);
		int expected = 0;
		int actual = DoubleTheDifference.doubleTheDifference(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input list contains only one element.
	* The element is not an integer.
	* The expected result is zero.
	*/
	@Test
	void test5() {
		List<Object> lst = List.of("1");
		int expected = 0;
		int actual = DoubleTheDifference.doubleTheDifference(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input list contains two elements.
	* The first element is an integer.
	* The second element is not an integer.
	* The integer is odd.
	* The integer is positive.
	* The expected result is the square of the integer.
	*/
	@Test
	void test6() {
		List<Object> lst = List.of(1, "2");
		int expected = 1;
		int actual = DoubleTheDifference.doubleTheDifference(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input list contains two elements.
	* The first element is an integer.
	* The second element is not an integer.
	* The integer is even.
	* The integer is positive.
	* The expected result is zero.
	*/
	@Test
	void test7() {
		List<Object> lst = List.of(2, "3");
		int expected = 0;
		int actual = DoubleTheDifference.doubleTheDifference(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input list contains two elements.
	* The first element is an integer.
	* The second element is not an integer.
	* The integer is odd.
	* The integer is negative.
	* The expected result is zero.
	*/
	@Test
	void test8() {
		List<Object> lst = List.of(-1, "2");
		int expected = 0;
		int actual = DoubleTheDifference.doubleTheDifference(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input list contains two elements.
	* The first element is an integer.
	* The second element is not an integer.
	* The integer is even.
	* The integer is negative.
	* The expected result is zero.
	*/
	@Test
	void test9() {
		List<Object> lst = List.of(-2, "3");
		int expected = 0;
		int actual = DoubleTheDifference.doubleTheDifference(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input list contains two elements.
	* The first element is not an integer.
	* The second element is an integer.
	* The integer is odd.
	* The integer is positive.
	* The expected result is the square of the integer.
	*/
	@Test
	void test10() {
		List<Object> lst = List.of("1", 1);
		int expected = 1;
		int actual = DoubleTheDifference.doubleTheDifference(lst);
		assertEquals(expected, actual);
	}
}