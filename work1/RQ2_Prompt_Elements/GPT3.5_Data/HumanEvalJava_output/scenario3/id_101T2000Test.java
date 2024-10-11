// WordsString.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class WordsString {

    /**
     * * You will be given a string of words separated by commas or spaces. Your task is
     * to split the string into words and return an array of the words.
     *
     * For example:
     * wordsString("Hi, my name is John") == ["Hi", "my", "name", "is", "John"]
     * wordsString("One, two, three, four, five, six") == ["One", "two", "three", "four", "five", "six"]
     *
     * > wordsString("Hi, my name is John")
     * ["Hi", "my", "name", "is", "John"]
     * > wordsString("One, two, three, four, five, six")
     * ["One", "two", "three", "four", "five", "six"]
     * > wordsString("Hi, my name")
     * ["Hi", "my", "name"]
     * > wordsString("One,, two, three, four, five, six,")
     * ["One", "two", "three", "four", "five", "six"]
     * > wordsString("")
     * []
     * > wordsString("ahmed     , gamal")
     * ["ahmed", "gamal"]
     */
    public static List<String> wordsString(String s) {
        if (s == null || s.isEmpty()) {
            return Arrays.asList();
        }
        return Arrays.stream(s.split("[,\\s]+"))
                .filter(word -> !word.isEmpty())
                .collect(Collectors.toList());
    }
}

// WordsStringTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains ten unit test cases for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {

    @Test
    void testWordsStringWithCommas() {
        String input = "Hi, my name is John";
        List<String> expectedOutput = Arrays.asList("Hi", "my", "name", "is", "John");
        assertEquals(expectedOutput, WordsString.wordsString(input));
    }

    @Test
    void testWordsStringWithCommasAndSpaces() {
        String input = "One, two, three, four, five, six";
        List<String> expectedOutput = Arrays.asList("One", "two", "three", "four", "five", "six");
        assertEquals(expectedOutput, WordsString.wordsString(input));
    }

    @Test
    void testWordsStringWithIncompleteSentence() {
        String input = "Hi, my name";
        List<String> expectedOutput = Arrays.asList("Hi", "my", "name");
        assertEquals(expectedOutput, WordsString.wordsString(input));
    }

    @Test
    void testWordsStringWithExtraCommas() {
        String input = "One,, two, three, four, five, six,";
        List<String> expectedOutput = Arrays.asList("One", "two", "three", "four", "five", "six");
        assertEquals(expectedOutput, WordsString.wordsString(input));
    }

    @Test
    void testWordsStringWithEmptyString() {
        String input = "";
        List<String> expectedOutput = Arrays.asList();
        assertEquals(expectedOutput, WordsString.wordsString(input));
    }

    @Test
    void testWordsStringWithExtraSpaces() {
        String input = "ahmed     , gamal";
        List<String> expectedOutput = Arrays.asList("ahmed", "gamal");
        assertEquals(expectedOutput, WordsString.wordsString(input));
    }

    @Test
    void testWordsStringWithNullInput() {
        String input = null;
        List<String> expectedOutput = Arrays.asList();
        assertEquals(expectedOutput, WordsString.wordsString(input));
    }

    @Test
    void testWordsStringWithSingleWord() {
        String input = "Hello";
        List<String> expectedOutput = Arrays.asList("Hello");
        assertEquals(expectedOutput, WordsString.wordsString(input));
    }

    @Test
    void testWordsStringWithMultipleSpaces() {
        String input = "   Hello    World   ";
        List<String> expectedOutput = Arrays.asList("Hello", "World");
        assertEquals(expectedOutput, WordsString.wordsString(input));
    }

    @Test
    void testWordsStringWithMultipleCommas() {
        String input = ",,Hello,,World,,";
        List<String> expectedOutput = Arrays.asList("Hello", "World");
        assertEquals(expectedOutput, WordsString.wordsString(input));
    }
}