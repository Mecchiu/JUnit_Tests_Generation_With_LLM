// FilterByPrefixTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterByPrefix}.
* It contains ten unit test cases for the {@link FilterByPrefix#filterByPrefix(List, String)} method.
*/
class FilterByPrefixTest {
			// Test case 1: Test with empty list
			@Test
			void testEmptyList() {
				List<Object> strings = new ArrayList<Object>();
				String prefix = "test";
				List<Object> result = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(0, result.size());
			}
			
			// Test case 2: Test with null list
			@Test
			void testNullList() {
				List<Object> strings = null;
				String prefix = "test";
				List<Object> result = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(null, result);
			}
			
			// Test case 3: Test with null prefix
			@Test
			void testNullPrefix() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("test1");
				strings.add("test2");
				String prefix = null;
				List<Object> result = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(0, result.size());
			}
			
			// Test case 4: Test with empty prefix
			@Test
			void testEmptyPrefix() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("test1");
				strings.add("test2");
				String prefix = "";
				List<Object> result = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(2, result.size());
			}
			
			// Test case 5: Test with prefix not found
			@Test
			void testPrefixNotFound() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("test1");
				strings.add("test2");
				String prefix = "abc";
				List<Object> result = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(0, result.size());
			}
			
			// Test case 6: Test with prefix found at the beginning
			@Test
			void testPrefixFoundAtBeginning() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("test1");
				strings.add("test2");
				String prefix = "test";
				List<Object> result = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(2, result.size());
			}
			
			// Test case 7: Test with prefix found in the middle
			@Test
			void testPrefixFoundInMiddle() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("test1");
				strings.add("test2");
				strings.add("abc");
				String prefix = "es";
				List<Object> result = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(2, result.size());
			}
			
			// Test case 8: Test with prefix found at the end
			@Test
			void testPrefixFoundAtEnd() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("test1");
				strings.add("test2");
				strings.add("abc");
				String prefix = "bc";
				List<Object> result = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(1, result.size());
			}
			
			// Test case 9: Test with prefix found multiple times
			@Test
			void testPrefixFoundMultipleTimes() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("test1");
				strings.add("test2");
				strings.add("abc");
				strings.add("test3");
				String prefix = "test";
				List<Object> result = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(3, result.size());
			}
			
			// Test case 10: Test with prefix found in all strings
			@Test
			void testPrefixFoundInAllStrings() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("test1");
				strings.add("test2");
				strings.add("test3");
				String prefix = "test";
				List<Object> result = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(3, result.size());
			}
}