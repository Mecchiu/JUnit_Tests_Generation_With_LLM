// SortArray1Test.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray1}.
* It contains ten unit test cases for the {@link SortArray1#sortArray(List)} method.
*/
class SortArray1Test {
			/**
			* Test case for empty array.
			*/
			@Test
			void testSortArrayEmptyArray() {
						List<Object> array = List.of();
						List<Object> expected = List.of();
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}

			/**
			* Test case for array with one element.
			*/
			@Test
			void testSortArrayOneElement() {
						List<Object> array = List.of(5);
						List<Object> expected = List.of(5);
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}

			/**
			* Test case for array with two elements.
			*/
			@Test
			void testSortArrayTwoElements() {
						List<Object> array = List.of(2, 1);
						List<Object> expected = List.of(1, 2);
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}

			/**
			* Test case for array with even number of elements.
			*/
			@Test
			void testSortArrayEvenNumberOfElements() {
						List<Object> array = List.of(2, 4, 3, 0, 1, 5, 6);
						List<Object> expected = List.of(6, 5, 4, 3, 2, 1, 0);
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}

			/**
			* Test case for array with odd number of elements.
			*/
			@Test
			void testSortArrayOddNumberOfElements() {
						List<Object> array = List.of(2, 4, 3, 0, 1, 5);
						List<Object> expected = List.of(0, 1, 2, 3, 4, 5);
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}

			/**
			* Test case for array with all elements are even.
			*/
			@Test
			void testSortArrayAllElementsAreEven() {
						List<Object> array = List.of(2, 4, 6, 0, 8, 10);
						List<Object> expected = List.of(10, 8, 6, 4, 2, 0);
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}

			/**
			* Test case for array with all elements are odd.
			*/
			@Test
			void testSortArrayAllElementsAreOdd() {
						List<Object> array = List.of(1, 3, 5, 7, 9, 11);
						List<Object> expected = List.of(1, 3, 5, 7, 9, 11);
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}

			/**
			* Test case for array with all elements are same.
			*/
			@Test
			void testSortArrayAllElementsAreSame() {
						List<Object> array = List.of(2, 2, 2, 2, 2, 2);
						List<Object> expected = List.of(2, 2, 2, 2, 2, 2);
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}

			/**
			* Test case for array with negative elements.
			*/
			@Test
			void testSortArrayNegativeElements() {
						List<Object> array = List.of(-2, -4, -3, -1, -5, -6);
						List<Object> expected = List.of(-6, -5, -4, -3, -2, -1);
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}

			/**
			* Test case for array with positive and negative elements.
			*/
			@Test
			void testSortArrayPositiveAndNegativeElements() {
						List<Object> array = List.of(-2, 4, -3, 0, 1, -5, 6);
						List<Object> expected = List.of(6, 4, 1, 0, -2, -3, -5);
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}
}