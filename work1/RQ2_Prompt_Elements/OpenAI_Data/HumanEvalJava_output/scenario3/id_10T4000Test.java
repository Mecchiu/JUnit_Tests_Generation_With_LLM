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
	void testMakePalindrome_emptyString() {
		assertEquals("", MakePalindrome.makePalindrome(""));
	}
	
	@Test
	void testMakePalindrome_singleCharacter() {
		assertEquals("x", MakePalindrome.makePalindrome("x"));
	}
	
	@Test
	void testMakePalindrome_twoCharacters() {
		assertEquals("xyx", MakePalindrome.makePalindrome("xy"));
	}
	
	@Test
	void testMakePalindrome_threeCharacters() {
		assertEquals("xyzyx", MakePalindrome.makePalindrome("xyz"));
	}
	
	@Test
	void testMakePalindrome_fourCharacters() {
		assertEquals("xyx", MakePalindrome.makePalindrome("xyx"));
	}
	
	@Test
	void testMakePalindrome_fiveCharacters() {
		assertEquals("catac", MakePalindrome.makePalindrome("cata"));
	}
	
	@Test
	void testMakePalindrome_sixCharacters() {
		assertEquals("catac", MakePalindrome.makePalindrome("cat"));
	}
	
	@Test
	void testMakePalindrome_sevenCharacters() {
		assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerry"));
	}
	
	@Test
	void testMakePalindrome_eightCharacters() {
		assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerryr"));
	}
	
	@Test
	void testMakePalindrome_nineCharacters() {
		assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerryrr"));
	}
}