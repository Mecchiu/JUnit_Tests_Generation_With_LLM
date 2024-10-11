// StrlenTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Strlen}.
* It contains ten unit test cases for the {@link Strlen#strlen(String)} method.
*/
class StrlenTest {
	// Test case 1: Empty string
			@Test
			void testEmptyString() {
				assertEquals(0, Strlen.strlen(""));
			}
			
			// Test case 2: String with one character
			@Test
			void testOneCharacterString() {
				assertEquals(1, Strlen.strlen("x"));
			}
			
			// Test case 3: String with two characters
			@Test
			void testTwoCharactersString() {
				assertEquals(2, Strlen.strlen("ab"));
			}
			
			// Test case 4: String with three characters
			@Test
			void testThreeCharactersString() {
				assertEquals(3, Strlen.strlen("abc"));
			}
			
			// Test case 5: String with four characters
			@Test
			void testFourCharactersString() {
				assertEquals(4, Strlen.strlen("abcd"));
			}
			
			// Test case 6: String with five characters
			@Test
			void testFiveCharactersString() {
				assertEquals(5, Strlen.strlen("abcde"));
			}
			
			// Test case 7: String with six characters
			@Test
			void testSixCharactersString() {
				assertEquals(6, Strlen.strlen("abcdef"));
			}
			
			// Test case 8: String with seven characters
			@Test
			void testSevenCharactersString() {
				assertEquals(7, Strlen.strlen("abcdefg"));
			}
			
			// Test case 9: String with eight characters
			@Test
			void testEightCharactersString() {
				assertEquals(8, Strlen.strlen("abcdefgh"));
			}
			
			// Test case 10: String with nine characters
			@Test
			void testNineCharactersString() {
				assertEquals(9, Strlen.strlen("abcdefghi"));
			}
			
			// Test case 11: String with ten characters
			@Test
			void testTenCharactersString() {
				assertEquals(10, Strlen.strlen("abcdefghij"));
			}
}