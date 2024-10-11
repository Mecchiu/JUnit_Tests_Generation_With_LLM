// GetPositiveTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains ten unit test cases for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {

	/**
	* Test case 1.
	* The input list contains only positive integers.
	* The expected result is a list with the same elements as the input list.
	*/
	@Test
	void test1() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		List<Object> actual = GetPositive.getPositive(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input list contains only negative integers.
	* The expected result is an empty list.
	*/
	@Test
	void test2() {
		List<Object> input = new ArrayList<Object>();
		input.add(-1);
		input.add(-2);
		input.add(-3);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = GetPositive.getPositive(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input list contains only zero.
	* The expected result is an empty list.
	*/
	@Test
	void test3() {
		List<Object> input = new ArrayList<Object>();
		input.add(0);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = GetPositive.getPositive(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input list contains positive and negative integers.
	* The expected result is a list with only the positive integers.
	*/
	@Test
	void test4() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(-2);
		input.add(3);
		input.add(-4);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		List<Object> actual = GetPositive.getPositive(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input list contains positive and negative integers and zero.
	* The expected result is a list with only the positive integers.
	*/
	@Test
	void test5() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(-2);
		input.add(3);
		input.add(-4);
		input.add(0);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		List<Object> actual = GetPositive.getPositive(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input list contains positive and negative integers and zero.
	* The expected result is a list with only the positive integers.
	*/
	@Test
	void test6() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(-2);
		input.add(3);
		input.add(-4);
		input.add(0);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		List<Object> actual = GetPositive.getPositive(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input list contains positive and negative integers and zero.
	* The expected result is a list with only the positive integers.
	*/
	@Test
	void test7() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(-2);
		input.add(3);
		input.add(-4);
		input.add(0);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		List<Object> actual = GetPositive.getPositive(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input list contains positive and negative integers and zero.
	* The expected result is a list with only the positive integers.
	*/
	@Test
	void test8() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(-2);
		input.add(3);
		input.add(-4);
		input.add(0);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		List<Object> actual = GetPositive.getPositive(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input list contains positive and negative integers and zero.
	* The expected result is a list with only the positive integers.
	*/
	@Test
	void test9() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(-2);
		input.add(3);
		input.add(-4);
		input.add(0);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		List<Object> actual = GetPositive.getPositive(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input list contains positive and negative integers and zero.
	* The expected result is a list with only the positive integers.
	*/
	@Test
	void test10() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(-2);
		input.add(3);
		input.add(-4);
		input.add(0);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		List<Object> actual = GetPositive.getPositive(input);
		assertEquals(expected, actual);
	}
}