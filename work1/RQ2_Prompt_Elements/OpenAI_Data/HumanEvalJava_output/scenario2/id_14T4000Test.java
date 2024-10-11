// AllPrefixesTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AllPrefixes}.
* It contains ten unit test cases for the {@link AllPrefixes#allPrefixes(String)} method.
*/
class AllPrefixesTest {

	/**
	 * Test case for {@link AllPrefixes#allPrefixes(String)} method.
	 * It tests the case when the input string is empty.
	 */
	@Test
	void testAllPrefixes_EmptyString() {
		String input = "";
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = AllPrefixes.allPrefixes(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link AllPrefixes#allPrefixes(String)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testAllPrefixes_SingleCharacter() {
		String input = "a";
		List<Object> expected = new ArrayList<Object>();
		expected.add("a");
		List<Object> actual = AllPrefixes.allPrefixes(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link AllPrefixes#allPrefixes(String)} method.
	 * It tests the case when the input string is a single word.
	 */
	@Test
	void testAllPrefixes_SingleWord() {
		String input = "hello";
		List<Object> expected = new ArrayList<Object>();
		expected.add("h");
		expected.add("he");
		expected.add("hel");
		expected.add("hell");
		expected.add("hello");
		List<Object> actual = AllPrefixes.allPrefixes(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link AllPrefixes#allPrefixes(String)} method.
	 * It tests the case when the input string is a single word with a space.
	 */
	@Test
	void testAllPrefixes_SingleWordWithSpace() {
		String input = "hello ";
		List<Object> expected = new ArrayList<Object>();
		expected.add("h");
		expected.add("he");
		expected.add("hel");
		expected.add("hell");
		expected.add("hello");
		expected.add("hello ");
		List<Object> actual = AllPrefixes.allPrefixes(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link AllPrefixes#allPrefixes(String)} method.
	 * It tests the case when the input string is a single word with a space at the end.
	 */
	@Test
	void testAllPrefixes_SingleWordWithSpaceAtEnd() {
		String input = "hello";
		List<Object> expected = new ArrayList<Object>();
		expected.add("h");
		expected.add("he");
		expected.add("hel");
		expected.add("hell");
		expected.add("hello");
		List<Object> actual = AllPrefixes.allPrefixes(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link AllPrefixes#allPrefixes(String)} method.
	 * It tests the case when the input string is a single word with a space at the beginning.
	 */
	@Test
	void testAllPrefixes_SingleWordWithSpaceAtBeginning() {
		String input = " hello";
		List<Object> expected = new ArrayList<Object>();
		expected.add(" ");
		expected.add(" h");
		expected.add(" he");
		expected.add(" hel");
		expected.add(" hell");
		expected.add(" hello");
		List<Object> actual = AllPrefixes.allPrefixes(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link AllPrefixes#allPrefixes(String)} method.
	 * It tests the case when the input string is a single word with a space at the beginning and end.
	 */
	@Test
	void testAllPrefixes_SingleWordWithSpaceAtBeginningAndEnd() {
		String input = " hello ";
		List<Object> expected = new ArrayList<Object>();
		expected.add(" ");
		expected.add(" h");
		expected.add(" he");
		expected.add(" hel");
		expected.add(" hell");
		expected.add(" hello");
		expected.add(" hello ");
		List<Object> actual = AllPrefixes.allPrefixes(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link AllPrefixes#allPrefixes(String)} method.
	 * It tests the case when the input string is a single word with a space at the beginning and end.
	 */
	@Test
	void testAllPrefixes_MultipleWords() {
		String input = "hello world";
		List<Object> expected = new ArrayList<Object>();
		expected.add("h");
		expected.add("he");
		expected.add("hel");
		expected.add("hell");
		expected.add("hello");
		expected.add("hello ");
		expected.add("hello w");
		expected.add("hello wo");
		expected.add("hello wor");
		expected.add("hello worl");
		expected.add("hello world");
		List<Object> actual = AllPrefixes.allPrefixes(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link AllPrefixes#allPrefixes(String)} method.
	 * It tests the case when the input string is a single word with a space at the beginning and end.
	 */
	@Test
	void testAllPrefixes_MultipleWordsWithSpaceAtBeginning() {
		String input = " hello world";
		List<Object> expected = new ArrayList<Object>();
		expected.add(" ");
		expected.add(" h");
		expected.add(" he");
		expected.add(" hel");
		expected.add(" hell");
		expected.add(" hello");
		expected.add(" hello ");
		expected.add(" hello w");
		expected.add(" hello wo");
		expected.add(" hello wor");
		expected.add(" hello worl");
		expected.add(" hello world");
		List<Object> actual = AllPrefixes.allPrefixes(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link AllPrefixes#allPrefixes(String)} method.
	 * It tests the case when the input string is a single word with a space at the beginning and end.
	 */
	@Test
	void testAllPrefixes_MultipleWordsWithSpaceAtEnd() {
		String input = "hello world ";
		List<Object> expected = new ArrayList<Object>();
		expected.add("h");
		expected.add("he");
		expected.add("hel");
		expected.add("hell");
		expected.add("hello");
		expected.add("hello ");
		expected.add("hello w");
		expected.add("hello wo");
		expected.add("hello wor");
		expected.add("hello worl");
		expected.add("hello world");
		expected.add("hello world ");
		List<Object> actual = AllPrefixes.allPrefixes(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link AllPrefixes#allPrefixes(String)} method.
	 * It tests the case when the input string is a single word with a space at the beginning and end.
	 */
	@Test
	void testAllPrefixes_MultipleWordsWithSpaceAtBeginningAndEnd() {
		String input = " hello world ";
		List<Object> expected = new ArrayList<Object>();
		expected.add(" ");
		expected.add(" h");
		expected.add(" he");
		expected.add(" hel");
		expected.add(" hell");
		expected.add(" hello");
		expected.add(" hello ");
		expected.add(" hello w");
		expected.add(" hello wo");
		expected.add(" hello wor");
		expected.add(" hello worl");
		expected.add(" hello world");
		expected.add(" hello world ");
		List<Object> actual = AllPrefixes.allPrefixes(input);
		assertEquals(expected, actual);
	}
}