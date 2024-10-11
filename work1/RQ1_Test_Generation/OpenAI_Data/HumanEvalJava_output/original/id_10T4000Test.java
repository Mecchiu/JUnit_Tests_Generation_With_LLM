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
	void testMakePalindrome() {
		assertEquals("", MakePalindrome.makePalindrome(""));
		assertEquals("catac", MakePalindrome.makePalindrome("cat"));
		assertEquals("catac", MakePalindrome.makePalindrome("cata"));
		assertEquals("", MakePalindrome.makePalindrome(""));
		assertEquals("x", MakePalindrome.makePalindrome("x"));
		assertEquals("xyzyx", MakePalindrome.makePalindrome("xyz"));
		assertEquals("xyx", MakePalindrome.makePalindrome("xyx"));
		assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerry"));
	}
}