// FilterIntegersTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterIntegers}.
* It contains ten unit test cases for the {@link FilterIntegers#filterIntegers(List)} method.
*/
class FilterIntegersTest {
	// Test case 1: Test with a list of mixed values.
			@Test
			void testFilterIntegers1() {
				List<Object> values = List.of("a", 3.14, 5);
				List<Object> expected = List.of(5);
				List<Object> actual = FilterIntegers.filterIntegers(values);
				assertEquals(expected, actual);
			}

			// Test case 2: Test with a list of integers.
			@Test
			void testFilterIntegers2() {
				List<Object> values = List.of(1, 2, 3, "abc", {}, []);
				List<Object> expected = List.of(1, 2, 3);
				List<Object> actual = FilterIntegers.filterIntegers(values);
				assertEquals(expected, actual);
			}

			// Test case 3: Test with an empty list.
			@Test
			void testFilterIntegers3() {
				List<Object> values = List.of();
				List<Object> expected = List.of();
				List<Object> actual = FilterIntegers.filterIntegers(values);
				assertEquals(expected, actual);
			}

			// Test case 4: Test with a list of mixed values.
			@Test
			void testFilterIntegers4() {
				List<Object> values = List.of(4, {}, [], 23.2, 9, "adasd");
				List<Object> expected = List.of(4, 9);
				List<Object> actual = FilterIntegers.filterIntegers(values);
				assertEquals(expected, actual);
			}

			// Test case 5: Test with a list of mixed values.
			@Test
			void testFilterIntegers5() {
				List<Object> values = List.of(3, "c", 3, 3, "a", "b");
				List<Object> expected = List.of(3, 3, 3);
				List<Object> actual = FilterIntegers.filterIntegers(values);
				assertEquals(expected, actual);
			}

			// Test case 6: Test with a list of mixed values.
			@Test
			void testFilterIntegers6() {
				List<Object> values = List.of(1, 2, 3, 4, 5);
				List<Object> expected = List.of(1, 2, 3, 4, 5);
				List<Object> actual = FilterIntegers.filterIntegers(values);
				assertEquals(expected, actual);
			}

			// Test case 7: Test with a list of mixed values.
			@Test
			void testFilterIntegers7() {
				List<Object> values = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				List<Object> actual = FilterIntegers.filterIntegers(values);
				assertEquals(expected, actual);
			}

			// Test case 8: Test with a list of mixed values.
			@Test
			void testFilterIntegers8() {
				List<Object> values = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "a", "b", "c");
				List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				List<Object> actual = FilterIntegers.filterIntegers(values);
				assertEquals(expected, actual);
			}

			// Test case 9: Test with a list of mixed values.
			@Test
			void testFilterIntegers9() {
				List<Object> values = List.of("a", "b", "c");
				List<Object> expected = List.of();
				List<Object> actual = FilterIntegers.filterIntegers(values);
				assertEquals(expected, actual);
			}

			// Test case 10: Test with a list of mixed values.
			@Test
			void testFilterIntegers10() {
				List<Object> values = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "a", "b", "c", 11, 12, 13, 14, 15);
				List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
				List<Object> actual = FilterIntegers.filterIntegers(values);
				assertEquals(expected, actual);
			}
}
