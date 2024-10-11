// SortedListSumTest.java
package scenario2;

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
			* Test case for the {@link SortedListSum#sortedListSum(List)} method.
			* It checks if the method returns an empty list when the input list is empty.
			*/
			@Test
			void testEmptyList() {
				List<String> input = new ArrayList<>();
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortedListSum#sortedListSum(List)} method.
			* It checks if the method returns an empty list when the input list contains only odd length strings.
			*/
			@Test
			void testOnlyOddLengthStrings() {
				List<String> input = new ArrayList<>();
				input.add("abc");
				input.add("def");
				input.add("ghi");
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortedListSum#sortedListSum(List)} method.
			* It checks if the method returns the same list when the input list contains only even length strings.
			*/
			@Test
			void testOnlyEvenLengthStrings() {
				List<String> input = new ArrayList<>();
				input.add("abcd");
				input.add("efgh");
				input.add("ijkl");
				List<Object> expected = new ArrayList<>();
				expected.add("abcd");
				expected.add("efgh");
				expected.add("ijkl");
				List<Object> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortedListSum#sortedListSum(List)} method.
			* It checks if the method returns the same list when the input list contains only one string.
			*/
			@Test
			void testOneString() {
				List<String> input = new ArrayList<>();
				input.add("abcd");
				List<Object> expected = new ArrayList<>();
				expected.add("abcd");
				List<Object> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortedListSum#sortedListSum(List)} method.
			* It checks if the method returns the same list when the input list contains only two strings with the same length.
			*/
			@Test
			void testTwoStringsSameLength() {
				List<String> input = new ArrayList<>();
				input.add("abcd");
				input.add("efgh");
				List<Object> expected = new ArrayList<>();
				expected.add("abcd");
				expected.add("efgh");
				List<Object> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortedListSum#sortedListSum(List)} method.
			* It checks if the method returns the same list when the input list contains only two strings with different lengths.
			*/
			@Test
			void testTwoStringsDifferentLengths() {
				List<String> input = new ArrayList<>();
				input.add("abcd");
				input.add("efghi");
				List<Object> expected = new ArrayList<>();
				expected.add("abcd");
				expected.add("efghi");
				List<Object> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortedListSum#sortedListSum(List)} method.
			* It checks if the method returns the same list when the input list contains only three strings with the same length.
			*/
			@Test
			void testThreeStringsSameLength() {
				List<String> input = new ArrayList<>();
				input.add("abcd");
				input.add("efgh");
				input.add("ijkl");
				List<Object> expected = new ArrayList<>();
				expected.add("abcd");
				expected.add("efgh");
				expected.add("ijkl");
				List<Object> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortedListSum#sortedListSum(List)} method.
			* It checks if the method returns the same list when the input list contains only three strings with different lengths.
			*/
			@Test
			void testThreeStringsDifferentLengths() {
				List<String> input = new ArrayList<>();
				input.add("abcd");
				input.add("efghi");
				input.add("jklmno");
				List<Object> expected = new ArrayList<>();
				expected.add("abcd");
				expected.add("efghi");
				expected.add("jklmno");
				List<Object> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortedListSum#sortedListSum(List)} method.
			* It checks if the method returns the same list when the input list contains only four strings with the same length.
			*/
			@Test
			void testFourStringsSameLength() {
				List<String> input = new ArrayList<>();
				input.add("abcd");
				input.add("efgh");
				input.add("ijkl");
				input.add("mnop");
				List<Object> expected = new ArrayList<>();
				expected.add("abcd");
				expected.add("efgh");
				expected.add("ijkl");
				expected.add("mnop");
				List<Object> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SortedListSum#sortedListSum(List)} method.
			* It checks if the method returns the same list when the input list contains only four strings with different lengths.
			*/
			@Test
			void testFourStringsDifferentLengths() {
				List<String> input = new ArrayList<>();
				input.add("abcd");
				input.add("efghi");
				input.add("jklmno");
				input.add("pqrstuv");
				List<Object> expected = new ArrayList<>();
				expected.add("abcd");
				expected.add("efghi");
				expected.add("jklmno");
				expected.add("pqrstuv");
				List<Object> actual = SortedListSum.sortedListSum(input);
				assertEquals(expected, actual);
			}
		}