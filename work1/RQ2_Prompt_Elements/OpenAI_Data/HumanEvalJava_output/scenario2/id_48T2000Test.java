// IsPalindromeTest.java
package scenario2;


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
			
			// Test case 2: Single character string
			@Test
			void testSingleCharacterString() {
				assertTrue(IsPalindrome.isPalindrome("a"));
			}
			
			// Test case 3: Two character string
			@Test
			void testTwoCharacterString() {
				assertTrue(IsPalindrome.isPalindrome("aa"));
			}
			
			// Test case 4: Palindrome string with even number of characters
			@Test
			void testPalindromeStringWithEvenNumberOfCharacters() {
				assertTrue(IsPalindrome.isPalindrome("abba"));
			}
			
			// Test case 5: Palindrome string with odd number of characters
			@Test
			void testPalindromeStringWithOddNumberOfCharacters() {
				assertTrue(IsPalindrome.isPalindrome("aba"));
			}
			
			// Test case 6: Non-palindrome string with even number of characters
			@Test
			void testNonPalindromeStringWithEvenNumberOfCharacters() {
				assertFalse(IsPalindrome.isPalindrome("abab"));
			}
			
			// Test case 7: Non-palindrome string with odd number of characters
			@Test
			void testNonPalindromeStringWithOddNumberOfCharacters() {
				assertFalse(IsPalindrome.isPalindrome("abc"));
			}
			
			// Test case 8: Palindrome string with special characters
			@Test
			void testPalindromeStringWithSpecialCharacters() {
				assertTrue(IsPalindrome.isPalindrome("a@b#b@a"));
			}
			
			// Test case 9: Non-palindrome string with special characters
			@Test
			void testNonPalindromeStringWithSpecialCharacters() {
				assertFalse(IsPalindrome.isPalindrome("a@b#b@c"));
			}
			
			// Test case 10: Palindrome string with mixed case
			@Test
			void testPalindromeStringWithMixedCase() {
				assertTrue(IsPalindrome.isPalindrome("AaBbBbAa"));
			}
}