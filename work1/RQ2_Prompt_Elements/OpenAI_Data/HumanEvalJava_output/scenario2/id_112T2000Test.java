// ReverseDeleteTest.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ReverseDelete}.
* It contains ten unit test cases for the {@link ReverseDelete#reverseDelete(String, String)} method.
*/
class ReverseDeleteTest {
	/**
			* Test case 1
			* Input: s = "abab", c = "ab"
			* Output: ["", true]
			*/
			@Test
			void testCase1() {
				List<Object> expected = Arrays.asList("", true);
				List<Object> actual = ReverseDelete.reverseDelete("abab", "ab");
				assertEquals(expected, actual);
			}

			/**
			* Test case 2
			* Input: s = "abab", c = "a"
			* Output: ["bb", false]
			*/
			@Test
			void testCase2() {
				List<Object> expected = Arrays.asList("bb", false);
				List<Object> actual = ReverseDelete.reverseDelete("abab", "a");
				assertEquals(expected, actual);
			}

			/**
			* Test case 3
			* Input: s = "abab", c = "b"
			* Output: ["aa", false]
			*/
			@Test
			void testCase3() {
				List<Object> expected = Arrays.asList("aa", false);
				List<Object> actual = ReverseDelete.reverseDelete("abab", "b");
				assertEquals(expected, actual);
			}

			/**
			* Test case 4
			* Input: s = "abab", c = "c"
			* Output: ["abab", true]
			*/
			@Test
			void testCase4() {
				List<Object> expected = Arrays.asList("abab", true);
				List<Object> actual = ReverseDelete.reverseDelete("abab", "c");
				assertEquals(expected, actual);
			}

			/**
			* Test case 5
			* Input: s = "abab", c = "abab"
			* Output: ["", true]
			*/
			@Test
			void testCase5() {
				List<Object> expected = Arrays.asList("", true);
				List<Object> actual = ReverseDelete.reverseDelete("abab", "abab");
				assertEquals(expected, actual);
			}

			/**
			* Test case 6
			* Input: s = "abab", c = "ba"
			* Output: ["", true]
			*/
			@Test
			void testCase6() {
				List<Object> expected = Arrays.asList("", true);
				List<Object> actual = ReverseDelete.reverseDelete("abab", "ba");
				assertEquals(expected, actual);
			}

			/**
			* Test case 7
			* Input: s = "abab", c = "abba"
			* Output: ["", true]
			*/
			@Test
			void testCase7() {
				List<Object> expected = Arrays.asList("", true);
				List<Object> actual = ReverseDelete.reverseDelete("abab", "abba");
				assertEquals(expected, actual);
			}

			/**
			* Test case 8
			* Input: s = "abab", c = "baba"
			* Output: ["", true]
			*/
			@Test
			void testCase8() {
				List<Object> expected = Arrays.asList("", true);
				List<Object> actual = ReverseDelete.reverseDelete("abab", "baba");
				assertEquals(expected, actual);
			}

			/**
			* Test case 9
			* Input: s = "abab", c = "ababab"
			* Output: ["", true]
			*/
			@Test
			void testCase9() {
				List<Object> expected = Arrays.asList("", true);
				List<Object> actual = ReverseDelete.reverseDelete("abab", "ababab");
				assertEquals(expected, actual);
			}

			/**
			* Test case 10
			* Input: s = "abab", c = "ababba"
			* Output: ["", true]
			*/
			@Test
			void testCase10() {
				List<Object> expected = Arrays.asList("", true);
				List<Object> actual = ReverseDelete.reverseDelete("abab", "ababba");
				assertEquals(expected, actual);
			}
}
