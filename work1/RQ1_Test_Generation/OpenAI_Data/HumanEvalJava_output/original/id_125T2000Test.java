// SplitWordsTest.java
package original;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains ten unit test cases for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {
	/**
			* Test case for the {@link SplitWords#splitWords(String)} method.
			* It tests the case when the input string contains whitespaces.
			*/
			@Test
			void testSplitWordsWithWhitespaces() {
				String input = "Hello world!";
				Object expected = Arrays.asList("Hello", "world!");
				Object actual = SplitWords.splitWords(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SplitWords#splitWords(String)} method.
			* It tests the case when the input string contains whitespaces and commas.
			*/
			@Test
			void testSplitWordsWithWhitespacesAndCommas() {
				String input = "Hello,world!";
				Object expected = Arrays.asList("Hello", "world!");
				Object actual = SplitWords.splitWords(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SplitWords#splitWords(String)} method.
			* It tests the case when the input string contains whitespaces, commas and exclamation mark.
			*/
			@Test
			void testSplitWordsWithWhitespacesCommasAndExclamationMark() {
				String input = "Hello world,!";
				Object expected = Arrays.asList("Hello", "world", "!");
				Object actual = SplitWords.splitWords(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SplitWords#splitWords(String)} method.
			* It tests the case when the input string contains whitespaces, commas and exclamation mark.
			*/
			@Test
			void testSplitWordsWithWhitespacesCommasAndExclamationMark2() {
				String input = "Hello,Hello,world !";
				Object expected = Arrays.asList("Hello", "Hello", "world", "!");
				Object actual = SplitWords.splitWords(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SplitWords#splitWords(String)} method.
			* It tests the case when the input string contains only lowercase letters.
			*/
			@Test
			void testSplitWordsWithOnlyLowercaseLetters() {
				String input = "abcdef";
				Object expected = 3;
				Object actual = SplitWords.splitWords(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SplitWords#splitWords(String)} method.
			* It tests the case when the input string contains only lowercase letters.
			*/
			@Test
			void testSplitWordsWithOnlyLowercaseLetters2() {
				String input = "aaabb";
				Object expected = 2;
				Object actual = SplitWords.splitWords(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SplitWords#splitWords(String)} method.
			* It tests the case when the input string contains both lowercase and uppercase letters.
			*/
			@Test
			void testSplitWordsWithLowercaseAndUppercaseLetters() {
				String input = "aaaBb";
				Object expected = 1;
				Object actual = SplitWords.splitWords(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SplitWords#splitWords(String)} method.
			* It tests the case when the input string is empty.
			*/
			@Test
			void testSplitWordsWithEmptyString() {
				String input = "";
				Object expected = 0;
				Object actual = SplitWords.splitWords(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SplitWords#splitWords(String)} method.
			* It tests the case when the input string is null.
			*/
			@Test
			void testSplitWordsWithNullString() {
				String input = null;
				Object expected = null;
				Object actual = SplitWords.splitWords(input);
				assertEquals(expected, actual);
			}
}
