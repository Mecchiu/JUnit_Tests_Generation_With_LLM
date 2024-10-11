// SortEvenTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortEven}.
* It contains ten unit test cases for the {@link SortEven#sortEven(List)} method.
*/
class SortEvenTest {
	/**
			* Test case for the {@link SortEven#sortEven(List)} method.
			* It tests the method with a list of three elements.
			*/
			@Test
			void testSortEvenWithThreeElements() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(1);
				l.add(2);
				l.add(3);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				List<Integer> actual = SortEven.sortEven(l);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortEven#sortEven(List)} method.
			* It tests the method with a list of four elements.
			*/
			@Test
			void testSortEvenWithFourElements() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(6);
				l.add(3);
				l.add(4);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(3);
				expected.add(6);
				expected.add(5);
				expected.add(4);
				List<Integer> actual = SortEven.sortEven(l);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortEven#sortEven(List)} method.
			* It tests the method with a list of three elements.
			*/
			@Test
			void testSortEvenWithThreeElements2() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(1);
				l.add(2);
				l.add(3);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				List<Integer> actual = SortEven.sortEven(l);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortEven#sortEven(List)} method.
			* It tests the method with a list of eleven elements.
			*/
			@Test
			void testSortEvenWithElevenElements() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(3);
				l.add(-5);
				l.add(2);
				l.add(-3);
				l.add(3);
				l.add(9);
				l.add(0);
				l.add(123);
				l.add(1);
				l.add(-10);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(-10);
				expected.add(3);
				expected.add(-5);
				expected.add(2);
				expected.add(-3);
				expected.add(3);
				expected.add(5);
				expected.add(0);
				expected.add(9);
				expected.add(1);
				expected.add(123);
				List<Integer> actual = SortEven.sortEven(l);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortEven#sortEven(List)} method.
			* It tests the method with a list of ten elements.
			*/
			@Test
			void testSortEvenWithTenElements() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(8);
				l.add(-12);
				l.add(4);
				l.add(23);
				l.add(2);
				l.add(3);
				l.add(11);
				l.add(12);
				l.add(-10);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(-12);
				expected.add(8);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				expected.add(2);
				expected.add(12);
				expected.add(11);
				expected.add(23);
				expected.add(-10);
				List<Integer> actual = SortEven.sortEven(l);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortEven#sortEven(List)} method.
			* It tests the method with a list of one element.
			*/
			@Test
			void testSortEvenWithOneElement() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(5);
				List<Integer> actual = SortEven.sortEven(l);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortEven#sortEven(List)} method.
			* It tests the method with a list of two elements.
			*/
			@Test
			void testSortEvenWithTwoElements() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(6);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(5);
				expected.add(6);
				List<Integer> actual = SortEven.sortEven(l);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortEven#sortEven(List)} method.
			* It tests the method with a list of zero elements.
			*/
			@Test
			void testSortEvenWithZeroElements() {
				List<Integer> l = new ArrayList<Integer>();
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = SortEven.sortEven(l);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortEven#sortEven(List)} method.
			* It tests the method with a list of five elements.
			*/
			@Test
			void testSortEvenWithFiveElements() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(3);
				l.add(-5);
				l.add(2);
				l.add(-3);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(-5);
				expected.add(3);
				expected.add(-3);
				expected.add(2);
				expected.add(5);
				List<Integer> actual = SortEven.sortEven(l);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortEven#sortEven(List)} method.
			* It tests the method with a list of six elements.
			*/
			@Test
			void testSortEvenWithSixElements() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(3);
				l.add(-5);
				l.add(2);
				l.add(-3);
				l.add(3);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(-5);
				expected.add(3);
				expected.add(-3);
				expected.add(2);
				expected.add(3);
				expected.add(5);
				List<Integer> actual = SortEven.sortEven(l);
				assertEquals(expected, actual);
			}
}
