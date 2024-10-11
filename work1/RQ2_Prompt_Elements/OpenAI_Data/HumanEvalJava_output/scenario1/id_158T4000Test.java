// FindMaxTest.java
package scenario1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindMax}.
* It contains ten unit test cases for the {@link FindMax#findMax(List)} method.
*/
class FindMaxTest {

		/**
		* Test case 1.
		* The input is a list of words.
		* The expected output is the word with the maximum number of unique characters.
		* If there are multiple words with the same number of unique characters,
		* the word with the lowest lexicographical order should be returned.
		*/
		@Test
		void testFindMax1() {
				List<String> words = List.of("abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz");
				String expected = "abc";
				String actual = FindMax.findMax(words);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The input is a list of words.
		* The expected output is the word with the maximum number of unique characters.
		* If there are multiple words with the same number of unique characters,
		* the word with the lowest lexicographical order should be returned.
		*/
		@Test
		void testFindMax2() {
				List<String> words = List.of("abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz", "abc");
				String expected = "abc";
				String actual = FindMax.findMax(words);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The input is a list of words.
		* The expected output is the word with the maximum number of unique characters.
		* If there are multiple words with the same number of unique characters,
		* the word with the lowest lexicographical order should be returned.
		*/
		@Test
		void testFindMax3() {
				List<String> words = List.of("abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz", "abc", "def");
				String expected = "abc";
				String actual = FindMax.findMax(words);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The input is a list of words.
		* The expected output is the word with the maximum number of unique characters.
		* If there are multiple words with the same number of unique characters,
		* the word with the lowest lexicographical order should be returned.
		*/
		@Test
		void testFindMax4() {
				List<String> words = List.of("abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz", "abc", "def", "ghi");
				String expected = "abc";
				String actual = FindMax.findMax(words);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The input is a list of words.
		* The expected output is the word with the maximum number of unique characters.
		* If there are multiple words with the same number of unique characters,
		* the word with the lowest lexicographical order should be returned.
		*/
		@Test
		void testFindMax5() {
				List<String> words = List.of("abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz", "abc", "def", "ghi", "jkl");
				String expected = "abc";
				String actual = FindMax.findMax(words);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The input is a list of words.
		* The expected output is the word with the maximum number of unique characters.
		* If there are multiple words with the same number of unique characters,
		* the word with the lowest lexicographical order should be returned.
		*/
		@Test
		void testFindMax6() {
				List<String> words = List.of("abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz", "abc", "def", "ghi", "jkl", "mno");
				String expected = "abc";
				String actual = FindMax.findMax(words);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The input is a list of words.
		* The expected output is the word with the maximum number of unique characters.
		* If there are multiple words with the same number of unique characters,
		* the word with the lowest lexicographical order should be returned.
		*/
		@Test
		void testFindMax7() {
				List<String> words = List.of("abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz", "abc", "def", "ghi", "jkl", "mno", "pqr");
				String expected = "abc";
				String actual = FindMax.findMax(words);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The input is a list of words.
		* The expected output is the word with the maximum number of unique characters.
		* If there are multiple words with the same number of unique characters,
		* the word with the lowest lexicographical order should be returned.
		*/
		@Test
		void testFindMax8() {
				List<String> words = List.of("abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu");
				String expected = "abc";
				String actual = FindMax.findMax(words);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The input is a list of words.
		* The expected output is the word with the maximum number of unique characters.
		* If there are multiple words with the same number of unique characters,
		* the word with the lowest lexicographical order should be returned.
		*/
		@Test
		void testFindMax9() {
				List<String> words = List.of("abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx");
				String expected = "abc";
				String actual = FindMax.findMax(words);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The input is a list of words.
		* The expected output is the word with the maximum number of unique characters.
		* If there are multiple words with the same number of unique characters,
		* the word with the lowest lexicographical order should be returned.
		*/
		@Test
		void testFindMax10() {
				List<String> words = List.of("abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz");
				String expected = "abc";
				String actual = FindMax.findMax(words);
				assertEquals(expected, actual);
		}
}