// SortArray1Test.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray1}.
* It contains ten unit test cases for the {@link SortArray1#sortArray(List)} method.
*/
class SortArray1Test {
	/**
			* Test case for the {@link SortArray1#sortArray(List)} method.
			* It tests the method with an empty list.
			*/
			@Test
			void testSortArrayWithEmptyList() {
						List<Object> array = new ArrayList<>();
						List<Object> expected = new ArrayList<>();
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortArray1#sortArray(List)} method.
			* It tests the method with a list of one element.
			*/
			@Test
			void testSortArrayWithOneElement() {
						List<Object> array = new ArrayList<>();
						array.add(1);
						List<Object> expected = new ArrayList<>();
						expected.add(1);
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortArray1#sortArray(List)} method.
			* It tests the method with a list of two elements.
			*/
			@Test
			void testSortArrayWithTwoElements() {
						List<Object> array = new ArrayList<>();
						array.add(1);
						array.add(2);
						List<Object> expected = new ArrayList<>();
						expected.add(1);
						expected.add(2);
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortArray1#sortArray(List)} method.
			* It tests the method with a list of three elements.
			*/
			@Test
			void testSortArrayWithThreeElements() {
						List<Object> array = new ArrayList<>();
						array.add(1);
						array.add(2);
						array.add(3);
						List<Object> expected = new ArrayList<>();
						expected.add(1);
						expected.add(2);
						expected.add(3);
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortArray1#sortArray(List)} method.
			* It tests the method with a list of four elements.
			*/
			@Test
			void testSortArrayWithFourElements() {
						List<Object> array = new ArrayList<>();
						array.add(1);
						array.add(2);
						array.add(3);
						array.add(4);
						List<Object> expected = new ArrayList<>();
						expected.add(1);
						expected.add(2);
						expected.add(3);
						expected.add(4);
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortArray1#sortArray(List)} method.
			* It tests the method with a list of five elements.
			*/
			@Test
			void testSortArrayWithFiveElements() {
						List<Object> array = new ArrayList<>();
						array.add(1);
						array.add(2);
						array.add(3);
						array.add(4);
						array.add(5);
						List<Object> expected = new ArrayList<>();
						expected.add(1);
						expected.add(2);
						expected.add(3);
						expected.add(4);
						expected.add(5);
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortArray1#sortArray(List)} method.
			* It tests the method with a list of six elements.
			*/
			@Test
			void testSortArrayWithSixElements() {
						List<Object> array = new ArrayList<>();
						array.add(1);
						array.add(2);
						array.add(3);
						array.add(4);
						array.add(5);
						array.add(6);
						List<Object> expected = new ArrayList<>();
						expected.add(1);
						expected.add(2);
						expected.add(3);
						expected.add(4);
						expected.add(5);
						expected.add(6);
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortArray1#sortArray(List)} method.
			* It tests the method with a list of seven elements.
			*/
			@Test
			void testSortArrayWithSevenElements() {
						List<Object> array = new ArrayList<>();
						array.add(1);
						array.add(2);
						array.add(3);
						array.add(4);
						array.add(5);
						array.add(6);
						array.add(7);
						List<Object> expected = new ArrayList<>();
						expected.add(1);
						expected.add(2);
						expected.add(3);
						expected.add(4);
						expected.add(5);
						expected.add(6);
						expected.add(7);
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortArray1#sortArray(List)} method.
			* It tests the method with a list of eight elements.
			*/
			@Test
			void testSortArrayWithEightElements() {
						List<Object> array = new ArrayList<>();
						array.add(1);
						array.add(2);
						array.add(3);
						array.add(4);
						array.add(5);
						array.add(6);
						array.add(7);
						array.add(8);
						List<Object> expected = new ArrayList<>();
						expected.add(1);
						expected.add(2);
						expected.add(3);
						expected.add(4);
						expected.add(5);
						expected.add(6);
						expected.add(7);
						expected.add(8);
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortArray1#sortArray(List)} method.
			* It tests the method with a list of nine elements.
			*/
			@Test
			void testSortArrayWithNineElements() {
						List<Object> array = new ArrayList<>();
						array.add(1);
						array.add(2);
						array.add(3);
						array.add(4);
						array.add(5);
						array.add(6);
						array.add(7);
						array.add(8);
						array.add(9);
						List<Object> expected = new ArrayList<>();
						expected.add(1);
						expected.add(2);
						expected.add(3);
						expected.add(4);
						expected.add(5);
						expected.add(6);
						expected.add(7);
						expected.add(8);
						expected.add(9);
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortArray1#sortArray(List)} method.
			* It tests the method with a list of ten elements.
			*/
			@Test
			void testSortArrayWithTenElements() {
						List<Object> array = new ArrayList<>();
						array.add(1);
						array.add(2);
						array.add(3);
						array.add(4);
						array.add(5);
						array.add(6);
						array.add(7);
						array.add(8);
						array.add(9);
						array.add(10);
						List<Object> expected = new ArrayList<>();
						expected.add(1);
						expected.add(2);
						expected.add(3);
						expected.add(4);
						expected.add(5);
						expected.add(6);
						expected.add(7);
						expected.add(8);
						expected.add(9);
						expected.add(10);
						List<Object> actual = SortArray1.sortArray(array);
						assertEquals(expected, actual);
			}
}

