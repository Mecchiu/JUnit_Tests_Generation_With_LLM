// RemoveVowelsTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains ten unit test cases for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {
	/**
			* Test case for empty string.
			*/
			@Test
			void testEmptyString() {
						String text = "";
						String expected = "";
						String actual = RemoveVowels.removeVowels(text);
						assertEquals(expected, actual);
			}

			/**
			* Test case for string with no vowels.
			*/
			@Test
			void testNoVowels() {
						String text = "bcdfghjklmnpqrstvwxyz";
						String expected = "bcdfghjklmnpqrstvwxyz";
						String actual = RemoveVowels.removeVowels(text);
						assertEquals(expected, actual);
			}

			/**
			* Test case for string with all vowels.
			*/
			@Test
			void testAllVowels() {
						String text = "aeiouAEIOU";
						String expected = "";
						String actual = RemoveVowels.removeVowels(text);
						assertEquals(expected, actual);
			}

			/**
			* Test case for string with all vowels and consonants.
			*/
			@Test
			void testAllVowelsAndConsonants() {
						String text = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
						String expected = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
						String actual = RemoveVowels.removeVowels(text);
						assertEquals(expected, actual);
			}

			/**
			* Test case for string with one vowel.
			*/
			@Test
			void testOneVowel() {
						String text = "a";
						String expected = "";
						String actual = RemoveVowels.removeVowels(text);
						assertEquals(expected, actual);
			}

			/**
			* Test case for string with one consonant.
			*/
			@Test
			void testOneConsonant() {
						String text = "b";
						String expected = "b";
						String actual = RemoveVowels.removeVowels(text);
						assertEquals(expected, actual);
			}

			/**
			* Test case for string with one vowel and one consonant.
			*/
			@Test
			void testOneVowelAndOneConsonant() {
						String text = "ab";
						String expected = "b";
						String actual = RemoveVowels.removeVowels(text);
						assertEquals(expected, actual);
			}

			/**
			* Test case for string with multiple vowels.
			*/
			@Test
			void testMultipleVowels() {
						String text = "aeiou";
						String expected = "";
						String actual = RemoveVowels.removeVowels(text);
						assertEquals(expected, actual);
			}

			/**
			* Test case for string with multiple consonants.
			*/
			@Test
			void testMultipleConsonants() {
						String text = "bcdfghjklmnpqrstvwxyz";
						String expected = "bcdfghjklmnpqrstvwxyz";
						String actual = RemoveVowels.removeVowels(text);
						assertEquals(expected, actual);
			}

			/**
			* Test case for string with multiple vowels and consonants.
			*/
			@Test
			void testMultipleVowelsAndConsonants() {
						String text = "abcdefghijklmnopqrstuvwxyz";
						String expected = "bcdfghjklmnpqrstvwxyz";
						String actual = RemoveVowels.removeVowels(text);
						assertEquals(expected, actual);
			}
}
