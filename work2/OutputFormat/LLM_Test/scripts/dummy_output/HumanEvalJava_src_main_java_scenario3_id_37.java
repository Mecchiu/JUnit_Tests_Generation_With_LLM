// SortEvenTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortEven}.
* It contains ten unit test cases for the {@link SortEven#sortEven(List)} method.
*/
class SortEvenTest {
			// Test case 1: Test with a list of three elements
			@Test
			void testSortEven1() {
				List<Integer> l = List.of(1, 2, 3);
				List<Integer> expected = List.of(1, 2, 3);
				List<Integer> actual = SortEven.sortEven(l);
				assertEquals(expected, actual);
			}

			// Test case 2: Test with a list of four elements
			@Test
			void testSortEven2() {
				List<Integer> l = List.of(5, 6, 3, 4);
				List<Integer> expected = List.of(3, 6, 5, 4);
				List<Integer> actual = SortEven.sortEven(l);
				assertEquals(expected, actual);
			}

			// Test case 3: Test with a list of three elements
			@Test
			void testSortEven3() {
				List<Integer> l = List.of(1, 2, 3);
				List<Integer> expected = List.of(1, 2, 3);
				List<Integer> actual = SortEven.sortEven(l);
				assertEquals(expected, actual);
			}

			// Test case 4: Test with a list of eleven elements
			@Test
			void testSortEven4() {
				List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
				List<Integer> expected = List.of(-10, 3, -5, 2, -3, 3, 5, 0, 9, 1, 123);
				List<Integer> actual = SortEven.sortEven(l);
				assertEquals(expected, actual);
			}

			// Test case 5: Test with a list of ten elements
			@Test
			void testSortEven5() {
				List<Integer> l = List.of(5, 8, -12, 4, 23, 2, 3, 11, 12, -10);
				List<Integer> expected = List.of(-12, 8, 3, 4, 5, 2, 12, 11, 23, -10);
				List<Integer> actual = SortEven.sortEven(l);
				assertEquals(expected, actual);
			}

			// Test case 6: Test with an empty list
			@Test
			void testSortEven6() {
				List<Integer> l = List.of();
				List<Integer> expected = List.of();
				List<Integer> actual = SortEven.sortEven(l);
				assertEquals(expected, actual);
			}

			// Test case 7: Test with a list of one element
			@Test
			void testSortEven7() {
				List<Integer> l = List.of(5);
				List<Integer> expected = List.of(5);
				List<Integer> actual = SortEven.sortEven(l);
				assertEquals(expected, actual);
			}

			// Test case 8: Test with a list of two elements
			@Test
			void testSortEven8() {
				List<Integer> l = List.of(5, 6);
				List<Integer> expected = List.of(5, 6);
				List<Integer> actual = SortEven.sortEven(l);
				assertEquals(expected, actual);
			}

			// Test case 9: Test with a list of two elements
			@Test
			void testSortEven9() {
				List<Integer> l = List.of(6, 5);
				List<Integer> expected = List.of(5, 6);
				List<Integer> actual = SortEven.sortEven(l);
				assertEquals(expected, actual);
			}

			// Test case 10: Test with a list of two elements
			@Test
			void testSortEven10() {
				List<Integer> l = List.of(6, 6);
				List<Integer> expected = List.of(6, 6);
				List<Integer> actual = SortEven.sortEven(l);
				assertEquals(expected, actual);
			}
}