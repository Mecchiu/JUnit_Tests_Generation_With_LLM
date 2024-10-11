// SortedListSumTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortedListSum}.
* It contains ten unit test cases for the {@link SortedListSum#sortedListSum(List)} method.
*/
class SortedListSumTest {

	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* It tests the method with a list of strings that have odd lengths.
	* The expected result is an empty list.
	*/
	@Test
	void testSortedListSum_oddLengths() {
		List<String> lst = new ArrayList<String>();
		lst.add("d");
		lst.add("b");
		lst.add("c");
		lst.add("a");
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* It tests the method with a list of strings that have even lengths.
	* The expected result is a list of strings sorted by length and alphabetically.
	*/
	@Test
	void testSortedListSum_evenLengths() {
		List<String> lst = new ArrayList<String>();
		lst.add("school");
		lst.add("AI");
		lst.add("asdf");
		lst.add("b");
		List<Object> expected = new ArrayList<Object>();
		expected.add("AI");
		expected.add("asdf");
		expected.add("school");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* It tests the method with a list of strings that have even lengths.
	* The expected result is a list of strings sorted by length and alphabetically.
	*/
	@Test
	void testSortedListSum_evenLengths2() {
		List<String> lst = new ArrayList<String>();
		lst.add("d");
		lst.add("dcba");
		lst.add("abcd");
		lst.add("a");
		List<Object> expected = new ArrayList<Object>();
		expected.add("abcd");
		expected.add("dcba");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* It tests the method with a list of strings that have even lengths.
	* The expected result is a list of strings sorted by length and alphabetically.
	*/
	@Test
	void testSortedListSum_evenLengths3() {
		List<String> lst = new ArrayList<String>();
		lst.add("AI");
		lst.add("ai");
		lst.add("au");
		List<Object> expected = new ArrayList<Object>();
		expected.add("AI");
		expected.add("ai");
		expected.add("au");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* It tests the method with a list of strings that have even lengths.
	* The expected result is a list of strings sorted by length and alphabetically.
	*/
	@Test
	void testSortedListSum_evenLengths4() {
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("b");
		lst.add("b");
		lst.add("c");
		lst.add("c");
		lst.add("a");
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* It tests the method with a list of strings that have even lengths.
	* The expected result is a list of strings sorted by length and alphabetically.
	*/
	@Test
	void testSortedListSum_evenLengths5() {
		List<String> lst = new ArrayList<String>();
		lst.add("aaaa");
		lst.add("bbbb");
		lst.add("dd");
		lst.add("cc");
		List<Object> expected = new ArrayList<Object>();
		expected.add("cc");
		expected.add("dd");
		expected.add("aaaa");
		expected.add("bbbb");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* It tests the method with a list of strings that have even lengths.
	* The expected result is a list of strings sorted by length and alphabetically.
	*/
	@Test
	void testSortedListSum_evenLengths6() {
		List<String> lst = new ArrayList<String>();
		lst.add("aa");
		lst.add("a");
		lst.add("aaa");
		List<Object> expected = new ArrayList<Object>();
		expected.add("aa");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* It tests the method with a list of strings that have even lengths.
	* The expected result is a list of strings sorted by length and alphabetically.
	*/
	@Test
	void testSortedListSum_evenLengths7() {
		List<String> lst = new ArrayList<String>();
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		List<Object> expected = new ArrayList<Object>();
		expected.add("ab");
		expected.add("cd");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* It tests the method with a list of strings that have even lengths.
	* The expected result is a list of strings sorted by length and alphabetically.
	*/
	@Test
	void testSortedListSum_evenLengths8() {
		List<String> lst = new ArrayList<String>();
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		List<Object> expected = new ArrayList<Object>();
		expected.add("ab");
		expected.add("ab");
		expected.add("cd");
		expected.add("cd");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* It tests the method with a list of strings that have even lengths.
	* The expected result is a list of strings sorted by length and alphabetically.
	*/
	@Test
	void testSortedListSum_evenLengths9() {
		List<String> lst = new ArrayList<String>();
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		List<Object> expected = new ArrayList<Object>();
		expected.add("ab");
		expected.add("ab");
		expected.add("ab");
		expected.add("ab");
		expected.add("cd");
		expected.add("cd");
		expected.add("cd");
		expected.add("cd");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* It tests the method with a list of strings that have even lengths.
	* The expected result is a list of strings sorted by length and alphabetically.
	*/
	@Test
	void testSortedListSum_evenLengths10() {
		List<String> lst = new ArrayList<String>();
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("