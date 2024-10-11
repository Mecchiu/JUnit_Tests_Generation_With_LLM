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
	void testMakePalindrome() {
		assertEquals("", MakePalindrome.makePalindrome(""));
		assertEquals("a", MakePalindrome.makePalindrome("a"));
		assertEquals("aa", MakePalindrome.makePalindrome("a"));
		assertEquals("aba", MakePalindrome.makePalindrome("a"));
		assertEquals("abba", MakePalindrome.makePalindrome("ab"));
		assertEquals("abcba", MakePalindrome.makePalindrome("abc"));
		assertEquals("abcdcba", MakePalindrome.makePalindrome("abcd"));
		assertEquals("abcddcba", MakePalindrome.makePalindrome("abcd"));
		assertEquals("abcdedcba", MakePalindrome.makePalindrome("abcde"));
		assertEquals("abcdefedcba", MakePalindrome.makePalindrome("abcdef"));
	}
}