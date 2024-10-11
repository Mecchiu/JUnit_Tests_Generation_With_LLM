// CountDistinctCharactersTest.java
package scenario2;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains ten unit test cases for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {
	// Test case 1: Empty string
			@Test
			void testEmptyString() {
				String string = "";
				int expected = 0;
				int actual = CountDistinctCharacters.countDistinctCharacters(string);
				assertEquals(expected, actual);
			}

			// Test case 2: String with one character
			@Test
			void testOneCharacterString() {
				String string = "a";
				int expected = 1;
				int actual = CountDistinctCharacters.countDistinctCharacters(string);
				assertEquals(expected, actual);
			}

			// Test case 3: String with all distinct characters
			@Test
			void testAllDistinctCharacters() {
				String string = "abcdefg";
				int expected = 7;
				int actual = CountDistinctCharacters.countDistinctCharacters(string);
				assertEquals(expected, actual);
			}

			// Test case 4: String with all same characters
			@Test
			void testAllSameCharacters() {
				String string = "aaaaaaa";
				int expected = 1;
				int actual = CountDistinctCharacters.countDistinctCharacters(string);
				assertEquals(expected, actual);
			}

			// Test case 5: String with all same characters but different cases
			@Test
			void testAllSameCharactersDifferentCases() {
				String string = "AaAaAaA";
				int expected = 1;
				int actual = CountDistinctCharacters.countDistinctCharacters(string);
				assertEquals(expected, actual);
			}

			// Test case 6: String with special characters
			@Test
			void testSpecialCharacters() {
				String string = "!@#$%^&*()";
				int expected = 10;
				int actual = CountDistinctCharacters.countDistinctCharacters(string);
				assertEquals(expected, actual);
			}

			// Test case 7: String with numbers
			@Test
			void testNumbers() {
				String string = "1234567890";
				int expected = 10;
				int actual = CountDistinctCharacters.countDistinctCharacters(string);
				assertEquals(expected, actual);
			}

			// Test case 8: String with spaces
			@Test
			void testSpaces() {
				String string = "   ";
				int expected = 1;
				int actual = CountDistinctCharacters.countDistinctCharacters(string);
				assertEquals(expected, actual);
			}

			// Test case 9: String with spaces and characters
			@Test
			void testSpacesAndCharacters() {
				String string = " a b c d e f g ";
				int expected = 7;
				int actual = CountDistinctCharacters.countDistinctCharacters(string);
				assertEquals(expected, actual);
			}

			// Test case 10: String with spaces, characters, and special characters
			@Test
			void testSpacesCharactersAndSpecialCharacters() {
				String string = " !a@b#c$d%e^f&g* ";
				int expected = 7;
				int actual = CountDistinctCharacters.countDistinctCharacters(string);
				assertEquals(expected, actual);
			}
}