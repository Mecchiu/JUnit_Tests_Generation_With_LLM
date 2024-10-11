// IsPalindromeTest.java
package scenario1;


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
			
			// Test case 2: Single character
			@Test
			void testSingleCharacter() {
				assertTrue(IsPalindrome.isPalindrome("a"));
			}
			
			// Test case 3: Two identical characters
			@Test
			void testTwoIdenticalCharacters() {
				assertTrue(IsPalindrome.isPalindrome("aa"));
			}
			
			// Test case 4: Two different characters
			@Test
			void testTwoDifferentCharacters() {
				assertFalse(IsPalindrome.isPalindrome("ab"));
			}
			
			// Test case 5: Three identical characters
			@Test
			void testThreeIdenticalCharacters() {
				assertTrue(IsPalindrome.isPalindrome("aaa"));
			}
			
			// Test case 6: Three different characters
			@Test
			void testThreeDifferentCharacters() {
				assertFalse(IsPalindrome.isPalindrome("abc"));
			}
			
			// Test case 7: Palindrome with even number of characters
			@Test
			void testPalindromeEvenCharacters() {
				assertTrue(IsPalindrome.isPalindrome("abba"));
			}
			
			// Test case 8: Palindrome with odd number of characters
			@Test
			void testPalindromeOddCharacters() {
				assertTrue(IsPalindrome.isPalindrome("aba"));
			}
			
			// Test case 9: Non-palindrome with even number of characters
			@Test
			void testNonPalindromeEvenCharacters() {
				assertFalse(IsPalindrome.isPalindrome("abca"));
			}
			
			// Test case 10: Non-palindrome with odd number of characters
			@Test
			void testNonPalindromeOddCharacters() {
				assertFalse(IsPalindrome.isPalindrome("abc"));
			}
}