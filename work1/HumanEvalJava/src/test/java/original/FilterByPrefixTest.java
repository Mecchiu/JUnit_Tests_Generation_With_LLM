// FilterByPrefixTest.java
package original;

import java.util.ArrayList;
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
				List<Object> strings = new ArrayList<Object>();
				String prefix = "a";
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(expected, actual);
			}
			
			// Test case 2: List with no strings starting with prefix
			@Test
			void testNoStringsStartingWithPrefix() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("bcd");
				strings.add("cde");
				String prefix = "a";
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(expected, actual);
			}
			
			// Test case 3: List with one string starting with prefix
			@Test
			void testOneStringStartingWithPrefix() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("abc");
				String prefix = "a";
				List<Object> expected = new ArrayList<Object>();
				expected.add("abc");
				List<Object> actual = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(expected, actual);
			}
			
			// Test case 4: List with multiple strings starting with prefix
			@Test
			void testMultipleStringsWithPrefix() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("abc");
				strings.add("bcd");
				strings.add("cde");
				strings.add("array");
				String prefix = "a";
				List<Object> expected = new ArrayList<Object>();
				expected.add("abc");
				expected.add("array");
				List<Object> actual = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(expected, actual);
			}
			
			// Test case 5: List with one string starting with prefix and other strings not starting with prefix
			@Test
			void testOneStringStartingWithPrefixAndOthersNotStartingWithPrefix() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("abc");
				strings.add("bcd");
				strings.add("cde");
				strings.add("array");
				String prefix = "b";
				List<Object> expected = new ArrayList<Object>();
				expected.add("bcd");
				List<Object> actual = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(expected, actual);
			}
			
			// Test case 6: List with one string starting with prefix and other strings not starting with prefix
			@Test
			void testMultipleStringsWithPrefixAndOthersNotStartingWithPrefix() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("abc");
				strings.add("bcd");
				strings.add("cde");
				strings.add("array");
				String prefix = "c";
				List<Object> expected = new ArrayList<Object>();
				expected.add("cde");
				List<Object> actual = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(expected, actual);
			}
			
			// Test case 7: List with one string starting with prefix and other strings not starting with prefix
			@Test
			void testMultipleStringsWithPrefixAndOthersNotStartingWithPrefix2() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("abc");
				strings.add("bcd");
				strings.add("cde");
				strings.add("array");
				String prefix = "d";
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(expected, actual);
			}
			
			// Test case 8: List with one string starting with prefix and other strings not starting with prefix
			@Test
			void testMultipleStringsWithPrefixAndOthersNotStartingWithPrefix3() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("abc");
				strings.add("bcd");
				strings.add("cde");
				strings.add("array");
				String prefix = "e";
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(expected, actual);
			}
			
			// Test case 9: List with one string starting with prefix and other strings not starting with prefix
			@Test
			void testMultipleStringsWithPrefixAndOthersNotStartingWithPrefix4() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("abc");
				strings.add("bcd");
				strings.add("cde");
				strings.add("array");
				String prefix = "f";
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(expected, actual);
			}
			
			// Test case 10: List with one string starting with prefix and other strings not starting with prefix
			@Test
			void testMultipleStringsWithPrefixAndOthersNotStartingWithPrefix5() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("xxx");
				strings.add("asd");
				strings.add("xxy");
				strings.add("john doe");
				strings.add("xxxAAA");
				strings.add("xxx");
				String prefix = "xxx";
				List<Object> expected = new ArrayList<Object>();
				expected.add("xxx");
				expected.add("xxxAAA");
				expected.add("xxx");
				List<Object> actual = FilterByPrefix.filterByPrefix(strings, prefix);
				assertEquals(expected, actual);
			}
}