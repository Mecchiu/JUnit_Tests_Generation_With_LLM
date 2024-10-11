// RemoveVowelsTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains ten unit test cases for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {
			// Test case 1: Empty string
			@Test
			void testRemoveVowels1() {
				String text = "";
				String expected = "";
				String actual = RemoveVowels.removeVowels(text);
				assertEquals(expected, actual);
			}
			
			// Test case 2: String with no vowels
			@Test
			void testRemoveVowels2() {
				String text = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
				String expected = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
				String actual = RemoveVowels.removeVowels(text);
				assertEquals(expected, actual);
			}
			
			// Test case 3: String with only one vowel
			@Test
			void testRemoveVowels3() {
				String text = "a";
				String expected = "";
				String actual = RemoveVowels.removeVowels(text);
				assertEquals(expected, actual);
			}
			
			// Test case 4: String with only vowels
			@Test
			void testRemoveVowels4() {
				String text = "aeiouAEIOU";
				String expected = "";
				String actual = RemoveVowels.removeVowels(text);
				assertEquals(expected, actual);
			}
			
			// Test case 5: String with only one consonant
			@Test
			void testRemoveVowels5() {
				String text = "b";
				String expected = "b";
				String actual = RemoveVowels.removeVowels(text);
				assertEquals(expected, actual);
			}
			
			// Test case 6: String with only consonants
			@Test
			void testRemoveVowels6() {
				String text = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
				String expected = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
				String actual = RemoveVowels.removeVowels(text);
				assertEquals(expected, actual);
			}
			
			// Test case 7: String with vowels and consonants
			@Test
			void testRemoveVowels7() {
				String text = "Hello World";
				String expected = "Hll Wrld";
				String actual = RemoveVowels.removeVowels(text);
				assertEquals(expected, actual);
			}
			
			// Test case 8: String with only spaces
			@Test
			void testRemoveVowels8() {
				String text = "   ";
				String expected = "   ";
				String actual = RemoveVowels.removeVowels(text);
				assertEquals(expected, actual);
			}
			
			// Test case 9: String with only special characters
			@Test
			void testRemoveVowels9() {
				String text = "!@#$%^&*()_+-=[]{};':\",./<>?\\|";
				String expected = "!@#$%^&*()_+-=[]{};':\",./<>?\\|";
				String actual = RemoveVowels.removeVowels(text);
				assertEquals(expected, actual);
			}
			
			// Test case 10: String with vowels, consonants, spaces, and special characters
			@Test
			void testRemoveVowels10() {
				String text = "Hello World! How are you?";
				String expected = "Hll Wrld! Hw r y?";
				String actual = RemoveVowels.removeVowels(text);
				assertEquals(expected, actual);
			}
}