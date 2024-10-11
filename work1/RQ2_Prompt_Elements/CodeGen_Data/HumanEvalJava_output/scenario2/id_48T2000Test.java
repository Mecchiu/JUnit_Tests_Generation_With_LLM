// IsPalindromeTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPalindrome}.
* It contains one unit test case for the {@link IsPalindrome#isPalindrome(String)} method.
*/
class IsPalindromeTest {
// IsPalindrome.java
package scenario2;

class IsPalindrome {

    /**
     * * Checks if given string is a palindrome
     */
    public static Boolean isPalindrome(String text) {
        int i = 0;
        int j = text.length() - 1;
        while (i < j) {
            if (text.charAt(i)!= text.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

// IsPalindromeTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPalindrome}.
* It contains one unit test case for the {@link IsPalindrome#isPalindrome(String)} method.
*/
class IsPalindromeTest {
		
	@Test
	  public void isPalindrome() {
		  assertEquals(true, IsPalindrome.isPalindrome("ab"));
		  assertEquals(true, IsPalindrome.isPalindrome("abcd"));
		  assertEquals(true, IsPalindrome.isPalindrome("abcdef"));
		  assertEquals(true, IsPalindrome.isPalindrome("abcdefg"));
		  assertEquals(true, IsPalindrome.isPalindrome("abcdefgh"));
		  assertEquals(true, IsPalindrome.isPalindrome("abcdefghijklmnop"));
		  assertEquals(true, IsPalindrome.isPalindrome("abcdefghijklmnopqrst"));
		  assertEquals(true, IsPalindrome.isPalindrome("abcdefghijklmnopqrstuv"));
		  assertEquals(true, IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvw"));
		  assertEquals(true, IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwz"));
	  }
}
