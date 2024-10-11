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

	@Test
	void testFilterByPrefix_EmptyList_EmptyPrefix() {
		List<Object> input = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, ""));
	}
	
	@Test
	void testFilterByPrefix_EmptyList_NonEmptyPrefix() {
		List<Object> input = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "a"));
	}
	
	@Test
	void testFilterByPrefix_NonEmptyList_EmptyPrefix() {
		List<Object> input = new ArrayList<Object>();
		input.add("abc");
		input.add("bcd");
		input.add("cde");
		input.add("array");
		List<Object> expected = new ArrayList<Object>();
		expected.add("abc");
		expected.add("bcd");
		expected.add("cde");
		expected.add("array");
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, ""));
	}
	
	@Test
	void testFilterByPrefix_NonEmptyList_NonEmptyPrefix() {
		List<Object> input = new ArrayList<Object>();
		input.add("abc");
		input.add("bcd");
		input.add("cde");
		input.add("array");
		List<Object> expected = new ArrayList<Object>();
		expected.add("abc");
		expected.add("array");
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "a"));
	}
	
	@Test
	void testFilterByPrefix_NonEmptyList_NonEmptyPrefix_NoMatch() {
		List<Object> input = new ArrayList<Object>();
		input.add("abc");
		input.add("bcd");
		input.add("cde");
		input.add("array");
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "john"));
	}
	
	@Test
	void testFilterByPrefix_NonEmptyList_NonEmptyPrefix_MultipleMatches() {
		List<Object> input = new ArrayList<Object>();
		input.add("xxx");
		input.add("asd");
		input.add("xxy");
		input.add("john doe");
		input.add("xxxAAA");
		input.add("xxx");
		List<Object> expected = new ArrayList<Object>();
		expected.add("xxx");
		expected.add("xxxAAA");
		expected.add("xxx");
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "xxx"));
	}
	
	@Test
	void testFilterByPrefix_NonEmptyList_NonEmptyPrefix_MultipleMatches_NoMatch() {
		List<Object> input = new ArrayList<Object>();
		input.add("xxx");
		input.add("asd");
		input.add("xxy");
		input.add("john doe");
		input.add("xxxAAA");
		input.add("xxx");
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "john"));
	}
	
	@Test
	void testFilterByPrefix_NonEmptyList_NonEmptyPrefix_MultipleMatches_MultipleMatches() {
		List<Object> input = new ArrayList<Object>();
		input.add("xxx");
		input.add("asd");
		input.add("xxy");
		input.add("john doe");
		input.add("xxxAAA");
		input.add("xxx");
		List<Object> expected = new ArrayList<Object>();
		expected.add("xxx");
		expected.add("xxy");
		expected.add("xxxAAA");
		expected.add("xxx");
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "xx"));
	}
	
	@Test
	void testFilterByPrefix_NonEmptyList_NonEmptyPrefix_MultipleMatches_MultipleMatches_NoMatch() {
		List<Object> input = new ArrayList<Object>();
		input.add("xxx");
		input.add("asd");
		input.add("xxy");
		input.add("john doe");
		input.add("xxxAAA");
		input.add("xxx");
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "john"));
	}
	
	@Test
	void testFilterByPrefix_NonEmptyList_NonEmptyPrefix_MultipleMatches_MultipleMatches_MultipleMatches() {
		List<Object> input = new ArrayList<Object>();
		input.add("xxx");
		input.add("asd");
		input.add("xxy");
		input.add("john doe");
		input.add("xxxAAA");
		input.add("xxx");
		List<Object> expected = new ArrayList<Object>();
		expected.add("xxx");
		expected.add("xxy");
		expected.add("xxxAAA");
		expected.add("xxx");
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "x"));
	}
	
	@Test
	void testFilterByPrefix_NonEmptyList_NonEmptyPrefix_MultipleMatches_MultipleMatches_MultipleMatches_NoMatch() {
		List<Object> input = new ArrayList<Object>();
		input.add("xxx");
		input.add("asd");
		input.add("xxy");
		input.add("john doe");
		input.add("xxxAAA");
		input.add("xxx");
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "john"));
	}
}