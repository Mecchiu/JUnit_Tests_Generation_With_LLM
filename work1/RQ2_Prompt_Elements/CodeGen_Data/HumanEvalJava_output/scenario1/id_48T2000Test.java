// IsPalindromeTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPalindrome}.
* It contains one unit test case for the {@link IsPalindrome#isPalindrome(String)} method.
*/
class IsPalindromeTest {
// IsPalindrome.java
package scenario1;

class IsPalindrome {

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
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPalindrome}.
* It contains one unit test case for the {@link IsPalindrome#isPalindrome(String)} method.
*/
class IsPalindromeTest {
		
    /**
     * クラスオブジェクト.
     */
	private String string = "string";
    
    /**
     * {@link IsPalindromeTest}でのメソッド.
     */
	@Test
	public void test() {
		// レコードが空または空白語の配列が正常系の場合
		assertFalse(isPalindrome(string));
		
		// 各エンディアンとの格納結果は、それらに空か、符
        string = "ab";
        assertTrue(isPalindrome(string));
                
        string = "ab";
        assertFalse(isPalindrome(string));
        
        string = "a";
        assertFalse(isPalindrome(string));
        
        string = "ab";
        assertFalse(isPalindrome(string));

		// シンボルでの年が2つの固定数のリストの中かどうか
        string = "aba";
        assertFalse(isPalindrome(string));
        
        string = "abababa";
        assertFalse(isPalindrome(string));
        
        string = "aab";
        assertTrue(isPalindrome(string));
		
		// 正常系の場合
        string = "ababaabababa";
        assertTrue(isPalindrome(string));
        
        string = "aabaababaabaababaababaabaabababaabab";
        assertTrue(isPalindrome(string));
        
        string = "abababaabababaabababaababaababaababababaab";
        assertFalse(isPalindrome(string));
	}
}