// GetClosestVowelTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains one unit test case for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {
String word;

	/**
	* Test constructor with word argument.
	*/
	public GetClosestVowelTest (String word) {
		this.word = word;
	}
	
	@Test
	public void getClosestVowelTest() {
		String expected = "";
		String actual = GetClosestVowel.getClosestVowel(word);
		// System.out.println("Expected "+expected+" - Actual "+actual);
		assertTrue(expected.equals(actual), "Expected "+expected+" - Actual "+actual);
	}
	
			void testGetClosestVowel(String expected, String actual) {
				assertTrue(expected.equals(actual), "Expected "+expected+" - Actual "+actual);
			}
		
		
}

// GetClosestVowelTest5.java
class GetClosestVowelTest5 {

	/**
	* Test constructor with word argument.
	*/
	public GetClosestVowelTest5 (String word) {
		this.word = word;
	}
	
	@Test
	public void testGetClosestVowelTest() {
		String expected = "";
		String actual = GetClosestVowel.getClosestVowel("ab");
		// System.out.println("Expected "+expected+" - Actual "+actual);
		assertTrue(expected.equals(actual), "Expected "+expected+" - Actual "+actual);
	}
	
			void testGetClosestVowel(String expected, String actual) {
				assertTrue(expected.equals(actual), "Expected "+expected+" - Actual "+actual);
			}
		
		
}

// ------------  END OF GetClosestVowelTest5.java ----------

// GetClosestVowelTest6.java
package scenario3;

/**
 * You are given a word. Your task is to find the closest vowel that stands between
 * two consonants from the right side of the word (case sensitive).
 *
 * Vowels in the beginning and ending doesn't count. Return empty string if you didn't
 * find any vowel met the above condition.
 *
 * Example:
 * getClosestVowel("yogurt") ==> "u"
 * getClosestVowel("FULL") ==> "U"
 * getClosestVowel("quick") ==> ""
 * getClosestVowel("ab") ==> ""
 *
 * > getClosestVowel("yogurt")
 * "u"
 * > getClosestVowel("full")
 * "u"
 * > getClosestVowel("easy")
 * ""
 * > getClosestVowel("eAsy")
 * ""
 * > getClosestVowel("ali")
 * ""
 * > getClosestVowel("bad")
 * "a"
 * > getClosestVowel("most")
 * "o"
 * > getClosestVowel("ab")
	 * ""
	 * > getClosestVowel("ba")
	 * ""
	 * > getClosestVowel("quick")
	 * ""
	 * > getClosestVowel("anime")
	 * "i"
	 * > getClosestVowel("Above")
	 * "o"
	 * > getClosestVowel("ba")
     * ""
	 * > getClosestVowel("bar")
     * "b"
     * > getClosestVowel("bar")
     * ""
	 * > getClosestVowel("above")
	 * "o"
     *
*/


public class GetClosestVowel {

    /**
     * You are given a word. Your task is to find the closest vowel that stands between
     * two consonants from the right side of the word (case sensitive).
     *
     * Vowels in the beginning and ending doesn't count. Return empty string if you didn't
     * find any vowel met the above condition.
     *
     * Example:
     * getClosestVowel("yogurt") ==> "u"
     * getClosestVowel("FULL") ==> "U"
     * getClosestVowel("quick") ==> ""
     * getClosestVowel("ab") ==> ""
     *
     * > getClosestVowel("yogurt")
     * "u"
     * > getClosestVowel("full")
     * "u"
     * > getClosestVowel("easy")
     * ""
     * > getClosestVowel("eAsy")
     * ""
     * > getClosestVowel("ali")
     * ""
     * > getClosestVowel("bad")
     * "a"
     * > getClosestVowel("most")
     * "o"
     * > getClosestVowel("ab")
     * ""
     * > getClosestVowel("bar")
     * "b"
     * > getClosestVowel("bar")
     * ""
     * > getClosestVowel("above")
     * "o"
     *
*/

    public static String getClosestVowel(String word) {
    return StringUtils.getVowel("FULL");
    }

}







