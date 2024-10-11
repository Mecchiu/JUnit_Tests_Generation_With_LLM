// SortedListSumTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortedListSum}.
* It contains ten unit test cases for the {@link SortedListSum#sortedListSum(List)} method.
*/
class SortedListSumTest {

	@Test
	void testSortedListSum() {
		List<String> lst = List.of("aa", "a", "aaa");
		List<Object> expected = List.of("aa");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortedListSum2() {
		List<String> lst = List.of("ab", "a", "aaa", "cd");
		List<Object> expected = List.of("ab", "cd");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortedListSum3() {
		List<String> lst = List.of("d", "b", "c", "a");
		List<Object> expected = List.of();
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortedListSum4() {
		List<String> lst = List.of("d", "dcba", "abcd", "a");
		List<Object> expected = List.of("abcd", "dcba");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortedListSum5() {
		List<String> lst = List.of("AI", "ai", "au");
		List<Object> expected = List.of("AI", "ai", "au");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortedListSum6() {
		List<String> lst = List.of("a", "b", "b", "c", "c", "a");
		List<Object> expected = List.of();
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortedListSum7() {
		List<String> lst = List.of("aaaa", "bbbb", "dd", "cc");
		List<Object> expected = List.of("cc", "dd", "aaaa", "bbbb");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortedListSum8() {
		List<String> lst = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
		List<Object> expected = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortedListSum9() {
		List<String> lst = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
		List<Object> expected = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortedListSum10() {
		List<String> lst = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
		List<Object> expected = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
}