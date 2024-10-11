// SplitWordsTest.java
package scenario2;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains ten unit test cases for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {
			/**
			* Test case when the input string contains only one word.
			*/
			@Test
			void testOneWord() {
						String txt = "Hello";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello"), result);
			}

			/**
			* Test case when the input string contains only one word with a comma.
			*/
			@Test
			void testOneWordWithComma() {
						String txt = "Hello,";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello"), result);
			}

			/**
			* Test case when the input string contains only one word with a space.
			*/
			@Test
			void testOneWordWithSpace() {
						String txt = "Hello ";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello"), result);
			}

			/**
			* Test case when the input string contains multiple words.
			*/
			@Test
			void testMultipleWords() {
						String txt = "Hello World";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello", "World"), result);
			}

			/**
			* Test case when the input string contains multiple words with a comma.
			*/
			@Test
			void testMultipleWordsWithComma() {
						String txt = "Hello,World";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello", "World"), result);
			}

			/**
			* Test case when the input string contains multiple words with a space.
			*/
			@Test
			void testMultipleWordsWithSpace() {
						String txt = "Hello World";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello", "World"), result);
			}

			/**
			* Test case when the input string contains only one word with a comma and a space.
			*/
			@Test
			void testOneWordWithCommaAndSpace() {
						String txt = "Hello, ";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello"), result);
			}

			/**
			* Test case when the input string contains only one word with a space and a comma.
			*/
			@Test
			void testOneWordWithSpaceAndComma() {
						String txt = "Hello ,";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello"), result);
			}

			/**
			* Test case when the input string contains multiple words with a comma and a space.
			*/
			@Test
			void testMultipleWordsWithCommaAndSpace() {
						String txt = "Hello, World";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello", "World"), result);
			}

			/**
			* Test case when the input string contains multiple words with a space and a comma.
			*/
			@Test
			void testMultipleWordsWithSpaceAndComma() {
						String txt = "Hello ,World";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello", "World"), result);
			}

			/**
			* Test case when the input string contains only one word with a space and a comma.
			*/
			@Test
			void testOneWordWithSpaceAndCommaAndSpace() {
						String txt = "Hello , ";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello"), result);
			}

			/**
			* Test case when the input string contains only one word with a comma and a space.
			*/
			@Test
			void testOneWordWithCommaAndSpaceAndComma() {
						String txt = "Hello, ,";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello"), result);
			}

			/**
			* Test case when the input string contains only one word with a space and a comma.
			*/
			@Test
			void testOneWordWithSpaceAndCommaAndSpaceAndComma() {
						String txt = "Hello , ,";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello"), result);
			}

			/**
			* Test case when the input string contains only one word with a comma and a space.
			*/
			@Test
			void testOneWordWithCommaAndSpaceAndCommaAndSpace() {
						String txt = "Hello, , ";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello"), result);
			}

			/**
			* Test case when the input string contains only one word with a space and a comma.
			*/
			@Test
			void testOneWordWithSpaceAndCommaAndSpaceAndCommaAndSpace() {
						String txt = "Hello , , ,";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello"), result);
			}

			/**
			* Test case when the input string contains only one word with a comma and a space.
			*/
			@Test
			void testOneWordWithCommaAndSpaceAndCommaAndSpaceAndComma() {
						String txt = "Hello, , , ";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello"), result);
			}

			/**
			* Test case when the input string contains only one word with a space and a comma.
			*/
			@Test
			void testOneWordWithSpaceAndCommaAndSpaceAndCommaAndSpaceAndComma() {
						String txt = "Hello , , , ,";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello"), result);
			}

			/**
			* Test case when the input string contains only one word with a comma and a space.
			*/
			@Test
			void testOneWordWithCommaAndSpaceAndCommaAndSpaceAndCommaAndSpace() {
						String txt = "Hello, , , , ";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello"), result);
			}

			/**
			* Test case when the input string contains only one word with a space and a comma.
			*/
			@Test
			void testOneWordWithSpaceAndCommaAndSpaceAndCommaAndSpaceAndCommaAndSpace() {
						String txt = "Hello , , , , ,";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello"), result);
			}

			/**
			* Test case when the input string contains only one word with a comma and a space.
			*/
			@Test
			void testOneWordWithCommaAndSpaceAndCommaAndSpaceAndCommaAndSpaceAndComma() {
						String txt = "Hello, , , , , ";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello"), result);
			}

			/**
			* Test case when the input string contains only one word with a space and a comma.
			*/
			@Test
			void testOneWordWithSpaceAndCommaAndSpaceAndCommaAndSpaceAndCommaAndComma() {
						String txt = "Hello , , , , , ,";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello"), result);
			}

			/**
			* Test case when the input string contains only one word with a comma and a space.
			*/
			@Test
			void testOneWordWithCommaAndSpaceAndCommaAndSpaceAndCommaAndCommaAndComma() {
						String txt = "Hello, , , , , , ";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello"), result);
			}

			/**
			* Test case when the input string contains only one word with a space and a comma.
			*/
			@Test
			void testOneWordWithSpaceAndCommaAndSpaceAndCommaAndCommaAndCommaAndComma() {
						String txt = "Hello , , , , , , ,";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello"), result);
			}

			/**
			* Test case when the input string contains only one word with a comma and a space.
			*/
			@Test
			void testOneWordWithCommaAndSpaceAndCommaAndCommaAndCommaAndCommaAndComma() {
						String txt = "Hello, , , , , , , ";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello"), result);
			}

			/**
			* Test case when the input string contains only one word with a space and a comma.
			*/
			@Test
			void testOneWordWithSpaceAndCommaAndCommaAndCommaAndCommaAndCommaAndComma() {
						String txt = "Hello , , , , , , , ,";
						Object result = SplitWords.splitWords(txt);
						assertEquals(Arrays.asList("Hello"), result);
			}

			/**
			* Test case when the input string contains only one word with a comma and a space.
			*/
}