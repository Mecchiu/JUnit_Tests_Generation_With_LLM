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

	/**
	* Test case 1 for {@link FilterBySubstring#filterBySubstring(List, String)}.
	* It tests the method with a list of strings and a substring that is contained in all strings.
	* The expected result is a list of strings that contains all strings of the input list.
	*/
	@Test
	void testFilterBySubstring1() {
		List<Object> strings = new ArrayList<Object>();
		strings.add("Hello");
		strings.add("World");
		strings.add("!");
		List<Object> expected = new ArrayList<Object>();
		expected.add("Hello");
		expected.add("World");
		expected.add("!");
		List<Object> actual = FilterBySubstring.filterBySubstring(strings, "o");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link FilterBySubstring#filterBySubstring(List, String)}.
	* It tests the method with a list of strings and a substring that is contained in no string.
	* The expected result is an empty list.
	*/
	@Test
	void testFilterBySubstring2() {
		List<Object> strings = new ArrayList<Object>();
		strings.add("Hello");
		strings.add("World");
		strings.add("!");
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = FilterBySubstring.filterBySubstring(strings, "x");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link FilterBySubstring#filterBySubstring(List, String)}.
	* It tests the method with a list of strings and a substring that is contained in some strings.
	* The expected result is a list of strings that contains only the strings of the input list that contain the substring.
	*/
	@Test
	void testFilterBySubstring3() {
		List<Object> strings = new ArrayList<Object>();
		strings.add("Hello");
		strings.add("World");
		strings.add("!");
		List<Object> expected = new ArrayList<Object>();
		expected.add("Hello");
		expected.add("World");
		List<Object> actual = FilterBySubstring.filterBySubstring(strings, "l");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link FilterBySubstring#filterBySubstring(List, String)}.
	* It tests the method with a list of strings and a substring that is contained in some strings.
	* The expected result is a list of strings that contains only the strings of the input list that contain the substring.
	*/
	@Test
	void testFilterBySubstring4() {
		List<Object> strings = new ArrayList<Object>();
		strings.add("Hello");
		strings.add("World");
		strings.add("!");
		List<Object> expected = new ArrayList<Object>();
		expected.add("Hello");
		expected.add("World");
		List<Object> actual = FilterBySubstring.filterBySubstring(strings, "W");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link FilterBySubstring#filterBySubstring(List, String)}.
	* It tests the method with a list of strings and a substring that is contained in some strings.
	* The expected result is a list of strings that contains only the strings of the input list that contain the substring.
	*/
	@Test
	void testFilterBySubstring5() {
		List<Object> strings = new ArrayList<Object>();
		strings.add("Hello");
		strings.add("World");
		strings.add("!");
		List<Object> expected = new ArrayList<Object>();
		expected.add("Hello");
		expected.add("World");
		List<Object> actual = FilterBySubstring.filterBySubstring(strings, "o");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link FilterBySubstring#filterBySubstring(List, String)}.
	* It tests the method with a list of strings and a substring that is contained in some strings.
	* The expected result is a list of strings that contains only the strings of the input list that contain the substring.
	*/
	@Test
	void testFilterBySubstring6() {
		List<Object> strings = new ArrayList<Object>();
		strings.add("Hello");
		strings.add("World");
		strings.add("!");
		List<Object> expected = new ArrayList<Object>();
		expected.add("Hello");
		expected.add("World");
		List<Object> actual = FilterBySubstring.filterBySubstring(strings, "r");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link FilterBySubstring#filterBySubstring(List, String)}.
	* It tests the method with a list of strings and a substring that is contained in some strings.
	* The expected result is a list of strings that contains only the strings of the input list that contain the substring.
	*/
	@Test
	void testFilterBySubstring7() {
		List<Object> strings = new ArrayList<Object>();
		strings.add("Hello");
		strings.add("World");
		strings.add("!");
		List<Object> expected = new ArrayList<Object>();
		expected.add("Hello");
		expected.add("World");
		List<Object> actual = FilterBySubstring.filterBySubstring(strings, "d");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link FilterBySubstring#filterBySubstring(List, String)}.
	* It tests the method with a list of strings and a substring that is contained in some strings.
	* The expected result is a list of strings that contains only the strings of the input list that contain the substring.
	*/
	@Test
	void testFilterBySubstring8() {
		List<Object> strings = new ArrayList<Object>();
		strings.add("Hello");
		strings.add("World");
		strings.add("!");
		List<Object> expected = new ArrayList<Object>();
		expected.add("Hello");
		expected.add("World");
		List<Object> actual = FilterBySubstring.filterBySubstring(strings, "l");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link FilterBySubstring#filterBySubstring(List, String)}.
	* It tests the method with a list of strings and a substring that is contained in some strings.
	* The expected result is a list of strings that contains only the strings of the input list that contain the substring.
	*/
	@Test
	void testFilterBySubstring9() {
		List<Object> strings = new ArrayList<Object>();
		strings.add("Hello");
		strings.add("World");
		strings.add("!");
		List<Object> expected = new ArrayList<Object>();
		expected.add("Hello");
		expected.add("World");
		List<Object> actual = FilterBySubstring.filterBySubstring(strings, "e");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link FilterBySubstring#filterBySubstring(List, String)}.
	* It tests the method with a list of strings and a substring that is contained in some strings.
	* The expected result is a list of strings that contains only the strings of the input list that contain the substring.
	*/
	@Test
	void testFilterBySubstring10() {
		List<Object> strings = new ArrayList<Object>();
		strings.add("Hello");
		strings.add("World");
		strings.add("!");
		List<Object> expected = new ArrayList<Object>();
		expected.add("Hello");
		expected.add("World");
		List<Object> actual = FilterBySubstring.filterBySubstring(strings, "H");
		assertEquals(expected, actual);
	}
}