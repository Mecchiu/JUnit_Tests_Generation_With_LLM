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
			* Test case for empty string.
			*/
			@Test
			void testEmptyString() {
						String input = "";
						String expected = "";
						String actual = SortNumbers.sortNumbers(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for one number.
			*/
			@Test
			void testOneNumber() {
						String input = "three";
						String expected = "three";
						String actual = SortNumbers.sortNumbers(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for two numbers.
			*/
			@Test
			void testTwoNumbers() {
						String input = "three one";
						String expected = "one three";
						String actual = SortNumbers.sortNumbers(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for three numbers.
			*/
			@Test
			void testThreeNumbers() {
						String input = "three one five";
						String expected = "one three five";
						String actual = SortNumbers.sortNumbers(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for four numbers.
			*/
			@Test
			void testFourNumbers() {
						String input = "three one five nine";
						String expected = "one three five nine";
						String actual = SortNumbers.sortNumbers(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for five numbers.
			*/
			@Test
			void testFiveNumbers() {
						String input = "five zero four seven nine";
						String expected = "zero four five seven nine";
						String actual = SortNumbers.sortNumbers(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for six numbers.
			*/
			@Test
			void testSixNumbers() {
						String input = "six five four three two one zero";
						String expected = "zero one two three four five six";
						String actual = SortNumbers.sortNumbers(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for seven numbers.
			*/
			@Test
			void testSevenNumbers() {
						String input = "six five four three two one zero eight";
						String expected = "zero one two three four five six eight";
						String actual = SortNumbers.sortNumbers(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for eight numbers.
			*/
			@Test
			void testEightNumbers() {
						String input = "six five four three two one zero eight seven";
						String expected = "zero one two three four five six seven eight";
						String actual = SortNumbers.sortNumbers(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for nine numbers.
			*/
			@Test
			void testNineNumbers() {
						String input = "six five four three two one zero eight seven nine";
						String expected = "zero one two three four five six seven eight nine";
						String actual = SortNumbers.sortNumbers(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for invalid input.
			*/
			@Test
			void testInvalidInput() {
						String input = "six five four three two one zero eight seven nine ten";
						String expected = "zero one two three four five six seven eight nine";
						String actual = SortNumbers.sortNumbers(input);
						assertEquals(expected, actual);
			}
}