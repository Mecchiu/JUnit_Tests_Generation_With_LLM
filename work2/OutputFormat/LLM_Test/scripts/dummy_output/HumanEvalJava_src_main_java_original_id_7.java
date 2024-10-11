// FilterBySubstringTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterBySubstring}.
* It contains ten unit test cases for the {@link FilterBySubstring#filterBySubstring(List, String)} method.
*/
class FilterBySubstringTest {
			// Test case 1: Empty list
			@Test
			void testEmptyList() {
				List<Object> strings = new ArrayList<Object>();
				String substring = "a";
				List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(0, result.size());
			}
			
			// Test case 2: Empty list and empty substring
			@Test
			void testEmptyListAndEmptySubstring() {
				List<Object> strings = new ArrayList<Object>();
				String substring = "";
				List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(0, result.size());
			}
			
			// Test case 3: List with one element and empty substring
			@Test
			void testListWithOneElementAndEmptySubstring() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("abc");
				String substring = "";
				List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(1, result.size());
				assertEquals("abc", result.get(0));
			}
			
			// Test case 4: List with one element and substring not contained
			@Test
			void testListWithOneElementAndSubstringNotContained() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("abc");
				String substring = "d";
				List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(0, result.size());
			}
			
			// Test case 5: List with one element and substring contained
			@Test
			void testListWithOneElementAndSubstringContained() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("abc");
				String substring = "a";
				List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(1, result.size());
				assertEquals("abc", result.get(0));
			}
			
			// Test case 6: List with multiple elements and empty substring
			@Test
			void testListWithMultipleElementsAndEmptySubstring() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("abc");
				strings.add("bacd");
				strings.add("cde");
				strings.add("array");
				String substring = "";
				List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(4, result.size());
				assertEquals("abc", result.get(0));
				assertEquals("bacd", result.get(1));
				assertEquals("cde", result.get(2));
				assertEquals("array", result.get(3));
			}
			
			// Test case 7: List with multiple elements and substring not contained
			@Test
			void testListWithMultipleElementsAndSubstringNotContained() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("abc");
				strings.add("bacd");
				strings.add("cde");
				strings.add("array");
				String substring = "f";
				List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(0, result.size());
			}
			
			// Test case 8: List with multiple elements and substring contained
			@Test
			void testListWithMultipleElementsAndSubstringContained() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("abc");
				strings.add("bacd");
				strings.add("cde");
				strings.add("array");
				String substring = "a";
				List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(3, result.size());
				assertEquals("abc", result.get(0));
				assertEquals("bacd", result.get(1));
				assertEquals("array", result.get(2));
			}
			
			// Test case 9: List with multiple elements and substring contained multiple times
			@Test
			void testListWithMultipleElementsAndSubstringContainedMultipleTimes() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("xxx");
				strings.add("asd");
				strings.add("xxy");
				strings.add("john doe");
				strings.add("xxxAAA");
				strings.add("xxx");
				String substring = "xxx";
				List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(3, result.size());
				assertEquals("xxx", result.get(0));
				assertEquals("xxxAAA", result.get(1));
				assertEquals("xxx", result.get(2));
			}
			
			// Test case 10: List with multiple elements and substring contained multiple times
			@Test
			void testListWithMultipleElementsAndSubstringContainedMultipleTimes2() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("grunt");
				strings.add("trumpet");
				strings.add("prune");
				strings.add("gruesome");
				String substring = "run";
				List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(2, result.size());
				assertEquals("grunt", result.get(0));
				assertEquals("prune", result.get(1));
			}
}