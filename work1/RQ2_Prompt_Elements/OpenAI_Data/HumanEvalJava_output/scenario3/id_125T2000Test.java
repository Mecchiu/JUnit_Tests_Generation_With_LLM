// SplitWordsTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains ten unit test cases for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {
	/**
			* Test case for the scenario when the input string contains whitespaces.
			*/
			@Test
			void testSplitWordsWithWhitespaces() {
						String input = "Hello world!";
						String[] expected = {"Hello", "world!"};
						assertArrayEquals(expected, (String[]) SplitWords.splitWords(input));
			}

			/**
			* Test case for the scenario when the input string contains whitespaces and commas.
			*/
			@Test
			void testSplitWordsWithWhitespacesAndCommas() {
						String input = "Hello,world!";
						String[] expected = {"Hello", "world!"};
						assertArrayEquals(expected, (String[]) SplitWords.splitWords(input));
			}

			/**
			* Test case for the scenario when the input string contains whitespaces, commas and exclamation mark.
			*/
			@Test
			void testSplitWordsWithWhitespacesCommasAndExclamationMark() {
						String input = "Hello world,!";
						String[] expected = {"Hello", "world", "!"};
						assertArrayEquals(expected, (String[]) SplitWords.splitWords(input));
			}

			/**
			* Test case for the scenario when the input string contains whitespaces, commas and exclamation mark.
			*/
			@Test
			void testSplitWordsWithWhitespacesCommasAndExclamationMark2() {
						String input = "Hello,Hello,world !";
						String[] expected = {"Hello,Hello,world", "!"};
						assertArrayEquals(expected, (String[]) SplitWords.splitWords(input));
			}

			/**
			* Test case for the scenario when the input string contains only lowercase letters.
			*/
			@Test
			void testSplitWordsWithOnlyLowercaseLetters() {
						String input = "abcdef";
						int expected = 3;
						assertEquals(expected, SplitWords.splitWords(input));
			}

			/**
			* Test case for the scenario when the input string contains only lowercase letters.
			*/
			@Test
			void testSplitWordsWithOnlyLowercaseLetters2() {
						String input = "aaabb";
						int expected = 2;
						assertEquals(expected, SplitWords.splitWords(input));
			}

			/**
			* Test case for the scenario when the input string contains both lowercase and uppercase letters.
			*/
			@Test
			void testSplitWordsWithLowercaseAndUppercaseLetters() {
						String input = "aaaBb";
						int expected = 1;
						assertEquals(expected, SplitWords.splitWords(input));
			}

			/**
			* Test case for the scenario when the input string is empty.
			*/
			@Test
			void testSplitWordsWithEmptyString() {
						String input = "";
						int expected = 0;
						assertEquals(expected, SplitWords.splitWords(input));
			}

			/**
			* Test case for the scenario when the input string is null.
			*/
			@Test
			void testSplitWordsWithNullString() {
						String input = null;
						assertNull(SplitWords.splitWords(input));
			}
}
