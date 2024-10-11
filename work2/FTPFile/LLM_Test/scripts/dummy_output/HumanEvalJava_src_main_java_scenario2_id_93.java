// EncodeTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encode}.
* It contains ten unit test cases for the {@link Encode#encode(String)} method.
*/
class EncodeTest {
			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with a message that contains only lower case letters.
			*/
			@Test
			void testEncodeWithLowerCaseLetters() {
						String message = "hello";
						String expected = "JGNNQ";
						String actual = Encode.encode(message);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with a message that contains only upper case letters.
			*/
			@Test
			void testEncodeWithUpperCaseLetters() {
						String message = "HELLO";
						String expected = "jgnnq";
						String actual = Encode.encode(message);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with a message that contains both lower and upper case letters.
			*/
			@Test
			void testEncodeWithMixedCaseLetters() {
						String message = "Hello";
						String expected = "jGNNQ";
						String actual = Encode.encode(message);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with a message that contains only vowels.
			*/
			@Test
			void testEncodeWithOnlyVowels() {
						String message = "aeiou";
						String expected = "CEKMQ";
						String actual = Encode.encode(message);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with a message that contains only consonants.
			*/
			@Test
			void testEncodeWithOnlyConsonants() {
						String message = "bcdfghjklmnpqrstvwxyz";
						String expected = "BCDFGHJKLMNPQRSTVWXYZ";
						String actual = Encode.encode(message);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with a message that contains both vowels and consonants.
			*/
			@Test
			void testEncodeWithVowelsAndConsonants() {
						String message = "Hello World";
						String expected = "jGNNQ Yqtnf";
						String actual = Encode.encode(message);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with a message that contains only one letter.
			*/
			@Test
			void testEncodeWithOneLetter() {
						String message = "a";
						String expected = "C";
						String actual = Encode.encode(message);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with a message that contains only two letters.
			*/
			@Test
			void testEncodeWithTwoLetters() {
						String message = "ab";
						String expected = "CD";
						String actual = Encode.encode(message);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with a message that contains only three letters.
			*/
			@Test
			void testEncodeWithThreeLetters() {
						String message = "abc";
						String expected = "CDE";
						String actual = Encode.encode(message);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with an empty message.
			*/
			@Test
			void testEncodeWithEmptyMessage() {
						String message = "";
						String expected = "";
						String actual = Encode.encode(message);
						assertEquals(expected, actual);
			}
}