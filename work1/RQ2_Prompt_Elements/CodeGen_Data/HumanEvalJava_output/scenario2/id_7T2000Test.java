// FilterBySubstringTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterBySubstring}.
* It contains one unit test case for the {@link FilterBySubstring#filterBySubstring(List, String)} method.
*/
class FilterBySubstringTest {
/**
		 * filterBySubstring() method should return an empty {@link List} if given substring does not exist.
		 */
	@Test
	void must_return_empty_list_for_no_substring() {
		ArrayList<String> expected = new ArrayList<String>();
		List<String> actual = FilterBySubstring.filterBySubstring(expected, "no-substring");
		assertNullFails(expected);
		assertSame(expected, actual);
	}

		/**
		 * filterBySubstring() method should return a list with one element for the one given substring.
		 */
	@Test
	void must_return_single_element_for_substring() {
		ArrayList<String> actual = FilterBySubstring.filterBySubstring(new ArrayList<String>(), "substring");
		assertNotNullFails(actual);
		assertSame(1, actual.size());
		assertSame("the string", actual.get(0), "substring");
	}

		/**
		 * filterBySubstring() method should return a empty List for non-existing substring
		 */
	@Test
	void must_return_empty_list_for_non_existing_substring() {
		ArrayList<String> actual = FilterBySubstring.filterBySubstring(new ArrayList<String>(), "no-substring");
		assertSame(0, actual.size());
	}

}