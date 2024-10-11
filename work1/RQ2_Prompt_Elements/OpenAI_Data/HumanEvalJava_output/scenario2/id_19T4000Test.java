// SortNumbersTest.java
package scenario2;

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
	*/
	@Test
	void testSortNumbers() {
		String input = "zero one two three four five six seven eight nine";
		String expected = "zero one two three four five six seven eight nine";
		String actual = SortNumbers.sortNumbers(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortNumbers#sortNumbers(String)} method.
	* Input is a space-delimited string of numbers from 'zero' to 'nine'.
	* Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
	* Return the string with numbers sorted from smallest to largest
	*/
	@Test
	void testSortNumbers2() {
		String input = "nine eight seven six five four three two one zero";
		String expected = "zero one two three four five six seven eight nine";
		String actual = SortNumbers.sortNumbers(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortNumbers#sortNumbers(String)} method.
	* Input is a space-delimited string of numbers from 'zero' to 'nine'.
	* Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
	* Return the string with numbers sorted from smallest to largest
	*/
	@Test
	void testSortNumbers3() {
		String input = "one two three four five six seven eight nine zero";
		String expected = "zero one two three four five six seven eight nine";
		String actual = SortNumbers.sortNumbers(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortNumbers#sortNumbers(String)} method.
	* Input is a space-delimited string of numbers from 'zero' to 'nine'.
	* Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
	* Return the string with numbers sorted from smallest to largest
	*/
	@Test
	void testSortNumbers4() {
		String input = "zero one two three four five six seven eight nine zero";
		String expected = "zero zero one two three four five six seven eight nine";
		String actual = SortNumbers.sortNumbers(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortNumbers#sortNumbers(String)} method.
	* Input is a space-delimited string of numbers from 'zero' to 'nine'.
	* Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
	* Return the string with numbers sorted from smallest to largest
	*/
	@Test
	void testSortNumbers5() {
		String input = "zero one two three four five six seven eight nine nine";
		String expected = "zero one two three four five six seven eight nine nine";
		String actual = SortNumbers.sortNumbers(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortNumbers#sortNumbers(String)} method.
	* Input is a space-delimited string of numbers from 'zero' to 'nine'.
	* Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
	* Return the string with numbers sorted from smallest to largest
	*/
	@Test
	void testSortNumbers6() {
		String input = "zero one two three four five six seven eight nine nine zero";
		String expected = "zero zero one two three four five six seven eight nine nine";
		String actual = SortNumbers.sortNumbers(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortNumbers#sortNumbers(String)} method.
	* Input is a space-delimited string of numbers from 'zero' to 'nine'.
	* Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
	* Return the string with numbers sorted from smallest to largest
	*/
	@Test
	void testSortNumbers7() {
		String input = "zero one two three four five six seven eight nine nine zero zero";
		String expected = "zero zero zero one two three four five six seven eight nine nine";
		String actual = SortNumbers.sortNumbers(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortNumbers#sortNumbers(String)} method.
	* Input is a space-delimited string of numbers from 'zero' to 'nine'.
	* Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
	* Return the string with numbers sorted from smallest to largest
	*/
	@Test
	void testSortNumbers8() {
		String input = "zero one two three four five six seven eight nine nine zero zero zero";
		String expected = "zero zero zero zero one two three four five six seven eight nine nine";
		String actual = SortNumbers.sortNumbers(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortNumbers#sortNumbers(String)} method.
	* Input is a space-delimited string of numbers from 'zero' to 'nine'.
	* Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
	* Return the string with numbers sorted from smallest to largest
	*/
	@Test
	void testSortNumbers9() {
		String input = "zero one two three four five six seven eight nine nine zero zero zero zero";
		String expected = "zero zero zero zero zero one two three four five six seven eight nine nine";
		String actual = SortNumbers.sortNumbers(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortNumbers#sortNumbers(String)} method.
	* Input is a space-delimited string of numbers from 'zero' to 'nine'.
	* Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
	* Return the string with numbers sorted from smallest to largest
	*/
	@Test
	void testSortNumbers10() {
		String input = "zero one two three four five six seven eight nine nine zero zero zero zero zero";
		String expected = "zero zero zero zero zero zero one two three four five six seven eight nine nine";
		String actual = SortNumbers.sortNumbers(input);
		assertEquals(expected, actual);
	}
}