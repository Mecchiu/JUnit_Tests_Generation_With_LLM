// RemoveVowelsTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains one unit test case for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {
// RemoveVowels.java
package scenario1;

class RemoveVowels {

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
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains one unit test case for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {
		/**
		 * Empty test case
		 */
		@Test
		void empty() {
			String result = RemoveVowels.removeVowels("");
		}
	}
}