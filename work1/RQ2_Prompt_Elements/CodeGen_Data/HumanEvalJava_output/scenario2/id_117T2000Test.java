// SelectWordsTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SelectWords}.
* It contains one unit test case for the {@link SelectWords#selectWords(String, int)} method.
*/
class SelectWordsTest {
// SelectWords.java
package scenario2;

import java.util.ArrayList;
import java.util.List;

class SelectWords {

    /**
     * Given a string s and a natural number n, you have been tasked to implement
     * a function that returns a list of all words from string s that contain exactly
     * n consonants, in order these words appear in the string s.
     * If the string s is empty then the function should return an empty list.
     * Note: you may assume the input string contains only letters and spaces.
     */
    public static List<Object> selectWords(String s, int n) {
        List<Object> result = new ArrayList<>();
        String[] words = s.split(" ");
        for (String word : words) {
            int consonants = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c!= 'a' && c!= 'e' && c!= 'i' && c!= 'o' && c!= 'u' && c!= 'A' && c!= 'E' && c!= 'I' && c!= 'O' && c!= 'U') {
                    consonants++;
                }
            }
            if (consonants == n) {
                result.add(word);
            }
        }
        return result;
    }
}

// SelectWordsTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SelectWords}.
* It contains one unit test case for the {@link SelectWords#selectWords(String, int)} method.
*/
class SelectWordsTest {
		
	/**
	 * Unit test cases for the {@link List#contains(Object)}
	 * @throws  TestException
	 */
	@Test
	public void testListContains_noContain() throws TestException {
		assertFalse("List should be empty after addition of word", this.selectWords("Hello World", 6).contains("Hell"));
	}

	/**
	 * Unit test cases for the {@link List#containsAll(List)}
	 * @throws  TestException
	 */
	@Test
	public void testListContainsAll_twoContains() throws TestException {
		List<String> first = new ArrayList<>(1);
		first.add("One");
		List<String> second = new ArrayList<>(1);
		second.add("Two");
		assertTrue("ContainsAll should be true when first is a set of all words contained in 2",
				this.selectWords("One", 2).containsAll(first));
		assertFalse("ContainsAll should be false when second is a set of all words contained in 2",
				this.selectWords("One", 2).containsAll(second));
	}

}
