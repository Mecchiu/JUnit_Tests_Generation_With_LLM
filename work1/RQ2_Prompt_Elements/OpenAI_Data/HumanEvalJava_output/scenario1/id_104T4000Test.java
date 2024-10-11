// UniqueDigitsTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UniqueDigits}.
* It contains ten unit test cases for the {@link UniqueDigits#uniqueDigits(List)} method.
*/
class UniqueDigitsTest {

	/**
	* Test case 1.
	* The input list is empty.
	* The expected result is an empty list.
	*/
	@Test
	void testUniqueDigits_1() {
		List<Integer> input = new ArrayList<Integer>();
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = UniqueDigits.uniqueDigits(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input list contains only one element.
	* The expected result is a list containing the same element.
	*/
	@Test
	void testUniqueDigits_2() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		List<Object> actual = UniqueDigits.uniqueDigits(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input list contains only one element.
	* The expected result is an empty list.
	*/
	@Test
	void testUniqueDigits_3() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(2);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = UniqueDigits.uniqueDigits(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input list contains only one element.
	* The expected result is a list containing the same element.
	*/
	@Test
	void testUniqueDigits_4() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(11);
		List<Object> expected = new ArrayList<Object>();
		expected.add(11);
		List<Object> actual = UniqueDigits.uniqueDigits(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input list contains only one element.
	* The expected result is an empty list.
	*/
	@Test
	void testUniqueDigits_5() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(12);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = UniqueDigits.uniqueDigits(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input list contains only one element.
	* The expected result is a list containing the same element.
	*/
	@Test
	void testUniqueDigits_6() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(111);
		List<Object> expected = new ArrayList<Object>();
		expected.add(111);
		List<Object> actual = UniqueDigits.uniqueDigits(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input list contains only one element.
	* The expected result is an empty list.
	*/
	@Test
	void testUniqueDigits_7() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(112);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = UniqueDigits.uniqueDigits(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input list contains only one element.
	* The expected result is a list containing the same element.
	*/
	@Test
	void testUniqueDigits_8() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(1111);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1111);
		List<Object> actual = UniqueDigits.uniqueDigits(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input list contains only one element.
	* The expected result is an empty list.
	*/
	@Test
	void testUniqueDigits_9() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(1112);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = UniqueDigits.uniqueDigits(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input list contains multiple elements.
	* The expected result is a list containing the elements that have no even digits.
	*/
	@Test
	void testUniqueDigits_10() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(11);
		input.add(12);
		input.add(111);
		input.add(112);
		input.add(1111);
		input.add(1112);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(11);
		expected.add(111);
		expected.add(1111);
		List<Object> actual = UniqueDigits.uniqueDigits(input);
		assertEquals(expected, actual);
	}
}