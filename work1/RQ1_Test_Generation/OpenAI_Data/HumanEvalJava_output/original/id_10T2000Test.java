// MakePalindromeTest.java
package original;


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
				assertEquals("x", MakePalindrome.makePalindrome("x"));
			}
			
			@Test
			void testTwoCharacterString() {
				assertEquals("xyx", MakePalindrome.makePalindrome("xy"));
			}
			
			@Test
			void testThreeCharacterString() {
				assertEquals("xyzyx", MakePalindrome.makePalindrome("xyz"));
			}
			
			@Test
			void testFourCharacterString() {
				assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerry"));
			}
			
			@Test
			void testFiveCharacterString() {
				assertEquals("jerryyrrej", MakePalindrome.makePalindrome("jerryy"));
			}
			
			@Test
			void testSixCharacterString() {
				assertEquals("jerryyrryj", MakePalindrome.makePalindrome("jerryyr"));
			}
			
			@Test
			void testSevenCharacterString() {
				assertEquals("jerryyrreyj", MakePalindrome.makePalindrome("jerryyre"));
			}
			
			@Test
			void testEightCharacterString() {
				assertEquals("jerryyrrejyrrej", MakePalindrome.makePalindrome("jerryyrre"));
			}
			
			@Test
			void testNineCharacterString() {
				assertEquals("jerryyrrejyrrejyrrej", MakePalindrome.makePalindrome("jerryyrrej"));
			}
			
			@Test
			void testTenCharacterString() {
				assertEquals("jerryyrrejyrrejyrrejyrrej", MakePalindrome.makePalindrome("jerryyrrejy"));
			}
}