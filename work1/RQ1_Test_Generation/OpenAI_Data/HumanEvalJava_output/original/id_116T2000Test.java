// SortArrayTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray}.
* It contains ten unit test cases for the {@link SortArray#sortArray(List)} method.
*/
class SortArrayTest {
	/**
			* Test case for {@link SortArray#sortArray(List)}.
			* It tests the method with an empty list.
			*/
			@Test
			void testSortArrayEmptyList() {
						List<Object> arr = new ArrayList<Object>();
						List<Object> expected = new ArrayList<Object>();
						List<Object> actual = SortArray.sortArray(arr);
						assertEquals(expected, actual);
			}

			/**
			* Test case for {@link SortArray#sortArray(List)}.
			* It tests the method with a list of one element.
			*/
			@Test
			void testSortArrayOneElementList() {
						List<Object> arr = new ArrayList<Object>();
						arr.add(1);
						List<Object> expected = new ArrayList<Object>();
						expected.add(1);
						List<Object> actual = SortArray.sortArray(arr);
						assertEquals(expected, actual);
			}

			/**
			* Test case for {@link SortArray#sortArray(List)}.
			* It tests the method with a list of two elements.
			*/
			@Test
			void testSortArrayTwoElementsList() {
						List<Object> arr = new ArrayList<Object>();
						arr.add(1);
						arr.add(0);
						List<Object> expected = new ArrayList<Object>();
						expected.add(0);
						expected.add(1);
						List<Object> actual = SortArray.sortArray(arr);
						assertEquals(expected, actual);
			}

			/**
			* Test case for {@link SortArray#sortArray(List)}.
			* It tests the method with a list of three elements.
			*/
			@Test
			void testSortArrayThreeElementsList() {
						List<Object> arr = new ArrayList<Object>();
						arr.add(1);
						arr.add(0);
						arr.add(2);
						List<Object> expected = new ArrayList<Object>();
						expected.add(0);
						expected.add(1);
						expected.add(2);
						List<Object> actual = SortArray.sortArray(arr);
						assertEquals(expected, actual);
			}

			/**
			* Test case for {@link SortArray#sortArray(List)}.
			* It tests the method with a list of four elements.
			*/
			@Test
			void testSortArrayFourElementsList() {
						List<Object> arr = new ArrayList<Object>();
						arr.add(1);
						arr.add(0);
						arr.add(2);
						arr.add(3);
						List<Object> expected = new ArrayList<Object>();
						expected.add(0);
						expected.add(1);
						expected.add(2);
						expected.add(3);
						List<Object> actual = SortArray.sortArray(arr);
						assertEquals(expected, actual);
			}

			/**
			* Test case for {@link SortArray#sortArray(List)}.
			* It tests the method with a list of five elements.
			*/
			@Test
			void testSortArrayFiveElementsList() {
						List<Object> arr = new ArrayList<Object>();
						arr.add(1);
						arr.add(5);
						arr.add(2);
						arr.add(3);
						arr.add(4);
						List<Object> expected = new ArrayList<Object>();
						expected.add(1);
						expected.add(2);
						expected.add(3);
						expected.add(4);
						expected.add(5);
						List<Object> actual = SortArray.sortArray(arr);
						assertEquals(expected, actual);
			}

			/**
			* Test case for {@link SortArray#sortArray(List)}.
			* It tests the method with a list of six elements.
			*/
			@Test
			void testSortArraySixElementsList() {
						List<Object> arr = new ArrayList<Object>();
						arr.add(1);
						arr.add(0);
						arr.add(2);
						arr.add(3);
						arr.add(4);
						arr.add(5);
						List<Object> expected = new ArrayList<Object>();
						expected.add(0);
						expected.add(1);
						expected.add(2);
						expected.add(3);
						expected.add(4);
						expected.add(5);
						List<Object> actual = SortArray.sortArray(arr);
						assertEquals(expected, actual);
			}

			/**
			* Test case for {@link SortArray#sortArray(List)}.
			* It tests the method with a list of seven elements.
			*/
			@Test
			void testSortArraySevenElementsList() {
						List<Object> arr = new ArrayList<Object>();
						arr.add(1);
						arr.add(0);
						arr.add(2);
						arr.add(3);
						arr.add(4);
						arr.add(5);
						arr.add(7);
						List<Object> expected = new ArrayList<Object>();
						expected.add(0);
						expected.add(1);
						expected.add(2);
						expected.add(3);
						expected.add(4);
						expected.add(5);
						expected.add(7);
						List<Object> actual = SortArray.sortArray(arr);
						assertEquals(expected, actual);
			}

			/**
			* Test case for {@link SortArray#sortArray(List)}.
			* It tests the method with a list of eight elements.
			*/
			@Test
			void testSortArrayEightElementsList() {
						List<Object> arr = new ArrayList<Object>();
						arr.add(1);
						arr.add(0);
						arr.add(2);
						arr.add(3);
						arr.add(4);
						arr.add(5);
						arr.add(7);
						arr.add(6);
						List<Object> expected = new ArrayList<Object>();
						expected.add(0);
						expected.add(1);
						expected.add(2);
						expected.add(3);
						expected.add(4);
						expected.add(5);
						expected.add(6);
						expected.add(7);
						List<Object> actual = SortArray.sortArray(arr);
						assertEquals(expected, actual);
			}

			/**
			* Test case for {@link SortArray#sortArray(List)}.
			* It tests the method with a list of nine elements.
			*/
			@Test
			void testSortArrayNineElementsList() {
						List<Object> arr = new ArrayList<Object>();
						arr.add(1);
						arr.add(0);
						arr.add(2);
						arr.add(3);
						arr.add(4);
						arr.add(5);
						arr.add(7);
						arr.add(6);
						arr.add(8);
						List<Object> expected = new ArrayList<Object>();
						expected.add(0);
						expected.add(1);
						expected.add(2);
						expected.add(3);
						expected.add(4);
						expected.add(5);
						expected.add(6);
						expected.add(7);
						expected.add(8);
						List<Object> actual = SortArray.sortArray(arr);
						assertEquals(expected, actual);
			}

			/**
			* Test case for {@link SortArray#sortArray(List)}.
			* It tests the method with a list of ten elements.
			*/
			@Test
			void testSortArrayTenElementsList() {
						List<Object> arr = new ArrayList<Object>();
						arr.add(1);
						arr.add(0);
						arr.add(2);
						arr.add(3);
						arr.add(4);
						arr.add(5);
						arr.add(7);
						arr.add(6);
						arr.add(8);
						arr.add(9);
						List<Object> expected = new ArrayList<Object>();
						expected.add(0);
						expected.add(1);
						expected.add(2);
						expected.add(3);
						expected.add(4);
						expected.add(5);
						expected.add(6);
						expected.add(7);
						expected.add(8);
						expected.add(9);
						List<Object> actual = SortArray.sortArray(arr);
						assertEquals(expected, actual);
			}
}

// SortArray.java
package refactored;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortArray {

    /**
     * * In this Kata, you have to sort an array of non-negative integers according to
     * number of ones in their binary representation in ascending order.
     * For similar number of ones, sort based on decimal value.
     *
     * It must be implemented like this:
     * >>> sortArray([1, 5, 2, 3, 4]) == [1, 2, 3, 4, 5]
     * >>> sortArray([1, 0, 2, 3, 4]) [0, 1, 2, 3, 4]
     *
     * > sortArray([1, 5, 2, 3, 4])
     * [1, 2, 4, 3, 5]
     * > sortArray([1, 0, 2, 3, 4])
     * [0, 1, 2, 4, 3]
     * > sortArray([])
     * []
     * > sortArray([2, 5, 77, 4, 5, 3, 5, 7, 2, 3, 4])
     * [2, 2, 4, 4, 3, 3, 5, 5, 5, 7, 77]
     * > sortArray([3, 6, 44, 12, 32