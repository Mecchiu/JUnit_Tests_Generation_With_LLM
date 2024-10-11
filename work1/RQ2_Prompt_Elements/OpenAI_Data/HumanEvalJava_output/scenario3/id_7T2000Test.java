// FilterBySubstringTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterBySubstring}.
* It contains ten unit test cases for the {@link FilterBySubstring#filterBySubstring(List, String)} method.
*/
class FilterBySubstringTest {
	@Test
			void testEmptyList() {
				List<Object> strings = List.of();
				String substring = "a";
				List<Object> expected = List.of();
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(expected, actual);
			}

			@Test
			void testEmptySubstring() {
				List<Object> strings = List.of("abc", "bacd", "cde", "array");
				String substring = "";
				List<Object> expected = List.of("abc", "bacd", "cde", "array");
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(expected, actual);
			}

			@Test
			void testEmptyListAndSubstring() {
				List<Object> strings = List.of();
				String substring = "";
				List<Object> expected = List.of();
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(expected, actual);
			}

			@Test
			void testNoMatch() {
				List<Object> strings = List.of("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
				String substring = "john";
				List<Object> expected = List.of();
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(expected, actual);
			}

			@Test
			void testNoMatchAndEmptySubstring() {
				List<Object> strings = List.of("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
				String substring = "";
				List<Object> expected = List.of("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(expected, actual);
			}

			@Test
			void testMatch() {
				List<Object> strings = List.of("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
				String substring = "xxx";
				List<Object> expected = List.of("xxx", "xxxAAA", "xxx");
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(expected, actual);
			}

			@Test
			void testMatchAndEmptySubstring() {
				List<Object> strings = List.of("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
				String substring = "";
				List<Object> expected = List.of("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(expected, actual);
			}

			@Test
			void testMatchAndEmptyList() {
				List<Object> strings = List.of();
				String substring = "xxx";
				List<Object> expected = List.of();
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(expected, actual);
			}

			@Test
			void testMatchAndEmptyListAndEmptySubstring() {
				List<Object> strings = List.of();
				String substring = "";
				List<Object> expected = List.of();
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(expected, actual);
			}

			@Test
			void testMatchAndNoMatch() {
				List<Object> strings = List.of("grunt", "trumpet", "prune", "gruesome");
				String substring = "run";
				List<Object> expected = List.of("grunt", "prune");
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, substring);
				assertEquals(expected, actual);
			}
}
