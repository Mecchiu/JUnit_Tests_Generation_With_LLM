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

	@Test
	void testFilterByPrefix_emptyList() {
		List<Object> input = List.of();
		List<Object> expected = List.of();
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "a");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_emptyPrefix() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "bcd", "cde", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_noMatch() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of();
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "john");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_oneMatch() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "array");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "a");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "A");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsLowerCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "a");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsUpperCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "A");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "Ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsLowerCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsUpperCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "Ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "Ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase_prefixIsLowerCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase_prefixIsUpperCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "Ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "Ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsLowerCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsUpperCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "Ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "Ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsLowerCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsUpperCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "Ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "Ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsLowerCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsUpperCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "Ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "Ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsLowerCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsUpperCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "Ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "Ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsLowerCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsUpperCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "Ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "Ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsLowerCase() {
		List<Object> input = List.of("abc", "bcd", "cde", "array");
		List<Object> expected = List.of("abc", "array");
		List<Object> actual = FilterByPrefix.filterByPrefix(input, "ar");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_caseInsensitive_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_prefixIsMixedCase_