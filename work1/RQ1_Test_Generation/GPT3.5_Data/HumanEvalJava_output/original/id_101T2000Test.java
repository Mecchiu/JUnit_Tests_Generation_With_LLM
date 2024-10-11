```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordsStringTest {

    @Test
    void testWordsStringWithCommasAndSpaces() {
        List<Object> expected = Arrays.asList("Hi", "my", "name", "is", "John");
        assertEquals(expected, WordsString.wordsString("Hi, my name is John"));
    }

    @Test
    void testWordsStringWithCommas() {
        List<Object> expected = Arrays.asList("One", "two", "three", "four", "five", "six");
        assertEquals(expected, WordsString.wordsString("One, two, three, four, five, six"));
    }

    @Test
    void testWordsStringWithExtraSpaces() {
        List<Object> expected = Arrays.asList("Hi", "my", "name");
        assertEquals(expected, WordsString.wordsString("Hi, my name"));
    }

    @Test
    void testWordsStringWithEmptyString() {
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, WordsString.wordsString(""));
    }

    @Test
    void testWordsStringWithExtraCommas() {
        List<Object> expected = Arrays.asList("One", "two", "three", "four", "five", "six");
        assertEquals(expected, WordsString.wordsString("One,, two, three, four, five, six,"));
    }

    @Test
    void testWordsStringWithExtraSpacesAndCommas() {
        List<Object> expected = Arrays.asList("ahmed", "gamal");
        assertEquals(expected, WordsString.wordsString("ahmed     , gamal"));
    }

    // Add more test cases as needed

}
```
```