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
			* Test case for {@link SortedListSum#sortedListSum(List)}.
			* It tests the method with the following input:
			* ["aa", "a", "aaa"]
			* The expected output is:
			* ["aa"]
			*/
			@Test
			void test1() {
				List<String> input = new ArrayList<String>();
				input.add("aa");
				input.add("a");
				input.add("aaa");
				List<Object> expected = new ArrayList<Object>();
				expected.add("aa");
				List<Object> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link SortedListSum#sortedListSum(List)}.
			* It tests the method with the following input:
			* ["school", "AI", "asdf", "b"]
			* The expected output is:
			* ["AI", "asdf", "school"]
			*/
			@Test
			void test2() {
				List<String> input = new ArrayList<String>();
				input.add("school");
				input.add("AI");
				input.add("asdf");
				input.add("b");
				List<Object> expected = new ArrayList<Object>();
				expected.add("AI");
				expected.add("asdf");
				expected.add("school");
				List<Object> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link SortedListSum#sortedListSum(List)}.
			* It tests the method with the following input:
			* ["d", "b", "c", "a"]
			* The expected output is:
			* []
			*/
			@Test
			void test3() {
				List<String> input = new ArrayList<String>();
				input.add("d");
				input.add("b");
				input.add("c");
				input.add("a");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link SortedListSum#sortedListSum(List)}.
			* It tests the method with the following input:
			* ["d", "dcba", "abcd", "a"]
			* The expected output is:
			* ["abcd", "dcba"]
			*/
			@Test
			void test4() {
				List<String> input = new ArrayList<String>();
				input.add("d");
				input.add("dcba");
				input.add("abcd");
				input.add("a");
				List<Object> expected = new ArrayList<Object>();
				expected.add("abcd");
				expected.add("dcba");
				List<Object> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link SortedListSum#sortedListSum(List)}.
			* It tests the method with the following input:
			* ["AI", "ai", "au"]
			* The expected output is:
			* ["AI", "ai", "au"]
			*/
			@Test
			void test5() {
				List<String> input = new ArrayList<String>();
				input.add("AI");
				input.add("ai");
				input.add("au");
				List<Object> expected = new ArrayList<Object>();
				expected.add("AI");
				expected.add("ai");
				expected.add("au");
				List<Object> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link SortedListSum#sortedListSum(List)}.
			* It tests the method with the following input:
			* ["a", "b", "b", "c", "c", "a"]
			* The expected output is:
			* []
			*/
			@Test
			void test6() {
				List<String> input = new ArrayList<String>();
				input.add("a");
				input.add("b");
				input.add("b");
				input.add("c");
				input.add("c");
				input.add("a");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link SortedListSum#sortedListSum(List)}.
			* It tests the method with the following input:
			* ["aaaa", "bbbb", "dd", "cc"]
			* The expected output is:
			* ["cc", "dd", "aaaa", "bbbb"]
			*/
			@Test
			void test7() {
				List<String> input = new ArrayList<String>();
				input.add("aaaa");
				input.add("bbbb");
				input.add("dd");
				input.add("cc");
				List<Object> expected = new ArrayList<Object>();
				expected.add("cc");
				expected.add("dd");
				expected.add("aaaa");
				expected.add("bbbb");
				List<Object> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link SortedListSum#sortedListSum(List)}.
			* It tests the method with the following input:
			* ["a", "b", "c", "d", "e", "f"]
			* The expected output is:
			* ["a", "b", "c", "d", "e", "f"]
			*/
			@Test
			void test8() {
				List<String> input = new ArrayList<String>();
				input.add("a");
				input.add("b");
				input.add("c");
				input.add("d");
				input.add("e");
				input.add("f");
				List<Object> expected = new ArrayList<Object>();
				expected.add("a");
				expected.add("b");
				expected.add("c");
				expected.add("d");
				expected.add("e");
				expected.add("f");
				List<Object> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link SortedListSum#sortedListSum(List)}.
			* It tests the method with the following input:
			* ["a", "b", "c", "d", "e", "f", "g"]
			* The expected output is:
			* ["a", "b", "c", "d", "e", "f", "g"]
			*/
			@Test
			void test9() {
				List<String> input = new ArrayList<String>();
				input.add("a");
				input.add("b");
				input.add("c");
				input.add("d");
				input.add("e");
				input.add("f");
				input.add("g");
				List<Object> expected = new ArrayList<Object>();
				expected.add("a");
				expected.add("b");
				expected.add("c");
				expected.add("d");
				expected.add("e");
				expected.add("f");
				expected.add("g");
				List<Object> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link SortedListSum#sortedListSum(List)}.
			* It tests the method with the following input:
			* ["a", "b", "c", "d", "e", "f", "g", "h"]
			* The expected output is:
			* ["a", "b", "c", "d", "e", "f", "g", "h"]
			*/
			@Test
			void test10() {
				List<String> input = new ArrayList<String>();
				input.add("a");
				input.add("b");
				input.add("c");
				input.add("d");
				input.add("e");
				input.add("f");
				input.add("g");
				input.add("h");
				List<Object> expected = new ArrayList<Object>();
				expected.add("a");
				expected.add("b");
				expected.add("c");
				expected.add("d");
				expected.add("e");
				expected.add("f");
				expected.add("g");
				expected.add("h");
				List<Object> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}
}