// IsPalindromeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPalindrome}.
* It contains ten unit test cases for the {@link IsPalindrome#isPalindrome(String)} method.
*/
class IsPalindromeTest {
	@Test
			void testEmptyString() {
				assertTrue(IsPalindrome.isPalindrome(""));
			}
			
			@Test
			void testSingleCharacter() {
				assertTrue(IsPalindrome.isPalindrome("a"));
			}
			
			@Test
			void testTwoCharacters() {
				assertTrue(IsPalindrome.isPalindrome("aa"));
			}
			
			@Test
			void testThreeCharacters() {
				assertTrue(IsPalindrome.isPalindrome("aba"));
			}
			
			@Test
			void testFiveCharacters() {
				assertTrue(IsPalindrome.isPalindrome("xywyx"));
			}
			
			@Test
			void testEvenCharacters() {
				assertTrue(IsPalindrome.isPalindrome("aaaaa"));
			}
			
			@Test
			void testOddCharacters() {
				assertTrue(IsPalindrome.isPalindrome("xywyz"));
			}
			
			@Test
			void testNotPalindrome() {
				assertFalse(IsPalindrome.isPalindrome("zbcd"));
			}
			
			@Test
			void testNotPalindromeEven() {
				assertFalse(IsPalindrome.isPalindrome("xywzx"));
			}
			
			@Test
			void testNotPalindromeOdd() {
				assertFalse(IsPalindrome.isPalindrome("xywzx"));
			}
}
