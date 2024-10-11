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
	/**
			* Test case for the {@link SortedListSum#sortedListSum(List)} method.
			* It tests the method with the following input:
			* Input: ["aa", "a", "aaa"]
			* Expected Output: ["aa"]
			*/
			@Test
			void test1() {
				List<String> input = List.of("aa", "a", "aaa");
				List<String> expected = List.of("aa");
				List<String> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortedListSum#sortedListSum(List)} method.
			* It tests the method with the following input:
			* Input: ["school", "AI", "asdf", "b"]
			* Expected Output: ["AI", "asdf", "school"]
			*/
			@Test
			void test2() {
				List<String> input = List.of("school", "AI", "asdf", "b");
				List<String> expected = List.of("AI", "asdf", "school");
				List<String> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortedListSum#sortedListSum(List)} method.
			* It tests the method with the following input:
			* Input: ["d", "b", "c", "a"]
			* Expected Output: []
			*/
			@Test
			void test3() {
				List<String> input = List.of("d", "b", "c", "a");
				List<String> expected = List.of();
				List<String> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortedListSum#sortedListSum(List)} method.
			* It tests the method with the following input:
			* Input: ["d", "dcba", "abcd", "a"]
			* Expected Output: ["abcd", "dcba"]
			*/
			@Test
			void test4() {
				List<String> input = List.of("d", "dcba", "abcd", "a");
				List<String> expected = List.of("abcd", "dcba");
				List<String> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortedListSum#sortedListSum(List)} method.
			* It tests the method with the following input:
			* Input: ["AI", "ai", "au"]
			* Expected Output: ["AI", "ai", "au"]
			*/
			@Test
			void test5() {
				List<String> input = List.of("AI", "ai", "au");
				List<String> expected = List.of("AI", "ai", "au");
				List<String> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortedListSum#sortedListSum(List)} method.
			* It tests the method with the following input:
			* Input: ["a", "b", "b", "c", "c", "a"]
			* Expected Output: []
			*/
			@Test
			void test6() {
				List<String> input = List.of("a", "b", "b", "c", "c", "a");
				List<String> expected = List.of();
				List<String> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortedListSum#sortedListSum(List)} method.
			* It tests the method with the following input:
			* Input: ["aaaa", "bbbb", "dd", "cc"]
			* Expected Output: ["cc", "dd", "aaaa", "bbbb"]
			*/
			@Test
			void test7() {
				List<String> input = List.of("aaaa", "bbbb", "dd", "cc");
				List<String> expected = List.of("cc", "dd", "aaaa", "bbbb");
				List<String> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortedListSum#sortedListSum(List)} method.
			* It tests the method with the following input:
			* Input: ["a", "b", "c", "d", "e", "f", "g", "h"]
			* Expected Output: ["a", "b", "c", "d", "e", "f", "g", "h"]
			*/
			@Test
			void test8() {
				List<String> input = List.of("a", "b", "c", "d", "e", "f", "g", "h");
				List<String> expected = List.of("a", "b", "c", "d", "e", "f", "g", "h");
				List<String> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortedListSum#sortedListSum(List)} method.
			* It tests the method with the following input:
			* Input: ["a", "b", "c", "d", "e", "f", "g", "h"]
			* Expected Output: ["a", "b", "c", "d", "e", "f", "g", "h"]
			*/
			@Test
			void test9() {
				List<String> input = List.of("a", "b", "c", "d", "e", "f", "g", "h");
				List<String> expected = List.of("a", "b", "c", "d", "e", "f", "g", "h");
				List<String> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortedListSum#sortedListSum(List)} method.
			* It tests the method with the following input:
			* Input: ["a", "b", "c", "d", "e", "f", "g", "h"]
			* Expected Output: ["a", "b", "c", "d", "e", "f", "g", "h"]
			*/
			@Test
			void test10() {
				List<String> input = List.of("a", "b", "c", "d", "e", "f", "g", "h");
				List<String> expected = List.of("a", "b", "c", "d", "e", "f", "g", "h");
				List<String> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}
}
