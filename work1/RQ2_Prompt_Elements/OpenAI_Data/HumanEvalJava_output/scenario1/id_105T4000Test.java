// ByLengthTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByLength}.
* It contains ten unit test cases for the {@link ByLength#byLength(List)} method.
*/
class ByLengthTest {

	/**
	* Test case 1.
	* The input is an empty list.
	* The expected output is an empty list.
	*/
	@Test
	void test1() {
		List<Object> input = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = ByLength.byLength(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input is a list with one element.
	* The expected output is a list with one element.
	*/
	@Test
	void test2() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add("One");
		List<Object> actual = ByLength.byLength(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input is a list with two elements.
	* The expected output is a list with two elements.
	*/
	@Test
	void test3() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		List<Object> expected = new ArrayList<Object>();
		expected.add("Two");
		expected.add("One");
		List<Object> actual = ByLength.byLength(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input is a list with three elements.
	* The expected output is a list with three elements.
	*/
	@Test
	void test4() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add("Three");
		expected.add("Two");
		expected.add("One");
		List<Object> actual = ByLength.byLength(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input is a list with four elements.
	* The expected output is a list with four elements.
	*/
	@Test
	void test5() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		List<Object> expected = new ArrayList<Object>();
		expected.add("Four");
		expected.add("Three");
		expected.add("Two");
		expected.add("One");
		List<Object> actual = ByLength.byLength(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input is a list with five elements.
	* The expected output is a list with five elements.
	*/
	@Test
	void test6() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add("Five");
		expected.add("Four");
		expected.add("Three");
		expected.add("Two");
		expected.add("One");
		List<Object> actual = ByLength.byLength(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input is a list with six elements.
	* The expected output is a list with six elements.
	*/
	@Test
	void test7() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		List<Object> expected = new ArrayList<Object>();
		expected.add("Six");
		expected.add("Five");
		expected.add("Four");
		expected.add("Three");
		expected.add("Two");
		expected.add("One");
		List<Object> actual = ByLength.byLength(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input is a list with seven elements.
	* The expected output is a list with seven elements.
	*/
	@Test
	void test8() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		List<Object> expected = new ArrayList<Object>();
		expected.add("Seven");
		expected.add("Six");
		expected.add("Five");
		expected.add("Four");
		expected.add("Three");
		expected.add("Two");
		expected.add("One");
		List<Object> actual = ByLength.byLength(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input is a list with eight elements.
	* The expected output is a list with eight elements.
	*/
	@Test
	void test9() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		List<Object> expected = new ArrayList<Object>();
		expected.add("Eight");
		expected.add("Seven");
		expected.add("Six");
		expected.add("Five");
		expected.add("Four");
		expected.add("Three");
		expected.add("Two");
		expected.add("One");
		List<Object> actual = ByLength.byLength(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input is a list with nine elements.
	* The expected output is a list with nine elements.
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
		input.add(7);
		input.add(8);
		input.add(9);
		List<Object> expected = new ArrayList<Object>();
		expected.add("Nine");
		expected.add("Eight");
		expected.add("Seven");
		expected.add("Six");
		expected.add("Five");
		expected.add("Four");
		expected.add("Three");
		expected.add("Two");
		expected.add("One");
		List<Object> actual = ByLength.byLength(input);
		assertEquals(expected, actual);
	}
}