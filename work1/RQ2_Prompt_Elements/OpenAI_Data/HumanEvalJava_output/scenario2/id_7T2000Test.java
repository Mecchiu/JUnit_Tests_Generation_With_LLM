// FilterBySubstringTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterBySubstring}.
* It contains ten unit test cases for the {@link FilterBySubstring#filterBySubstring(List, String)} method.
*/
class FilterBySubstringTest {
	// Test case 1: Test with empty list
			@Test
			void testEmptyList() {
				List<Object> strings = new ArrayList<Object>();
				String substring = "test";
				List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(0, result.size());
			}
			
			// Test case 2: Test with empty substring
			@Test
			void testEmptySubstring() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("test");
				String substring = "";
				List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(1, result.size());
			}
			
			// Test case 3: Test with empty list and empty substring
			@Test
			void testEmptyListAndSubstring() {
				List<Object> strings = new ArrayList<Object>();
				String substring = "";
				List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(0, result.size());
			}
			
			// Test case 4: Test with list of strings that do not contain substring
			@Test
			void testNoSubstring() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("test1");
				strings.add("test2");
				strings.add("test3");
				String substring = "test4";
				List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(0, result.size());
			}
			
			// Test case 5: Test with list of strings that contain substring
			@Test
			void testSubstring() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("test1");
				strings.add("test2");
				strings.add("test3");
				String substring = "test";
				List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(3, result.size());
			}
			
			// Test case 6: Test with list of strings that contain substring multiple times
			@Test
			void testSubstringMultipleTimes() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("test1");
				strings.add("test2");
				strings.add("test3");
				String substring = "t";
				List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(3, result.size());
			}
			
			// Test case 7: Test with list of strings that contain substring at the beginning
			@Test
			void testSubstringAtBeginning() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("test1");
				strings.add("test2");
				strings.add("test3");
				String substring = "test1";
				List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(1, result.size());
			}
			
			// Test case 8: Test with list of strings that contain substring at the end
			@Test
			void testSubstringAtEnd() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("test1");
				strings.add("test2");
				strings.add("test3");
				String substring = "3";
				List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(1, result.size());
			}
			
			// Test case 9: Test with list of strings that contain substring with different cases
			@Test
			void testSubstringDifferentCases() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("test1");
				strings.add("test2");
				strings.add("test3");
				String substring = "TeSt";
				List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(3, result.size());
			}
			
			// Test case 10: Test with list of strings that contain substring with special characters
			@Test
			void testSubstringSpecialCharacters() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("test1");
				strings.add("test2");
				strings.add("test3");
				String substring = "t@st";
				List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(0, result.size());
			}
}