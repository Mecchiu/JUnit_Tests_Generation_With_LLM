// GetClosestVowelTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains one unit test case for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {
// GetClosestVowel.java
package scenario2;

class GetClosestVowel {

    /**
     * You are given a word. Your task is to find the closest vowel that stands between
     * two consonants from the right side of the word (case sensitive).
     *
     * Vowels in the beginning and ending doesn't count. Return empty string if you didn't
     * find any vowel met the above condition.
     *
     * You may assume that the given string contains English letter only.
     */
    public static String getClosestVowel(String word) {
        String vowels = "aeiouAEIOU";
        int i = word.length() - 2;
        while (i > 0) {
            if (vowels.indexOf(word.charAt(i))!= -1) {
                if (vowels.indexOf(word.charAt(i + 1)) == -1 && vowels.indexOf(word.charAt(i - 1)) == -1) {
                    return word.substring(i, i + 1);
                }
            }
            i--;
        }
        return "";
    }
}

// GetClosestVowelTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains one unit test case for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {
		
	/**
	* Contains tests for the {@link GetClosestVowel#getClosestVowel(String)} method using {@link String#toLowerCase()}.
	*/
	@Test
	@SuppressWarnings("unused")
	public void test0() {
		
		assertEquals("", GetClosestVowel.getClosestVowel(""));
	}
	
	/**
	* Contains tests for the {@link GetClosestVowel#getClosestVowel(String)} method using {@link String#toUpperCase()}.
	*/
	@Test
	@SuppressWarnings("unused")
	public void test1() {
		
		assertEquals("", GetClosestVowel.getClosestVowel(""));
	}
	
	/**
	* Contains tests for the {@link GetClosestVowel#getClosestVowel(String)} method using {@link String#toUpperCase(Locale)}.
	*/
	@Test
	@SuppressWarnings("unused")
	public void test2() {
		
		assertEquals("", GetClosestVowel.getClosestVowel(""));
	}
	
}