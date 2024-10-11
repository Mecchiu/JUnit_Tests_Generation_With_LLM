// AllPrefixesTest.java
package scenario1;

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
	* Test case 1.
	* The input string is empty.
	* The expected result is an empty list.
	*/
	@Test
	void test1() {
		String string = "";
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = AllPrefixes.allPrefixes(string);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input string is "a".
	* The expected result is a list containing "a".
	*/
	@Test
	void test2() {
		String string = "a";
		List<Object> expected = new ArrayList<Object>();
		expected.add("a");
		List<Object> actual = AllPrefixes.allPrefixes(string);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input string is "ab".
	* The expected result is a list containing "a" and "ab".
	*/
	@Test
	void test3() {
		String string = "ab";
		List<Object> expected = new ArrayList<Object>();
		expected.add("a");
		expected.add("ab");
		List<Object> actual = AllPrefixes.allPrefixes(string);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input string is "abc".
	* The expected result is a list containing "a", "ab" and "abc".
	*/
	@Test
	void test4() {
		String string = "abc";
		List<Object> expected = new ArrayList<Object>();
		expected.add("a");
		expected.add("ab");
		expected.add("abc");
		List<Object> actual = AllPrefixes.allPrefixes(string);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input string is "abcd".
	* The expected result is a list containing "a", "ab", "abc" and "abcd".
	*/
	@Test
	void test5() {
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
	* Test case 6.
	* The input string is "abcde".
	* The expected result is a list containing "a", "ab", "abc", "abcd" and "abcde".
	*/
	@Test
	void test6() {
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
	* Test case 7.
	* The input string is "abcdef".
	* The expected result is a list containing "a", "ab", "abc", "abcd", "abcde" and "abcdef".
	*/
	@Test
	void test7() {
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
	* Test case 8.
	* The input string is "abcdefg".
	* The expected result is a list containing "a", "ab", "abc", "abcd", "abcde", "abcdef" and "abcdefg".
	*/
	@Test
	void test8() {
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
	* Test case 9.
	* The input string is "abcdefgh".
	* The expected result is a list containing "a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg" and "abcdefgh".
	*/
	@Test
	void test9() {
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
	* Test case 10.
	* The input string is "abcdefghi".
	* The expected result is a list containing "a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh" and "abcdefghi".
	*/
	@Test
	void test10() {
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