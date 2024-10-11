// AllPrefixesTest.java
package original;

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
	* It tests the method with a string of length 0.
	*/
	@Test
	void testAllPrefixes_0() {
		String string = "";
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = AllPrefixes.allPrefixes(string);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link AllPrefixes#allPrefixes(String)} method.
	* It tests the method with a string of length 1.
	*/
	@Test
	void testAllPrefixes_1() {
		String string = "a";
		List<Object> expected = new ArrayList<Object>();
		expected.add("a");
		List<Object> actual = AllPrefixes.allPrefixes(string);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link AllPrefixes#allPrefixes(String)} method.
	* It tests the method with a string of length 2.
	*/
	@Test
	void testAllPrefixes_2() {
		String string = "ab";
		List<Object> expected = new ArrayList<Object>();
		expected.add("a");
		expected.add("ab");
		List<Object> actual = AllPrefixes.allPrefixes(string);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link AllPrefixes#allPrefixes(String)} method.
	* It tests the method with a string of length 3.
	*/
	@Test
	void testAllPrefixes_3() {
		String string = "abc";
		List<Object> expected = new ArrayList<Object>();
		expected.add("a");
		expected.add("ab");
		expected.add("abc");
		List<Object> actual = AllPrefixes.allPrefixes(string);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link AllPrefixes#allPrefixes(String)} method.
	* It tests the method with a string of length 4.
	*/
	@Test
	void testAllPrefixes_4() {
		String string = "abcd";
		List<Object> expected = new ArrayList<Object>();
		expected.add("a");
		expected.add("ab");
		expected.add("abc");
		expected.add("abcd");
		List<Object> actual = AllPrefixes.allPrefixes(string);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link AllPrefixes#allPrefixes(String)} method.
	* It tests the method with a string of length 5.
	*/
	@Test
	void testAllPrefixes_5() {
		String string = "abcde";
		List<Object> expected = new ArrayList<Object>();
		expected.add("a");
		expected.add("ab");
		expected.add("abc");
		expected.add("abcd");
		expected.add("abcde");
		List<Object> actual = AllPrefixes.allPrefixes(string);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link AllPrefixes#allPrefixes(String)} method.
	* It tests the method with a string of length 6.
	*/
	@Test
	void testAllPrefixes_6() {
		String string = "abcdef";
		List<Object> expected = new ArrayList<Object>();
		expected.add("a");
		expected.add("ab");
		expected.add("abc");
		expected.add("abcd");
		expected.add("abcde");
		expected.add("abcdef");
		List<Object> actual = AllPrefixes.allPrefixes(string);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link AllPrefixes#allPrefixes(String)} method.
	* It tests the method with a string of length 7.
	*/
	@Test
	void testAllPrefixes_7() {
		String string = "abcdefg";
		List<Object> expected = new ArrayList<Object>();
		expected.add("a");
		expected.add("ab");
		expected.add("abc");
		expected.add("abcd");
		expected.add("abcde");
		expected.add("abcdef");
		expected.add("abcdefg");
		List<Object> actual = AllPrefixes.allPrefixes(string);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link AllPrefixes#allPrefixes(String)} method.
	* It tests the method with a string of length 8.
	*/
	@Test
	void testAllPrefixes_8() {
		String string = "abcdefgh";
		List<Object> expected = new ArrayList<Object>();
		expected.add("a");
		expected.add("ab");
		expected.add("abc");
		expected.add("abcd");
		expected.add("abcde");
		expected.add("abcdef");
		expected.add("abcdefg");
		expected.add("abcdefgh");
		List<Object> actual = AllPrefixes.allPrefixes(string);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link AllPrefixes#allPrefixes(String)} method.
	* It tests the method with a string of length 9.
	*/
	@Test
	void testAllPrefixes_9() {
		String string = "abcdefghi";
		List<Object> expected = new ArrayList<Object>();
		expected.add("a");
		expected.add("ab");
		expected.add("abc");
		expected.add("abcd");
		expected.add("abcde");
		expected.add("abcdef");
		expected.add("abcdefg");
		expected.add("abcdefgh");
		expected.add("abcdefghi");
		List<Object> actual = AllPrefixes.allPrefixes(string);
		assertEquals(expected, actual);
	}
	
}