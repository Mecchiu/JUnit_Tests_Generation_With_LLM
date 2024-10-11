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
	void testFilterBySubstring_EmptyList() {
		List<Object> strings = List.of();
		List<Object> expected = List.of();
		List<Object> actual = FilterBySubstring.filterBySubstring(strings, "a");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterBySubstring_EmptySubstring() {
		List<Object> strings = List.of("abc", "bacd", "cde", "array");
		List<Object> expected = List.of();
		List<Object> actual = FilterBySubstring.filterBySubstring(strings, "");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterBySubstring_EmptyListAndEmptySubstring() {
		List<Object> strings = List.of();
		List<Object> expected = List.of();
		List<Object> actual = FilterBySubstring.filterBySubstring(strings, "");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterBySubstring_SubstringNotFound() {
		List<Object> strings = List.of("abc", "bacd", "cde", "array");
		List<Object> expected = List.of();
		List<Object> actual = FilterBySubstring.filterBySubstring(strings, "john");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterBySubstring_SubstringFound() {
		List<Object> strings = List.of("abc", "bacd", "cde", "array");
		List<Object> expected = List.of("abc", "bacd", "array");
		List<Object> actual = FilterBySubstring.filterBySubstring(strings, "a");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterBySubstring_SubstringFoundMultipleTimes() {
		List<Object> strings = List.of("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
		List<Object> expected = List.of("xxx", "xxxAAA", "xxx");
		List<Object> actual = FilterBySubstring.filterBySubstring(strings, "xxx");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterBySubstring_SubstringFoundMultipleTimesInSameString() {
		List<Object> strings = List.of("xxx", "asd", "aaaxxy", "john doe", "xxxAAA", "xxx");
		List<Object> expected = List.of("xxx", "aaaxxy", "xxxAAA", "xxx");
		List<Object> actual = FilterBySubstring.filterBySubstring(strings, "xx");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterBySubstring_SubstringFoundMultipleTimesInSameString_CaseInsensitive() {
		List<Object> strings = List.of("xxx", "asd", "aaaxxy", "john doe", "xxxAAA", "xxx");
		List<Object> expected = List.of("xxx", "aaaxxy", "xxxAAA", "xxx");
		List<Object> actual = FilterBySubstring.filterBySubstring(strings, "Xx");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterBySubstring_SubstringFoundMultipleTimesInSameString_CaseInsensitive2() {
		List<Object> strings = List.of("xxx", "asd", "aaaxxy", "john doe", "xxxAAA", "xxx");
		List<Object> expected = List.of("xxx", "aaaxxy", "xxxAAA", "xxx");
		List<Object> actual = FilterBySubstring.filterBySubstring(strings, "XxX");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterBySubstring_SubstringFoundMultipleTimesInDifferentStrings() {
		List<Object> strings = List.of("grunt", "trumpet", "prune", "gruesome");
		List<Object> expected = List.of("grunt", "prune");
		List<Object> actual = FilterBySubstring.filterBySubstring(strings, "run");
		assertEquals(expected, actual);
	}
}