// IsPalindromeTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPalindrome}.
* It contains ten unit test cases for the {@link IsPalindrome#isPalindrome(String)} method.
*/
class IsPalindromeTest {
	// Test case 1: Empty string
			@Test
			void testEmptyString() {
				assertTrue(IsPalindrome.isPalindrome(""));
			}
			
			// Test case 2: String with one character
			@Test
			void testOneCharacterString() {
				assertTrue(IsPalindrome.isPalindrome("a"));
			}
			
			// Test case 3: String with two identical characters
			@Test
			void testTwoIdenticalCharacters() {
				assertTrue(IsPalindrome.isPalindrome("aa"));
			}
			
			// Test case 4: String with two different characters
			@Test
			void testTwoDifferentCharacters() {
				assertFalse(IsPalindrome.isPalindrome("ab"));
			}
			
			// Test case 5: String with odd number of characters
			@Test
			void testOddNumberOfCharacters() {
				assertTrue(IsPalindrome.isPalindrome("aba"));
			}
			
			// Test case 6: String with even number of characters
			@Test
			void testEvenNumberOfCharacters() {
				assertTrue(IsPalindrome.isPalindrome("abba"));
			}
			
			// Test case 7: String with all identical characters
			@Test
			void testAllIdenticalCharacters() {
				assertTrue(IsPalindrome.isPalindrome("aaaaa"));
			}
			
			// Test case 8: String with all different characters
			@Test
			void testAllDifferentCharacters() {
				assertFalse(IsPalindrome.isPalindrome("zbcd"));
			}
			
			// Test case 9: String with palindrome characters
			@Test
			void testPalindromeCharacters() {
				assertTrue(IsPalindrome.isPalindrome("xywyx"));
			}
			
			// Test case 10: String with non-palindrome characters
			@Test
			void testNonPalindromeCharacters() {
				assertFalse(IsPalindrome.isPalindrome("xywyz"));
			}
}