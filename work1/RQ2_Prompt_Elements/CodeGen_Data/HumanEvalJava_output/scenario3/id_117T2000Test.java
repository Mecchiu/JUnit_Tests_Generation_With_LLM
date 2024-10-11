// SelectWordsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SelectWords}.
* It contains one unit test case for the {@link SelectWords#selectWords(String, int)} method.
*/
class SelectWordsTest {
/**
    * Given a string s and a natural number n, your task is to implement
    * a function that returns a list of all words from string s that contain exactly
    * n consonants, in order these words appear in the string s.
    * When we use the function {@link SelectWords#selectWords(String, int)},
    * we now know that s contains only letters and spaces.
    */
    @Test
    public void isSelectWords() {
    	List<String> list = new SelectWords().selectWords("hello hasn'ta", 4);
    	assertTrue(list.size() == 2);
    	list = new SelectWords().selectWords("hello hasn'ta", 2);
    	assertTrue(list.size() == 2);
    }
}
