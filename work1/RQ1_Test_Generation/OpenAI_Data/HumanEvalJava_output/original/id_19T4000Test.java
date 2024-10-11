// SortNumbersTest.java
package original;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortNumbers}.
* It contains ten unit test cases for the {@link SortNumbers#sortNumbers(String)} method.
*/
class SortNumbersTest {

	/**
	* Test case for {@link SortNumbers#sortNumbers(String)} method.
	* Input is a space-delimited string of numbers from 'zero' to 'nine'.
	* Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
	* Return the string with numbers sorted from smallest to largest
	*
	* > sortNumbers("three one five")
	* "one three five"
	*/
	@Test
	void testSortNumbers1() {
		String input = "three one five";
		String expected = "one three five";
		String actual = SortNumbers.sortNumbers(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortNumbers#sortNumbers(String)} method.
	* Input is a space-delimited string of numbers from 'zero' to 'nine'.
	* Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
	* Return the string with numbers sorted from smallest to largest
	*
	* > sortNumbers("")
	* ""
	*/
	@Test
	void testSortNumbers2() {
		String input = "";
		String expected = "";
		String actual = SortNumbers.sortNumbers(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortNumbers#sortNumbers(String)} method.
	* Input is a space-delimited string of numbers from 'zero' to 'nine'.
	* Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
	* Return the string with numbers sorted from smallest to largest
	*
	* > sortNumbers("three")
	* "three"
	*/
	@Test
	void testSortNumbers3() {
		String input = "three";
		String expected = "three";
		String actual = SortNumbers.sortNumbers(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortNumbers#sortNumbers(String)} method.
	* Input is a space-delimited string of numbers from 'zero' to 'nine'.
	* Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
	* Return the string with numbers sorted from smallest to largest
	*
	* > sortNumbers("three five nine")
	* "three five nine"
	*/
	@Test
	void testSortNumbers4() {
		String input = "three five nine";
		String expected = "three five nine";
		String actual = SortNumbers.sortNumbers(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortNumbers#sortNumbers(String)} method.
	* Input is a space-delimited string of numbers from 'zero' to 'nine'.
	* Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
	* Return the string with numbers sorted from smallest to largest
	*
	* > sortNumbers("five zero four seven nine eight")
	* "zero four five seven eight nine"
	*/
	@Test
	void testSortNumbers5() {
		String input = "five zero four seven nine eight";
		String expected = "zero four five seven eight nine";
		String actual = SortNumbers.sortNumbers(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortNumbers#sortNumbers(String)} method.
	* Input is a space-delimited string of numbers from 'zero' to 'nine'.
	* Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
	* Return the string with numbers sorted from smallest to largest
	*
	* > sortNumbers("six five four three two one zero")
	* "zero one two three four five six"
	*/
	@Test
	void testSortNumbers6() {
		String input = "six five four three two one zero";
		String expected = "zero one two three four five six";
		String actual = SortNumbers.sortNumbers(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortNumbers#sortNumbers(String)} method.
	* Input is a space-delimited string of numbers from 'zero' to 'nine'.
	* Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
	* Return the string with numbers sorted from smallest to largest
	*
	* > sortNumbers("six five four three two one zero")
	* "zero one two three four five six"
	*/
	@Test
	void testSortNumbers7() {
		String input = "six five four three two one zero";
		String expected = "zero one two three four five six";
		String actual = SortNumbers.sortNumbers(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortNumbers#sortNumbers(String)} method.
	* Input is a space-delimited string of numbers from 'zero' to 'nine'.
	* Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
	* Return the string with numbers sorted from smallest to largest
	*
	* > sortNumbers("six five four three two one zero")
	* "zero one two three four five six"
	*/
	@Test
	void testSortNumbers8() {
		String input = "six five four three two one zero";
		String expected = "zero one two three four five six";
		String actual = SortNumbers.sortNumbers(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortNumbers#sortNumbers(String)} method.
	* Input is a space-delimited string of numbers from 'zero' to 'nine'.
	* Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
	* Return the string with numbers sorted from smallest to largest
	*
	* > sortNumbers("six five four three two one zero")
	* "zero one two three four five six"
	*/
	@Test
	void testSortNumbers9() {
		String input = "six five four three two one zero";
		String expected = "zero one two three four five six";
		String actual = SortNumbers.sortNumbers(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortNumbers#sortNumbers(String)} method.
	* Input is a space-delimited string of numbers from 'zero' to 'nine'.
	* Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
	* Return the string with numbers sorted from smallest to largest
	*
	* > sortNumbers("six five four three two one zero")
	* "zero one two three four five six"
	*/
	@Test
	void testSortNumbers10() {
		String input = "six five four three two one zero";
		String expected = "zero one two three four five six";
		String actual = SortNumbers.sortNumbers(input);
		assertEquals(expected, actual);
	}
}