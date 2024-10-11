// SortThirdTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortThird}.
* It contains ten unit test cases for the {@link SortThird#sortThird(List)} method.
*/
class SortThirdTest {
	/**
			* Test case for the {@link SortThird#sortThird(List)} method.
			* It tests the method with a list of three elements.
			*/
			@Test
			void testSortThirdWithThreeElements() {
				List<Integer> l = List.of(1, 2, 3);
				List<Integer> expected = List.of(1, 2, 3);
				List<Integer> actual = SortThird.sortThird(l);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortThird#sortThird(List)} method.
			* It tests the method with a list of seven elements.
			*/
			@Test
			void testSortThirdWithSevenElements() {
				List<Integer> l = List.of(5, 6, 3, 4, 8, 9, 2);
				List<Integer> expected = List.of(2, 6, 3, 4, 8, 9, 5);
				List<Integer> actual = SortThird.sortThird(l);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortThird#sortThird(List)} method.
			* It tests the method with a list of eleven elements.
			*/
			@Test
			void testSortThirdWithElevenElements() {
				List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
				List<Integer> expected = List.of(1, 3, -5, 2, -3, 3, 5, 0, 123, 9, -10);
				List<Integer> actual = SortThird.sortThird(l);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortThird#sortThird(List)} method.
			* It tests the method with a list of ten elements.
			*/
			@Test
			void testSortThirdWithTenElements() {
				List<Integer> l = List.of(5, 8, -12, 4, 23, 2, 3, 11, 12, -10);
				List<Integer> expected = List.of(-10, 8, -12, 3, 23, 2, 4, 11, 12, 5);
				List<Integer> actual = SortThird.sortThird(l);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortThird#sortThird(List)} method.
			* It tests the method with a list of seven elements.
			*/
			@Test
			void testSortThirdWithSevenElements2() {
				List<Integer> l = List.of(5, 6, 3, 4, 8, 9, 2);
				List<Integer> expected = List.of(2, 6, 3, 4, 8, 9, 5);
				List<Integer> actual = SortThird.sortThird(l);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortThird#sortThird(List)} method.
			* It tests the method with a list of seven elements.
			*/
			@Test
			void testSortThirdWithSevenElements3() {
				List<Integer> l = List.of(5, 8, 3, 4, 6, 9, 2);
				List<Integer> expected = List.of(2, 8, 3, 4, 6, 9, 5);
				List<Integer> actual = SortThird.sortThird(l);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortThird#sortThird(List)} method.
			* It tests the method with a list of seven elements.
			*/
			@Test
			void testSortThirdWithSevenElements4() {
				List<Integer> l = List.of(5, 6, 9, 4, 8, 3, 2);
				List<Integer> expected = List.of(2, 6, 9, 4, 8, 3, 5);
				List<Integer> actual = SortThird.sortThird(l);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortThird#sortThird(List)} method.
			* It tests the method with a list of eight elements.
			*/
			@Test
			void testSortThirdWithEightElements() {
				List<Integer> l = List.of(5, 6, 3, 4, 8, 9, 2, 1);
				List<Integer> expected = List.of(2, 6, 3, 4, 8, 9, 5, 1);
				List<Integer> actual = SortThird.sortThird(l);
				assertEquals(expected, actual);
			}
}
