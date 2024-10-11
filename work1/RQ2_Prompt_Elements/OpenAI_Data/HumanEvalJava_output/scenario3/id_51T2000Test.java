// RemoveVowelsTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains ten unit test cases for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {
	/**
			* Test case for the {@link RemoveVowels#removeVowels(String)} method.
			* It checks the method with a string that contains all the vowels.
			*/
			@Test
			void testRemoveVowelsWithAllVowels() {
				String text = "aaaaa";
				String expected = "";
				String actual = RemoveVowels.removeVowels(text);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link RemoveVowels#removeVowels(String)} method.
			* It checks the method with a string that contains no vowels.
			*/
			@Test
			void testRemoveVowelsWithNoVowels() {
				String text = "zbcd";
				String expected = "zbcd";
				String actual = RemoveVowels.removeVowels(text);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link RemoveVowels#removeVowels(String)} method.
			* It checks the method with an empty string.
			*/
			@Test
			void testRemoveVowelsWithEmptyString() {
				String text = "";
				String expected = "";
				String actual = RemoveVowels.removeVowels(text);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link RemoveVowels#removeVowels(String)} method.
			* It checks the method with a string that contains a mix of vowels and consonants.
			*/
			@Test
			void testRemoveVowelsWithMixOfVowelsAndConsonants() {
				String text = "aaBAA";
				String expected = "B";
				String actual = RemoveVowels.removeVowels(text);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link RemoveVowels#removeVowels(String)} method.
			* It checks the method with a string that contains a mix of vowels, consonants and new line characters.
			*/
			@Test
			void testRemoveVowelsWithMixOfVowelsConsonantsAndNewLineCharacters() {
				String text = "abcdef\nghijklm";
				String expected = "bcdf\nghjklm";
				String actual = RemoveVowels.removeVowels(text);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link RemoveVowels#removeVowels(String)} method.
			* It checks the method with a string that contains a mix of vowels and consonants in reverse order.
			*/
			@Test
			void testRemoveVowelsWithMixOfVowelsAndConsonantsInReverseOrder() {
				String text = "fedcba";
				String expected = "fdcb";
				String actual = RemoveVowels.removeVowels(text);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link RemoveVowels#removeVowels(String)} method.
			* It checks the method with a string that contains all the vowels in upper case.
			*/
			@Test
			void testRemoveVowelsWithAllVowelsInUpperCase() {
				String text = "eeeee";
				String expected = "";
				String actual = RemoveVowels.removeVowels(text);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link RemoveVowels#removeVowels(String)} method.
			* It checks the method with a string that contains a mix of vowels and consonants in upper case.
			*/
			@Test
			void testRemoveVowelsWithMixOfVowelsAndConsonantsInUpperCase() {
				String text = "acBAA";
				String expected = "cB";
				String actual = RemoveVowels.removeVowels(text);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link RemoveVowels#removeVowels(String)} method.
			* It checks the method with a string that contains a mix of vowels and consonants in upper and lower case.
			*/
			@Test
			void testRemoveVowelsWithMixOfVowelsAndConsonantsInUpperAndLowerCase() {
				String text = "EcBOO";
				String expected = "cB";
				String actual = RemoveVowels.removeVowels(text);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link RemoveVowels#removeVowels(String)} method.
			* It checks the method with a string that contains no vowels in upper case.
			*/
			@Test
			void testRemoveVowelsWithNoVowelsInUpperCase() {
				String text = "ybcd";
				String expected = "ybcd";
				String actual = RemoveVowels.removeVowels(text);
				assertEquals(expected, actual);
			}
}
