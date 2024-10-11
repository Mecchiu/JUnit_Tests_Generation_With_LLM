// WordsStringTest.java
package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains ten unit test cases for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {
			/**
			* Test case for the {@link WordsString#wordsString(String)} method.
			* It tests the method with a string that contains words separated by commas.
			*/
			@Test
			void testWordsStringWithCommas() {
				List<Object> expected = Arrays.asList("Hi", "my", "name", "is", "John");
				List<Object> actual = WordsString.wordsString("Hi, my name is John");
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link WordsString#wordsString(String)} method.
			* It tests the method with a string that contains words separated by spaces.
			*/
			@Test
			void testWordsStringWithSpaces() {
				List<Object> expected = Arrays.asList("One", "two", "three", "four", "five", "six");
				List<Object> actual = WordsString.wordsString("One, two, three, four, five, six");
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link WordsString#wordsString(String)} method.
			* It tests the method with a string that contains words separated by commas and spaces.
			*/
			@Test
			void testWordsStringWithCommasAndSpaces() {
				List<Object> expected = Arrays.asList("Hi", "my", "name");
				List<Object> actual = WordsString.wordsString("Hi, my name");
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link WordsString#wordsString(String)} method.
			* It tests the method with a string that contains empty words.
			*/
			@Test
			void testWordsStringWithEmptyWords() {
				List<Object> expected = Arrays.asList("One", "two", "three", "four", "five", "six");
				List<Object> actual = WordsString.wordsString("One,, two, three, four, five, six,");
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link WordsString#wordsString(String)} method.
			* It tests the method with an empty string.
			*/
			@Test
			void testWordsStringWithEmptyString() {
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = WordsString.wordsString("");
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link WordsString#wordsString(String)} method.
			* It tests the method with a string that contains only one word.
			*/
			@Test
			void testWordsStringWithOneWord() {
				List<Object> expected = Arrays.asList("ahmed");
				List<Object> actual = WordsString.wordsString("ahmed");
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link WordsString#wordsString(String)} method.
			* It tests the method with a string that contains only one word separated by commas.
			*/
			@Test
			void testWordsStringWithOneWordAndCommas() {
				List<Object> expected = Arrays.asList("ahmed");
				List<Object> actual = WordsString.wordsString("ahmed,,,,");
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link WordsString#wordsString(String)} method.
			* It tests the method with a string that contains only one word separated by spaces.
			*/
			@Test
			void testWordsStringWithOneWordAndSpaces() {
				List<Object> expected = Arrays.asList("ahmed");
				List<Object> actual = WordsString.wordsString("ahmed     ");
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link WordsString#wordsString(String)} method.
			* It tests the method with a string that contains only one word separated by commas and spaces.
			*/
			@Test
			void testWordsStringWithOneWordAndCommasAndSpaces() {
				List<Object> expected = Arrays.asList("ahmed");
				List<Object> actual = WordsString.wordsString("ahmed,     ,");
				assertEquals(expected, actual);
			}
}