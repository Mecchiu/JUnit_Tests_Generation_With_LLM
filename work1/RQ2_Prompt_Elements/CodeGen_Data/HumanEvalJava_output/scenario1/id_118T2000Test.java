// GetClosestVowelTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains one unit test case for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {
// GetClosestVowel.java
package scenario1;

class GetClosestVowel {

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
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains one unit test case for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {
		
    int _closeness;

    @Test
    void test() {
        _closeness = 1;

        //test
        String s1 = "w";
        s1 = "qw";
        String word = GetClosestVowel.getClosestVowel(s1);
		assertTrue("Wrong word returned: " + word, word.equals("w"));
        
		_closeness = -1;
        s1 = "Qw";
        word = GetClosestVowel.getClosestVowel(s1);
		assertTrue("Wrong word returned: " + word, word.equals("Qw"));
    }

}
