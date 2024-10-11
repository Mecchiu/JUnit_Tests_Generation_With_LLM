// FilterByPrefixTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterByPrefix}.
* It contains ten unit test cases for the {@link FilterByPrefix#filterByPrefix(List, String)} method.
*/
class FilterByPrefixTest {
			// Test case 1: Empty list
			@Test
			void testEmptyList() {
				List<Object> strings = new ArrayList<>();
				String prefix = "a";
				List<Object> expected = new ArrayList<>();
				List<Object> actual = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(expected, actual);
			}
			
			// Test case 2: List with no strings starting with the prefix
			@Test
			void testNoStringsStartingWithPrefix() {
				List<Object> strings = Arrays.asList("bcd", "cde", "array");
				String prefix = "a";
				List<Object> expected = new ArrayList<>();
				List<Object> actual = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(expected, actual);
			}
			
			// Test case 3: Empty prefix
			@Test
			void testEmptyPrefix() {
				List<Object> strings = Arrays.asList("abc", "bcd", "cde", "array");
				String prefix = "";
				List<Object> expected = new ArrayList<>();
				List<Object> actual = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(expected, actual);
			}
			
			// Test case 4: Prefix with no strings in the list
			@Test
			void testPrefixWithNoStringsInList() {
				List<Object> strings = Arrays.asList("abc", "bcd", "cde", "array");
				String prefix = "john";
				List<Object> expected = new ArrayList<>();
				List<Object> actual = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(expected, actual);
			}
			
			// Test case 5: List with one string starting with the prefix
			@Test
			void testOneStringStartingWithPrefix() {
				List<Object> strings = Arrays.asList("abc", "bcd", "cde", "array");
				String prefix = "a";
				List<Object> expected = Arrays.asList("abc");
				List<Object> actual = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(expected, actual);
			}
			
			// Test case 6: List with multiple strings starting with the prefix
			@Test
			void testMultipleStringsStartingWithPrefix() {
				List<Object> strings = Arrays.asList("abc", "bcd", "cde", "array");
				String prefix = "b";
				List<Object> expected = Arrays.asList("bcd");
				List<Object> actual = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(expected, actual);
			}
			
			// Test case 7: List with all strings starting with the prefix
			@Test
			void testAllStringsStartingWithPrefix() {
				List<Object> strings = Arrays.asList("abc", "bcd", "cde", "array");
				String prefix = "c";
				List<Object> expected = Arrays.asList("cde");
				List<Object> actual = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(expected, actual);
			}
			
			// Test case 8: List with duplicate strings starting with the prefix
			@Test
			void testDuplicateStringsStartingWithPrefix() {
				List<Object> strings = Arrays.asList("abc", "bcd", "cde", "array", "abc");
				String prefix = "a";
				List<Object> expected = Arrays.asList("abc", "abc");
				List<Object> actual = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(expected, actual);
			}
			
			// Test case 9: List with strings starting with the prefix in different cases
			@Test
			void testStringsStartingWithPrefixInDifferentCases() {
				List<Object> strings = Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
				String prefix = "xxx";
				List<Object> expected = Arrays.asList("xxx", "xxxAAA", "xxx");
				List<Object> actual = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(expected, actual);
			}
			
			// Test case 10: List with strings starting with the prefix in different cases
			@Test
			void testStringsStartingWithPrefixInDifferentCases() {
				List<Object> strings = Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
				String prefix = "xxx";
				List<Object> expected = Arrays.asList("xxx", "xxxAAA", "xxx");
				List<Object> actual = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(expected, actual);
			}
}