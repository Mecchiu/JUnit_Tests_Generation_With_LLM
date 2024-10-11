// MakePalindromeTest.java
package scenario3;


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
			void testSingleCharacter() {
				assertEquals("x", MakePalindrome.makePalindrome("x"));
			}
			
			@Test
			void testTwoCharacters() {
				assertEquals("xyx", MakePalindrome.makePalindrome("xy"));
			}
			
			@Test
			void testThreeCharacters() {
				assertEquals("xyzyx", MakePalindrome.makePalindrome("xyz"));
			}
			
			@Test
			void testFourCharacters() {
				assertEquals("xyzyx", MakePalindrome.makePalindrome("xyx"));
			}
			
			@Test
			void testFiveCharacters() {
				assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerry"));
			}
			
			@Test
			void testSixCharacters() {
				assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerr"));
			}
			
			@Test
			void testSevenCharacters() {
				assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerryr"));
			}
			
			@Test
			void testEightCharacters() {
				assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerryrr"));
			}
			
			@Test
			void testNineCharacters() {
				assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerryrre"));
			}
}
