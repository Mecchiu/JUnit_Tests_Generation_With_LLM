// PluckTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pluck}.
* It contains ten unit test cases for the {@link Pluck#pluck(List)} method.
*/
class PluckTest {

	/**
	* Test case 1.
	* The input list is empty.
	* The expected result is an empty list.
	*/
	@Test
	void test1() {
		List<Object> input = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = Pluck.pluck(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input list contains only one element.
	* The expected result is an empty list.
	*/
	@Test
	void test2() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = Pluck.pluck(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input list contains only one element.
	* The expected result is a list containing the element and its index.
	*/
	@Test
	void test3() {
		List<Object> input = new ArrayList<Object>();
		input.add(2);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(0);
		List<Object> actual = Pluck.pluck(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input list contains only one element.
	* The expected result is an empty list.
	*/
	@Test
	void test4() {
		List<Object> input = new ArrayList<Object>();
		input.add("a");
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = Pluck.pluck(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input list contains only one element.
	* The expected result is an empty list.
	*/
	@Test
	void test5() {
		List<Object> input = new ArrayList<Object>();
		input.add(null);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = Pluck.pluck(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input list contains only one element.
	* The expected result is an empty list.
	*/
	@Test
	void test6() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(1);
		List<Object> actual = Pluck.pluck(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input list contains only one element.
	* The expected result is an empty list.
	*/
	@Test
	void test7() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(1);
		List<Object> actual = Pluck.pluck(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input list contains only one element.
	* The expected result is an empty list.
	*/
	@Test
	void test8() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(1);
		List<Object> actual = Pluck.pluck(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input list contains only one element.
	* The expected result is an empty list.
	*/
	@Test
	void test9() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(1);
		List<Object> actual = Pluck.pluck(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input list contains only one element.
	* The expected result is an empty list.
	*/
	@Test
	void test10() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(1);
		List<Object> actual = Pluck.pluck(input);
		assertEquals(expected, actual);
	}
}