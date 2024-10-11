// CountNumsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountNums}.
* It contains ten unit test cases for the {@link CountNums#countNums(List)} method.
*/
class CountNumsTest {
			/**
			* Test case for an empty list.
			*/
			@Test
			void testEmptyList() {
							List<Object> arr = List.of();
							assertEquals(0, CountNums.countNums(arr));
			}

			/**
			* Test case for a list with only negative numbers.
			*/
			@Test
			void testOnlyNegativeNumbers() {
							List<Object> arr = List.of(-1, -2, -3);
							assertEquals(0, CountNums.countNums(arr));
			}

			/**
			* Test case for a list with only positive numbers.
			*/
			@Test
			void testOnlyPositiveNumbers() {
							List<Object> arr = List.of(1, 2, 3);
							assertEquals(3, CountNums.countNums(arr));
			}

			/**
			* Test case for a list with both positive and negative numbers.
			*/
			@Test
			void testPositiveAndNegativeNumbers() {
							List<Object> arr = List.of(1, 2, -3, -4, 5);
							assertEquals(4, CountNums.countNums(arr));
			}

			/**
			* Test case for a list with zero.
			*/
			@Test
			void testZero() {
							List<Object> arr = List.of(0);
							assertEquals(1, CountNums.countNums(arr));
			}

			/**
			* Test case for a list with only one element.
			*/
			@Test
			void testOneElement() {
							List<Object> arr = List.of(1);
							assertEquals(1, CountNums.countNums(arr));
			}

			/**
			* Test case for a list with multiple elements.
			*/
			@Test
			void testMultipleElements() {
							List<Object> arr = List.of(1, 2, 3, -4, 5, -6, 7, 8, 9, 10);
							assertEquals(9, CountNums.countNums(arr));
			}

			/**
			* Test case for a list with multiple elements.
			*/
			@Test
			void testMultipleElements2() {
							List<Object> arr = List.of(1, 100, 98, -7, 1, -1);
							assertEquals(4, CountNums.countNums(arr));
			}

			/**
			* Test case for a list with multiple elements.
			*/
			@Test
			void testMultipleElements3() {
							List<Object> arr = List.of(12, 23, 34, -45, -56, 0);
							assertEquals(5, CountNums.countNums(arr));
			}

			/**
			* Test case for a list with multiple elements.
			*/
			@Test
			void testMultipleElements4() {
							List<Object> arr = List.of(1, 6, 9, -6, 0, 1, 5);
							assertEquals(5, CountNums.countNums(arr));
			}
}