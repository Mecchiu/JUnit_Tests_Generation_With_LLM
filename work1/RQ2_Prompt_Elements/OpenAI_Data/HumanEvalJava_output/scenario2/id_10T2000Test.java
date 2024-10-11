// MakePalindromeTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakePalindrome}.
* It contains ten unit test cases for the {@link MakePalindrome#makePalindrome(String)} method.
*/
class MakePalindromeTest {
	@Test
			void testEmptyString() {
				assertEquals("", MakePalindrome.makePalindrome(""));
			}
			
			@Test
			void testOneCharacterString() {
				assertEquals("a", MakePalindrome.makePalindrome("a"));
			}
			
			@Test
			void testTwoCharacterString() {
				assertEquals("aa", MakePalindrome.makePalindrome("a"));
			}
			
			@Test
			void testThreeCharacterString() {
				assertEquals("aba", MakePalindrome.makePalindrome("ab"));
			}
			
			@Test
			void testFourCharacterString() {
				assertEquals("abba", MakePalindrome.makePalindrome("ab"));
			}
			
			@Test
			void testFiveCharacterString() {
				assertEquals("ababa", MakePalindrome.makePalindrome("aba"));
			}
			
			@Test
			void testSixCharacterString() {
				assertEquals("abcba", MakePalindrome.makePalindrome("abc"));
			}
			
			@Test
			void testSevenCharacterString() {
				assertEquals("abccba", MakePalindrome.makePalindrome("abcc"));
			}
			
			@Test
			void testEightCharacterString() {
				assertEquals("abcdcba", MakePalindrome.makePalindrome("abcd"));
			}
			
			@Test
			void testNineCharacterString() {
				assertEquals("abcddcba", MakePalindrome.makePalindrome("abcdd"));
			}
			
			@Test
			void testTenCharacterString() {
				assertEquals("abcdeedcba", MakePalindrome.makePalindrome("abcdeed"));
			}
}
