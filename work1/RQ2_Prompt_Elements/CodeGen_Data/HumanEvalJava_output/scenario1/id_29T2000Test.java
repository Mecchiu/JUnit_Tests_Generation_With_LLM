// FilterByPrefixTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterByPrefix}.
* It contains one unit test case for the {@link FilterByPrefix#filterByPrefix(List, String)} method.
*/
class FilterByPrefixTest {

	/**
	* Filter the string with the prefix.
	* For example if the input string starts with {@code 'aabb'}, the filtered string contains {@code a} and may contain more letters than the original string.
	*/
	@Test
	void filterByPrefix() {
		List<Object> strings = new ArrayList<Object>();
		strings.add("aabb");
		strings.add("aaaabcbb");
		strings.add("aabbca");
		assertEquals(3, filterByPrefix(strings, 'a').size());
	}
		
	/**
	* Filter the string with the prefix.
	* The string is prefixed by {@code prefix}.
	* For example if the input string starts with {@code 'aabb'}, the filtered string contains both {@code 'a} and {@code 'c'}
	*/
	@Test
	void filterByPrefixWithPrefix() {
		List<Object> strings = new ArrayList<Object>();
		strings.add("aa");
		strings.add("aabbca");
		strings.add("aaabbcba");
		strings.add("aabbccba");
		assertEquals(2, filterByPrefix(strings, "a").size());
	}
		
	/**
	* Filter the string and create a filtered list with all possible chars which match the given prefix.
	* For example if it starts with {@code 'abb'}, the filtered string looks like : {@code abbbabbabbabbbbabbabbcbaabb}
	*/
	@Test
	void filterByTest() {
		List<Object> strings = new ArrayList<Object>();
		strings.add("abb");
		strings.add("aabbca");
		
		List<Object> result = filterByPrefix(strings, "a");
		assertEquals(2, result.size());
		
		assertTrue(result.toString().startsWith("aaaabbbbbbabbac"));
	}

}
