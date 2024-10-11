// RemoveVowelsTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains one unit test case for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {
// RemoveVowels.java
package scenario2;

class RemoveVowels {

    /**
     * * remove_vowels is a function that takes string and returns string without vowels.
     */
    public static String removeVowels(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c!= 'a' && c!= 'e' && c!= 'i' && c!= 'o' && c!= 'u' && c!= 'A' && c!= 'E' && c!= 'I' && c!= 'O' && c!= 'U') {
                result += c;
            }
        }
        return result;
    }
}

// RemoveVowelsTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains one unit test case for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {
		
	/**
	 * test_remove_vowels is a function that takes string and checks if it
	 * correctly removes characters from the sequence.
	 */
	@Test
	void test_RemoveVowels() {
	  String testString = "aAAaAaAdAaIiAaAi";
	  String result = new RemoveVowels().removeVowels(testString);
	  assertEquals("", testString, result);
	}
}

