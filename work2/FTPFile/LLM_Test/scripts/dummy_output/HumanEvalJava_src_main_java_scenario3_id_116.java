// SortArrayTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray}.
* It contains ten unit test cases for the {@link SortArray#sortArray(List)} method.
*/
class SortArrayTest {
			/**
			* Test case for empty list.
			*/
			@Test
			void testEmptyList() {
				List<Object> arr = new ArrayList<>();
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for list with one element.
			*/
			@Test
			void testOneElementList() {
				List<Object> arr = new ArrayList<>();
				arr.add(1);
				List<Object> expected = new ArrayList<>();
				expected.add(1);
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for list with two elements.
			*/
			@Test
			void testTwoElementList() {
				List<Object> arr = new ArrayList<>();
				arr.add(1);
				arr.add(0);
				List<Object> expected = new ArrayList<>();
				expected.add(0);
				expected.add(1);
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for list with three elements.
			*/
			@Test
			void testThreeElementList() {
				List<Object> arr = new ArrayList<>();
				arr.add(1);
				arr.add(0);
				arr.add(2);
				List<Object> expected = new ArrayList<>();
				expected.add(0);
				expected.add(1);
				expected.add(2);
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for list with four elements.
			*/
			@Test
			void testFourElementList() {
				List<Object> arr = new ArrayList<>();
				arr.add(1);
				arr.add(0);
				arr.add(2);
				arr.add(3);
				List<Object> expected = new ArrayList<>();
				expected.add(0);
				expected.add(1);
				expected.add(2);
				expected.add(3);
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for list with five elements.
			*/
			@Test
			void testFiveElementList() {
				List<Object> arr = new ArrayList<>();
				arr.add(1);
				arr.add(5);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				List<Object> expected = new ArrayList<>();
				expected.add(1);
				expected.add(2);
				expected.add(4);
				expected.add(3);
				expected.add(5);
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for list with six elements.
			*/
			@Test
			void testSixElementList() {
				List<Object> arr = new ArrayList<>();
				arr.add(1);
				arr.add(0);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				List<Object> expected = new ArrayList<>();
				expected.add(0);
				expected.add(1);
				expected.add(2);
				expected.add(4);
				expected.add(3);
				expected.add(5);
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for list with seven elements.
			*/
			@Test
			void testSevenElementList() {
				List<Object> arr = new ArrayList<>();
				arr.add(1);
				arr.add(5);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(7);
				List<Object> expected = new ArrayList<>();
				expected.add(1);
				expected.add(2);
				expected.add(4);
				expected.add(3);
				expected.add(5);
				expected.add(5);
				expected.add(7);
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for list with eight elements.
			*/
			@Test
			void testEightElementList() {
				List<Object> arr = new ArrayList<>();
				arr.add(1);
				arr.add(0);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(7);
				arr.add(2);
				List<Object> expected = new ArrayList<>();
				expected.add(0);
				expected.add(1);
				expected.add(2);
				expected.add(2);
				expected.add(4);
				expected.add(3);
				expected.add(5);
				expected.add(7);
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for list with nine elements.
			*/
			@Test
			void testNineElementList() {
				List<Object> arr = new ArrayList<>();
				arr.add(1);
				arr.add(5);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(7);
				arr.add(2);
				arr.add(3);
				List<Object> expected = new ArrayList<>();
				expected.add(1);
				expected.add(2);
				expected.add(2);
				expected.add(4);
				expected.add(3);
				expected.add(3);
				expected.add(5);
				expected.add(5);
				expected.add(7);
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for list with ten elements.
			*/
			@Test
			void testTenElementList() {
				List<Object> arr = new ArrayList<>();
				arr.add(2);
				arr.add(5);
				arr.add(77);
				arr.add(4);
				arr.add(5);
				arr.add(3);
				arr.add(5);
				arr.add(7);
				arr.add(2);
				arr.add(3);
				List<Object> expected = new ArrayList<>();
				expected.add(2);
				expected.add(2);
				expected.add(4);
				expected.add(4);
				expected.add(3);
				expected.add(3);
				expected.add(5);
				expected.add(5);
				expected.add(5);
				expected.add(7);
				expected.add(77);
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}
}