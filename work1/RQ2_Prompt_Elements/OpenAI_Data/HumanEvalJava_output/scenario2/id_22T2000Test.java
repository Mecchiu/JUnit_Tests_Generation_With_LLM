// FilterIntegersTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterIntegers}.
* It contains ten unit test cases for the {@link FilterIntegers#filterIntegers(List)} method.
*/
class FilterIntegersTest {
	// Test case 1: Test with empty list
			@Test
			void testFilterIntegersWithEmptyList() {
				List<Object> values = new ArrayList<Object>();
				List<Object> result = FilterIntegers.filterIntegers(values);
				assertEquals(0, result.size());
			}

			// Test case 2: Test with list of integers
			@Test
			void testFilterIntegersWithListOfIntegers() {
				List<Object> values = new ArrayList<Object>();
				values.add(1);
				values.add(2);
				values.add(3);
				List<Object> result = FilterIntegers.filterIntegers(values);
				assertEquals(3, result.size());
			}

			// Test case 3: Test with list of strings
			@Test
			void testFilterIntegersWithListOfStrings() {
				List<Object> values = new ArrayList<Object>();
				values.add("1");
				values.add("2");
				values.add("3");
				List<Object> result = FilterIntegers.filterIntegers(values);
				assertEquals(0, result.size());
			}

			// Test case 4: Test with list of mixed values
			@Test
			void testFilterIntegersWithListOfMixedValues() {
				List<Object> values = new ArrayList<Object>();
				values.add(1);
				values.add("2");
				values.add(3);
				List<Object> result = FilterIntegers.filterIntegers(values);
				assertEquals(2, result.size());
			}

			// Test case 5: Test with null list
			@Test
			void testFilterIntegersWithNullList() {
				List<Object> values = null;
				List<Object> result = FilterIntegers.filterIntegers(values);
				assertEquals(0, result.size());
			}

			// Test case 6: Test with list of null values
			@Test
			void testFilterIntegersWithListOfNullValues() {
				List<Object> values = new ArrayList<Object>();
				values.add(null);
				values.add(null);
				values.add(null);
				List<Object> result = FilterIntegers.filterIntegers(values);
				assertEquals(0, result.size());
			}

			// Test case 7: Test with list of negative integers
			@Test
			void testFilterIntegersWithListOfNegativeIntegers() {
				List<Object> values = new ArrayList<Object>();
				values.add(-1);
				values.add(-2);
				values.add(-3);
				List<Object> result = FilterIntegers.filterIntegers(values);
				assertEquals(3, result.size());
			}

			// Test case 8: Test with list of positive integers
			@Test
			void testFilterIntegersWithListOfPositiveIntegers() {
				List<Object> values = new ArrayList<Object>();
				values.add(1);
				values.add(2);
				values.add(3);
				List<Object> result = FilterIntegers.filterIntegers(values);
				assertEquals(3, result.size());
			}

			// Test case 9: Test with list of zero values
			@Test
			void testFilterIntegersWithListOfZeroValues() {
				List<Object> values = new ArrayList<Object>();
				values.add(0);
				values.add(0);
				values.add(0);
				List<Object> result = FilterIntegers.filterIntegers(values);
				assertEquals(3, result.size());
			}

			// Test case 10: Test with list of decimal values
			@Test
			void testFilterIntegersWithListOfDecimalValues() {
				List<Object> values = new ArrayList<Object>();
				values.add(1.1);
				values.add(2.2);
				values.add(3.3);
				List<Object> result = FilterIntegers.filterIntegers(values);
				assertEquals(0, result.size());
			}
}
