// CountNumsTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountNums}.
* It contains ten unit test cases for the {@link CountNums#countNums(List)} method.
*/
class CountNumsTest {
	/**
			* Test case for {@link CountNums#countNums(List)}.
			* It tests the case when the input list is empty.
			*/
			@Test
			void testEmptyList() {
				List<Object> arr = List.of();
				int expected = 0;
				int actual = CountNums.countNums(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link CountNums#countNums(List)}.
			* It tests the case when the input list contains only negative numbers.
			*/
			@Test
			void testNegativeNumbers() {
				List<Object> arr = List.of(-1, -2, 0);
				int expected = 0;
				int actual = CountNums.countNums(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link CountNums#countNums(List)}.
			* It tests the case when the input list contains only positive numbers.
			*/
			@Test
			void testPositiveNumbers() {
				List<Object> arr = List.of(1, 1, 2);
				int expected = 3;
				int actual = CountNums.countNums(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link CountNums#countNums(List)}.
			* It tests the case when the input list contains both positive and negative numbers.
			*/
			@Test
			void testMixedNumbers() {
				List<Object> arr = List.of(1, 1, 2, -2, 3, 4, 5);
				int expected = 6;
				int actual = CountNums.countNums(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link CountNums#countNums(List)}.
			* It tests the case when the input list contains both positive and negative numbers.
			*/
			@Test
			void testMixedNumbers2() {
				List<Object> arr = List.of(1, 6, 9, -6, 0, 1, 5);
				int expected = 5;
				int actual = CountNums.countNums(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link CountNums#countNums(List)}.
			* It tests the case when the input list contains both positive and negative numbers.
			*/
			@Test
			void testMixedNumbers3() {
				List<Object> arr = List.of(1, 100, 98, -7, 1, -1);
				int expected = 4;
				int actual = CountNums.countNums(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link CountNums#countNums(List)}.
			* It tests the case when the input list contains both positive and negative numbers.
			*/
			@Test
			void testMixedNumbers4() {
				List<Object> arr = List.of(12, 23, 34, -45, -56, 0);
				int expected = 5;
				int actual = CountNums.countNums(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link CountNums#countNums(List)}.
			* It tests the case when the input list contains only one element.
			*/
			@Test
			void testOneElement() {
				List<Object> arr = List.of(0);
				int expected = 1;
				int actual = CountNums.countNums(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link CountNums#countNums(List)}.
			* It tests the case when the input list contains only one element.
			*/
			@Test
			void testOneElement2() {
				List<Object> arr = List.of(1);
				int expected = 1;
				int actual = CountNums.countNums(arr);
				assertEquals(expected, actual);
			}
}
