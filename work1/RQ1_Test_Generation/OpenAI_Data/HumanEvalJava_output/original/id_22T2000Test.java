// FilterIntegersTest.java
package original;

import java.util.ArrayList;
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
				List<Object> values = new ArrayList<Object>();
				values.add("a");
				values.add(3.14);
				values.add(5);
				List<Object> expected = new ArrayList<Object>();
				expected.add(5);
				List<Object> actual = FilterIntegers.filterIntegers(values);
				assertEquals(expected, actual);
			}

			// Test case 2: Test with a list of integers.
			@Test
			void testFilterIntegers2() {
				List<Object> values = new ArrayList<Object>();
				values.add(1);
				values.add(2);
				values.add(3);
				values.add("abc");
				values.add(new Object());
				values.add(new ArrayList<Object>());
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				List<Object> actual = FilterIntegers.filterIntegers(values);
				assertEquals(expected, actual);
			}

			// Test case 3: Test with an empty list.
			@Test
			void testFilterIntegers3() {
				List<Object> values = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterIntegers.filterIntegers(values);
				assertEquals(expected, actual);
			}

			// Test case 4: Test with a list of mixed values.
			@Test
			void testFilterIntegers4() {
				List<Object> values = new ArrayList<Object>();
				values.add(4);
				values.add(new Object());
				values.add(new ArrayList<Object>());
				values.add(23.2);
				values.add(9);
				values.add("adasd");
				List<Object> expected = new ArrayList<Object>();
				expected.add(4);
				expected.add(9);
				List<Object> actual = FilterIntegers.filterIntegers(values);
				assertEquals(expected, actual);
			}

			// Test case 5: Test with a list of mixed values.
			@Test
			void testFilterIntegers5() {
				List<Object> values = new ArrayList<Object>();
				values.add(3);
				values.add("c");
				values.add(3);
				values.add(3);
				values.add("a");
				values.add("b");
				List<Object> expected = new ArrayList<Object>();
				expected.add(3);
				expected.add(3);
				expected.add(3);
				List<Object> actual = FilterIntegers.filterIntegers(values);
				assertEquals(expected, actual);
			}

			// Test case 6: Test with a list of mixed values.
			@Test
			void testFilterIntegers6() {
				List<Object> values = new ArrayList<Object>();
				values.add("a");
				values.add("b");
				values.add("c");
				values.add("d");
				values.add("e");
				values.add("f");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterIntegers.filterIntegers(values);
				assertEquals(expected, actual);
			}

			// Test case 7: Test with a list of mixed values.
			@Test
			void testFilterIntegers7() {
				List<Object> values = new ArrayList<Object>();
				values.add(1);
				values.add(2);
				values.add(3);
				values.add(4);
				values.add(5);
				values.add(6);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				expected.add(6);
				List<Object> actual = FilterIntegers.filterIntegers(values);
				assertEquals(expected, actual);
			}

			// Test case 8: Test with a list of mixed values.
			@Test
			void testFilterIntegers8() {
				List<Object> values = new ArrayList<Object>();
				values.add(1);
				values.add(2);
				values.add(3);
				values.add(4);
				values.add(5);
				values.add(6);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				expected.add(6);
				List<Object> actual = FilterIntegers.filterIntegers(values);
				assertEquals(expected, actual);
			}

			// Test case 9: Test with a list of mixed values.
			@Test
			void testFilterIntegers9() {
				List<Object> values = new ArrayList<Object>();
				values.add(1);
				values.add(2);
				values.add(3);
				values.add(4);
				values.add(5);
				values.add(6);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				expected.add(6);
				List<Object> actual = FilterIntegers.filterIntegers(values);
				assertEquals(expected, actual);
			}

			// Test case 10: Test with a list of mixed values.
			@Test
			void testFilterIntegers10() {
				List<Object> values = new ArrayList<Object>();
				values.add(1);
				values.add(2);
				values.add(3);
				values.add(4);
				values.add(5);
				values.add(6);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				expected.add(6);
				List<Object> actual = FilterIntegers.filterIntegers(values);
				assertEquals(expected, actual);
			}
}
