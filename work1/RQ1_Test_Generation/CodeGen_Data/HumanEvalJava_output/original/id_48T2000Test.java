// IsPalindromeTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPalindrome}.
* It contains one unit test case for the {@link IsPalindrome#isPalindrome(String)} method.
*/
class IsPalindromeTest {

	@Test
	public void isPalindromeTest1(){
		assertTrue(IsPalindrome.isPalindrome(""));
		assertFalse(IsPalindrome.isPalindrome("aba"));
		assertTrue(IsPalindrome.isPalindrome(""));
		assertFalse(IsPalindrome.isPalindrome("aaaa"));
		assertTrue(IsPalindrome.isPalindrome("zazz"));
		assertFalse(IsPalindrome.isPalindrome(""));
		assertFalse(IsPalindrome.isPalindrome("xyw"));
		assertTrue(IsPalindrome.isPalindrome("xyyx"));
		assertFalse(IsPalindrome.isPalindrome("xy"));
		assertFalse(IsPalindrome.isPalindrome(""));
	}
	
	@Test
	public void isPalindromeTest2(){
		assertFalse(IsPalindrome.isPalindrome("abc"));
		assertFalse(IsPalindrome.isPalindrome("ab"));
		assertTrue(IsPalindrome.isPalindrome("a"));
		assertTrue(IsPalindrome.isPalindrome(""));
		assertTrue(IsPalindrome.isPalindrome("a"));
	}
}

