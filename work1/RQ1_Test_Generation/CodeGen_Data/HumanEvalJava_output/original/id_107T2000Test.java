// EvenOddPalindromeTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddPalindrome}.
* It contains one unit test case for the {@link EvenOddPalindrome#evenOddPalindrome(int)} method.
*/
class EvenOddPalindromeTest {
/**
		 * * Given an array of integer n, return the number of even and odd integer palindromes
		 * that fall within the range(1, n), inclusive.
		*
		* Example 1:
		* 
		* Input: [1,2,18,5,45,7,48,32]
		* Output: (18, 5)
		* Explanation:
		* Integer palindrome are 2, 4, 1, 4, 3, 8, 7, 22, 43. Even palindrome are 1, 2, 3,
		* 4, 5, 6, 7, 10, 17, 18, 23, 45 and 43.
		* 
		* Example 2:
		* [5, 8, 22, 38, 47, 7, 50, 7]
		* Output: (38, 47)
		* Explanation:
		* Integer palindrome are 5, 8, 22, 38, 47, 7, 50, 7. Even palindrome is 4, 5, 7.
		*
		*/
		@Test
		void evenOddPalindromeTest() {
			assertEquals(12, new EvenOddPalindrome(17).size());
			assertEquals(12, new EvenOddPalindrome(21).size());
			assertEquals(12, new EvenOddPalindrome(18).size());
			assertEquals(12, new EvenOddPalindrome(10).size());
		}

	}
